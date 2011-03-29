// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-29 12:12:11

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "EQUAL", "COMMA", "EOL", "PAR_OPEN", "PAR_CLOSE", "MATHOPER", "INT", "STRING", "CHAR", "COMPROPER", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "LIST", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'out'", "'read'", "'return'"
    };
    public static final int EOF=-1;
    public static final int T__25=25;
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
    public static final int ID=4;
    public static final int EQUAL=5;
    public static final int COMMA=6;
    public static final int EOL=7;
    public static final int PAR_OPEN=8;
    public static final int PAR_CLOSE=9;
    public static final int MATHOPER=10;
    public static final int INT=11;
    public static final int STRING=12;
    public static final int CHAR=13;
    public static final int COMPROPER=14;
    public static final int MAIN_NAME=15;
    public static final int CUR_OPEN=16;
    public static final int CUR_CLOSE=17;
    public static final int LIST=18;
    public static final int SQ_OPEN=19;
    public static final int SQ_CLOSE=20;
    public static final int DIGIT=21;
    public static final int ALPHA=22;
    public static final int WS=23;
    public static final int COMMENT=24;

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
    	return "line " + e.line + ":";
    }

    public void emitErrorMessage(String msg) {
    	errors.add(msg);
    }
    private int reg = 1;
    public int getreg() { return reg++; }
    public int getLastReg(){return reg-1;}
        List<StringTemplate> strings = new ArrayList<StringTemplate>();
        public int getstr(String s) {
          strings.add(new StringTemplate(s));
          return strings.size();
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:43:1: program : ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functions);
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:54:3: ( ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functions))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:3: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:3: ( fun_decl | var )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2==ID) ) {
                        int LA1_6 = input.LA(3);

                        if ( (LA1_6==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( ((LA1_6>=EQUAL && LA1_6<=EOL)) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case 26:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==ID) ) {
                        int LA1_6 = input.LA(3);

                        if ( (LA1_6==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( ((LA1_6>=EQUAL && LA1_6<=EOL)) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case 27:
                    {
                    int LA1_4 = input.LA(2);

                    if ( (LA1_4==ID) ) {
                        int LA1_6 = input.LA(3);

                        if ( (LA1_6==PAR_OPEN) ) {
                            alt1=1;
                        }
                        else if ( ((LA1_6>=EQUAL && LA1_6<=EOL)) ) {
                            alt1=2;
                        }


                    }


                    }
                    break;
                case ID:
                case MAIN_NAME:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:56:5: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program72);
            	    fun_decl1=fun_decl();

            	    state._fsp--;


            	           ((program_scope)program_stack.peek()).functions.add((fun_decl1!=null?fun_decl1.st:null));
            	          

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:61:7: var
            	    {

            	           ((program_scope)program_stack.peek()).name = "[global]";
            	          
            	    pushFollow(FOLLOW_var_in_program102);
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
            // 69:5: -> program(globals=$program::globalsfunctions=$program::functions)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:1: type returns [String idType] : ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char());
    public final strgramParser.type_return type() throws RecognitionException {
        strgramParser.type_return retval = new strgramParser.type_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:73:3: ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char())
            int alt2=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:74:5: 'Int'
                    {
                    match(input,25,FOLLOW_25_in_type154); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 74:39: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:75:5: 'String'
                    {
                    match(input,26,FOLLOW_26_in_type176); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 75:39: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:5: 'Char'
                    {
                    match(input,27,FOLLOW_27_in_type192); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 76:39: -> type_char()
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:1: id_init : a= ID ( EQUAL b= expr )? -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> def_var(id=$a.texttype=$var::varType);
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:80:3: (a= ID ( EQUAL b= expr )? -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> def_var(id=$a.texttype=$var::varType))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:3: a= ID ( EQUAL b= expr )?
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_init223); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:8: ( EQUAL b= expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:9: EQUAL b= expr
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init226); 
                    pushFollow(FOLLOW_expr_in_id_init230);
                    b=expr();

                    state._fsp--;


                    }
                    break;

            }


                 if ((a!=null?a.getText():null) != null) {
                         if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                             errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                         } else {
                 	          names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), ((var_scope)var_stack.peek()).varType, (a!=null?a.getLine():0)));
                            names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                            if (!((var_scope)var_stack.peek()).varType.equals((b!=null?b.idType:null))) {
                                 errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null) +" wrong type conversion cannot convert " + (b!=null?b.idType:null) + " to " + ((var_scope)var_stack.peek()).varType);
                            }     	          
                 			    }
                         }
                


            // TEMPLATE REWRITE
            // 95:7: -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st)
            if ((b!=null?b.idType:null)!=null) {
                retval.st = templateLib.getInstanceOf("def_assign",
              new STAttrMap().put("type", ((var_scope)var_stack.peek()).varType).put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)));
            }
            else // 97:7: -> def_var(id=$a.texttype=$var::varType)
            {
                retval.st = templateLib.getInstanceOf("def_var",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:102:1: id_assign : a= ID EQUAL b= expr -> assign(id=$a.textrhs=$expr.st);
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:3: (a= ID EQUAL b= expr -> assign(id=$a.textrhs=$expr.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:3: a= ID EQUAL b= expr
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign314); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign316); 
            pushFollow(FOLLOW_expr_in_id_assign320);
            b=expr();

            state._fsp--;


                             if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                               names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                               String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
                               if (!varType.equals((b!=null?b.idType:null))) {
                                errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + (b!=null?b.idType:null) + " to " + varType);
                               }
                             }else {
                                errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" cann't be resolved");
                           
                             }
                


            // TEMPLATE REWRITE
            // 117:3: -> assign(id=$a.textrhs=$expr.st)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:119:1: var : type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b);
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        List list_b=null;
        strgramParser.type_return type3 = null;

        RuleReturnScope b = null;

        ((var_scope)var_stack.peek()).varType = "";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:126:3: ( type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:127:3: type b+= id_init ( COMMA b+= id_init )* EOL
            {
            pushFollow(FOLLOW_type_in_var365);
            type3=type();

            state._fsp--;

            ((var_scope)var_stack.peek()).varType = (type3!=null?type3.idType:null);
            pushFollow(FOLLOW_id_init_in_var372);
            b=id_init();

            state._fsp--;

            if (list_b==null) list_b=new ArrayList();
            list_b.add(b.getTemplate());

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:127:52: ( COMMA b+= id_init )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:127:53: COMMA b+= id_init
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_var375); 
            	    pushFollow(FOLLOW_id_init_in_var379);
            	    b=id_init();

            	    state._fsp--;

            	    if (list_b==null) list_b=new ArrayList();
            	    list_b.add(b.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,EOL,FOLLOW_EOL_in_var383); 


            // TEMPLATE REWRITE
            // 128:7: -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b)
            if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("globalVars",
              new STAttrMap().put("vars", list_b));
            }
            else // 130:7: -> vars(vars=$b)
            {
                retval.st = templateLib.getInstanceOf("vars",
              new STAttrMap().put("vars", list_b));
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

    public static class listParams_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "listParams"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:134:1: listParams : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a);
    public final strgramParser.listParams_return listParams() throws RecognitionException {
        strgramParser.listParams_return retval = new strgramParser.listParams_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:1: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_listParams440); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:12: (a+= expr ( COMMA a+= expr )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==PAR_OPEN||(LA6_0>=INT && LA6_0<=CHAR)||(LA6_0>=33 && LA6_0<=34)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_listParams445);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:21: ( COMMA a+= expr )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:136:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listParams448); 
                    	    pushFollow(FOLLOW_expr_in_listParams452);
                    	    a=expr();

                    	    state._fsp--;

                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_listParams458); 


            // TEMPLATE REWRITE
            // 137:3: -> iconst(value=$a)
            {
                retval.st = templateLib.getInstanceOf("iconst",
              new STAttrMap().put("value", list_a));
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
    // $ANTLR end "listParams"

    public static class expr_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st};
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        Token MATHOPER4=null;
        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:141:3: (a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:142:3: a= math_exp ( MATHOPER b= math_exp )?
            {
            pushFollow(FOLLOW_math_exp_in_expr488);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:142:14: ( MATHOPER b= math_exp )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==MATHOPER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:142:15: MATHOPER b= math_exp
                    {
                    MATHOPER4=(Token)match(input,MATHOPER,FOLLOW_MATHOPER_in_expr491); 
                    pushFollow(FOLLOW_math_exp_in_expr495);
                    b=math_exp();

                    state._fsp--;


                    }
                    break;

            }


                  retval.idType = (a!=null?a.idType:null);
              


            // TEMPLATE REWRITE
            // 146:7: -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st)
            if ((b!=null?b.st:null)!=null) {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (MATHOPER4!=null?MATHOPER4.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
            }
            else // 148:7: -> {$a.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:151:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st});
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return data_id5 = null;

        strgramParser.expr_return expr6 = null;

        strgramParser.fun_call_return fun_call7 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st})
            int alt8=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==PAR_OPEN) ) {
                    alt8=3;
                }
                else if ( ((LA8_1>=COMMA && LA8_1<=EOL)||(LA8_1>=PAR_CLOSE && LA8_1<=MATHOPER)) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case STRING:
            case CHAR:
                {
                alt8=1;
                }
                break;
            case PAR_OPEN:
                {
                alt8=2;
                }
                break;
            case 33:
            case 34:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp571);
                    data_id5=data_id();

                    state._fsp--;


                        retval.idType = (data_id5!=null?data_id5.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 157:3: -> {$data_id.st}
                    {
                        retval.st = (data_id5!=null?data_id5.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:159:3: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp606); 
                    pushFollow(FOLLOW_expr_in_math_exp608);
                    expr6=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp610); 

                        retval.idType = (expr6!=null?expr6.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 163:3: -> {$expr.st}
                    {
                        retval.st = (expr6!=null?expr6.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:3: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_math_exp630);
                    fun_call7=fun_call();

                    state._fsp--;


                        retval.idType = (fun_call7!=null?fun_call7.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 169:3: -> {$fun_call.st}
                    {
                        retval.st = (fun_call7!=null?fun_call7.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:1: data returns [String idType] : ( INT -> int(reg=getreg()v=$INT.text) | STRING -> string(reg=getreg()s=new StringTemplate($STRING.text)sreg=getstr($STRING.text)) | CHAR -> {new StringTemplate($CHAR.text)});
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT8=null;
        Token STRING9=null;
        Token CHAR10=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:3: ( INT -> int(reg=getreg()v=$INT.text) | STRING -> string(reg=getreg()s=new StringTemplate($STRING.text)sreg=getstr($STRING.text)) | CHAR -> {new StringTemplate($CHAR.text)})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:5: INT
                    {
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_data663); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 174:39: -> int(reg=getreg()v=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("reg", getreg()).put("v", (INT8!=null?INT8.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:5: STRING
                    {
                    STRING9=(Token)match(input,STRING,FOLLOW_STRING_in_data694); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 175:39: -> string(reg=getreg()s=new StringTemplate($STRING.text)sreg=getstr($STRING.text))
                    {
                        retval.st = templateLib.getInstanceOf("string",
                      new STAttrMap().put("reg", getreg()).put("s", new StringTemplate((STRING9!=null?STRING9.getText():null))).put("sreg", getstr((STRING9!=null?STRING9.getText():null))));
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:176:5: CHAR
                    {
                    CHAR10=(Token)match(input,CHAR,FOLLOW_CHAR_in_data724); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 176:39: -> {new StringTemplate($CHAR.text)}
                    {
                        retval.st = new StringTemplate((CHAR10!=null?CHAR10.getText():null));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:1: data_id returns [String idType] : ( ID -> load_var(reg=getreg()id=$ID.text) | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID11=null;
        strgramParser.data_return data12 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:180:3: ( ID -> load_var(reg=getreg()id=$ID.text) | data -> {$data.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:181:3: ID
                    {
                    ID11=(Token)match(input,ID,FOLLOW_ID_in_data_id757); 

                         if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID11!=null?ID11.getText():null))) {
                               errors.add("line "+(ID11!=null?ID11.getLine():0)+": name "+(ID11!=null?ID11.getText():null)+" cannot be resolved");
                         } else {
                               names.get(((program_scope)program_stack.peek()).name + "." + (ID11!=null?ID11.getText():null)).addLineUses((ID11!=null?ID11.getLine():0));   
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID11!=null?ID11.getText():null)).getType();
                         }
                      


                    // TEMPLATE REWRITE
                    // 190:3: -> load_var(reg=getreg()id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("load_var",
                      new STAttrMap().put("reg", getreg()).put("id", (ID11!=null?ID11.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:192:3: data
                    {
                    pushFollow(FOLLOW_data_in_data_id788);
                    data12=data();

                    state._fsp--;

                    retval.idType = (data12!=null?data12.idType:null);


                    // TEMPLATE REWRITE
                    // 194:3: -> {$data.st}
                    {
                        retval.st = (data12!=null?data12.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:197:1: if_op : 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg());
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond13 = null;

        strgramParser.fun_body_return fun_body14 = null;

        strgramParser.else_block_return else_block15 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:203:3: ( 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:3: 'if' bool_cond fun_body ( else_block )?
            {
            match(input,28,FOLLOW_28_in_if_op825); 
            pushFollow(FOLLOW_bool_cond_in_if_op827);
            bool_cond13=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op829);
            fun_body14=fun_body();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:27: ( else_block )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:27: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_op831);
                    else_block15=else_block();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 205:3: -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg())
            {
                retval.st = templateLib.getInstanceOf("if_op",
              new STAttrMap().put("cond", (bool_cond13!=null?bool_cond13.st:null)).put("stat1", (fun_body14!=null?fun_body14.st:null)).put("stat2", (else_block15!=null?else_block15.st:null)).put("tmp", getreg()));
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
    // $ANTLR end "if_op"

    public static class else_block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "else_block"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:208:1: else_block : 'else' fun_body -> {$fun_body.st};
    public final strgramParser.else_block_return else_block() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.else_block_return retval = new strgramParser.else_block_return();
        retval.start = input.LT(1);

        strgramParser.fun_body_return fun_body16 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:3: ( 'else' fun_body -> {$fun_body.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:215:3: 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_else_block883); 
            pushFollow(FOLLOW_fun_body_in_else_block885);
            fun_body16=fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 216:5: -> {$fun_body.st}
            {
                retval.st = (fun_body16!=null?fun_body16.st:null);
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
    // $ANTLR end "else_block"

    public static class for_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:1: for_op : 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token INT17=null;
        strgramParser.type_return type18 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:3: ( 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:3: 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,30,FOLLOW_30_in_for_op917); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op919); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:3: ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INT) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=25 && LA12_0<=27)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:228:5: INT
                    {
                    INT17=(Token)match(input,INT,FOLLOW_INT_in_for_op929); 


                    // TEMPLATE REWRITE
                    // 229:5: -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats)
                    {
                        retval.st = templateLib.getInstanceOf("for_op",
                      new STAttrMap().put("count", (INT17!=null?INT17.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:7: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:7: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:230:8: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op961);
                    type18=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op965); 
                    match(input,31,FOLLOW_31_in_for_op967); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op971); 

                    }


                    }
                    break;

            }


                 if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                       errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" dublicated");
                     } else {
                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type18!=null?type18.idType:null), (a!=null?a.getLine():0)));
                     }
                     if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                       errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                     } else {
                       names.get(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                     }
                
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op989); 
            pushFollow(FOLLOW_fun_body_in_for_op991);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 246:3: -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("for_list_op",
              new STAttrMap().put("type", (type18!=null?type18.idType:null)).put("id", (a!=null?a.getText():null)).put("listId", (b!=null?b.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:1: while_op : 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond19 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:256:3: ( 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:257:3: 'while' bool_cond fun_body
            {
            match(input,32,FOLLOW_32_in_while_op1060); 
            pushFollow(FOLLOW_bool_cond_in_while_op1062);
            bool_cond19=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op1064);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 258:5: -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("while_op",
              new STAttrMap().put("bool_cond", (bool_cond19!=null?bool_cond19.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // $ANTLR end "while_op"

    public static class bool_cond_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bool_cond"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:261:1: bool_cond : PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st);
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        Token COMPROPER20=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:262:3: ( PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:263:3: PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond1101); 
            pushFollow(FOLLOW_data_id_in_bool_cond1105);
            a=data_id();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:263:22: ( COMPROPER b= data_id )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMPROPER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:263:23: COMPROPER b= data_id
            	    {
            	    COMPROPER20=(Token)match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond1108); 
            	    pushFollow(FOLLOW_data_id_in_bool_cond1112);
            	    b=data_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond1116); 


            // TEMPLATE REWRITE
            // 264:3: -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st)
            {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (COMPROPER20!=null?COMPROPER20.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
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
    // $ANTLR end "bool_cond"

    public static class brack_id_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "brack_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:267:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:268:3: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:269:3: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id1156); 
            match(input,ID,FOLLOW_ID_in_brack_id1158); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1160); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:272:1: in_out_op returns [String idType] : ( ( 'out' op_cond ) -> outOp(params=$op_cond.st) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp());
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        strgramParser.op_cond_return op_cond21 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:3: ( ( 'out' op_cond ) -> outOp(params=$op_cond.st) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp())
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==34) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:3: ( 'out' op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:3: ( 'out' op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:4: 'out' op_cond
                    {
                    match(input,33,FOLLOW_33_in_in_out_op1180); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op1182);
                    op_cond21=op_cond();

                    state._fsp--;


                    }


                         retval.idType = null;
                        


                    // TEMPLATE REWRITE
                    // 278:3: -> outOp(params=$op_cond.st)
                    {
                        retval.st = templateLib.getInstanceOf("outOp",
                      new STAttrMap().put("params", (op_cond21!=null?op_cond21.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:6: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,34,FOLLOW_34_in_in_out_op1207); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1209); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1211); 

                    }


                         retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 283:5: -> readOp()
                    {
                        retval.st = templateLib.getInstanceOf("readOp");
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
    // $ANTLR end "in_out_op"

    public static class fun_call_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_call"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:286:1: fun_call returns [String idType] : (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st});
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.in_out_op_return in_out_op22 = null;

        RuleReturnScope b = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:3: (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st})
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:3: a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1249); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_call1251); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:17: (b+= expr ( COMMA b+= expr )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID||LA16_0==PAR_OPEN||(LA16_0>=INT && LA16_0<=CHAR)||(LA16_0>=33 && LA16_0<=34)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:18: b+= expr ( COMMA b+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_fun_call1256);
                            b=expr();

                            state._fsp--;

                            if (list_b==null) list_b=new ArrayList();
                            list_b.add(b.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:26: ( COMMA b+= expr )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==COMMA) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:27: COMMA b+= expr
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_call1259); 
                            	    pushFollow(FOLLOW_expr_in_fun_call1263);
                            	    b=expr();

                            	    state._fsp--;

                            	    if (list_b==null) list_b=new ArrayList();
                            	    list_b.add(b.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_call1269); 

                         if (!methods.isExist((a!=null?a.getText():null))) {
                         	errors.add("line " + (a!=null?a.getLine():0) + ": methon name " + (a!=null?a.getText():null)	+ " cannot be resolved");
                         } else {
                         	retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();
                         	methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
                        


                    // TEMPLATE REWRITE
                    // 297:3: -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("funCall",
                      new STAttrMap().put("reg", getreg()).put("funName", (a!=null?a.getText():null)).put("funArgs", list_b).put("ret", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:299:3: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1309);
                    in_out_op22=in_out_op();

                    state._fsp--;


                         retval.idType = (in_out_op22!=null?in_out_op22.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 303:3: -> {$in_out_op.st}
                    {
                        retval.st = (in_out_op22!=null?in_out_op22.st:null);
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
    // $ANTLR end "fun_call"

    public static class op_cond_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "op_cond"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:1: op_cond : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a);
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:308:3: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1338); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:12: (a+= expr ( COMMA a+= expr )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID||LA19_0==PAR_OPEN||(LA19_0>=INT && LA19_0<=CHAR)||(LA19_0>=33 && LA19_0<=34)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_op_cond1343);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:21: ( COMMA a+= expr )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1346); 
                    	    pushFollow(FOLLOW_expr_in_op_cond1350);
                    	    a=expr();

                    	    state._fsp--;

                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1356); 


            // TEMPLATE REWRITE
            // 310:3: -> args(args=$a)
            {
                retval.st = templateLib.getInstanceOf("args",
              new STAttrMap().put("args", list_a));
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
    // $ANTLR end "op_cond"

    public static class ops_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ops"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:313:1: ops : ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st));
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign23 = null;

        strgramParser.if_op_return if_op24 = null;

        strgramParser.while_op_return while_op25 = null;

        strgramParser.for_op_return for_op26 = null;

        strgramParser.fun_call_return fun_call27 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:314:3: ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st))
            int alt20=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EQUAL) ) {
                    alt20=1;
                }
                else if ( (LA20_1==PAR_OPEN) ) {
                    alt20=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt20=2;
                }
                break;
            case 32:
                {
                alt20=3;
                }
                break;
            case 30:
                {
                alt20=4;
                }
                break;
            case 33:
            case 34:
                {
                alt20=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:315:3: id_assign EOL
                    {
                    pushFollow(FOLLOW_id_assign_in_ops1382);
                    id_assign23=id_assign();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1384); 


                    // TEMPLATE REWRITE
                    // 316:5: -> statement(expr=$id_assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_assign23!=null?id_assign23.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:317:5: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops1402);
                    if_op24=if_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 318:5: -> {$if_op.st}
                    {
                        retval.st = (if_op24!=null?if_op24.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:319:5: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops1415);
                    while_op25=while_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 320:5: -> {$while_op.st}
                    {
                        retval.st = (while_op25!=null?while_op25.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:321:5: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops1428);
                    for_op26=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 322:5: -> {$for_op.st}
                    {
                        retval.st = (for_op26!=null?for_op26.st:null);
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:323:5: fun_call EOL
                    {
                    pushFollow(FOLLOW_fun_call_in_ops1441);
                    fun_call27=fun_call();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1443); 


                    // TEMPLATE REWRITE
                    // 324:5: -> statement(expr=$fun_call.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (fun_call27!=null?fun_call27.st:null)));
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

    public static class main_fun_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_fun"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:327:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:328:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:329:3: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun1470); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun1472); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun1474); 
            pushFollow(FOLLOW_fun_body_in_main_fun1476);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:332:1: fun_decl : ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats));
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.fun_decl_return retval = new strgramParser.fun_decl_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_p=null;
        strgramParser.type_return type28 = null;

        strgramParser.fun_body_return fun_body29 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:338:3: ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats))
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==ID||(LA24_0>=25 && LA24_0<=27)) ) {
                alt24=1;
            }
            else if ( (LA24_0==MAIN_NAME) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:3: ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:3: ( type )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=25 && LA21_0<=27)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:3: type
                            {
                            pushFollow(FOLLOW_type_in_fun_decl1501);
                            type28=type();

                            state._fsp--;


                            }
                            break;

                    }

                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl1506); 

                         ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
                         methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type28!=null?type28.idType:null)));
                        
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1517); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:12: (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=25 && LA23_0<=27)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:13: p+= parameter_declaration ( COMMA p+= parameter_declaration )*
                            {
                            pushFollow(FOLLOW_parameter_declaration_in_fun_decl1522);
                            p=parameter_declaration();

                            state._fsp--;

                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:38: ( COMMA p+= parameter_declaration )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==COMMA) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:39: COMMA p+= parameter_declaration
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_decl1525); 
                            	    pushFollow(FOLLOW_parameter_declaration_in_fun_decl1529);
                            	    p=parameter_declaration();

                            	    state._fsp--;

                            	    if (list_p==null) list_p=new ArrayList();
                            	    list_p.add(p.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1535); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1537);
                    fun_body29=fun_body();

                    state._fsp--;


                         if ((type28!=null?type28.idType:null) != null) {
                         	if ((fun_body29!=null?fun_body29.idType:null) == null) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null) + " missing return statement, expecting " + (type28!=null?type28.idType:null));
                         	} else if (!(type28!=null?type28.idType:null).equals((fun_body29!=null?fun_body29.idType:null))) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null) + " wrong type conversion cannot convert return type " + (fun_body29!=null?fun_body29.idType:null) + " to " + (type28!=null?type28.idType:null));
                         	}
                         }
                        


                    // TEMPLATE REWRITE
                    // 354:4: -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p)
                    {
                        retval.st = templateLib.getInstanceOf("fun_decl",
                      new STAttrMap().put("type", (type28!=null?type28.st:null)).put("name", (a!=null?a.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:355:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
                    {
                    match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_fun_decl1584); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1586); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1588); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1590);
                    fun_body();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 356:4: -> main_decl(locals=$slist::localsstats=$slist::stats)
                    {
                        retval.st = templateLib.getInstanceOf("main_decl",
                      new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
            slist_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "fun_decl"

    public static class parameter_declaration_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parameter_declaration"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:359:1: parameter_declaration : type a= ID -> def_arg(id=$ID.texttype=$type.st);
    public final strgramParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        strgramParser.parameter_declaration_return retval = new strgramParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.type_return type30 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:360:3: ( type a= ID -> def_arg(id=$ID.texttype=$type.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:361:3: type a= ID
            {
            pushFollow(FOLLOW_type_in_parameter_declaration1624);
            type30=type();

            state._fsp--;

            a=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration1628); 

                   if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                   } else {
                      names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type30!=null?type30.idType:null), (a!=null?a.getLine():0)));
                   }
              


            // TEMPLATE REWRITE
            // 369:3: -> def_arg(id=$ID.texttype=$type.st)
            {
                retval.st = templateLib.getInstanceOf("def_arg",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", (type30!=null?type30.st:null)));
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
    // $ANTLR end "parameter_declaration"

    public static class fun_body_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fun_body"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:372:1: fun_body returns [String idType] : CUR_OPEN ( var | ops )* ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats);
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        strgramParser.var_return var31 = null;

        strgramParser.ops_return ops32 = null;

        strgramParser.return_st_return return_st33 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:373:3: ( CUR_OPEN ( var | ops )* ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:374:3: CUR_OPEN ( var | ops )* ( return_st )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body1667); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:374:12: ( var | ops )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=25 && LA25_0<=27)) ) {
                    alt25=1;
                }
                else if ( (LA25_0==ID||LA25_0==28||LA25_0==30||(LA25_0>=32 && LA25_0<=34)) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:374:13: var
            	    {
            	    pushFollow(FOLLOW_var_in_fun_body1670);
            	    var31=var();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:374:19: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1674);
            	    ops32=ops();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:374:26: ( return_st )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:374:26: return_st
                    {
                    pushFollow(FOLLOW_return_st_in_fun_body1679);
                    return_st33=return_st();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1682); 

                ((slist_scope)slist_stack.peek()).locals.add((var31!=null?var31.st:null));
                ((slist_scope)slist_stack.peek()).stats.add((ops32!=null?ops32.st:null));
                ((slist_scope)slist_stack.peek()).stats.add((return_st33!=null?return_st33.st:null));
                if ((return_st33!=null?return_st33.idType:null) != null) {
                  retval.idType = (return_st33!=null?return_st33.idType:null);
                } 
              


            // TEMPLATE REWRITE
            // 383:3: -> block(locals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("block",
              new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // $ANTLR end "fun_body"

    public static class return_st_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "return_st"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:386:1: return_st returns [String idType] : 'return' expr EOL -> return_st(ret_val=$expr.st);
    public final strgramParser.return_st_return return_st() throws RecognitionException {
        strgramParser.return_st_return retval = new strgramParser.return_st_return();
        retval.start = input.LT(1);

        strgramParser.expr_return expr34 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:387:1: ( 'return' expr EOL -> return_st(ret_val=$expr.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:388:2: 'return' expr EOL
            {
            match(input,35,FOLLOW_35_in_return_st1720); 
            pushFollow(FOLLOW_expr_in_return_st1722);
            expr34=expr();

            state._fsp--;

            match(input,EOL,FOLLOW_EOL_in_return_st1724); 

            	   retval.idType = (expr34!=null?expr34.idType:null);
            	


            // TEMPLATE REWRITE
            // 392:2: -> return_st(ret_val=$expr.st)
            {
                retval.st = templateLib.getInstanceOf("return_st",
              new STAttrMap().put("ret_val", (expr34!=null?expr34.st:null)));
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
    // $ANTLR end "return_st"

    // Delegated rules


 

    public static final BitSet FOLLOW_fun_decl_in_program72 = new BitSet(new long[]{0x000000000E008012L});
    public static final BitSet FOLLOW_var_in_program102 = new BitSet(new long[]{0x000000000E008012L});
    public static final BitSet FOLLOW_25_in_type154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init223 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQUAL_in_id_init226 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_id_init230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign314 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign316 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_id_assign320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var365 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var372 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_COMMA_in_var375 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var379 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_EOL_in_var383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_listParams440 = new BitSet(new long[]{0x0000000600003B10L});
    public static final BitSet FOLLOW_expr_in_listParams445 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_listParams448 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_listParams452 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_listParams458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr488 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_MATHOPER_in_expr491 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_math_exp_in_expr495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp606 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_math_exp608 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_math_exp630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_if_op825 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_if_op827 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_if_op829 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_else_block_in_if_op831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_else_block883 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_else_block885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_for_op917 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op919 = new BitSet(new long[]{0x000000000E000800L});
    public static final BitSet FOLLOW_INT_in_for_op929 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_type_in_for_op961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op965 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_for_op967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op971 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op989 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_for_op991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_while_op1060 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_while_op1062 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_while_op1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond1101 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1105 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond1108 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1112 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id1156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1158 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_in_out_op1180 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1207 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1209 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1249 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_call1251 = new BitSet(new long[]{0x0000000600003B10L});
    public static final BitSet FOLLOW_expr_in_fun_call1256 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_call1259 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_fun_call1263 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_call1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1338 = new BitSet(new long[]{0x0000000600003B10L});
    public static final BitSet FOLLOW_expr_in_op_cond1343 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1346 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_op_cond1350 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_ops1382 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_ops1441 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun1470 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun1472 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun1474 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl1501 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl1506 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1517 = new BitSet(new long[]{0x000000000E000200L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl1522 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_decl1525 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl1529 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1535 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_fun_decl1584 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1586 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1588 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter_declaration1624 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body1667 = new BitSet(new long[]{0x0000000F5E02B910L});
    public static final BitSet FOLLOW_var_in_fun_body1670 = new BitSet(new long[]{0x0000000F5E02B910L});
    public static final BitSet FOLLOW_ops_in_fun_body1674 = new BitSet(new long[]{0x0000000F5E02B910L});
    public static final BitSet FOLLOW_return_st_in_fun_body1679 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_return_st1720 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_return_st1722 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_return_st1724 = new BitSet(new long[]{0x0000000000000002L});

}