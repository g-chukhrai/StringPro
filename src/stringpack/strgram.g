grammar strgram;

options {
  output = template;
}

scope slist {
List locals;
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
    public int getStringLength(final String s){ 
      return s.length() - 1;
    }
    public String getString(String s){
        s = s.substring(1,s.length()-1);
        s = s.replaceAll("\\\\n", " \\\\0A");
        s = s.replaceAll("\\\\r", " \\\\0D");
        return  "\"" + s  + "\\00\"";
    }
    public Integer getCode(String s) {
        return s.codePointAt(1);
    }
}
 
program 
scope {
String name;
List globals;
List functions;
List strings;
HashMap<String,Integer> stringsLengths;
}
@init {
  $program::globals = new ArrayList();
  $program::functions = new ArrayList();
  $program::strings = new ArrayList();
  $program::stringsLengths = new HashMap<String,Integer>();
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
    ->program(globals={$program::globals}, functions={$program::functions}, strings={$program::strings})
  ;

type returns [String idType]
  :
    'Int'     {$idType = "Int";}      ->type_int()
  | 'String'  {$idType = "String";}   ->type_string()
  | 'Char'    {$idType = "Char";}     ->type_char()
  ;

id_init 
scope {
String name;
}
  :
  a=ID {$id_init::name = $a.text;} (EQUAL b=expr)?
    {
     if ($a.text != null) {
             if (names.isExist($program::name + "." + $a.text)) {
                 errors.add("line "+$a.line+": name "+$a.text+" duplicated");
             } else {
     	          names.add(names.new Name($program::name + "." + $a.text, $var::varType, $a.line));
                names.get($program::name + "." + $a.text).addLineUses($a.line);
                if (b != null && !$var::varType.equals($expr.idType)) {
                     errors.add("line "+$a.line+": name "+$a.text +" wrong type conversion cannot convert " + $expr.idType + " to " + $var::varType);
                }     	          
     			    }
             }
    }
      -> {$b.idType!=null && !"[global]".equals($program::name)}?
         def_assign(type={$var::varType}, id={$a.text}, rhs={$expr.st})
      -> {$program::name.equals("[global]") && "Int".equals($var::varType)}?
         def_glob(id={$a.text},type={$var::varType}, rhs={$expr.st})
      -> {!$var::varType.equals("String")}?
         def_var(id={$a.text}, type={$var::varType})
      -> {!$program::name.equals("[global]")}? 
         def_str(id={$a.text}, type={$var::varType}, reg={getreg()})
      -> zero()
         
  ;



id_assign returns [String idType]
  :
  a=ID('['c=expr']')? EQUAL b=expr 
    {
                 if (names.isExist($program::name + "." + $a.text)) {
                   names.get($program::name + "." + $a.text).addLineUses($a.line);
                   $idType = names.get($program::name + "." + $a.text).getType();
                   if ((c != null && !"Char".equals($b.idType)) || (c==null && !$idType.equals($b.idType))) {
                    errors.add("line "+$a.line+": name "+$a.text+" wrong type conversion cannot convert " + $b.idType + " to " + $idType);
                   }
                 }else {
                    errors.add("line "+$a.line+": name "+$a.text+" cann't be resolved");
               
                 }
    }
  ->{$c.idType!=null}?
    array_assign(id={$a.text}, rhs={$b.st},format={$c.st},reg={getreg()})
  ->assign(id={$a.text}, rhs={$b.st},type={$idType})
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
  |
  a=data_id c='['b=expr']'
    {
           if (!"String".equals($a.idType)) {
              errors.add("line " + $c.line + ": get array element operation error " + $a.text + " type must be String, not " + $a.idType);
           }
           $idType = "Char";
    }
  ->get_elem(format={$a.st},reg={getreg()},format2={$b.st}, type={$idType})
  ;

data returns [String idType]
  :
    INT     
    {$idType = "Int";}        
    ->int(reg={getreg()},v={$INT.text},type={$idType})
  | 
	  str
	  {
	    $idType = "String";
	    $program::strings.add($str.st);
	  }     
	  ->{$str.st}
  | 
    CHAR    
    {$idType = "Char";}
    ->char(reg={getreg()},v={getCode($CHAR.text)},type={$idType})
  ;
  
str  
: STRING 
{
  String name;
  if ("[global]".equals($program::name)){
    name = $id_init::name; 
  } else {
    name = ".str" + String.valueOf(getreg());
  }
  $program::stringsLengths.put(name,getStringLength($STRING.text));
}
  ->string(reg={getreg()}, v={getString($STRING.text)},sreg={getstr($STRING.text)},len={getStringLength($STRING.text)}, type={"String"}, name={name})

;

data_id returns [String idType]
  :
  ID 
  {
  String scope = null;
     if (! names.isExist($program::name + "." + $ID.text)) {
           errors.add("line "+$ID.line+": name "+$ID.text+" cannot be resolved");
     } else {
           names.get($program::name + "." + $ID.text).addLineUses($ID.line);   
           $idType = names.get($program::name + "." + $ID.text).getType();
           scope = names.getScope($program::name + "." + $ID.text);
     }
  }
  ->{"global".equals(scope) && "String".equals($idType)}?
    load_global_str(reg = {getreg()}, id={$ID.text}, type = {$idType}, len={$program::stringsLengths.get($ID.text)}, name={$ID.text})
  ->{"global".equals(scope)}?
    load_global_var(reg = {getreg()}, id={$ID.text}, type = {$idType})
  ->load_var(reg = {getreg()}, id={$ID.text}, type = {$idType})
  | 
  data 
  {$idType = $data.idType;}  
  ->{$data.st}
  ;

if_op
scope slist;
@init {
  $slist::locals = new ArrayList();
}
  :
  'if' bool_cond fun_body else_block?
  -> if_op(cond={$bool_cond.st}, stat1={$fun_body.st}, stat2={$else_block.st}, tmp={getreg()})
  ;

else_block
scope slist;
@init {
  $slist::locals = new ArrayList();
}
  :
  'else' fun_body
    ->{$fun_body.st}
  ;

for_op
scope slist;
@init {
  $slist::locals = new ArrayList();
}
  :
  'for' PAR_OPEN for_var COMMA math_exp PAR_CLOSE fun_body
  ->for_op (id={$for_var.st}, cond={$math_exp.st}, stat={$fun_body.st}, tmp={getreg()}, reg={getreg()})
  ;

for_var 
:
  a=ID
  {
             if (names.isExist($program::name + "." + $a.text)) {
                 errors.add("line "+$a.line+": name "+$a.text+" duplicated");
             } else {
                names.add(names.new Name($program::name + "." + $a.text, "Int", $a.line));
                names.get($program::name + "." + $a.text).addLineUses($a.line);
             }
  }
  ->def_var(id={$ID.text}, type={"Int"})
;

while_op
scope slist;
@init {
$slist::locals = new ArrayList();
}
  :
  'while' bool_cond fun_body
    ->while_op(bool_cond={$bool_cond.st}, locals={$slist::locals})
  ;

bool_cond
  :
  PAR_OPEN a=expr COMPROPER b=expr PAR_CLOSE
  ->bop(reg={getreg()}, op={$COMPROPER.text}, a={$a.st}, b={$b.st})
  ;

brack_id
  :
  PAR_OPEN ID PAR_CLOSE
  ;

in_out_op returns [String idType]
  :
    'out' PAR_OPEN data_id (COMMA e+=expr)* PAR_CLOSE
    {
     $idType = null;
    }
  ->outOp(format = {$data_id.st}, params={$e})
  | 
    b='read' PAR_OPEN PAR_CLOSE
    {
      $idType = "String";
    }
    ->readOp(reg={getreg()},tmp={getreg()}, type={$idType})
  | 
    b='toInt' PAR_OPEN a=data_id PAR_CLOSE
    {
           if (!"String".equals($a.idType)) {
              errors.add("line " + $b.line + ": "+ $b.text +" operation error " + $a.text + " type must be String, not " + $a.idType);
           }
           $idType = "Int";
    } 
    ->toIntOp(format={$a.st},reg={getreg()}, type={$idType})
  |
    b='length' PAR_OPEN a=data_id PAR_CLOSE
    {
           if (!"String".equals($a.idType)) {
              errors.add("line " + $b.line + ": length operation error " + $a.text + " type must be String, not " + $a.idType);
           }
           $idType = "Int";
    }
   ->length_op(format={$a.st},reg={getreg()}, tmp={getreg()},type={$idType})
  |
   b='append' PAR_OPEN a1=data_id COMMA a2=data_id PAR_CLOSE
    {
           if (!"String".equals($a1.idType)) {
              errors.add("line " + $b.line + ": length operation error " + $a1.text + " type must be String, not " + $a1.idType);
           }
           if (!"String".equals($a2.idType)) {
              errors.add("line " + $b.line + ": length operation error " + $a2.text + " type must be String, not " + $a2.idType);
           }
           $idType = "String";
    }
   ->append_op(arg1={$a1.st}, arg2={$a2.st},reg={getreg()}, type={$idType})
  |
   b='compare' PAR_OPEN a1=data_id COMMA a2=data_id PAR_CLOSE
    {
           if (!"String".equals($a1.idType)) {
              errors.add("line " + $b.line + ": length operation error " + $a1.text + " type must be String, not " + $a1.idType);
           }
           if (!"String".equals($a2.idType)) {
              errors.add("line " + $b.line + ": length operation error " + $a2.text + " type must be String, not " + $a2.idType);
           }
           $idType = "Int";
    }
   ->compare_op(arg1={$a1.st}, arg2={$a2.st},reg={getreg()}, type={$idType})
  |
   b='copy' PAR_OPEN a1=data_id COMMA a2=data_id PAR_CLOSE
    {
           if (!"String".equals($a1.idType)) {
              errors.add("line " + $b.line + ": length operation error " + $a1.text + " type must be String, not " + $a1.idType);
           }
           if (!"String".equals($a2.idType)) {
              errors.add("line " + $b.line + ": length operation error " + $a2.text + " type must be String, not " + $a2.idType);
           }
           $idType = "String";
    }
   ->copy_op(arg1={$a1.st}, arg2={$a2.st},reg={getreg()}, type={$idType})
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
  -> funCall(reg={getreg()},funName={$a.text},funArgs={$b},type={$idType})
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
   -> fun_decl(type={$type.st}, name={$ID.text}, locals={$slist::locals}, args={$p})
   |  MAIN_NAME PAR_OPEN PAR_CLOSE fun_body 
   -> main_decl(locals={$slist::locals})
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
  CUR_OPEN ((var {$slist::locals.add($var.st);}| ops {$slist::locals.add($ops.st);})+)? return_st? CUR_CLOSE
  {
    $slist::locals.add($return_st.st);
    if ($return_st.idType != null) {
      $idType = $return_st.idType;
    } 
  }
  ->block(locals={$slist::locals})
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
  '\'' .? '\''
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
