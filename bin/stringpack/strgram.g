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
    GLL3Lexer lex = new GLL3Lexer(new ANTLRFileStream(args[0]));
    GLL3Parser parser = new GLL3Parser(new CommonTokenStream(lex));
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


text
scope {
  String name;
}
@init {$text::name = "";}
  : ( fun_decl 
    | {$text::name = "";} var
    )+
  ;

program	
	:   var* fun_decl* 
	;

var 	 
	: 	((types id_init (COMMA id_init)*)|(LIST fun_call)) EOL 
  ;

id_init	
	:	 ID 
		  {
		    if (names.isExist($text::name + "." + $ID.text)) {
		      errors.add("line "+$ID.line+": name "+$ID.text+" duplicated");
		    } else {
		      names.add(names.new Name($text::name + "." + $ID.text, $types.idType, $ID.line));
		    }
		  }
			(EQUAL (expr | fun_call))?
	;

expr
  :   math_exp (MATHOPER math_exp)*
  ;
  
math_exp
  :   type_id
  |   PAR_OPEN expr PAR_CLOSE
  ;

type 
  :	  INT | STRING | CHAR
  ;
   	
type_id
 	:	  ID | type
 	;
   	
if_op	
	: 	'if' bool_cond fun_body 
    	'else' fun_body
  ;

for_op 	
	: 	'for' PAR_OPEN (INT|(types ID 'in' ID)) PAR_CLOSE fun_body
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
	:	type_id | self_op
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
	: 	types? ID
	  { $text::name = $ID.text; } 
	 PAR_OPEN  args? PAR_CLOSE fun_body
	;
	
args
  : types ID (COMMA types ID )*
  ;
	
fun_body
	:   	CUR_OPEN
		 	    (var|ops)+ 	    
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

types returns [String idType]
	: 	 'Int'    {$idType = "Int";} 
	|    'String' {$idType = "String";}  
	|    'Char'   {$idType = "Char";} 
	;
	
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
	:  	'"' ALPHA+ '"'
  ;

CHAR  
  :   '\'' ALPHA '\''
  ;
 
COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    | '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
