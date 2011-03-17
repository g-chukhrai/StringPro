// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-17 09:05:00

  package stringpack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "EQUAL", "COMMA", "LIST", "EOL", "MATHOPER", "PAR_OPEN", "PAR_CLOSE", "INT", "STRING", "CHAR", "COMPROPER", "POSTFIX", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'return'", "'out'", "'read'", "'.'"
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
    public static final int ID=4;
    public static final int EQUAL=5;
    public static final int COMMA=6;
    public static final int LIST=7;
    public static final int EOL=8;
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



    // $ANTLR start "text"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:39:1: text : text2 ;
    public final void text() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:39:6: ( text2 )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:39:8: text2
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:42:1: text2 : ( fun_decl | var )+ ;
    public final void text2() throws RecognitionException {
        text2_stack.push(new text2_scope());
        ((text2_scope)text2_stack.peek()).name = "[global]";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:3: ( ( fun_decl | var )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:5: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:5: ( fun_decl | var )+
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
                        else if ( ((LA1_7>=EQUAL && LA1_7<=COMMA)||LA1_7==EOL) ) {
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
                        else if ( ((LA1_7>=EQUAL && LA1_7<=COMMA)||LA1_7==EOL) ) {
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
                        else if ( ((LA1_7>=EQUAL && LA1_7<=COMMA)||LA1_7==EOL) ) {
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:7: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_text257);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:48:7: var
            	    {
            	    ((text2_scope)text2_stack.peek()).name = "[global]";
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:52:2: type returns [String idType] : ( 'Int' | 'String' | 'Char' );
    public final String type() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:3: ( 'Int' | 'String' | 'Char' )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:8: 'Int'
                    {
                    match(input,26,FOLLOW_26_in_type102); 
                    idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:54:8: 'String'
                    {
                    match(input,27,FOLLOW_27_in_type117); 
                    idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:8: 'Char'
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

    public static class id_init_return extends ParserRuleReturnScope {
        public String idName;
        public int idLine;
    };

    // $ANTLR start "id_init"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:58:1: id_init returns [String idName,int idLine] : a= ID ( EQUAL id_value )? ;
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        String id_value1 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:59:3: (a= ID ( EQUAL id_value )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:59:7: a= ID ( EQUAL id_value )?
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_init162); 

                   if ((a!=null?a.getText():null) != null) {
                    if (names.isExist(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                    } else {
            	          retval.idName = (a!=null?a.getText():null);
            	          retval.idLine = (a!=null?a.getLine():0);
            	          names.add(names.new Name(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null), ((var_scope)var_stack.peek()).varType, (a!=null?a.getLine():0)));
            				    names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            			    }
                    }
                  
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:7: ( EQUAL id_value )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:8: EQUAL id_value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init180); 
                    pushFollow(FOLLOW_id_value_in_id_init182);
                    id_value1=id_value();

                    state._fsp--;


                    }
                    break;

            }


                    if (id_value1 != null){
                        String varType = names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
                        if (!varType.equals(id_value1)) {
                          errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + id_value1 + " to " + varType);
                        } else {
                          names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                        }
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


    // $ANTLR start "id_assign"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:86:1: id_assign : a= ID EQUAL id_value ;
    public final void id_assign() throws RecognitionException {
        Token a=null;
        String id_value2 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:2: (a= ID EQUAL id_value )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:4: a= ID EQUAL id_value
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign211); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign213); 
            pushFollow(FOLLOW_id_value_in_id_assign215);
            id_value2=id_value();

            state._fsp--;


                        if (!names.isExist(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                          errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" not exist");
                        } else {
                          names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            	            String varType = names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
            	            if (!varType.equals(id_value2)) {
            	              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + id_value2 + " to " + varType);
            	            } else {
            	              names.get(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            	            }
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
    // $ANTLR end "id_assign"


    // $ANTLR start "id_value"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:1: id_value returns [String idType] : ( expr | fun_call ) ;
    public final String id_value() throws RecognitionException {
        String idType = null;

        String expr3 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:3: ( ( expr | fun_call ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:7: ( expr | fun_call )
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:7: ( expr | fun_call )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==COMMA||(LA4_1>=EOL && LA4_1<=MATHOPER)) ) {
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:8: expr
                    {
                    pushFollow(FOLLOW_expr_in_id_value244);
                    expr3=expr();

                    state._fsp--;


                            idType = expr3;
                          

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:110:7: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_id_value271);
                    fun_call();

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
        return idType;
    }
    // $ANTLR end "id_value"

    protected static class var_scope {
        String varType;
    }
    protected Stack var_stack = new Stack();


    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:114:1: var : ( type a= id_init ( COMMA b= id_init )* | ( LIST fun_call ) ) EOL ;
    public final void var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.id_init_return a = null;

        strgramParser.id_init_return b = null;

        String type4 = null;


        ((var_scope)var_stack.peek()).varType = "";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:2: ( ( type a= id_init ( COMMA b= id_init )* | ( LIST fun_call ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:5: ( type a= id_init ( COMMA b= id_init )* | ( LIST fun_call ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:5: ( type a= id_init ( COMMA b= id_init )* | ( LIST fun_call ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=26 && LA6_0<=28)) ) {
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:6: type a= id_init ( COMMA b= id_init )*
                    {
                    pushFollow(FOLLOW_type_in_var301);
                    type4=type();

                    state._fsp--;


                        ((var_scope)var_stack.peek()).varType = type4;	
                    	
                    pushFollow(FOLLOW_id_init_in_var310);
                    a=id_init();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:13: ( COMMA b= id_init )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:14: COMMA b= id_init
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var313); 
                    	    pushFollow(FOLLOW_id_init_in_var317);
                    	    b=id_init();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:32: ( LIST fun_call )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:32: ( LIST fun_call )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:33: LIST fun_call
                    {
                    match(input,LIST,FOLLOW_LIST_in_var322); 
                    pushFollow(FOLLOW_fun_call_in_var324);
                    fun_call();

                    state._fsp--;


                    }


                    }
                    break;

            }


                 if ((a!=null?a.idName:null) != null) {
                      names.add(names.new Name(((text2_scope)text2_stack.peek()).name + "." + (a!=null?a.idName:null), type4, (a!=null?a.idLine:0)));
                 }

              
            match(input,EOL,FOLLOW_EOL_in_var333); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            var_stack.pop();
        }
        return ;
    }
    // $ANTLR end "var"


    // $ANTLR start "expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )* ;
    public final String expr() throws RecognitionException {
        String idType = null;

        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:3: (a= math_exp ( MATHOPER b= math_exp )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:7: a= math_exp ( MATHOPER b= math_exp )*
            {
            pushFollow(FOLLOW_math_exp_in_expr357);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:18: ( MATHOPER b= math_exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MATHOPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:19: MATHOPER b= math_exp
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr360); 
            	    pushFollow(FOLLOW_math_exp_in_expr364);
            	    b=math_exp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


                if ((b!=null?b.idType:null) != null && !(a!=null?a.idType:null).equals((b!=null?b.idType:null))){
                  errors.add("line " + "a.line" + ": names " + (a!=null?input.toString(a.start,a.stop):null) + " and " + (b!=null?input.toString(b.start,b.stop):null) + " has inconvertable types");
                } else {
                  idType = (a!=null?a.idType:null);
                }
              

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
    // $ANTLR end "expr"

    public static class math_exp_return extends ParserRuleReturnScope {
        public String idType;
    };

    // $ANTLR start "math_exp"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:1: math_exp returns [String idType] : ( data_id | PAR_OPEN expr PAR_CLOSE );
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        String data_id5 = null;

        String expr6 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:3: ( data_id | PAR_OPEN expr PAR_CLOSE )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:7: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp392);
                    data_id5=data_id();

                    state._fsp--;


                        retval.idType = data_id5;
                      

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:150:7: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp404); 
                    pushFollow(FOLLOW_expr_in_math_exp406);
                    expr6=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp408); 

                        retval.idType = expr6;
                      

                    }
                    break;

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
    // $ANTLR end "math_exp"


    // $ANTLR start "data"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:1: data returns [String idType] : ( INT | STRING | CHAR );
    public final String data() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:3: ( INT | STRING | CHAR )
            int alt9=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt9=1;
                }
                break;
            case STRING:
                {
                alt9=2;
                }
                break;
            case CHAR:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:157:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_data432); 
                    idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:158:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_data447); 
                    idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:159:7: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_data458); 
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
    // $ANTLR end "data"


    // $ANTLR start "data_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:1: data_id returns [String idType] : ( ID | data );
    public final String data_id() throws RecognitionException {
        String idType = null;

        Token ID7=null;
        String data8 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:3: ( ID | data )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:7: ID
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_data_id487); 

                        if (! names.isExist(((text2_scope)text2_stack.peek()).name + "." + (ID7!=null?ID7.getText():null))) {
                          errors.add("line "+(ID7!=null?ID7.getLine():0)+": name "+(ID7!=null?ID7.getText():null)+" cannot be resolved");
                        } else {
                          names.get(((text2_scope)text2_stack.peek()).name + "." + (ID7!=null?ID7.getText():null)).addLineUses((ID7!=null?ID7.getLine():0));   
                        }
                        idType = names.get(((text2_scope)text2_stack.peek()).name + "." + (ID7!=null?ID7.getText():null)).getType();
                      

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:7: data
                    {
                    pushFollow(FOLLOW_data_in_data_id500);
                    data8=data();

                    state._fsp--;


                     	  idType = data8;
                     	

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
    // $ANTLR end "data_id"


    // $ANTLR start "if_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:1: if_op : 'if' bool_cond fun_body 'else' fun_body ;
    public final void if_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:2: ( 'if' bool_cond fun_body 'else' fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:5: 'if' bool_cond fun_body 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_if_op522); 
            pushFollow(FOLLOW_bool_cond_in_if_op524);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op526);
            fun_body();

            state._fsp--;

            match(input,30,FOLLOW_30_in_if_op534); 
            pushFollow(FOLLOW_fun_body_in_if_op536);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:1: for_op : 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body ;
    public final void for_op() throws RecognitionException {
        Token a=null;
        Token b=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:2: ( 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:5: 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op551); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op553); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:20: ( INT | ( type a= ID 'in' b= ID ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==INT) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=26 && LA11_0<=28)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:21: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op556); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:25: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:25: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:26: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op559);
                    type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op563); 
                    match(input,32,FOLLOW_32_in_for_op565); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op569); 

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
              
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op580); 
            pushFollow(FOLLOW_fun_body_in_for_op582);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:200:1: while_op : 'while' bool_cond fun_body ;
    public final void while_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:201:2: ( 'while' bool_cond fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:201:5: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op604); 
            pushFollow(FOLLOW_bool_cond_in_while_op606);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op608);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:1: bool_cond : PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE ;
    public final void bool_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:2: ( PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:7: PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond624); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:16: ( ( ID COMPROPER ID ) | fun_call )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:17: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:17: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:18: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_bool_cond628); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond630); 
                    match(input,ID,FOLLOW_ID_in_bool_cond632); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:37: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond637);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond640); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:208:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final void brack_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:209:2: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:209:7: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id655); 
            match(input,ID,FOLLOW_ID_in_brack_id657); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id659); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:212:1: return_op : 'return' ID EOL ;
    public final void return_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:2: ( 'return' ID EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:5: 'return' ID EOL
            {
            match(input,34,FOLLOW_34_in_return_op678); 
            match(input,ID,FOLLOW_ID_in_return_op680); 
            match(input,EOL,FOLLOW_EOL_in_return_op682); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:217:1: in_out_op : ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) );
    public final void in_out_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:218:2: ( ( 'out' op_cond EOL ) | ( 'read' brack_id EOL ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:218:5: ( 'out' op_cond EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:218:5: ( 'out' op_cond EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:218:6: 'out' op_cond EOL
                    {
                    match(input,35,FOLLOW_35_in_in_out_op709); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op711);
                    op_cond();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op714); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:5: ( 'read' brack_id EOL )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:5: ( 'read' brack_id EOL )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:6: 'read' brack_id EOL
                    {
                    match(input,36,FOLLOW_36_in_in_out_op725); 
                    pushFollow(FOLLOW_brack_id_in_in_out_op727);
                    brack_id();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_in_out_op729); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:222:1: fun_call : ID op_cond ;
    public final void fun_call() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:2: ( ID op_cond )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:7: ID op_cond
            {
            match(input,ID,FOLLOW_ID_in_fun_call745); 
            pushFollow(FOLLOW_op_cond_in_fun_call747);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:1: self_op : ( ID '.' )? fun_call ;
    public final void self_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:2: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:7: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:7: ( ID '.' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==37) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op762); 
                    match(input,37,FOLLOW_37_in_self_op763); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op767);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final void op_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:2: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:4: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond778); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:13: ( cond_arg ( COMMA cond_arg )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID||(LA16_0>=INT && LA16_0<=CHAR)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:14: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond781);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:23: ( COMMA cond_arg )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:24: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond784); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond786);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond792); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:1: cond_arg : ( data_id | self_op );
    public final void cond_arg() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:2: ( data_id | self_op )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==PAR_OPEN||LA17_1==37) ) {
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:4: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_cond_arg804);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:14: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg808);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:1: ops : ( id_op | if_op | while_op | for_op | in_out_op | var );
    public final void ops() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:2: ( id_op | if_op | while_op | for_op | in_out_op | var )
            int alt18=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 33:
                {
                alt18=3;
                }
                break;
            case 31:
                {
                alt18=4;
                }
                break;
            case 35:
            case 36:
                {
                alt18=5;
                }
                break;
            case LIST:
            case 26:
            case 27:
            case 28:
                {
                alt18=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops829);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops833);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops837);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops841);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:41: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_ops845);
                    in_out_op();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:53: var
                    {
                    pushFollow(FOLLOW_var_in_ops849);
                    var();

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:1: id_op : ( id_assign | self_op | ( ID POSTFIX ) ) EOL ;
    public final void id_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:2: ( ( id_assign | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:6: ( id_assign | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:6: ( id_assign | self_op | ( ID POSTFIX ) )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt19=1;
                    }
                    break;
                case PAR_OPEN:
                case 37:
                    {
                    alt19=2;
                    }
                    break;
                case POSTFIX:
                    {
                    alt19=3;
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:7: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_op865);
                    id_assign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:19: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op869);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:29: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:29: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:30: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op874); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op876); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op880); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final void main_fun() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:247:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:247:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun897); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun899); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun901); 
            pushFollow(FOLLOW_fun_body_in_main_fun903);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:1: fun_decl : ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body ;
    public final void fun_decl() throws RecognitionException {
        Token ID9=null;
        String type10 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:251:2: ( ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:251:4: ( type )? ID PAR_OPEN ( args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:251:4: ( type )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=26 && LA20_0<=28)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:251:4: type
                    {
                    pushFollow(FOLLOW_type_in_fun_decl915);
                    type10=type();

                    state._fsp--;


                    }
                    break;

            }

            ID9=(Token)match(input,ID,FOLLOW_ID_in_fun_decl918); 
             
            	     ((text2_scope)text2_stack.peek()).name = (ID9!=null?ID9.getText():null); 
            	     methods.add(methods.new Method(((text2_scope)text2_stack.peek()).name, type10));
            	  
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl928); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:256:13: ( args )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:256:13: args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl931);
                    args();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl934); 
            pushFollow(FOLLOW_fun_body_in_fun_decl936);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:259:1: args : type ID ( COMMA type ID )* ;
    public final void args() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:260:3: ( type ID ( COMMA type ID )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:260:5: type ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args951);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_args953); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:260:13: ( COMMA type ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMA) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:260:14: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args956); 
            	    pushFollow(FOLLOW_type_in_args958);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args960); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:263:1: fun_body : CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE ;
    public final void fun_body() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:264:2: ( CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:264:7: CUR_OPEN ( ops )* ( return_op )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body979); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:265:10: ( ops )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ID||LA23_0==LIST||(LA23_0>=26 && LA23_0<=29)||LA23_0==31||LA23_0==33||(LA23_0>=35 && LA23_0<=36)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:265:10: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body990);
            	    ops();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:9: ( return_op )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==34) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:9: return_op
                    {
                    pushFollow(FOLLOW_return_op_in_fun_body1001);
                    return_op();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1014); 

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
    public static final BitSet FOLLOW_fun_decl_in_text257 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_var_in_text268 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_26_in_type102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init162 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQUAL_in_id_init180 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_id_value_in_id_init182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign211 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign213 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_id_value_in_id_assign215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_id_value244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_value271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var310 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_var313 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var317 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LIST_in_var322 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_fun_call_in_var324 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_var333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr357 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_MATHOPER_in_expr360 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_math_exp_in_expr364 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_data_id_in_math_exp392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp404 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_expr_in_math_exp406 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op522 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_if_op524 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op526 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_if_op534 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op551 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op553 = new BitSet(new long[]{0x000000001C001000L});
    public static final BitSet FOLLOW_INT_in_for_op556 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_for_op559 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op563 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op569 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op580 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op604 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_while_op606 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond624 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_ID_in_bool_cond628 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_bool_cond632 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond637 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id657 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_return_op678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_return_op680 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_return_op682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op709 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op711 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_in_out_op714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_in_out_op725 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_brack_id_in_in_out_op727 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_in_out_op729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call745 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_fun_call747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op762 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_self_op763 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_fun_call_in_self_op767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond778 = new BitSet(new long[]{0x0000000000007C10L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond781 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_COMMA_in_op_cond784 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond786 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_cond_arg804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_ops845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_ops849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_op865 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_self_op_in_id_op869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_id_op874 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op876 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_id_op880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun897 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun899 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun901 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl918 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl928 = new BitSet(new long[]{0x000000001C000800L});
    public static final BitSet FOLLOW_args_in_fun_decl931 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl934 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args953 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_args956 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args958 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args960 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body979 = new BitSet(new long[]{0x0000001EBC087490L});
    public static final BitSet FOLLOW_ops_in_fun_body990 = new BitSet(new long[]{0x0000001EBC087490L});
    public static final BitSet FOLLOW_return_op_in_fun_body1001 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1014 = new BitSet(new long[]{0x0000000000000002L});

}