// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-04-11 23:15:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "EQUAL", "COMMA", "EOL", "PAR_OPEN", "PAR_CLOSE", "MATHOPER", "INT", "CHAR", "STRING", "COMPROPER", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "LIST", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'out'", "'read'", "'return'"
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
    public static final int CHAR=12;
    public static final int STRING=13;
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
        public int getStringLength(final String s){ 
          return s.length() - 1;
        }
        public String getString(String s){
            s = s.substring(1,s.length()-1);
            s = s.replaceAll("\\\\n", " \\\\0A");
            s = s.replaceAll("\\\\r", " \\\\0D");
            return  "\"" + s  + "\\00\"";
        }


    protected static class program_scope {
        String name;
        List globals;
        List functions;
        List strings;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:52:1: program : ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings);
    public final strgramParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        strgramParser.program_return retval = new strgramParser.program_return();
        retval.start = input.LT(1);

        strgramParser.fun_decl_return fun_decl1 = null;

        strgramParser.var_return var2 = null;



          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();
          ((program_scope)program_stack.peek()).strings = new ArrayList();
          ((program_scope)program_stack.peek()).name = "[global]";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:65:3: ( ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:66:3: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:66:3: ( fun_decl | var )+
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:67:5: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program74);
            	    fun_decl1=fun_decl();

            	    state._fsp--;


            	           ((program_scope)program_stack.peek()).functions.add((fun_decl1!=null?fun_decl1.st:null));
            	          

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:7: var
            	    {

            	           ((program_scope)program_stack.peek()).name = "[global]";
            	          
            	    pushFollow(FOLLOW_var_in_program104);
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
            // 80:5: -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings)
            {
                retval.st = templateLib.getInstanceOf("program",
              new STAttrMap().put("globals", ((program_scope)program_stack.peek()).globals).put("functions", ((program_scope)program_stack.peek()).functions).put("strings", ((program_scope)program_stack.peek()).strings));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:83:1: type returns [String idType] : ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char());
    public final strgramParser.type_return type() throws RecognitionException {
        strgramParser.type_return retval = new strgramParser.type_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:84:3: ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char())
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:85:5: 'Int'
                    {
                    match(input,25,FOLLOW_25_in_type161); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 85:39: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:86:5: 'String'
                    {
                    match(input,26,FOLLOW_26_in_type183); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 86:39: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:5: 'Char'
                    {
                    match(input,27,FOLLOW_27_in_type199); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 87:39: -> type_char()
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:90:1: id_init : a= ID ( EQUAL b= expr )? -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> {$program::name.equals(\"[global]\")}? def_glob(id=$a.texttype=$var::varType) -> def_var(id=$a.texttype=$var::varType);
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:91:3: (a= ID ( EQUAL b= expr )? -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> {$program::name.equals(\"[global]\")}? def_glob(id=$a.texttype=$var::varType) -> def_var(id=$a.texttype=$var::varType))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:3: a= ID ( EQUAL b= expr )?
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_init230); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:8: ( EQUAL b= expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:9: EQUAL b= expr
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init233); 
                    pushFollow(FOLLOW_expr_in_id_init237);
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
            // 106:7: -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st)
            if ((b!=null?b.idType:null)!=null) {
                retval.st = templateLib.getInstanceOf("def_assign",
              new STAttrMap().put("type", ((var_scope)var_stack.peek()).varType).put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)));
            }
            else // 108:7: -> {$program::name.equals(\"[global]\")}? def_glob(id=$a.texttype=$var::varType)
            if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("def_glob",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType));
            }
            else // 110:7: -> def_var(id=$a.texttype=$var::varType)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:115:1: id_assign : a= ID EQUAL b= expr -> assign(id=$a.textrhs=$expr.st);
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:116:3: (a= ID EQUAL b= expr -> assign(id=$a.textrhs=$expr.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:117:3: a= ID EQUAL b= expr
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign351); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign353); 
            pushFollow(FOLLOW_expr_in_id_assign357);
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
            // 130:3: -> assign(id=$a.textrhs=$expr.st)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:132:1: var : type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b);
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        List list_b=null;
        strgramParser.type_return type3 = null;

        RuleReturnScope b = null;

        ((var_scope)var_stack.peek()).varType = "";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:3: ( type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:3: type b+= id_init ( COMMA b+= id_init )* EOL
            {
            pushFollow(FOLLOW_type_in_var402);
            type3=type();

            state._fsp--;

            ((var_scope)var_stack.peek()).varType = (type3!=null?type3.idType:null);
            pushFollow(FOLLOW_id_init_in_var409);
            b=id_init();

            state._fsp--;

            if (list_b==null) list_b=new ArrayList();
            list_b.add(b.getTemplate());

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:52: ( COMMA b+= id_init )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:140:53: COMMA b+= id_init
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_var412); 
            	    pushFollow(FOLLOW_id_init_in_var416);
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

            match(input,EOL,FOLLOW_EOL_in_var420); 


            // TEMPLATE REWRITE
            // 141:7: -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b)
            if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("globalVars",
              new STAttrMap().put("vars", list_b));
            }
            else // 143:7: -> vars(vars=$b)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:1: listParams : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a);
    public final strgramParser.listParams_return listParams() throws RecognitionException {
        strgramParser.listParams_return retval = new strgramParser.listParams_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:1: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_listParams477); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:12: (a+= expr ( COMMA a+= expr )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID||LA6_0==PAR_OPEN||(LA6_0>=INT && LA6_0<=STRING)||(LA6_0>=33 && LA6_0<=34)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_listParams482);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:21: ( COMMA a+= expr )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listParams485); 
                    	    pushFollow(FOLLOW_expr_in_listParams489);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_listParams495); 


            // TEMPLATE REWRITE
            // 150:3: -> iconst(value=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st};
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        Token MATHOPER4=null;
        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:154:3: (a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:3: a= math_exp ( MATHOPER b= math_exp )?
            {
            pushFollow(FOLLOW_math_exp_in_expr525);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:14: ( MATHOPER b= math_exp )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==MATHOPER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:15: MATHOPER b= math_exp
                    {
                    MATHOPER4=(Token)match(input,MATHOPER,FOLLOW_MATHOPER_in_expr528); 
                    pushFollow(FOLLOW_math_exp_in_expr532);
                    b=math_exp();

                    state._fsp--;


                    }
                    break;

            }


                  retval.idType = (a!=null?a.idType:null);
              


            // TEMPLATE REWRITE
            // 159:7: -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st)
            if ((b!=null?b.st:null)!=null) {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (MATHOPER4!=null?MATHOPER4.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
            }
            else // 161:7: -> {$a.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st});
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return data_id5 = null;

        strgramParser.expr_return expr6 = null;

        strgramParser.fun_call_return fun_call7 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st})
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
            case CHAR:
            case STRING:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:166:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp608);
                    data_id5=data_id();

                    state._fsp--;


                        retval.idType = (data_id5!=null?data_id5.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 170:3: -> {$data_id.st}
                    {
                        retval.st = (data_id5!=null?data_id5.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:3: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp643); 
                    pushFollow(FOLLOW_expr_in_math_exp645);
                    expr6=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp647); 

                        retval.idType = (expr6!=null?expr6.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 176:3: -> {$expr.st}
                    {
                        retval.st = (expr6!=null?expr6.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:3: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_math_exp667);
                    fun_call7=fun_call();

                    state._fsp--;


                        retval.idType = (fun_call7!=null?fun_call7.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 182:3: -> {$fun_call.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:185:1: data returns [String idType] : ( INT -> int(reg=getreg()v=$INT.text) | str -> {$str.st} | CHAR -> {new StringTemplate($CHAR.text)});
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT8=null;
        Token CHAR10=null;
        strgramParser.str_return str9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:186:3: ( INT -> int(reg=getreg()v=$INT.text) | str -> {$str.st} | CHAR -> {new StringTemplate($CHAR.text)})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:187:5: INT
                    {
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_data700); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 187:39: -> int(reg=getreg()v=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("reg", getreg()).put("v", (INT8!=null?INT8.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:188:5: str
                    {
                    pushFollow(FOLLOW_str_in_data731);
                    str9=str();

                    state._fsp--;


                        retval.idType = "String";
                        ((program_scope)program_stack.peek()).strings.add((str9!=null?str9.st:null));
                      


                    // TEMPLATE REWRITE
                    // 193:3: -> {$str.st}
                    {
                        retval.st = (str9!=null?str9.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:5: CHAR
                    {
                    CHAR10=(Token)match(input,CHAR,FOLLOW_CHAR_in_data751); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 194:39: -> {new StringTemplate($CHAR.text)}
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

    public static class str_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "str"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:197:1: str : STRING -> string(reg=getreg()s=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text));
    public final strgramParser.str_return str() throws RecognitionException {
        strgramParser.str_return retval = new strgramParser.str_return();
        retval.start = input.LT(1);

        Token STRING11=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:1: ( STRING -> string(reg=getreg()s=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text)))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:3: STRING
            {
            STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_str779); 


            // TEMPLATE REWRITE
            // 199:3: -> string(reg=getreg()s=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text))
            {
                retval.st = templateLib.getInstanceOf("string",
              new STAttrMap().put("reg", getreg()).put("s", getString((STRING11!=null?STRING11.getText():null))).put("sreg", getstr((STRING11!=null?STRING11.getText():null))).put("len", getStringLength((STRING11!=null?STRING11.getText():null))));
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
    // $ANTLR end "str"

    public static class data_id_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "data_id"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:203:1: data_id returns [String idType] : ( ID -> load_var(reg=getreg()id=$ID.text) | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID12=null;
        strgramParser.data_return data13 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:3: ( ID -> load_var(reg=getreg()id=$ID.text) | data -> {$data.st})
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=INT && LA10_0<=STRING)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:3: ID
                    {
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_data_id821); 

                         if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null))) {
                               errors.add("line "+(ID12!=null?ID12.getLine():0)+": name "+(ID12!=null?ID12.getText():null)+" cannot be resolved");
                         } else {
                               names.get(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null)).addLineUses((ID12!=null?ID12.getLine():0));   
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null)).getType();
                         }
                      


                    // TEMPLATE REWRITE
                    // 214:3: -> load_var(reg=getreg()id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("load_var",
                      new STAttrMap().put("reg", getreg()).put("id", (ID12!=null?ID12.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:216:3: data
                    {
                    pushFollow(FOLLOW_data_in_data_id852);
                    data13=data();

                    state._fsp--;

                    retval.idType = (data13!=null?data13.idType:null);


                    // TEMPLATE REWRITE
                    // 218:3: -> {$data.st}
                    {
                        retval.st = (data13!=null?data13.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:221:1: if_op : 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg());
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond14 = null;

        strgramParser.fun_body_return fun_body15 = null;

        strgramParser.else_block_return else_block16 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:3: ( 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:228:3: 'if' bool_cond fun_body ( else_block )?
            {
            match(input,28,FOLLOW_28_in_if_op889); 
            pushFollow(FOLLOW_bool_cond_in_if_op891);
            bool_cond14=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op893);
            fun_body15=fun_body();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:228:27: ( else_block )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:228:27: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_op895);
                    else_block16=else_block();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 229:3: -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg())
            {
                retval.st = templateLib.getInstanceOf("if_op",
              new STAttrMap().put("cond", (bool_cond14!=null?bool_cond14.st:null)).put("stat1", (fun_body15!=null?fun_body15.st:null)).put("stat2", (else_block16!=null?else_block16.st:null)).put("tmp", getreg()));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:232:1: else_block : 'else' fun_body -> {$fun_body.st};
    public final strgramParser.else_block_return else_block() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.else_block_return retval = new strgramParser.else_block_return();
        retval.start = input.LT(1);

        strgramParser.fun_body_return fun_body17 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:3: ( 'else' fun_body -> {$fun_body.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:239:3: 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_else_block947); 
            pushFollow(FOLLOW_fun_body_in_else_block949);
            fun_body17=fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 240:5: -> {$fun_body.st}
            {
                retval.st = (fun_body17!=null?fun_body17.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:1: for_op : 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token INT18=null;
        strgramParser.type_return type19 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:3: ( 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:3: 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,30,FOLLOW_30_in_for_op981); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op983); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:251:3: ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:252:5: INT
                    {
                    INT18=(Token)match(input,INT,FOLLOW_INT_in_for_op993); 


                    // TEMPLATE REWRITE
                    // 253:5: -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats)
                    {
                        retval.st = templateLib.getInstanceOf("for_op",
                      new STAttrMap().put("count", (INT18!=null?INT18.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:7: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:7: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:8: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op1025);
                    type19=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op1029); 
                    match(input,31,FOLLOW_31_in_for_op1031); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op1035); 

                    }


                    }
                    break;

            }


                 if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                       errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" dublicated");
                     } else {
                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type19!=null?type19.idType:null), (a!=null?a.getLine():0)));
                     }
                     if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                       errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                     } else {
                       names.get(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                     }
                
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op1053); 
            pushFollow(FOLLOW_fun_body_in_for_op1055);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 270:3: -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("for_list_op",
              new STAttrMap().put("type", (type19!=null?type19.idType:null)).put("id", (a!=null?a.getText():null)).put("listId", (b!=null?b.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:274:1: while_op : 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond20 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:280:3: ( 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:281:3: 'while' bool_cond fun_body
            {
            match(input,32,FOLLOW_32_in_while_op1124); 
            pushFollow(FOLLOW_bool_cond_in_while_op1126);
            bool_cond20=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op1128);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 282:5: -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("while_op",
              new STAttrMap().put("bool_cond", (bool_cond20!=null?bool_cond20.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:285:1: bool_cond : PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st);
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        Token COMPROPER21=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:286:3: ( PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:3: PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond1165); 
            pushFollow(FOLLOW_data_id_in_bool_cond1169);
            a=data_id();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:22: ( COMPROPER b= data_id )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMPROPER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:23: COMPROPER b= data_id
            	    {
            	    COMPROPER21=(Token)match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond1172); 
            	    pushFollow(FOLLOW_data_id_in_bool_cond1176);
            	    b=data_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond1180); 


            // TEMPLATE REWRITE
            // 288:3: -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st)
            {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (COMPROPER21!=null?COMPROPER21.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:292:3: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:3: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id1220); 
            match(input,ID,FOLLOW_ID_in_brack_id1222); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1224); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:296:1: in_out_op returns [String idType] : ( ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE ) -> outOp(format=$data_id.stparams=$e) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp());
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        List list_e=null;
        strgramParser.data_id_return data_id22 = null;

        RuleReturnScope e = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:297:3: ( ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE ) -> outOp(format=$data_id.stparams=$e) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp())
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:3: ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:3: ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:4: 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE
                    {
                    match(input,33,FOLLOW_33_in_in_out_op1244); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1246); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1248);
                    data_id22=data_id();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:27: ( COMMA e+= expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:28: COMMA e+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1251); 
                    	    pushFollow(FOLLOW_expr_in_in_out_op1255);
                    	    e=expr();

                    	    state._fsp--;

                    	    if (list_e==null) list_e=new ArrayList();
                    	    list_e.add(e.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1259); 

                    }


                         retval.idType = null;
                        


                    // TEMPLATE REWRITE
                    // 302:3: -> outOp(format=$data_id.stparams=$e)
                    {
                        retval.st = templateLib.getInstanceOf("outOp",
                      new STAttrMap().put("format", (data_id22!=null?data_id22.st:null)).put("params", list_e));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:303:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:303:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:303:6: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,34,FOLLOW_34_in_in_out_op1291); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1293); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1295); 

                    }


                         retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 307:5: -> readOp()
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:310:1: fun_call returns [String idType] : (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st});
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.in_out_op_return in_out_op23 = null;

        RuleReturnScope b = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:311:3: (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st})
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=33 && LA18_0<=34)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:312:3: a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1333); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_call1335); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:312:17: (b+= expr ( COMMA b+= expr )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ID||LA17_0==PAR_OPEN||(LA17_0>=INT && LA17_0<=STRING)||(LA17_0>=33 && LA17_0<=34)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:312:18: b+= expr ( COMMA b+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_fun_call1340);
                            b=expr();

                            state._fsp--;

                            if (list_b==null) list_b=new ArrayList();
                            list_b.add(b.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:312:26: ( COMMA b+= expr )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==COMMA) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:312:27: COMMA b+= expr
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_call1343); 
                            	    pushFollow(FOLLOW_expr_in_fun_call1347);
                            	    b=expr();

                            	    state._fsp--;

                            	    if (list_b==null) list_b=new ArrayList();
                            	    list_b.add(b.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_call1353); 

                         if (!methods.isExist((a!=null?a.getText():null))) {
                         	errors.add("line " + (a!=null?a.getLine():0) + ": methon name " + (a!=null?a.getText():null)	+ " cannot be resolved");
                         } else {
                         	retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();
                         	methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
                        


                    // TEMPLATE REWRITE
                    // 321:3: -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("funCall",
                      new STAttrMap().put("reg", getreg()).put("funName", (a!=null?a.getText():null)).put("funArgs", list_b).put("ret", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:323:3: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1393);
                    in_out_op23=in_out_op();

                    state._fsp--;


                         retval.idType = (in_out_op23!=null?in_out_op23.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 327:3: -> {$in_out_op.st}
                    {
                        retval.st = (in_out_op23!=null?in_out_op23.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:331:1: op_cond : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a);
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:332:3: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:333:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1422); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:333:12: (a+= expr ( COMMA a+= expr )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID||LA20_0==PAR_OPEN||(LA20_0>=INT && LA20_0<=STRING)||(LA20_0>=33 && LA20_0<=34)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:333:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_op_cond1427);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:333:21: ( COMMA a+= expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:333:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1430); 
                    	    pushFollow(FOLLOW_expr_in_op_cond1434);
                    	    a=expr();

                    	    state._fsp--;

                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1440); 


            // TEMPLATE REWRITE
            // 334:3: -> args(args=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:337:1: ops : ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st));
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign24 = null;

        strgramParser.if_op_return if_op25 = null;

        strgramParser.while_op_return while_op26 = null;

        strgramParser.for_op_return for_op27 = null;

        strgramParser.fun_call_return fun_call28 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:338:3: ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st))
            int alt21=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EQUAL) ) {
                    alt21=1;
                }
                else if ( (LA21_1==PAR_OPEN) ) {
                    alt21=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            case 30:
                {
                alt21=4;
                }
                break;
            case 33:
            case 34:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:3: id_assign EOL
                    {
                    pushFollow(FOLLOW_id_assign_in_ops1466);
                    id_assign24=id_assign();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1468); 


                    // TEMPLATE REWRITE
                    // 340:5: -> statement(expr=$id_assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_assign24!=null?id_assign24.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:341:5: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops1486);
                    if_op25=if_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 342:5: -> {$if_op.st}
                    {
                        retval.st = (if_op25!=null?if_op25.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:343:5: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops1499);
                    while_op26=while_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 344:5: -> {$while_op.st}
                    {
                        retval.st = (while_op26!=null?while_op26.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:5: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops1512);
                    for_op27=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 346:5: -> {$for_op.st}
                    {
                        retval.st = (for_op27!=null?for_op27.st:null);
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:347:5: fun_call EOL
                    {
                    pushFollow(FOLLOW_fun_call_in_ops1525);
                    fun_call28=fun_call();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1527); 


                    // TEMPLATE REWRITE
                    // 348:5: -> statement(expr=$fun_call.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (fun_call28!=null?fun_call28.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:351:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:352:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:353:3: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun1554); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun1556); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun1558); 
            pushFollow(FOLLOW_fun_body_in_main_fun1560);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:356:1: fun_decl : ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats));
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.fun_decl_return retval = new strgramParser.fun_decl_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_p=null;
        strgramParser.type_return type29 = null;

        strgramParser.fun_body_return fun_body30 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:362:3: ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats))
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID||(LA25_0>=25 && LA25_0<=27)) ) {
                alt25=1;
            }
            else if ( (LA25_0==MAIN_NAME) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:363:3: ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:363:3: ( type )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=25 && LA22_0<=27)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:363:3: type
                            {
                            pushFollow(FOLLOW_type_in_fun_decl1585);
                            type29=type();

                            state._fsp--;


                            }
                            break;

                    }

                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl1590); 

                         ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
                         methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type29!=null?type29.idType:null)));
                        
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1601); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:368:12: (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=25 && LA24_0<=27)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:368:13: p+= parameter_declaration ( COMMA p+= parameter_declaration )*
                            {
                            pushFollow(FOLLOW_parameter_declaration_in_fun_decl1606);
                            p=parameter_declaration();

                            state._fsp--;

                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:368:38: ( COMMA p+= parameter_declaration )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==COMMA) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:368:39: COMMA p+= parameter_declaration
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_decl1609); 
                            	    pushFollow(FOLLOW_parameter_declaration_in_fun_decl1613);
                            	    p=parameter_declaration();

                            	    state._fsp--;

                            	    if (list_p==null) list_p=new ArrayList();
                            	    list_p.add(p.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1619); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1621);
                    fun_body30=fun_body();

                    state._fsp--;


                         if ((type29!=null?type29.idType:null) != null) {
                         	if ((fun_body30!=null?fun_body30.idType:null) == null) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null) + " missing return statement, expecting " + (type29!=null?type29.idType:null));
                         	} else if (!(type29!=null?type29.idType:null).equals((fun_body30!=null?fun_body30.idType:null))) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null) + " wrong type conversion cannot convert return type " + (fun_body30!=null?fun_body30.idType:null) + " to " + (type29!=null?type29.idType:null));
                         	}
                         }
                        


                    // TEMPLATE REWRITE
                    // 378:4: -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p)
                    {
                        retval.st = templateLib.getInstanceOf("fun_decl",
                      new STAttrMap().put("type", (type29!=null?type29.st:null)).put("name", (a!=null?a.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:379:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
                    {
                    match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_fun_decl1668); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1670); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1672); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1674);
                    fun_body();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 380:4: -> main_decl(locals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:383:1: parameter_declaration : type a= ID -> def_arg(id=$ID.texttype=$type.st);
    public final strgramParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        strgramParser.parameter_declaration_return retval = new strgramParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.type_return type31 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:384:3: ( type a= ID -> def_arg(id=$ID.texttype=$type.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:385:3: type a= ID
            {
            pushFollow(FOLLOW_type_in_parameter_declaration1708);
            type31=type();

            state._fsp--;

            a=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration1712); 

                   if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                   } else {
                      names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type31!=null?type31.idType:null), (a!=null?a.getLine():0)));
                   }
              


            // TEMPLATE REWRITE
            // 393:3: -> def_arg(id=$ID.texttype=$type.st)
            {
                retval.st = templateLib.getInstanceOf("def_arg",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", (type31!=null?type31.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:396:1: fun_body returns [String idType] : CUR_OPEN ( var | ops )* ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats);
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        strgramParser.var_return var32 = null;

        strgramParser.ops_return ops33 = null;

        strgramParser.return_st_return return_st34 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:397:3: ( CUR_OPEN ( var | ops )* ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:3: CUR_OPEN ( var | ops )* ( return_st )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body1751); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:12: ( var | ops )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=25 && LA26_0<=27)) ) {
                    alt26=1;
                }
                else if ( (LA26_0==ID||LA26_0==28||LA26_0==30||(LA26_0>=32 && LA26_0<=34)) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:13: var
            	    {
            	    pushFollow(FOLLOW_var_in_fun_body1754);
            	    var32=var();

            	    state._fsp--;

            	    ((slist_scope)slist_stack.peek()).locals.add((var32!=null?var32.st:null));

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:49: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1759);
            	    ops33=ops();

            	    state._fsp--;

            	    ((slist_scope)slist_stack.peek()).stats.add((ops33!=null?ops33.st:null));

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:85: ( return_st )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==35) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:85: return_st
                    {
                    pushFollow(FOLLOW_return_st_in_fun_body1765);
                    return_st34=return_st();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1768); 

                ((slist_scope)slist_stack.peek()).stats.add((return_st34!=null?return_st34.st:null));
                if ((return_st34!=null?return_st34.idType:null) != null) {
                  retval.idType = (return_st34!=null?return_st34.idType:null);
                } 
              


            // TEMPLATE REWRITE
            // 405:3: -> block(locals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:408:1: return_st returns [String idType] : 'return' expr EOL -> return_st(ret_val=$expr.st);
    public final strgramParser.return_st_return return_st() throws RecognitionException {
        strgramParser.return_st_return retval = new strgramParser.return_st_return();
        retval.start = input.LT(1);

        strgramParser.expr_return expr35 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:409:1: ( 'return' expr EOL -> return_st(ret_val=$expr.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:410:2: 'return' expr EOL
            {
            match(input,35,FOLLOW_35_in_return_st1806); 
            pushFollow(FOLLOW_expr_in_return_st1808);
            expr35=expr();

            state._fsp--;

            match(input,EOL,FOLLOW_EOL_in_return_st1810); 

            	   retval.idType = (expr35!=null?expr35.idType:null);
            	


            // TEMPLATE REWRITE
            // 414:2: -> return_st(ret_val=$expr.st)
            {
                retval.st = templateLib.getInstanceOf("return_st",
              new STAttrMap().put("ret_val", (expr35!=null?expr35.st:null)));
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


 

    public static final BitSet FOLLOW_fun_decl_in_program74 = new BitSet(new long[]{0x000000000E008012L});
    public static final BitSet FOLLOW_var_in_program104 = new BitSet(new long[]{0x000000000E008012L});
    public static final BitSet FOLLOW_25_in_type161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init230 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQUAL_in_id_init233 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_id_init237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign351 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign353 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_id_assign357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var402 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var409 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_COMMA_in_var412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var416 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_EOL_in_var420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_listParams477 = new BitSet(new long[]{0x0000000600003B10L});
    public static final BitSet FOLLOW_expr_in_listParams482 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_listParams485 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_listParams489 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_listParams495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr525 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_MATHOPER_in_expr528 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_math_exp_in_expr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp643 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_math_exp645 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_math_exp667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_str_in_data731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_str779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_if_op889 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_if_op891 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_if_op893 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_else_block_in_if_op895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_else_block947 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_else_block949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_for_op981 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op983 = new BitSet(new long[]{0x000000000E000800L});
    public static final BitSet FOLLOW_INT_in_for_op993 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_type_in_for_op1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op1029 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_for_op1031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op1035 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op1053 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_for_op1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_while_op1124 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_while_op1126 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_while_op1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond1165 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1169 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond1172 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1176 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id1220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1222 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_in_out_op1244 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1246 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1248 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1251 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_in_out_op1255 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1291 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1293 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1333 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_call1335 = new BitSet(new long[]{0x0000000600003B10L});
    public static final BitSet FOLLOW_expr_in_fun_call1340 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_call1343 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_fun_call1347 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_call1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1422 = new BitSet(new long[]{0x0000000600003B10L});
    public static final BitSet FOLLOW_expr_in_op_cond1427 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1430 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_op_cond1434 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_ops1466 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_ops1525 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun1554 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun1556 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun1558 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl1585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl1590 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1601 = new BitSet(new long[]{0x000000000E000200L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl1606 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_decl1609 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl1613 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1619 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_fun_decl1668 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1670 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1672 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter_declaration1708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body1751 = new BitSet(new long[]{0x0000000F5E02B910L});
    public static final BitSet FOLLOW_var_in_fun_body1754 = new BitSet(new long[]{0x0000000F5E02B910L});
    public static final BitSet FOLLOW_ops_in_fun_body1759 = new BitSet(new long[]{0x0000000F5E02B910L});
    public static final BitSet FOLLOW_return_st_in_fun_body1765 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_return_st1806 = new BitSet(new long[]{0x0000000600003910L});
    public static final BitSet FOLLOW_expr_in_return_st1808 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_return_st1810 = new BitSet(new long[]{0x0000000000000002L});

}