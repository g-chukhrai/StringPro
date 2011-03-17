grammar strgram;

@header {
  package stringpack;
}
@lexer::header {
  package stringpack;
} 
@members {
  protected NamesTable names = new NamesTable();
  protected MethodTable methods = new MethodTable();
  protected ArrayList<String> errors = new ArrayList<String>(); 
   
  public static void main(String[] args) throws Exception {
//    ANTLRInputStream input = new ANTLRInputStream(System.in);
    ANTLRFileStream input = new ANTLRFileStream("D:/JavaProj/stringpro/src/examples/parserTest1.txt");
    strgramLexer lex = new strgramLexer(input);
    System.out.println("Start parsing " + input.getSourceName());
    strgramParser parser = new strgramParser(new CommonTokenStream(lex));
    parser.text();
    parser.names.print(System.out);
    parser.methods.print(System.out);
    if (! parser.errors.isEmpty()) {
      System.out.println("\n\rFound: ");
      System.err.println(parser.errors.size() + " errors");
      for (String m : parser.errors) {
        System.err.println(m);
      } 
    } 
    } 
  public String getErrorHeader(RecognitionException e) {
    return "line "+e.line+":";  
  }
  public void emitErrorMessage(String msg) {
    errors.add(msg);
  } 
}

text : text2 
   ; 

text2
scope {
  String name;
}
@init {$text2::name = "[global]";}
  : ( fun_decl 
    | {$text2::name = "[global]";} var
    )+
  ; 
   
 type  returns  [String idType]
  :    'Int'    {$idType = "Int";} 
  |    'String' {$idType = "String";}  
  |    'Char'   {$idType = "Char";} 
  ;
     
id_init returns[String idName,int idLine]
  :   a = ID 
      {
       if ($a.text != null) {
        if (names.isExist($text2::name + "." + $a.text)) {
          errors.add("line "+$a.line+": name "+$a.text+" duplicated");
        } else {
	          $idName = $a.text;
	          $idLine = $a.line;
	          names.add(names.new Name($text2::name + "." + $a.text, $var::varType, $a.line));
				    names.get($text2::name + "." + $a.text).addLineUses($a.line);
			    }
        }
      }
      (EQUAL id_value)?
      {
        if ($id_value.idType != null){
            String varType = names.get($text2::name + "." + $a.text).getType();
            if (!varType.equals($id_value.idType)) {
              errors.add("line "+$a.line+": name "+$a.text+" wrong type conversion cannot convert " + $id_value.idType + " to " + varType);
            } else {
              names.get($text2::name + "." + $a.text).addLineUses($a.line);
            }
        }
      }

  ;
  
id_assign
	: a = ID EQUAL id_value
	{
            if (!names.isExist($text2::name + "." + $a.text)) {
              errors.add("line "+$a.line+": name "+$a.text+" not exist");
            } else {
              names.get($text2::name + "." + $a.text).addLineUses($a.line);
	            String varType = names.get($text2::name + "." + $a.text).getType();
	            if (!varType.equals($id_value.idType)) {
	              errors.add("line "+$a.line+": name "+$a.text+" wrong type conversion cannot convert " + $id_value.idType + " to " + varType);
	            } else {
	              names.get($text2::name + "." + $a.text).addLineUses($a.line);
	            }
            }
	}
	;   

id_value returns [String idType]
  :
      (expr 
      {
        $idType = $expr.idType;
      }
      |  
      fun_call)
  ;

  
var
scope {
  String varType;
}
@init {$var::varType = "";} 	 
	: 	(type
	{
    $var::varType = $type.idType;	
	}
	 a=id_init (COMMA b=id_init)*|(LIST fun_call)) 
	{
     if ($a.idName != null) {
          names.add(names.new Name($text2::name + "." + $a.idName, $type.idType, $a.idLine));
     }

  }
	EOL 
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
  ;
  
math_exp returns  [String idType]
  :   data_id
  {
    $idType = $data_id.idType;
  }
  |   PAR_OPEN expr PAR_CLOSE
  {
    $idType = $expr.idType;
  }
  ;

data returns  [String idType]
  :	  INT     {$idType = "Int";} 
  |   STRING  {$idType = "String";}
  |   CHAR    {$idType = "Char";}
  ;
   	
data_id returns  [String idType]
 	:	  ID
 	{
    if (! names.isExist($text2::name + "." + $ID.text)) {
      errors.add("line "+$ID.line+": name "+$ID.text+" cannot be resolved");
    } else {
      names.get($text2::name + "." + $ID.text).addLineUses($ID.line);   
    }
    $idType = names.get($text2::name + "." + $ID.text).getType();
  } 
 	|   data
 	{
 	  $idType = $data.idType;
 	}
 	;
   	
if_op	
	: 	'if' bool_cond fun_body 
    	'else' fun_body
  ;

for_op 	
	: 	'for' PAR_OPEN (INT|(type a=ID 'in' b=ID))
	 {
    if (! names.isExist($text2::name + "." + $a.text)) {
      errors.add("line "+$a.line+": name "+$a.text+" cannot be resolved");
    } else {
      names.get($text2::name + "." + $a.text).addLineUses($a.line);
    }
    if (! names.isExist($text2::name + "." + $b.text)) {
      errors.add("line "+$b.line+": name "+$b.text+" cannot be resolved");
    } else {
      names.get($text2::name + "." + $b.text).addLineUses($b.line);   
    }
  } 
	 PAR_CLOSE fun_body
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
       
return_op
	: 	'return' ID EOL	
	;     
	  	
	
in_out_op 	
	: 	('out' op_cond  EOL) | 
		  ('read' brack_id EOL)
  ;

fun_call
	:	   ID op_cond
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
	: 	id_op | if_op | while_op | for_op | in_out_op | var
	;	 

id_op
	:  	(id_assign | self_op | (ID POSTFIX)) EOL	
	;  

main_fun
  :   MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
  ;

fun_decl
	: type? ID
	  { 
	     $text2::name = $ID.text; 
	     methods.add(methods.new Method($text2::name, $type.idType));
	  } 
	 PAR_OPEN  args? PAR_CLOSE fun_body
	; 
	 
args
  : type ID (COMMA type ID )*
  ;
	
fun_body
	:   	CUR_OPEN
		 	     ops*
			     return_op?    
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
	:  	'"' ID '"'
  ;

CHAR  
  :   '\'' ALPHA? '\''
  ;
 
COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    | '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
