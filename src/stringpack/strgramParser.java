// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-23 21:56:40

  package stringpack;
  import org.antlr.stringtemplate.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
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

    protected static class slist_scope {
        List locals;
        // must be defined one per semicolon
            List stats;
    }
    protected Stack slist_stack = new Stack();


        public strgramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public strgramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("strgramParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return strgramParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g"; }

    	
      protected NamesTable names = new NamesTable();
      protected MethodTable methods = new MethodTable();
      protected ArrayList<String> errors = new ArrayList<String>(); 

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

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:28:1: program : ( fun_decl | var )+ ;
    public final strgramParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        strgramParser.program_return retval = new strgramParser.program_return();
        retval.start = input.LT(1);

        ((program_scope)program_stack.peek()).name = "[global]";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:33:3: ( ( fun_decl | var )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:33:5: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:33:5: ( fun_decl | var )+
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:33:7: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program56);
            	    fun_decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:34:7: var
            	    {
            	    ((program_scope)program_stack.peek()).name = "[global]";
            	    pushFollow(FOLLOW_var_in_program67);
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
            program_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class type_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:38:2: type returns [String idType] : ( 'Int' | 'String' | 'Char' );
    public final strgramParser.type_return type() throws RecognitionException {
        strgramParser.type_return retval = new strgramParser.type_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:39:3: ( 'Int' | 'String' | 'Char' )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:39:8: 'Int'
                    {
                    match(input,26,FOLLOW_26_in_type101); 
                    retval.idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:40:8: 'String'
                    {
                    match(input,27,FOLLOW_27_in_type116); 
                    retval.idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:41:8: 'Char'
                    {
                    match(input,28,FOLLOW_28_in_type129); 
                    retval.idType = "Char";

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
    // $ANTLR end "type"

    public static class id_init_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_init"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:44:1: id_init : a= ID ( EQUAL id_value )? ;
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.id_value_return id_value1 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:45:3: (a= ID ( EQUAL id_value )? )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:45:7: a= ID ( EQUAL id_value )?
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_init158); 

                   if ((a!=null?a.getText():null) != null) {
                    if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                        errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                    } else {
            	          names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), ((var_scope)var_stack.peek()).varType, (a!=null?a.getLine():0)));
            			    }
                    }
                  
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:7: ( EQUAL id_value )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:8: EQUAL id_value
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init176); 
                    pushFollow(FOLLOW_id_value_in_id_init178);
                    id_value1=id_value();

                    state._fsp--;


                    }
                    break;

            }


                    if ((id_value1!=null?id_value1.idType:null) != null){
                        String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
                        if (!varType.equals((id_value1!=null?id_value1.idType:null))) {
                          errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + (id_value1!=null?id_value1.idType:null) + " to " + varType);
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

    public static class id_assign_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_assign"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:1: id_assign : a= ID EQUAL id_value ;
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.id_value_return id_value2 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:2: (a= ID EQUAL id_value )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:4: a= ID EQUAL id_value
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign207); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign209); 
            pushFollow(FOLLOW_id_value_in_id_assign211);
            id_value2=id_value();

            state._fsp--;


                        if (!names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                          errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" not exist");
                        } else {
                          names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            	            String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
            	            if (!varType.equals((id_value2!=null?id_value2.idType:null))) {
            	              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + (id_value2!=null?id_value2.idType:null) + " to " + varType);
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
    // $ANTLR end "id_assign"

    public static class id_value_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_value"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:84:1: id_value returns [String idType] : ( expr | fun_call );
    public final strgramParser.id_value_return id_value() throws RecognitionException {
        strgramParser.id_value_return retval = new strgramParser.id_value_return();
        retval.start = input.LT(1);

        strgramParser.expr_return expr3 = null;

        strgramParser.fun_call_return fun_call4 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:85:3: ( expr | fun_call )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:86:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_id_value239);
                    expr3=expr();

                    state._fsp--;


                            retval.idType = (expr3!=null?expr3.idType:null);
                          

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:91:7: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_id_value266);
                    fun_call4=fun_call();

                    state._fsp--;


                            retval.idType = (fun_call4!=null?fun_call4.idType:null);  
                          

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
    // $ANTLR end "id_value"

    protected static class var_scope {
        String varType;
    }
    protected Stack var_stack = new Stack();

    public static class var_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:1: var : ( ( type id_init ( COMMA id_init )* ) | ( LIST a= ID op_cond ) ) EOL ;
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.type_return type5 = null;


        ((var_scope)var_stack.peek()).varType = "";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:2: ( ( ( type id_init ( COMMA id_init )* ) | ( LIST a= ID op_cond ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:2: ( ( type id_init ( COMMA id_init )* ) | ( LIST a= ID op_cond ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:2: ( ( type id_init ( COMMA id_init )* ) | ( LIST a= ID op_cond ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:3: ( type id_init ( COMMA id_init )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:3: ( type id_init ( COMMA id_init )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:4: type id_init ( COMMA id_init )*
                    {
                    pushFollow(FOLLOW_type_in_var306);
                    type5=type();

                    state._fsp--;


                        ((var_scope)var_stack.peek()).varType = (type5!=null?type5.idType:null);	
                    	
                    pushFollow(FOLLOW_id_init_in_var312);
                    id_init();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:108:10: ( COMMA id_init )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:108:11: COMMA id_init
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var315); 
                    	    pushFollow(FOLLOW_id_init_in_var317);
                    	    id_init();

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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:111:3: ( LIST a= ID op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:111:3: ( LIST a= ID op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:111:4: LIST a= ID op_cond
                    {
                    match(input,LIST,FOLLOW_LIST_in_var331); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_var337); 

                            if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                            } else {
                                names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), "List", (a!=null?a.getLine():0)));
                            }  
                      
                    pushFollow(FOLLOW_op_cond_in_var345);
                    op_cond();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var350); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            var_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "var"

    public static class expr_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:124:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )* ;
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:3: (a= math_exp ( MATHOPER b= math_exp )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:7: a= math_exp ( MATHOPER b= math_exp )*
            {
            pushFollow(FOLLOW_math_exp_in_expr374);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:18: ( MATHOPER b= math_exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MATHOPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:125:19: MATHOPER b= math_exp
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr377); 
            	    pushFollow(FOLLOW_math_exp_in_expr381);
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
                  retval.idType = (a!=null?a.idType:null);
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
    // $ANTLR end "expr"

    public static class math_exp_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "math_exp"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:1: math_exp returns [String idType] : ( data_id | PAR_OPEN expr PAR_CLOSE );
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return data_id6 = null;

        strgramParser.expr_return expr7 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:3: ( data_id | PAR_OPEN expr PAR_CLOSE )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:7: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp409);
                    data_id6=data_id();

                    state._fsp--;


                        retval.idType = (data_id6!=null?data_id6.idType:null);
                      

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:7: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp421); 
                    pushFollow(FOLLOW_expr_in_math_exp423);
                    expr7=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp425); 

                        retval.idType = (expr7!=null?expr7.idType:null);
                      

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

    public static class data_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "data"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:1: data returns [String idType] : ( INT | STRING | CHAR );
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:3: ( INT | STRING | CHAR )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:7: INT
                    {
                    match(input,INT,FOLLOW_INT_in_data449); 
                    retval.idType = "Int";

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:7: STRING
                    {
                    match(input,STRING,FOLLOW_STRING_in_data464); 
                    retval.idType = "String";

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:7: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_data475); 
                    retval.idType = "Char";

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
    // $ANTLR end "data"

    public static class data_id_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "data_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:1: data_id returns [String idType] : ( ID | data );
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID8=null;
        strgramParser.data_return data9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:3: ( ID | data )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:7: ID
                    {
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_data_id504); 

                        if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID8!=null?ID8.getText():null))) {
                          errors.add("line "+(ID8!=null?ID8.getLine():0)+": name "+(ID8!=null?ID8.getText():null)+" cannot be resolved");
                        } else {
                          names.get(((program_scope)program_stack.peek()).name + "." + (ID8!=null?ID8.getText():null)).addLineUses((ID8!=null?ID8.getLine():0));   
                          retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID8!=null?ID8.getText():null)).getType();
                        }
                      

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:7: data
                    {
                    pushFollow(FOLLOW_data_in_data_id517);
                    data9=data();

                    state._fsp--;


                     	    retval.idType = (data9!=null?data9.idType:null);
                     	

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
    // $ANTLR end "data_id"

    public static class if_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "if_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:1: if_op : 'if' bool_cond fun_body 'else' fun_body ;
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:2: ( 'if' bool_cond fun_body 'else' fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:5: 'if' bool_cond fun_body 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_if_op539); 
            pushFollow(FOLLOW_bool_cond_in_if_op541);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op543);
            fun_body();

            state._fsp--;

            match(input,30,FOLLOW_30_in_if_op551); 
            pushFollow(FOLLOW_fun_body_in_if_op553);
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
    // $ANTLR end "if_op"

    public static class for_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:1: for_op : 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body ;
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        strgramParser.type_return type10 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:2: ( 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:5: 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op568); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op570); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:20: ( INT | ( type a= ID 'in' b= ID ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:21: INT
                    {
                    match(input,INT,FOLLOW_INT_in_for_op573); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:25: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:25: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:26: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op576);
                    type10=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op580); 
                    match(input,32,FOLLOW_32_in_for_op582); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op586); 

                    }


                    }
                    break;

            }


                if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                  errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" dublicated");
                } else {
                  names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type10!=null?type10.idType:null), (a!=null?a.getLine():0)));
                }
                if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                  errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                } else {
                  names.get(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                }
              
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op597); 
            pushFollow(FOLLOW_fun_body_in_for_op599);
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

    public static class while_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "while_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:190:1: while_op : 'while' bool_cond fun_body ;
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:2: ( 'while' bool_cond fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:5: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op621); 
            pushFollow(FOLLOW_bool_cond_in_while_op623);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op625);
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
    // $ANTLR end "while_op"

    public static class bool_cond_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bool_cond"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:1: bool_cond : PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE ;
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:195:2: ( PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:195:7: PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond641); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:195:16: ( ( ID COMPROPER ID ) | fun_call )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:195:17: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:195:17: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:195:18: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_bool_cond645); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond647); 
                    match(input,ID,FOLLOW_ID_in_bool_cond649); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:195:37: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond654);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond657); 

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
    // $ANTLR end "bool_cond"

    public static class brack_id_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "brack_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:199:2: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:199:7: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id672); 
            match(input,ID,FOLLOW_ID_in_brack_id674); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id676); 

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
    // $ANTLR end "brack_id"

    public static class in_out_op_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "in_out_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:1: in_out_op returns [String idType] : ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) );
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:203:2: ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:203:5: ( 'out' op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:203:5: ( 'out' op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:203:6: 'out' op_cond
                    {
                    match(input,34,FOLLOW_34_in_in_out_op697); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op699);
                    op_cond();

                    state._fsp--;


                    }


                    	   retval.idType = null;
                    	

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:207:6: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:207:6: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:207:7: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,35,FOLLOW_35_in_in_out_op713); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op715); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op717); 

                    }


                    	   retval.idType = "String";
                    	

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
    // $ANTLR end "in_out_op"

    public static class fun_call_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_call"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:1: fun_call returns [String idType] : (a= ID op_cond | in_out_op );
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.in_out_op_return in_out_op11 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:2: (a= ID op_cond | in_out_op )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:7: a= ID op_cond
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call745); 
                    pushFollow(FOLLOW_op_cond_in_fun_call747);
                    op_cond();

                    state._fsp--;


                    		    if (!methods.isExist((a!=null?a.getText():null))) {
                    		      errors.add("line "+(a!=null?a.getLine():0)+": methon name "+(a!=null?a.getText():null)+" cannot be resolved");
                    		    } else {
                    		      retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();		   
                    		      methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));   
                    		    }	     
                    	

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:7: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call758);
                    in_out_op11=in_out_op();

                    state._fsp--;


                    	     retval.idType = (in_out_op11!=null?in_out_op11.idType:null);
                    	

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
    // $ANTLR end "fun_call"

    public static class self_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "self_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:229:1: self_op : ( ID '.' )? fun_call ;
    public final strgramParser.self_op_return self_op() throws RecognitionException {
        strgramParser.self_op_return retval = new strgramParser.self_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:2: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:7: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:7: ( ID '.' )?
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op776); 
                    match(input,36,FOLLOW_36_in_self_op777); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op781);
            fun_call();

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
    // $ANTLR end "self_op"

    public static class op_cond_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "op_cond"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:233:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:2: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:4: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond792); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:13: ( cond_arg ( COMMA cond_arg )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=INT && LA17_0<=CHAR)||(LA17_0>=34 && LA17_0<=35)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:14: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond795);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:23: ( COMMA cond_arg )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:24: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond798); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond800);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond806); 

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
    // $ANTLR end "op_cond"

    public static class cond_arg_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "cond_arg"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:237:1: cond_arg : ( data_id | self_op );
    public final strgramParser.cond_arg_return cond_arg() throws RecognitionException {
        strgramParser.cond_arg_return retval = new strgramParser.cond_arg_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:2: ( data_id | self_op )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:4: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_cond_arg817);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:14: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg821);
                    self_op();

                    state._fsp--;


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
    // $ANTLR end "cond_arg"

    public static class ops_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ops"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:241:1: ops : ( id_op | if_op | while_op | for_op | var );
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:2: ( id_op | if_op | while_op | for_op | var )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:5: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops842);
                    id_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:13: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops846);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:21: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops850);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:32: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops854);
                    for_op();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:41: var
                    {
                    pushFollow(FOLLOW_var_in_ops858);
                    var();

                    state._fsp--;


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
    // $ANTLR end "ops"

    public static class id_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:245:1: id_op : ( id_assign | self_op | ( ID POSTFIX ) ) EOL ;
    public final strgramParser.id_op_return id_op() throws RecognitionException {
        strgramParser.id_op_return retval = new strgramParser.id_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:2: ( ( id_assign | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:6: ( id_assign | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:6: ( id_assign | self_op | ( ID POSTFIX ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:7: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_op874);
                    id_assign();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:19: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op878);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:29: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:29: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:30: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op883); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op885); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op889); 

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
    // $ANTLR end "id_op"

    public static class main_fun_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_fun"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun906); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun908); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun910); 
            pushFollow(FOLLOW_fun_body_in_main_fun912);
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
    // $ANTLR end "main_fun"

    public static class fun_decl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_decl"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:253:1: fun_decl : ( type )? a= ID PAR_OPEN ( args )? PAR_CLOSE fun_body ;
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        strgramParser.fun_decl_return retval = new strgramParser.fun_decl_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.type_return type12 = null;

        strgramParser.fun_body_return fun_body13 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:2: ( ( type )? a= ID PAR_OPEN ( args )? PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:4: ( type )? a= ID PAR_OPEN ( args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:4: ( type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:4: type
                    {
                    pushFollow(FOLLOW_type_in_fun_decl924);
                    type12=type();

                    state._fsp--;


                    }
                    break;

            }

            a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl929); 
             
            	     ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
            	     methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type12!=null?type12.idType:null)));
            	  
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl939); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:259:13: ( args )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=26 && LA22_0<=28)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:259:13: args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl942);
                    args();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl945); 
            pushFollow(FOLLOW_fun_body_in_fun_decl947);
            fun_body13=fun_body();

            state._fsp--;


            	     if ((type12!=null?type12.idType:null) != null){
            	       if((fun_body13!=null?fun_body13.returnType:null) == null) {
            	           errors.add("line "+(a!=null?a.getLine():0)+": method "+(a!=null?a.getText():null)+" missing return statement, expecting " + (type12!=null?type12.idType:null));
            	       }else if(!(type12!=null?type12.idType:null).equals((fun_body13!=null?fun_body13.returnType:null))){
                        errors.add("line "+(a!=null?a.getLine():0)+": method "+(a!=null?a.getText():null)+" wrong type conversion cannot convert return type " + 
                                  (fun_body13!=null?fun_body13.returnType:null) + " to " + (type12!=null?type12.idType:null));
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
    // $ANTLR end "fun_decl"

    public static class args_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "args"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:272:1: args : type ID ( COMMA type ID )* ;
    public final strgramParser.args_return args() throws RecognitionException {
        strgramParser.args_return retval = new strgramParser.args_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:3: ( type ID ( COMMA type ID )* )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:5: type ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args966);
            type();

            state._fsp--;

            match(input,ID,FOLLOW_ID_in_args968); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:13: ( COMMA type ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:14: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args971); 
            	    pushFollow(FOLLOW_type_in_args973);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args975); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


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
    // $ANTLR end "args"

    public static class fun_body_return extends ParserRuleReturnScope {
        public String returnType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_body"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:276:1: fun_body returns [String returnType] : CUR_OPEN ( ops )* ( 'return' a= ID EOL )? CUR_CLOSE ;
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        Token a=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:277:2: ( CUR_OPEN ( ops )* ( 'return' a= ID EOL )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:277:7: CUR_OPEN ( ops )* ( 'return' a= ID EOL )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body999); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:278:10: ( ops )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID||LA24_0==LIST||(LA24_0>=26 && LA24_0<=29)||LA24_0==31||(LA24_0>=33 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:278:10: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1010);
            	    ops();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:9: ( 'return' a= ID EOL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:10: 'return' a= ID EOL
                    {
                    match(input,37,FOLLOW_37_in_fun_body1022); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_body1026); 
                    match(input,EOL,FOLLOW_EOL_in_fun_body1028); 

                    }
                    break;

            }


            			       if((a!=null?a.getText():null)!= null){
            						    if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
            						      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" cannot be resolved");
            						    } else {
            	                names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            	                retval.returnType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
            						    }			
            					   }         
            			     
            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1052); 

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
    // $ANTLR end "fun_body"

    // Delegated rules


 

    public static final BitSet FOLLOW_fun_decl_in_program56 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_var_in_program67 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_26_in_type101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init158 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQUAL_in_id_init176 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_id_value_in_id_init178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign207 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign209 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_id_value_in_id_assign211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_id_value239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_value266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var306 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var312 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_var315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var317 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LIST_in_var331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var337 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_var345 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_var350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr374 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_MATHOPER_in_expr377 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_math_exp_in_expr381 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_data_id_in_math_exp409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp421 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_expr_in_math_exp423 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op539 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_if_op541 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op543 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_if_op551 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op568 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op570 = new BitSet(new long[]{0x000000001C001000L});
    public static final BitSet FOLLOW_INT_in_for_op573 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_for_op576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op580 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op586 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op597 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op621 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_while_op623 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond641 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_ID_in_bool_cond645 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_bool_cond649 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond654 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id674 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op697 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op713 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op715 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call745 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_fun_call747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op776 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_self_op777 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_fun_call_in_self_op781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond792 = new BitSet(new long[]{0x0000000C00007C10L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond795 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_COMMA_in_op_cond798 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond800 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_cond_arg817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_ops858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_op874 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_self_op_in_id_op878 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_id_op883 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op885 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_id_op889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun906 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun908 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl929 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl939 = new BitSet(new long[]{0x000000001C000800L});
    public static final BitSet FOLLOW_args_in_fun_decl942 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl945 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args968 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_args971 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args975 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body999 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_ops_in_fun_body1010 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_37_in_fun_body1022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_body1026 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_fun_body1028 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1052 = new BitSet(new long[]{0x0000000000000002L});

}