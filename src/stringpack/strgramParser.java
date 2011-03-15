// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-15 10:35:46

  package stringpack;
  import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "COMMA", "LIST", "EOL", "ID", "EQUAL", "MATHOPER", "PARENTHESES_OPEN", "PARENTHESES_CLOSE", "INT", "STRING", "COMPROPER", "POSTFIXOPER", "MAIN_NAME", "CURLY_OPEN", "CURLY_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'if'", "'else'", "'for'", "'in'", "'while'", "'return'", "'out'", "'read'", "'.'"
    };
    public static final int EOF=-1;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int TYPE=4;
    public static final int COMMA=5;
    public static final int LIST=6;
    public static final int EOL=7;
    public static final int ID=8;
    public static final int EQUAL=9;
    public static final int MATHOPER=10;
    public static final int PARENTHESES_OPEN=11;
    public static final int PARENTHESES_CLOSE=12;
    public static final int INT=13;
    public static final int STRING=14;
    public static final int COMPROPER=15;
    public static final int POSTFIXOPER=16;
    public static final int MAIN_NAME=17;
    public static final int CURLY_OPEN=18;
    public static final int CURLY_CLOSE=19;
    public static final int SQUARE_OPEN=20;
    public static final int SQUARE_CLOSE=21;
    public static final int DIGIT=22;
    public static final int ALPHA=23;
    public static final int WS=24;
    public static final int COMMENT=25;

    // delegates
    // delegators


        public strgramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public strgramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return strgramParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g"; }


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



    // $ANTLR start "text"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:34:1: text : text2 ;
    public final void text() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:34:6: ( text2 )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:34:8: text2
            {
            pushFollow(FOLLOW_text2_in_text30);
            text2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "text"

    protected static class text2_scope {
        String name;
    }
    protected Stack text2_stack = new Stack();


    // $ANTLR start "text2"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:38:1: text2 : ( fun_decl | var ';' )+ ;
    public final void text2() throws RecognitionException {
        text2_stack.push(new text2_scope());
        ((text2_scope)text2_stack.peek()).name = "";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:3: ( ( fun_decl | var ';' )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:5: ( fun_decl | var ';' )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:5: ( fun_decl | var ';' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                switch ( input.LA(1) ) {
                case TYPE:
                    {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ID) ) {
                        int LA1_5 = input.LA(3);

                        if ( (LA1_5==PARENTHESES_OPEN) ) {
                            alt1=1;
                        }
                        else if ( (LA1_5==COMMA||LA1_5==EOL||LA1_5==EQUAL) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case ID:
                    {
                    alt1=1;
                    }
                    break;
                case LIST:
                    {
                    alt1=2;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:7: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_text257);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:7: var ';'
            	    {
            	    ((text2_scope)text2_stack.peek()).name = "";
            	    pushFollow(FOLLOW_var_in_text268);
            	    var();

            	    state._fsp--;

            	    match(input,EOL,FOLLOW_EOL_in_text270); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            text2_stack.pop();
        }
        return ;
    }
    // $ANTLR end "text2"


    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:48:1: program : ( var )* ( fun_decl )* ( main_fun )? ;
    public final void program() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:2: ( ( var )* ( fun_decl )* ( main_fun )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:5: ( var )* ( fun_decl )* ( main_fun )?
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:5: ( var )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==ID) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==COMMA||LA2_4==EOL||LA2_4==EQUAL) ) {
                            alt2=1;
                        }


                    }


                }
                else if ( (LA2_0==LIST) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:5: var
            	    {
            	    pushFollow(FOLLOW_var_in_program91);
            	    var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:10: ( fun_decl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==TYPE||LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:10: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program94);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:20: ( main_fun )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==MAIN_NAME) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:20: main_fun
                    {
                    pushFollow(FOLLOW_main_fun_in_program97);
                    main_fun();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:52:1: var : ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) ) EOL ;
    public final void var() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:2: ( ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:5: ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:5: ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TYPE) ) {
                alt6=1;
            }
            else if ( (LA6_0==LIST) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:6: ( TYPE idInit ( COMMA idInit )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:6: ( TYPE idInit ( COMMA idInit )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:7: TYPE idInit ( COMMA idInit )*
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_var116); 
                    pushFollow(FOLLOW_idInit_in_var118);
                    idInit();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:19: ( COMMA idInit )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:20: COMMA idInit
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var121); 
                    	    pushFollow(FOLLOW_idInit_in_var123);
                    	    idInit();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:36: ( LIST methodCall )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:36: ( LIST methodCall )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:37: LIST methodCall
                    {
                    match(input,LIST,FOLLOW_LIST_in_var129); 
                    pushFollow(FOLLOW_methodCall_in_var131);
                    methodCall();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var135); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "var"


    // $ANTLR start "idInit"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:56:1: idInit : ID ( EQUAL ( expr | methodCall ) )? ;
    public final void idInit() throws RecognitionException {
        Token ID1=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:2: ( ID ( EQUAL ( expr | methodCall ) )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:5: ID ( EQUAL ( expr | methodCall ) )?
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_idInit153); 

            		    if (names.isExist(((text2_scope)text2_stack.peek()).name + "." + (ID1!=null?ID1.getText():null))) {
            		      errors.add("line "+(ID1!=null?ID1.getLine():0)+": name "+(ID1!=null?ID1.getText():null)+" duplicated");
            		    } else {
            		      names.add(names.new Name(((text2_scope)text2_stack.peek()).name + "." + (ID1!=null?ID1.getText():null), $type.idType, (ID1!=null?ID1.getLine():0)));
            		    }
            		  
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:65:4: ( EQUAL ( expr | methodCall ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==EQUAL) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:65:5: EQUAL ( expr | methodCall )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_idInit166); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:65:11: ( expr | methodCall )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==ID) ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1==COMMA||LA7_1==EOL||LA7_1==MATHOPER) ) {
                            alt7=1;
                        }
                        else if ( (LA7_1==PARENTHESES_OPEN) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA7_0==PARENTHESES_OPEN||(LA7_0>=INT && LA7_0<=STRING)) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:65:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_idInit169);
                            expr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:65:19: methodCall
                            {
                            pushFollow(FOLLOW_methodCall_in_idInit173);
                            methodCall();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "idInit"


    // $ANTLR start "expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:68:1: expr : multExpression ( MATHOPER multExpression )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:3: ( multExpression ( MATHOPER multExpression )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:5: multExpression ( MATHOPER multExpression )*
            {
            pushFollow(FOLLOW_multExpression_in_expr188);
            multExpression();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:20: ( MATHOPER multExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MATHOPER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:21: MATHOPER multExpression
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr191); 
            	    pushFollow(FOLLOW_multExpression_in_expr193);
            	    multExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr"


    // $ANTLR start "multExpression"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:1: multExpression : ( typeVsId | PARENTHESES_OPEN expr PARENTHESES_CLOSE );
    public final void multExpression() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:73:3: ( typeVsId | PARENTHESES_OPEN expr PARENTHESES_CLOSE )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||(LA10_0>=INT && LA10_0<=STRING)) ) {
                alt10=1;
            }
            else if ( (LA10_0==PARENTHESES_OPEN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:73:7: typeVsId
                    {
                    pushFollow(FOLLOW_typeVsId_in_multExpression212);
                    typeVsId();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:74:7: PARENTHESES_OPEN expr PARENTHESES_CLOSE
                    {
                    match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_multExpression220); 
                    pushFollow(FOLLOW_expr_in_multExpression222);
                    expr();

                    state._fsp--;

                    match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_multExpression224); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "multExpression"


    // $ANTLR start "type"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:77:1: type : ( INT | STRING );
    public final void type() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:78:3: ( INT | STRING )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:
            {
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "typeVsId"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:1: typeVsId : ( ID | type );
    public final void typeVsId() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:82:3: ( ID | type )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=INT && LA11_0<=STRING)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:82:7: ID
                    {
                    match(input,ID,FOLLOW_ID_in_typeVsId261); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:82:12: type
                    {
                    pushFollow(FOLLOW_type_in_typeVsId265);
                    type();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "typeVsId"


    // $ANTLR start "if_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:86:1: if_op : 'if' boolCondition functionBody 'else' functionBody ;
    public final void if_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:2: ( 'if' boolCondition functionBody 'else' functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:5: 'if' boolCondition functionBody 'else' functionBody
            {
            match(input,26,FOLLOW_26_in_if_op284); 
            pushFollow(FOLLOW_boolCondition_in_if_op286);
            boolCondition();

            state._fsp--;

            pushFollow(FOLLOW_functionBody_in_if_op288);
            functionBody();

            state._fsp--;

            match(input,27,FOLLOW_27_in_if_op296); 
            pushFollow(FOLLOW_functionBody_in_if_op298);
            functionBody();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "if_op"


    // $ANTLR start "for_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:91:1: for_op : 'for' PARENTHESES_OPEN ( INT | ( TYPE ID 'in' ID ) ) PARENTHESES_CLOSE functionBody ;
    public final void for_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:2: ( 'for' PARENTHESES_OPEN ( INT | ( TYPE ID 'in' ID ) ) PARENTHESES_CLOSE functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:5: 'for' PARENTHESES_OPEN ( INT | ( TYPE ID 'in' ID ) ) PARENTHESES_CLOSE functionBody
            {
            match(input,28,FOLLOW_28_in_for_op313); 
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_for_op315); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:28: ( INT | ( TYPE ID 'in' ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INT) ) {
                alt12=1;
            }
            else if ( (LA12_0==TYPE) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:29: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op318); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:33: ( TYPE ID 'in' ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:33: ( TYPE ID 'in' ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:34: TYPE ID 'in' ID
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_for_op321); 
                    match(input,ID,FOLLOW_ID_in_for_op323); 
                    match(input,29,FOLLOW_29_in_for_op325); 
                    match(input,ID,FOLLOW_ID_in_for_op327); 

                    }


                    }
                    break;

            }

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_for_op331); 
            pushFollow(FOLLOW_functionBody_in_for_op333);
            functionBody();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "for_op"


    // $ANTLR start "while_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:95:1: while_op : 'while' boolCondition functionBody ;
    public final void while_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:2: ( 'while' boolCondition functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:5: 'while' boolCondition functionBody
            {
            match(input,30,FOLLOW_30_in_while_op355); 
            pushFollow(FOLLOW_boolCondition_in_while_op357);
            boolCondition();

            state._fsp--;

            pushFollow(FOLLOW_functionBody_in_while_op359);
            functionBody();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "while_op"


    // $ANTLR start "boolCondition"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:99:1: boolCondition : PARENTHESES_OPEN ( ( ID COMPROPER ID ) | methodCall ) PARENTHESES_CLOSE ;
    public final void boolCondition() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:2: ( PARENTHESES_OPEN ( ( ID COMPROPER ID ) | methodCall ) PARENTHESES_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:7: PARENTHESES_OPEN ( ( ID COMPROPER ID ) | methodCall ) PARENTHESES_CLOSE
            {
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_boolCondition376); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:24: ( ( ID COMPROPER ID ) | methodCall )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==COMPROPER) ) {
                    alt13=1;
                }
                else if ( (LA13_1==PARENTHESES_OPEN) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:25: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:25: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:26: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_boolCondition380); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_boolCondition382); 
                    match(input,ID,FOLLOW_ID_in_boolCondition384); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:45: methodCall
                    {
                    pushFollow(FOLLOW_methodCall_in_boolCondition389);
                    methodCall();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_boolCondition392); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "boolCondition"


    // $ANTLR start "idInBrackets"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:1: idInBrackets : PARENTHESES_OPEN ID PARENTHESES_CLOSE ;
    public final void idInBrackets() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:2: ( PARENTHESES_OPEN ID PARENTHESES_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:7: PARENTHESES_OPEN ID PARENTHESES_CLOSE
            {
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_idInBrackets407); 
            match(input,ID,FOLLOW_ID_in_idInBrackets409); 
            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_idInBrackets411); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "idInBrackets"


    // $ANTLR start "return_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:107:1: return_op : 'return' ID EOL ;
    public final void return_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:108:2: ( 'return' ID EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:108:5: 'return' ID EOL
            {
            match(input,31,FOLLOW_31_in_return_op430); 
            match(input,ID,FOLLOW_ID_in_return_op432); 
            match(input,EOL,FOLLOW_EOL_in_return_op434); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "return_op"


    // $ANTLR start "in_out_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:112:1: in_out_op : ( ( 'out' operationCondition EOL ) | ( 'read' idInBrackets EOL ) );
    public final void in_out_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:113:2: ( ( 'out' operationCondition EOL ) | ( 'read' idInBrackets EOL ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            else if ( (LA14_0==33) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:113:5: ( 'out' operationCondition EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:113:5: ( 'out' operationCondition EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:113:6: 'out' operationCondition EOL
                    {
                    match(input,32,FOLLOW_32_in_in_out_op461); 
                    pushFollow(FOLLOW_operationCondition_in_in_out_op463);
                    operationCondition();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op466); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:114:5: ( 'read' idInBrackets EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:114:5: ( 'read' idInBrackets EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:114:6: 'read' idInBrackets EOL
                    {
                    match(input,33,FOLLOW_33_in_in_out_op477); 
                    pushFollow(FOLLOW_idInBrackets_in_in_out_op479);
                    idInBrackets();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op481); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "in_out_op"


    // $ANTLR start "methodCall"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:1: methodCall : ID operationCondition ;
    public final void methodCall() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:118:2: ( ID operationCondition )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:118:7: ID operationCondition
            {
            match(input,ID,FOLLOW_ID_in_methodCall497); 
            pushFollow(FOLLOW_operationCondition_in_methodCall499);
            operationCondition();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "methodCall"


    // $ANTLR start "selfOperation"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:1: selfOperation : ( ID '.' )? methodCall ;
    public final void selfOperation() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:2: ( ( ID '.' )? methodCall )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:7: ( ID '.' )? methodCall
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:7: ( ID '.' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==34) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_selfOperation515); 
                    match(input,34,FOLLOW_34_in_selfOperation516); 

                    }
                    break;

            }

            pushFollow(FOLLOW_methodCall_in_selfOperation520);
            methodCall();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "selfOperation"


    // $ANTLR start "operationCondition"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:1: operationCondition : PARENTHESES_OPEN ( conditionType ( COMMA conditionType )* )? PARENTHESES_CLOSE ;
    public final void operationCondition() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:2: ( PARENTHESES_OPEN ( conditionType ( COMMA conditionType )* )? PARENTHESES_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:4: PARENTHESES_OPEN ( conditionType ( COMMA conditionType )* )? PARENTHESES_CLOSE
            {
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_operationCondition531); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:21: ( conditionType ( COMMA conditionType )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=INT && LA17_0<=STRING)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:22: conditionType ( COMMA conditionType )*
                    {
                    pushFollow(FOLLOW_conditionType_in_operationCondition534);
                    conditionType();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:36: ( COMMA conditionType )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:37: COMMA conditionType
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationCondition537); 
                    	    pushFollow(FOLLOW_conditionType_in_operationCondition539);
                    	    conditionType();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_operationCondition545); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operationCondition"


    // $ANTLR start "conditionType"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:129:1: conditionType : ( typeVsId | selfOperation );
    public final void conditionType() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:2: ( typeVsId | selfOperation )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==PARENTHESES_OPEN||LA18_1==34) ) {
                    alt18=2;
                }
                else if ( (LA18_1==COMMA||LA18_1==PARENTHESES_CLOSE) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA18_0>=INT && LA18_0<=STRING)) ) {
                alt18=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:4: typeVsId
                    {
                    pushFollow(FOLLOW_typeVsId_in_conditionType558);
                    typeVsId();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:15: selfOperation
                    {
                    pushFollow(FOLLOW_selfOperation_in_conditionType562);
                    selfOperation();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "conditionType"


    // $ANTLR start "operations"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:133:1: operations : ( id_op | if_op | while_op | for_op | in_out_op );
    public final void operations() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:2: ( id_op | if_op | while_op | for_op | in_out_op )
            int alt19=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt19=1;
                }
                break;
            case 26:
                {
                alt19=2;
                }
                break;
            case 30:
                {
                alt19=3;
                }
                break;
            case 28:
                {
                alt19=4;
                }
                break;
            case 32:
            case 33:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_operations583);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_operations587);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_operations591);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_operations595);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:41: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_operations599);
                    in_out_op();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "operations"


    // $ANTLR start "id_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:1: id_op : ( idInit | selfOperation | ( ID POSTFIXOPER ) ) EOL ;
    public final void id_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:2: ( ( idInit | selfOperation | ( ID POSTFIXOPER ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:6: ( idInit | selfOperation | ( ID POSTFIXOPER ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:6: ( idInit | selfOperation | ( ID POSTFIXOPER ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                switch ( input.LA(2) ) {
                case PARENTHESES_OPEN:
                case 34:
                    {
                    alt20=2;
                    }
                    break;
                case POSTFIXOPER:
                    {
                    alt20=3;
                    }
                    break;
                case EOL:
                case EQUAL:
                    {
                    alt20=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:7: idInit
                    {
                    pushFollow(FOLLOW_idInit_in_id_op615);
                    idInit();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:16: selfOperation
                    {
                    pushFollow(FOLLOW_selfOperation_in_id_op619);
                    selfOperation();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:32: ( ID POSTFIXOPER )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:32: ( ID POSTFIXOPER )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:33: ID POSTFIXOPER
                    {
                    match(input,ID,FOLLOW_ID_in_id_op624); 
                    match(input,POSTFIXOPER,FOLLOW_POSTFIXOPER_in_id_op626); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op630); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "id_op"


    // $ANTLR start "main_fun"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:141:1: main_fun : MAIN_NAME PARENTHESES_OPEN PARENTHESES_CLOSE functionBody ;
    public final void main_fun() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:142:3: ( MAIN_NAME PARENTHESES_OPEN PARENTHESES_CLOSE functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:142:7: MAIN_NAME PARENTHESES_OPEN PARENTHESES_CLOSE functionBody
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun647); 
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_main_fun649); 
            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_main_fun651); 
            pushFollow(FOLLOW_functionBody_in_main_fun653);
            functionBody();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "main_fun"


    // $ANTLR start "fun_decl"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:1: fun_decl : ( TYPE )? a= ID PARENTHESES_OPEN args PARENTHESES_CLOSE functionBody ;
    public final void fun_decl() throws RecognitionException {
        Token a=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:2: ( ( TYPE )? a= ID PARENTHESES_OPEN args PARENTHESES_CLOSE functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:5: ( TYPE )? a= ID PARENTHESES_OPEN args PARENTHESES_CLOSE functionBody
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:5: ( TYPE )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==TYPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:5: TYPE
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_fun_decl666); 

                    }
                    break;

            }

            a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl671); 
             ((text2_scope)text2_stack.peek()).name = (a!=null?a.getText():null); 
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_fun_decl681); 
            pushFollow(FOLLOW_args_in_fun_decl684);
            args();

            state._fsp--;

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_fun_decl686); 
            pushFollow(FOLLOW_functionBody_in_fun_decl688);
            functionBody();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "fun_decl"


    // $ANTLR start "args"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:1: args : TYPE ID ( COMMA TYPE ID )* ;
    public final void args() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:3: ( TYPE ID ( COMMA TYPE ID )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:5: TYPE ID ( COMMA TYPE ID )*
            {
            match(input,TYPE,FOLLOW_TYPE_in_args701); 
            match(input,ID,FOLLOW_ID_in_args703); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:13: ( COMMA TYPE ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:14: COMMA TYPE ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args706); 
            	    match(input,TYPE,FOLLOW_TYPE_in_args708); 
            	    match(input,ID,FOLLOW_ID_in_args710); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "args"


    // $ANTLR start "functionBody"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:1: functionBody : CURLY_OPEN ( var | operations )+ ( return_op )? CURLY_CLOSE ;
    public final void functionBody() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:2: ( CURLY_OPEN ( var | operations )+ ( return_op )? CURLY_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:7: CURLY_OPEN ( var | operations )+ ( return_op )? CURLY_CLOSE
            {
            match(input,CURLY_OPEN,FOLLOW_CURLY_OPEN_in_functionBody730); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:9: ( var | operations )+
            int cnt23=0;
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==TYPE||LA23_0==LIST) ) {
                    alt23=1;
                }
                else if ( (LA23_0==ID||LA23_0==26||LA23_0==28||LA23_0==30||(LA23_0>=32 && LA23_0<=33)) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:10: var
            	    {
            	    pushFollow(FOLLOW_var_in_functionBody741);
            	    var();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:14: operations
            	    {
            	    pushFollow(FOLLOW_operations_in_functionBody743);
            	    operations();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:158:9: ( return_op )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:158:9: return_op
                    {
                    pushFollow(FOLLOW_return_op_in_functionBody761);
                    return_op();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CURLY_CLOSE,FOLLOW_CURLY_CLOSE_in_functionBody774); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionBody"

    // Delegated rules


 

    public static final BitSet FOLLOW_text2_in_text30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_decl_in_text257 = new BitSet(new long[]{0x0000000000000152L});
    public static final BitSet FOLLOW_var_in_text268 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_text270 = new BitSet(new long[]{0x00000000000001D2L});
    public static final BitSet FOLLOW_var_in_program91 = new BitSet(new long[]{0x0000000000020152L});
    public static final BitSet FOLLOW_fun_decl_in_program94 = new BitSet(new long[]{0x0000000000020112L});
    public static final BitSet FOLLOW_main_fun_in_program97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_var116 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_idInit_in_var118 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_COMMA_in_var121 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_idInit_in_var123 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_LIST_in_var129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_methodCall_in_var131 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_var135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idInit153 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_EQUAL_in_idInit166 = new BitSet(new long[]{0x0000000000006900L});
    public static final BitSet FOLLOW_expr_in_idInit169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCall_in_idInit173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpression_in_expr188 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_MATHOPER_in_expr191 = new BitSet(new long[]{0x0000000000006900L});
    public static final BitSet FOLLOW_multExpression_in_expr193 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_typeVsId_in_multExpression212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_multExpression220 = new BitSet(new long[]{0x0000000000006900L});
    public static final BitSet FOLLOW_expr_in_multExpression222 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_multExpression224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeVsId261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeVsId265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_if_op284 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_boolCondition_in_if_op286 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_if_op288 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_if_op296 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_if_op298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_for_op313 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_for_op315 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_INT_in_for_op318 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TYPE_in_for_op321 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_for_op323 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_for_op325 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_for_op327 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_for_op331 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_for_op333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_while_op355 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_boolCondition_in_while_op357 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_while_op359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_boolCondition376 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_boolCondition380 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_boolCondition382 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_boolCondition384 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_methodCall_in_boolCondition389 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_boolCondition392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_idInBrackets407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idInBrackets409 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_idInBrackets411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_return_op430 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_return_op432 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_return_op434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_in_out_op461 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_operationCondition_in_in_out_op463 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_in_out_op466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_in_out_op477 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_idInBrackets_in_in_out_op479 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_in_out_op481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_methodCall497 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_operationCondition_in_methodCall499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_selfOperation515 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_selfOperation516 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_methodCall_in_selfOperation520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_operationCondition531 = new BitSet(new long[]{0x0000000000007100L});
    public static final BitSet FOLLOW_conditionType_in_operationCondition534 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_COMMA_in_operationCondition537 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_conditionType_in_operationCondition539 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_operationCondition545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeVsId_in_conditionType558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selfOperation_in_conditionType562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_operations583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_operations587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_operations591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_operations595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_operations599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idInit_in_id_op615 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_selfOperation_in_id_op619 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_id_op624 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIXOPER_in_id_op626 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_id_op630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun647 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_main_fun649 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_main_fun651 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_main_fun653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_fun_decl666 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_fun_decl671 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_fun_decl681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_args_in_fun_decl684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_fun_decl686 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_fun_decl688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_args701 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_args703 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_COMMA_in_args706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TYPE_in_args708 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_args710 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_CURLY_OPEN_in_functionBody730 = new BitSet(new long[]{0x00000003D4086150L});
    public static final BitSet FOLLOW_var_in_functionBody741 = new BitSet(new long[]{0x00000003D4086150L});
    public static final BitSet FOLLOW_operations_in_functionBody743 = new BitSet(new long[]{0x00000003D4086150L});
    public static final BitSet FOLLOW_return_op_in_functionBody761 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CURLY_CLOSE_in_functionBody774 = new BitSet(new long[]{0x0000000000000002L});

}