// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-25 14:34:08

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "EQUAL", "COMMA", "LIST", "EOL", "PAR_OPEN", "PAR_CLOSE", "MATHOPER", "INT", "STRING", "CHAR", "COMPROPER", "POSTFIX", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'out'", "'read'", "'.'", "'return'"
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
    public static final int PAR_OPEN=9;
    public static final int PAR_CLOSE=10;
    public static final int MATHOPER=11;
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
    	return "line " + e.line + ":";
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:35:1: program : ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functions);
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:46:3: ( ( fun_decl | var )+ -> program(globals=$program::globalsfunctions=$program::functions))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:3: ( fun_decl | var )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:47:3: ( fun_decl | var )+
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
                case MAIN_NAME:
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:48:5: fun_decl
            	    {
            	    pushFollow(FOLLOW_fun_decl_in_program71);
            	    fun_decl1=fun_decl();

            	    state._fsp--;


            	           ((program_scope)program_stack.peek()).functions.add((fun_decl1!=null?fun_decl1.st:null));
            	          

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:53:7: var
            	    {

            	           ((program_scope)program_stack.peek()).name = "[global]";
            	          
            	    pushFollow(FOLLOW_var_in_program101);
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
            // 61:5: -> program(globals=$program::globalsfunctions=$program::functions)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:64:1: type returns [String idType] : ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char());
    public final strgramParser.type_return type() throws RecognitionException {
        strgramParser.type_return retval = new strgramParser.type_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:65:3: ( 'Int' -> type_int() | 'String' -> type_string() | 'Char' -> type_char())
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:66:3: 'Int'
                    {
                    match(input,26,FOLLOW_26_in_type151); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 66:37: -> type_int()
                    {
                        retval.st = templateLib.getInstanceOf("type_int");
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:67:5: 'String'
                    {
                    match(input,27,FOLLOW_27_in_type173); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 67:37: -> type_string()
                    {
                        retval.st = templateLib.getInstanceOf("type_string");
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:68:5: 'Char'
                    {
                    match(input,28,FOLLOW_28_in_type187); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 68:37: -> type_char()
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:71:1: id_init : (a= ID -> {new StringTemplate($a.text)} | id_assign -> {$id_assign.st});
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.id_assign_return id_assign3 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:72:3: (a= ID -> {new StringTemplate($a.text)} | id_assign -> {$id_assign.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:73:3: a= ID
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_id_init216); 

                         if ((a!=null?a.getText():null) != null) {
                                 if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                                     errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                                 } else {
                         	          names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), ((var_scope)var_stack.peek()).varType, (a!=null?a.getLine():0)));
                         			    }
                                 }
                        


                    // TEMPLATE REWRITE
                    // 83:5: -> {new StringTemplate($a.text)}
                    {
                        retval.st = new StringTemplate((a!=null?a.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:84:5: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_init236);
                    id_assign3=id_assign();

                    state._fsp--;


                         String idName = (id_assign3!=null?id_assign3.idName:null);
                                     String idType = (id_assign3!=null?id_assign3.idType:null);
                                     int idLine    = (id_assign3!=null?id_assign3.idLine:0);
                                     String varType = ((var_scope)var_stack.peek()).varType;
                                     if (names.isExist(((program_scope)program_stack.peek()).name + "." + idName)) {
                                       errors.add("line " + idLine + ": name " + idName + " duplicated");
                                     } else {
                                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + idName, varType, idLine));
                                       names.get(((program_scope)program_stack.peek()).name + "." + idName).addLineUses(idLine);
                                       if (!varType.equals(idType)) {
                                         errors.add("line "+idLine+": name "+idName+" wrong type conversion cannot convert " + idType + " to " + varType);
                                       }
                                     }
                        


                    // TEMPLATE REWRITE
                    // 100:5: -> {$id_assign.st}
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
        public String idName;
        public String idType;
        public int idLine;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id_assign"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:103:1: id_assign returns [String idName, String idType, int idLine] : a= ID EQUAL id_value -> assign(lhs=$a.textrhs=$id_value.st);
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.id_value_return id_value4 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:104:3: (a= ID EQUAL id_value -> assign(lhs=$a.textrhs=$id_value.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:105:3: a= ID EQUAL id_value
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign271); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign273); 
            pushFollow(FOLLOW_id_value_in_id_assign275);
            id_value4=id_value();

            state._fsp--;


                 retval.idName = (a!=null?a.getText():null);
                 	   retval.idType = (id_value4!=null?id_value4.idType:null);
                 	   retval.idLine = (a!=null?a.getLine():0);
                             if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                               names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                 	            String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
                 	            if (!varType.equals((id_value4!=null?id_value4.idType:null))) {
                 	              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + (id_value4!=null?id_value4.idType:null) + " to " + varType);
                 	            }
                             }
                


            // TEMPLATE REWRITE
            // 118:5: -> assign(lhs=$a.textrhs=$id_value.st)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:121:1: id_value returns [String idType] : ( expr -> {$expr.st} | fun_call -> {$fun_call.st});
    public final strgramParser.id_value_return id_value() throws RecognitionException {
        strgramParser.id_value_return retval = new strgramParser.id_value_return();
        retval.start = input.LT(1);

        strgramParser.expr_return expr5 = null;

        strgramParser.fun_call_return fun_call6 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:122:3: ( expr -> {$expr.st} | fun_call -> {$fun_call.st})
            int alt4=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==COMMA||LA4_1==EOL||LA4_1==MATHOPER) ) {
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:123:3: expr
                    {
                    pushFollow(FOLLOW_expr_in_id_value318);
                    expr5=expr();

                    state._fsp--;


                         retval.idType = (expr5!=null?expr5.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 127:5: -> {$expr.st}
                    {
                        retval.st = (expr5!=null?expr5.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:128:5: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_id_value338);
                    fun_call6=fun_call();

                    state._fsp--;


                         retval.idType = (fun_call6!=null?fun_call6.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 132:5: -> {$fun_call.st}
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
        String listName;
    }
    protected Stack var_stack = new Stack();

    public static class var_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:1: var : ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st)) EOL ;
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.type_return type7 = null;

        strgramParser.listParams_return listParams8 = null;

        RuleReturnScope b = null;

        ((var_scope)var_stack.peek()).varType = "";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:3: ( ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st)) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:3: ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st)) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:3: ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st))
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:5: ( type b+= id_init ( COMMA b+= id_init )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:5: ( type b+= id_init ( COMMA b+= id_init )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:145:6: type b+= id_init ( COMMA b+= id_init )*
                    {
                    pushFollow(FOLLOW_type_in_var383);
                    type7=type();

                    state._fsp--;


                           ((var_scope)var_stack.peek()).varType = (type7!=null?type7.idType:null);
                          
                    pushFollow(FOLLOW_id_init_in_var402);
                    b=id_init();

                    state._fsp--;

                    if (list_b==null) list_b=new ArrayList();
                    list_b.add(b.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:18: ( COMMA b+= id_init )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:149:19: COMMA b+= id_init
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var405); 
                    	    pushFollow(FOLLOW_id_init_in_var409);
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



                    // TEMPLATE REWRITE
                    // 150:7: -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b)
                    if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                        retval.st = templateLib.getInstanceOf("globalVariable",
                      new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", list_b));
                    }
                    else // 152:7: -> variable(type=$type.stname=$b)
                    {
                        retval.st = templateLib.getInstanceOf("variable",
                      new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", list_b));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:7: ( LIST a= ID listParams )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:7: ( LIST a= ID listParams )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:153:8: LIST a= ID listParams
                    {
                    match(input,LIST,FOLLOW_LIST_in_var471); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_var475); 

                           if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                                     errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                                   } else {
                                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), "List", (a!=null?a.getLine():0)));
                                   }
                           ((var_scope)var_stack.peek()).listName = (a!=null?a.getText():null);
                          
                    pushFollow(FOLLOW_listParams_in_var492);
                    listParams8=listParams();

                    state._fsp--;


                    }



                    // TEMPLATE REWRITE
                    // 163:7: -> listInit(name=$a.textparams=$listParams.st)
                    {
                        retval.st = templateLib.getInstanceOf("listInit",
                      new STAttrMap().put("name", (a!=null?a.getText():null)).put("params", (listParams8!=null?listParams8.st:null)));
                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var519); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:1: listParams : PAR_OPEN (a+= listParam ( COMMA a+= listParam )* )? PAR_CLOSE -> iconst(value=$a);
    public final strgramParser.listParams_return listParams() throws RecognitionException {
        strgramParser.listParams_return retval = new strgramParser.listParams_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:1: ( PAR_OPEN (a+= listParam ( COMMA a+= listParam )* )? PAR_CLOSE -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:3: PAR_OPEN (a+= listParam ( COMMA a+= listParam )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_listParams534); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:12: (a+= listParam ( COMMA a+= listParam )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||(LA8_0>=INT && LA8_0<=CHAR)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:13: a+= listParam ( COMMA a+= listParam )*
                    {
                    pushFollow(FOLLOW_listParam_in_listParams539);
                    a=listParam();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:26: ( COMMA a+= listParam )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:27: COMMA a+= listParam
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listParams542); 
                    	    pushFollow(FOLLOW_listParam_in_listParams546);
                    	    a=listParam();

                    	    state._fsp--;

                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_listParams552); 


            // TEMPLATE REWRITE
            // 171:3: -> iconst(value=$a)
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

    public static class listParam_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "listParam"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:174:1: listParam : a= data_id -> listParam(listName=$var::listNameval=$a.st);
    public final strgramParser.listParam_return listParam() throws RecognitionException {
        strgramParser.listParam_return retval = new strgramParser.listParam_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return a = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:1: (a= data_id -> listParam(listName=$var::listNameval=$a.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:3: a= data_id
            {
            pushFollow(FOLLOW_data_id_in_listParam574);
            a=data_id();

            state._fsp--;



            // TEMPLATE REWRITE
            // 176:1: -> listParam(listName=$var::listNameval=$a.st)
            {
                retval.st = templateLib.getInstanceOf("listParam",
              new STAttrMap().put("listName", ((var_scope)var_stack.peek()).listName).put("val", (a!=null?a.st:null)));
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
    // $ANTLR end "listParam"

    public static class expr_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:1: expr returns [String idType] : a+= math_exp (a+= addExpr )* -> iconst(value=$a);
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:180:3: (a+= math_exp (a+= addExpr )* -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:181:3: a+= math_exp (a+= addExpr )*
            {
            pushFollow(FOLLOW_math_exp_in_expr606);
            a=math_exp();

            state._fsp--;

            if (list_a==null) list_a=new ArrayList();
            list_a.add(a.getTemplate());

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:181:16: (a+= addExpr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==MATHOPER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:181:16: a+= addExpr
            	    {
            	    pushFollow(FOLLOW_addExpr_in_expr610);
            	    a=addExpr();

            	    state._fsp--;

            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 182:5: -> iconst(value=$a)
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
    // $ANTLR end "expr"

    public static class addExpr_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "addExpr"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:185:1: addExpr : MATHOPER math_exp -> addExpr(sign=$MATHOPER.textright=$math_exp.st);
    public final strgramParser.addExpr_return addExpr() throws RecognitionException {
        strgramParser.addExpr_return retval = new strgramParser.addExpr_return();
        retval.start = input.LT(1);

        Token MATHOPER9=null;
        strgramParser.math_exp_return math_exp10 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:186:3: ( MATHOPER math_exp -> addExpr(sign=$MATHOPER.textright=$math_exp.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:187:3: MATHOPER math_exp
            {
            MATHOPER9=(Token)match(input,MATHOPER,FOLLOW_MATHOPER_in_addExpr638); 
            pushFollow(FOLLOW_math_exp_in_addExpr640);
            math_exp10=math_exp();

            state._fsp--;



            // TEMPLATE REWRITE
            // 188:5: -> addExpr(sign=$MATHOPER.textright=$math_exp.st)
            {
                retval.st = templateLib.getInstanceOf("addExpr",
              new STAttrMap().put("sign", (MATHOPER9!=null?MATHOPER9.getText():null)).put("right", (math_exp10!=null?math_exp10.st:null)));
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
    // $ANTLR end "addExpr"

    public static class math_exp_return extends ParserRuleReturnScope {
        public String idType;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "math_exp"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> inbrac(value=$expr.st));
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return data_id11 = null;

        strgramParser.expr_return expr12 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:192:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> inbrac(value=$expr.st))
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||(LA10_0>=INT && LA10_0<=CHAR)) ) {
                alt10=1;
            }
            else if ( (LA10_0==PAR_OPEN) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:193:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp676);
                    data_id11=data_id();

                    state._fsp--;

                    retval.idType = (data_id11!=null?data_id11.idType:null);


                    // TEMPLATE REWRITE
                    // 193:55: -> {$data_id.st}
                    {
                        retval.st = (data_id11!=null?data_id11.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:5: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp702); 
                    pushFollow(FOLLOW_expr_in_math_exp704);
                    expr12=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp706); 
                    retval.idType = (expr12!=null?expr12.idType:null);


                    // TEMPLATE REWRITE
                    // 194:55: -> inbrac(value=$expr.st)
                    {
                        retval.st = templateLib.getInstanceOf("inbrac",
                      new STAttrMap().put("value", (expr12!=null?expr12.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:197:1: data returns [String idType] : ( INT -> {new StringTemplate($INT.text)} | STRING -> {new StringTemplate($STRING.text)} | CHAR -> {new StringTemplate($CHAR.text)});
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT13=null;
        Token STRING14=null;
        Token CHAR15=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:3: ( INT -> {new StringTemplate($INT.text)} | STRING -> {new StringTemplate($STRING.text)} | CHAR -> {new StringTemplate($CHAR.text)})
            int alt11=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt11=1;
                }
                break;
            case STRING:
                {
                alt11=2;
                }
                break;
            case CHAR:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:199:5: INT
                    {
                    INT13=(Token)match(input,INT,FOLLOW_INT_in_data738); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 199:35: -> {new StringTemplate($INT.text)}
                    {
                        retval.st = new StringTemplate((INT13!=null?INT13.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:200:5: STRING
                    {
                    STRING14=(Token)match(input,STRING,FOLLOW_STRING_in_data756); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 200:35: -> {new StringTemplate($STRING.text)}
                    {
                        retval.st = new StringTemplate((STRING14!=null?STRING14.getText():null));
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:201:5: CHAR
                    {
                    CHAR15=(Token)match(input,CHAR,FOLLOW_CHAR_in_data768); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 201:35: -> {new StringTemplate($CHAR.text)}
                    {
                        retval.st = new StringTemplate((CHAR15!=null?CHAR15.getText():null));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:204:1: data_id returns [String idType] : ( ID -> {new StringTemplate($ID.text)} | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID16=null;
        strgramParser.data_return data17 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:3: ( ID -> {new StringTemplate($ID.text)} | data -> {$data.st})
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ID) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=INT && LA12_0<=CHAR)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:3: ID
                    {
                    ID16=(Token)match(input,ID,FOLLOW_ID_in_data_id797); 

                         if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID16!=null?ID16.getText():null))) {
                               errors.add("line "+(ID16!=null?ID16.getLine():0)+": name "+(ID16!=null?ID16.getText():null)+" cannot be resolved");
                             } else {
                               names.get(((program_scope)program_stack.peek()).name + "." + (ID16!=null?ID16.getText():null)).addLineUses((ID16!=null?ID16.getLine():0));   
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID16!=null?ID16.getText():null)).getType();
                             }
                        


                    // TEMPLATE REWRITE
                    // 215:5: -> {new StringTemplate($ID.text)}
                    {
                        retval.st = new StringTemplate((ID16!=null?ID16.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:216:5: data
                    {
                    pushFollow(FOLLOW_data_in_data_id817);
                    data17=data();

                    state._fsp--;

                    retval.idType = (data17!=null?data17.idType:null);


                    // TEMPLATE REWRITE
                    // 216:37: -> {$data.st}
                    {
                        retval.st = (data17!=null?data17.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:219:1: if_op : 'if' bool_cond fun_body ( else_block )? -> if_else_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::statselse_block=$else_block.st);
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond18 = null;

        strgramParser.else_block_return else_block19 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:3: ( 'if' bool_cond fun_body ( else_block )? -> if_else_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::statselse_block=$else_block.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:3: 'if' bool_cond fun_body ( else_block )?
            {
            match(input,29,FOLLOW_29_in_if_op848); 
            pushFollow(FOLLOW_bool_cond_in_if_op850);
            bool_cond18=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op852);
            fun_body();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:27: ( else_block )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:226:27: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_op854);
                    else_block19=else_block();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 227:5: -> if_else_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::statselse_block=$else_block.st)
            {
                retval.st = templateLib.getInstanceOf("if_else_op",
              new STAttrMap().put("bool_cond", (bool_cond18!=null?bool_cond18.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("else_block", (else_block19!=null?else_block19.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:231:1: else_block : 'else' fun_body -> else_block(locals=$slist::localsstats=$slist::stats);
    public final strgramParser.else_block_return else_block() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.else_block_return retval = new strgramParser.else_block_return();
        retval.start = input.LT(1);


        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:237:3: ( 'else' fun_body -> else_block(locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:3: 'else' fun_body
            {
            match(input,30,FOLLOW_30_in_else_block927); 
            pushFollow(FOLLOW_fun_body_in_else_block929);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 239:5: -> else_block(locals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("else_block",
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:242:1: for_op : 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token INT20=null;
        strgramParser.type_return type21 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:248:3: ( 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:3: 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op971); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op973); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:250:3: ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==INT) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=26 && LA14_0<=28)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:251:5: INT
                    {
                    INT20=(Token)match(input,INT,FOLLOW_INT_in_for_op983); 


                    // TEMPLATE REWRITE
                    // 252:9: -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats)
                    {
                        retval.st = templateLib.getInstanceOf("for_op",
                      new STAttrMap().put("count", (INT20!=null?INT20.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:253:7: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:253:7: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:253:8: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op1019);
                    type21=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op1023); 
                    match(input,32,FOLLOW_32_in_for_op1025); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op1029); 

                    }


                    }
                    break;

            }


                 if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                       errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" dublicated");
                     } else {
                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type21!=null?type21.idType:null), (a!=null?a.getLine():0)));
                     }
                     if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                       errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                     } else {
                       names.get(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                     }
                
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op1047); 
            pushFollow(FOLLOW_fun_body_in_for_op1049);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 269:3: -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("for_list_op",
              new STAttrMap().put("type", (type21!=null?type21.idType:null)).put("id", (a!=null?a.getText():null)).put("listId", (b!=null?b.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:1: while_op : 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond22 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:279:3: ( 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:280:3: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op1118); 
            pushFollow(FOLLOW_bool_cond_in_while_op1120);
            bool_cond22=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op1122);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 281:5: -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("while_op",
              new STAttrMap().put("bool_cond", (bool_cond22!=null?bool_cond22.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:284:1: bool_cond : PAR_OPEN ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call -> {$fun_call.st}) PAR_CLOSE ;
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        Token COMPROPER23=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return b = null;

        strgramParser.fun_call_return fun_call24 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:285:3: ( PAR_OPEN ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call -> {$fun_call.st}) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:286:3: PAR_OPEN ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call -> {$fun_call.st}) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond1159); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:3: ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call -> {$fun_call.st})
            int alt15=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==COMPROPER) ) {
                    alt15=1;
                }
                else if ( (LA15_1==PAR_OPEN) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case STRING:
            case CHAR:
                {
                alt15=1;
                }
                break;
            case 34:
            case 35:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:5: (a= data_id COMPROPER b= data_id )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:5: (a= data_id COMPROPER b= data_id )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:6: a= data_id COMPROPER b= data_id
                    {
                    pushFollow(FOLLOW_data_id_in_bool_cond1172);
                    a=data_id();

                    state._fsp--;

                    COMPROPER23=(Token)match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond1174); 
                    pushFollow(FOLLOW_data_id_in_bool_cond1178);
                    b=data_id();

                    state._fsp--;


                    }



                    // TEMPLATE REWRITE
                    // 289:7: -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("addSign",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("sign", (COMPROPER23!=null?COMPROPER23.getText():null)).put("right", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:5: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond1216);
                    fun_call24=fun_call();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 292:7: -> {$fun_call.st}
                    {
                        retval.st = (fun_call24!=null?fun_call24.st:null);
                    }


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond1233); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:297:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:3: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:299:3: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id1248); 
            match(input,ID,FOLLOW_ID_in_brack_id1250); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1252); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:302:1: in_out_op returns [String idType] : ( ( 'out' op_cond ) -> outOp(params=$op_cond.st) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp());
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        strgramParser.op_cond_return op_cond25 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:303:3: ( ( 'out' op_cond ) -> outOp(params=$op_cond.st) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp())
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==35) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:304:3: ( 'out' op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:304:3: ( 'out' op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:304:4: 'out' op_cond
                    {
                    match(input,34,FOLLOW_34_in_in_out_op1272); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op1274);
                    op_cond25=op_cond();

                    state._fsp--;


                    }


                         retval.idType = null;
                        


                    // TEMPLATE REWRITE
                    // 308:3: -> outOp(params=$op_cond.st)
                    {
                        retval.st = templateLib.getInstanceOf("outOp",
                      new STAttrMap().put("params", (op_cond25!=null?op_cond25.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:6: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,35,FOLLOW_35_in_in_out_op1299); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1301); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1303); 

                    }


                         retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 313:5: -> readOp()
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:316:1: fun_call returns [String idType] : (a= ID b= op_cond -> funCall(funName=$a.textfunArgs=$b.st) | in_out_op -> {$in_out_op.st});
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.op_cond_return b = null;

        strgramParser.in_out_op_return in_out_op26 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:317:3: (a= ID b= op_cond -> funCall(funName=$a.textfunArgs=$b.st) | in_out_op -> {$in_out_op.st})
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ID) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=34 && LA17_0<=35)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:318:3: a= ID b= op_cond
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1341); 
                    pushFollow(FOLLOW_op_cond_in_fun_call1345);
                    b=op_cond();

                    state._fsp--;


                         if (!methods.isExist((a!=null?a.getText():null))) {
                         	errors.add("line " + (a!=null?a.getLine():0) + ": methon name " + (a!=null?a.getText():null)
                         			+ " cannot be resolved");
                         } else {
                         	retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();
                         	methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
                        


                    // TEMPLATE REWRITE
                    // 328:3: -> funCall(funName=$a.textfunArgs=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("funCall",
                      new STAttrMap().put("funName", (a!=null?a.getText():null)).put("funArgs", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:330:3: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1378);
                    in_out_op26=in_out_op();

                    state._fsp--;


                         retval.idType = (in_out_op26!=null?in_out_op26.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 334:3: -> {$in_out_op.st}
                    {
                        retval.st = (in_out_op26!=null?in_out_op26.st:null);
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

    public static class self_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "self_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:338:1: self_op : ( ID '.' )? fun_call ;
    public final strgramParser.self_op_return self_op() throws RecognitionException {
        strgramParser.self_op_return retval = new strgramParser.self_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:3: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:340:3: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:340:3: ( ID '.' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==36) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:340:4: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op1408); 
                    match(input,36,FOLLOW_36_in_self_op1410); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op1414);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:343:1: op_cond : PAR_OPEN (a+= data_id ( COMMA a+= data_id )* )? PAR_CLOSE -> args(args=$a);
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:3: ( PAR_OPEN (a+= data_id ( COMMA a+= data_id )* )? PAR_CLOSE -> args(args=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:3: PAR_OPEN (a+= data_id ( COMMA a+= data_id )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1429); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:12: (a+= data_id ( COMMA a+= data_id )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID||(LA20_0>=INT && LA20_0<=CHAR)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:13: a+= data_id ( COMMA a+= data_id )*
                    {
                    pushFollow(FOLLOW_data_id_in_op_cond1434);
                    a=data_id();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:24: ( COMMA a+= data_id )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==COMMA) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:25: COMMA a+= data_id
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1437); 
                    	    pushFollow(FOLLOW_data_id_in_op_cond1441);
                    	    a=data_id();

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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1447); 


            // TEMPLATE REWRITE
            // 346:3: -> args(args=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:349:1: ops : ( id_op EOL -> statement(expr=$id_op.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st));
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_op_return id_op27 = null;

        strgramParser.if_op_return if_op28 = null;

        strgramParser.while_op_return while_op29 = null;

        strgramParser.for_op_return for_op30 = null;

        strgramParser.fun_call_return fun_call31 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:350:3: ( id_op EOL -> statement(expr=$id_op.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st))
            int alt21=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EQUAL||LA21_1==POSTFIX) ) {
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
            case 29:
                {
                alt21=2;
                }
                break;
            case 33:
                {
                alt21=3;
                }
                break;
            case 31:
                {
                alt21=4;
                }
                break;
            case 34:
            case 35:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:351:3: id_op EOL
                    {
                    pushFollow(FOLLOW_id_op_in_ops1473);
                    id_op27=id_op();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1475); 


                    // TEMPLATE REWRITE
                    // 352:5: -> statement(expr=$id_op.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_op27!=null?id_op27.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:353:5: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops1493);
                    if_op28=if_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 354:5: -> {$if_op.st}
                    {
                        retval.st = (if_op28!=null?if_op28.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:355:5: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops1506);
                    while_op29=while_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 356:5: -> {$while_op.st}
                    {
                        retval.st = (while_op29!=null?while_op29.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:357:5: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops1519);
                    for_op30=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 358:5: -> {$for_op.st}
                    {
                        retval.st = (for_op30!=null?for_op30.st:null);
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:359:5: fun_call EOL
                    {
                    pushFollow(FOLLOW_fun_call_in_ops1532);
                    fun_call31=fun_call();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1534); 


                    // TEMPLATE REWRITE
                    // 360:5: -> statement(expr=$fun_call.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (fun_call31!=null?fun_call31.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:363:1: id_op : ( id_assign -> {$id_assign.st} | ( ID POSTFIX ) );
    public final strgramParser.id_op_return id_op() throws RecognitionException {
        strgramParser.id_op_return retval = new strgramParser.id_op_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign32 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:364:3: ( id_assign -> {$id_assign.st} | ( ID POSTFIX ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EQUAL) ) {
                    alt22=1;
                }
                else if ( (LA22_1==POSTFIX) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:365:4: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_op1562);
                    id_assign32=id_assign();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 366:6: -> {$id_assign.st}
                    {
                        retval.st = (id_assign32!=null?id_assign32.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:367:7: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:367:7: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:367:8: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op1579); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op1581); 

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
    // $ANTLR end "id_op"

    public static class main_fun_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "main_fun"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:370:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:371:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:372:3: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun1597); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun1599); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun1601); 
            pushFollow(FOLLOW_fun_body_in_main_fun1603);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:375:1: fun_decl : ( ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats));
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        slist_stack.push(new slist_scope());
        fun_decl_stack.push(new fun_decl_scope());
        strgramParser.fun_decl_return retval = new strgramParser.fun_decl_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_p=null;
        strgramParser.type_return type33 = null;

        strgramParser.fun_body_return fun_body34 = null;

        RuleReturnScope p = null;

        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:384:3: ( ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats))
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID||(LA25_0>=26 && LA25_0<=28)) ) {
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:385:3: ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:385:3: ( type )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=26 && LA23_0<=28)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:385:3: type
                            {
                            pushFollow(FOLLOW_type_in_fun_decl1632);
                            type33=type();

                            state._fsp--;


                            }
                            break;

                    }

                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl1637); 

                         ((fun_decl_scope)fun_decl_stack.peek()).name =(a!=null?a.getText():null);
                         ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
                         methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type33!=null?type33.idType:null)));
                        
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1648); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:391:13: (p+= args )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=26 && LA24_0<=28)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:391:13: p+= args
                            {
                            pushFollow(FOLLOW_args_in_fun_decl1652);
                            p=args();

                            state._fsp--;

                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());


                            }
                            break;

                    }

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1655); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1657);
                    fun_body34=fun_body();

                    state._fsp--;


                         if ((type33!=null?type33.idType:null) != null) {
                         	if ((fun_body34!=null?fun_body34.returnType:null) == null) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null)
                         				+ " missing return statement, expecting " + (type33!=null?type33.idType:null));
                         	} else if (!(type33!=null?type33.idType:null).equals((fun_body34!=null?fun_body34.returnType:null))) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null)
                         				+ " wrong type conversion cannot convert return type "
                         				+ (fun_body34!=null?fun_body34.returnType:null) + " to " + (type33!=null?type33.idType:null));
                         	}
                         }
                        


                    // TEMPLATE REWRITE
                    // 404:5: -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p)
                    {
                        retval.st = templateLib.getInstanceOf("fun_decl",
                      new STAttrMap().put("type", (type33!=null?type33.st:null)).put("name", ((fun_decl_scope)fun_decl_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:406:6: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
                    {
                    match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_fun_decl1710); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1712); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1714); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1716);
                    fun_body();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 407:4: -> main_decl(locals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:410:1: args : a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text);
    public final strgramParser.args_return args() throws RecognitionException {
        strgramParser.args_return retval = new strgramParser.args_return();
        retval.start = input.LT(1);

        Token b=null;
        strgramParser.type_return a = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:411:3: (a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:412:3: a= type b= ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args1751);
            a=type();

            state._fsp--;

            b=(Token)match(input,ID,FOLLOW_ID_in_args1755); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:412:15: ( COMMA type ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:412:16: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args1758); 
            	    pushFollow(FOLLOW_type_in_args1760);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args1762); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 413:5: -> parameter(type=$a.stname=$b.text)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:417:1: fun_body returns [String returnType] : CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE ;
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.var_return var35 = null;

        strgramParser.ops_return ops36 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:418:3: ( CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:419:3: CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body1807); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:420:3: ( var | ops )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==LIST||(LA27_0>=26 && LA27_0<=28)) ) {
                    alt27=1;
                }
                else if ( (LA27_0==ID||LA27_0==29||LA27_0==31||(LA27_0>=33 && LA27_0<=35)) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:421:5: var
            	    {
            	    pushFollow(FOLLOW_var_in_fun_body1817);
            	    var35=var();

            	    state._fsp--;


            	           ((slist_scope)slist_stack.peek()).locals.add((var35!=null?var35.st:null));
            	          

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:425:7: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1834);
            	    ops36=ops();

            	    state._fsp--;


            	           ((slist_scope)slist_stack.peek()).stats.add((ops36!=null?ops36.st:null));
            	          

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:430:3: ( 'return' a= ID EOL )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:430:4: 'return' a= ID EOL
                    {
                    match(input,37,FOLLOW_37_in_fun_body1853); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_body1857); 
                    match(input,EOL,FOLLOW_EOL_in_fun_body1859); 

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
                
            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1872); 

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


 

    public static final BitSet FOLLOW_fun_decl_in_program71 = new BitSet(new long[]{0x000000001C020092L});
    public static final BitSet FOLLOW_var_in_program101 = new BitSet(new long[]{0x000000001C020092L});
    public static final BitSet FOLLOW_26_in_type151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_init236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign273 = new BitSet(new long[]{0x0000000C00007210L});
    public static final BitSet FOLLOW_id_value_in_id_assign275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_id_value318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_value338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var402 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_var405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var409 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LIST_in_var471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var475 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_listParams_in_var492 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_var519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_listParams534 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_listParam_in_listParams539 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_COMMA_in_listParams542 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_listParam_in_listParams546 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_listParams552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_listParam574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr606 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_addExpr_in_expr610 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_MATHOPER_in_addExpr638 = new BitSet(new long[]{0x0000000000007210L});
    public static final BitSet FOLLOW_math_exp_in_addExpr640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp702 = new BitSet(new long[]{0x0000000000007210L});
    public static final BitSet FOLLOW_expr_in_math_exp704 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op848 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_bool_cond_in_if_op850 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op852 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_else_block_in_if_op854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_else_block927 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_else_block929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op971 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op973 = new BitSet(new long[]{0x000000001C001000L});
    public static final BitSet FOLLOW_INT_in_for_op983 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_type_in_for_op1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op1023 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op1025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op1029 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op1047 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op1118 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_bool_cond_in_while_op1120 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond1159 = new BitSet(new long[]{0x0000000C00007210L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1172 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond1174 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1178 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond1216 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id1248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1250 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op1299 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1301 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1341 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_op_cond_in_fun_call1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op1408 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_self_op1410 = new BitSet(new long[]{0x0000000C00007210L});
    public static final BitSet FOLLOW_fun_call_in_self_op1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1429 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_data_id_in_op_cond1434 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1437 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_data_id_in_op_cond1441 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops1473 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_ops1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_ops1532 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_ops1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_op1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_op1579 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun1597 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun1599 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun1601 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl1632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl1637 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1648 = new BitSet(new long[]{0x000000001C000400L});
    public static final BitSet FOLLOW_args_in_fun_decl1652 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1655 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_fun_decl1710 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1712 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1714 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args1751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1755 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_args1758 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args1760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1762 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body1807 = new BitSet(new long[]{0x0000002EBC0A7290L});
    public static final BitSet FOLLOW_var_in_fun_body1817 = new BitSet(new long[]{0x0000002EBC0A7290L});
    public static final BitSet FOLLOW_ops_in_fun_body1834 = new BitSet(new long[]{0x0000002EBC0A7290L});
    public static final BitSet FOLLOW_37_in_fun_body1853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_body1857 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_fun_body1859 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1872 = new BitSet(new long[]{0x0000000000000002L});

}