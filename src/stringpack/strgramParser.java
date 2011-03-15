// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-15 10:01:24

  package stringpack;
  import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TYPE", "COMMA", "LIST", "EOL", "ID", "EQUAL", "MATHOPER", "PARENTHESES_OPEN", "PARENTHESES_CLOSE", "INT", "STRING", "COMPROPER", "POSTFIXOPER", "MAIN_NAME", "CURLY_OPEN", "CURLY_CLOSE", "SQUARE_OPEN", "SQUARE_CLOSE", "COMMENT", "'if'", "'else'", "'for'", "'in'", "'while'", "'return'", "'out'", "'read'", "'.'"
    };
    public static final int EOF=-1;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
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
    public static final int COMMENT=22;

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



    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:11:1: program : ( var )* ( functions )* ;
    public final void program() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:2: ( ( var )* ( functions )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:5: ( var )* ( functions )*
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:5: ( var )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TYPE) ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ID) ) {
                        int LA1_4 = input.LA(3);

                        if ( (LA1_4==COMMA||LA1_4==EOL||LA1_4==EQUAL) ) {
                            alt1=1;
                        }


                    }


                }
                else if ( (LA1_0==LIST) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:5: var
            	    {
            	    pushFollow(FOLLOW_var_in_program28);
            	    var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:10: ( functions )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TYPE||LA2_0==ID||LA2_0==MAIN_NAME) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:10: functions
            	    {
            	    pushFollow(FOLLOW_functions_in_program31);
            	    functions();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "program"


    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:15:1: var : ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) ) EOL ;
    public final void var() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:2: ( ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:5: ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:5: ( ( TYPE idInit ( COMMA idInit )* ) | ( LIST methodCall ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TYPE) ) {
                alt4=1;
            }
            else if ( (LA4_0==LIST) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:6: ( TYPE idInit ( COMMA idInit )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:6: ( TYPE idInit ( COMMA idInit )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:7: TYPE idInit ( COMMA idInit )*
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_var50); 
                    pushFollow(FOLLOW_idInit_in_var52);
                    idInit();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:19: ( COMMA idInit )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==COMMA) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:20: COMMA idInit
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var55); 
                    	    pushFollow(FOLLOW_idInit_in_var57);
                    	    idInit();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:36: ( LIST methodCall )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:36: ( LIST methodCall )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:37: LIST methodCall
                    {
                    match(input,LIST,FOLLOW_LIST_in_var63); 
                    pushFollow(FOLLOW_methodCall_in_var65);
                    methodCall();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var69); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:19:1: idInit : ID ( EQUAL ( expr | methodCall ) )? ;
    public final void idInit() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:2: ( ID ( EQUAL ( expr | methodCall ) )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:4: ID ( EQUAL ( expr | methodCall ) )?
            {
            match(input,ID,FOLLOW_ID_in_idInit86); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:7: ( EQUAL ( expr | methodCall ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EQUAL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:8: EQUAL ( expr | methodCall )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_idInit89); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:14: ( expr | methodCall )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==COMMA||LA5_1==EOL||LA5_1==MATHOPER) ) {
                            alt5=1;
                        }
                        else if ( (LA5_1==PARENTHESES_OPEN) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_0==PARENTHESES_OPEN||(LA5_0>=INT && LA5_0<=STRING)) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:15: expr
                            {
                            pushFollow(FOLLOW_expr_in_idInit92);
                            expr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:22: methodCall
                            {
                            pushFollow(FOLLOW_methodCall_in_idInit96);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:23:1: expr : multExpression ( MATHOPER multExpression )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:24:3: ( multExpression ( MATHOPER multExpression )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:24:5: multExpression ( MATHOPER multExpression )*
            {
            pushFollow(FOLLOW_multExpression_in_expr111);
            multExpression();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:24:20: ( MATHOPER multExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MATHOPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:24:21: MATHOPER multExpression
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr114); 
            	    pushFollow(FOLLOW_multExpression_in_expr116);
            	    multExpression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:27:1: multExpression : ( typeVsId | PARENTHESES_OPEN expr PARENTHESES_CLOSE );
    public final void multExpression() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:28:3: ( typeVsId | PARENTHESES_OPEN expr PARENTHESES_CLOSE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||(LA8_0>=INT && LA8_0<=STRING)) ) {
                alt8=1;
            }
            else if ( (LA8_0==PARENTHESES_OPEN) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:28:5: typeVsId
                    {
                    pushFollow(FOLLOW_typeVsId_in_multExpression133);
                    typeVsId();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:29:5: PARENTHESES_OPEN expr PARENTHESES_CLOSE
                    {
                    match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_multExpression139); 
                    pushFollow(FOLLOW_expr_in_multExpression141);
                    expr();

                    state._fsp--;

                    match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_multExpression143); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:32:1: type : ( INT | STRING );
    public final void type() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:33:5: ( INT | STRING )
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:36:1: typeVsId : ( ID | type );
    public final void typeVsId() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:37:3: ( ID | type )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=INT && LA9_0<=STRING)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:37:5: ID
                    {
                    match(input,ID,FOLLOW_ID_in_typeVsId180); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:37:10: type
                    {
                    pushFollow(FOLLOW_type_in_typeVsId184);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:41:1: if_op : 'if' boolCondition functionBody 'else' functionBody ;
    public final void if_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:42:2: ( 'if' boolCondition functionBody 'else' functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:42:5: 'if' boolCondition functionBody 'else' functionBody
            {
            match(input,23,FOLLOW_23_in_if_op203); 
            pushFollow(FOLLOW_boolCondition_in_if_op205);
            boolCondition();

            state._fsp--;

            pushFollow(FOLLOW_functionBody_in_if_op207);
            functionBody();

            state._fsp--;

            match(input,24,FOLLOW_24_in_if_op218); 
            pushFollow(FOLLOW_functionBody_in_if_op220);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:46:1: for_op : 'for' PARENTHESES_OPEN ( INT | ( TYPE ID 'in' ID ) ) PARENTHESES_CLOSE functionBody ;
    public final void for_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:2: ( 'for' PARENTHESES_OPEN ( INT | ( TYPE ID 'in' ID ) ) PARENTHESES_CLOSE functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:5: 'for' PARENTHESES_OPEN ( INT | ( TYPE ID 'in' ID ) ) PARENTHESES_CLOSE functionBody
            {
            match(input,25,FOLLOW_25_in_for_op241); 
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_for_op243); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:28: ( INT | ( TYPE ID 'in' ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==TYPE) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:29: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op246); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:33: ( TYPE ID 'in' ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:33: ( TYPE ID 'in' ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:34: TYPE ID 'in' ID
                    {
                    match(input,TYPE,FOLLOW_TYPE_in_for_op249); 
                    match(input,ID,FOLLOW_ID_in_for_op251); 
                    match(input,26,FOLLOW_26_in_for_op253); 
                    match(input,ID,FOLLOW_ID_in_for_op255); 

                    }


                    }
                    break;

            }

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_for_op259); 
            pushFollow(FOLLOW_functionBody_in_for_op261);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:50:1: while_op : 'while' boolCondition functionBody ;
    public final void while_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:51:2: ( 'while' boolCondition functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:51:5: 'while' boolCondition functionBody
            {
            match(input,27,FOLLOW_27_in_while_op286); 
            pushFollow(FOLLOW_boolCondition_in_while_op288);
            boolCondition();

            state._fsp--;

            pushFollow(FOLLOW_functionBody_in_while_op290);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:54:1: boolCondition : PARENTHESES_OPEN ( ( ID COMPROPER ID ) | methodCall ) PARENTHESES_CLOSE ;
    public final void boolCondition() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:2: ( PARENTHESES_OPEN ( ( ID COMPROPER ID ) | methodCall ) PARENTHESES_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:4: PARENTHESES_OPEN ( ( ID COMPROPER ID ) | methodCall ) PARENTHESES_CLOSE
            {
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_boolCondition309); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:21: ( ( ID COMPROPER ID ) | methodCall )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==COMPROPER) ) {
                    alt11=1;
                }
                else if ( (LA11_1==PARENTHESES_OPEN) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:22: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:22: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:23: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_boolCondition313); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_boolCondition315); 
                    match(input,ID,FOLLOW_ID_in_boolCondition317); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:42: methodCall
                    {
                    pushFollow(FOLLOW_methodCall_in_boolCondition322);
                    methodCall();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_boolCondition325); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:58:1: idInBrackets : PARENTHESES_OPEN ID PARENTHESES_CLOSE ;
    public final void idInBrackets() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:59:2: ( PARENTHESES_OPEN ID PARENTHESES_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:59:4: PARENTHESES_OPEN ID PARENTHESES_CLOSE
            {
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_idInBrackets337); 
            match(input,ID,FOLLOW_ID_in_idInBrackets339); 
            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_idInBrackets341); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:62:1: return_op : 'return' ID EOL ;
    public final void return_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:63:2: ( 'return' ID EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:63:5: 'return' ID EOL
            {
            match(input,28,FOLLOW_28_in_return_op360); 
            match(input,ID,FOLLOW_ID_in_return_op362); 
            match(input,EOL,FOLLOW_EOL_in_return_op364); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:67:1: in_out_op : ( ( 'out' operationCondition EOL ) | ( 'read' idInBrackets EOL ) );
    public final void in_out_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:68:2: ( ( 'out' operationCondition EOL ) | ( 'read' idInBrackets EOL ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            else if ( (LA12_0==30) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:68:5: ( 'out' operationCondition EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:68:5: ( 'out' operationCondition EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:68:6: 'out' operationCondition EOL
                    {
                    match(input,29,FOLLOW_29_in_in_out_op391); 
                    pushFollow(FOLLOW_operationCondition_in_in_out_op393);
                    operationCondition();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op396); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:3: ( 'read' idInBrackets EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:3: ( 'read' idInBrackets EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:4: 'read' idInBrackets EOL
                    {
                    match(input,30,FOLLOW_30_in_in_out_op405); 
                    pushFollow(FOLLOW_idInBrackets_in_in_out_op407);
                    idInBrackets();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op409); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:1: methodCall : ID operationCondition ;
    public final void methodCall() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:73:2: ( ID operationCondition )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:73:4: ID operationCondition
            {
            match(input,ID,FOLLOW_ID_in_methodCall428); 
            pushFollow(FOLLOW_operationCondition_in_methodCall430);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:1: selfOperation : ( ID '.' )? methodCall ;
    public final void selfOperation() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:77:2: ( ( ID '.' )? methodCall )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:77:4: ( ID '.' )? methodCall
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:77:4: ( ID '.' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==31) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:77:5: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_selfOperation443); 
                    match(input,31,FOLLOW_31_in_selfOperation444); 

                    }
                    break;

            }

            pushFollow(FOLLOW_methodCall_in_selfOperation448);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:80:1: operationCondition : PARENTHESES_OPEN ( conditionType ( COMMA conditionType )* )? PARENTHESES_CLOSE ;
    public final void operationCondition() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:2: ( PARENTHESES_OPEN ( conditionType ( COMMA conditionType )* )? PARENTHESES_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:4: PARENTHESES_OPEN ( conditionType ( COMMA conditionType )* )? PARENTHESES_CLOSE
            {
            match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_operationCondition459); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:21: ( conditionType ( COMMA conditionType )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID||(LA15_0>=INT && LA15_0<=STRING)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:22: conditionType ( COMMA conditionType )*
                    {
                    pushFollow(FOLLOW_conditionType_in_operationCondition462);
                    conditionType();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:36: ( COMMA conditionType )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:37: COMMA conditionType
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_operationCondition465); 
                    	    pushFollow(FOLLOW_conditionType_in_operationCondition467);
                    	    conditionType();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_operationCondition473); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:84:1: conditionType : ( typeVsId | selfOperation );
    public final void conditionType() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:85:2: ( typeVsId | selfOperation )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==PARENTHESES_OPEN||LA16_1==31) ) {
                    alt16=2;
                }
                else if ( (LA16_1==COMMA||LA16_1==PARENTHESES_CLOSE) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA16_0>=INT && LA16_0<=STRING)) ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:85:4: typeVsId
                    {
                    pushFollow(FOLLOW_typeVsId_in_conditionType486);
                    typeVsId();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:85:15: selfOperation
                    {
                    pushFollow(FOLLOW_selfOperation_in_conditionType490);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:88:1: operations : ( id_op | if_op | while_op | for_op | in_out_op );
    public final void operations() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:2: ( id_op | if_op | while_op | for_op | in_out_op )
            int alt17=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt17=1;
                }
                break;
            case 23:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 25:
                {
                alt17=4;
                }
                break;
            case 29:
            case 30:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_operations511);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_operations515);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_operations519);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_operations523);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:41: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_operations527);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:1: id_op : ( idInit | selfOperation | ( ID POSTFIXOPER ) ) EOL ;
    public final void id_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:2: ( ( idInit | selfOperation | ( ID POSTFIXOPER ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:6: ( idInit | selfOperation | ( ID POSTFIXOPER ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:6: ( idInit | selfOperation | ( ID POSTFIXOPER ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                switch ( input.LA(2) ) {
                case PARENTHESES_OPEN:
                case 31:
                    {
                    alt18=2;
                    }
                    break;
                case POSTFIXOPER:
                    {
                    alt18=3;
                    }
                    break;
                case EOL:
                case EQUAL:
                    {
                    alt18=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:7: idInit
                    {
                    pushFollow(FOLLOW_idInit_in_id_op543);
                    idInit();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:16: selfOperation
                    {
                    pushFollow(FOLLOW_selfOperation_in_id_op547);
                    selfOperation();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:32: ( ID POSTFIXOPER )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:32: ( ID POSTFIXOPER )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:33: ID POSTFIXOPER
                    {
                    match(input,ID,FOLLOW_ID_in_id_op552); 
                    match(input,POSTFIXOPER,FOLLOW_POSTFIXOPER_in_id_op554); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op558); 

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


    // $ANTLR start "functions"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:1: functions : ( ( MAIN_NAME PARENTHESES_OPEN ) | ( ( TYPE )? ID PARENTHESES_OPEN TYPE ID ( COMMA TYPE ID )* ) ) PARENTHESES_CLOSE functionBody ;
    public final void functions() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:2: ( ( ( MAIN_NAME PARENTHESES_OPEN ) | ( ( TYPE )? ID PARENTHESES_OPEN TYPE ID ( COMMA TYPE ID )* ) ) PARENTHESES_CLOSE functionBody )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:5: ( ( MAIN_NAME PARENTHESES_OPEN ) | ( ( TYPE )? ID PARENTHESES_OPEN TYPE ID ( COMMA TYPE ID )* ) ) PARENTHESES_CLOSE functionBody
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:5: ( ( MAIN_NAME PARENTHESES_OPEN ) | ( ( TYPE )? ID PARENTHESES_OPEN TYPE ID ( COMMA TYPE ID )* ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==MAIN_NAME) ) {
                alt21=1;
            }
            else if ( (LA21_0==TYPE||LA21_0==ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:6: ( MAIN_NAME PARENTHESES_OPEN )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:6: ( MAIN_NAME PARENTHESES_OPEN )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:7: MAIN_NAME PARENTHESES_OPEN
                    {
                    match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_functions576); 
                    match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_functions578); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:35: ( ( TYPE )? ID PARENTHESES_OPEN TYPE ID ( COMMA TYPE ID )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:35: ( ( TYPE )? ID PARENTHESES_OPEN TYPE ID ( COMMA TYPE ID )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:36: ( TYPE )? ID PARENTHESES_OPEN TYPE ID ( COMMA TYPE ID )*
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:36: ( TYPE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==TYPE) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:36: TYPE
                            {
                            match(input,TYPE,FOLLOW_TYPE_in_functions582); 

                            }
                            break;

                    }

                    match(input,ID,FOLLOW_ID_in_functions585); 
                    match(input,PARENTHESES_OPEN,FOLLOW_PARENTHESES_OPEN_in_functions587); 
                    match(input,TYPE,FOLLOW_TYPE_in_functions589); 
                    match(input,ID,FOLLOW_ID_in_functions591); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:70: ( COMMA TYPE ID )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:71: COMMA TYPE ID
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_functions594); 
                    	    match(input,TYPE,FOLLOW_TYPE_in_functions596); 
                    	    match(input,ID,FOLLOW_ID_in_functions598); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            match(input,PARENTHESES_CLOSE,FOLLOW_PARENTHESES_CLOSE_in_functions605); 
            pushFollow(FOLLOW_functionBody_in_functions610);
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
    // $ANTLR end "functions"


    // $ANTLR start "functionBody"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:101:1: functionBody : CURLY_OPEN ( var | operations )+ ( return_op )? CURLY_CLOSE ;
    public final void functionBody() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:102:2: ( CURLY_OPEN ( var | operations )+ ( return_op )? CURLY_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:102:7: CURLY_OPEN ( var | operations )+ ( return_op )? CURLY_CLOSE
            {
            match(input,CURLY_OPEN,FOLLOW_CURLY_OPEN_in_functionBody628); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:5: ( var | operations )+
            int cnt22=0;
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==TYPE||LA22_0==LIST) ) {
                    alt22=1;
                }
                else if ( (LA22_0==ID||LA22_0==23||LA22_0==25||LA22_0==27||(LA22_0>=29 && LA22_0<=30)) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:6: var
            	    {
            	    pushFollow(FOLLOW_var_in_functionBody635);
            	    var();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:10: operations
            	    {
            	    pushFollow(FOLLOW_operations_in_functionBody637);
            	    operations();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:4: ( return_op )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:4: return_op
                    {
                    pushFollow(FOLLOW_return_op_in_functionBody650);
                    return_op();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CURLY_CLOSE,FOLLOW_CURLY_CLOSE_in_functionBody663); 

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


 

    public static final BitSet FOLLOW_var_in_program28 = new BitSet(new long[]{0x0000000000020152L});
    public static final BitSet FOLLOW_functions_in_program31 = new BitSet(new long[]{0x0000000000020112L});
    public static final BitSet FOLLOW_TYPE_in_var50 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_idInit_in_var52 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_COMMA_in_var55 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_idInit_in_var57 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_LIST_in_var63 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_methodCall_in_var65 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_var69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_idInit86 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_EQUAL_in_idInit89 = new BitSet(new long[]{0x0000000000006900L});
    public static final BitSet FOLLOW_expr_in_idInit92 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_methodCall_in_idInit96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpression_in_expr111 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_MATHOPER_in_expr114 = new BitSet(new long[]{0x0000000000006900L});
    public static final BitSet FOLLOW_multExpression_in_expr116 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_typeVsId_in_multExpression133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_multExpression139 = new BitSet(new long[]{0x0000000000006900L});
    public static final BitSet FOLLOW_expr_in_multExpression141 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_multExpression143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_typeVsId180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeVsId184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_if_op203 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_boolCondition_in_if_op205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_if_op207 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_if_op218 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_if_op220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_for_op241 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_for_op243 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_INT_in_for_op246 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TYPE_in_for_op249 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_for_op251 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_for_op253 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_for_op255 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_for_op259 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_for_op261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_while_op286 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_boolCondition_in_while_op288 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_while_op290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_boolCondition309 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_boolCondition313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_boolCondition315 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_boolCondition317 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_methodCall_in_boolCondition322 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_boolCondition325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_idInBrackets337 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_idInBrackets339 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_idInBrackets341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_return_op360 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_return_op362 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_return_op364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_in_out_op391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_operationCondition_in_in_out_op393 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_in_out_op396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_in_out_op405 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_idInBrackets_in_in_out_op407 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_in_out_op409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_methodCall428 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_operationCondition_in_methodCall430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_selfOperation443 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_selfOperation444 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_methodCall_in_selfOperation448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_operationCondition459 = new BitSet(new long[]{0x0000000000007100L});
    public static final BitSet FOLLOW_conditionType_in_operationCondition462 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_COMMA_in_operationCondition465 = new BitSet(new long[]{0x0000000000006100L});
    public static final BitSet FOLLOW_conditionType_in_operationCondition467 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_operationCondition473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeVsId_in_conditionType486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selfOperation_in_conditionType490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_operations511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_operations515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_operations519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_operations523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_operations527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idInit_in_id_op543 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_selfOperation_in_id_op547 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_id_op552 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIXOPER_in_id_op554 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_id_op558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_functions576 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_functions578 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TYPE_in_functions582 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_functions585 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PARENTHESES_OPEN_in_functions587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TYPE_in_functions589 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_functions591 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_COMMA_in_functions594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_TYPE_in_functions596 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_functions598 = new BitSet(new long[]{0x0000000000001020L});
    public static final BitSet FOLLOW_PARENTHESES_CLOSE_in_functions605 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_functionBody_in_functions610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CURLY_OPEN_in_functionBody628 = new BitSet(new long[]{0x000000007A8A6150L});
    public static final BitSet FOLLOW_var_in_functionBody635 = new BitSet(new long[]{0x000000007A8A6150L});
    public static final BitSet FOLLOW_operations_in_functionBody637 = new BitSet(new long[]{0x000000007A8A6150L});
    public static final BitSet FOLLOW_return_op_in_functionBody650 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CURLY_CLOSE_in_functionBody663 = new BitSet(new long[]{0x0000000000000002L});

}