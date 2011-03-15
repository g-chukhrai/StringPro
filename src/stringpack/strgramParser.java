// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-15 12:58:49

  package stringpack;
  import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "LIST", "EOL", "ID", "EQUAL", "MATHOPER", "PAR_OPEN", "PAR_CLOSE", "INT", "STRING", "CHAR", "COMPROPER", "POSTFIX", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'if'", "'else'", "'for'", "'in'", "'while'", "'return'", "'out'", "'read'", "'.'", "'Int'", "'String'", "'Char'"
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
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int COMMA=4;
    public static final int LIST=5;
    public static final int EOL=6;
    public static final int ID=7;
    public static final int EQUAL=8;
    public static final int MATHOPER=9;
    public static final int PAR_OPEN=10;
    public static final int PAR_CLOSE=11;
    public static final int INT=12;
    public static final int STRING=13;
    public static final int CHAR=14;
    public static final int COMPROPER=15;
    public static final int POSTFIX=16;
    public static final int MAIN_NAME=17;
    public static final int CUR_OPEN=18;
    public static final int CUR_CLOSE=19;
    public static final int SQ_OPEN=20;
    public static final int SQ_CLOSE=21;
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
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        strgramLexer lex = new strgramLexer(input);
        strgramParser parser = new strgramParser(new CommonTokenStream(lex));
        parser.mtext();
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



    // $ANTLR start "mtext"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:36:1: mtext : text ;
    public final void mtext() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:36:7: ( text )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:36:9: text
            {
            pushFollow(FOLLOW_text_in_mtext31);
            text();

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
    // $ANTLR end "mtext"

    protected static class text_scope {
        String name;
    }
    protected Stack text_stack = new Stack();

    public static class text_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "text"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:38:1: text : ( fun_decl | var )+ ;
    public final strgramParser.text_return text() throws RecognitionException {
        text_stack.push(new text_scope());
        strgramParser.text_return retval = new strgramParser.text_return();
        retval.start = input.LT(1);

        input.toString(retval.start,input.LT(-1))::name = "";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:3: ( ( fun_decl | var )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:5: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:5: ( fun_decl | var )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( (LA1_7==COMMA||LA1_7==EOL||LA1_7==EQUAL) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case 36:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( (LA1_7==COMMA||LA1_7==EOL||LA1_7==EQUAL) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case 37:
                    {
                    int LA1_4 = input.LA(2);

                    if ( (LA1_4==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( (LA1_7==COMMA||LA1_7==EOL||LA1_7==EQUAL) ) {
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
            	    pushFollow(FOLLOW_fun_decl_in_text53);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:7: var
            	    {
            	    input.toString(retval.start,input.LT(-1))::name = "";
            	    pushFollow(FOLLOW_var_in_text64);
            	    var();

            	    state._fsp--;


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

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            text_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "text"


    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:48:1: program : ( var )* ( fun_decl )* ;
    public final void program() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:2: ( ( var )* ( fun_decl )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:6: ( var )* ( fun_decl )*
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:6: ( var )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==ID) ) {
                        int LA2_6 = input.LA(3);

                        if ( (LA2_6==COMMA||LA2_6==EOL||LA2_6==EQUAL) ) {
                            alt2=1;
                        }


                    }


                    }
                    break;
                case 36:
                    {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==ID) ) {
                        int LA2_6 = input.LA(3);

                        if ( (LA2_6==COMMA||LA2_6==EOL||LA2_6==EQUAL) ) {
                            alt2=1;
                        }


                    }


                    }
                    break;
                case 37:
                    {
                    int LA2_3 = input.LA(2);

                    if ( (LA2_3==ID) ) {
                        int LA2_6 = input.LA(3);

                        if ( (LA2_6==COMMA||LA2_6==EOL||LA2_6==EQUAL) ) {
                            alt2=1;
                        }


                    }


                    }
                    break;
                case LIST:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:6: var
            	    {
            	    pushFollow(FOLLOW_var_in_program86);
            	    var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:11: ( fun_decl )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||(LA3_0>=35 && LA3_0<=37)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:11: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program89);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:52:1: var : ( ( types id_init ( COMMA id_init )* ) | ( LIST fun_call ) ) EOL ;
    public final void var() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:2: ( ( ( types id_init ( COMMA id_init )* ) | ( LIST fun_call ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:5: ( ( types id_init ( COMMA id_init )* ) | ( LIST fun_call ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:5: ( ( types id_init ( COMMA id_init )* ) | ( LIST fun_call ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=35 && LA5_0<=37)) ) {
                alt5=1;
            }
            else if ( (LA5_0==LIST) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:6: ( types id_init ( COMMA id_init )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:6: ( types id_init ( COMMA id_init )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:7: types id_init ( COMMA id_init )*
                    {
                    pushFollow(FOLLOW_types_in_var109);
                    types();

                    state._fsp--;

                    pushFollow(FOLLOW_id_init_in_var111);
                    id_init();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:21: ( COMMA id_init )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:22: COMMA id_init
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var114); 
                    	    pushFollow(FOLLOW_id_init_in_var116);
                    	    id_init();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:39: ( LIST fun_call )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:39: ( LIST fun_call )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:40: LIST fun_call
                    {
                    match(input,LIST,FOLLOW_LIST_in_var122); 
                    pushFollow(FOLLOW_fun_call_in_var124);
                    fun_call();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var128); 

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

    public static class id_init_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "id_init"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:56:1: id_init : ID ( EQUAL ( expr | fun_call ) )? ;
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token ID1=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:2: ( ID ( EQUAL ( expr | fun_call ) )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:5: ID ( EQUAL ( expr | fun_call ) )?
            {
            ID1=(Token)match(input,ID,FOLLOW_ID_in_id_init143); 

            		    if (names.isExist(input.toString(retval.start,input.LT(-1))::name + "." + (ID1!=null?ID1.getText():null))) {
            		      errors.add("line "+(ID1!=null?ID1.getLine():0)+": name "+(ID1!=null?ID1.getText():null)+" duplicated");
            		    } else {
            		      names.add(names.new Name(input.toString(retval.start,input.LT(-1))::name + "." + (ID1!=null?ID1.getText():null), $types.idType, (ID1!=null?ID1.getLine():0)));
            		    }
            		    if (names.isExist(input.toString(retval.start,input.LT(-1))::name + "." + (ID1!=null?ID1.getText():null))) {
            		      names.get(input.toString(retval.start,input.LT(-1))::name + "." + (ID1!=null?ID1.getText():null)).addLineUses((ID1!=null?ID1.getLine():0));
            		    } else {
            		      errors.add("line "+(ID1!=null?ID1.getLine():0)+": name "+(ID1!=null?ID1.getText():null)+" cannot be resolved");
            		    }  		     
            		  
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:4: ( EQUAL ( expr | fun_call ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EQUAL) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:5: EQUAL ( expr | fun_call )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init156); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:11: ( expr | fun_call )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ID) ) {
                        int LA6_1 = input.LA(2);

                        if ( (LA6_1==COMMA||LA6_1==EOL||LA6_1==MATHOPER) ) {
                            alt6=1;
                        }
                        else if ( (LA6_1==PAR_OPEN) ) {
                            alt6=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_0==PAR_OPEN||(LA6_0>=INT && LA6_0<=CHAR)) ) {
                        alt6=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_id_init159);
                            expr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:19: fun_call
                            {
                            pushFollow(FOLLOW_fun_call_in_id_init163);
                            fun_call();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id_init"


    // $ANTLR start "expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:73:1: expr : math_exp ( MATHOPER math_exp )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:74:3: ( math_exp ( MATHOPER math_exp )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:74:7: math_exp ( MATHOPER math_exp )*
            {
            pushFollow(FOLLOW_math_exp_in_expr180);
            math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:74:16: ( MATHOPER math_exp )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==MATHOPER) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:74:17: MATHOPER math_exp
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr183); 
            	    pushFollow(FOLLOW_math_exp_in_expr185);
            	    math_exp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "math_exp"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:77:1: math_exp : ( type_id | PAR_OPEN expr PAR_CLOSE );
    public final void math_exp() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:78:3: ( type_id | PAR_OPEN expr PAR_CLOSE )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID||(LA9_0>=INT && LA9_0<=CHAR)) ) {
                alt9=1;
            }
            else if ( (LA9_0==PAR_OPEN) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:78:7: type_id
                    {
                    pushFollow(FOLLOW_type_id_in_math_exp204);
                    type_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:7: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp212); 
                    pushFollow(FOLLOW_expr_in_math_exp214);
                    expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp216); 

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
    // $ANTLR end "math_exp"


    // $ANTLR start "type"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:82:1: type : ( INT | STRING | CHAR );
    public final void type() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:83:3: ( INT | STRING | CHAR )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:
            {
            if ( (input.LA(1)>=INT && input.LA(1)<=CHAR) ) {
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


    // $ANTLR start "type_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:86:1: type_id : ( ID | type );
    public final void type_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:3: ( ID | type )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=INT && LA10_0<=CHAR)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:7: ID
                    {
                    match(input,ID,FOLLOW_ID_in_type_id259); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:12: type
                    {
                    pushFollow(FOLLOW_type_in_type_id263);
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
    // $ANTLR end "type_id"


    // $ANTLR start "if_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:90:1: if_op : 'if' bool_cond fun_body 'else' fun_body ;
    public final void if_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:91:2: ( 'if' bool_cond fun_body 'else' fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:91:5: 'if' bool_cond fun_body 'else' fun_body
            {
            match(input,26,FOLLOW_26_in_if_op281); 
            pushFollow(FOLLOW_bool_cond_in_if_op283);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op285);
            fun_body();

            state._fsp--;

            match(input,27,FOLLOW_27_in_if_op293); 
            pushFollow(FOLLOW_fun_body_in_if_op295);
            fun_body();

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

    public static class for_op_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "for_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:95:1: for_op : 'for' PAR_OPEN ( INT | ( types a= ID 'in' b= ID ) ) PAR_CLOSE fun_body ;
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:2: ( 'for' PAR_OPEN ( INT | ( types a= ID 'in' b= ID ) ) PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:5: 'for' PAR_OPEN ( INT | ( types a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,28,FOLLOW_28_in_for_op310); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op312); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:20: ( INT | ( types a= ID 'in' b= ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==INT) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=35 && LA11_0<=37)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:21: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op315); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:25: ( types a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:25: ( types a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:26: types a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_types_in_for_op318);
                    types();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op322); 
                    match(input,29,FOLLOW_29_in_for_op324); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op328); 

                    }


                    }
                    break;

            }


                if (! names.isExist(input.toString(retval.start,input.LT(-1))::name + "." + (a!=null?a.getText():null))) {
                  errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" cannot be resolved");
                } else {
                  names.get(input.toString(retval.start,input.LT(-1))::name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                }
                if (! names.isExist(input.toString(retval.start,input.LT(-1))::name + "." + (b!=null?b.getText():null))) {
                  errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                } else {
                  names.get(input.toString(retval.start,input.LT(-1))::name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                }
              
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op339); 
            pushFollow(FOLLOW_fun_body_in_for_op341);
            fun_body();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "for_op"


    // $ANTLR start "while_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:112:1: while_op : 'while' bool_cond fun_body ;
    public final void while_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:113:2: ( 'while' bool_cond fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:113:5: 'while' bool_cond fun_body
            {
            match(input,30,FOLLOW_30_in_while_op363); 
            pushFollow(FOLLOW_bool_cond_in_while_op365);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op367);
            fun_body();

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


    // $ANTLR start "bool_cond"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:116:1: bool_cond : PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE ;
    public final void bool_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:2: ( PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:7: PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond383); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:16: ( ( ID COMPROPER ID ) | fun_call )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==COMPROPER) ) {
                    alt12=1;
                }
                else if ( (LA12_1==PAR_OPEN) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:17: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:17: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:18: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_bool_cond387); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond389); 
                    match(input,ID,FOLLOW_ID_in_bool_cond391); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:37: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond396);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond399); 

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
    // $ANTLR end "bool_cond"


    // $ANTLR start "brack_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:120:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final void brack_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:2: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:7: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id414); 
            match(input,ID,FOLLOW_ID_in_brack_id416); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id418); 

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
    // $ANTLR end "brack_id"


    // $ANTLR start "return_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:124:1: return_op : 'return' ID EOL ;
    public final void return_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:2: ( 'return' ID EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:5: 'return' ID EOL
            {
            match(input,31,FOLLOW_31_in_return_op437); 
            match(input,ID,FOLLOW_ID_in_return_op439); 
            match(input,EOL,FOLLOW_EOL_in_return_op441); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:129:1: in_out_op : ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) );
    public final void in_out_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:2: ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            else if ( (LA13_0==33) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:5: ( 'out' op_cond EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:5: ( 'out' op_cond EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:6: 'out' op_cond EOL
                    {
                    match(input,32,FOLLOW_32_in_in_out_op468); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op470);
                    op_cond();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op473); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:131:5: ( 'read' brack_id EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:131:5: ( 'read' brack_id EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:131:6: 'read' brack_id EOL
                    {
                    match(input,33,FOLLOW_33_in_in_out_op484); 
                    pushFollow(FOLLOW_brack_id_in_in_out_op486);
                    brack_id();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op488); 

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


    // $ANTLR start "fun_call"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:1: fun_call : ID op_cond ;
    public final void fun_call() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:2: ( ID op_cond )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:7: ID op_cond
            {
            match(input,ID,FOLLOW_ID_in_fun_call504); 
            pushFollow(FOLLOW_op_cond_in_fun_call506);
            op_cond();

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
    // $ANTLR end "fun_call"


    // $ANTLR start "self_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:1: self_op : ( ID '.' )? fun_call ;
    public final void self_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:2: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:7: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:7: ( ID '.' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==34) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op521); 
                    match(input,34,FOLLOW_34_in_self_op522); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op526);
            fun_call();

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
    // $ANTLR end "self_op"


    // $ANTLR start "op_cond"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:142:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final void op_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:2: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:4: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond537); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:13: ( cond_arg ( COMMA cond_arg )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||(LA16_0>=INT && LA16_0<=CHAR)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:14: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond540);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:23: ( COMMA cond_arg )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:24: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond543); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond545);
                    	    cond_arg();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond551); 

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
    // $ANTLR end "op_cond"


    // $ANTLR start "cond_arg"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:1: cond_arg : ( type_id | self_op );
    public final void cond_arg() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:2: ( type_id | self_op )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==PAR_OPEN||LA17_1==34) ) {
                    alt17=2;
                }
                else if ( (LA17_1==COMMA||LA17_1==PAR_CLOSE) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA17_0>=INT && LA17_0<=CHAR)) ) {
                alt17=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:4: type_id
                    {
                    pushFollow(FOLLOW_type_id_in_cond_arg563);
                    type_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:14: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg567);
                    self_op();

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
    // $ANTLR end "cond_arg"


    // $ANTLR start "ops"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:150:1: ops : ( id_op | if_op | while_op | for_op | in_out_op );
    public final void ops() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:2: ( id_op | if_op | while_op | for_op | in_out_op )
            int alt18=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt18=1;
                }
                break;
            case 26:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 28:
                {
                alt18=4;
                }
                break;
            case 32:
            case 33:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops588);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops592);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops596);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops600);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:41: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_ops604);
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
    // $ANTLR end "ops"


    // $ANTLR start "id_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:154:1: id_op : ( id_init | self_op | ( ID POSTFIX ) ) EOL ;
    public final void id_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:2: ( ( id_init | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:6: ( id_init | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:6: ( id_init | self_op | ( ID POSTFIX ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                switch ( input.LA(2) ) {
                case PAR_OPEN:
                case 34:
                    {
                    alt19=2;
                    }
                    break;
                case POSTFIX:
                    {
                    alt19=3;
                    }
                    break;
                case EOL:
                case EQUAL:
                    {
                    alt19=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:7: id_init
                    {
                    pushFollow(FOLLOW_id_init_in_id_op620);
                    id_init();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:17: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op624);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:27: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:27: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:28: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op629); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op631); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op635); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:158:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final void main_fun() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:159:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:159:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun652); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun654); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun656); 
            pushFollow(FOLLOW_fun_body_in_main_fun658);
            fun_body();

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

    public static class fun_decl_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "fun_decl"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:1: fun_decl : ( types )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body ;
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        strgramParser.fun_decl_return retval = new strgramParser.fun_decl_return();
        retval.start = input.LT(1);

        Token ID2=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:2: ( ( types )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:5: ( types )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:5: ( types )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=35 && LA20_0<=37)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:5: types
                    {
                    pushFollow(FOLLOW_types_in_fun_decl671);
                    types();

                    state._fsp--;


                    }
                    break;

            }

            ID2=(Token)match(input,ID,FOLLOW_ID_in_fun_decl674); 
             input.toString(retval.start,input.LT(-1))::name = (ID2!=null?ID2.getText():null); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl684); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:13: ( args )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=35 && LA21_0<=37)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:13: args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl687);
                    args();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl690); 
            pushFollow(FOLLOW_fun_body_in_fun_decl692);
            fun_body();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fun_decl"


    // $ANTLR start "args"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:1: args : types ID ( COMMA types ID )* ;
    public final void args() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:3: ( types ID ( COMMA types ID )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:5: types ID ( COMMA types ID )*
            {
            pushFollow(FOLLOW_types_in_args705);
            types();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_args707); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:14: ( COMMA types ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:15: COMMA types ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args710); 
            	    pushFollow(FOLLOW_types_in_args712);
            	    types();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args714); 

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


    // $ANTLR start "fun_body"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:1: fun_body : CUR_OPEN ( var | ops )+ ( return_op )? CUR_CLOSE ;
    public final void fun_body() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:2: ( CUR_OPEN ( var | ops )+ ( return_op )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:7: CUR_OPEN ( var | ops )+ ( return_op )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body733); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:9: ( var | ops )+
            int cnt23=0;
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==LIST||(LA23_0>=35 && LA23_0<=37)) ) {
                    alt23=1;
                }
                else if ( (LA23_0==ID||LA23_0==26||LA23_0==28||LA23_0==30||(LA23_0>=32 && LA23_0<=33)) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:10: var
            	    {
            	    pushFollow(FOLLOW_var_in_fun_body744);
            	    var();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:14: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body746);
            	    ops();

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

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:9: ( return_op )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:9: return_op
                    {
                    pushFollow(FOLLOW_return_op_in_fun_body764);
                    return_op();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body777); 

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
    // $ANTLR end "fun_body"


    // $ANTLR start "types"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:1: types returns [String idType] : ( 'Int' | 'String' | 'Char' );
    public final String types() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:192:2: ( 'Int' | 'String' | 'Char' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt25=1;
                }
                break;
            case 36:
                {
                alt25=2;
                }
                break;
            case 37:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:192:6: 'Int'
                    {
                    match(input,35,FOLLOW_35_in_types906); 
                    idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:193:7: 'String'
                    {
                    match(input,36,FOLLOW_36_in_types920); 
                    idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:7: 'Char'
                    {
                    match(input,37,FOLLOW_37_in_types932); 
                    idType = "Char";

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
        return idType;
    }
    // $ANTLR end "types"

    // Delegated rules


 

    public static final BitSet FOLLOW_text_in_mtext31 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_decl_in_text53 = new BitSet(new long[]{0x00000038000000A2L});
    public static final BitSet FOLLOW_var_in_text64 = new BitSet(new long[]{0x00000038000000A2L});
    public static final BitSet FOLLOW_var_in_program86 = new BitSet(new long[]{0x00000038000000A2L});
    public static final BitSet FOLLOW_fun_decl_in_program89 = new BitSet(new long[]{0x0000003800000082L});
    public static final BitSet FOLLOW_types_in_var109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_id_init_in_var111 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_COMMA_in_var114 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_id_init_in_var116 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_LIST_in_var122 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_fun_call_in_var124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EOL_in_var128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init143 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_EQUAL_in_id_init156 = new BitSet(new long[]{0x0000000000007480L});
    public static final BitSet FOLLOW_expr_in_id_init159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_init163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr180 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_MATHOPER_in_expr183 = new BitSet(new long[]{0x0000000000007480L});
    public static final BitSet FOLLOW_math_exp_in_expr185 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_type_id_in_math_exp204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp212 = new BitSet(new long[]{0x0000000000007480L});
    public static final BitSet FOLLOW_expr_in_math_exp214 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type_id259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_type_id263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_if_op281 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_if_op283 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op285 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_if_op293 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_for_op310 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op312 = new BitSet(new long[]{0x0000003800001000L});
    public static final BitSet FOLLOW_INT_in_for_op315 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_types_in_for_op318 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_for_op322 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_for_op324 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_for_op328 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op339 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_while_op363 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_while_op365 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond383 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_bool_cond387 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond389 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_bool_cond391 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond396 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id414 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_brack_id416 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_return_op437 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_return_op439 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EOL_in_return_op441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_in_out_op468 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op470 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EOL_in_in_out_op473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_in_out_op484 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_brack_id_in_in_out_op486 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EOL_in_in_out_op488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call504 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_fun_call506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op521 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_self_op522 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_fun_call_in_self_op526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond537 = new BitSet(new long[]{0x0000000000007880L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond540 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_COMMA_in_op_cond543 = new BitSet(new long[]{0x0000000000007080L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond545 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_cond_arg563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_ops604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_init_in_id_op620 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_self_op_in_id_op624 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_id_op629 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op631 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EOL_in_id_op635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun652 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun654 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun656 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_fun_decl671 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_fun_decl674 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl684 = new BitSet(new long[]{0x0000003800000800L});
    public static final BitSet FOLLOW_args_in_fun_decl687 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl690 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_types_in_args705 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_args707 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMMA_in_args710 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_types_in_args712 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_args714 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body733 = new BitSet(new long[]{0x0000003BD40870A0L});
    public static final BitSet FOLLOW_var_in_fun_body744 = new BitSet(new long[]{0x0000003BD40870A0L});
    public static final BitSet FOLLOW_ops_in_fun_body746 = new BitSet(new long[]{0x0000003BD40870A0L});
    public static final BitSet FOLLOW_return_op_in_fun_body764 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_types906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_types920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_types932 = new BitSet(new long[]{0x0000000000000002L});

}