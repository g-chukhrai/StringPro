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

text : text2
   ; 


text2
scope {
  String name;
}
@init {$text2::name = "";}
  : ( fun_decl 
    | {$text2::name = "";} var ';'
    )+
  ;

program	
	: 	var* fun_decl* main_fun? 
	;
	
var 	
	: 	((TYPE idInit (COMMA idInit)*)|(LIST methodCall)) EOL 
    	;

idInit	
	:	 ID 
		  {
		    if (names.isExist($text2::name + "." + $ID.text)) {
		      errors.add("line "+$ID.line+": name "+$ID.text+" duplicated");
		    } else {
		      names.add(names.new Name($text2::name + "." + $ID.text, $type.idType, $ID.line));
		    }
		  }
			(EQUAL (expr | methodCall))?
	;

expr
  : multExpression (MATHOPER multExpression)*
  ;
  
multExpression
  :   typeVsId
  |   PARENTHESES_OPEN expr PARENTHESES_CLOSE
  ;

type 
  :	  INT|STRING
  ;
   	
typeVsId
 	:	  ID | type
 	;

   	
if_op	
	: 	'if' boolCondition functionBody 
    	'else' functionBody
  ;

for_op 	
	: 	'for' PARENTHESES_OPEN (INT|(TYPE ID 'in' ID)) PARENTHESES_CLOSE functionBody
  ;	       

while_op	
	: 	'while' boolCondition functionBody
  ;	

boolCondition 
	:	   PARENTHESES_OPEN ((ID COMPROPER ID) | methodCall) PARENTHESES_CLOSE
	;
	
idInBrackets
	:	   PARENTHESES_OPEN ID PARENTHESES_CLOSE
	;
       
return_op
	: 	'return' ID EOL	
	;     
	  	
	
in_out_op 	
	: 	('out' operationCondition  EOL) | 
		  ('read' idInBrackets EOL)
  ;

methodCall
	:	   ID operationCondition
	;

selfOperation 
	:	   (ID'.')? methodCall
	;

operationCondition
	:	PARENTHESES_OPEN (conditionType (COMMA conditionType)*)? PARENTHESES_CLOSE
	;
	
conditionType 
	:	typeVsId | selfOperation
	;
	    	  
operations 
	: 	id_op | if_op | while_op | for_op | in_out_op
	;	 

id_op
	:  	(idInit	| selfOperation | (ID POSTFIXOPER)) EOL	
	;  

main_fun
  :   MAIN_NAME PARENTHESES_OPEN PARENTHESES_CLOSE functionBody
  ;

fun_decl
	: 	TYPE? a=ID
	  { $text2::name = $a.text; } 
	 PARENTHESES_OPEN  args PARENTHESES_CLOSE functionBody
	;
	
args
  : TYPE ID (COMMA TYPE ID )*
  ;
	
functionBody 
	:   	CURLY_OPEN
		 	    (var|operations)+ 	    
			     return_op?    
	    	CURLY_CLOSE
	;	

MAIN_NAME		: 'Main';
LIST 		 	: 'List';
COMMA 			: ',';
EQUAL			: '=';
EOL 			: ';';
PARENTHESES_OPEN 	: '(';
PARENTHESES_CLOSE	: ')';
CURLY_OPEN 	 	: '{';
CURLY_CLOSE 	 	: '}';
SQUARE_OPEN		: '[';
SQUARE_CLOSE 		: ']';

TYPE 	
	: 	'Int' | 'String' | 'Char'
	;

INT
  : (DIGIT)+
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
 	 
POSTFIXOPER 
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
COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    | '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
