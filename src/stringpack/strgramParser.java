// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-15 20:33:38

  package stringpack;
  import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LIST", "EOL", "ID", "EQUAL", "MATHOPER", "PAR_OPEN", "PAR_CLOSE", "INT", "STRING", "CHAR", "COMPROPER", "COMMA", "POSTFIX", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'return'", "'out'", "'read'", "'.'"
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
    public static final int LIST=4;
    public static final int EOL=5;
    public static final int ID=6;
    public static final int EQUAL=7;
    public static final int MATHOPER=8;
    public static final int PAR_OPEN=9;
    public static final int PAR_CLOSE=10;
    public static final int INT=11;
    public static final int STRING=12;
    public static final int CHAR=13;
    public static final int COMPROPER=14;
    public static final int COMMA=15;
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
    //    ANTLRInputStream input = new ANTLRInputStream(System.in);
        strgramLexer lex = new strgramLexer(new ANTLRFileStream(args[0]));
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



    // $ANTLR start "text"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:35:1: text : text2 ;
    public final void text() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:35:6: ( text2 )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:35:8: text2
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:38:1: text2 : ( fun_decl | var )+ ;
    public final void text2() throws RecognitionException {
        text2_stack.push(new text2_scope());
        ((text2_scope)text2_stack.peek()).name = "";
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
                case 26:
                    {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( (LA1_7==EOL||LA1_7==EQUAL) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case 27:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( (LA1_7==EOL||LA1_7==EQUAL) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case 28:
                    {
                    int LA1_4 = input.LA(2);

                    if ( (LA1_4==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( (LA1_7==EOL||LA1_7==EQUAL) ) {
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:7: var
            	    {
            	    ((text2_scope)text2_stack.peek()).name = "";
            	    pushFollow(FOLLOW_var_in_text268);
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


    // $ANTLR start "type"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:48:2: type returns [String idType] : ( 'Int' | 'String' | 'Char' );
    public final String type() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:3: ( 'Int' | 'String' | 'Char' )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:8: 'Int'
                    {
                    match(input,26,FOLLOW_26_in_type101); 
                    idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:50:8: 'String'
                    {
                    match(input,27,FOLLOW_27_in_type116); 
                    idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:51:8: 'Char'
                    {
                    match(input,28,FOLLOW_28_in_type129); 
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
    // $ANTLR end "type"


    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:54:1: var : ( id_init | ( LIST fun_call ) ) EOL ;
    public final void var() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:2: ( ( id_init | ( LIST fun_call ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:5: ( id_init | ( LIST fun_call ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:5: ( id_init | ( LIST fun_call ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=26 && LA3_0<=28)) ) {
                alt3=1;
            }
            else if ( (LA3_0==LIST) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:7: id_init
                    {
                    pushFollow(FOLLOW_id_init_in_var156);
                    id_init();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:15: ( LIST fun_call )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:15: ( LIST fun_call )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:16: LIST fun_call
                    {
                    match(input,LIST,FOLLOW_LIST_in_var159); 
                    pushFollow(FOLLOW_fun_call_in_var161);
                    fun_call();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var165); 

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


    // $ANTLR start "id_init"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:58:1: id_init : type a= ID ( EQUAL ( expr | fun_call ) )? ;
    public final void id_init() throws RecognitionException {
        Token a=null;
        String type1 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:59:2: ( type a= ID ( EQUAL ( expr | fun_call ) )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:59:6: type a= ID ( EQUAL ( expr | fun_call ) )?
            {
            pushFollow(FOLLOW_type_in_id_init181);
            type1=type();

            state._fsp--;

            a=(Token)match(input,ID,FOLLOW_ID_in_id_init187); 

            		    if (names.isExist(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null))) {
            		      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
            		    } else {
            		      names.add(names.new Name(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null), type1, (a!=null?a.getLine():0)));
            		    }
            		    if (names.isExist(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null))) {
            		      names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            		    } else {
            		      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" cannot be resolved");
            		    }  		     
            		  
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:4: ( EQUAL ( expr | fun_call ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EQUAL) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:5: EQUAL ( expr | fun_call )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init200); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:11: ( expr | fun_call )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ID) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==EOL||LA4_1==MATHOPER) ) {
                            alt4=1;
                        }
                        else if ( (LA4_1==PAR_OPEN) ) {
                            alt4=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA4_0==PAR_OPEN||(LA4_0>=INT && LA4_0<=CHAR)) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_id_init203);
                            expr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:19: fun_call
                            {
                            pushFollow(FOLLOW_fun_call_in_id_init207);
                            fun_call();

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
    // $ANTLR end "id_init"


    // $ANTLR start "expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:75:1: expr : math_exp ( MATHOPER math_exp )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:3: ( math_exp ( MATHOPER math_exp )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:7: math_exp ( MATHOPER math_exp )*
            {
            pushFollow(FOLLOW_math_exp_in_expr224);
            math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:16: ( MATHOPER math_exp )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==MATHOPER) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:17: MATHOPER math_exp
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr227); 
            	    pushFollow(FOLLOW_math_exp_in_expr229);
            	    math_exp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:1: math_exp : ( data_id | PAR_OPEN expr PAR_CLOSE );
    public final void math_exp() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:80:3: ( data_id | PAR_OPEN expr PAR_CLOSE )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||(LA7_0>=INT && LA7_0<=CHAR)) ) {
                alt7=1;
            }
            else if ( (LA7_0==PAR_OPEN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:80:7: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp248);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:7: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp256); 
                    pushFollow(FOLLOW_expr_in_math_exp258);
                    expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp260); 

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


    // $ANTLR start "data"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:84:1: data : ( INT | STRING | CHAR );
    public final void data() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:85:3: ( INT | STRING | CHAR )
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
    // $ANTLR end "data"


    // $ANTLR start "data_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:88:1: data_id : ( ID | data );
    public final void data_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:3: ( ID | data )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=INT && LA8_0<=CHAR)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:7: ID
                    {
                    match(input,ID,FOLLOW_ID_in_data_id303); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:12: data
                    {
                    pushFollow(FOLLOW_data_in_data_id307);
                    data();

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
    // $ANTLR end "data_id"


    // $ANTLR start "if_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:1: if_op : 'if' bool_cond fun_body 'else' fun_body ;
    public final void if_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:2: ( 'if' bool_cond fun_body 'else' fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:5: 'if' bool_cond fun_body 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_if_op325); 
            pushFollow(FOLLOW_bool_cond_in_if_op327);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op329);
            fun_body();

            state._fsp--;

            match(input,30,FOLLOW_30_in_if_op337); 
            pushFollow(FOLLOW_fun_body_in_if_op339);
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


    // $ANTLR start "for_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:97:1: for_op : 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body ;
    public final void for_op() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:2: ( 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:5: 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op354); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op356); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:20: ( INT | ( type a= ID 'in' b= ID ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==INT) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=26 && LA9_0<=28)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:21: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op359); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:25: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:25: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:26: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op362);
                    type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op366); 
                    match(input,32,FOLLOW_32_in_for_op368); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op372); 

                    }


                    }
                    break;

            }


                if (! names.isExist(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                  errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" cannot be resolved");
                } else {
                  names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                }
                if (! names.isExist(((text2_scope)text2_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                  errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                } else {
                  names.get(((text2_scope)text2_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                }
              
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op383); 
            pushFollow(FOLLOW_fun_body_in_for_op385);
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
    // $ANTLR end "for_op"


    // $ANTLR start "while_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:114:1: while_op : 'while' bool_cond fun_body ;
    public final void while_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:2: ( 'while' bool_cond fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:5: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op407); 
            pushFollow(FOLLOW_bool_cond_in_while_op409);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op411);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:118:1: bool_cond : PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE ;
    public final void bool_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:2: ( PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:7: PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond427); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:16: ( ( ID COMPROPER ID ) | fun_call )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==COMPROPER) ) {
                    alt10=1;
                }
                else if ( (LA10_1==PAR_OPEN) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:17: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:17: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:18: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_bool_cond431); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond433); 
                    match(input,ID,FOLLOW_ID_in_bool_cond435); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:37: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond440);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond443); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final void brack_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:2: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:7: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id458); 
            match(input,ID,FOLLOW_ID_in_brack_id460); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id462); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:1: return_op : 'return' ID EOL ;
    public final void return_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:127:2: ( 'return' ID EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:127:5: 'return' ID EOL
            {
            match(input,34,FOLLOW_34_in_return_op481); 
            match(input,ID,FOLLOW_ID_in_return_op483); 
            match(input,EOL,FOLLOW_EOL_in_return_op485); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:131:1: in_out_op : ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) );
    public final void in_out_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:132:2: ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            else if ( (LA11_0==36) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:132:5: ( 'out' op_cond EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:132:5: ( 'out' op_cond EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:132:6: 'out' op_cond EOL
                    {
                    match(input,35,FOLLOW_35_in_in_out_op512); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op514);
                    op_cond();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op517); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:133:5: ( 'read' brack_id EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:133:5: ( 'read' brack_id EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:133:6: 'read' brack_id EOL
                    {
                    match(input,36,FOLLOW_36_in_in_out_op528); 
                    pushFollow(FOLLOW_brack_id_in_in_out_op530);
                    brack_id();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op532); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:1: fun_call : ID op_cond ;
    public final void fun_call() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:2: ( ID op_cond )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:7: ID op_cond
            {
            match(input,ID,FOLLOW_ID_in_fun_call548); 
            pushFollow(FOLLOW_op_cond_in_fun_call550);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:1: self_op : ( ID '.' )? fun_call ;
    public final void self_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:141:2: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:141:7: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:141:7: ( ID '.' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==37) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:141:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op565); 
                    match(input,37,FOLLOW_37_in_self_op566); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op570);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final void op_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:2: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:4: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond581); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:13: ( cond_arg ( COMMA cond_arg )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID||(LA14_0>=INT && LA14_0<=CHAR)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:14: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond584);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:23: ( COMMA cond_arg )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:24: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond587); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond589);
                    	    cond_arg();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond595); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:1: cond_arg : ( data_id | self_op );
    public final void cond_arg() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:2: ( data_id | self_op )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==PAR_OPEN||LA15_1==37) ) {
                    alt15=2;
                }
                else if ( (LA15_1==PAR_CLOSE||LA15_1==COMMA) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA15_0>=INT && LA15_0<=CHAR)) ) {
                alt15=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:4: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_cond_arg607);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:14: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg611);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:1: ops : ( id_op | if_op | while_op | for_op | in_out_op );
    public final void ops() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:2: ( id_op | if_op | while_op | for_op | in_out_op )
            int alt16=5;
            switch ( input.LA(1) ) {
            case ID:
            case 26:
            case 27:
            case 28:
                {
                alt16=1;
                }
                break;
            case 29:
                {
                alt16=2;
                }
                break;
            case 33:
                {
                alt16=3;
                }
                break;
            case 31:
                {
                alt16=4;
                }
                break;
            case 35:
            case 36:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops632);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops636);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops640);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops644);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:41: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_ops648);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:1: id_op : ( id_init | self_op | ( ID POSTFIX ) ) EOL ;
    public final void id_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:2: ( ( id_init | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:6: ( id_init | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:6: ( id_init | self_op | ( ID POSTFIX ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=26 && LA17_0<=28)) ) {
                alt17=1;
            }
            else if ( (LA17_0==ID) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==PAR_OPEN||LA17_2==37) ) {
                    alt17=2;
                }
                else if ( (LA17_2==POSTFIX) ) {
                    alt17=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:7: id_init
                    {
                    pushFollow(FOLLOW_id_init_in_id_op664);
                    id_init();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:17: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op668);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:27: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:27: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:28: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op673); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op675); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op679); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final void main_fun() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:161:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:161:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun696); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun698); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun700); 
            pushFollow(FOLLOW_fun_body_in_main_fun702);
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


    // $ANTLR start "fun_decl"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:1: fun_decl : ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body ;
    public final void fun_decl() throws RecognitionException {
        Token ID2=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:2: ( ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:5: ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:5: ( type )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=26 && LA18_0<=28)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:5: type
                    {
                    pushFollow(FOLLOW_type_in_fun_decl715);
                    type();

                    state._fsp--;


                    }
                    break;

            }

            ID2=(Token)match(input,ID,FOLLOW_ID_in_fun_decl718); 
             ((text2_scope)text2_stack.peek()).name = (ID2!=null?ID2.getText():null); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl728); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:13: ( args )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=26 && LA19_0<=28)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:13: args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl731);
                    args();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl734); 
            pushFollow(FOLLOW_fun_body_in_fun_decl736);
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
    // $ANTLR end "fun_decl"


    // $ANTLR start "args"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:1: args : type ID ( COMMA type ID )* ;
    public final void args() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:3: ( type ID ( COMMA type ID )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:5: type ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args750);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_args752); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:13: ( COMMA type ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:14: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args755); 
            	    pushFollow(FOLLOW_type_in_args757);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args759); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:1: fun_body : CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE ;
    public final void fun_body() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:2: ( CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:7: CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body778); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:176:10: ( ops )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ID||(LA21_0>=26 && LA21_0<=29)||LA21_0==31||LA21_0==33||(LA21_0>=35 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:176:10: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body789);
            	    ops();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:177:9: ( return_op )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:177:9: return_op
                    {
                    pushFollow(FOLLOW_return_op_in_fun_body806);
                    return_op();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body819); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_text2_in_text30 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_decl_in_text257 = new BitSet(new long[]{0x000000001C000052L});
    public static final BitSet FOLLOW_var_in_text268 = new BitSet(new long[]{0x000000001C000052L});
    public static final BitSet FOLLOW_26_in_type101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_init_in_var156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LIST_in_var159 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_fun_call_in_var161 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_var165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_id_init181 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_id_init187 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_EQUAL_in_id_init200 = new BitSet(new long[]{0x0000000000003A40L});
    public static final BitSet FOLLOW_expr_in_id_init203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_init207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr224 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_MATHOPER_in_expr227 = new BitSet(new long[]{0x0000000000003A40L});
    public static final BitSet FOLLOW_math_exp_in_expr229 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_data_id_in_math_exp248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp256 = new BitSet(new long[]{0x0000000000003A40L});
    public static final BitSet FOLLOW_expr_in_math_exp258 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_data0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op325 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_bool_cond_in_if_op327 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_if_op337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op354 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op356 = new BitSet(new long[]{0x000000001C000800L});
    public static final BitSet FOLLOW_INT_in_for_op359 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_type_in_for_op362 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_for_op366 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op368 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_for_op372 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op383 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op407 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_bool_cond_in_while_op409 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond427 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_bool_cond431 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond433 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_bool_cond435 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond440 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id458 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_brack_id460 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_return_op481 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_return_op483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_return_op485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op512 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op514 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_in_out_op517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_in_out_op528 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_brack_id_in_in_out_op530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_in_out_op532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call548 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_op_cond_in_fun_call550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op565 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_self_op566 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_fun_call_in_self_op570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond581 = new BitSet(new long[]{0x0000000000003C40L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond584 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_COMMA_in_op_cond587 = new BitSet(new long[]{0x0000000000003840L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond589 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_cond_arg607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_ops648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_init_in_id_op664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_self_op_in_id_op668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_id_op673 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_id_op679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun696 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun698 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun700 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_fun_decl718 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl728 = new BitSet(new long[]{0x000000001C000400L});
    public static final BitSet FOLLOW_args_in_fun_decl731 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl734 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args750 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_args752 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_args755 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args757 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_args759 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body778 = new BitSet(new long[]{0x0000001EBC083840L});
    public static final BitSet FOLLOW_ops_in_fun_body789 = new BitSet(new long[]{0x0000001EBC083840L});
    public static final BitSet FOLLOW_return_op_in_fun_body806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body819 = new BitSet(new long[]{0x0000000000000002L});

}