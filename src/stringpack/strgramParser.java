// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-24 22:12:33

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
        List globals;
        List functions;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:28:1: program : ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functions);
    public final strgramParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        strgramParser.program_return retval = new strgramParser.program_return();
        retval.start = input.LT(1);

        strgramParser.fun_decl_return fun_decl1 = null;

        strgramParser.var_return var2 = null;



          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();
          ((program_scope)program_stack.peek()).name = "[global]";
         
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:39:3: ( ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functions))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:40:5: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:40:5: ( fun_decl | var )+
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

                        if ( ((LA1_7>=EQUAL && LA1_7<=COMMA)||LA1_7==EOL) ) {
                            alt1=2;
                        }
                        else if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }


                    }


                    }
                    break;
                case 27:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( ((LA1_7>=EQUAL && LA1_7<=COMMA)||LA1_7==EOL) ) {
                            alt1=2;
                        }
                        else if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
                        }


                    }


                    }
                    break;
                case 28:
                    {
                    int LA1_4 = input.LA(2);

                    if ( (LA1_4==ID) ) {
                        int LA1_7 = input.LA(3);

                        if ( ((LA1_7>=EQUAL && LA1_7<=COMMA)||LA1_7==EOL) ) {
                            alt1=2;
                        }
                        else if ( (LA1_7==PAR_OPEN) ) {
                            alt1=1;
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:40:7: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program65);
            	    fun_decl1=fun_decl();

            	    state._fsp--;

            	    ((program_scope)program_stack.peek()).functions.add((fun_decl1!=null?fun_decl1.st:null));

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:42:7: var
            	    {
            	    ((program_scope)program_stack.peek()).name = "[global]";
            	    pushFollow(FOLLOW_var_in_program91);
            	    var2=var();

            	    state._fsp--;

            	    ((program_scope)program_stack.peek()).globals.add((var2!=null?var2.st:null));

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



            // TEMPLATE REWRITE
            // 46:5: -> program(globals=$program::globalsfunctions=$program::functions)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("functions", ((program_scope)program_stack.peek()).functions));
            }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:49:2: type returns [String idType] : ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char());
    public final strgramParser.type_return type() throws RecognitionException {
        strgramParser.type_return retval = new strgramParser.type_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:50:3: ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char())
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
                    match(input,26,FOLLOW_26_in_type150); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 50:41: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:51:8: 'String'
                    {
                    match(input,27,FOLLOW_27_in_type175); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 51:41: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:52:8: 'Char'
                    {
                    match(input,28,FOLLOW_28_in_type194); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 52:41: -> type_char()
                    {
                        retval.st = templateLib.getInstanceOf("type_char");
                    }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:1: id_init : (a= ID -> {new StringTemplate($a.text)} | id_assign -> {$id_assign.st});
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.id_assign_return id_assign3 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:56:3: (a= ID -> {new StringTemplate($a.text)} | id_assign -> {$id_assign.st})
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==EQUAL) ) {
                    alt3=2;
                }
                else if ( (LA3_1==COMMA||LA3_1==EOL) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:57:7: a= ID
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_id_init239); 

                           if ((a!=null?a.getText():null) != null) {
                            if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                                errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                            } else {
                    	          names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), ((var_scope)var_stack.peek()).varType, (a!=null?a.getLine():0)));
                    			    }
                            }
                          


                    // TEMPLATE REWRITE
                    // 67:7: -> {new StringTemplate($a.text)}
                    {
                        retval.st = new StringTemplate((a!=null?a.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:7: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_init274);
                    id_assign3=id_assign();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 70:7: -> {$id_assign.st}
                    {
                        retval.st = (id_assign3!=null?id_assign3.st:null);
                    }


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
    // $ANTLR end "id_init"

    public static class id_assign_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_assign"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:75:1: id_assign : a= ID EQUAL id_value -> assign(lhs=$a.textrhs=$id_value.st);
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.id_value_return id_value4 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:2: (a= ID EQUAL id_value -> assign(lhs=$a.textrhs=$id_value.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:77:2: a= ID EQUAL id_value
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign314); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign316); 
            pushFollow(FOLLOW_id_value_in_id_assign318);
            id_value4=id_value();

            state._fsp--;


            	   
                        if (!names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                          errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" not exist");
                        } else {
                          names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
            	            String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
            	            if (!varType.equals((id_value4!=null?id_value4.idType:null))) {
            	              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + (id_value4!=null?id_value4.idType:null) + " to " + varType);
            	            }
                        }
            	


            // TEMPLATE REWRITE
            // 90:2: -> assign(lhs=$a.textrhs=$id_value.st)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("lhs", (a!=null?a.getText():null)).put("rhs", (id_value4!=null?id_value4.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:1: id_value returns [String idType] : ( expr -> {$expr.st} | fun_call -> {$fun_call.st});
    public final strgramParser.id_value_return id_value() throws RecognitionException {
        strgramParser.id_value_return retval = new strgramParser.id_value_return();
        retval.start = input.LT(1);

        strgramParser.expr_return expr5 = null;

        strgramParser.fun_call_return fun_call6 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:94:3: ( expr -> {$expr.st} | fun_call -> {$fun_call.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:95:7: expr
                    {
                    pushFollow(FOLLOW_expr_in_id_value361);
                    expr5=expr();

                    state._fsp--;


                            retval.idType = (expr5!=null?expr5.idType:null);
                          


                    // TEMPLATE REWRITE
                    // 99:7: -> {$expr.st}
                    {
                        retval.st = (expr5!=null?expr5.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:101:7: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_id_value398);
                    fun_call6=fun_call();

                    state._fsp--;


                            retval.idType = (fun_call6!=null?fun_call6.idType:null);  
                          


                    // TEMPLATE REWRITE
                    // 105:7: -> {$fun_call.st}
                    {
                        retval.st = (fun_call6!=null?fun_call6.st:null);
                    }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:109:1: var : ( ( type b+= id_init ( COMMA b+= id_init )* ) | ( LIST a= ID op_cond ) ) EOL -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b);
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.type_return type7 = null;

        RuleReturnScope b = null;
        ((var_scope)var_stack.peek()).varType = "";
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:114:2: ( ( ( type b+= id_init ( COMMA b+= id_init )* ) | ( LIST a= ID op_cond ) ) EOL -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:2: ( ( type b+= id_init ( COMMA b+= id_init )* ) | ( LIST a= ID op_cond ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:2: ( ( type b+= id_init ( COMMA b+= id_init )* ) | ( LIST a= ID op_cond ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:3: ( type b+= id_init ( COMMA b+= id_init )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:3: ( type b+= id_init ( COMMA b+= id_init )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:4: type b+= id_init ( COMMA b+= id_init )*
                    {
                    pushFollow(FOLLOW_type_in_var448);
                    type7=type();

                    state._fsp--;


                        ((var_scope)var_stack.peek()).varType = (type7!=null?type7.idType:null);	
                    	
                    pushFollow(FOLLOW_id_init_in_var456);
                    b=id_init();

                    state._fsp--;

                    if (list_b==null) list_b=new ArrayList();
                    list_b.add(b.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:13: ( COMMA b+= id_init )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:14: COMMA b+= id_init
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var459); 
                    	    pushFollow(FOLLOW_id_init_in_var463);
                    	    b=id_init();

                    	    state._fsp--;

                    	    if (list_b==null) list_b=new ArrayList();
                    	    list_b.add(b.getTemplate());


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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:3: ( LIST a= ID op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:3: ( LIST a= ID op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:4: LIST a= ID op_cond
                    {
                    match(input,LIST,FOLLOW_LIST_in_var476); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_var482); 

                            if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                            } else {
                                names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), "List", (a!=null?a.getLine():0)));
                            }  
                      
                    pushFollow(FOLLOW_op_cond_in_var490);
                    op_cond();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var495); 


            // TEMPLATE REWRITE
            // 131:9: -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b)
            if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("globalVariable",
              new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", list_b));
            }
            else // 133:9: -> variable(type=$type.stname=$b)
            {
                retval.st = templateLib.getInstanceOf("variable",
              new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", list_b));
            }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )* -> {$a.st};
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:3: (a= math_exp ( MATHOPER b= math_exp )* -> {$a.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:7: a= math_exp ( MATHOPER b= math_exp )*
            {
            pushFollow(FOLLOW_math_exp_in_expr572);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:18: ( MATHOPER b= math_exp )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MATHOPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:19: MATHOPER b= math_exp
            	    {
            	    match(input,MATHOPER,FOLLOW_MATHOPER_in_expr575); 
            	    pushFollow(FOLLOW_math_exp_in_expr579);
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
              


            // TEMPLATE REWRITE
            // 145:3: -> {$a.st}
            {
                retval.st = (a!=null?a.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st});
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return data_id8 = null;

        strgramParser.expr_return expr9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:150:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp617);
                    data_id8=data_id();

                    state._fsp--;


                        retval.idType = (data_id8!=null?data_id8.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 155:3: -> {$data_id.st}
                    {
                        retval.st = (data_id8!=null?data_id8.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:7: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp635); 
                    pushFollow(FOLLOW_expr_in_math_exp637);
                    expr9=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp639); 

                        retval.idType = (expr9!=null?expr9.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 160:3: -> {$expr.st}
                    {
                        retval.st = (expr9!=null?expr9.st:null);
                    }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:1: data returns [String idType] : ( INT -> {new StringTemplate($INT.text)} | STRING -> {new StringTemplate($STRING.text)} | CHAR -> {new StringTemplate($CHAR.text)});
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT10=null;
        Token STRING11=null;
        Token CHAR12=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:3: ( INT -> {new StringTemplate($INT.text)} | STRING -> {new StringTemplate($STRING.text)} | CHAR -> {new StringTemplate($CHAR.text)})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:7: INT
                    {
                    INT10=(Token)match(input,INT,FOLLOW_INT_in_data669); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 164:37: -> {new StringTemplate($INT.text)}
                    {
                        retval.st = new StringTemplate((INT10!=null?INT10.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:7: STRING
                    {
                    STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_data690); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 165:37: -> {new StringTemplate($STRING.text)}
                    {
                        retval.st = new StringTemplate((STRING11!=null?STRING11.getText():null));
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:166:7: CHAR
                    {
                    CHAR12=(Token)match(input,CHAR,FOLLOW_CHAR_in_data705); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 166:37: -> {new StringTemplate($CHAR.text)}
                    {
                        retval.st = new StringTemplate((CHAR12!=null?CHAR12.getText():null));
                    }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:1: data_id returns [String idType] : ( ID -> {new StringTemplate($ID.text)} | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID13=null;
        strgramParser.data_return data14 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:3: ( ID -> {new StringTemplate($ID.text)} | data -> {$data.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:3: ID
                    {
                    ID13=(Token)match(input,ID,FOLLOW_ID_in_data_id743); 

                        if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID13!=null?ID13.getText():null))) {
                          errors.add("line "+(ID13!=null?ID13.getLine():0)+": name "+(ID13!=null?ID13.getText():null)+" cannot be resolved");
                        } else {
                          names.get(((program_scope)program_stack.peek()).name + "." + (ID13!=null?ID13.getText():null)).addLineUses((ID13!=null?ID13.getLine():0));   
                          retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID13!=null?ID13.getText():null)).getType();
                        }
                      


                    // TEMPLATE REWRITE
                    // 180:3: -> {new StringTemplate($ID.text)}
                    {
                        retval.st = new StringTemplate((ID13!=null?ID13.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:182:3: data
                    {
                    pushFollow(FOLLOW_data_in_data_id765);
                    data14=data();

                    state._fsp--;


                     	    retval.idType = (data14!=null?data14.idType:null);
                     	


                    // TEMPLATE REWRITE
                    // 186:3: -> {$data.st}
                    {
                        retval.st = (data14!=null?data14.st:null);
                    }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:189:1: if_op : 'if' bool_cond fun_body 'else' fun_body ;
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:190:2: ( 'if' bool_cond fun_body 'else' fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:190:5: 'if' bool_cond fun_body 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_if_op793); 
            pushFollow(FOLLOW_bool_cond_in_if_op795);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op797);
            fun_body();

            state._fsp--;

            match(input,30,FOLLOW_30_in_if_op805); 
            pushFollow(FOLLOW_fun_body_in_if_op807);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:1: for_op : 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_op(e1=\"int i = 0\"e2=\"; i < \" + $INT.texte3=\" i++\"locals=$slist::localsstats=$slist::stats);
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token INT16=null;
        strgramParser.type_return type15 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:200:2: ( 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_op(e1=\"int i = 0\"e2=\"; i < \" + $INT.texte3=\" i++\"locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:201:2: 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op834); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op836); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:2: ( INT | ( type a= ID 'in' b= ID ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:3: INT
                    {
                    INT16=(Token)match(input,INT,FOLLOW_INT_in_for_op841); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:2: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:2: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:3: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op848);
                    type15=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op852); 
                    match(input,32,FOLLOW_32_in_for_op854); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op858); 

                    }


                    }
                    break;

            }


                if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                  errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" dublicated");
                } else {
                  names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type15!=null?type15.idType:null), (a!=null?a.getLine():0)));
                }
                if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                  errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                } else {
                  names.get(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                }
              
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op869); 
            pushFollow(FOLLOW_fun_body_in_for_op871);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 218:9: -> for_op(e1=\"int i = 0\"e2=\"; i < \" + $INT.texte3=\" i++\"locals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("for_op",
              new STAttrMap().put("e1", "int i = 0").put("e2", "; i < " + (INT16!=null?INT16.getText():null)).put("e3", " i++").put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:222:1: while_op : 'while' bool_cond fun_body ;
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:2: ( 'while' bool_cond fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:5: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op947); 
            pushFollow(FOLLOW_bool_cond_in_while_op949);
            bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op951);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:1: bool_cond : PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE ;
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:2: ( PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:7: PAR_OPEN ( ( ID COMPROPER ID ) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond967); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:16: ( ( ID COMPROPER ID ) | fun_call )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:17: ( ID COMPROPER ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:17: ( ID COMPROPER ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:18: ID COMPROPER ID
                    {
                    match(input,ID,FOLLOW_ID_in_bool_cond971); 
                    match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond973); 
                    match(input,ID,FOLLOW_ID_in_bool_cond975); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:37: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond980);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond983); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:2: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:7: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id998); 
            match(input,ID,FOLLOW_ID_in_brack_id1000); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1002); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:1: in_out_op returns [String idType] : ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) );
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:2: ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:5: ( 'out' op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:5: ( 'out' op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:6: 'out' op_cond
                    {
                    match(input,34,FOLLOW_34_in_in_out_op1023); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op1025);
                    op_cond();

                    state._fsp--;


                    }


                    	   retval.idType = null;
                    	

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:6: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:6: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:7: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,35,FOLLOW_35_in_in_out_op1039); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1041); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1043); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:245:1: fun_call returns [String idType] : (a= ID op_cond | in_out_op );
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.in_out_op_return in_out_op17 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:2: (a= ID op_cond | in_out_op )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:7: a= ID op_cond
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1071); 
                    pushFollow(FOLLOW_op_cond_in_fun_call1073);
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:255:7: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1084);
                    in_out_op17=in_out_op();

                    state._fsp--;


                    	     retval.idType = (in_out_op17!=null?in_out_op17.idType:null);
                    	

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:261:1: self_op : ( ID '.' )? fun_call ;
    public final strgramParser.self_op_return self_op() throws RecognitionException {
        strgramParser.self_op_return retval = new strgramParser.self_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:2: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:7: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:7: ( ID '.' )?
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:8: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op1102); 
                    match(input,36,FOLLOW_36_in_self_op1103); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op1107);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:265:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:2: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:4: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1118); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:13: ( cond_arg ( COMMA cond_arg )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID||(LA17_0>=INT && LA17_0<=CHAR)||(LA17_0>=34 && LA17_0<=35)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:14: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond1121);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:23: ( COMMA cond_arg )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMA) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:266:24: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1124); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond1126);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1132); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:269:1: cond_arg : ( data_id | self_op );
    public final strgramParser.cond_arg_return cond_arg() throws RecognitionException {
        strgramParser.cond_arg_return retval = new strgramParser.cond_arg_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:270:2: ( data_id | self_op )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:270:4: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_cond_arg1143);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:270:14: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg1147);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:1: ops : ( id_op -> statement(expr=$id_op.st) | if_op | while_op | for_op -> {$for_op.st});
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_op_return id_op18 = null;

        strgramParser.for_op_return for_op19 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:275:2: ( id_op -> statement(expr=$id_op.st) | if_op | while_op | for_op -> {$for_op.st})
            int alt19=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:276:2: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops1171);
                    id_op18=id_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 276:13: -> statement(expr=$id_op.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_op18!=null?id_op18.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:278:2: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops1192);
                    if_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:280:2: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops1202);
                    while_op();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:282:2: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops1209);
                    for_op19=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 282:13: -> {$for_op.st}
                    {
                        retval.st = (for_op19!=null?for_op19.st:null);
                    }


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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:285:1: id_op : ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) ) EOL ;
    public final strgramParser.id_op_return id_op() throws RecognitionException {
        strgramParser.id_op_return retval = new strgramParser.id_op_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign20 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:286:2: ( ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:2: ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:2: ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:3: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_op1235);
                    id_assign20=id_assign();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 287:13: -> {$id_assign.st}
                    {
                        retval.st = (id_assign20!=null?id_assign20.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:289:2: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op1246);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:2: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:2: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:3: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op1255); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op1257); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op1263); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:295:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:296:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:296:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun1280); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun1282); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun1284); 
            pushFollow(FOLLOW_fun_body_in_main_fun1286);
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

    protected static class fun_decl_scope {
        String name;
    }
    protected Stack fun_decl_stack = new Stack();

    public static class fun_decl_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_decl"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:299:1: fun_decl : ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p);
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        slist_stack.push(new slist_scope());
        fun_decl_stack.push(new fun_decl_scope());
        strgramParser.fun_decl_return retval = new strgramParser.fun_decl_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_p=null;
        strgramParser.type_return type21 = null;

        strgramParser.fun_body_return fun_body22 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:308:2: ( ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:308:4: ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:308:4: ( type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=26 && LA21_0<=28)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:308:4: type
                    {
                    pushFollow(FOLLOW_type_in_fun_decl1312);
                    type21=type();

                    state._fsp--;


                    }
                    break;

            }

            a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl1317); 
            ((fun_decl_scope)fun_decl_stack.peek()).name =(a!=null?a.getText():null);
             
            	     ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
            	     methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type21!=null?type21.idType:null)));
            	  
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1329); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:313:14: (p+= args )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=26 && LA22_0<=28)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:313:14: p+= args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl1334);
                    p=args();

                    state._fsp--;

                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1337); 
            pushFollow(FOLLOW_fun_body_in_fun_decl1339);
            fun_body22=fun_body();

            state._fsp--;


            	     if ((type21!=null?type21.idType:null) != null){
            	       if((fun_body22!=null?fun_body22.returnType:null) == null) {
            	           errors.add("line "+(a!=null?a.getLine():0)+": method "+(a!=null?a.getText():null)+" missing return statement, expecting " + (type21!=null?type21.idType:null));
            	       }else if(!(type21!=null?type21.idType:null).equals((fun_body22!=null?fun_body22.returnType:null))){
                        errors.add("line "+(a!=null?a.getLine():0)+": method "+(a!=null?a.getText():null)+" wrong type conversion cannot convert return type " + 
                                  (fun_body22!=null?fun_body22.returnType:null) + " to " + (type21!=null?type21.idType:null));
                     }
            	     }
            	 


            // TEMPLATE REWRITE
            // 324:11: -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p)
            {
                retval.st = templateLib.getInstanceOf("fun_decl",
              new STAttrMap().put("type", (type21!=null?type21.st:null)).put("name", ((fun_decl_scope)fun_decl_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            slist_stack.pop();
            fun_decl_stack.pop();
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:330:1: args : a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text);
    public final strgramParser.args_return args() throws RecognitionException {
        strgramParser.args_return retval = new strgramParser.args_return();
        retval.start = input.LT(1);

        Token b=null;
        strgramParser.type_return a = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:331:3: (a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:331:5: a= type b= ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args1459);
            a=type();

            state._fsp--;

            b=(Token)match(input,ID,FOLLOW_ID_in_args1463); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:331:17: ( COMMA type ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:331:18: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args1466); 
            	    pushFollow(FOLLOW_type_in_args1468);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args1470); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 332:3: -> parameter(type=$a.stname=$b.text)
            {
                retval.st = templateLib.getInstanceOf("parameter",
              new STAttrMap().put("type", (a!=null?a.st:null)).put("name", (b!=null?b.getText():null)));
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
    // $ANTLR end "args"

    public static class fun_body_return extends ParserRuleReturnScope {
        public String returnType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_body"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:335:1: fun_body returns [String returnType] : CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE ;
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.var_return var23 = null;

        strgramParser.ops_return ops24 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:336:2: ( CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:336:7: CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body1510); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:338:9: ( var | ops )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==LIST||(LA24_0>=26 && LA24_0<=28)) ) {
                    alt24=1;
                }
                else if ( (LA24_0==ID||LA24_0==29||LA24_0==31||(LA24_0>=33 && LA24_0<=35)) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:338:11: var
            	    {
            	    pushFollow(FOLLOW_var_in_fun_body1532);
            	    var23=var();

            	    state._fsp--;

            	    ((slist_scope)slist_stack.peek()).locals.add((var23!=null?var23.st:null));

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:340:11: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1557);
            	    ops24=ops();

            	    state._fsp--;

            	    ((slist_scope)slist_stack.peek()).stats.add((ops24!=null?ops24.st:null));

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:343:9: ( 'return' a= ID EOL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:343:10: 'return' a= ID EOL
                    {
                    match(input,37,FOLLOW_37_in_fun_body1582); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_body1586); 
                    match(input,EOL,FOLLOW_EOL_in_fun_body1588); 

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
            			     
            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1612); 

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


 

    public static final BitSet FOLLOW_fun_decl_in_program65 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_var_in_program91 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_26_in_type150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_init274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign316 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_id_value_in_id_assign318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_id_value361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_value398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var456 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_var459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var463 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LIST_in_var476 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var482 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_var490 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_var495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr572 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_MATHOPER_in_expr575 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_math_exp_in_expr579 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_data_id_in_math_exp617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp635 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_expr_in_math_exp637 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op793 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_if_op795 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op797 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_if_op805 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op834 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op836 = new BitSet(new long[]{0x000000001C001000L});
    public static final BitSet FOLLOW_INT_in_for_op841 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_for_op848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op852 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op854 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op858 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op869 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op947 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_while_op949 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond967 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_ID_in_bool_cond971 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_bool_cond975 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond980 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1000 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1023 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op1039 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1041 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1071 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_fun_call1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op1102 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_self_op1103 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_fun_call_in_self_op1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1118 = new BitSet(new long[]{0x0000000C00007C10L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond1121 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1124 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond1126 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_cond_arg1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_op1235 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_self_op_in_id_op1246 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_id_op1255 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op1257 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_id_op1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun1280 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun1282 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun1284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl1312 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl1317 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1329 = new BitSet(new long[]{0x000000001C000800L});
    public static final BitSet FOLLOW_args_in_fun_decl1334 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args1459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1463 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_args1466 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args1468 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1470 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body1510 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_var_in_fun_body1532 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_ops_in_fun_body1557 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_37_in_fun_body1582 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_body1586 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_fun_body1588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1612 = new BitSet(new long[]{0x0000000000000002L});

}