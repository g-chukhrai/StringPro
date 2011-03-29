grammar strgram;

options {
  output = template;
}

scope slist {
List locals;
List stats;
}

@header {
package stringpack;
  import org.antlr.stringtemplate.*;
}

@lexer::header {
package stringpack;
}

@members {
protected NamesTable names = new NamesTable();
protected MethodTable methods = new MethodTable();
protected ArrayList<String> errors = new ArrayList<String>();

public String getErrorHeader(RecognitionException e) {
	return "line " + e.line + ":";
}

public void emitErrorMessage(String msg) {
	errors.add(msg);
}
private int reg = 1;
public int getreg() { return reg++; }
public int getLastReg(){return reg-1;}
    List<StringTemplate> strings = new ArrayList<StringTemplate>();
    public int getstr(String s) {
      strings.add(new StringTemplate(s));
      return strings.size();
    }
}
 
program
scope {
String name;
List globals;
List functions;
}
@init {
  $program::globals = new ArrayList();
  $program::functions = new ArrayList();
  $program::name = "[global]";
}
  :
  (
    fun_decl 
      {
       $program::functions.add($fun_decl.st);
      }
    | 
      {
       $program::name = "[global]";
      }
    var 
      {
       $program::globals.add($var.st);
      }
  )+
    ->program(globals={$program::globals}, functions={$program::functions})
  ;

type returns [String idType]
  :
    'Int'     {$idType = "Int";}      ->type_int()
  | 'String'  {$idType = "String";}   ->type_string()
  | 'Char'    {$idType = "Char";}     ->type_char()
  ;

id_init
  :
  a=ID (EQUAL b=expr)? 
    {
     if ($a.text != null) {
             if (names.isExist($program::name + "." + $a.text)) {
                 errors.add("line "+$a.line+": name "+$a.text+" duplicated");
             } else {
     	          names.add(names.new Name($program::name + "." + $a.text, $var::varType, $a.line));
                names.get($program::name + "." + $a.text).addLineUses($a.line);
                if (!$var::varType.equals($expr.idType)) {
                     errors.add("line "+$a.line+": name "+$a.text +" wrong type conversion cannot convert " + $expr.idType + " to " + $var::varType);
                }     	          
     			    }
             }
    }
      -> {$b.idType!=null}?
         def_assign(type={$var::varType}, id={$a.text}, rhs={$expr.st})
      -> def_var(id={$a.text}, type={$var::varType})
  ;



id_assign
  :
  a=ID EQUAL b=expr 
    {
                 if (names.isExist($program::name + "." + $a.text)) {
                   names.get($program::name + "." + $a.text).addLineUses($a.line);
                   String varType = names.get($program::name + "." + $a.text).getType();
                   if (!varType.equals($b.idType)) {
                    errors.add("line "+$a.line+": name "+$a.text+" wrong type conversion cannot convert " + $b.idType + " to " + varType);
                   }
                 }else {
                    errors.add("line "+$a.line+": name "+$a.text+" cann't be resolved");
               
                 }
    }
  ->assign(id={$a.text}, rhs={$expr.st})
  ;
var
scope {
String varType;
}
@init {
$var::varType = "";
}
  :
  type {$var::varType = $type.idType;}  b+=id_init (COMMA b+=id_init)* EOL
      -> {$program::name.equals("[global]")}?
        globalVars(vars={$b})
      -> vars(vars={$b})
  
  ;

listParams
: 
  PAR_OPEN (a+=expr (COMMA a+=expr)*)? PAR_CLOSE
  -> iconst(value={$a})
;

expr returns [String idType]
  :
  a=math_exp (MATHOPER b=math_exp)?
  {
      $idType = $a.idType;
  }
      -> {$b.st!=null}?
         bop(reg={getreg()}, op={$MATHOPER.text}, a={$a.st}, b={$b.st})
      -> {$a.st}
  ;

math_exp returns [String idType]
  :
  data_id 
  {
    $idType = $data_id.idType;
  }                
  ->{$data_id.st}
  | 
  PAR_OPEN expr PAR_CLOSE 
  {
    $idType = $expr.idType;
  } 
  ->{$expr.st}
  | 
  fun_call
  {
    $idType = $fun_call.idType;
  }   
  ->{$fun_call.st}
  ;

data returns [String idType]
  :
    INT     {$idType = "Int";}        ->int(reg={getreg()},v={$INT.text})
  | STRING  {$idType = "String";}     ->string(reg={getreg()}, s={new StringTemplate($STRING.text)},sreg={getstr($STRING.text)})
  | CHAR    {$idType = "Char";}       ->{new StringTemplate($CHAR.text)}
  ;

data_id returns [String idType]
  :
  ID 
  {
     if (! names.isExist($program::name + "." + $ID.text)) {
           errors.add("line "+$ID.line+": name "+$ID.text+" cannot be resolved");
     } else {
           names.get($program::name + "." + $ID.text).addLineUses($ID.line);   
           $idType = names.get($program::name + "." + $ID.text).getType();
     }
  }
  ->load_var(reg = {getreg()}, id={$ID.text})
  | 
  data 
  {$idType = $data.idType;}  
  ->{$data.st}
  ;

if_op
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  'if' bool_cond fun_body else_block?
  -> if_op(cond={$bool_cond.st}, stat1={$fun_body.st}, stat2={$else_block.st}, tmp={getreg()})
  ;

else_block
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  'else' fun_body
    ->{$fun_body.st}
  ;

for_op
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  'for' PAR_OPEN
  (
    INT
    ->for_op (count={$INT.text}, locals={$slist::locals}, stats={$slist::stats})
    | (type a=ID 'in' b=ID)
  )
  
    {
     if (names.isExist($program::name + "." + $a.text)) {
           errors.add("line "+$a.line+": name "+$a.text+" dublicated");
         } else {
           names.add(names.new Name($program::name + "." + $a.text, $type.idType, $a.line));
         }
         if (! names.isExist($program::name + "." + $b.text)) {
           errors.add("line "+$b.line+": name "+$b.text+" cannot be resolved");
         } else {
           names.get($program::name + "." + $b.text).addLineUses($b.line);   
         }
    }
  PAR_CLOSE fun_body
  ->for_list_op (type={$type.idType}, id={$a.text}, listId={$b.text}, 
            locals={$slist::locals}, stats={$slist::stats})
  ;

while_op
scope slist;
@init {
$slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  'while' bool_cond fun_body
    ->while_op(bool_cond={$bool_cond.st}, locals={$slist::locals}, stats={$slist::stats})
  ;

bool_cond
  :
  PAR_OPEN a=data_id (COMPROPER b=data_id)* PAR_CLOSE
  ->bop(reg={getreg()}, op={$COMPROPER.text}, a={$a.st}, b={$b.st})
  ;

brack_id
  :
  PAR_OPEN ID PAR_CLOSE
  ;

in_out_op returns [String idType]
  :
  ('out' op_cond) 
    {
     $idType = null;
    }
  ->outOp(params={$op_cond.st})
  | ('read' PAR_OPEN PAR_CLOSE) 
    {
     $idType = "String";
    }
    ->readOp()
  ;

fun_call returns [String idType]
  :
  a=ID PAR_OPEN (b+=expr (COMMA b+=expr)*)? PAR_CLOSE
    {
     if (!methods.isExist($a.text)) {
     	errors.add("line " + $a.line + ": methon name " + $a.text	+ " cannot be resolved");
     } else {
     	$idType = methods.get($a.text).getReturnType();
     	methods.get($a.text).addLineUses($a.line);
     }
    }  
  -> funCall(reg={getreg()},funName={$a.text},funArgs={$b},ret={$idType})
  | 
  in_out_op 
    {
     $idType = $in_out_op.idType;
    }
  -> {$in_out_op.st}

  ;

op_cond
  :
  PAR_OPEN (a+=expr (COMMA a+=expr)*)? PAR_CLOSE
  -> args(args={$a})
  ;

ops
  :
  id_assign EOL
    ->statement(expr={$id_assign.st})
  | if_op
    ->{$if_op.st}
  | while_op
    ->{$while_op.st}
  | for_op
    ->{$for_op.st}
  | fun_call EOL
    ->statement(expr={$fun_call.st})
  ;

main_fun
  :
  MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
  ;

fun_decl
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  type? a=ID 
    {
     $program::name = $ID.text; 
     methods.add(methods.new Method($program::name, $type.idType));
    }
  PAR_OPEN (p+=parameter_declaration (COMMA p+=parameter_declaration)*)? PAR_CLOSE fun_body 
    {
     if ($type.idType != null) {
     	if ($fun_body.idType == null) {
     		errors.add("line " + $a.line + ": method " + $a.text + " missing return statement, expecting " + $type.idType);
     	} else if (!$type.idType.equals($fun_body.idType)) {
     		errors.add("line " + $a.line + ": method " + $a.text + " wrong type conversion cannot convert return type " + $fun_body.idType + " to " + $type.idType);
     	}
     }
    }
   -> fun_decl(type={$type.st}, name={$ID.text}, locals={$slist::locals}, stats={$slist::stats}, args={$p})
   |  MAIN_NAME PAR_OPEN PAR_CLOSE fun_body 
   -> main_decl(locals={$slist::locals}, stats={$slist::stats})
  ;

parameter_declaration 
  :
  type a=ID
  {
       if (names.isExist($program::name + "." + $a.text)) {
          errors.add("line "+$a.line+": name "+$a.text+" duplicated");
       } else {
          names.add(names.new Name($program::name + "." + $a.text, $type.idType, $a.line));
       }
  }
  -> def_arg(id={$ID.text}, type={$type.st})
  ;

fun_body returns [String idType]
  :
  CUR_OPEN (var | ops )* return_st? CUR_CLOSE
  {
    $slist::locals.add($var.st);
    $slist::stats.add($ops.st);
    $slist::stats.add($return_st.st);
    if ($return_st.idType != null) {
      $idType = $return_st.idType;
    } 
  }
  ->block(locals={$slist::locals}, stats={$slist::stats})
  ;
  
return_st returns [String idType]
: 
	'return' expr EOL
	{
	   $idType = $expr.idType;
	}
	->return_st(ret_val={$expr.st}) 
;

MAIN_NAME   :  'Main'  ;
LIST        :  'List'  ;
COMMA       :  ','  ;
EQUAL       :  '='  ;
EOL         :  ';'  ;
PAR_OPEN    :  '('  ;
PAR_CLOSE   :  ')'  ;
CUR_OPEN    :  '{'  ;
CUR_CLOSE   :  '}'  ;
SQ_OPEN     :  '['  ;
SQ_CLOSE    :  ']'  ;
INT         :  DIGIT+  ;
ID          : (ALPHA|DIGIT)+ ;

fragment
ALPHA
  :
  (
    'a'..'z'
    | 'A'..'Z'
  )
  ;

fragment
DIGIT
  :
  '0'..'9'
  ;

WS  :   (' ' | '\t' | '\r' | '\n')+ {$channel=HIDDEN;}
    ;    

MATHOPER
  :
  '-'
  | '+'
  | '*'
  | '/'
  ;

COMPROPER
  :
    '>'
  | '<'
  | '=='
  | '>='
  | '<='
  ;

STRING
  :
  '"' .* '"'
  ;

CHAR
  :
  '\'' ALPHA? '\''
  ;

COMMENT
  :
  '/*' (options {greedy=false;}: .)* '*/' 
    {
     $channel = HIDDEN;
    }
  | '//'
  ~(
    '\n'
    | '\r'
   )*
  '\r'? '\n' 
    {
     $channel = HIDDEN;
    }
  ;
