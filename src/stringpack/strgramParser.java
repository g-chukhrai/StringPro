// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-04-23 22:49:06
 
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
        public Integer getCode(String s) {
            return s.codePointAt(1);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:55:1: program : ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings);
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:68:3: ( ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:3: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:69:3: ( fun_decl | var )+
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:70:5: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program74);
            	    fun_decl1=fun_decl();

            	    state._fsp--;


            	           ((program_scope)program_stack.peek()).functions.add((fun_decl1!=null?fun_decl1.st:null));
            	          

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:75:7: var
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
            // 83:5: -> program(globals=$program::globalsfunctions=$program::functionsstrings=$program::strings)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:86:1: type returns [String idType] : ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char());
    public final strgramParser.type_return type() throws RecognitionException {
        strgramParser.type_return retval = new strgramParser.type_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:87:3: ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char())
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:88:5: 'Int'
                    {
                    match(input,25,FOLLOW_25_in_type161); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 88:39: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:89:5: 'String'
                    {
                    match(input,26,FOLLOW_26_in_type183); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 89:39: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:90:5: 'Char'
                    {
                    match(input,27,FOLLOW_27_in_type199); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 90:39: -> type_char()
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:93:1: id_init : a= ID ( EQUAL b= expr )? -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> {$program::name.equals(\"[global]\")}? def_glob(id=$a.texttype=$var::varType) -> {!$var::varType.equals(\"String\")}? def_var(id=$a.texttype=$var::varType) -> def_str(id=$a.texttype=$var::varTypereg=getreg());
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:94:3: (a= ID ( EQUAL b= expr )? -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st) -> {$program::name.equals(\"[global]\")}? def_glob(id=$a.texttype=$var::varType) -> {!$var::varType.equals(\"String\")}? def_var(id=$a.texttype=$var::varType) -> def_str(id=$a.texttype=$var::varTypereg=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:95:3: a= ID ( EQUAL b= expr )?
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_init230); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:95:8: ( EQUAL b= expr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EQUAL) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:95:9: EQUAL b= expr
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
                            if (b != null && !((var_scope)var_stack.peek()).varType.equals((b!=null?b.idType:null))) {
                                 errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null) +" wrong type conversion cannot convert " + (b!=null?b.idType:null) + " to " + ((var_scope)var_stack.peek()).varType);
                            }     	          
                 			    }
                         }
                


            // TEMPLATE REWRITE
            // 109:7: -> {$b.idType!=null}? def_assign(type=$var::varTypeid=$a.textrhs=$expr.st)
            if ((b!=null?b.idType:null)!=null) {
                retval.st = templateLib.getInstanceOf("def_assign",
              new STAttrMap().put("type", ((var_scope)var_stack.peek()).varType).put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)));
            }
            else // 111:7: -> {$program::name.equals(\"[global]\")}? def_glob(id=$a.texttype=$var::varType)
            if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("def_glob",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType));
            }
            else // 113:7: -> {!$var::varType.equals(\"String\")}? def_var(id=$a.texttype=$var::varType)
            if (!((var_scope)var_stack.peek()).varType.equals("String")) {
                retval.st = templateLib.getInstanceOf("def_var",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType));
            }
            else // 115:7: -> def_str(id=$a.texttype=$var::varTypereg=getreg())
            {
                retval.st = templateLib.getInstanceOf("def_str",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("type", ((var_scope)var_stack.peek()).varType).put("reg", getreg()));
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
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_assign"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:120:1: id_assign returns [String idType] : a= ID ( '[' c= data_id ']' )? EQUAL b= expr -> {$c.idType!=null}? array_assign(id=$a.textrhs=$expr.stformat=$c.streg=getreg()) -> assign(id=$a.textrhs=$expr.sttype=$idType);
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.data_id_return c = null;

        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:3: (a= ID ( '[' c= data_id ']' )? EQUAL b= expr -> {$c.idType!=null}? array_assign(id=$a.textrhs=$expr.stformat=$c.streg=getreg()) -> assign(id=$a.textrhs=$expr.sttype=$idType))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:3: a= ID ( '[' c= data_id ']' )? EQUAL b= expr
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign390); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:7: ( '[' c= data_id ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SQ_OPEN) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:8: '[' c= data_id ']'
                    {
                    match(input,SQ_OPEN,FOLLOW_SQ_OPEN_in_id_assign392); 
                    pushFollow(FOLLOW_data_id_in_id_assign395);
                    c=data_id();

                    state._fsp--;

                    match(input,SQ_CLOSE,FOLLOW_SQ_CLOSE_in_id_assign396); 

                    }
                    break;

            }

            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign400); 
            pushFollow(FOLLOW_expr_in_id_assign404);
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
            // 135:3: -> {$c.idType!=null}? array_assign(id=$a.textrhs=$expr.stformat=$c.streg=getreg())
            if ((c!=null?c.idType:null)!=null) {
                retval.st = templateLib.getInstanceOf("array_assign",
              new STAttrMap().put("id", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)).put("format", (c!=null?c.st:null)).put("reg", getreg()));
            }
            else // 137:3: -> assign(id=$a.textrhs=$expr.sttype=$idType)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:1: var : type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b);
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        List list_b=null;
        strgramParser.type_return type3 = null;

        RuleReturnScope b = null;

        ((var_scope)var_stack.peek()).varType = "";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:146:3: ( type b+= id_init ( COMMA b+= id_init )* EOL -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b) -> vars(vars=$b))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:3: type b+= id_init ( COMMA b+= id_init )* EOL
            {
            pushFollow(FOLLOW_type_in_var482);
            type3=type();

            state._fsp--;

            ((var_scope)var_stack.peek()).varType = (type3!=null?type3.idType:null);
            pushFollow(FOLLOW_id_init_in_var489);
            b=id_init();

            state._fsp--;

            if (list_b==null) list_b=new ArrayList();
            list_b.add(b.getTemplate());

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:52: ( COMMA b+= id_init )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:53: COMMA b+= id_init
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_var492); 
            	    pushFollow(FOLLOW_id_init_in_var496);
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

            match(input,EOL,FOLLOW_EOL_in_var500); 


            // TEMPLATE REWRITE
            // 148:7: -> {$program::name.equals(\"[global]\")}? globalVars(vars=$b)
            if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                retval.st = templateLib.getInstanceOf("globalVars",
              new STAttrMap().put("vars", list_b));
            }
            else // 150:7: -> vars(vars=$b)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:154:1: listParams : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a);
    public final strgramParser.listParams_return listParams() throws RecognitionException {
        strgramParser.listParams_return retval = new strgramParser.listParams_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:155:1: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_listParams557); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:12: (a+= expr ( COMMA a+= expr )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||LA7_0==PAR_OPEN||(LA7_0>=INT && LA7_0<=STRING)||(LA7_0>=32 && LA7_0<=38)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_listParams562);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:21: ( COMMA a+= expr )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:156:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listParams565); 
                    	    pushFollow(FOLLOW_expr_in_listParams569);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_listParams575); 


            // TEMPLATE REWRITE
            // 157:3: -> iconst(value=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:160:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st};
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        Token MATHOPER4=null;
        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:161:3: (a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> {$a.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:3: a= math_exp ( MATHOPER b= math_exp )?
            {
            pushFollow(FOLLOW_math_exp_in_expr605);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:14: ( MATHOPER b= math_exp )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==MATHOPER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:15: MATHOPER b= math_exp
                    {
                    MATHOPER4=(Token)match(input,MATHOPER,FOLLOW_MATHOPER_in_expr608); 
                    pushFollow(FOLLOW_math_exp_in_expr612);
                    b=math_exp();

                    state._fsp--;


                    }
                    break;

            }


                  retval.idType = (a!=null?a.idType:null);
              


            // TEMPLATE REWRITE
            // 166:7: -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st)
            if ((b!=null?b.st:null)!=null) {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (MATHOPER4!=null?MATHOPER4.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
            }
            else // 168:7: -> {$a.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st} | a= data_id c= '[' b= data_id ']' -> get_elem(format=$a.streg=getreg()format2=$b.st));
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        Token c=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return b = null;

        strgramParser.data_id_return data_id5 = null;

        strgramParser.expr_return expr6 = null;

        strgramParser.fun_call_return fun_call7 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st} | a= data_id c= '[' b= data_id ']' -> get_elem(format=$a.streg=getreg()format2=$b.st))
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

                if ( ((LA9_2>=COMMA && LA9_2<=EOL)||(LA9_2>=PAR_CLOSE && LA9_2<=MATHOPER)) ) {
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

                if ( ((LA9_3>=COMMA && LA9_3<=EOL)||(LA9_3>=PAR_CLOSE && LA9_3<=MATHOPER)) ) {
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

                if ( ((LA9_4>=COMMA && LA9_4<=EOL)||(LA9_4>=PAR_CLOSE && LA9_4<=MATHOPER)) ) {
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp688);
                    data_id5=data_id();

                    state._fsp--;


                        retval.idType = (data_id5!=null?data_id5.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 177:3: -> {$data_id.st}
                    {
                        retval.st = (data_id5!=null?data_id5.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:3: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp723); 
                    pushFollow(FOLLOW_expr_in_math_exp725);
                    expr6=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp727); 

                        retval.idType = (expr6!=null?expr6.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 183:3: -> {$expr.st}
                    {
                        retval.st = (expr6!=null?expr6.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:185:3: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_math_exp747);
                    fun_call7=fun_call();

                    state._fsp--;


                        retval.idType = (fun_call7!=null?fun_call7.idType:null);
                      


                    // TEMPLATE REWRITE
                    // 189:3: -> {$fun_call.st}
                    {
                        retval.st = (fun_call7!=null?fun_call7.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:3: a= data_id c= '[' b= data_id ']'
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp769);
                    a=data_id();

                    state._fsp--;

                    c=(Token)match(input,SQ_OPEN,FOLLOW_SQ_OPEN_in_math_exp773); 
                    pushFollow(FOLLOW_data_id_in_math_exp776);
                    b=data_id();

                    state._fsp--;

                    match(input,SQ_CLOSE,FOLLOW_SQ_CLOSE_in_math_exp777); 

                               if (!"String".equals((a!=null?a.idType:null))) {
                                  errors.add("line " + (c!=null?c.getLine():0) + ": get array element operation error " + (a!=null?input.toString(a.start,a.stop):null) + " type must be String, not " + (a!=null?a.idType:null));
                               }
                               retval.idType = "Char";
                        


                    // TEMPLATE REWRITE
                    // 198:3: -> get_elem(format=$a.streg=getreg()format2=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("get_elem",
                      new STAttrMap().put("format", (a!=null?a.st:null)).put("reg", getreg()).put("format2", (b!=null?b.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:201:1: data returns [String idType] : ( INT -> int(reg=getreg()v=$INT.texttype=$idType) | str -> {$str.st} | CHAR -> char(reg=getreg()v=getCode($CHAR.text)type=$idType));
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT8=null;
        Token CHAR10=null;
        strgramParser.str_return str9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:3: ( INT -> int(reg=getreg()v=$INT.texttype=$idType) | str -> {$str.st} | CHAR -> char(reg=getreg()v=getCode($CHAR.text)type=$idType))
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:203:5: INT
                    {
                    INT8=(Token)match(input,INT,FOLLOW_INT_in_data822); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 205:5: -> int(reg=getreg()v=$INT.texttype=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("reg", getreg()).put("v", (INT8!=null?INT8.getText():null)).put("type", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:207:4: str
                    {
                    pushFollow(FOLLOW_str_in_data871);
                    str9=str();

                    state._fsp--;


                    	    retval.idType = "String";
                    	    ((program_scope)program_stack.peek()).strings.add((str9!=null?str9.st:null));
                    	  


                    // TEMPLATE REWRITE
                    // 212:4: -> {$str.st}
                    {
                        retval.st = (str9!=null?str9.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:5: CHAR
                    {
                    CHAR10=(Token)match(input,CHAR,FOLLOW_CHAR_in_data898); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 216:5: -> char(reg=getreg()v=getCode($CHAR.text)type=$idType)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:1: str : STRING -> string(reg=getreg()s=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text)type=\"String\");
    public final strgramParser.str_return str() throws RecognitionException {
        strgramParser.str_return retval = new strgramParser.str_return();
        retval.start = input.LT(1);

        Token STRING11=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:220:1: ( STRING -> string(reg=getreg()s=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text)type=\"String\"))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:220:3: STRING
            {
            STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_str942); 


            // TEMPLATE REWRITE
            // 221:3: -> string(reg=getreg()s=getString($STRING.text)sreg=getstr($STRING.text)len=getStringLength($STRING.text)type=\"String\")
            {
                retval.st = templateLib.getInstanceOf("string",
              new STAttrMap().put("reg", getreg()).put("s", getString((STRING11!=null?STRING11.getText():null))).put("sreg", getstr((STRING11!=null?STRING11.getText():null))).put("len", getStringLength((STRING11!=null?STRING11.getText():null))).put("type", "String"));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:1: data_id returns [String idType] : ( ID -> load_var(reg=getreg()id=$ID.texttype=$idType) | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID12=null;
        strgramParser.data_return data13 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:3: ( ID -> load_var(reg=getreg()id=$ID.texttype=$idType) | data -> {$data.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:3: ID
                    {
                    ID12=(Token)match(input,ID,FOLLOW_ID_in_data_id989); 

                         if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null))) {
                               errors.add("line "+(ID12!=null?ID12.getLine():0)+": name "+(ID12!=null?ID12.getText():null)+" cannot be resolved");
                         } else {
                               names.get(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null)).addLineUses((ID12!=null?ID12.getLine():0));   
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID12!=null?ID12.getText():null)).getType();
                         }
                      


                    // TEMPLATE REWRITE
                    // 236:3: -> load_var(reg=getreg()id=$ID.texttype=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("load_var",
                      new STAttrMap().put("reg", getreg()).put("id", (ID12!=null?ID12.getText():null)).put("type", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:3: data
                    {
                    pushFollow(FOLLOW_data_in_data_id1027);
                    data13=data();

                    state._fsp--;

                    retval.idType = (data13!=null?data13.idType:null);


                    // TEMPLATE REWRITE
                    // 240:3: -> {$data.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:243:1: if_op : 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg());
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:3: ( 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:3: 'if' bool_cond fun_body ( else_block )?
            {
            match(input,28,FOLLOW_28_in_if_op1064); 
            pushFollow(FOLLOW_bool_cond_in_if_op1066);
            bool_cond14=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op1068);
            fun_body15=fun_body();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:27: ( else_block )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:27: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_op1070);
                    else_block16=else_block();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 251:3: -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg())
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:254:1: else_block : 'else' fun_body -> {$fun_body.st};
    public final strgramParser.else_block_return else_block() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.else_block_return retval = new strgramParser.else_block_return();
        retval.start = input.LT(1);

        strgramParser.fun_body_return fun_body17 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:260:3: ( 'else' fun_body -> {$fun_body.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:261:3: 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_else_block1122); 
            pushFollow(FOLLOW_fun_body_in_else_block1124);
            fun_body17=fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 262:5: -> {$fun_body.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:265:1: for_op : 'for' PAR_OPEN for_expr PAR_CLOSE fun_body -> for_op(cond=$for_expr.ststat=$fun_body.sttmp=getreg());
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        strgramParser.for_expr_return for_expr18 = null;

        strgramParser.fun_body_return fun_body19 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:271:3: ( 'for' PAR_OPEN for_expr PAR_CLOSE fun_body -> for_op(cond=$for_expr.ststat=$fun_body.sttmp=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:272:3: 'for' PAR_OPEN for_expr PAR_CLOSE fun_body
            {
            match(input,30,FOLLOW_30_in_for_op1156); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op1158); 
            pushFollow(FOLLOW_for_expr_in_for_op1160);
            for_expr18=for_expr();

            state._fsp--;

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op1176); 
            pushFollow(FOLLOW_fun_body_in_for_op1178);
            fun_body19=fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 286:3: -> for_op(cond=$for_expr.ststat=$fun_body.sttmp=getreg())
            {
                retval.st = templateLib.getInstanceOf("for_op",
              new STAttrMap().put("cond", (for_expr18!=null?for_expr18.st:null)).put("stat", (fun_body19!=null?fun_body19.st:null)).put("tmp", getreg()));
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

    public static class for_expr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "for_expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:289:1: for_expr : INT -> for_expr(id=getreg()less=$INT.textreg=getreg());
    public final strgramParser.for_expr_return for_expr() throws RecognitionException {
        strgramParser.for_expr_return retval = new strgramParser.for_expr_return();
        retval.start = input.LT(1);

        Token INT20=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:290:1: ( INT -> for_expr(id=getreg()less=$INT.textreg=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:290:3: INT
            {
            INT20=(Token)match(input,INT,FOLLOW_INT_in_for_expr1211); 


            // TEMPLATE REWRITE
            // 291:3: -> for_expr(id=getreg()less=$INT.textreg=getreg())
            {
                retval.st = templateLib.getInstanceOf("for_expr",
              new STAttrMap().put("id", getreg()).put("less", (INT20!=null?INT20.getText():null)).put("reg", getreg()));
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
    // $ANTLR end "for_expr"

    public static class while_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "while_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:294:1: while_op : 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond21 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:300:3: ( 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:301:3: 'while' bool_cond fun_body
            {
            match(input,31,FOLLOW_31_in_while_op1254); 
            pushFollow(FOLLOW_bool_cond_in_while_op1256);
            bool_cond21=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op1258);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 302:5: -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("while_op",
              new STAttrMap().put("bool_cond", (bool_cond21!=null?bool_cond21.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:305:1: bool_cond : PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st);
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        Token COMPROPER22=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:306:3: ( PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:3: PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond1295); 
            pushFollow(FOLLOW_data_id_in_bool_cond1299);
            a=data_id();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:22: ( COMPROPER b= data_id )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMPROPER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:23: COMPROPER b= data_id
            	    {
            	    COMPROPER22=(Token)match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond1302); 
            	    pushFollow(FOLLOW_data_id_in_bool_cond1306);
            	    b=data_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond1310); 


            // TEMPLATE REWRITE
            // 308:3: -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:311:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:312:3: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:313:3: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id1350); 
            match(input,ID,FOLLOW_ID_in_brack_id1352); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1354); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:316:1: in_out_op returns [String idType] : ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE -> outOp(format=$data_id.stparams=$e) | b= 'read' PAR_OPEN PAR_CLOSE -> readOp(reg=getreg()tmp=getreg()) | b= 'toInt' PAR_OPEN a= data_id PAR_CLOSE -> toIntOp(format=$a.streg=getreg()) | b= 'length' PAR_OPEN a= data_id PAR_CLOSE -> length_op(format=$a.streg=getreg()) | b= 'append' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> append_op(arg1=$a1.starg2=$a2.streg=getreg()) | b= 'compare' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> compare_op(arg1=$a1.starg2=$a2.streg=getreg()) | b= 'copy' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> copy_op(arg1=$a1.starg2=$a2.streg=getreg()));
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:317:3: ( 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE -> outOp(format=$data_id.stparams=$e) | b= 'read' PAR_OPEN PAR_CLOSE -> readOp(reg=getreg()tmp=getreg()) | b= 'toInt' PAR_OPEN a= data_id PAR_CLOSE -> toIntOp(format=$a.streg=getreg()) | b= 'length' PAR_OPEN a= data_id PAR_CLOSE -> length_op(format=$a.streg=getreg()) | b= 'append' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> append_op(arg1=$a1.starg2=$a2.streg=getreg()) | b= 'compare' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> compare_op(arg1=$a1.starg2=$a2.streg=getreg()) | b= 'copy' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE -> copy_op(arg1=$a1.starg2=$a2.streg=getreg()))
            int alt15=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt15=1;
                }
                break;
            case 33:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            case 35:
                {
                alt15=4;
                }
                break;
            case 36:
                {
                alt15=5;
                }
                break;
            case 37:
                {
                alt15=6;
                }
                break;
            case 38:
                {
                alt15=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:318:5: 'out' PAR_OPEN data_id ( COMMA e+= expr )* PAR_CLOSE
                    {
                    match(input,32,FOLLOW_32_in_in_out_op1375); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1377); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1379);
                    data_id23=data_id();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:318:28: ( COMMA e+= expr )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:318:29: COMMA e+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1382); 
                    	    pushFollow(FOLLOW_expr_in_in_out_op1386);
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

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1390); 

                         retval.idType = null;
                        


                    // TEMPLATE REWRITE
                    // 322:3: -> outOp(format=$data_id.stparams=$e)
                    {
                        retval.st = templateLib.getInstanceOf("outOp",
                      new STAttrMap().put("format", (data_id23!=null?data_id23.st:null)).put("params", list_e));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:324:5: b= 'read' PAR_OPEN PAR_CLOSE
                    {
                    b=(Token)match(input,33,FOLLOW_33_in_in_out_op1426); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1428); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1430); 

                          retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 328:5: -> readOp(reg=getreg()tmp=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("readOp",
                      new STAttrMap().put("reg", getreg()).put("tmp", getreg()));
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:330:5: b= 'toInt' PAR_OPEN a= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,34,FOLLOW_34_in_in_out_op1465); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1467); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1471);
                    a=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1473); 

                               if (!"String".equals((a!=null?a.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": "+ (b!=null?b.getText():null) +" operation error " + (a!=null?input.toString(a.start,a.stop):null) + " type must be String, not " + (a!=null?a.idType:null));
                               }
                               retval.idType = "Int";
                        


                    // TEMPLATE REWRITE
                    // 337:5: -> toIntOp(format=$a.streg=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("toIntOp",
                      new STAttrMap().put("format", (a!=null?a.st:null)).put("reg", getreg()));
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:5: b= 'length' PAR_OPEN a= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,35,FOLLOW_35_in_in_out_op1508); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1510); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1514);
                    a=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1516); 

                               if (!"String".equals((a!=null?a.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a!=null?input.toString(a.start,a.stop):null) + " type must be String, not " + (a!=null?a.idType:null));
                               }
                               retval.idType = "Int";
                        


                    // TEMPLATE REWRITE
                    // 346:4: -> length_op(format=$a.streg=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("length_op",
                      new STAttrMap().put("format", (a!=null?a.st:null)).put("reg", getreg()));
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:348:4: b= 'append' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,36,FOLLOW_36_in_in_out_op1548); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1550); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1554);
                    a1=data_id();

                    state._fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1556); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1560);
                    a2=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1562); 

                               if (!"String".equals((a1!=null?a1.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a1!=null?input.toString(a1.start,a1.stop):null) + " type must be String, not " + (a1!=null?a1.idType:null));
                               }
                               if (!"String".equals((a2!=null?a2.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a2!=null?input.toString(a2.start,a2.stop):null) + " type must be String, not " + (a2!=null?a2.idType:null));
                               }
                               retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 358:4: -> append_op(arg1=$a1.starg2=$a2.streg=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("append_op",
                      new STAttrMap().put("arg1", (a1!=null?a1.st:null)).put("arg2", (a2!=null?a2.st:null)).put("reg", getreg()));
                    }


                    }
                    break;
                case 6 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:360:4: b= 'compare' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,37,FOLLOW_37_in_in_out_op1599); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1601); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1605);
                    a1=data_id();

                    state._fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1607); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1611);
                    a2=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1613); 

                               if (!"String".equals((a1!=null?a1.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a1!=null?input.toString(a1.start,a1.stop):null) + " type must be String, not " + (a1!=null?a1.idType:null));
                               }
                               if (!"String".equals((a2!=null?a2.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a2!=null?input.toString(a2.start,a2.stop):null) + " type must be String, not " + (a2!=null?a2.idType:null));
                               }
                               retval.idType = "Int";
                        


                    // TEMPLATE REWRITE
                    // 370:4: -> compare_op(arg1=$a1.starg2=$a2.streg=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("compare_op",
                      new STAttrMap().put("arg1", (a1!=null?a1.st:null)).put("arg2", (a2!=null?a2.st:null)).put("reg", getreg()));
                    }


                    }
                    break;
                case 7 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:372:4: b= 'copy' PAR_OPEN a1= data_id COMMA a2= data_id PAR_CLOSE
                    {
                    b=(Token)match(input,38,FOLLOW_38_in_in_out_op1650); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1652); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1656);
                    a1=data_id();

                    state._fsp--;

                    match(input,COMMA,FOLLOW_COMMA_in_in_out_op1658); 
                    pushFollow(FOLLOW_data_id_in_in_out_op1662);
                    a2=data_id();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1664); 

                               if (!"String".equals((a1!=null?a1.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a1!=null?input.toString(a1.start,a1.stop):null) + " type must be String, not " + (a1!=null?a1.idType:null));
                               }
                               if (!"String".equals((a2!=null?a2.idType:null))) {
                                  errors.add("line " + (b!=null?b.getLine():0) + ": length operation error " + (a2!=null?input.toString(a2.start,a2.stop):null) + " type must be String, not " + (a2!=null?a2.idType:null));
                               }
                               retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 382:4: -> copy_op(arg1=$a1.starg2=$a2.streg=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("copy_op",
                      new STAttrMap().put("arg1", (a1!=null?a1.st:null)).put("arg2", (a2!=null?a2.st:null)).put("reg", getreg()));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:385:1: fun_call returns [String idType] : (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st});
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.in_out_op_return in_out_op24 = null;

        RuleReturnScope b = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:386:3: (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st})
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=32 && LA18_0<=38)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:387:3: a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1711); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_call1713); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:387:17: (b+= expr ( COMMA b+= expr )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ID||LA17_0==PAR_OPEN||(LA17_0>=INT && LA17_0<=STRING)||(LA17_0>=32 && LA17_0<=38)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:387:18: b+= expr ( COMMA b+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_fun_call1718);
                            b=expr();

                            state._fsp--;

                            if (list_b==null) list_b=new ArrayList();
                            list_b.add(b.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:387:26: ( COMMA b+= expr )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==COMMA) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:387:27: COMMA b+= expr
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_call1721); 
                            	    pushFollow(FOLLOW_expr_in_fun_call1725);
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

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_call1731); 

                         if (!methods.isExist((a!=null?a.getText():null))) {
                         	errors.add("line " + (a!=null?a.getLine():0) + ": methon name " + (a!=null?a.getText():null)	+ " cannot be resolved");
                         } else {
                         	retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();
                         	methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
                        


                    // TEMPLATE REWRITE
                    // 396:3: -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("funCall",
                      new STAttrMap().put("reg", getreg()).put("funName", (a!=null?a.getText():null)).put("funArgs", list_b).put("ret", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:3: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1771);
                    in_out_op24=in_out_op();

                    state._fsp--;


                         retval.idType = (in_out_op24!=null?in_out_op24.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 402:3: -> {$in_out_op.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:406:1: op_cond : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a);
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:407:3: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:408:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1800); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:408:12: (a+= expr ( COMMA a+= expr )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID||LA20_0==PAR_OPEN||(LA20_0>=INT && LA20_0<=STRING)||(LA20_0>=32 && LA20_0<=38)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:408:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_op_cond1805);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:408:21: ( COMMA a+= expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:408:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1808); 
                    	    pushFollow(FOLLOW_expr_in_op_cond1812);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1818); 


            // TEMPLATE REWRITE
            // 409:3: -> args(args=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:412:1: ops : ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st));
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign25 = null;

        strgramParser.if_op_return if_op26 = null;

        strgramParser.while_op_return while_op27 = null;

        strgramParser.for_op_return for_op28 = null;

        strgramParser.fun_call_return fun_call29 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:413:3: ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st))
            int alt21=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==PAR_OPEN) ) {
                    alt21=5;
                }
                else if ( (LA21_1==EQUAL||LA21_1==SQ_OPEN) ) {
                    alt21=1;
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
            case 31:
                {
                alt21=3;
                }
                break;
            case 30:
                {
                alt21=4;
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:414:3: id_assign EOL
                    {
                    pushFollow(FOLLOW_id_assign_in_ops1844);
                    id_assign25=id_assign();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1846); 


                    // TEMPLATE REWRITE
                    // 415:5: -> statement(expr=$id_assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_assign25!=null?id_assign25.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:416:5: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops1864);
                    if_op26=if_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 417:5: -> {$if_op.st}
                    {
                        retval.st = (if_op26!=null?if_op26.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:418:5: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops1877);
                    while_op27=while_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 419:5: -> {$while_op.st}
                    {
                        retval.st = (while_op27!=null?while_op27.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:420:5: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops1890);
                    for_op28=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 421:5: -> {$for_op.st}
                    {
                        retval.st = (for_op28!=null?for_op28.st:null);
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:422:5: fun_call EOL
                    {
                    pushFollow(FOLLOW_fun_call_in_ops1903);
                    fun_call29=fun_call();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1905); 


                    // TEMPLATE REWRITE
                    // 423:5: -> statement(expr=$fun_call.st)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:426:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:427:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:428:3: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun1932); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun1934); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun1936); 
            pushFollow(FOLLOW_fun_body_in_main_fun1938);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:431:1: fun_decl : ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats));
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
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:437:3: ( ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats))
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:438:3: ( type )? a= ID PAR_OPEN (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )? PAR_CLOSE fun_body
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:438:3: ( type )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=25 && LA22_0<=27)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:438:3: type
                            {
                            pushFollow(FOLLOW_type_in_fun_decl1963);
                            type30=type();

                            state._fsp--;


                            }
                            break;

                    }

                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl1968); 

                         ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
                         methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type30!=null?type30.idType:null)));
                        
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1979); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:443:12: (p+= parameter_declaration ( COMMA p+= parameter_declaration )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=25 && LA24_0<=27)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:443:13: p+= parameter_declaration ( COMMA p+= parameter_declaration )*
                            {
                            pushFollow(FOLLOW_parameter_declaration_in_fun_decl1984);
                            p=parameter_declaration();

                            state._fsp--;

                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:443:38: ( COMMA p+= parameter_declaration )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==COMMA) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:443:39: COMMA p+= parameter_declaration
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_decl1987); 
                            	    pushFollow(FOLLOW_parameter_declaration_in_fun_decl1991);
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

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1997); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1999);
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
                    // 453:4: -> fun_decl(type=$type.stname=$ID.textlocals=$slist::localsstats=$slist::statsargs=$p)
                    {
                        retval.st = templateLib.getInstanceOf("fun_decl",
                      new STAttrMap().put("type", (type30!=null?type30.st:null)).put("name", (a!=null?a.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:454:7: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
                    {
                    match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_fun_decl2046); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl2048); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl2050); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl2052);
                    fun_body();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 455:4: -> main_decl(locals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:458:1: parameter_declaration : type a= ID -> def_arg(id=$ID.texttype=$type.st);
    public final strgramParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        strgramParser.parameter_declaration_return retval = new strgramParser.parameter_declaration_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.type_return type32 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:459:3: ( type a= ID -> def_arg(id=$ID.texttype=$type.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:460:3: type a= ID
            {
            pushFollow(FOLLOW_type_in_parameter_declaration2086);
            type32=type();

            state._fsp--;

            a=(Token)match(input,ID,FOLLOW_ID_in_parameter_declaration2090); 

                   if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                      errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                   } else {
                      names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type32!=null?type32.idType:null), (a!=null?a.getLine():0)));
                   }
              


            // TEMPLATE REWRITE
            // 468:3: -> def_arg(id=$ID.texttype=$type.st)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:471:1: fun_body returns [String idType] : CUR_OPEN ( ( var | ops )+ )? ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats);
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        strgramParser.var_return var33 = null;

        strgramParser.ops_return ops34 = null;

        strgramParser.return_st_return return_st35 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:472:3: ( CUR_OPEN ( ( var | ops )+ )? ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:3: CUR_OPEN ( ( var | ops )+ )? ( return_st )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body2129); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:12: ( ( var | ops )+ )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==ID||(LA27_0>=25 && LA27_0<=28)||(LA27_0>=30 && LA27_0<=38)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:13: ( var | ops )+
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:13: ( var | ops )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=25 && LA26_0<=27)) ) {
                            alt26=1;
                        }
                        else if ( (LA26_0==ID||LA26_0==28||(LA26_0>=30 && LA26_0<=38)) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:14: var
                    	    {
                    	    pushFollow(FOLLOW_var_in_fun_body2133);
                    	    var33=var();

                    	    state._fsp--;

                    	    ((slist_scope)slist_stack.peek()).locals.add((var33!=null?var33.st:null));

                    	    }
                    	    break;
                    	case 2 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:50: ops
                    	    {
                    	    pushFollow(FOLLOW_ops_in_fun_body2138);
                    	    ops34=ops();

                    	    state._fsp--;

                    	    ((slist_scope)slist_stack.peek()).stats.add((ops34!=null?ops34.st:null));

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;

            }

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:88: ( return_st )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:473:88: return_st
                    {
                    pushFollow(FOLLOW_return_st_in_fun_body2146);
                    return_st35=return_st();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body2149); 

                ((slist_scope)slist_stack.peek()).stats.add((return_st35!=null?return_st35.st:null));
                if ((return_st35!=null?return_st35.idType:null) != null) {
                  retval.idType = (return_st35!=null?return_st35.idType:null);
                } 
              


            // TEMPLATE REWRITE
            // 480:3: -> block(locals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:483:1: return_st returns [String idType] : 'return' expr EOL -> return_st(ret_val=$expr.st);
    public final strgramParser.return_st_return return_st() throws RecognitionException {
        strgramParser.return_st_return retval = new strgramParser.return_st_return();
        retval.start = input.LT(1);

        strgramParser.expr_return expr36 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:484:1: ( 'return' expr EOL -> return_st(ret_val=$expr.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:485:2: 'return' expr EOL
            {
            match(input,39,FOLLOW_39_in_return_st2187); 
            pushFollow(FOLLOW_expr_in_return_st2189);
            expr36=expr();

            state._fsp--;

            match(input,EOL,FOLLOW_EOL_in_return_st2191); 

            	   retval.idType = (expr36!=null?expr36.idType:null);
            	


            // TEMPLATE REWRITE
            // 489:2: -> return_st(ret_val=$expr.st)
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
    public static final BitSet FOLLOW_ID_in_id_init230 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_EQUAL_in_id_init233 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_id_init237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign390 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_SQ_OPEN_in_id_assign392 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_id_assign395 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SQ_CLOSE_in_id_assign396 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign400 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_id_assign404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var489 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_COMMA_in_var492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var496 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_EOL_in_var500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_listParams557 = new BitSet(new long[]{0x0000007F00003B10L});
    public static final BitSet FOLLOW_expr_in_listParams562 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_listParams565 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_listParams569 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_listParams575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr605 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_MATHOPER_in_expr608 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_math_exp_in_expr612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp723 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_math_exp725 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_math_exp747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp769 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_SQ_OPEN_in_math_exp773 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_math_exp776 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_SQ_CLOSE_in_math_exp777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_str_in_data871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_str942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_if_op1064 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_if_op1066 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_if_op1068 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_else_block_in_if_op1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_else_block1122 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_else_block1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_for_op1156 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op1158 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_for_expr_in_for_op1160 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op1176 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_for_op1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_for_expr1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_while_op1254 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_bool_cond_in_while_op1256 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_while_op1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond1295 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1299 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond1302 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1306 = new BitSet(new long[]{0x0000000000004200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id1350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1352 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_in_out_op1375 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1377 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1379 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1382 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_in_out_op1386 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_in_out_op1426 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1428 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1465 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1467 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1471 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op1508 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1510 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1514 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_in_out_op1548 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1550 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1556 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1560 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_in_out_op1599 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1601 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1605 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1607 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1611 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_in_out_op1650 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1652 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1656 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_in_out_op1658 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_data_id_in_in_out_op1662 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1711 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_call1713 = new BitSet(new long[]{0x0000007F00003B10L});
    public static final BitSet FOLLOW_expr_in_fun_call1718 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_call1721 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_fun_call1725 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_call1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1800 = new BitSet(new long[]{0x0000007F00003B10L});
    public static final BitSet FOLLOW_expr_in_op_cond1805 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1808 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_op_cond1812 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_ops1844 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops1877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_ops1903 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_ops1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun1932 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun1934 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun1936 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl1963 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl1968 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1979 = new BitSet(new long[]{0x000000000E000200L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl1984 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_COMMA_in_fun_decl1987 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_fun_decl1991 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1997 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_fun_decl2046 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl2048 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl2050 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameter_declaration2086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body2129 = new BitSet(new long[]{0x000000FFDE028010L});
    public static final BitSet FOLLOW_var_in_fun_body2133 = new BitSet(new long[]{0x000000FFDE028010L});
    public static final BitSet FOLLOW_ops_in_fun_body2138 = new BitSet(new long[]{0x000000FFDE028010L});
    public static final BitSet FOLLOW_return_st_in_fun_body2146 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_return_st2187 = new BitSet(new long[]{0x0000007F00003910L});
    public static final BitSet FOLLOW_expr_in_return_st2189 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_EOL_in_return_st2191 = new BitSet(new long[]{0x0000000000000002L});

}