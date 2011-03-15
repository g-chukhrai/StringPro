grammar strgram;

@header {
  package stringpack;
  import java.io.*;
}
@lexer::header {
  package stringpack;
} 
@members {
  protected NamesTable names = new NamesTable();
  protected ArrayList<String> errors = new ArrayList<String>(); 
   
  public static void main(String[] args) throws Exception {
//    ANTLRInputStream input = new ANTLRInputStream(System.in);
    ANTLRFileStream input = new ANTLRFileStream("D:/JavaProj/stringpro/src/examples/parserTest1.txt");
    strgramLexer lex = new strgramLexer(input);
    System.out.println("Start parsing " + input.getSourceName());
    strgramParser parser = new strgramParser(new CommonTokenStream(lex));
    parser.text();
    parser.names.print(System.out);
    if (! parser.errors.isEmpty()) {
      System.out.println("Found " + parser.errors.size() + " errors:");
      for (String m : parser.errors) {
        System.out.println(m);
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
@init {$text2::name = "";}
  : ( fun_decl 
    | {$text2::name = "";} var
    )+
  ; 
   
 type  returns  [String idType]
  :    'Int'    {$idType = "Int";} 
  |    'String' {$idType = "String";}  
  |    'Char'   {$idType = "Char";} 
  ;
    
var 	 
	: 	(id_init |(LIST fun_call)) EOL 
  ;

id_init	
	:	  type a = ID (COMMA b=ID)*
		  {
		    if (names.isExist($text2::name + "." + $a.text)) {
		      errors.add("line "+$a.line+": name "+$a.text+" duplicated");
		    } else {
		      names.add(names.new Name($text2::name + "." + $a.text, $type.idType, $a.line));
		      names.get($text2::name + "." + $a.text).addLineUses($a.line);
		    }
		    if (b != null) {
	        if (names.isExist($text2::name + "." + $b.text)) {
	          errors.add("line "+$b.line+": name "+$b.text+" duplicated");
	        } else {
	          names.add(names.new Name($text2::name + "." + $b.text, $type.idType, $b.line));
	          names.get($text2::name + "." + $b.text).addLineUses($b.line);          
	        }		    
        }
     
		  }
			(EQUAL (expr | fun_call))?
	;

expr
  :   math_exp (MATHOPER math_exp)*
  ;
  
math_exp
  :   data_id
  |   PAR_OPEN expr PAR_CLOSE
  ;

data 
  :	  INT | STRING | CHAR
  ;
   	
data_id
 	:	  ID | data
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
	: 	id_op | if_op | while_op | for_op | in_out_op
	;	 

id_op
	:  	(id_init	| self_op | (ID POSTFIX)) EOL	
	;  

main_fun
  :   MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
  ;

fun_decl
	: 	type? ID
	  { $text2::name = $ID.text; } 
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
  : ALPHA+
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
	:  	'"' ALPHA* '"'
  ;

CHAR  
  :   '\'' ALPHA? '\''
  ;
 
COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    | '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
