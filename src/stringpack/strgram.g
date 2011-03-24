grammar strgram;
options {output=template;}

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
    return "line "+e.line+":";  
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
    ( fun_decl 
      {$program::functions.add($fun_decl.st);}
    | {$program::name = "[global]";} 
      var
      {$program::globals.add($var.st);}
    )+
    -> program(globals={$program::globals},functions={$program::functions})
  ; 
   
 type  returns  [String idType]
  :    'Int'    {$idType = "Int";}      -> type_int()
  |    'String' {$idType = "String";}   -> type_string()
  |    'Char'   {$idType = "Char";}     -> type_char()
  ;
     
id_init
  :   
      a = ID 
      {
       if ($a.text != null) {
        if (names.isExist($program::name + "." + $a.text)) {
            errors.add("line "+$a.line+": name "+$a.text+" duplicated");
        } else {
	          names.add(names.new Name($program::name + "." + $a.text, $var::varType, $a.line));
			    }
        }
      }
      -> {new StringTemplate($a.text)}
      |
      id_assign    
      -> {$id_assign.st}
  ;
  
  
  
id_assign
	: 
	a = ID EQUAL id_value
	{
	   
            if (!names.isExist($program::name + "." + $a.text)) {
              errors.add("line "+$a.line+": name "+$a.text+" not exist");
            } else {
              names.get($program::name + "." + $a.text).addLineUses($a.line);
	            String varType = names.get($program::name + "." + $a.text).getType();
	            if (!varType.equals($id_value.idType)) {
	              errors.add("line "+$a.line+": name "+$a.text+" wrong type conversion cannot convert " + $id_value.idType + " to " + varType);
	            }
            }
	}
	-> assign(lhs={$a.text}, rhs={$id_value.st})
	;   

id_value returns [String idType]
  :
      expr 
      {
        $idType = $expr.idType;
      }
      -> {$expr.st}
      |  
      fun_call
      {
        $idType = $fun_call.idType;  
      }
      -> {$fun_call.st}
  ;

  
var
scope {
  String varType;
}
@init {$var::varType = "";} 	 
	: 	
	((type
	{
    $var::varType = $type.idType;	
	}
	b+=id_init (COMMA b+=id_init)*) 
  |
  (LIST a = ID
  {
        if (names.isExist($program::name + "." + $a.text)) {
          errors.add("line "+$a.line+": name "+$a.text+" duplicated");
        } else {
            names.add(names.new Name($program::name + "." + $a.text, "List", $a.line));
        }  
  }
  op_cond))
	EOL 
        -> {$program::name.equals("[global]")}?
           globalVariable(type={$type.st},name={$b})
        -> variable(type={$type.st},name={$b})
  ;

expr returns [String idType]
  :   a=math_exp (MATHOPER b=math_exp)*
  {
    if ($b.idType != null && !$a.idType.equals($b.idType)){
      errors.add("line " + "a.line" + ": names " + $a.text + " and " + $b.text + " has inconvertable types");
    } else {
      $idType = $a.idType;
    }
  }
  -> {$a.st}

  ;
  
math_exp returns  [String idType]
  :   
  data_id
  {
    $idType = $data_id.idType;
  }
  -> {$data_id.st}
  |   PAR_OPEN expr PAR_CLOSE
  {
    $idType = $expr.idType;
  }
  -> {$expr.st}
  ;

data returns  [String idType]
  :	  INT     {$idType = "Int";}    -> {new StringTemplate($INT.text)}
  |   STRING  {$idType = "String";} -> {new StringTemplate($STRING.text)}
  |   CHAR    {$idType = "Char";}   -> {new StringTemplate($CHAR.text)}
  ;
   	
data_id returns  [String idType]
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
  -> {new StringTemplate($ID.text)}
 	|   
 	data
 	{
 	    $idType = $data.idType;
 	}
 	-> {$data.st}
 	;
   	
if_op	
	: 	'if' bool_cond fun_body 
    	'else' fun_body
  ;

for_op
scope slist;
@init {
  $slist::locals = new ArrayList();
  $slist::stats = new ArrayList();
} 	
	: 	
	'for' PAR_OPEN 
	(INT
	|
	(type a=ID 'in' b=ID))
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
        -> for_op(e1={"int i = 0"},e2={"; i < " + $INT.text},e3={" i++"},
                   locals={$slist::locals}, stats={$slist::stats})
  ;	       

while_op	
	: 	'while' bool_cond fun_body
  ;	

bool_cond
	:	   PAR_OPEN ((ID COMPROPER ID) | fun_call) PAR_CLOSE
	;
	
brack_id
	:	   PAR_OPEN ID PAR_CLOSE
	;
    
in_out_op returns [String idType]
	: 	('out' op_cond ) 
	{
	   $idType = null;
	}
	|   ('read' PAR_OPEN PAR_CLOSE) 
	{
	   $idType = "String";
	}
  ;
  
fun_call returns [String idType]
	:	   a=ID op_cond
	{
		    if (!methods.isExist($a.text)) {
		      errors.add("line "+$a.line+": methon name "+$a.text+" cannot be resolved");
		    } else {
		      $idType = methods.get($a.text).getReturnType();		   
		      methods.get($a.text).addLineUses($a.line);   
		    }	     
	}
	|    in_out_op
	{
	     $idType = $in_out_op.idType;
	}
	;

self_op
	:	   (ID'.')? fun_call
	;

op_cond
	:	PAR_OPEN (cond_arg (COMMA cond_arg)*)? PAR_CLOSE
	;

cond_arg
	:	data_id | self_op
	;
	
    	  
ops 
	: 	
	id_op      -> statement(expr={$id_op.st})
	| 
	if_op   
	| 
	while_op
	| 
	for_op     -> {$for_op.st}
	;	 

id_op
	:  	
	(id_assign -> {$id_assign.st}
	| 
	self_op 
	| 
	(ID POSTFIX)
	) EOL	
	;  

main_fun
  :   MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
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
	: type? a=ID {$fun_decl::name=$a.text;}
	  { 
	     $program::name = $ID.text; 
	     methods.add(methods.new Method($program::name, $type.idType));
	  } 
	 PAR_OPEN  p+=args? PAR_CLOSE fun_body
	 {
	     if ($type.idType != null){
	       if($fun_body.returnType == null) {
	           errors.add("line "+$a.line+": method "+$a.text+" missing return statement, expecting " + $type.idType);
	       }else if(!$type.idType.equals($fun_body.returnType)){
            errors.add("line "+$a.line+": method "+$a.text+" wrong type conversion cannot convert return type " + 
                      $fun_body.returnType + " to " + $type.idType);
         }
	     }
	 }
	         -> fun_decl(type={$type.st}, name={$fun_decl::name},
                    locals={$slist::locals},
                    stats={$slist::stats},
                    args={$p})
	; 
	 
args
  : a=type b=ID (COMMA type ID )*
  -> parameter(type={$a.st},name={$b.text})
  ;
	 
fun_body returns  [String returnType]
	:   	CUR_OPEN
		 	     
	       ( var {$slist::locals.add($var.st);} 
	       |
	         ops {$slist::stats.add($ops.st);}
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

MAIN_NAME		: 'MAIN';
LIST 		 	  : 'List';
COMMA 			: ',';
EQUAL			  : '=';
EOL 			  : ';';
PAR_OPEN 	  : '(';
PAR_CLOSE	  : ')';
CUR_OPEN 	 	: '{';
CUR_CLOSE 	: '}';
SQ_OPEN		  : '[';
SQ_CLOSE 		: ']';


	
INT
  : DIGIT+
  ;
    
ID  
  : (ALPHA|DIGIT)+
  ;
  
fragment ALPHA
  : ('a'..'z'|'A'..'Z')
  ;
  
fragment DIGIT
  : '0'..'9' 
  ;

WS  :  ( ' ' | '\r' | '\t' | '\n' ) {$channel=HIDDEN;}
    ;
 	 
POSTFIX 
	:	'++'| '--'
	;
	
MATHOPER 
	: 	'-' | '+' | '*' | '/' 
	;	

COMPROPER 
	: 	('>'|'<'|'=='|'>='|'<=')
	; 		
     
STRING 	
	:  	'"' .* '"'
  ;

CHAR  
  :   '\'' ALPHA? '\''
  ;
 
COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    | '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
