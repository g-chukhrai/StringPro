// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-25 12:19:18

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
    }
    protected Stack var_stack = new Stack();

    public static class var_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:135:1: var : ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID op_cond ) ) EOL ;
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:142:3: ( ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID op_cond ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:3: ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID op_cond ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:3: ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID op_cond ) )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:5: ( type b+= id_init ( COMMA b+= id_init )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:5: ( type b+= id_init ( COMMA b+= id_init )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:144:6: type b+= id_init ( COMMA b+= id_init )*
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

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:18: ( COMMA b+= id_init )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:148:19: COMMA b+= id_init
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
                    // 149:7: -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b)
                    if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                        retval.st = templateLib.getInstanceOf("globalVariable",
                      new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", list_b));
                    }
                    else // 151:7: -> variable(type=$type.stname=$b)
                    {
                        retval.st = templateLib.getInstanceOf("variable",
                      new STAttrMap().put("type", (type7!=null?type7.st:null)).put("name", list_b));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:7: ( LIST a= ID op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:7: ( LIST a= ID op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:152:8: LIST a= ID op_cond
                    {
                    match(input,LIST,FOLLOW_LIST_in_var471); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_var475); 

                           if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                                     errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                                   } else {
                                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), "List", (a!=null?a.getLine():0)));
                                   }
                          
                    pushFollow(FOLLOW_op_cond_in_var492);
                    op_cond();

                    state._fsp--;


                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var501); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:1: expr returns [String idType] : a+= math_exp (a+= addExpr )* -> iconst(value=$a);
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:166:3: (a+= math_exp (a+= addExpr )* -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:3: a+= math_exp (a+= addExpr )*
            {
            pushFollow(FOLLOW_math_exp_in_expr522);
            a=math_exp();

            state._fsp--;

            if (list_a==null) list_a=new ArrayList();
            list_a.add(a.getTemplate());

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:16: (a+= addExpr )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==MATHOPER) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:16: a+= addExpr
            	    {
            	    pushFollow(FOLLOW_addExpr_in_expr526);
            	    a=addExpr();

            	    state._fsp--;

            	    if (list_a==null) list_a=new ArrayList();
            	    list_a.add(a.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 168:5: -> iconst(value=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:1: addExpr : MATHOPER math_exp -> addExpr(sign=$MATHOPER.textright=$math_exp.st);
    public final strgramParser.addExpr_return addExpr() throws RecognitionException {
        strgramParser.addExpr_return retval = new strgramParser.addExpr_return();
        retval.start = input.LT(1);

        Token MATHOPER8=null;
        strgramParser.math_exp_return math_exp9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:3: ( MATHOPER math_exp -> addExpr(sign=$MATHOPER.textright=$math_exp.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:173:3: MATHOPER math_exp
            {
            MATHOPER8=(Token)match(input,MATHOPER,FOLLOW_MATHOPER_in_addExpr554); 
            pushFollow(FOLLOW_math_exp_in_addExpr556);
            math_exp9=math_exp();

            state._fsp--;



            // TEMPLATE REWRITE
            // 174:5: -> addExpr(sign=$MATHOPER.textright=$math_exp.st)
            {
                retval.st = templateLib.getInstanceOf("addExpr",
              new STAttrMap().put("sign", (MATHOPER8!=null?MATHOPER8.getText():null)).put("right", (math_exp9!=null?math_exp9.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:177:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> inbrac(value=$expr.st));
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return data_id10 = null;

        strgramParser.expr_return expr11 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> inbrac(value=$expr.st))
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp592);
                    data_id10=data_id();

                    state._fsp--;

                    retval.idType = (data_id10!=null?data_id10.idType:null);


                    // TEMPLATE REWRITE
                    // 179:55: -> {$data_id.st}
                    {
                        retval.st = (data_id10!=null?data_id10.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:180:5: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp618); 
                    pushFollow(FOLLOW_expr_in_math_exp620);
                    expr11=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp622); 
                    retval.idType = (expr11!=null?expr11.idType:null);


                    // TEMPLATE REWRITE
                    // 180:55: -> inbrac(value=$expr.st)
                    {
                        retval.st = templateLib.getInstanceOf("inbrac",
                      new STAttrMap().put("value", (expr11!=null?expr11.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:1: data returns [String idType] : ( INT -> {new StringTemplate($INT.text)} | STRING -> {new StringTemplate($STRING.text)} | CHAR -> {new StringTemplate($CHAR.text)});
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT12=null;
        Token STRING13=null;
        Token CHAR14=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:3: ( INT -> {new StringTemplate($INT.text)} | STRING -> {new StringTemplate($STRING.text)} | CHAR -> {new StringTemplate($CHAR.text)})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:185:5: INT
                    {
                    INT12=(Token)match(input,INT,FOLLOW_INT_in_data654); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 185:35: -> {new StringTemplate($INT.text)}
                    {
                        retval.st = new StringTemplate((INT12!=null?INT12.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:186:5: STRING
                    {
                    STRING13=(Token)match(input,STRING,FOLLOW_STRING_in_data672); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 186:35: -> {new StringTemplate($STRING.text)}
                    {
                        retval.st = new StringTemplate((STRING13!=null?STRING13.getText():null));
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:187:5: CHAR
                    {
                    CHAR14=(Token)match(input,CHAR,FOLLOW_CHAR_in_data684); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 187:35: -> {new StringTemplate($CHAR.text)}
                    {
                        retval.st = new StringTemplate((CHAR14!=null?CHAR14.getText():null));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:190:1: data_id returns [String idType] : ( ID -> {new StringTemplate($ID.text)} | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID15=null;
        strgramParser.data_return data16 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:3: ( ID -> {new StringTemplate($ID.text)} | data -> {$data.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:192:3: ID
                    {
                    ID15=(Token)match(input,ID,FOLLOW_ID_in_data_id713); 

                         if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID15!=null?ID15.getText():null))) {
                               errors.add("line "+(ID15!=null?ID15.getLine():0)+": name "+(ID15!=null?ID15.getText():null)+" cannot be resolved");
                             } else {
                               names.get(((program_scope)program_stack.peek()).name + "." + (ID15!=null?ID15.getText():null)).addLineUses((ID15!=null?ID15.getLine():0));   
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID15!=null?ID15.getText():null)).getType();
                             }
                        


                    // TEMPLATE REWRITE
                    // 201:5: -> {new StringTemplate($ID.text)}
                    {
                        retval.st = new StringTemplate((ID15!=null?ID15.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:5: data
                    {
                    pushFollow(FOLLOW_data_in_data_id733);
                    data16=data();

                    state._fsp--;

                    retval.idType = (data16!=null?data16.idType:null);


                    // TEMPLATE REWRITE
                    // 202:37: -> {$data.st}
                    {
                        retval.st = (data16!=null?data16.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:205:1: if_op : 'if' bool_cond fun_body ( else_block )? -> if_else_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::statselse_block=$else_block.st);
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond17 = null;

        strgramParser.else_block_return else_block18 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:211:3: ( 'if' bool_cond fun_body ( else_block )? -> if_else_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::statselse_block=$else_block.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:212:3: 'if' bool_cond fun_body ( else_block )?
            {
            match(input,29,FOLLOW_29_in_if_op764); 
            pushFollow(FOLLOW_bool_cond_in_if_op766);
            bool_cond17=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op768);
            fun_body();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:212:27: ( else_block )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:212:27: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_op770);
                    else_block18=else_block();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 213:5: -> if_else_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::statselse_block=$else_block.st)
            {
                retval.st = templateLib.getInstanceOf("if_else_op",
              new STAttrMap().put("bool_cond", (bool_cond17!=null?bool_cond17.st:null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("else_block", (else_block18!=null?else_block18.st:null)));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:217:1: else_block : 'else' fun_body -> else_block(locals=$slist::localsstats=$slist::stats);
    public final strgramParser.else_block_return else_block() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.else_block_return retval = new strgramParser.else_block_return();
        retval.start = input.LT(1);


        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:3: ( 'else' fun_body -> else_block(locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:224:3: 'else' fun_body
            {
            match(input,30,FOLLOW_30_in_else_block843); 
            pushFollow(FOLLOW_fun_body_in_else_block845);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 225:5: -> else_block(locals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:228:1: for_op : 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_op(e1=\"int i = 0\"e2=\"; i < \" + $INT.texte3=\" i++\"locals=$slist::localsstats=$slist::stats);
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token INT20=null;
        strgramParser.type_return type19 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:3: ( 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_op(e1=\"int i = 0\"e2=\"; i < \" + $INT.texte3=\" i++\"locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:235:3: 'for' PAR_OPEN ( INT | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,31,FOLLOW_31_in_for_op887); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op889); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:236:3: ( INT | ( type a= ID 'in' b= ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==INT) ) {
                alt12=1;
            }
            else if ( ((LA12_0>=26 && LA12_0<=28)) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:237:5: INT
                    {
                    INT20=(Token)match(input,INT,FOLLOW_INT_in_for_op899); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:7: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:7: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:8: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op908);
                    type19=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op912); 
                    match(input,32,FOLLOW_32_in_for_op914); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op918); 

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
                
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op936); 
            pushFollow(FOLLOW_fun_body_in_for_op938);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 254:5: -> for_op(e1=\"int i = 0\"e2=\"; i < \" + $INT.texte3=\" i++\"locals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("for_op",
              new STAttrMap().put("e1", "int i = 0").put("e2", "; i < " + (INT20!=null?INT20.getText():null)).put("e3", " i++").put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:258:1: while_op : 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond21 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:264:3: ( 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:265:3: 'while' bool_cond fun_body
            {
            match(input,33,FOLLOW_33_in_while_op1011); 
            pushFollow(FOLLOW_bool_cond_in_while_op1013);
            bool_cond21=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op1015);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 266:5: -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:269:1: bool_cond : PAR_OPEN ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call ) PAR_CLOSE ;
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        Token COMPROPER22=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:270:3: ( PAR_OPEN ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call ) PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:271:3: PAR_OPEN ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call ) PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond1052); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:272:3: ( (a= data_id COMPROPER b= data_id ) -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st) | fun_call )
            int alt13=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==COMPROPER) ) {
                    alt13=1;
                }
                else if ( (LA13_1==PAR_OPEN) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case STRING:
            case CHAR:
                {
                alt13=1;
                }
                break;
            case 34:
            case 35:
                {
                alt13=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:5: (a= data_id COMPROPER b= data_id )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:5: (a= data_id COMPROPER b= data_id )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:273:6: a= data_id COMPROPER b= data_id
                    {
                    pushFollow(FOLLOW_data_id_in_bool_cond1065);
                    a=data_id();

                    state._fsp--;

                    COMPROPER22=(Token)match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond1067); 
                    pushFollow(FOLLOW_data_id_in_bool_cond1071);
                    b=data_id();

                    state._fsp--;


                    }



                    // TEMPLATE REWRITE
                    // 274:7: -> addSign(left=$a.stsign=$COMPROPER.textright=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("addSign",
                      new STAttrMap().put("left", (a!=null?a.st:null)).put("sign", (COMPROPER22!=null?COMPROPER22.getText():null)).put("right", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:275:7: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_bool_cond1104);
                    fun_call();

                    state._fsp--;


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond1112); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:280:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:281:3: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:282:3: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id1127); 
            match(input,ID,FOLLOW_ID_in_brack_id1129); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1131); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:285:1: in_out_op returns [String idType] : ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) );
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:286:3: ( ( 'out' op_cond ) | ( 'read' PAR_OPEN PAR_CLOSE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            else if ( (LA14_0==35) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:3: ( 'out' op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:3: ( 'out' op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:4: 'out' op_cond
                    {
                    match(input,34,FOLLOW_34_in_in_out_op1151); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op1153);
                    op_cond();

                    state._fsp--;


                    }


                         retval.idType = null;
                        

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:6: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,35,FOLLOW_35_in_in_out_op1168); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1170); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1172); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:297:1: fun_call returns [String idType] : (a= ID op_cond | in_out_op );
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.in_out_op_return in_out_op23 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:3: (a= ID op_cond | in_out_op )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=34 && LA15_0<=35)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:299:3: a= ID op_cond
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1201); 
                    pushFollow(FOLLOW_op_cond_in_fun_call1203);
                    op_cond();

                    state._fsp--;


                         if (!methods.isExist((a!=null?a.getText():null))) {
                         	errors.add("line " + (a!=null?a.getLine():0) + ": methon name " + (a!=null?a.getText():null)
                         			+ " cannot be resolved");
                         } else {
                         	retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();
                         	methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
                        

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:309:5: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1216);
                    in_out_op23=in_out_op();

                    state._fsp--;


                         retval.idType = (in_out_op23!=null?in_out_op23.idType:null);
                        

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:315:1: self_op : ( ID '.' )? fun_call ;
    public final strgramParser.self_op_return self_op() throws RecognitionException {
        strgramParser.self_op_return retval = new strgramParser.self_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:316:3: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:317:3: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:317:3: ( ID '.' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==36) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:317:4: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op1239); 
                    match(input,36,FOLLOW_36_in_self_op1241); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op1245);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:320:1: op_cond : PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE ;
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:321:3: ( PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:322:3: PAR_OPEN ( cond_arg ( COMMA cond_arg )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1260); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:322:12: ( cond_arg ( COMMA cond_arg )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID||(LA18_0>=INT && LA18_0<=CHAR)||(LA18_0>=34 && LA18_0<=35)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:322:13: cond_arg ( COMMA cond_arg )*
                    {
                    pushFollow(FOLLOW_cond_arg_in_op_cond1263);
                    cond_arg();

                    state._fsp--;

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:322:22: ( COMMA cond_arg )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==COMMA) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:322:23: COMMA cond_arg
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1266); 
                    	    pushFollow(FOLLOW_cond_arg_in_op_cond1268);
                    	    cond_arg();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1274); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:325:1: cond_arg : ( data_id | self_op );
    public final strgramParser.cond_arg_return cond_arg() throws RecognitionException {
        strgramParser.cond_arg_return retval = new strgramParser.cond_arg_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:326:3: ( data_id | self_op )
            int alt19=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==PAR_OPEN||LA19_1==36) ) {
                    alt19=2;
                }
                else if ( (LA19_1==COMMA||LA19_1==PAR_CLOSE) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case STRING:
            case CHAR:
                {
                alt19=1;
                }
                break;
            case 34:
            case 35:
                {
                alt19=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:327:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_cond_arg1289);
                    data_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:328:5: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_cond_arg1295);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:331:1: ops : ( id_op -> statement(expr=$id_op.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st});
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_op_return id_op24 = null;

        strgramParser.if_op_return if_op25 = null;

        strgramParser.while_op_return while_op26 = null;

        strgramParser.for_op_return for_op27 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:332:3: ( id_op -> statement(expr=$id_op.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st})
            int alt20=4;
            switch ( input.LA(1) ) {
            case ID:
            case 34:
            case 35:
                {
                alt20=1;
                }
                break;
            case 29:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            case 31:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:333:3: id_op
                    {
                    pushFollow(FOLLOW_id_op_in_ops1310);
                    id_op24=id_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 334:5: -> statement(expr=$id_op.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_op24!=null?id_op24.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:335:5: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops1328);
                    if_op25=if_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 336:5: -> {$if_op.st}
                    {
                        retval.st = (if_op25!=null?if_op25.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:337:5: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops1341);
                    while_op26=while_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 338:5: -> {$while_op.st}
                    {
                        retval.st = (while_op26!=null?while_op26.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:5: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops1354);
                    for_op27=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 340:5: -> {$for_op.st}
                    {
                        retval.st = (for_op27!=null?for_op27.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:343:1: id_op : ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) ) EOL ;
    public final strgramParser.id_op_return id_op() throws RecognitionException {
        strgramParser.id_op_return retval = new strgramParser.id_op_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign28 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:3: ( ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) ) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:3: ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) ) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:345:3: ( id_assign -> {$id_assign.st} | self_op | ( ID POSTFIX ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                switch ( input.LA(2) ) {
                case EQUAL:
                    {
                    alt21=1;
                    }
                    break;
                case PAR_OPEN:
                case 36:
                    {
                    alt21=2;
                    }
                    break;
                case POSTFIX:
                    {
                    alt21=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA21_0>=34 && LA21_0<=35)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:346:4: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_op1381);
                    id_assign28=id_assign();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 347:6: -> {$id_assign.st}
                    {
                        retval.st = (id_assign28!=null?id_assign28.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:348:7: self_op
                    {
                    pushFollow(FOLLOW_self_op_in_id_op1397);
                    self_op();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:349:7: ( ID POSTFIX )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:349:7: ( ID POSTFIX )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:349:8: ID POSTFIX
                    {
                    match(input,ID,FOLLOW_ID_in_id_op1406); 
                    match(input,POSTFIX,FOLLOW_POSTFIX_in_id_op1408); 

                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_id_op1417); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:354:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:355:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:356:3: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun1432); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun1434); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun1436); 
            pushFollow(FOLLOW_fun_body_in_main_fun1438);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:359:1: fun_decl : ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p);
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        slist_stack.push(new slist_scope());
        fun_decl_stack.push(new fun_decl_scope());
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:368:3: ( ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:369:3: ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:369:3: ( type )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=26 && LA22_0<=28)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:369:3: type
                    {
                    pushFollow(FOLLOW_type_in_fun_decl1467);
                    type29=type();

                    state._fsp--;


                    }
                    break;

            }

            a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl1472); 

                 ((fun_decl_scope)fun_decl_stack.peek()).name =(a!=null?a.getText():null);
                

                 ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
                 	     methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type29!=null?type29.idType:null)));
                
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1492); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:378:13: (p+= args )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=26 && LA23_0<=28)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:378:13: p+= args
                    {
                    pushFollow(FOLLOW_args_in_fun_decl1496);
                    p=args();

                    state._fsp--;

                    if (list_p==null) list_p=new ArrayList();
                    list_p.add(p.getTemplate());


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1499); 
            pushFollow(FOLLOW_fun_body_in_fun_decl1501);
            fun_body30=fun_body();

            state._fsp--;


                 if ((type29!=null?type29.idType:null) != null) {
                 	if ((fun_body30!=null?fun_body30.returnType:null) == null) {
                 		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null)
                 				+ " missing return statement, expecting " + (type29!=null?type29.idType:null));
                 	} else if (!(type29!=null?type29.idType:null).equals((fun_body30!=null?fun_body30.returnType:null))) {
                 		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null)
                 				+ " wrong type conversion cannot convert return type "
                 				+ (fun_body30!=null?fun_body30.returnType:null) + " to " + (type29!=null?type29.idType:null));
                 	}
                 }
                


            // TEMPLATE REWRITE
            // 391:5: -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p)
            {
                retval.st = templateLib.getInstanceOf("fun_decl",
              new STAttrMap().put("type", (type29!=null?type29.st:null)).put("name", ((fun_decl_scope)fun_decl_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:395:1: args : a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text);
    public final strgramParser.args_return args() throws RecognitionException {
        strgramParser.args_return retval = new strgramParser.args_return();
        retval.start = input.LT(1);

        Token b=null;
        strgramParser.type_return a = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:396:3: (a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:397:3: a= type b= ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args1564);
            a=type();

            state._fsp--;

            b=(Token)match(input,ID,FOLLOW_ID_in_args1568); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:397:15: ( COMMA type ID )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMA) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:397:16: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args1571); 
            	    pushFollow(FOLLOW_type_in_args1573);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args1575); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 398:5: -> parameter(type=$a.stname=$b.text)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:402:1: fun_body returns [String returnType] : CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE ;
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.var_return var31 = null;

        strgramParser.ops_return ops32 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:403:3: ( CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:404:3: CUR_OPEN ( var | ops )* ( 'return' a= ID EOL )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body1620); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:405:3: ( var | ops )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LIST||(LA25_0>=26 && LA25_0<=28)) ) {
                    alt25=1;
                }
                else if ( (LA25_0==ID||LA25_0==29||LA25_0==31||(LA25_0>=33 && LA25_0<=35)) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:406:5: var
            	    {
            	    pushFollow(FOLLOW_var_in_fun_body1630);
            	    var31=var();

            	    state._fsp--;


            	           ((slist_scope)slist_stack.peek()).locals.add((var31!=null?var31.st:null));
            	          

            	    }
            	    break;
            	case 2 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:410:7: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1647);
            	    ops32=ops();

            	    state._fsp--;


            	           ((slist_scope)slist_stack.peek()).stats.add((ops32!=null?ops32.st:null));
            	          

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:415:3: ( 'return' a= ID EOL )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:415:4: 'return' a= ID EOL
                    {
                    match(input,37,FOLLOW_37_in_fun_body1666); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_body1670); 
                    match(input,EOL,FOLLOW_EOL_in_fun_body1672); 

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
                
            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1685); 

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


 

    public static final BitSet FOLLOW_fun_decl_in_program71 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_var_in_program101 = new BitSet(new long[]{0x000000001C000092L});
    public static final BitSet FOLLOW_26_in_type151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_type187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_init236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign271 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign273 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_id_value_in_id_assign275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_id_value318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_id_value338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var402 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_var405 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var409 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LIST_in_var471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var475 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_var492 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_var501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr522 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_addExpr_in_expr526 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_MATHOPER_in_addExpr554 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_math_exp_in_addExpr556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp618 = new BitSet(new long[]{0x0000000000007410L});
    public static final BitSet FOLLOW_expr_in_math_exp620 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_if_op764 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_if_op766 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_if_op768 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_else_block_in_if_op770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_else_block843 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_else_block845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_for_op887 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op889 = new BitSet(new long[]{0x000000001C001000L});
    public static final BitSet FOLLOW_INT_in_for_op899 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_type_in_for_op908 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op912 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_for_op914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op918 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op936 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_for_op938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_while_op1011 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_bool_cond_in_while_op1013 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_while_op1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond1052 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1065 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond1067 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1071 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_fun_call_in_bool_cond1104 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id1127 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1129 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1151 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_in_out_op1168 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1170 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1201 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_op_cond_in_fun_call1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op1239 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_self_op1241 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_fun_call_in_self_op1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1260 = new BitSet(new long[]{0x0000000C00007C10L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond1263 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1266 = new BitSet(new long[]{0x0000000C00007410L});
    public static final BitSet FOLLOW_cond_arg_in_op_cond1268 = new BitSet(new long[]{0x0000000000000840L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_cond_arg1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_self_op_in_cond_arg1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_op_in_ops1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_op1381 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_self_op_in_id_op1397 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_id_op1406 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_POSTFIX_in_id_op1408 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_id_op1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun1432 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun1434 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun1436 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl1467 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl1472 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1492 = new BitSet(new long[]{0x000000001C000800L});
    public static final BitSet FOLLOW_args_in_fun_decl1496 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1499 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args1564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1568 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_args1571 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_type_in_args1573 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1575 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body1620 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_var_in_fun_body1630 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_ops_in_fun_body1647 = new BitSet(new long[]{0x0000002EBC087490L});
    public static final BitSet FOLLOW_37_in_fun_body1666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_body1670 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_fun_body1672 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1685 = new BitSet(new long[]{0x0000000000000002L});

}