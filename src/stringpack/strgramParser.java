// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-04-24 18:30:36
 
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "EQUAL", "COMMA", "EOL", "PAR_OPEN", "PAR_CLOSE", "MATHOPER", "INT", "CHAR", "STRING", "COMPROPER", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "LIST", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'while'", "'out'", "'read'", "'toInt'", "'length'", "'append'", "'compare'", "'copy'", "'return'"
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
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
        public Integer getCode(String s) {
            return s.codePointAt(1);
        }


    protected static class program_scope {
        String name;
        List globals;
        List functions;
        List strings;
        HashMap<String,Integer> stringsLengths;
    }
    protected Stack program_stack = new Stack();

    public static class program_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "program"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:54:1: program : ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings);
    public final strgramParser.program_return program() throws RecognitionException {
        program_stack.push(new program_scope());
        strgramParser.program_return retval = new strgramParser.program_return();
        retval.start = input.LT(1);

        strgramParser.fun_decl_return fun_decl1 = null;

        strgramParser.var_return var2 = null;



          ((program_scope)program_stack.peek()).globals = new ArrayList();
          ((program_scope)program_stack.peek()).functions = new ArrayList();
          ((program_scope)program_stack.peek()).strings = new ArrayList();
          ((program_scope)program_stack.peek()).stringsLengths = new HashMap<String,Integer>();
          ((program_scope)program_stack.peek()).name = "[global]";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:3: ( ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:3: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:3: ( fun_decl | var )+
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:71:5: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program74);
            	    fun_decl1=fun_decl();

            	    state._fsp--;


            	           ((program_scope)program_stack.peek()).functions.add((fun_decl1!=null?fun_decl1.st:null));
            	          

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:76:7: var
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
            // 84:5: -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:1: type returns [String idType] : ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char());
    public final strgramParser.type_return type() throws RecognitionException {
        strgramParser.type_return retval = new strgramParser.type_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:88:3: ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char())
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:5: 'Int'
                    {
                    match(input,25,FOLLOW_25_in_type161); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 89:39: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:90:5: 'String'
                    {
                    match(input,26,FOLLOW_26_in_type183); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 90:39: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:91:5: 'Char'
                    {
                    match(input,27,FOLLOW_27_in_type199); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 91:39: -> type_char()
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

    protected static class id_init_scope {
        String name;
    }
    protected Stack id_init_stack = new Stack();

    public static class id_init_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_init"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:94:1: id_init : a= ID ( EQUAL b= expr )? -> {$b.idType!=null && !\"[global]\".equals($program::name)}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> {$program::name.equals(\"[global]\") && \"Int\".equals($var::varType)}? def_glob(id=$a.texttype=$var::varTyperhs=$expr.st) -> {!$var::varType.equals(\"String\")}? def_var(id=$a.texttype=$var::varType) -> {!$program::name.equals(\"[global]\")}? def_str(id=$a.texttype=$var::varTypereg=getreg()) -> zero();
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        id_init_stack.push(new id_init_scope());
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:98:3: (a= ID ( EQUAL b= expr )? -> {$b.idType!=null && !\"[global]\".equals($program::name)}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> {$program::name.equals(\"[global]\") && \"Int\".equals($var::varType)}? def_glob(id=$a.texttype=$var::varTyperhs=$expr.st) -> {!$var::varType.equals(\"String\")}? def_var(id=$a.texttype=$var::varType) -> {!$program::name.equals(\"[global]\")}? def_str(id=$a.texttype=$var::varTypereg=getreg()) -> zero())
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:99:3: a= ID ( EQUAL b= expr )?
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_init235); 
            ((id_init_scope)id_init_stack.peek()).name = (a!=null?a.getText():null);
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:99:36: ( EQUAL b= expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:99:37: EQUAL b= expr
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_id_init240); 
                    pushFollow(FOLLOW_expr_in_id_init244);
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
                            if (b != null && !((var_scope)var_stack.peek()).varType.equals((b!=null?b.idType:null))) {
                                 errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null) +" wrong type conversion cannot convert " + (b!=null?b.idType:null) + " to " + ((var_scope)var_stack.peek()).varType);
                            }     	          
                 			    }
                         }
                


            // TEMPLATE REWRITE
            // 113:7: -> {$b.idType!=null && !\"[global]\".equals($program::name)}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st)
            if ((b!=null?b.idType:null)!=null && !"[global]".equals(((program_scope)program_stack.peek()).name)) {
                retval.st = templateLib.getInstanceOf("def_assign",
              new STAttrMap().put("type", ((var_scope)var_stack.peek()).varType).put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)));
            }
            else // 115:7: -> {$program::name.equals(\"[global]\") && \"Int\".equals($var::varType)}? def_glob(id=$a.texttype=$var::varTyperhs=$expr.st)
            if (((program_scope)program_stack.peek()).name.equals("[global]") && "Int".equals(((var_scope)var_stack.peek()).varType)) {
                retval.st = templateLib.getInstanceOf("def_glob",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType).put("rhs", (b!=null?b.st:null)));
            }
            else // 117:7: -> {!$var::varType.equals(\"String\")}? def_var(id=$a.texttype=$var::varType)
            if (!((var_scope)var_stack.peek()).varType.equals("String")) {
                retval.st = templateLib.getInstanceOf("def_var",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType));
            }
            else // 119:7: -> {!$program::name.equals(\"[global]\")}? def_str(id=$a.texttype=$var::varTypereg=getreg())
            if (!((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("def_str",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType).put("reg", getreg()));
            }
            else // 121:7: -> zero()
            {
                retval.st = templateLib.getInstanceOf("zero");
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            id_init_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "id_init"

    public static class id_assign_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_assign"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:127:1: id_assign returns [String idType] : a= ID ( '[' c= expr ']' )? EQUAL b= expr -> {$c.idType!=null}? array_assign(id=$a.textrhs=$b.stformat=$c.streg=getreg()) -> assign(id=$a.textrhs=$b.sttype=$idType);
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return c = null;

        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:128:3: (a= ID ( '[' c= expr ']' )? EQUAL b= expr -> {$c.idType!=null}? array_assign(id=$a.textrhs=$b.stformat=$c.streg=getreg()) -> assign(id=$a.textrhs=$b.sttype=$idType))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:129:3: a= ID ( '[' c= expr ']' )? EQUAL b= expr
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign436); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:129:7: ( '[' c= expr ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SQ_OPEN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:129:8: '[' c= expr ']'
                    {
                    match(input,SQ_OPEN,FOLLOW_SQ_OPEN_in_id_assign438); 
                    pushFollow(FOLLOW_expr_in_id_assign441);
                    c=expr();

                    state._fsp--;

                    match(input,SQ_CLOSE,FOLLOW_SQ_CLOSE_in_id_assign442); 

                    }
                    break;

            }

            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign446); 
            pushFollow(FOLLOW_expr_in_id_assign450);
            b=expr();

            state._fsp--;


                             if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                               names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
                               if ((c != null && !"Char".equals((b!=null?b.idType:null))) || (c==null && !retval.idType.equals((b!=null?b.idType:null)))) {
                                errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + (b!=null?b.idType:null) + " to " + retval.idType);
                               }
                             }else {
                                errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" cann't be resolved");
                           
                             }
                


            // TEMPLATE REWRITE
            // 142:3: -> {$c.idType!=null}? array_assign(id=$a.textrhs=$b.stformat=$c.streg=getreg())
            if ((c!=null?c.idType:null)!=null) {
                retval.st = templateLib.getInstanceOf("array_assign",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)).put("format", (c!=null?c.st:null)).put("reg", getreg()));
            }
            else // 144:3: -> assign(id=$a.textrhs=$b.sttype=$idType)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)).put("type", retval.idType));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:1: var : type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b);
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        List list_b=null;
        strgramParser.type_return type3 = null;

        RuleReturnScope b = null;

        ((var_scope)var_stack.peek()).varType = "";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:3: ( type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:154:3: type b+= id_init ( COMMA b+= id_init )* EOL
            {
            pushFollow(FOLLOW_type_in_var528);
            type3=type();

            state._fsp--;

            ((var_scope)var_stack.peek()).varType = (type3!=null?type3.idType:null);
            pushFollow(FOLLOW_id_init_in_var535);
            b=id_init();

            state._fsp--;

            if (list_b==null) list_b=new ArrayList();
            list_b.add(b.getTemplate());

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:154:52: ( COMMA b+= id_init )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:154:53: COMMA b+= id_init
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_var538); 
            	    pushFollow(FOLLOW_id_init_in_var542);
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

            match(input,EOL,FOLLOW_EOL_in_var546); 


            // TEMPLATE REWRITE
            // 155:7: -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b)
            if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("globalVars",
              new STAttrMap().put("vars", list_b));
            }
            else // 157:7: -> vars(vars=$b)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:161:1: listParams : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a);
    public final strgramParser.listParams_return listParams() throws RecognitionException {
        strgramParser.listParams_return retval = new strgramParser.listParams_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:1: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_listParams603); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:12: (a+= expr ( COMMA a+= expr )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||LA7_0==PAR_OPEN||(LA7_0>=INT && LA7_0<=STRING)||(LA7_0>=32 && LA7_0<=38)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_listParams608);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:21: ( COMMA a+= expr )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listParams611); 
                    	    pushFollow(FOLLOW_expr_in_listParams615);
                    	    a=expr();

                    	    state._fsp--;

                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_listParams621); 


            // TEMPLATE REWRITE
            // 164:3: -> iconst(value=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st};
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        Token MATHOPER4=null;
        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:3: (a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:3: a= math_exp ( MATHOPER b= math_exp )?
            {
            pushFollow(FOLLOW_math_exp_in_expr651);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:14: ( MATHOPER b= math_exp )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==MATHOPER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:15: MATHOPER b= math_exp
                    {
                    MATHOPER4=(Token)match(input,MATHOPER,FOLLOW_MATHOPER_in_expr654); 
                    pushFollow(FOLLOW_math_exp_in_expr658);
                    b=math_exp();

                    state._fsp--;


                    }
                    break;

            }


                  retval.idType = (a!=null?a.idType:null);
              


            // TEMPLATE REWRITE
            // 173:7: -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st)
            if ((b!=null?b.st:null)!=null) {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (MATHOPER4!=null?MATHOPER4.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
            }
            else // 175:7: -> {$a.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st} | a= data_id c= '[' b= expr ']' -> get_elem(format=$a.streg=getreg()format2=$b.sttype=$idType));
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        Token c=null;
        strgramParser.data_id_return a = null;

        strgramParser.expr_return b = null;

        strgramParser.data_id_return data_id5 = null;

        strgramParser.expr_return expr6 = null;

        strgramParser.fun_call_return fun_call7 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st} | a= data_id c= '[' b= expr ']' -> get_elem(format=$a.streg=getreg()format2=$b.sttype=$idType))
            int alt9=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case PAR_OPEN:
                    {
                    alt9=3;
                    }
                    break;
                case COMMA:
                case EOL:
                case PAR_CLOSE:
                case MATHOPER:
                case COMPROPER:
                case SQ_CLOSE:
                    {
                    alt9=1;
                    }
                    break;
                case SQ_OPEN:
                    {
                    alt9=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

                }
                break;
            case INT:
                {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=COMMA && LA9_2<=EOL)||(LA9_2>=PAR_CLOSE && LA9_2<=MATHOPER)||LA9_2==COMPROPER||LA9_2==SQ_CLOSE) ) {
                    alt9=1;
                }
                else if ( (LA9_2==SQ_OPEN) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case STRING:
                {
                int LA9_3 = input.LA(2);

                if ( ((LA9_3>=COMMA && LA9_3<=EOL)||(LA9_3>=PAR_CLOSE && LA9_3<=MATHOPER)||LA9_3==COMPROPER||LA9_3==SQ_CLOSE) ) {
                    alt9=1;
                }
                else if ( (LA9_3==SQ_OPEN) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case CHAR:
                {
                int LA9_4 = input.LA(2);

                if ( ((LA9_4>=COMMA && LA9_4<=EOL)||(LA9_4>=PAR_CLOSE && LA9_4<=MATHOPER)||LA9_4==COMPROPER||LA9_4==SQ_CLOSE) ) {
                    alt9=1;
                }
                else if ( (LA9_4==SQ_OPEN) ) {
                    alt9=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 4, input);

                    throw nvae;
                }
                }
                break;
            case PAR_OPEN:
                {
                alt9=2;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:180:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp734);
                    data_id5=data_id();

                    state._fsp--;


                        retval.idType = (data_id5!=null?data_id5.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 184:3: -> {$data_id.st}
                    {
                        retval.st = (data_id5!=null?data_id5.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:186:3: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp769); 
                    pushFollow(FOLLOW_expr_in_math_exp771);
                    expr6=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp773); 

                        retval.idType = (expr6!=null?expr6.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 190:3: -> {$expr.st}
                    {
                        retval.st = (expr6!=null?expr6.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:192:3: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_math_exp793);
                    fun_call7=fun_call();

                    state._fsp--;


                        retval.idType = (fun_call7!=null?fun_call7.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 196:3: -> {$fun_call.st}
                    {
                        retval.st = (fun_call7!=null?fun_call7.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:3: a= data_id c= '[' b= expr ']'
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp815);
                    a=data_id();

                    state._fsp--;

                    c=(Token)match(input,SQ_OPEN,FOLLOW_SQ_OPEN_in_math_exp819); 
                    pushFollow(FOLLOW_expr_in_math_exp822);
                    b=expr();

                    state._fsp--;

                    match(input,SQ_CLOSE,FOLLOW_SQ_CLOSE_in_math_exp823); 

                               if (!"String".equals((a!=null?a.idType:null))) {
                                  errors.add("line " + (c!=null?c.getLine():0) + ": get array element operation error " + (a!=null?input.toString(a.start,a.stop):null) + " type must be String, not " + (a!=null?a.idType:null));
                               }
                               retval.idType = "Char";
                        


                    // TEMPLATE REWRITE
                    // 205:3: -> get_elem(format=$a.streg=getreg()format2=$b.sttype=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("get_elem",
                      new STAttrMap().put("format", (a!=null?a.st:null)).put("reg", getreg()).put("format2", (b!=null?b.st:null)).put("type", retval.idType));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:208:1: data returns [String idType] : ( INT -> int(reg=getreg()v=$INT.texttype=$idType) | str -> {$str.st} | CHAR -> char(reg=getreg()v=getCode($CHAR.text)type=$idType));
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT8=null;
        Token CHAR10=null;
        strgramParser.str_return str9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:209:3: ( INT -> int(reg=getreg()v=$INT.texttype=$idType) | str -> {$str.st} | CHAR -> char(reg=getreg()v=getCode($CHAR.text)type=$idType))
            int alt10=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt10=1;
                }
                break;
            case STRING:
                {
                alt10=2;
                }
                break;
            case CHAR:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:5: INT
                    {
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_data873); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 212:5: -> int(reg=getreg()v=$INT.texttype=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("reg", getreg()).put("v", (INT8!=null?INT8.getText():null)).put("type", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:4: str
                    {
                    pushFollow(FOLLOW_str_in_data922);
                    str9=str();

                    state._fsp--;


                    	    retval.idType = "String";
                    	    ((program_scope)program_stack.peek()).strings.add((str9!=null?str9.st:null));
                    	  


                    // TEMPLATE REWRITE
                    // 219:4: -> {$str.st}
                    {
                        retval.st = (str9!=null?str9.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:221:5: CHAR
                    {
                    CHAR10=(Token)match(input,CHAR,FOLLOW_CHAR_in_data949); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 223:5: -> char(reg=getreg()v=getCode($CHAR.text)type=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("char",
                      new STAttrMap().put("reg", getreg()).put("v", getCode((CHAR10!=null?CHAR10.getText():null))).put("type", retval.idType));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:1: str : STRING -> string(reg=getreg()v=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text)type=\"String\"name=name);
    public final strgramParser.str_return str() throws RecognitionException {
        strgramParser.str_return retval = new strgramParser.str_return();
        retval.start = input.LT(1);

        Token STRING11=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:1: ( STRING -> string(reg=getreg()v=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text)type=\"String\"name=name))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:3: STRING
            {
            STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_str994); 

              String name;
              if ("[global]".equals(((program_scope)program_stack.peek()).name)){
                name = ((id_init_scope)id_init_stack.peek()).name; 
              } else {
                name = ".str" + String.valueOf(getreg());
              }
              ((program_scope)program_stack.peek()).stringsLengths.put(name,getStringLength((STRING11!=null?STRING11.getText():null)));



            // TEMPLATE REWRITE
            // 237:3: -> string(reg=getreg()v=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text)type=\"String\"name=name)
            {
                retval.st = templateLib.getInstanceOf("string",
              new STAttrMap().put("reg", getreg()).put("v", getString((STRING11!=null?STRING11.getText():null))).put("sreg", getstr((STRING11!=null?STRING11.getText():null))).put("len", getStringLength((STRING11!=null?STRING11.getText():null))).put("type", "String").put("name", name));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:241:1: data_id returns [String idType] : ( ID -> {\"global\".equals(scope) && \"String\".equals($idType)}? load_global_str(reg=getreg()id=$ID.texttype=$idTypelen=$program::stringsLengths.get($ID.text)name=$ID.text) -> {\"global\".equals(scope)}? load_global_var(reg=getreg()id=$ID.texttype=$idType) -> load_var(reg=getreg()id=$ID.texttype=$idType) | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID12=null;
        strgramParser.data_return data13 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:3: ( ID -> {\"global\".equals(scope) && \"String\".equals($idType)}? load_global_str(reg=getreg()id=$ID.texttype=$idTypelen=$program::stringsLengths.get($ID.text)name=$ID.text) -> {\"global\".equals(scope)}? load_global_var(reg=getreg()id=$ID.texttype=$idType) -> load_var(reg=getreg()id=$ID.texttype=$idType) | data -> {$data.st})
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=INT && LA11_0<=STRING)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:3: ID
                    {
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_data_id1048); 

                      String scope = null;
                         if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null))) {
                               errors.add("line "+(ID12!=null?ID12.getLine():0)+": name "+(ID12!=null?ID12.getText():null)+" cannot be resolved");
                         } else {
                               names.get(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null)).addLineUses((ID12!=null?ID12.getLine():0));   
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null)).getType();
                               scope = names.getScope(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null));
                         }
                      


                    // TEMPLATE REWRITE
                    // 254:3: -> {\"global\".equals(scope) && \"String\".equals($idType)}? load_global_str(reg=getreg()id=$ID.texttype=$idTypelen=$program::stringsLengths.get($ID.text)name=$ID.text)
                    if ("global".equals(scope) && "String".equals(retval.idType)) {
                        retval.st = templateLib.getInstanceOf("load_global_str",
                      new STAttrMap().put("reg", getreg()).put("id", (ID12!=null?ID12.getText():null)).put("type", retval.idType).put("len", ((program_scope)program_stack.peek()).stringsLengths.get((ID12!=null?ID12.getText():null))).put("name", (ID12!=null?ID12.getText():null)));
                    }
                    else // 256:3: -> {\"global\".equals(scope)}? load_global_var(reg=getreg()id=$ID.texttype=$idType)
                    if ("global".equals(scope)) {
                        retval.st = templateLib.getInstanceOf("load_global_var",
                      new STAttrMap().put("reg", getreg()).put("id", (ID12!=null?ID12.getText():null)).put("type", retval.idType));
                    }
                    else // 258:3: -> load_var(reg=getreg()id=$ID.texttype=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("load_var",
                      new STAttrMap().put("reg", getreg()).put("id", (ID12!=null?ID12.getText():null)).put("type", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:260:3: data
                    {
                    pushFollow(FOLLOW_data_in_data_id1156);
                    data13=data();

                    state._fsp--;

                    retval.idType = (data13!=null?data13.idType:null);


                    // TEMPLATE REWRITE
                    // 262:3: -> {$data.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:265:1: if_op : 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg());
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond14 = null;

        strgramParser.fun_body_return fun_body15 = null;

        strgramParser.else_block_return else_block16 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:270:3: ( 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:271:3: 'if' bool_cond fun_body ( else_block )?
            {
            match(input,28,FOLLOW_28_in_if_op1193); 
            pushFollow(FOLLOW_bool_cond_in_if_op1195);
            bool_cond14=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op1197);
            fun_body15=fun_body();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:271:27: ( else_block )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:271:27: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_op1199);
                    else_block16=else_block();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 272:3: -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg())
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:275:1: else_block : 'else' fun_body -> {$fun_body.st};
    public final strgramParser.else_block_return else_block() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.else_block_return retval = new strgramParser.else_block_return();
        retval.start = input.LT(1);

        strgramParser.fun_body_return fun_body17 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:280:3: ( 'else' fun_body -> {$fun_body.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:281:3: 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_else_block1251); 
            pushFollow(FOLLOW_fun_body_in_else_block1253);
            fun_body17=fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 282:5: -> {$fun_body.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:285:1: for_op : 'for' PAR_OPEN for_var COMMA math_exp PAR_CLOSE fun_body -> for_op(id=$for_var.stcond=$math_exp.ststat=$fun_body.sttmp=getreg()reg=getreg());
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        strgramParser.for_var_return for_var18 = null;

        strgramParser.math_exp_return math_exp19 = null;

        strgramParser.fun_body_return fun_body20 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:290:3: ( 'for' PAR_OPEN for_var COMMA math_exp PAR_CLOSE fun_body -> for_op(id=$for_var.stcond=$math_exp.ststat=$fun_body.sttmp=getreg()reg=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:3: 'for' PAR_OPEN for_var COMMA math_exp PAR_CLOSE fun_body
            {
            match(input,30,FOLLOW_30_in_for_op1285); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op1287); 
            pushFollow(FOLLOW_for_var_in_for_op1289);
            for_var18=for_var();

            state._fsp--;

            match(input,COMMA,FOLLOW_COMMA_in_for_op1291); 
            pushFollow(FOLLOW_math_exp_in_for_op1293);
            math_exp19=math_exp();

            state._fsp--;

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op1295); 
            pushFollow(FOLLOW_fun_body_in_for_op1297);
            fun_body20=fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 292:3: -> for_op(id=$for_var.stcond=$math_exp.ststat=$fun_body.sttmp=getreg()reg=getreg())
            {
                retval.st = templateLib.getInstanceOf("for_op",
              new STAttrMap().put("id", (for_var18!=null?for_var18.st:null)).put("cond", (math_exp19!=null?math_exp19.st:null)).put("stat", (fun_body20!=null?fun_body20.st:null)).put("tmp", getreg()).put("reg", getreg()));
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

    public static class for_var_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:295:1: for_var : a= ID -> def_var(id=$ID.texttype=\"Int\");
    public final strgramParser.for_var_return for_var() throws RecognitionException {
        strgramParser.for_var_return retval = new strgramParser.for_var_return();
        retval.start = input.LT(1);

        Token a=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:296:1: (a= ID -> def_var(id=$ID.texttype=\"Int\"))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:297:3: a= ID
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_for_var1344); 

                         if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                             errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                         } else {
                            names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), "Int", (a!=null?a.getLine():0)));
                            names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
              


            // TEMPLATE REWRITE
            // 306:3: -> def_var(id=$ID.texttype=\"Int\")
            {
                retval.st = templateLib.getInstanceOf("def_var",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", "Int"));
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
    // $ANTLR end "for_var"

    public static class while_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "while_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:1: while_op : 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::locals);
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond21 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:314:3: ( 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::locals))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:315:3: 'while' bool_cond fun_body
            {
            match(input,31,FOLLOW_31_in_while_op1386); 
            pushFollow(FOLLOW_bool_cond_in_while_op1388);
            bool_cond21=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op1390);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 316:5: -> while_op(bool_cond=$bool_cond.stlocals=$slist::locals)
            {
                retval.st = templateLib.getInstanceOf("while_op",
              new STAttrMap().put("bool_cond", (bool_cond21!=null?bool_cond21.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:319:1: bool_cond : PAR_OPEN a= expr COMPROPER b= expr PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st);
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        Token COMPROPER22=null;
        strgramParser.expr_return a = null;

        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:320:3: ( PAR_OPEN a= expr COMPROPER b= expr PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:321:3: PAR_OPEN a= expr COMPROPER b= expr PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond1422); 
            pushFollow(FOLLOW_expr_in_bool_cond1426);
            a=expr();

            state._fsp--;

            COMPROPER22=(Token)match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond1428); 
            pushFollow(FOLLOW_expr_in_bool_cond1432);
            b=expr();

            state._fsp--;

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond1434); 


            // TEMPLATE REWRITE
            // 322:3: -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st)
            {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (COMPROPER22!=null?COMPROPER22.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:325:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:326:3: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:327:3: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id1474); 
            match(input,ID,FOLLOW_ID_in_brack_id1476); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1478); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:330:1: in_out_op returns [String idType] : ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE -> outOp(format=$data_id.stparams=$e) | b= 'read' PAR_OPEN PAR_CLOSE -> readOp(reg=getreg()tmp=getreg()type=$idType) | b= 'toInt' PAR_OPEN a= data_id PAR_CLOSE -> toIntOp(format=$a.streg=getreg()type=$idType) | b= 'length' PAR_OPEN a= data_id PAR_CLOSE -> length_op(format=$a.streg=getreg()tmp=getreg()type=$idType) | b= 'append' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> append_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType) | b= 'compare' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> compare_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType) | b= 'copy' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> copy_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType));
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        Token b=null;
        List list_e=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return a1 = null;

        strgramParser.data_id_return a2 = null;

        strgramParser.data_id_return data_id23 = null;

        RuleReturnScope e = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:331:3: ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE -> outOp(format=$data_id.stparams=$e) | b= 'read' PAR_OPEN PAR_CLOSE -> readOp(reg=getreg()tmp=getreg()type=$idType) | b= 'toInt' PAR_OPEN a= data_id PAR_CLOSE -> toIntOp(format=$a.streg=getreg()type=$idType) | b= 'length' PAR_OPEN a= data_id PAR_CLOSE -> length_op(format=$a.streg=getreg()tmp=getreg()type=$idType) | b= 'append' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> append_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType) | b= 'compare' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> compare_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType) | b= 'copy' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> copy_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType))
            int alt14=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 36:
                {
                alt14=5;
                }
                break;
            case 37:
                {
                alt14=6;
                }
                break;
            case 38:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:332:5: 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE
                    {
                    match(input,32,FOLLOW_32_in_in_out_op1499); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1501); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1503);
                    data_id23=data_id();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:332:28: ( COMMA e+= expr )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:332:29: COMMA e+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1506); 
                    	    pushFollow(FOLLOW_expr_in_in_out_op1510);
                    	    e=expr();

                    	    state._fsp--;

                    	    if (list_e==null) list_e=new ArrayList();
                    	    list_e.add(e.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1514); 

                         retval.idType = null;
                        


                    // TEMPLATE REWRITE
                    // 336:3: -> outOp(format=$data_id.stparams=$e)
                    {
                        retval.st = templateLib.getInstanceOf("outOp",
                      new STAttrMap().put("format", (data_id23!=null?data_id23.st:null)).put("params", list_e));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:338:5: b= 'read' PAR_OPEN PAR_CLOSE
                    {
                    b=(Token)match(input,33,FOLLOW_33_in_in_out_op1550); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1552); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1554); 

                          retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 342:5: -> readOp(reg=getreg()tmp=getreg()type=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("readOp",
                      new STAttrMap().put("reg", getreg()).put("tmp", getreg()).put("type", retval.idType));
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:5: b= 'toInt' PAR_OPEN a= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,34,FOLLOW_34_in_in_out_op1594); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1596); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1600);
                    a=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1602); 

                               if (!"String".equals((a!=null?a.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": "+ (b!=null?b.getText():null) +" operation error " + (a!=null?input.toString(a.start,a.stop):null) + " type must be String, not " + (a!=null?a.idType:null));
                               }
                               retval.idType = "Int";
                        


                    // TEMPLATE REWRITE
                    // 351:5: -> toIntOp(format=$a.streg=getreg()type=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("toIntOp",
                      new STAttrMap().put("format", (a!=null?a.st:null)).put("reg", getreg()).put("type", retval.idType));
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:353:5: b= 'length' PAR_OPEN a= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,35,FOLLOW_35_in_in_out_op1642); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1644); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1648);
                    a=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1650); 

                               if (!"String".equals((a!=null?a.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a!=null?input.toString(a.start,a.stop):null) + " type must be String, not " + (a!=null?a.idType:null));
                               }
                               retval.idType = "Int";
                        


                    // TEMPLATE REWRITE
                    // 360:4: -> length_op(format=$a.streg=getreg()tmp=getreg()type=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("length_op",
                      new STAttrMap().put("format", (a!=null?a.st:null)).put("reg", getreg()).put("tmp", getreg()).put("type", retval.idType));
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:362:4: b= 'append' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,36,FOLLOW_36_in_in_out_op1691); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1693); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1697);
                    a1=data_id();

                    state._fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1699); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1703);
                    a2=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1705); 

                               if (!"String".equals((a1!=null?a1.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a1!=null?input.toString(a1.start,a1.stop):null) + " type must be String, not " + (a1!=null?a1.idType:null));
                               }
                               if (!"String".equals((a2!=null?a2.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a2!=null?input.toString(a2.start,a2.stop):null) + " type must be String, not " + (a2!=null?a2.idType:null));
                               }
                               retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 372:4: -> append_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("append_op",
                      new STAttrMap().put("arg1", (a1!=null?a1.st:null)).put("arg2", (a2!=null?a2.st:null)).put("reg", getreg()).put("type", retval.idType));
                    }


                    }
                    break;
                case 6 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:374:4: b= 'compare' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,37,FOLLOW_37_in_in_out_op1747); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1749); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1753);
                    a1=data_id();

                    state._fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1755); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1759);
                    a2=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1761); 

                               if (!"String".equals((a1!=null?a1.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a1!=null?input.toString(a1.start,a1.stop):null) + " type must be String, not " + (a1!=null?a1.idType:null));
                               }
                               if (!"String".equals((a2!=null?a2.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a2!=null?input.toString(a2.start,a2.stop):null) + " type must be String, not " + (a2!=null?a2.idType:null));
                               }
                               retval.idType = "Int";
                        


                    // TEMPLATE REWRITE
                    // 384:4: -> compare_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("compare_op",
                      new STAttrMap().put("arg1", (a1!=null?a1.st:null)).put("arg2", (a2!=null?a2.st:null)).put("reg", getreg()).put("type", retval.idType));
                    }


                    }
                    break;
                case 7 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:386:4: b= 'copy' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,38,FOLLOW_38_in_in_out_op1803); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1805); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1809);
                    a1=data_id();

                    state._fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1811); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1815);
                    a2=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1817); 

                               if (!"String".equals((a1!=null?a1.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a1!=null?input.toString(a1.start,a1.stop):null) + " type must be String, not " + (a1!=null?a1.idType:null));
                               }
                               if (!"String".equals((a2!=null?a2.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a2!=null?input.toString(a2.start,a2.stop):null) + " type must be String, not " + (a2!=null?a2.idType:null));
                               }
                               retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 396:4: -> copy_op(arg1=$a1.starg2=$a2.streg=getreg()type=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("copy_op",
                      new STAttrMap().put("arg1", (a1!=null?a1.st:null)).put("arg2", (a2!=null?a2.st:null)).put("reg", getreg()).put("type", retval.idType));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:399:1: fun_call returns [String idType] : (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$btype=$idType) | in_out_op -> {$in_out_op.st});
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.in_out_op_return in_out_op24 = null;

        RuleReturnScope b = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:3: (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$btype=$idType) | in_out_op -> {$in_out_op.st})
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=32 && LA17_0<=38)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:401:3: a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1869); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_call1871); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:401:17: (b+= expr ( COMMA b+= expr )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==ID||LA16_0==PAR_OPEN||(LA16_0>=INT && LA16_0<=STRING)||(LA16_0>=32 && LA16_0<=38)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:401:18: b+= expr ( COMMA b+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_fun_call1876);
                            b=expr();

                            state._fsp--;

                            if (list_b==null) list_b=new ArrayList();
                            list_b.add(b.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:401:26: ( COMMA b+= expr )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==COMMA) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:401:27: COMMA b+= expr
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_call1879); 
                            	    pushFollow(FOLLOW_expr_in_fun_call1883);
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

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_call1889); 

                         if (!methods.isExist((a!=null?a.getText():null))) {
                         	errors.add("line " + (a!=null?a.getLine():0) + ": methon name " + (a!=null?a.getText():null)	+ " cannot be resolved");
                         } else {
                         	retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();
                         	methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
                        


                    // TEMPLATE REWRITE
                    // 410:3: -> funCall(reg=getreg()funName=$a.textfunArgs=$btype=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("funCall",
                      new STAttrMap().put("reg", getreg()).put("funName", (a!=null?a.getText():null)).put("funArgs", list_b).put("type", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:412:3: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1929);
                    in_out_op24=in_out_op();

                    state._fsp--;


                         retval.idType = (in_out_op24!=null?in_out_op24.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 416:3: -> {$in_out_op.st}
                    {
                        retval.st = (in_out_op24!=null?in_out_op24.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:420:1: op_cond : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a);
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:421:3: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:422:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1958); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:422:12: (a+= expr ( COMMA a+= expr )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID||LA19_0==PAR_OPEN||(LA19_0>=INT && LA19_0<=STRING)||(LA19_0>=32 && LA19_0<=38)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:422:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_op_cond1963);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:422:21: ( COMMA a+= expr )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:422:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1966); 
                    	    pushFollow(FOLLOW_expr_in_op_cond1970);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1976); 


            // TEMPLATE REWRITE
            // 423:3: -> args(args=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:426:1: ops : ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st));
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign25 = null;

        strgramParser.if_op_return if_op26 = null;

        strgramParser.while_op_return while_op27 = null;

        strgramParser.for_op_return for_op28 = null;

        strgramParser.fun_call_return fun_call29 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:427:3: ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st))
            int alt20=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==PAR_OPEN) ) {
                    alt20=5;
                }
                else if ( (LA20_1==EQUAL||LA20_1==SQ_OPEN) ) {
                    alt20=1;
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
            case 31:
                {
                alt20=3;
                }
                break;
            case 30:
                {
                alt20=4;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:428:3: id_assign EOL
                    {
                    pushFollow(FOLLOW_id_assign_in_ops2002);
                    id_assign25=id_assign();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops2004); 


                    // TEMPLATE REWRITE
                    // 429:5: -> statement(expr=$id_assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_assign25!=null?id_assign25.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:430:5: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops2022);
                    if_op26=if_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 431:5: -> {$if_op.st}
                    {
                        retval.st = (if_op26!=null?if_op26.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:432:5: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops2035);
                    while_op27=while_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 433:5: -> {$while_op.st}
                    {
                        retval.st = (while_op27!=null?while_op27.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:434:5: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops2048);
                    for_op28=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 435:5: -> {$for_op.st}
                    {
                        retval.st = (for_op28!=null?for_op28.st:null);
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:436:5: fun_call EOL
                    {
                    pushFollow(FOLLOW_fun_call_in_ops2061);
                    fun_call29=fun_call();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops2063); 


                    // TEMPLATE REWRITE
                    // 437:5: -> statement(expr=$fun_call.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (fun_call29!=null?fun_call29.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:440:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:441:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:442:3: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun2090); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun2092); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun2094); 
            pushFollow(FOLLOW_fun_body_in_main_fun2096);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:445:1: fun_decl : ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::locals));
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.fun_decl_return retval = new strgramParser.fun_decl_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_p=null;
        strgramParser.type_return type30 = null;

        strgramParser.fun_body_return fun_body31 = null;

        RuleReturnScope p = null;

          ((slist_scope)slist_stack.peek()).locals = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:450:3: ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::locals))
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:451:3: ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:451:3: ( type )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=25 && LA21_0<=27)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:451:3: type
                            {
                            pushFollow(FOLLOW_type_in_fun_decl2121);
                            type30=type();

                            state._fsp--;


                            }
                            break;

                    }

                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl2126); 

                         ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
                         methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type30!=null?type30.idType:null)));
                        
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl2137); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:456:12: (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=25 && LA23_0<=27)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:456:13: p+= parameter_declaration ( COMMA p+= parameter_declaration )*
                            {
                            pushFollow(FOLLOW_parameter_declaration_in_fun_decl2142);
                            p=parameter_declaration();

                            state._fsp--;

                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:456:38: ( COMMA p+= parameter_declaration )*
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( (LA22_0==COMMA) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:456:39: COMMA p+= parameter_declaration
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_decl2145); 
                            	    pushFollow(FOLLOW_parameter_declaration_in_fun_decl2149);
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

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl2155); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl2157);
                    fun_body31=fun_body();

                    state._fsp--;


                         if ((type30!=null?type30.idType:null) != null) {
                         	if ((fun_body31!=null?fun_body31.idType:null) == null) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null) + " missing return statement, expecting " + (type30!=null?type30.idType:null));
                         	} else if (!(type30!=null?type30.idType:null).equals((fun_body31!=null?fun_body31.idType:null))) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null) + " wrong type conversion cannot convert return type " + (fun_body31!=null?fun_body31.idType:null) + " to " + (type30!=null?type30.idType:null));
                         	}
                         }
                        


                    // TEMPLATE REWRITE
                    // 466:4: -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsargs=$p)
                    {
                        retval.st = templateLib.getInstanceOf("fun_decl",
                      new STAttrMap().put("type", (type30!=null?type30.st:null)).put("name", (a!=null?a.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("args", list_p));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:467:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
                    {
                    match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_fun_decl2199); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl2201); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl2203); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl2205);
                    fun_body();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 468:4: -> main_decl(locals=$slist::locals)
                    {
                        retval.st = templateLib.getInstanceOf("main_decl",
                      new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:471:1: parameter_declaration : type a= ID -> def_arg(id=$ID.texttype=$type.st);
    public final strgramParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        strgramParser.parameter_declaration_return retval = new strgramParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.type_return type32 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:472:3: ( type a= ID -> def_arg(id=$ID.texttype=$type.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:3: type a= ID
            {
            pushFollow(FOLLOW_type_in_parameter_declaration2234);
            type32=type();

            state._fsp--;

            a=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration2238); 

                   if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                   } else {
                      names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type32!=null?type32.idType:null), (a!=null?a.getLine():0)));
                   }
              


            // TEMPLATE REWRITE
            // 481:3: -> def_arg(id=$ID.texttype=$type.st)
            {
                retval.st = templateLib.getInstanceOf("def_arg",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", (type32!=null?type32.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:484:1: fun_body returns [String idType] : CUR_OPEN ( ( var | ops )+ )? ( return_st )? CUR_CLOSE -> block(locals=$slist::locals);
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        strgramParser.var_return var33 = null;

        strgramParser.ops_return ops34 = null;

        strgramParser.return_st_return return_st35 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:485:3: ( CUR_OPEN ( ( var | ops )+ )? ( return_st )? CUR_CLOSE -> block(locals=$slist::locals))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:3: CUR_OPEN ( ( var | ops )+ )? ( return_st )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body2277); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:12: ( ( var | ops )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==ID||(LA26_0>=25 && LA26_0<=28)||(LA26_0>=30 && LA26_0<=38)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:13: ( var | ops )+
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:13: ( var | ops )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=3;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=25 && LA25_0<=27)) ) {
                            alt25=1;
                        }
                        else if ( (LA25_0==ID||LA25_0==28||(LA25_0>=30 && LA25_0<=38)) ) {
                            alt25=2;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:14: var
                    	    {
                    	    pushFollow(FOLLOW_var_in_fun_body2281);
                    	    var33=var();

                    	    state._fsp--;

                    	    ((slist_scope)slist_stack.peek()).locals.add((var33!=null?var33.st:null));

                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:50: ops
                    	    {
                    	    pushFollow(FOLLOW_ops_in_fun_body2286);
                    	    ops34=ops();

                    	    state._fsp--;

                    	    ((slist_scope)slist_stack.peek()).locals.add((ops34!=null?ops34.st:null));

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:89: ( return_st )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:486:89: return_st
                    {
                    pushFollow(FOLLOW_return_st_in_fun_body2294);
                    return_st35=return_st();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body2297); 

                ((slist_scope)slist_stack.peek()).locals.add((return_st35!=null?return_st35.st:null));
                if ((return_st35!=null?return_st35.idType:null) != null) {
                  retval.idType = (return_st35!=null?return_st35.idType:null);
                } 
              


            // TEMPLATE REWRITE
            // 493:3: -> block(locals=$slist::locals)
            {
                retval.st = templateLib.getInstanceOf("block",
              new STAttrMap().put("locals", ((slist_scope)slist_stack.peek()).locals));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:496:1: return_st returns [String idType] : 'return' expr EOL -> return_st(ret_val=$expr.st);
    public final strgramParser.return_st_return return_st() throws RecognitionException {
        strgramParser.return_st_return retval = new strgramParser.return_st_return();
        retval.start = input.LT(1);

        strgramParser.expr_return expr36 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:497:1: ( 'return' expr EOL -> return_st(ret_val=$expr.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:498:2: 'return' expr EOL
            {
            match(input,39,FOLLOW_39_in_return_st2330); 
            pushFollow(FOLLOW_expr_in_return_st2332);
            expr36=expr();

            state._fsp--;

            match(input,EOL,FOLLOW_EOL_in_return_st2334); 

            	   retval.idType = (expr36!=null?expr36.idType:null);
            	


            // TEMPLATE REWRITE
            // 502:2: -> return_st(ret_val=$expr.st)
            {
                retval.st = templateLib.getInstanceOf("return_st",
              new STAttrMap().put("ret_val", (expr36!=null?expr36.st:null)));
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
    public static final BitSet FOLLOW_ID_in_id_init235 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQUAL_in_id_init240 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_id_init244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign436 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_SQ_OPEN_in_id_assign438 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_id_assign441 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SQ_CLOSE_in_id_assign442 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign446 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_id_assign450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var535 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_COMMA_in_var538 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var542 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_EOL_in_var546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_listParams603 = new BitSet(new long[]{0x0000007F00003B10L});
    public static final BitSet FOLLOW_expr_in_listParams608 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_listParams611 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_listParams615 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_listParams621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr651 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_MATHOPER_in_expr654 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_math_exp_in_expr658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp769 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_math_exp771 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_math_exp793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp815 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SQ_OPEN_in_math_exp819 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_math_exp822 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SQ_CLOSE_in_math_exp823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_str_in_data922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_str994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_if_op1193 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_if_op1195 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_if_op1197 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_else_block_in_if_op1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_else_block1251 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_else_block1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_for_op1285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op1287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_for_var_in_for_op1289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_for_op1291 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_math_exp_in_for_op1293 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op1295 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_for_op1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_for_var1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_while_op1386 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_while_op1388 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_while_op1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond1422 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_bool_cond1426 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond1428 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_bool_cond1432 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1476 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_in_out_op1499 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1501 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1503 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1506 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_in_out_op1510 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_in_out_op1550 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1552 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1594 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1596 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1600 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op1642 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1644 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1648 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_in_out_op1691 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1693 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1697 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1699 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1703 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_in_out_op1747 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1749 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1753 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1755 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1759 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_in_out_op1803 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1805 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1809 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1811 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1815 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1869 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_call1871 = new BitSet(new long[]{0x0000007F00003B10L});
    public static final BitSet FOLLOW_expr_in_fun_call1876 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_call1879 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_fun_call1883 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_call1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1958 = new BitSet(new long[]{0x0000007F00003B10L});
    public static final BitSet FOLLOW_expr_in_op_cond1963 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1966 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_op_cond1970 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_ops2002 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_ops2061 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun2090 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun2092 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun2094 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl2121 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl2126 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl2137 = new BitSet(new long[]{0x000000000E000200L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl2142 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_decl2145 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl2149 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl2155 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_fun_decl2199 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl2201 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl2203 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter_declaration2234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body2277 = new BitSet(new long[]{0x000000FFDE028010L});
    public static final BitSet FOLLOW_var_in_fun_body2281 = new BitSet(new long[]{0x000000FFDE028010L});
    public static final BitSet FOLLOW_ops_in_fun_body2286 = new BitSet(new long[]{0x000000FFDE028010L});
    public static final BitSet FOLLOW_return_st_in_fun_body2294 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_return_st2330 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_return_st2332 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_return_st2334 = new BitSet(new long[]{0x0000000000000002L});

}