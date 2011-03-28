// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-28 16:30:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "EQUAL", "COMMA", "LIST", "EOL", "PAR_OPEN", "PAR_CLOSE", "MATHOPER", "INT", "STRING", "CHAR", "COMPROPER", "MAIN_NAME", "CUR_OPEN", "CUR_CLOSE", "SQ_OPEN", "SQ_CLOSE", "DIGIT", "ALPHA", "WS", "COMMENT", "'Int'", "'String'", "'Char'", "'if'", "'else'", "'for'", "'in'", "'while'", "'out'", "'read'", "'.'", "'return'"
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
    public static final int MAIN_NAME=16;
    public static final int CUR_OPEN=17;
    public static final int CUR_CLOSE=18;
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
                case 26:
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
                case 27:
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:79:1: id_init : (a= ID -> {new StringTemplate($a.text)} | id_assign -> {$id_assign.st});
    public final strgramParser.id_init_return id_init() throws RecognitionException {
        strgramParser.id_init_return retval = new strgramParser.id_init_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.id_assign_return id_assign3 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:80:3: (a= ID -> {new StringTemplate($a.text)} | id_assign -> {$id_assign.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:81:3: a= ID
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_id_init223); 

                         if ((a!=null?a.getText():null) != null) {
                                 if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                                     errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                                 } else {
                         	          names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), ((var_scope)var_stack.peek()).varType, (a!=null?a.getLine():0)));
                         			    }
                                 }
                        


                    // TEMPLATE REWRITE
                    // 91:5: -> {new StringTemplate($a.text)}
                    {
                        retval.st = new StringTemplate((a!=null?a.getText():null));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:92:5: id_assign
                    {
                    pushFollow(FOLLOW_id_assign_in_id_init243);
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
                    // 108:5: -> {$id_assign.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:111:1: id_assign returns [String idName, String idType, int idLine] : a= ID EQUAL b= expr -> assign(lhs=$a.textrhs=$b.st);
    public final strgramParser.id_assign_return id_assign() throws RecognitionException {
        strgramParser.id_assign_return retval = new strgramParser.id_assign_return();
        retval.start = input.LT(1);

        Token a=null;
        strgramParser.expr_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:112:3: (a= ID EQUAL b= expr -> assign(lhs=$a.textrhs=$b.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:113:3: a= ID EQUAL b= expr
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_id_assign278); 
            match(input,EQUAL,FOLLOW_EQUAL_in_id_assign280); 
            pushFollow(FOLLOW_expr_in_id_assign284);
            b=expr();

            state._fsp--;


                 retval.idName = (a!=null?a.getText():null);
                 	   retval.idType = (b!=null?b.idType:null);
                 	   retval.idLine = (a!=null?a.getLine():0);
                             if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                               names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                 	            String varType = names.get(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null)).getType();
                 	            if (!varType.equals((b!=null?b.idType:null))) {
                 	              errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" wrong type conversion cannot convert " + (b!=null?b.idType:null) + " to " + varType);
                 	            }
                             }
                


            // TEMPLATE REWRITE
            // 126:5: -> assign(lhs=$a.textrhs=$b.st)
            {
                retval.st = templateLib.getInstanceOf("assign",
              new STAttrMap().put("lhs", (a!=null?a.getText():null)).put("rhs", (b!=null?b.st:null)));
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
        String listName;
    }
    protected Stack var_stack = new Stack();

    public static class var_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "var"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:129:1: var : ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st)) EOL ;
    public final strgramParser.var_return var() throws RecognitionException {
        var_stack.push(new var_scope());
        strgramParser.var_return retval = new strgramParser.var_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.type_return type4 = null;

        strgramParser.listParams_return listParams5 = null;

        RuleReturnScope b = null;

        ((var_scope)var_stack.peek()).varType = "";

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:137:3: ( ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st)) EOL )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:3: ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st)) EOL
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:138:3: ( ( type b+= id_init ( COMMA b+= id_init )* ) -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b) -> variable(type=$type.stname=$b) | ( LIST a= ID listParams ) -> listInit(name=$a.textparams=$listParams.st))
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=25 && LA5_0<=27)) ) {
                alt5=1;
            }
            else if ( (LA5_0==LIST) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:5: ( type b+= id_init ( COMMA b+= id_init )* )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:5: ( type b+= id_init ( COMMA b+= id_init )* )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:139:6: type b+= id_init ( COMMA b+= id_init )*
                    {
                    pushFollow(FOLLOW_type_in_var339);
                    type4=type();

                    state._fsp--;


                           ((var_scope)var_stack.peek()).varType = (type4!=null?type4.idType:null);
                          
                    pushFollow(FOLLOW_id_init_in_var358);
                    b=id_init();

                    state._fsp--;

                    if (list_b==null) list_b=new ArrayList();
                    list_b.add(b.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:18: ( COMMA b+= id_init )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:143:19: COMMA b+= id_init
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_var361); 
                    	    pushFollow(FOLLOW_id_init_in_var365);
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


                    }



                    // TEMPLATE REWRITE
                    // 144:7: -> {$program::name.equals(\"[global]\")}? globalVariable(type=$type.stname=$b)
                    if (((program_scope)program_stack.peek()).name.equals("[global]")) {
                        retval.st = templateLib.getInstanceOf("globalVariable",
                      new STAttrMap().put("type", (type4!=null?type4.st:null)).put("name", list_b));
                    }
                    else // 146:7: -> variable(type=$type.stname=$b)
                    {
                        retval.st = templateLib.getInstanceOf("variable",
                      new STAttrMap().put("type", (type4!=null?type4.st:null)).put("name", list_b));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:7: ( LIST a= ID listParams )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:7: ( LIST a= ID listParams )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:147:8: LIST a= ID listParams
                    {
                    match(input,LIST,FOLLOW_LIST_in_var427); 
                    a=(Token)match(input,ID,FOLLOW_ID_in_var431); 

                           if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                                     errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" duplicated");
                                   } else {
                                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), "List", (a!=null?a.getLine():0)));
                                   }
                           ((var_scope)var_stack.peek()).listName = (a!=null?a.getText():null);
                          
                    pushFollow(FOLLOW_listParams_in_var448);
                    listParams5=listParams();

                    state._fsp--;


                    }



                    // TEMPLATE REWRITE
                    // 157:7: -> listInit(name=$a.textparams=$listParams.st)
                    {
                        retval.st = templateLib.getInstanceOf("listInit",
                      new STAttrMap().put("name", (a!=null?a.getText():null)).put("params", (listParams5!=null?listParams5.st:null)));
                    }


                    }
                    break;

            }

            match(input,EOL,FOLLOW_EOL_in_var475); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:1: listParams : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a);
    public final strgramParser.listParams_return listParams() throws RecognitionException {
        strgramParser.listParams_return retval = new strgramParser.listParams_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:1: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> iconst(value=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_listParams490); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:12: (a+= expr ( COMMA a+= expr )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||LA7_0==PAR_OPEN||(LA7_0>=INT && LA7_0<=CHAR)||(LA7_0>=33 && LA7_0<=34)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_listParams495);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:21: ( COMMA a+= expr )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_listParams498); 
                    	    pushFollow(FOLLOW_expr_in_listParams502);
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

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_listParams508); 


            // TEMPLATE REWRITE
            // 165:3: -> iconst(value=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:1: expr returns [String idType] : a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> iconst(value=$a.streg=getLastReg());
    public final strgramParser.expr_return expr() throws RecognitionException {
        strgramParser.expr_return retval = new strgramParser.expr_return();
        retval.start = input.LT(1);

        Token MATHOPER6=null;
        strgramParser.math_exp_return a = null;

        strgramParser.math_exp_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:3: (a= math_exp ( MATHOPER b= math_exp )? -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st) -> iconst(value=$a.streg=getLastReg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:3: a= math_exp ( MATHOPER b= math_exp )?
            {
            pushFollow(FOLLOW_math_exp_in_expr538);
            a=math_exp();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:14: ( MATHOPER b= math_exp )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==MATHOPER) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:15: MATHOPER b= math_exp
                    {
                    MATHOPER6=(Token)match(input,MATHOPER,FOLLOW_MATHOPER_in_expr541); 
                    pushFollow(FOLLOW_math_exp_in_expr545);
                    b=math_exp();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 171:7: -> {$b.st!=null}? bop(reg=getreg()op=$MATHOPER.texta=$a.stb=$b.st)
            if ((b!=null?b.st:null)!=null) {
                retval.st = templateLib.getInstanceOf("bop",
              new STAttrMap().put("reg", getreg()).put("op", (MATHOPER6!=null?MATHOPER6.getText():null)).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
            }
            else // 173:7: -> iconst(value=$a.streg=getLastReg())
            {
                retval.st = templateLib.getInstanceOf("iconst",
              new STAttrMap().put("value", (a!=null?a.st:null)).put("reg", getLastReg()));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:176:1: math_exp returns [String idType] : ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st});
    public final strgramParser.math_exp_return math_exp() throws RecognitionException {
        strgramParser.math_exp_return retval = new strgramParser.math_exp_return();
        retval.start = input.LT(1);

        strgramParser.data_id_return data_id7 = null;

        strgramParser.expr_return expr8 = null;

        strgramParser.fun_call_return fun_call9 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:177:3: ( data_id -> {$data_id.st} | PAR_OPEN expr PAR_CLOSE -> {$expr.st} | fun_call -> {$fun_call.st})
            int alt9=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==PAR_OPEN) ) {
                    alt9=3;
                }
                else if ( (LA9_1==COMMA||LA9_1==EOL||(LA9_1>=PAR_CLOSE && LA9_1<=MATHOPER)) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case INT:
            case STRING:
            case CHAR:
                {
                alt9=1;
                }
                break;
            case PAR_OPEN:
                {
                alt9=2;
                }
                break;
            case 33:
            case 34:
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:178:3: data_id
                    {
                    pushFollow(FOLLOW_data_id_in_math_exp626);
                    data_id7=data_id();

                    state._fsp--;

                    retval.idType = (data_id7!=null?data_id7.idType:null);


                    // TEMPLATE REWRITE
                    // 180:3: -> {$data_id.st}
                    {
                        retval.st = (data_id7!=null?data_id7.st:null);
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:182:3: PAR_OPEN expr PAR_CLOSE
                    {
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_math_exp661); 
                    pushFollow(FOLLOW_expr_in_math_exp663);
                    expr8=expr();

                    state._fsp--;

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_math_exp665); 
                    retval.idType = (expr8!=null?expr8.idType:null);


                    // TEMPLATE REWRITE
                    // 184:3: -> {$expr.st}
                    {
                        retval.st = (expr8!=null?expr8.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:186:3: fun_call
                    {
                    pushFollow(FOLLOW_fun_call_in_math_exp685);
                    fun_call9=fun_call();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 187:3: -> {$fun_call.st}
                    {
                        retval.st = (fun_call9!=null?fun_call9.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:190:1: data returns [String idType] : ( INT -> int(reg=getreg()v=$INT.text) | STRING -> string(reg=getreg()s=new StringTemplate($STRING.text)sreg=getstr($STRING.text)) | CHAR -> {new StringTemplate($CHAR.text)});
    public final strgramParser.data_return data() throws RecognitionException {
        strgramParser.data_return retval = new strgramParser.data_return();
        retval.start = input.LT(1);

        Token INT10=null;
        Token STRING11=null;
        Token CHAR12=null;

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:3: ( INT -> int(reg=getreg()v=$INT.text) | STRING -> string(reg=getreg()s=new StringTemplate($STRING.text)sreg=getstr($STRING.text)) | CHAR -> {new StringTemplate($CHAR.text)})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:192:5: INT
                    {
                    INT10=(Token)match(input,INT,FOLLOW_INT_in_data711); 
                    retval.idType = "Int";


                    // TEMPLATE REWRITE
                    // 192:35: -> int(reg=getreg()v=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("reg", getreg()).put("v", (INT10!=null?INT10.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:193:5: STRING
                    {
                    STRING11=(Token)match(input,STRING,FOLLOW_STRING_in_data738); 
                    retval.idType = "String";


                    // TEMPLATE REWRITE
                    // 193:35: -> string(reg=getreg()s=new StringTemplate($STRING.text)sreg=getstr($STRING.text))
                    {
                        retval.st = templateLib.getInstanceOf("string",
                      new STAttrMap().put("reg", getreg()).put("s", new StringTemplate((STRING11!=null?STRING11.getText():null))).put("sreg", getstr((STRING11!=null?STRING11.getText():null))));
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:5: CHAR
                    {
                    CHAR12=(Token)match(input,CHAR,FOLLOW_CHAR_in_data764); 
                    retval.idType = "Char";


                    // TEMPLATE REWRITE
                    // 194:35: -> {new StringTemplate($CHAR.text)}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:197:1: data_id returns [String idType] : ( ID -> load_var(reg=getreg()id=$ID.text) | data -> {$data.st});
    public final strgramParser.data_id_return data_id() throws RecognitionException {
        strgramParser.data_id_return retval = new strgramParser.data_id_return();
        retval.start = input.LT(1);

        Token ID13=null;
        strgramParser.data_return data14 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:3: ( ID -> load_var(reg=getreg()id=$ID.text) | data -> {$data.st})
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=INT && LA11_0<=CHAR)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:199:3: ID
                    {
                    ID13=(Token)match(input,ID,FOLLOW_ID_in_data_id793); 

                         if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (ID13!=null?ID13.getText():null))) {
                               errors.add("line "+(ID13!=null?ID13.getLine():0)+": name "+(ID13!=null?ID13.getText():null)+" cannot be resolved");
                         } else {
                               names.get(((program_scope)program_stack.peek()).name + "." + (ID13!=null?ID13.getText():null)).addLineUses((ID13!=null?ID13.getLine():0));   
                               retval.idType = names.get(((program_scope)program_stack.peek()).name + "." + (ID13!=null?ID13.getText():null)).getType();
                         }
                      


                    // TEMPLATE REWRITE
                    // 208:3: -> load_var(reg=getreg()id=$ID.text)
                    {
                        retval.st = templateLib.getInstanceOf("load_var",
                      new STAttrMap().put("reg", getreg()).put("id", (ID13!=null?ID13.getText():null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:3: data
                    {
                    pushFollow(FOLLOW_data_in_data_id824);
                    data14=data();

                    state._fsp--;

                    retval.idType = (data14!=null?data14.idType:null);


                    // TEMPLATE REWRITE
                    // 212:3: -> {$data.st}
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:216:1: if_op : 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg());
    public final strgramParser.if_op_return if_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.if_op_return retval = new strgramParser.if_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond15 = null;

        strgramParser.fun_body_return fun_body16 = null;

        strgramParser.else_block_return else_block17 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:222:3: ( 'if' bool_cond fun_body ( else_block )? -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg()))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:3: 'if' bool_cond fun_body ( else_block )?
            {
            match(input,28,FOLLOW_28_in_if_op862); 
            pushFollow(FOLLOW_bool_cond_in_if_op864);
            bool_cond15=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_if_op866);
            fun_body16=fun_body();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:27: ( else_block )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:223:27: else_block
                    {
                    pushFollow(FOLLOW_else_block_in_if_op868);
                    else_block17=else_block();

                    state._fsp--;


                    }
                    break;

            }



            // TEMPLATE REWRITE
            // 224:3: -> if_op(cond=$bool_cond.ststat1=$fun_body.ststat2=$else_block.sttmp=getreg())
            {
                retval.st = templateLib.getInstanceOf("if_op",
              new STAttrMap().put("cond", (bool_cond15!=null?bool_cond15.st:null)).put("stat1", (fun_body16!=null?fun_body16.st:null)).put("stat2", (else_block17!=null?else_block17.st:null)).put("tmp", getreg()));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:227:1: else_block : 'else' fun_body -> {$fun_body.st};
    public final strgramParser.else_block_return else_block() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.else_block_return retval = new strgramParser.else_block_return();
        retval.start = input.LT(1);

        strgramParser.fun_body_return fun_body18 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:233:3: ( 'else' fun_body -> {$fun_body.st})
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:234:3: 'else' fun_body
            {
            match(input,29,FOLLOW_29_in_else_block920); 
            pushFollow(FOLLOW_fun_body_in_else_block922);
            fun_body18=fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 235:5: -> {$fun_body.st}
            {
                retval.st = (fun_body18!=null?fun_body18.st:null);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:1: for_op : 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.for_op_return for_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.for_op_return retval = new strgramParser.for_op_return();
        retval.start = input.LT(1);

        Token a=null;
        Token b=null;
        Token INT19=null;
        strgramParser.type_return type20 = null;



          ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:244:3: ( 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:245:3: 'for' PAR_OPEN ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) ) PAR_CLOSE fun_body
            {
            match(input,30,FOLLOW_30_in_for_op954); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_for_op956); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:246:3: ( INT -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats) | ( type a= ID 'in' b= ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==INT) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=25 && LA13_0<=27)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:247:5: INT
                    {
                    INT19=(Token)match(input,INT,FOLLOW_INT_in_for_op966); 


                    // TEMPLATE REWRITE
                    // 248:5: -> for_op(count=$INT.textlocals=$slist::localsstats=$slist::stats)
                    {
                        retval.st = templateLib.getInstanceOf("for_op",
                      new STAttrMap().put("count", (INT19!=null?INT19.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:7: ( type a= ID 'in' b= ID )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:7: ( type a= ID 'in' b= ID )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:249:8: type a= ID 'in' b= ID
                    {
                    pushFollow(FOLLOW_type_in_for_op998);
                    type20=type();

                    state._fsp--;

                    a=(Token)match(input,ID,FOLLOW_ID_in_for_op1002); 
                    match(input,31,FOLLOW_31_in_for_op1004); 
                    b=(Token)match(input,ID,FOLLOW_ID_in_for_op1008); 

                    }


                    }
                    break;

            }


                 if (names.isExist(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null))) {
                       errors.add("line "+(a!=null?a.getLine():0)+": name "+(a!=null?a.getText():null)+" dublicated");
                     } else {
                       names.add(names.new Name(((program_scope)program_stack.peek()).name + "." + (a!=null?a.getText():null), (type20!=null?type20.idType:null), (a!=null?a.getLine():0)));
                     }
                     if (! names.isExist(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null))) {
                       errors.add("line "+(b!=null?b.getLine():0)+": name "+(b!=null?b.getText():null)+" cannot be resolved");
                     } else {
                       names.get(((program_scope)program_stack.peek()).name + "." + (b!=null?b.getText():null)).addLineUses((b!=null?b.getLine():0));   
                     }
                
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_for_op1026); 
            pushFollow(FOLLOW_fun_body_in_for_op1028);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 265:3: -> for_list_op(type=$type.idTypeid=$a.textlistId=$b.textlocals=$slist::localsstats=$slist::stats)
            {
                retval.st = templateLib.getInstanceOf("for_list_op",
              new STAttrMap().put("type", (type20!=null?type20.idType:null)).put("id", (a!=null?a.getText():null)).put("listId", (b!=null?b.getText():null)).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats));
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:269:1: while_op : 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats);
    public final strgramParser.while_op_return while_op() throws RecognitionException {
        slist_stack.push(new slist_scope());

        strgramParser.while_op_return retval = new strgramParser.while_op_return();
        retval.start = input.LT(1);

        strgramParser.bool_cond_return bool_cond21 = null;



        ((slist_scope)slist_stack.peek()).locals = new ArrayList();
          ((slist_scope)slist_stack.peek()).stats = new ArrayList();

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:275:3: ( 'while' bool_cond fun_body -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:276:3: 'while' bool_cond fun_body
            {
            match(input,32,FOLLOW_32_in_while_op1097); 
            pushFollow(FOLLOW_bool_cond_in_while_op1099);
            bool_cond21=bool_cond();

            state._fsp--;

            pushFollow(FOLLOW_fun_body_in_while_op1101);
            fun_body();

            state._fsp--;



            // TEMPLATE REWRITE
            // 277:5: -> while_op(bool_cond=$bool_cond.stlocals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:280:1: bool_cond : PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st);
    public final strgramParser.bool_cond_return bool_cond() throws RecognitionException {
        strgramParser.bool_cond_return retval = new strgramParser.bool_cond_return();
        retval.start = input.LT(1);

        Token COMPROPER22=null;
        strgramParser.data_id_return a = null;

        strgramParser.data_id_return b = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:281:3: ( PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:282:3: PAR_OPEN a= data_id ( COMPROPER b= data_id )* PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_bool_cond1138); 
            pushFollow(FOLLOW_data_id_in_bool_cond1142);
            a=data_id();

            state._fsp--;

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:282:22: ( COMPROPER b= data_id )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMPROPER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:282:23: COMPROPER b= data_id
            	    {
            	    COMPROPER22=(Token)match(input,COMPROPER,FOLLOW_COMPROPER_in_bool_cond1145); 
            	    pushFollow(FOLLOW_data_id_in_bool_cond1149);
            	    b=data_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_bool_cond1153); 


            // TEMPLATE REWRITE
            // 283:3: -> bop(reg=getreg()op=$COMPROPER.texta=$a.stb=$b.st)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:286:1: brack_id : PAR_OPEN ID PAR_CLOSE ;
    public final strgramParser.brack_id_return brack_id() throws RecognitionException {
        strgramParser.brack_id_return retval = new strgramParser.brack_id_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:287:3: ( PAR_OPEN ID PAR_CLOSE )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:288:3: PAR_OPEN ID PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_brack_id1193); 
            match(input,ID,FOLLOW_ID_in_brack_id1195); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_brack_id1197); 

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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:291:1: in_out_op returns [String idType] : ( ( 'out' op_cond ) -> outOp(params=$op_cond.st) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp());
    public final strgramParser.in_out_op_return in_out_op() throws RecognitionException {
        strgramParser.in_out_op_return retval = new strgramParser.in_out_op_return();
        retval.start = input.LT(1);

        strgramParser.op_cond_return op_cond23 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:292:3: ( ( 'out' op_cond ) -> outOp(params=$op_cond.st) | ( 'read' PAR_OPEN PAR_CLOSE ) -> readOp())
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:3: ( 'out' op_cond )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:3: ( 'out' op_cond )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:293:4: 'out' op_cond
                    {
                    match(input,33,FOLLOW_33_in_in_out_op1217); 
                    pushFollow(FOLLOW_op_cond_in_in_out_op1219);
                    op_cond23=op_cond();

                    state._fsp--;


                    }


                         retval.idType = null;
                        


                    // TEMPLATE REWRITE
                    // 297:3: -> outOp(params=$op_cond.st)
                    {
                        retval.st = templateLib.getInstanceOf("outOp",
                      new STAttrMap().put("params", (op_cond23!=null?op_cond23.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:5: ( 'read' PAR_OPEN PAR_CLOSE )
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:298:6: 'read' PAR_OPEN PAR_CLOSE
                    {
                    match(input,34,FOLLOW_34_in_in_out_op1244); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_in_out_op1246); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_in_out_op1248); 

                    }


                         retval.idType = "String";
                        


                    // TEMPLATE REWRITE
                    // 302:5: -> readOp()
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:305:1: fun_call returns [String idType] : (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st});
    public final strgramParser.fun_call_return fun_call() throws RecognitionException {
        strgramParser.fun_call_return retval = new strgramParser.fun_call_return();
        retval.start = input.LT(1);

        Token a=null;
        List list_b=null;
        strgramParser.in_out_op_return in_out_op24 = null;

        RuleReturnScope b = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:306:3: (a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType) | in_out_op -> {$in_out_op.st})
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:3: a= ID PAR_OPEN (b+= expr ( COMMA b+= expr )* )? PAR_CLOSE
                    {
                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_call1286); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_call1288); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:17: (b+= expr ( COMMA b+= expr )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ID||LA17_0==PAR_OPEN||(LA17_0>=INT && LA17_0<=CHAR)||(LA17_0>=33 && LA17_0<=34)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:18: b+= expr ( COMMA b+= expr )*
                            {
                            pushFollow(FOLLOW_expr_in_fun_call1293);
                            b=expr();

                            state._fsp--;

                            if (list_b==null) list_b=new ArrayList();
                            list_b.add(b.getTemplate());

                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:26: ( COMMA b+= expr )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==COMMA) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:307:27: COMMA b+= expr
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_fun_call1296); 
                            	    pushFollow(FOLLOW_expr_in_fun_call1300);
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

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_call1306); 

                         if (!methods.isExist((a!=null?a.getText():null))) {
                         	errors.add("line " + (a!=null?a.getLine():0) + ": methon name " + (a!=null?a.getText():null)
                         			+ " cannot be resolved");
                         } else {
                         	retval.idType = methods.get((a!=null?a.getText():null)).getReturnType();
                         	methods.get((a!=null?a.getText():null)).addLineUses((a!=null?a.getLine():0));
                         }
                        


                    // TEMPLATE REWRITE
                    // 317:3: -> funCall(reg=getreg()funName=$a.textfunArgs=$bret=$idType)
                    {
                        retval.st = templateLib.getInstanceOf("funCall",
                      new STAttrMap().put("reg", getreg()).put("funName", (a!=null?a.getText():null)).put("funArgs", list_b).put("ret", retval.idType));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:319:3: in_out_op
                    {
                    pushFollow(FOLLOW_in_out_op_in_fun_call1346);
                    in_out_op24=in_out_op();

                    state._fsp--;


                         retval.idType = (in_out_op24!=null?in_out_op24.idType:null);
                        


                    // TEMPLATE REWRITE
                    // 323:3: -> {$in_out_op.st}
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

    public static class self_op_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "self_op"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:327:1: self_op : ( ID '.' )? fun_call ;
    public final strgramParser.self_op_return self_op() throws RecognitionException {
        strgramParser.self_op_return retval = new strgramParser.self_op_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:328:3: ( ( ID '.' )? fun_call )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:329:3: ( ID '.' )? fun_call
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:329:3: ( ID '.' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==35) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:329:4: ID '.'
                    {
                    match(input,ID,FOLLOW_ID_in_self_op1376); 
                    match(input,35,FOLLOW_35_in_self_op1378); 

                    }
                    break;

            }

            pushFollow(FOLLOW_fun_call_in_self_op1382);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:332:1: op_cond : PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a);
    public final strgramParser.op_cond_return op_cond() throws RecognitionException {
        strgramParser.op_cond_return retval = new strgramParser.op_cond_return();
        retval.start = input.LT(1);

        List list_a=null;
        RuleReturnScope a = null;
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:333:3: ( PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE -> args(args=$a))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:334:3: PAR_OPEN (a+= expr ( COMMA a+= expr )* )? PAR_CLOSE
            {
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_op_cond1397); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:334:12: (a+= expr ( COMMA a+= expr )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID||LA21_0==PAR_OPEN||(LA21_0>=INT && LA21_0<=CHAR)||(LA21_0>=33 && LA21_0<=34)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:334:13: a+= expr ( COMMA a+= expr )*
                    {
                    pushFollow(FOLLOW_expr_in_op_cond1402);
                    a=expr();

                    state._fsp--;

                    if (list_a==null) list_a=new ArrayList();
                    list_a.add(a.getTemplate());

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:334:21: ( COMMA a+= expr )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==COMMA) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:334:22: COMMA a+= expr
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_op_cond1405); 
                    	    pushFollow(FOLLOW_expr_in_op_cond1409);
                    	    a=expr();

                    	    state._fsp--;

                    	    if (list_a==null) list_a=new ArrayList();
                    	    list_a.add(a.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_op_cond1415); 


            // TEMPLATE REWRITE
            // 335:3: -> args(args=$a)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:338:1: ops : ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st));
    public final strgramParser.ops_return ops() throws RecognitionException {
        strgramParser.ops_return retval = new strgramParser.ops_return();
        retval.start = input.LT(1);

        strgramParser.id_assign_return id_assign25 = null;

        strgramParser.if_op_return if_op26 = null;

        strgramParser.while_op_return while_op27 = null;

        strgramParser.for_op_return for_op28 = null;

        strgramParser.fun_call_return fun_call29 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:339:3: ( id_assign EOL -> statement(expr=$id_assign.st) | if_op -> {$if_op.st} | while_op -> {$while_op.st} | for_op -> {$for_op.st} | fun_call EOL -> statement(expr=$fun_call.st))
            int alt22=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==EQUAL) ) {
                    alt22=1;
                }
                else if ( (LA22_1==PAR_OPEN) ) {
                    alt22=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt22=2;
                }
                break;
            case 32:
                {
                alt22=3;
                }
                break;
            case 30:
                {
                alt22=4;
                }
                break;
            case 33:
            case 34:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:340:3: id_assign EOL
                    {
                    pushFollow(FOLLOW_id_assign_in_ops1441);
                    id_assign25=id_assign();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1443); 


                    // TEMPLATE REWRITE
                    // 341:5: -> statement(expr=$id_assign.st)
                    {
                        retval.st = templateLib.getInstanceOf("statement",
                      new STAttrMap().put("expr", (id_assign25!=null?id_assign25.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:342:5: if_op
                    {
                    pushFollow(FOLLOW_if_op_in_ops1461);
                    if_op26=if_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 343:5: -> {$if_op.st}
                    {
                        retval.st = (if_op26!=null?if_op26.st:null);
                    }


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:344:5: while_op
                    {
                    pushFollow(FOLLOW_while_op_in_ops1474);
                    while_op27=while_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 345:5: -> {$while_op.st}
                    {
                        retval.st = (while_op27!=null?while_op27.st:null);
                    }


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:346:5: for_op
                    {
                    pushFollow(FOLLOW_for_op_in_ops1487);
                    for_op28=for_op();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 347:5: -> {$for_op.st}
                    {
                        retval.st = (for_op28!=null?for_op28.st:null);
                    }


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:348:5: fun_call EOL
                    {
                    pushFollow(FOLLOW_fun_call_in_ops1500);
                    fun_call29=fun_call();

                    state._fsp--;

                    match(input,EOL,FOLLOW_EOL_in_ops1502); 


                    // TEMPLATE REWRITE
                    // 349:5: -> statement(expr=$fun_call.st)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:352:1: main_fun : MAIN_NAME PAR_OPEN PAR_CLOSE fun_body ;
    public final strgramParser.main_fun_return main_fun() throws RecognitionException {
        strgramParser.main_fun_return retval = new strgramParser.main_fun_return();
        retval.start = input.LT(1);

        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:353:3: ( MAIN_NAME PAR_OPEN PAR_CLOSE fun_body )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:354:3: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
            {
            match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_main_fun1529); 
            match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_main_fun1531); 
            match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_main_fun1533); 
            pushFollow(FOLLOW_fun_body_in_main_fun1535);
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:357:1: fun_decl : ( ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats));
    public final strgramParser.fun_decl_return fun_decl() throws RecognitionException {
        slist_stack.push(new slist_scope());
        fun_decl_stack.push(new fun_decl_scope());
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:366:3: ( ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p) | MAIN_NAME PAR_OPEN PAR_CLOSE fun_body -> main_decl(locals=$slist::localsstats=$slist::stats))
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:367:3: ( type )? a= ID PAR_OPEN (p+= args )? PAR_CLOSE fun_body
                    {
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:367:3: ( type )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=25 && LA23_0<=27)) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:367:3: type
                            {
                            pushFollow(FOLLOW_type_in_fun_decl1564);
                            type30=type();

                            state._fsp--;


                            }
                            break;

                    }

                    a=(Token)match(input,ID,FOLLOW_ID_in_fun_decl1569); 

                         ((fun_decl_scope)fun_decl_stack.peek()).name =(a!=null?a.getText():null);
                         ((program_scope)program_stack.peek()).name = (a!=null?a.getText():null); 
                         methods.add(methods.new Method(((program_scope)program_stack.peek()).name, (type30!=null?type30.idType:null)));
                        
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1580); 
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:373:13: (p+= args )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=25 && LA24_0<=27)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:373:13: p+= args
                            {
                            pushFollow(FOLLOW_args_in_fun_decl1584);
                            p=args();

                            state._fsp--;

                            if (list_p==null) list_p=new ArrayList();
                            list_p.add(p.getTemplate());


                            }
                            break;

                    }

                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1587); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1589);
                    fun_body31=fun_body();

                    state._fsp--;


                         if ((type30!=null?type30.idType:null) != null) {
                         	if ((fun_body31!=null?fun_body31.returnType:null) == null) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null)
                         				+ " missing return statement, expecting " + (type30!=null?type30.idType:null));
                         	} else if (!(type30!=null?type30.idType:null).equals((fun_body31!=null?fun_body31.returnType:null))) {
                         		errors.add("line " + (a!=null?a.getLine():0) + ": method " + (a!=null?a.getText():null)
                         				+ " wrong type conversion cannot convert return type "
                         				+ (fun_body31!=null?fun_body31.returnType:null) + " to " + (type30!=null?type30.idType:null));
                         	}
                         }
                        


                    // TEMPLATE REWRITE
                    // 386:5: -> fun_decl(type=$type.stname=$fun_decl::namelocals=$slist::localsstats=$slist::statsargs=$p)
                    {
                        retval.st = templateLib.getInstanceOf("fun_decl",
                      new STAttrMap().put("type", (type30!=null?type30.st:null)).put("name", ((fun_decl_scope)fun_decl_stack.peek()).name).put("locals", ((slist_scope)slist_stack.peek()).locals).put("stats", ((slist_scope)slist_stack.peek()).stats).put("args", list_p));
                    }


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:388:6: MAIN_NAME PAR_OPEN PAR_CLOSE fun_body
                    {
                    match(input,MAIN_NAME,FOLLOW_MAIN_NAME_in_fun_decl1642); 
                    match(input,PAR_OPEN,FOLLOW_PAR_OPEN_in_fun_decl1644); 
                    match(input,PAR_CLOSE,FOLLOW_PAR_CLOSE_in_fun_decl1646); 
                    pushFollow(FOLLOW_fun_body_in_fun_decl1648);
                    fun_body();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 389:4: -> main_decl(locals=$slist::localsstats=$slist::stats)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:392:1: args : a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text);
    public final strgramParser.args_return args() throws RecognitionException {
        strgramParser.args_return retval = new strgramParser.args_return();
        retval.start = input.LT(1);

        Token b=null;
        strgramParser.type_return a = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:393:3: (a= type b= ID ( COMMA type ID )* -> parameter(type=$a.stname=$b.text))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:394:3: a= type b= ID ( COMMA type ID )*
            {
            pushFollow(FOLLOW_type_in_args1683);
            a=type();

            state._fsp--;

            b=(Token)match(input,ID,FOLLOW_ID_in_args1687); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:394:15: ( COMMA type ID )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==COMMA) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:394:16: COMMA type ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_args1690); 
            	    pushFollow(FOLLOW_type_in_args1692);
            	    type();

            	    state._fsp--;

            	    match(input,ID,FOLLOW_ID_in_args1694); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);



            // TEMPLATE REWRITE
            // 395:3: -> parameter(type=$a.stname=$b.text)
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
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:398:1: fun_body returns [String returnType] : CUR_OPEN ( var )* ( ops )* ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats);
    public final strgramParser.fun_body_return fun_body() throws RecognitionException {
        strgramParser.fun_body_return retval = new strgramParser.fun_body_return();
        retval.start = input.LT(1);

        strgramParser.var_return var32 = null;

        strgramParser.ops_return ops33 = null;

        strgramParser.return_st_return return_st34 = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:399:3: ( CUR_OPEN ( var )* ( ops )* ( return_st )? CUR_CLOSE -> block(locals=$slist::localsstats=$slist::stats))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:3: CUR_OPEN ( var )* ( ops )* ( return_st )? CUR_CLOSE
            {
            match(input,CUR_OPEN,FOLLOW_CUR_OPEN_in_fun_body1730); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:12: ( var )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==LIST||(LA27_0>=25 && LA27_0<=27)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:12: var
            	    {
            	    pushFollow(FOLLOW_var_in_fun_body1732);
            	    var32=var();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:17: ( ops )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID||LA28_0==28||LA28_0==30||(LA28_0>=32 && LA28_0<=34)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:17: ops
            	    {
            	    pushFollow(FOLLOW_ops_in_fun_body1735);
            	    ops33=ops();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:22: ( return_st )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:400:22: return_st
                    {
                    pushFollow(FOLLOW_return_st_in_fun_body1738);
                    return_st34=return_st();

                    state._fsp--;


                    }
                    break;

            }

            match(input,CUR_CLOSE,FOLLOW_CUR_CLOSE_in_fun_body1754); 
            ((slist_scope)slist_stack.peek()).locals.add((var32!=null?var32.st:null));((slist_scope)slist_stack.peek()).stats.add((ops33!=null?ops33.st:null));((slist_scope)slist_stack.peek()).stats.add((return_st34!=null?return_st34.st:null));


            // TEMPLATE REWRITE
            // 415:3: -> block(locals=$slist::localsstats=$slist::stats)
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "return_st"
    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:418:1: return_st : 'return' a= expr EOL -> return_st(ret_val=$a.st);
    public final strgramParser.return_st_return return_st() throws RecognitionException {
        strgramParser.return_st_return retval = new strgramParser.return_st_return();
        retval.start = input.LT(1);

        strgramParser.expr_return a = null;


        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:419:1: ( 'return' a= expr EOL -> return_st(ret_val=$a.st))
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:420:2: 'return' a= expr EOL
            {
            match(input,36,FOLLOW_36_in_return_st1793); 
            pushFollow(FOLLOW_expr_in_return_st1797);
            a=expr();

            state._fsp--;

            match(input,EOL,FOLLOW_EOL_in_return_st1799); 


            // TEMPLATE REWRITE
            // 421:2: -> return_st(ret_val=$a.st)
            {
                retval.st = templateLib.getInstanceOf("return_st",
              new STAttrMap().put("ret_val", (a!=null?a.st:null)));
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


 

    public static final BitSet FOLLOW_fun_decl_in_program72 = new BitSet(new long[]{0x000000000E010092L});
    public static final BitSet FOLLOW_var_in_program102 = new BitSet(new long[]{0x000000000E010092L});
    public static final BitSet FOLLOW_25_in_type154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_type176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_type192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_init223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_id_init243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id_assign278 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_id_assign280 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_expr_in_id_assign284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_var339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var358 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_COMMA_in_var361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_id_init_in_var365 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_LIST_in_var427 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_var431 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_listParams_in_var448 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_var475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_listParams490 = new BitSet(new long[]{0x0000000600007610L});
    public static final BitSet FOLLOW_expr_in_listParams495 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_COMMA_in_listParams498 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_expr_in_listParams502 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_listParams508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_math_exp_in_expr538 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_MATHOPER_in_expr541 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_math_exp_in_expr545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_id_in_math_exp626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_math_exp661 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_expr_in_math_exp663 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_math_exp665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_math_exp685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_data711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_data738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_data764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_data_id793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_data_id824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_if_op862 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_bool_cond_in_if_op864 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fun_body_in_if_op866 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_else_block_in_if_op868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_else_block920 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fun_body_in_else_block922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_for_op954 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_for_op956 = new BitSet(new long[]{0x000000000E001000L});
    public static final BitSet FOLLOW_INT_in_for_op966 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_type_in_for_op998 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op1002 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_for_op1004 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_for_op1008 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_for_op1026 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fun_body_in_for_op1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_while_op1097 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_bool_cond_in_while_op1099 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fun_body_in_while_op1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_bool_cond1138 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1142 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_COMPROPER_in_bool_cond1145 = new BitSet(new long[]{0x0000000000007010L});
    public static final BitSet FOLLOW_data_id_in_bool_cond1149 = new BitSet(new long[]{0x0000000000008400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_bool_cond1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_brack_id1193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_brack_id1195 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_brack_id1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_in_out_op1217 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_op_cond_in_in_out_op1219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_in_out_op1244 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_in_out_op1246 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_in_out_op1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fun_call1286 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_call1288 = new BitSet(new long[]{0x0000000600007610L});
    public static final BitSet FOLLOW_expr_in_fun_call1293 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_COMMA_in_fun_call1296 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_expr_in_fun_call1300 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_call1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_out_op_in_fun_call1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_self_op1376 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_self_op1378 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_fun_call_in_self_op1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAR_OPEN_in_op_cond1397 = new BitSet(new long[]{0x0000000600007610L});
    public static final BitSet FOLLOW_expr_in_op_cond1402 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_COMMA_in_op_cond1405 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_expr_in_op_cond1409 = new BitSet(new long[]{0x0000000000000440L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_op_cond1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_assign_in_ops1441 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_ops1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_op_in_ops1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_op_in_ops1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_for_op_in_ops1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_call_in_ops1500 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_ops1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_main_fun1529 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_main_fun1531 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_main_fun1533 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fun_body_in_main_fun1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_fun_decl1564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_fun_decl1569 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1580 = new BitSet(new long[]{0x000000000E000400L});
    public static final BitSet FOLLOW_args_in_fun_decl1584 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1587 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAIN_NAME_in_fun_decl1642 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_PAR_OPEN_in_fun_decl1644 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_PAR_CLOSE_in_fun_decl1646 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_fun_body_in_fun_decl1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_args1683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1687 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_COMMA_in_args1690 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_type_in_args1692 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_args1694 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_CUR_OPEN_in_fun_body1730 = new BitSet(new long[]{0x000000175E057290L});
    public static final BitSet FOLLOW_var_in_fun_body1732 = new BitSet(new long[]{0x000000175E057290L});
    public static final BitSet FOLLOW_ops_in_fun_body1735 = new BitSet(new long[]{0x0000001750047210L});
    public static final BitSet FOLLOW_return_st_in_fun_body1738 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CUR_CLOSE_in_fun_body1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_return_st1793 = new BitSet(new long[]{0x0000000600007210L});
    public static final BitSet FOLLOW_expr_in_return_st1797 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EOL_in_return_st1799 = new BitSet(new long[]{0x0000000000000002L});

}