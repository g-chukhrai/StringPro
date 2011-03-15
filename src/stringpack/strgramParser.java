// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-15 21:20:20

  package stringpack;
  import java.io.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LIST", "EOL", "ID", "COMMA", "EQUAL", "MATHOPER", "PAR_OPEN", "PAR_CLOSE", "INT", "STRING", "CHAR", "COMPROPER", "POSTFIX", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'return'", "'out'", "'read'", "'.'"
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
    public static final int COMMA=7;
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



    // $ANTLR start "text"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:37:1: text : text2 ;
    public final void text() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:37:6: ( text2 )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:37:8: text2
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:40:1: text2 : ( fun_decl | var )+ ;
    public final void text2() throws RecognitionException {
        text2_stack.push(new text2_scope());
        ((text2_scope)text2_stack.peek()).name = "";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:45:3: ( ( fun_decl | var )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:45:5: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:45:5: ( fun_decl | var )+
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
                        else if ( (LA1_7==EOL||(LA1_7>=COMMA && LA1_7<=EQUAL)) ) {
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
                        else if ( (LA1_7==EOL||(LA1_7>=COMMA && LA1_7<=EQUAL)) ) {
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
                        else if ( (LA1_7==EOL||(LA1_7>=COMMA && LA1_7<=EQUAL)) ) {
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:45:7: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_text257);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:46:7: var
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:50:2: type returns [String idType] : ( 'Int' | 'String' | 'Char' );
    public final String type() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:51:3: ( 'Int' | 'String' | 'Char' )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:51:8: 'Int'
                    {
                    match(input,26,FOLLOW_26_in_type102); 
                    idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:52:8: 'String'
                    {
                    match(input,27,FOLLOW_27_in_type117); 
                    idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:8: 'Char'
                    {
                    match(input,28,FOLLOW_28_in_type130); 
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:56:1: var : ( id_init | ( LIST fun_call ) ) EOL ;
    public final void var() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:2: ( ( id_init | ( LIST fun_call ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:5: ( id_init | ( LIST fun_call ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:5: ( id_init | ( LIST fun_call ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:6: id_init
                    {
                    pushFollow(FOLLOW_id_init_in_var156);
                    id_init();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:15: ( LIST fun_call )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:15: ( LIST fun_call )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:16: LIST fun_call
                    {
                    match(input,LIST,FOLLOW_LIST_in_var160); 
                    pushFollow(FOLLOW_fun_call_in_var162);
                    fun_call();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var166); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:60:1: id_init : type a= ID ( COMMA b= ID )* ( EQUAL ( expr | fun_call ) )? ;
    public final void id_init() throws RecognitionException {
        Token a=null;
        Token b=null;
        String type1 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:61:2: ( type a= ID ( COMMA b= ID )* ( EQUAL ( expr | fun_call ) )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:61:6: type a= ID ( COMMA b= ID )* ( EQUAL ( expr | fun_call ) )?
            {
            pushFollow(FOLLOW_type_in_id_init182);
            type1=type();

            state._fsp--;

            a=(Token)match(input,ID,FOLLOW_ID_in_id_init188); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:61:18: ( COMMA b= ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:61:19: COMMA b= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_id_init191); 
            	    b=(Token)match(input,ID,FOLLOW_ID_in_id_init195); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            		    if (names.isExist(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null))) {
            		      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
            		    } else {
            		      names.add(names.new Name(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null), type1, (a!=null?a.getLine():0)));
            		      names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            		    }
            		    if (b != null) {
            	        if (names.isExist(((text2_scope)text2_stack.peek()).name + "." + (b!=null?b.getText():null))) {
            	          errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" duplicated");
            	        } else {
            	          names.add(names.new Name(((text2_scope)text2_stack.peek()).name + "." + (b!=null?b.getText():null), type1, (b!=null?b.getLine():0)));
            	          names.get(((text2_scope)text2_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));          
            	        }		    
                    }
                 
            		  
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:4: ( EQUAL ( expr | fun_call ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==EQUAL) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:5: EQUAL ( expr | fun_call )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init209); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:11: ( expr | fun_call )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==EOL||LA5_1==MATHOPER) ) {
                            alt5=1;
                        }
                        else if ( (LA5_1==PAR_OPEN) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA5_0==PAR_OPEN||(LA5_0>=INT && LA5_0<=CHAR)) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:12: expr
                            {
                            pushFollow(FOLLOW_expr_in_id_init212);
                            expr();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:19: fun_call
                            {
                            pushFollow(FOLLOW_fun_call_in_id_init216);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:82:1: expr : math_exp ( MATHOPER math_exp )* ;
    public final void expr() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:83:3: ( math_exp ( MATHOPER math_exp )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:83:7: math_exp ( MATHOPER math_exp )*
            {
            pushFollow(FOLLOW_math_exp_in_expr233);
            math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:83:16: ( MATHOPER math_exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MATHOPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:83:17: MATHOPER math_exp
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr236); 
            	    pushFollow(FOLLOW_math_exp_in_expr238);
            	    math_exp();

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


    // $ANTLR start "math_exp"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:86:1: math_exp : ( data_id | PAR_OPEN expr PAR_CLOSE );
    public final void math_exp() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:3: ( data_id | PAR_OPEN expr PAR_CLOSE )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||(LA8_0>=INT && LA8_0<=CHAR)) ) {
                alt8=1;
            }
            else if ( (LA8_0==PAR_OPEN) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:7: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp257);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:88:7: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp265); 
                    pushFollow(FOLLOW_expr_in_math_exp267);
                    expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp269); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:91:1: data : ( INT | STRING | CHAR );
    public final void data() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:3: ( INT | STRING | CHAR )
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:95:1: data_id : ( ID | data );
    public final void data_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:3: ( ID | data )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=INT && LA9_0<=CHAR)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:7: ID
                    {
                    match(input,ID,FOLLOW_ID_in_data_id312); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:96:12: data
                    {
                    pushFollow(FOLLOW_data_in_data_id316);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:99:1: if_op : 'if' bool_cond fun_body 'else' fun_body ;
    public final void if_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:2: ( 'if' bool_cond fun_body 'else' fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:5: 'if' bool_cond fun_body 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_if_op334); 
            pushFollow(FOLLOW_bool_cond_in_if_op336);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op338);
            fun_body();

            state._fsp--;

            match(input,30,FOLLOW_30_in_if_op346); 
            pushFollow(FOLLOW_fun_body_in_if_op348);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:1: for_op : 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body ;
    public final void for_op() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:2: ( 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:5: 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op363); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op365); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:20: ( INT | ( type a= ID 'in' b= ID ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==INT) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=26 && LA10_0<=28)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:21: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op368); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:25: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:25: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:26: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op371);
                    type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op375); 
                    match(input,32,FOLLOW_32_in_for_op377); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op381); 

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
              
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op392); 
            pushFollow(FOLLOW_fun_body_in_for_op394);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:1: while_op : 'while' bool_cond fun_body ;
    public final void while_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:2: ( 'while' bool_cond fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:5: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op416); 
            pushFollow(FOLLOW_bool_cond_in_while_op418);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op420);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:1: bool_cond : PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE ;
    public final void bool_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:2: ( PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:7: PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond436); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:16: ( ( ID COMPROPER ID ) | fun_call )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==COMPROPER) ) {
                    alt11=1;
                }
                else if ( (LA11_1==PAR_OPEN) ) {
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:17: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:17: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:18: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_bool_cond440); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond442); 
                    match(input,ID,FOLLOW_ID_in_bool_cond444); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:37: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond449);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond452); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:129:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final void brack_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:2: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:130:7: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id467); 
            match(input,ID,FOLLOW_ID_in_brack_id469); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id471); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:133:1: return_op : 'return' ID EOL ;
    public final void return_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:2: ( 'return' ID EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:5: 'return' ID EOL
            {
            match(input,34,FOLLOW_34_in_return_op490); 
            match(input,ID,FOLLOW_ID_in_return_op492); 
            match(input,EOL,FOLLOW_EOL_in_return_op494); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:1: in_out_op : ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) );
    public final void in_out_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:2: ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            else if ( (LA12_0==36) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:5: ( 'out' op_cond EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:5: ( 'out' op_cond EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:6: 'out' op_cond EOL
                    {
                    match(input,35,FOLLOW_35_in_in_out_op521); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op523);
                    op_cond();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op526); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:5: ( 'read' brack_id EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:5: ( 'read' brack_id EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:6: 'read' brack_id EOL
                    {
                    match(input,36,FOLLOW_36_in_in_out_op537); 
                    pushFollow(FOLLOW_brack_id_in_in_out_op539);
                    brack_id();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op541); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:1: fun_call : ID op_cond ;
    public final void fun_call() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:2: ( ID op_cond )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:7: ID op_cond
            {
            match(input,ID,FOLLOW_ID_in_fun_call557); 
            pushFollow(FOLLOW_op_cond_in_fun_call559);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:1: self_op : ( ID '.' )? fun_call ;
    public final void self_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:2: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:7: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:7: ( ID '.' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==37) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op574); 
                    match(input,37,FOLLOW_37_in_self_op575); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op579);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final void op_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:2: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:4: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond590); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:13: ( cond_arg ( COMMA cond_arg )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID||(LA15_0>=INT && LA15_0<=CHAR)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:14: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond593);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:23: ( COMMA cond_arg )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:24: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond596); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond598);
                    	    cond_arg();

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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond604); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:1: cond_arg : ( data_id | self_op );
    public final void cond_arg() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:2: ( data_id | self_op )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==PAR_OPEN||LA16_1==37) ) {
                    alt16=2;
                }
                else if ( (LA16_1==COMMA||LA16_1==PAR_CLOSE) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA16_0>=INT && LA16_0<=CHAR)) ) {
                alt16=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:4: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_cond_arg616);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:14: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg620);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:159:1: ops : ( id_op | if_op | while_op | for_op | in_out_op );
    public final void ops() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:2: ( id_op | if_op | while_op | for_op | in_out_op )
            int alt17=5;
            switch ( input.LA(1) ) {
            case ID:
            case 26:
            case 27:
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 33:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 35:
            case 36:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops641);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops645);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops649);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops653);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:41: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_ops657);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:1: id_op : ( id_init | self_op | ( ID POSTFIX ) ) EOL ;
    public final void id_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:2: ( ( id_init | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:6: ( id_init | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:6: ( id_init | self_op | ( ID POSTFIX ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=26 && LA18_0<=28)) ) {
                alt18=1;
            }
            else if ( (LA18_0==ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==PAR_OPEN||LA18_2==37) ) {
                    alt18=2;
                }
                else if ( (LA18_2==POSTFIX) ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:7: id_init
                    {
                    pushFollow(FOLLOW_id_init_in_id_op673);
                    id_init();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:17: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op677);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:27: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:27: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:28: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op682); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op684); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op688); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final void main_fun() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun705); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun707); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun709); 
            pushFollow(FOLLOW_fun_body_in_main_fun711);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:1: fun_decl : ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body ;
    public final void fun_decl() throws RecognitionException {
        Token ID2=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:2: ( ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:5: ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:5: ( type )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=26 && LA19_0<=28)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:5: type
                    {
                    pushFollow(FOLLOW_type_in_fun_decl724);
                    type();

                    state._fsp--;


                    }
                    break;

            }

            ID2=(Token)match(input,ID,FOLLOW_ID_in_fun_decl727); 
             ((text2_scope)text2_stack.peek()).name = (ID2!=null?ID2.getText():null); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl737); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:13: ( args )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=26 && LA20_0<=28)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:13: args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl740);
                    args();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl743); 
            pushFollow(FOLLOW_fun_body_in_fun_decl745);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:177:1: args : type ID ( COMMA type ID )* ;
    public final void args() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:3: ( type ID ( COMMA type ID )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:5: type ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args759);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_args761); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:13: ( COMMA type ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:14: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args764); 
            	    pushFollow(FOLLOW_type_in_args766);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args768); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:181:1: fun_body : CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE ;
    public final void fun_body() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:182:2: ( CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:182:7: CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body787); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:10: ( ops )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID||(LA22_0>=26 && LA22_0<=29)||LA22_0==31||LA22_0==33||(LA22_0>=35 && LA22_0<=36)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:10: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body798);
            	    ops();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:9: ( return_op )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:9: return_op
                    {
                    pushFollow(FOLLOW_return_op_in_fun_body815);
                    return_op();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body828); 

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
    public static final BitSet FOLLOW_26_in_type102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_init_in_var156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_LIST_in_var160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_fun_call_in_var162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_var166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_id_init182 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_id_init188 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_COMMA_in_id_init191 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_id_init195 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_EQUAL_in_id_init209 = new BitSet(new long[]{0x0000000000007440L});
    public static final BitSet FOLLOW_expr_in_id_init212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_init216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr233 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_MATHOPER_in_expr236 = new BitSet(new long[]{0x0000000000007440L});
    public static final BitSet FOLLOW_math_exp_in_expr238 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_data_id_in_math_exp257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp265 = new BitSet(new long[]{0x0000000000007440L});
    public static final BitSet FOLLOW_expr_in_math_exp267 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_data0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op334 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_if_op336 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op338 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_if_op346 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op363 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op365 = new BitSet(new long[]{0x000000001C001000L});
    public static final BitSet FOLLOW_INT_in_for_op368 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_for_op371 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_for_op375 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op377 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_for_op381 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op392 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op416 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_while_op418 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_bool_cond440 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond442 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_bool_cond444 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond449 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_brack_id469 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_return_op490 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_return_op492 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_return_op494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op521 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op523 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_in_out_op526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_in_out_op537 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_brack_id_in_in_out_op539 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_in_out_op541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call557 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_fun_call559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op574 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_self_op575 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_fun_call_in_self_op579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond590 = new BitSet(new long[]{0x0000000000007840L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond593 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_COMMA_in_op_cond596 = new BitSet(new long[]{0x0000000000007040L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond598 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_cond_arg616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_ops657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_init_in_id_op673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_self_op_in_id_op677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_id_op682 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op684 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EOL_in_id_op688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun705 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun707 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun709 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_fun_decl727 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl737 = new BitSet(new long[]{0x000000001C000800L});
    public static final BitSet FOLLOW_args_in_fun_decl740 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl743 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_args761 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_COMMA_in_args764 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args766 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_args768 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body787 = new BitSet(new long[]{0x0000001EBC087040L});
    public static final BitSet FOLLOW_ops_in_fun_body798 = new BitSet(new long[]{0x0000001EBC087040L});
    public static final BitSet FOLLOW_return_op_in_fun_body815 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body828 = new BitSet(new long[]{0x0000000000000002L});

}