grammar strgram;

@header {
  package stringpack;
  import java.io.*;
}
@lexer::header {
  package stringpack;
} 

program	
	: 	var* functions* 
	;
	
var 	
	: 	((TYPE idInit (COMMA idInit)*)|(LIST methodCall)) EOL 
    	;

idInit	
	:	ID (EQUAL (expr | methodCall))?
	;

expr
  : multExpression (MATHOPER multExpression)*
  ;
  
multExpression
  : typeVsId
  | PARENTHESES_OPEN expr PARENTHESES_CLOSE
  ;

type 
   	:	INT|STRING
   	;
   	
typeVsId
 	:	ID | type
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
	:	PARENTHESES_OPEN ((ID COMPROPER ID) | methodCall) PARENTHESES_CLOSE
	;
	
idInBrackets
	:	PARENTHESES_OPEN ID PARENTHESES_CLOSE
	;
       
return_op
	: 	'return' ID EOL	
	;     
	  	
	
inOut 	
	: 	('out' operationCondition  EOL) | 
		('read' idInBrackets EOL)
        ;

methodCall
	:	ID operationCondition
	;

selfOperation 
	:	(ID'.')? methodCall
	;

operationCondition
	:	PARENTHESES_OPEN (conditionType (COMMA conditionType)*)? PARENTHESES_CLOSE
	;
	
conditionType 
	:	typeVsId | selfOperation
	;
	    	  
operations 
	: 	operation | if_op | while_op | for_op | inOut
	;	 

operation
	:  	(idInit	| selfOperation | (ID POSTFIXOPER)) EOL	
	;  

functions 
	: 	((MAIN_NAME PARENTHESES_OPEN)|(TYPE? ID PARENTHESES_OPEN TYPE ID (COMMA TYPE ID )*)) PARENTHESES_CLOSE 
		functionBody
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

INT 	: 	('0'..'9')+
	;
 	
ID 	
	: 	(('0'..'9')|('A'..'Z'|'a'..'z'))+	
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
	:  	'"' ('A'..'Z'|'a'..'z')+ '"'
    	;
COMMENT
    : '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    | '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
