// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-19 10:34:09

  package stringpack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "EQUAL", "COMMA", "LIST", "EOL", "MATHOPER", "PAR_OPEN", "PAR_CLOSE", "INT", "STRING", "CHAR", "COMPROPER", "POSTFIX", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'out'", "'read'", "'.'", "'return'"
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
        parser.program();
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


    protected static class program_scope {
        String name;
    }
    protected Stack program_stack = new Stack();


    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:39:1: program : ( fun_decl | var )+ ;
    public final void program() throws RecognitionException {
        program_stack.push(new program_scope());
        ((program_scope)program_stack.peek()).name = "[global]";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:3: ( ( fun_decl | var )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:5: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:5: ( fun_decl | var )+
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:7: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program43);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:45:7: var
            	    {
            	    ((program_scope)program_stack.peek()).name = "[global]";
            	    pushFollow(FOLLOW_var_in_program54);
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
            program_stack.pop();
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "type"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:2: type returns [String idType] : ( 'Int' | 'String' | 'Char' );
    public final String type() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:50:3: ( 'Int' | 'String' | 'Char' )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:50:8: 'Int'
                    {
                    match(input,26,FOLLOW_26_in_type88); 
                    idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:51:8: 'String'
                    {
                    match(input,27,FOLLOW_27_in_type103); 
                    idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:52:8: 'Char'
                    {
                    match(input,28,FOLLOW_28_in_type116); 
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:1: id_init returns [String idName,int idLine] : a= ID ( EQUAL id_value )? ;
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        String id_value1 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:56:3: (a= ID ( EQUAL id_value )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:56:7: a= ID ( EQUAL id_value )?
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_init148); 

                   if ((a!=null?a.getText():null) != null) {
                    if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                    } else {
            	          retval.idName = (a!=null?a.getText():null);
            	          retval.idLine = (a!=null?a.getLine():0);
            	          names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), ((var_scope)var_stack.peek()).varType, (a!=null?a.getLine():0)));
            				    names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            			    }
                    }
                  
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:7: ( EQUAL id_value )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:8: EQUAL id_value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init166); 
                    pushFollow(FOLLOW_id_value_in_id_init168);
                    id_value1=id_value();

                    state._fsp--;


                    }
                    break;

            }


                    if (id_value1 != null){
                        String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
                        if (!varType.equals(id_value1)) {
                          errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + id_value1 + " to " + varType);
                        } else {
                          names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:83:1: id_assign : a= ID EQUAL id_value ;
    public final void id_assign() throws RecognitionException {
        Token a=null;
        String id_value2 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:84:2: (a= ID EQUAL id_value )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:84:4: a= ID EQUAL id_value
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign197); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign199); 
            pushFollow(FOLLOW_id_value_in_id_assign201);
            id_value2=id_value();

            state._fsp--;


                        if (!names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                          errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" not exist");
                        } else {
                          names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            	            String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
            	            if (!varType.equals(id_value2)) {
            	              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + id_value2 + " to " + varType);
            	            } else {
            	              names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:100:1: id_value returns [String idType] : ( expr | fun_call );
    public final String id_value() throws RecognitionException {
        String idType = null;

        String expr3 = null;

        String fun_call4 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:101:3: ( expr | fun_call )
            int alt4=2;
            switch ( input.LA(1) ) {
            case ID:
                {
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
                break;
            case PAR_OPEN:
            case INT:
            case STRING:
            case CHAR:
                {
                alt4=1;
                }
                break;
            case 34:
            case 35:
                {
                alt4=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:102:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_id_value229);
                    expr3=expr();

                    state._fsp--;


                            idType = expr3;
                          

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:107:7: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_id_value256);
                    fun_call4=fun_call();

                    state._fsp--;


                            idType = fun_call4;  
                          

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
    // $ANTLR end "id_value"

    protected static class var_scope {
        String varType;
    }
    protected Stack var_stack = new Stack();


    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:114:1: var : ( ( type a= id_init ( COMMA b= id_init )* ) | ( LIST c= ID op_cond ) ) EOL ;
    public final void var() throws RecognitionException {
        var_stack.push(new var_scope());
        Token c=null;
        strgramParser.id_init_return a = null;

        strgramParser.id_init_return b = null;

        String type5 = null;


        ((var_scope)var_stack.peek()).varType = "";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:2: ( ( ( type a= id_init ( COMMA b= id_init )* ) | ( LIST c= ID op_cond ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:120:2: ( ( type a= id_init ( COMMA b= id_init )* ) | ( LIST c= ID op_cond ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:120:2: ( ( type a= id_init ( COMMA b= id_init )* ) | ( LIST c= ID op_cond ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:120:3: ( type a= id_init ( COMMA b= id_init )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:120:3: ( type a= id_init ( COMMA b= id_init )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:120:4: type a= id_init ( COMMA b= id_init )*
                    {
                    pushFollow(FOLLOW_type_in_var296);
                    type5=type();

                    state._fsp--;


                        ((var_scope)var_stack.peek()).varType = type5;	
                    	
                    pushFollow(FOLLOW_id_init_in_var305);
                    a=id_init();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:124:13: ( COMMA b= id_init )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:124:14: COMMA b= id_init
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var308); 
                    	    pushFollow(FOLLOW_id_init_in_var312);
                    	    b=id_init();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }


                         if ((a!=null?a.idName:null) != null) {
                              names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.idName:null), type5, (a!=null?a.idLine:0)));
                         }
                      

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:131:3: ( LIST c= ID op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:131:3: ( LIST c= ID op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:131:4: LIST c= ID op_cond
                    {
                    match(input,LIST,FOLLOW_LIST_in_var328); 
                    c=(Token)match(input,ID,FOLLOW_ID_in_var334); 

                            if (names.isExist(((program_scope)program_stack.peek()).name + "." + (c!=null?c.getText():null))) {
                              errors.add("line "+(c!=null?c.getLine():0)+": name "+(c!=null?c.getText():null)+" duplicated");
                            } else {
                                names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (c!=null?c.getText():null), "List", (c!=null?c.getLine():0)));
                            }  
                      
                    pushFollow(FOLLOW_op_cond_in_var342);
                    op_cond();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var347); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )* ;
    public final String expr() throws RecognitionException {
        String idType = null;

        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:3: (a= math_exp ( MATHOPER b= math_exp )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:7: a= math_exp ( MATHOPER b= math_exp )*
            {
            pushFollow(FOLLOW_math_exp_in_expr371);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:18: ( MATHOPER b= math_exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MATHOPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:19: MATHOPER b= math_exp
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr374); 
            	    pushFollow(FOLLOW_math_exp_in_expr378);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:1: math_exp returns [String idType] : ( data_id | PAR_OPEN expr PAR_CLOSE );
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        String data_id6 = null;

        String expr7 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:3: ( data_id | PAR_OPEN expr PAR_CLOSE )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:7: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp406);
                    data_id6=data_id();

                    state._fsp--;


                        retval.idType = data_id6;
                      

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:7: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp418); 
                    pushFollow(FOLLOW_expr_in_math_exp420);
                    expr7=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp422); 

                        retval.idType = expr7;
                      

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:166:1: data returns [String idType] : ( INT | STRING | CHAR );
    public final String data() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:3: ( INT | STRING | CHAR )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_data446); 
                    idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_data461); 
                    idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:7: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_data472); 
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:1: data_id returns [String idType] : ( ID | data );
    public final String data_id() throws RecognitionException {
        String idType = null;

        Token ID8=null;
        String data9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:3: ( ID | data )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:7: ID
                    {
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_data_id501); 

                        if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID8!=null?ID8.getText():null))) {
                          errors.add("line "+(ID8!=null?ID8.getLine():0)+": name "+(ID8!=null?ID8.getText():null)+" cannot be resolved");
                        } else {
                          names.get(((program_scope)program_stack.peek()).name + "." + (ID8!=null?ID8.getText():null)).addLineUses((ID8!=null?ID8.getLine():0));   
                          idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID8!=null?ID8.getText():null)).getType();
                        }
                      

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:182:7: data
                    {
                    pushFollow(FOLLOW_data_in_data_id514);
                    data9=data();

                    state._fsp--;


                     	    idType = data9;
                     	

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:188:1: if_op : 'if' bool_cond fun_body 'else' fun_body ;
    public final void if_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:189:2: ( 'if' bool_cond fun_body 'else' fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:189:5: 'if' bool_cond fun_body 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_if_op536); 
            pushFollow(FOLLOW_bool_cond_in_if_op538);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op540);
            fun_body();

            state._fsp--;

            match(input,30,FOLLOW_30_in_if_op548); 
            pushFollow(FOLLOW_fun_body_in_if_op550);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:193:1: for_op : 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body ;
    public final void for_op() throws RecognitionException {
        Token a=null;
        Token b=null;
        String type10 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:2: ( 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:5: 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op565); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op567); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:20: ( INT | ( type a= ID 'in' b= ID ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:21: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op570); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:25: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:25: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:26: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op573);
                    type10=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op577); 
                    match(input,32,FOLLOW_32_in_for_op579); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op583); 

                    }


                    }
                    break;

            }


                if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                  errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" dublicated");
                } else {
                  names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), type10, (a!=null?a.getLine():0)));
                }
                if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                  errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                } else {
                  names.get(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                }
              
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op594); 
            pushFollow(FOLLOW_fun_body_in_for_op596);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:1: while_op : 'while' bool_cond fun_body ;
    public final void while_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:211:2: ( 'while' bool_cond fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:211:5: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op618); 
            pushFollow(FOLLOW_bool_cond_in_while_op620);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op622);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:1: bool_cond : PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE ;
    public final void bool_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:2: ( PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:7: PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond638); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:16: ( ( ID COMPROPER ID ) | fun_call )
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
            else if ( ((LA12_0>=34 && LA12_0<=35)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:17: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:17: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:18: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_bool_cond642); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond644); 
                    match(input,ID,FOLLOW_ID_in_bool_cond646); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:37: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond651);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond654); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:218:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final void brack_id() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:2: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:7: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id669); 
            match(input,ID,FOLLOW_ID_in_brack_id671); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id673); 

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


    // $ANTLR start "in_out_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:222:1: in_out_op returns [String idType] : ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) );
    public final String in_out_op() throws RecognitionException {
        String idType = null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:2: ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:5: ( 'out' op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:5: ( 'out' op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:6: 'out' op_cond
                    {
                    match(input,34,FOLLOW_34_in_in_out_op694); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op696);
                    op_cond();

                    state._fsp--;


                    }


                    	   idType = null;
                    	

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:6: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:6: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:7: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,35,FOLLOW_35_in_in_out_op710); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op712); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op714); 

                    }


                    	   idType = "String";
                    	

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
    // $ANTLR end "in_out_op"


    // $ANTLR start "fun_call"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:233:1: fun_call returns [String idType] : (a= ID op_cond | in_out_op );
    public final String fun_call() throws RecognitionException {
        String idType = null;

        Token a=null;
        String in_out_op11 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:2: (a= ID op_cond | in_out_op )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=34 && LA14_0<=35)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:7: a= ID op_cond
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call742); 
                    pushFollow(FOLLOW_op_cond_in_fun_call744);
                    op_cond();

                    state._fsp--;


                    		    if (!methods.isExist((a!=null?a.getText():null))) {
                    		      errors.add("line "+(a!=null?a.getLine():0)+": methon name "+(a!=null?a.getText():null)+" cannot be resolved");
                    		    } else {
                    		      idType = methods.get((a!=null?a.getText():null)).getReturnType();		   
                    		      methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));   
                    		    }	     
                    	

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:7: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call755);
                    in_out_op11=in_out_op();

                    state._fsp--;


                    	     idType = in_out_op11;
                    	

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
    // $ANTLR end "fun_call"


    // $ANTLR start "self_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:1: self_op : ( ID '.' )? fun_call ;
    public final void self_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:2: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:7: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:7: ( ID '.' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==36) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op773); 
                    match(input,36,FOLLOW_36_in_self_op774); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op778);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:253:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final void op_cond() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:2: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:4: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond789); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:13: ( cond_arg ( COMMA cond_arg )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=INT && LA17_0<=CHAR)||(LA17_0>=34 && LA17_0<=35)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:14: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond792);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:23: ( COMMA cond_arg )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:24: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond795); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond797);
                    	    cond_arg();

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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond803); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:257:1: cond_arg : ( data_id | self_op );
    public final void cond_arg() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:258:2: ( data_id | self_op )
            int alt18=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==PAR_OPEN||LA18_1==36) ) {
                    alt18=2;
                }
                else if ( (LA18_1==COMMA||LA18_1==PAR_CLOSE) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case STRING:
            case CHAR:
                {
                alt18=1;
                }
                break;
            case 34:
            case 35:
                {
                alt18=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:258:4: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_cond_arg814);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:258:14: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg818);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:261:1: ops : ( id_op | if_op | while_op | for_op | var );
    public final void ops() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:2: ( id_op | if_op | while_op | for_op | var )
            int alt19=5;
            switch ( input.LA(1) ) {
            case ID:
            case 34:
            case 35:
                {
                alt19=1;
                }
                break;
            case 29:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 31:
                {
                alt19=4;
                }
                break;
            case LIST:
            case 26:
            case 27:
            case 28:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops839);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops843);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops847);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops851);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:41: var
                    {
                    pushFollow(FOLLOW_var_in_ops855);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:265:1: id_op : ( id_assign | self_op | ( ID POSTFIX ) ) EOL ;
    public final void id_op() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:2: ( ( id_assign | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:6: ( id_assign | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:6: ( id_assign | self_op | ( ID POSTFIX ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt20=1;
                    }
                    break;
                case PAR_OPEN:
                case 36:
                    {
                    alt20=2;
                    }
                    break;
                case POSTFIX:
                    {
                    alt20=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA20_0>=34 && LA20_0<=35)) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:7: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_op871);
                    id_assign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:19: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op875);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:29: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:29: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:30: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op880); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op882); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op886); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:269:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final void main_fun() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:270:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:270:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun903); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun905); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun907); 
            pushFollow(FOLLOW_fun_body_in_main_fun909);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:1: fun_decl : ( type )? a= ID PAR_OPEN ( args )? PAR_CLOSE fun_body ;
    public final void fun_decl() throws RecognitionException {
        Token a=null;
        String type12 = null;

        String fun_body13 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:2: ( ( type )? a= ID PAR_OPEN ( args )? PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:4: ( type )? a= ID PAR_OPEN ( args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:4: ( type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:4: type
                    {
                    pushFollow(FOLLOW_type_in_fun_decl921);
                    type12=type();

                    state._fsp--;


                    }
                    break;

            }

            a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl926); 
             
            	     ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
            	     methods.add(methods.new Method(((program_scope)program_stack.peek()).name, type12));
            	  
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl936); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:13: ( args )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=26 && LA22_0<=28)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:13: args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl939);
                    args();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl942); 
            pushFollow(FOLLOW_fun_body_in_fun_decl944);
            fun_body13=fun_body();

            state._fsp--;


            	     if (type12 != null){
            	       if(fun_body13 == null) {
            	           errors.add("line "+(a!=null?a.getLine():0)+": method "+(a!=null?a.getText():null)+" missing return statement, expecting " + type12);
            	       }else if(!type12.equals(fun_body13)){
                        errors.add("line "+(a!=null?a.getLine():0)+": method "+(a!=null?a.getText():null)+" wrong type conversion cannot convert return type " + 
                                  fun_body13 + " to " + type12);
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
    // $ANTLR end "fun_decl"


    // $ANTLR start "args"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:292:1: args : type ID ( COMMA type ID )* ;
    public final void args() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:3: ( type ID ( COMMA type ID )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:5: type ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args963);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_args965); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:13: ( COMMA type ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:14: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args968); 
            	    pushFollow(FOLLOW_type_in_args970);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args972); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:296:1: fun_body returns [String returnType] : CUR_OPEN ( ops )* ( 'return' a= ID EOL )? CUR_CLOSE ;
    public final String fun_body() throws RecognitionException {
        String returnType = null;

        Token a=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:297:2: ( CUR_OPEN ( ops )* ( 'return' a= ID EOL )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:297:7: CUR_OPEN ( ops )* ( 'return' a= ID EOL )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body996); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:10: ( ops )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID||LA24_0==LIST||(LA24_0>=26 && LA24_0<=29)||LA24_0==31||(LA24_0>=33 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:10: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1007);
            	    ops();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:299:9: ( 'return' a= ID EOL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:299:10: 'return' a= ID EOL
                    {
                    match(input,37,FOLLOW_37_in_fun_body1019); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_body1023); 
                    match(input,EOL,FOLLOW_EOL_in_fun_body1025); 

                    }
                    break;

            }


            			       if((a!=null?a.getText():null)!= null){
            						    if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
            						      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" cannot be resolved");
            						    } else {
            	                names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            	                returnType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
            						    }			
            					   }         
            			     
            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1049); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return returnType;
    }
    // $ANTLR end "fun_body"

    // Delegated rules


 

    public static final BitSet FOLLOW_fun_decl_in_program43 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_var_in_program54 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_26_in_type88 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init148 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQUAL_in_id_init166 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_id_value_in_id_init168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign197 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign199 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_id_value_in_id_assign201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_id_value229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_value256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var305 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_var308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var312 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LIST_in_var328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var334 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_var342 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_var347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr371 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_MATHOPER_in_expr374 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_math_exp_in_expr378 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_data_id_in_math_exp406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp418 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_expr_in_math_exp420 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op536 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_if_op538 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op540 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_if_op548 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op565 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op567 = new BitSet(new long[]{0x000000001C001000L});
    public static final BitSet FOLLOW_INT_in_for_op570 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_for_op573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op577 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op579 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op583 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op594 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op618 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_while_op620 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond638 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_ID_in_bool_cond642 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_bool_cond646 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond651 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id669 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id671 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op694 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op710 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op712 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call742 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_fun_call744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op773 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_self_op774 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_fun_call_in_self_op778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond789 = new BitSet(new long[]{0x0000000C00007C10L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond792 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_COMMA_in_op_cond795 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond797 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_cond_arg814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_ops855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_op871 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_self_op_in_id_op875 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_id_op880 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op882 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_id_op886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun903 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun905 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun907 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl926 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl936 = new BitSet(new long[]{0x000000001C000800L});
    public static final BitSet FOLLOW_args_in_fun_decl939 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl942 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args965 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_args968 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args970 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args972 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body996 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_ops_in_fun_body1007 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_37_in_fun_body1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_body1023 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_fun_body1025 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1049 = new BitSet(new long[]{0x0000000000000002L});

}