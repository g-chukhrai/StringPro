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
  'Int'       {$idType = "Int";}    ->type_int()
  | 'String'  {$idType = "String";} ->type_string()
  | 'Char'    {$idType = "Char";}   ->type_char()
  ;

id_init
  :
  a=ID 
    {
     if ($a.text != null) {
             if (names.isExist($program::name + "." + $a.text)) {
                 errors.add("line "+$a.line+": name "+$a.text+" duplicated");
             } else {
     	          names.add(names.new Name($program::name + "." + $a.text, $var::varType, $a.line));
     			    }
             }
    }
    ->{new StringTemplate($a.text)}
  | id_assign 
    {
     String idName = $id_assign.idName;
                 String idType = $id_assign.idType;
                 int idLine    = $id_assign.idLine;
                 String varType = $var::varType;
                 if (names.isExist($program::name + "." + idName)) {
                   errors.add("line " + idLine + ": name " + idName + " duplicated");
                 } else {
                   names.add(names.new Name($program::name + "." + idName, varType, idLine));
                   names.get($program::name + "." + idName).addLineUses(idLine);
                   if (!varType.equals(idType)) {
                     errors.add("line "+idLine+": name "+idName+" wrong type conversion cannot convert " + idType + " to " + varType);
                   }
                 }
    }
    ->{$id_assign.st}
  ;

id_assign returns [String idName, String idType, int idLine]
  :
  a=ID EQUAL id_value 
    {
     $idName = $a.text;
     	   $idType = $id_value.idType;
     	   $idLine = $a.line;
                 if (names.isExist($program::name + "." + $a.text)) {
                   names.get($program::name + "." + $a.text).addLineUses($a.line);
     	            String varType = names.get($program::name + "." + $a.text).getType();
     	            if (!varType.equals($id_value.idType)) {
     	              errors.add("line "+$a.line+": name "+$a.text+" wrong type conversion cannot convert " + $id_value.idType + " to " + varType);
     	            }
                 }
    }
    ->assign(lhs={$a.text}, rhs={$id_value.st})
  ;

id_value returns [String idType]
  :
  expr 
    {
     $idType = $expr.idType;
    }
    ->{$expr.st}
  | fun_call 
    {
     $idType = $fun_call.idType;
    }
    ->{$fun_call.st}
  ;

var
scope {
String varType;
String listName;
}
@init {
$var::varType = "";
}
  :
  (
    (type 
      {
       $var::varType = $type.idType;
      }
      b+=id_init (COMMA b+=id_init)*)
      -> {$program::name.equals("[global]")}?
        globalVariable(type={$type.st}, name={$b})
      -> variable(type={$type.st}, name={$b})
    | (LIST a=ID 
      {
       if (names.isExist($program::name + "." + $a.text)) {
                 errors.add("line "+$a.line+": name "+$a.text+" duplicated");
               } else {
                   names.add(names.new Name($program::name + "." + $a.text, "List", $a.line));
               }
       $var::listName = $a.text;
      }
      listParams)
      ->listInit(name={$a.text},params={$listParams.st})
  )
  EOL 
  ;

listParams
: 
  PAR_OPEN (a+=listParam (COMMA a+=listParam)*)? PAR_CLOSE
  -> iconst(value={$a})
;

listParam
: a=data_id
-> listParam(listName={$var::listName},val={$a.st})
;

expr returns [String idType]
  :
  a+=math_exp a+=addExpr*
    ->iconst(value={$a})
  ;

addExpr
  :
  MATHOPER math_exp
    ->addExpr(sign={$MATHOPER.text}, right={$math_exp.st})
  ;

math_exp returns [String idType]
  :
  data_id {$idType = $data_id.idType;}                ->{$data_id.st}
  | PAR_OPEN expr PAR_CLOSE {$idType = $expr.idType;} -> inbrac(value={$expr.st})
  ;

data returns [String idType]
  :
    INT {$idType = "Int";}        ->{new StringTemplate($INT.text)}
  | STRING {$idType = "String";}  ->{new StringTemplate($STRING.text)}
  | CHAR {$idType = "Char";}      ->{new StringTemplate($CHAR.text)}
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
    ->{new StringTemplate($ID.text)}
  | data {$idType = $data.idType;}  ->{$data.st}
  ;

if_op
scope slist;
@init {
$slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  'if' bool_cond fun_body else_block?
    ->if_else_op( bool_cond={$bool_cond.st}, locals={$slist::locals}, 
                  stats={$slist::stats}, else_block={$else_block.st})
  ;

else_block
scope slist;
@init {
$slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  'else' fun_body
    ->else_block(locals={$slist::locals}, stats={$slist::stats})
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
  PAR_OPEN
  (
    (a=data_id COMPROPER b=data_id)
      ->addSign(left={$a.st}, sign={$COMPROPER.text}, right={$b.st})
    | 
    fun_call
      ->{$fun_call.st}
  )
  PAR_CLOSE
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
  a=ID b=op_cond 
    {
     if (!methods.isExist($a.text)) {
     	errors.add("line " + $a.line + ": methon name " + $a.text
     			+ " cannot be resolved");
     } else {
     	$idType = methods.get($a.text).getReturnType();
     	methods.get($a.text).addLineUses($a.line);
     }
    }  
  -> funCall(funName={$a.text},funArgs={$b.st})
  | 
  in_out_op 
    {
     $idType = $in_out_op.idType;
    }
  -> {$in_out_op.st}

  ;

self_op
  :
  (ID '.')? fun_call
  ;

op_cond
  :
  PAR_OPEN (a+=data_id (COMMA a+=data_id)*)? PAR_CLOSE
  -> args(args={$a})
  ;

ops
  :
  id_op EOL
    ->statement(expr={$id_op.st})
  | if_op
    ->{$if_op.st}
  | while_op
    ->{$while_op.st}
  | for_op
    ->{$for_op.st}
  | fun_call EOL
    ->statement(expr={$fun_call.st})
  ;

id_op
  :
	  id_assign
	    ->{$id_assign.st}
    | (ID POSTFIX)
  ;

main_fun
  :
  MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
  ;

fun_decl
scope {
String name;
}
scope slist;
@init {
$slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
}
  :
  type? a=ID 
    {
     $fun_decl::name=$a.text;
     $program::name = $ID.text; 
     methods.add(methods.new Method($program::name, $type.idType));
    }
  PAR_OPEN p+=args? PAR_CLOSE fun_body 
    {
     if ($type.idType != null) {
     	if ($fun_body.returnType == null) {
     		errors.add("line " + $a.line + ": method " + $a.text
     				+ " missing return statement, expecting " + $type.idType);
     	} else if (!$type.idType.equals($fun_body.returnType)) {
     		errors.add("line " + $a.line + ": method " + $a.text
     				+ " wrong type conversion cannot convert return type "
     				+ $fun_body.returnType + " to " + $type.idType);
     	}
     }
    }
    ->
      fun_decl(type={$type.st}, name={$fun_decl::name}, locals={$slist::locals}, stats={$slist::stats}, args={$p})
   | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body 
   -> main_decl(locals={$slist::locals}, stats={$slist::stats})
  ;

args
  :
  a=type b=ID (COMMA type ID)*
    ->
      parameter(type={$a.st}, name={$b.text})
  ;

fun_body returns [String returnType]
  :
  CUR_OPEN
  (
    var 
      {
       $slist::locals.add($var.st);
      }
    | ops 
      {
       $slist::stats.add($ops.st);
      }
  )*
  ('return' a=ID EOL)? 
    {
     if($a.text!= null){
     						    if (! names.isExist($program::name + "." + $a.text)) {
     						      errors.add("line "+$a.line+": name "+$a.text+" cannot be resolved");
     						    } else {
     	                names.get($program::name + "." + $a.text).addLineUses($a.line);
     	                $returnType = names.get($program::name + "." + $a.text).getType();
     						    }			
     					   }
    }
  CUR_CLOSE
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

ID
  :
  (
    ALPHA
    | DIGIT
  )+
  ;

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
    
POSTFIX
  :
  '++'
  | '--'
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
