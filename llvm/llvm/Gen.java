// $ANTLR 3.2 Sep 23, 2009 12:02:23 Gen.g 2009-11-23 14:20:56

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class Gen extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "FILE", "FUNCDEF", "EXTERNFUNC", "EXTERNVAR", "VARDEF", "ARRAY", "ARGS", "ARG", "EXPR", "ELIST", "INDEX", "CALL", "BLOCK", "ASSIGN", "ID", "STRING", "INT", "LETTER", "WS", "COMMENT", "LINE_COMMENT", "'('", "')'", "';'", "'void'", "'int'", "'['", "']'", "','", "'return'", "'if'", "'else'", "'while'", "'{'", "'}'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int LETTER=21;
    public static final int ID=18;
    public static final int EOF=-1;
    public static final int INDEX=14;
    public static final int EXPR=12;
    public static final int ARG=11;
    public static final int ELIST=13;
    public static final int ARGS=10;
    public static final int VARDEF=8;
    public static final int COMMENT=23;
    public static final int ARRAY=9;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int FUNCDEF=5;
    public static final int T__45=45;
    public static final int LINE_COMMENT=24;
    public static final int T__48=48;
    public static final int INT=20;
    public static final int FILE=4;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=22;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BLOCK=16;
    public static final int ASSIGN=17;
    public static final int EXTERNFUNC=6;
    public static final int CALL=15;
    public static final int STRING=19;
    public static final int EXTERNVAR=7;

    // delegates
    // delegators


        public Gen(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Gen(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("GenTemplates", AngleBracketTemplateLexer.class);

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

    public String[] getTokenNames() { return Gen.tokenNames; }
    public String getGrammarFileName() { return "Gen.g"; }


        SymbolTable symtab;
        Scope currentScope;
        public Gen(TreeNodeStream input, SymbolTable symtab) {
            this(input);
            this.symtab = symtab;
            currentScope = symtab.globals;
        }

        int reg = 1;
        public int getreg() { return reg++; }

        List<CString> strings = new ArrayList<CString>();
        public int getstr(String s) {
        	strings.add(new CString(s));
        	return strings.size();
        }


    public static class translation_unit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "translation_unit"
    // Gen.g:28:1: translation_unit : ^( FILE (d+= external_declaration )+ ) -> file(decls=$dstrings=strings);
    public final Gen.translation_unit_return translation_unit() throws RecognitionException {
        Gen.translation_unit_return retval = new Gen.translation_unit_return();
        retval.start = input.LT(1);

        List list_d=null;
        RuleReturnScope d = null;
        try {
            // Gen.g:29:2: ( ^( FILE (d+= external_declaration )+ ) -> file(decls=$dstrings=strings))
            // Gen.g:29:4: ^( FILE (d+= external_declaration )+ )
            {
            match(input,FILE,FOLLOW_FILE_in_translation_unit52); 

            match(input, Token.DOWN, null); 
            // Gen.g:29:12: (d+= external_declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==FUNCDEF||LA1_0==VARDEF) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Gen.g:29:12: d+= external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit56);
            	    d=external_declaration();

            	    state._fsp--;

            	    if (list_d==null) list_d=new ArrayList();
            	    list_d.add(d.getTemplate());


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


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 30:3: -> file(decls=$dstrings=strings)
            {
                retval.st = templateLib.getInstanceOf("file",
              new STAttrMap().put("decls", list_d).put("strings", strings));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "translation_unit"

    public static class external_declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "external_declaration"
    // Gen.g:33:1: external_declaration : ( function_definition -> {$function_definition.st} | declaration -> {$declaration.st});
    public final Gen.external_declaration_return external_declaration() throws RecognitionException {
        Gen.external_declaration_return retval = new Gen.external_declaration_return();
        retval.start = input.LT(1);

        Gen.function_definition_return function_definition1 = null;

        Gen.declaration_return declaration2 = null;


        try {
            // Gen.g:34:2: ( function_definition -> {$function_definition.st} | declaration -> {$declaration.st})
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FUNCDEF) ) {
                alt2=1;
            }
            else if ( (LA2_0==VARDEF) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Gen.g:34:4: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_external_declaration86);
                    function_definition1=function_definition();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 34:24: -> {$function_definition.st}
                    {
                        retval.st = (function_definition1!=null?function_definition1.st:null);
                    }


                    }
                    break;
                case 2 :
                    // Gen.g:35:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_external_declaration95);
                    declaration2=declaration();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 35:18: -> {$declaration.st}
                    {
                        retval.st = (declaration2!=null?declaration2.st:null);
                    }


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
        return retval;
    }
    // $ANTLR end "external_declaration"

    public static class function_definition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "function_definition"
    // Gen.g:38:1: function_definition : ^( FUNCDEF ID type_specifier ( ^( ARGS (p+= parameter_declaration )+ ) )? compound_statement ) -> def_func(sym=$ID.symbolargs=$pblock=$compound_statement.st);
    public final Gen.function_definition_return function_definition() throws RecognitionException {
        Gen.function_definition_return retval = new Gen.function_definition_return();
        retval.start = input.LT(1);

        CTree ID3=null;
        List list_p=null;
        Gen.compound_statement_return compound_statement4 = null;

        RuleReturnScope p = null;
        try {
            // Gen.g:39:2: ( ^( FUNCDEF ID type_specifier ( ^( ARGS (p+= parameter_declaration )+ ) )? compound_statement ) -> def_func(sym=$ID.symbolargs=$pblock=$compound_statement.st))
            // Gen.g:39:4: ^( FUNCDEF ID type_specifier ( ^( ARGS (p+= parameter_declaration )+ ) )? compound_statement )
            {
            match(input,FUNCDEF,FOLLOW_FUNCDEF_in_function_definition116); 

            match(input, Token.DOWN, null); 
            ID3=(CTree)match(input,ID,FOLLOW_ID_in_function_definition118); 
            pushFollow(FOLLOW_type_specifier_in_function_definition120);
            type_specifier();

            state._fsp--;

            // Gen.g:40:4: ( ^( ARGS (p+= parameter_declaration )+ ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ARGS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Gen.g:40:5: ^( ARGS (p+= parameter_declaration )+ )
                    {
                    match(input,ARGS,FOLLOW_ARGS_in_function_definition128); 

                    match(input, Token.DOWN, null); 
                    // Gen.g:40:13: (p+= parameter_declaration )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==ARG) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Gen.g:40:13: p+= parameter_declaration
                    	    {
                    	    pushFollow(FOLLOW_parameter_declaration_in_function_definition132);
                    	    p=parameter_declaration();

                    	    state._fsp--;

                    	    if (list_p==null) list_p=new ArrayList();
                    	    list_p.add(p.getTemplate());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    match(input, Token.UP, null); 

                    }
                    break;

            }

            pushFollow(FOLLOW_compound_statement_in_function_definition143);
            compound_statement4=compound_statement();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 43:4: -> def_func(sym=$ID.symbolargs=$pblock=$compound_statement.st)
            {
                retval.st = templateLib.getInstanceOf("def_func",
              new STAttrMap().put("sym", ID3.symbol).put("args", list_p).put("block", (compound_statement4!=null?compound_statement4.st:null)));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_definition"

    public static class declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "declaration"
    // Gen.g:47:1: declaration : ( ^( VARDEF ID ^( ARRAY type_specifier expression ) ) -> {$ID.symbol.scope instanceof GlobalScope}? def_globalarray(id=$ID.texttype=$type_specifier.textsize=$expression.text) -> def_array(reg=getreg()id=$ID.texttype=$type_specifier.textsize=$expression.st) | ^( VARDEF ID type_specifier ) -> def_var(id=$ID.texttype=$type_specifier.text));
    public final Gen.declaration_return declaration() throws RecognitionException {
        Gen.declaration_return retval = new Gen.declaration_return();
        retval.start = input.LT(1);

        CTree ID5=null;
        CTree ID8=null;
        Gen.type_specifier_return type_specifier6 = null;

        Gen.expression_return expression7 = null;

        Gen.type_specifier_return type_specifier9 = null;


        try {
            // Gen.g:49:2: ( ^( VARDEF ID ^( ARRAY type_specifier expression ) ) -> {$ID.symbol.scope instanceof GlobalScope}? def_globalarray(id=$ID.texttype=$type_specifier.textsize=$expression.text) -> def_array(reg=getreg()id=$ID.texttype=$type_specifier.textsize=$expression.st) | ^( VARDEF ID type_specifier ) -> def_var(id=$ID.texttype=$type_specifier.text))
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==VARDEF) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==DOWN) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==ID) ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3==ARRAY) ) {
                            alt5=1;
                        }
                        else if ( ((LA5_3>=28 && LA5_3<=29)) ) {
                            alt5=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Gen.g:49:4: ^( VARDEF ID ^( ARRAY type_specifier expression ) )
                    {
                    match(input,VARDEF,FOLLOW_VARDEF_in_declaration195); 

                    match(input, Token.DOWN, null); 
                    ID5=(CTree)match(input,ID,FOLLOW_ID_in_declaration197); 
                    match(input,ARRAY,FOLLOW_ARRAY_in_declaration200); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_specifier_in_declaration202);
                    type_specifier6=type_specifier();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_declaration204);
                    expression7=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 50:3: -> {$ID.symbol.scope instanceof GlobalScope}? def_globalarray(id=$ID.texttype=$type_specifier.textsize=$expression.text)
                    if (ID5.symbol.scope instanceof GlobalScope) {
                        retval.st = templateLib.getInstanceOf("def_globalarray",
                      new STAttrMap().put("id", (ID5!=null?ID5.getText():null)).put("type", (type_specifier6!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(type_specifier6.start),
                      input.getTreeAdaptor().getTokenStopIndex(type_specifier6.start))):null)).put("size", (expression7!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(expression7.start),
                      input.getTreeAdaptor().getTokenStopIndex(expression7.start))):null)));
                    }
                    else // 53:3: -> def_array(reg=getreg()id=$ID.texttype=$type_specifier.textsize=$expression.st)
                    {
                        retval.st = templateLib.getInstanceOf("def_array",
                      new STAttrMap().put("reg", getreg()).put("id", (ID5!=null?ID5.getText():null)).put("type", (type_specifier6!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(type_specifier6.start),
                      input.getTreeAdaptor().getTokenStopIndex(type_specifier6.start))):null)).put("size", (expression7!=null?expression7.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // Gen.g:55:4: ^( VARDEF ID type_specifier )
                    {
                    match(input,VARDEF,FOLLOW_VARDEF_in_declaration284); 

                    match(input, Token.DOWN, null); 
                    ID8=(CTree)match(input,ID,FOLLOW_ID_in_declaration286); 
                    pushFollow(FOLLOW_type_specifier_in_declaration288);
                    type_specifier9=type_specifier();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 56:3: -> def_var(id=$ID.texttype=$type_specifier.text)
                    {
                        retval.st = templateLib.getInstanceOf("def_var",
                      new STAttrMap().put("id", (ID8!=null?ID8.getText():null)).put("type", (type_specifier9!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(type_specifier9.start),
                      input.getTreeAdaptor().getTokenStopIndex(type_specifier9.start))):null)));
                    }


                    }
                    break;

            }
            retval.st.setAttribute("descr", input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(retval.start),
              input.getTreeAdaptor().getTokenStopIndex(retval.start)));
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class type_tree_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type_tree"
    // Gen.g:59:1: type_tree : ( ^( ARRAY type_tree expression ) | type_specifier );
    public final Gen.type_tree_return type_tree() throws RecognitionException {
        Gen.type_tree_return retval = new Gen.type_tree_return();
        retval.start = input.LT(1);

        try {
            // Gen.g:60:2: ( ^( ARRAY type_tree expression ) | type_specifier )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ARRAY) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=28 && LA6_0<=29)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // Gen.g:60:4: ^( ARRAY type_tree expression )
                    {
                    match(input,ARRAY,FOLLOW_ARRAY_in_type_tree317); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_tree_in_type_tree319);
                    type_tree();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_type_tree321);
                    expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    }
                    break;
                case 2 :
                    // Gen.g:61:4: type_specifier
                    {
                    pushFollow(FOLLOW_type_specifier_in_type_tree327);
                    type_specifier();

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
        return retval;
    }
    // $ANTLR end "type_tree"

    public static class type_specifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type_specifier"
    // Gen.g:64:1: type_specifier : ( 'void' | 'int' );
    public final Gen.type_specifier_return type_specifier() throws RecognitionException {
        Gen.type_specifier_return retval = new Gen.type_specifier_return();
        retval.start = input.LT(1);

        try {
            // Gen.g:65:2: ( 'void' | 'int' )
            // Gen.g:
            {
            if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_specifier"

    public static class parameter_declaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parameter_declaration"
    // Gen.g:69:1: parameter_declaration : ( ^( ARG ID ^( ARRAY type_specifier expression ) ) -> def_array(reg=getreg()id=$ID.texttype=$type_specifier.textsize=$expression.st) | ^( ARG ID type_specifier ) -> def_arg(id=$ID.texttype=$type_specifier.text));
    public final Gen.parameter_declaration_return parameter_declaration() throws RecognitionException {
        Gen.parameter_declaration_return retval = new Gen.parameter_declaration_return();
        retval.start = input.LT(1);

        CTree ID10=null;
        CTree ID13=null;
        Gen.type_specifier_return type_specifier11 = null;

        Gen.expression_return expression12 = null;

        Gen.type_specifier_return type_specifier14 = null;


        try {
            // Gen.g:71:2: ( ^( ARG ID ^( ARRAY type_specifier expression ) ) -> def_array(reg=getreg()id=$ID.texttype=$type_specifier.textsize=$expression.st) | ^( ARG ID type_specifier ) -> def_arg(id=$ID.texttype=$type_specifier.text))
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ARG) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==DOWN) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==ID) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==ARRAY) ) {
                            alt7=1;
                        }
                        else if ( ((LA7_3>=28 && LA7_3<=29)) ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // Gen.g:71:4: ^( ARG ID ^( ARRAY type_specifier expression ) )
                    {
                    match(input,ARG,FOLLOW_ARG_in_parameter_declaration357); 

                    match(input, Token.DOWN, null); 
                    ID10=(CTree)match(input,ID,FOLLOW_ID_in_parameter_declaration359); 
                    match(input,ARRAY,FOLLOW_ARRAY_in_parameter_declaration362); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_type_specifier_in_parameter_declaration364);
                    type_specifier11=type_specifier();

                    state._fsp--;

                    pushFollow(FOLLOW_expression_in_parameter_declaration366);
                    expression12=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 

                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 72:3: -> def_array(reg=getreg()id=$ID.texttype=$type_specifier.textsize=$expression.st)
                    {
                        retval.st = templateLib.getInstanceOf("def_array",
                      new STAttrMap().put("reg", getreg()).put("id", (ID10!=null?ID10.getText():null)).put("type", (type_specifier11!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(type_specifier11.start),
                      input.getTreeAdaptor().getTokenStopIndex(type_specifier11.start))):null)).put("size", (expression12!=null?expression12.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // Gen.g:74:4: ^( ARG ID type_specifier )
                    {
                    match(input,ARG,FOLLOW_ARG_in_parameter_declaration409); 

                    match(input, Token.DOWN, null); 
                    ID13=(CTree)match(input,ID,FOLLOW_ID_in_parameter_declaration411); 
                    pushFollow(FOLLOW_type_specifier_in_parameter_declaration413);
                    type_specifier14=type_specifier();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 75:3: -> def_arg(id=$ID.texttype=$type_specifier.text)
                    {
                        retval.st = templateLib.getInstanceOf("def_arg",
                      new STAttrMap().put("id", (ID13!=null?ID13.getText():null)).put("type", (type_specifier14!=null?(input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(type_specifier14.start),
                      input.getTreeAdaptor().getTokenStopIndex(type_specifier14.start))):null)));
                    }


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
        return retval;
    }
    // $ANTLR end "parameter_declaration"

    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // Gen.g:78:1: statement : ( compound_statement | ^( '=' ID expression ) -> assign(id=$ID.textrhs=$expression.st) | ^( '=' ^( INDEX ID expr ) expression ) -> assign_array(sym=$ID.symbolindex=$expr.strhs=$expression.sttmp1=getreg()tmp2=getreg()) | call -> {$call.st} | ^( 'return' expression ) -> return(v=$expression.st) | ^( 'if' expression s1= statement (s2= statement )? ) -> if(cond=$expression.ststat1=$s1.ststat2=$s2.sttmp=getreg()) | ^( 'while' expression s= statement ) -> while(cond=$expression.ststat=$s.sttmp=getreg()));
    public final Gen.statement_return statement() throws RecognitionException {
        Gen.statement_return retval = new Gen.statement_return();
        retval.start = input.LT(1);

        CTree ID15=null;
        CTree ID17=null;
        Gen.statement_return s1 = null;

        Gen.statement_return s2 = null;

        Gen.statement_return s = null;

        Gen.expression_return expression16 = null;

        Gen.expr_return expr18 = null;

        Gen.expression_return expression19 = null;

        Gen.call_return call20 = null;

        Gen.expression_return expression21 = null;

        Gen.expression_return expression22 = null;

        Gen.expression_return expression23 = null;


        try {
            // Gen.g:80:2: ( compound_statement | ^( '=' ID expression ) -> assign(id=$ID.textrhs=$expression.st) | ^( '=' ^( INDEX ID expr ) expression ) -> assign_array(sym=$ID.symbolindex=$expr.strhs=$expression.sttmp1=getreg()tmp2=getreg()) | call -> {$call.st} | ^( 'return' expression ) -> return(v=$expression.st) | ^( 'if' expression s1= statement (s2= statement )? ) -> if(cond=$expression.ststat1=$s1.ststat2=$s2.sttmp=getreg()) | ^( 'while' expression s= statement ) -> while(cond=$expression.ststat=$s.sttmp=getreg()))
            int alt9=7;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // Gen.g:80:4: compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_statement446);
                    compound_statement();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // Gen.g:81:4: ^( '=' ID expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement452); 

                    match(input, Token.DOWN, null); 
                    ID15=(CTree)match(input,ID,FOLLOW_ID_in_statement454); 
                    pushFollow(FOLLOW_expression_in_statement456);
                    expression16=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 81:25: -> assign(id=$ID.textrhs=$expression.st)
                    {
                        retval.st = templateLib.getInstanceOf("assign",
                      new STAttrMap().put("id", (ID15!=null?ID15.getText():null)).put("rhs", (expression16!=null?expression16.st:null)));
                    }


                    }
                    break;
                case 3 :
                    // Gen.g:82:4: ^( '=' ^( INDEX ID expr ) expression )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_statement477); 

                    match(input, Token.DOWN, null); 
                    match(input,INDEX,FOLLOW_INDEX_in_statement480); 

                    match(input, Token.DOWN, null); 
                    ID17=(CTree)match(input,ID,FOLLOW_ID_in_statement482); 
                    pushFollow(FOLLOW_expr_in_statement484);
                    expr18=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 
                    pushFollow(FOLLOW_expression_in_statement487);
                    expression19=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 83:3: -> assign_array(sym=$ID.symbolindex=$expr.strhs=$expression.sttmp1=getreg()tmp2=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("assign_array",
                      new STAttrMap().put("sym", ID17.symbol).put("index", (expr18!=null?expr18.st:null)).put("rhs", (expression19!=null?expression19.st:null)).put("tmp1", getreg()).put("tmp2", getreg()));
                    }


                    }
                    break;
                case 4 :
                    // Gen.g:85:4: call
                    {
                    pushFollow(FOLLOW_call_in_statement533);
                    call20=call();

                    state._fsp--;



                    // TEMPLATE REWRITE
                    // 85:9: -> {$call.st}
                    {
                        retval.st = (call20!=null?call20.st:null);
                    }


                    }
                    break;
                case 5 :
                    // Gen.g:86:4: ^( 'return' expression )
                    {
                    match(input,33,FOLLOW_33_in_statement543); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement545);
                    expression21=expression();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 86:27: -> return(v=$expression.st)
                    {
                        retval.st = templateLib.getInstanceOf("return",
                      new STAttrMap().put("v", (expression21!=null?expression21.st:null)));
                    }


                    }
                    break;
                case 6 :
                    // Gen.g:87:4: ^( 'if' expression s1= statement (s2= statement )? )
                    {
                    match(input,34,FOLLOW_34_in_statement561); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement563);
                    expression22=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement567);
                    s1=statement();

                    state._fsp--;

                    // Gen.g:87:37: (s2= statement )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=CALL && LA8_0<=ASSIGN)||(LA8_0>=33 && LA8_0<=34)||LA8_0==36) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Gen.g:87:37: s2= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement571);
                            s2=statement();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 88:3: -> if(cond=$expression.ststat1=$s1.ststat2=$s2.sttmp=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("if",
                      new STAttrMap().put("cond", (expression22!=null?expression22.st:null)).put("stat1", (s1!=null?s1.st:null)).put("stat2", (s2!=null?s2.st:null)).put("tmp", getreg()));
                    }


                    }
                    break;
                case 7 :
                    // Gen.g:89:4: ^( 'while' expression s= statement )
                    {
                    match(input,36,FOLLOW_36_in_statement605); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expression_in_statement607);
                    expression23=expression();

                    state._fsp--;

                    pushFollow(FOLLOW_statement_in_statement611);
                    s=statement();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 90:3: -> while(cond=$expression.ststat=$s.sttmp=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("while",
                      new STAttrMap().put("cond", (expression23!=null?expression23.st:null)).put("stat", (s!=null?s.st:null)).put("tmp", getreg()));
                    }


                    }
                    break;

            }
            retval.st.setAttribute("descr", input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(retval.start),
              input.getTreeAdaptor().getTokenStopIndex(retval.start)).replaceAll("\\n"," "));
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class compound_statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "compound_statement"
    // Gen.g:93:1: compound_statement : ^( BLOCK (d+= declaration )* (s+= statement )* ) -> block(decls=$dstats=$s);
    public final Gen.compound_statement_return compound_statement() throws RecognitionException {
        Gen.compound_statement_return retval = new Gen.compound_statement_return();
        retval.start = input.LT(1);

        List list_d=null;
        List list_s=null;
        RuleReturnScope d = null;
        RuleReturnScope s = null;
        try {
            // Gen.g:94:2: ( ^( BLOCK (d+= declaration )* (s+= statement )* ) -> block(decls=$dstats=$s))
            // Gen.g:94:4: ^( BLOCK (d+= declaration )* (s+= statement )* )
            {
            match(input,BLOCK,FOLLOW_BLOCK_in_compound_statement645); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // Gen.g:94:13: (d+= declaration )*
                loop10:
                do {
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==VARDEF) ) {
                        alt10=1;
                    }


                    switch (alt10) {
                	case 1 :
                	    // Gen.g:94:13: d+= declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_compound_statement649);
                	    d=declaration();

                	    state._fsp--;

                	    if (list_d==null) list_d=new ArrayList();
                	    list_d.add(d.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop10;
                    }
                } while (true);

                // Gen.g:94:29: (s+= statement )*
                loop11:
                do {
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=CALL && LA11_0<=ASSIGN)||(LA11_0>=33 && LA11_0<=34)||LA11_0==36) ) {
                        alt11=1;
                    }


                    switch (alt11) {
                	case 1 :
                	    // Gen.g:94:29: s+= statement
                	    {
                	    pushFollow(FOLLOW_statement_in_compound_statement654);
                	    s=statement();

                	    state._fsp--;

                	    if (list_s==null) list_s=new ArrayList();
                	    list_s.add(s.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop11;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 94:43: -> block(decls=$dstats=$s)
            {
                retval.st = templateLib.getInstanceOf("block",
              new STAttrMap().put("decls", list_d).put("stats", list_s));
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_statement"

    public static class expression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // Gen.g:97:1: expression : ^( EXPR expr ) -> {$expr.st};
    public final Gen.expression_return expression() throws RecognitionException {
        Gen.expression_return retval = new Gen.expression_return();
        retval.start = input.LT(1);

        Gen.expr_return expr24 = null;


        try {
            // Gen.g:98:2: ( ^( EXPR expr ) -> {$expr.st})
            // Gen.g:98:4: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression682); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expr_in_expression684);
            expr24=expr();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 98:17: -> {$expr.st}
            {
                retval.st = (expr24!=null?expr24.st:null);
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends TreeRuleReturnScope {
        public Type type;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // Gen.g:103:1: expr returns [Type type] : ( ^( ( '==' | '!=' | '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=' ) a= expr b= expr ) -> bop(reg=getreg()op=$start.tokena=$a.stb=$b.st) | ^( INDEX ID i= expr ) -> index(reg=getreg()sym=$ID.symboltype=$a.typeindex=$i.sttmp1=getreg()tmp2=getreg()) | call -> {$call.st} | primary_expression -> {$primary_expression.st});
    public final Gen.expr_return expr() throws RecognitionException {
        Gen.expr_return retval = new Gen.expr_return();
        retval.start = input.LT(1);

        CTree ID25=null;
        Gen.expr_return a = null;

        Gen.expr_return b = null;

        Gen.expr_return i = null;

        Gen.call_return call26 = null;

        Gen.primary_expression_return primary_expression27 = null;


        try {
            // Gen.g:107:2: ( ^( ( '==' | '!=' | '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=' ) a= expr b= expr ) -> bop(reg=getreg()op=$start.tokena=$a.stb=$b.st) | ^( INDEX ID i= expr ) -> index(reg=getreg()sym=$ID.symboltype=$a.typeindex=$i.sttmp1=getreg()tmp2=getreg()) | call -> {$call.st} | primary_expression -> {$primary_expression.st})
            int alt13=4;
            switch ( input.LA(1) ) {
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt13=1;
                }
                break;
            case INDEX:
                {
                alt13=2;
                }
                break;
            case CALL:
                {
                alt13=3;
                }
                break;
            case ID:
            case STRING:
            case INT:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // Gen.g:107:4: ^( ( '==' | '!=' | '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=' ) a= expr b= expr )
                    {
                    // Gen.g:107:6: ( '==' | '!=' | '+' | '-' | '*' | '/' | '<' | '>' | '<=' | '>=' )
                    int alt12=10;
                    switch ( input.LA(1) ) {
                    case 39:
                        {
                        alt12=1;
                        }
                        break;
                    case 40:
                        {
                        alt12=2;
                        }
                        break;
                    case 45:
                        {
                        alt12=3;
                        }
                        break;
                    case 46:
                        {
                        alt12=4;
                        }
                        break;
                    case 47:
                        {
                        alt12=5;
                        }
                        break;
                    case 48:
                        {
                        alt12=6;
                        }
                        break;
                    case 41:
                        {
                        alt12=7;
                        }
                        break;
                    case 42:
                        {
                        alt12=8;
                        }
                        break;
                    case 43:
                        {
                        alt12=9;
                        }
                        break;
                    case 44:
                        {
                        alt12=10;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;
                    }

                    switch (alt12) {
                        case 1 :
                            // Gen.g:107:7: '=='
                            {
                            match(input,39,FOLLOW_39_in_expr714); 

                            }
                            break;
                        case 2 :
                            // Gen.g:107:12: '!='
                            {
                            match(input,40,FOLLOW_40_in_expr716); 

                            }
                            break;
                        case 3 :
                            // Gen.g:107:17: '+'
                            {
                            match(input,45,FOLLOW_45_in_expr718); 

                            }
                            break;
                        case 4 :
                            // Gen.g:107:21: '-'
                            {
                            match(input,46,FOLLOW_46_in_expr720); 

                            }
                            break;
                        case 5 :
                            // Gen.g:107:25: '*'
                            {
                            match(input,47,FOLLOW_47_in_expr722); 

                            }
                            break;
                        case 6 :
                            // Gen.g:107:29: '/'
                            {
                            match(input,48,FOLLOW_48_in_expr724); 

                            }
                            break;
                        case 7 :
                            // Gen.g:107:33: '<'
                            {
                            match(input,41,FOLLOW_41_in_expr726); 

                            }
                            break;
                        case 8 :
                            // Gen.g:107:37: '>'
                            {
                            match(input,42,FOLLOW_42_in_expr728); 

                            }
                            break;
                        case 9 :
                            // Gen.g:107:41: '<='
                            {
                            match(input,43,FOLLOW_43_in_expr730); 

                            }
                            break;
                        case 10 :
                            // Gen.g:107:46: '>='
                            {
                            match(input,44,FOLLOW_44_in_expr732); 

                            }
                            break;

                    }


                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr737);
                    a=expr();

                    state._fsp--;

                    pushFollow(FOLLOW_expr_in_expr741);
                    b=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 108:3: -> bop(reg=getreg()op=$start.tokena=$a.stb=$b.st)
                    {
                        retval.st = templateLib.getInstanceOf("bop",
                      new STAttrMap().put("reg", getreg()).put("op", ((CTree)retval.start).token).put("a", (a!=null?a.st:null)).put("b", (b!=null?b.st:null)));
                    }


                    }
                    break;
                case 2 :
                    // Gen.g:109:4: ^( INDEX ID i= expr )
                    {
                    match(input,INDEX,FOLLOW_INDEX_in_expr774); 

                    match(input, Token.DOWN, null); 
                    ID25=(CTree)match(input,ID,FOLLOW_ID_in_expr776); 
                    pushFollow(FOLLOW_expr_in_expr780);
                    i=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 110:10: -> index(reg=getreg()sym=$ID.symboltype=$a.typeindex=$i.sttmp1=getreg()tmp2=getreg())
                    {
                        retval.st = templateLib.getInstanceOf("index",
                      new STAttrMap().put("reg", getreg()).put("sym", ID25.symbol).put("type", (a!=null?a.type:null)).put("index", (i!=null?i.st:null)).put("tmp1", getreg()).put("tmp2", getreg()));
                    }


                    }
                    break;
                case 3 :
                    // Gen.g:113:4: call
                    {
                    pushFollow(FOLLOW_call_in_expr853);
                    call26=call();

                    state._fsp--;

                    (call26!=null?call26.st:null).setAttribute("descr", input.getTokenStream().toString(
                      input.getTreeAdaptor().getTokenStartIndex(retval.start),
                      input.getTreeAdaptor().getTokenStopIndex(retval.start)));


                    // TEMPLATE REWRITE
                    // 113:50: -> {$call.st}
                    {
                        retval.st = (call26!=null?call26.st:null);
                    }


                    }
                    break;
                case 4 :
                    // Gen.g:114:4: primary_expression
                    {
                    pushFollow(FOLLOW_primary_expression_in_expr864);
                    primary_expression27=primary_expression();

                    state._fsp--;

                    retval.type =(primary_expression27!=null?primary_expression27.type:null);


                    // TEMPLATE REWRITE
                    // 115:10: -> {$primary_expression.st}
                    {
                        retval.st = (primary_expression27!=null?primary_expression27.st:null);
                    }


                    }
                    break;

            }

            //System.out.println("expr: "+retval.st);

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

    public static class call_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "call"
    // Gen.g:118:1: call : ({...}? ^( CALL ID ( ^( ELIST primary_expression (e+= expr )* ) )? ) -> printf(format=$primary_expression.stargs=$e) | ^( CALL ID ( ^( ELIST (e+= expr )+ ) )? ) -> call(reg=getreg()sym=$ID.symbolargs=$e));
    public final Gen.call_return call() throws RecognitionException {
        Gen.call_return retval = new Gen.call_return();
        retval.start = input.LT(1);

        CTree ID29=null;
        List list_e=null;
        Gen.primary_expression_return primary_expression28 = null;

        RuleReturnScope e = null;
        try {
            // Gen.g:119:2: ({...}? ^( CALL ID ( ^( ELIST primary_expression (e+= expr )* ) )? ) -> printf(format=$primary_expression.stargs=$e) | ^( CALL ID ( ^( ELIST (e+= expr )+ ) )? ) -> call(reg=getreg()sym=$ID.symbolargs=$e))
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==CALL) ) {
                int LA18_1 = input.LA(2);

                if ( ((((CTree)input.LT(3)).getText().equals("printf"))) ) {
                    alt18=1;
                }
                else if ( (true) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // Gen.g:119:4: {...}? ^( CALL ID ( ^( ELIST primary_expression (e+= expr )* ) )? )
                    {
                    if ( !((((CTree)input.LT(3)).getText().equals("printf"))) ) {
                        throw new FailedPredicateException(input, "call", "((CTree)input.LT(3)).getText().equals(\"printf\")");
                    }
                    match(input,CALL,FOLLOW_CALL_in_call897); 

                    match(input, Token.DOWN, null); 
                    match(input,ID,FOLLOW_ID_in_call899); 
                    // Gen.g:120:14: ( ^( ELIST primary_expression (e+= expr )* ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==ELIST) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // Gen.g:120:16: ^( ELIST primary_expression (e+= expr )* )
                            {
                            match(input,ELIST,FOLLOW_ELIST_in_call905); 

                            match(input, Token.DOWN, null); 
                            pushFollow(FOLLOW_primary_expression_in_call907);
                            primary_expression28=primary_expression();

                            state._fsp--;

                            // Gen.g:120:44: (e+= expr )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>=INDEX && LA14_0<=CALL)||(LA14_0>=ID && LA14_0<=INT)||(LA14_0>=39 && LA14_0<=48)) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // Gen.g:120:44: e+= expr
                            	    {
                            	    pushFollow(FOLLOW_expr_in_call911);
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


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 121:3: -> printf(format=$primary_expression.stargs=$e)
                    {
                        retval.st = templateLib.getInstanceOf("printf",
                      new STAttrMap().put("format", (primary_expression28!=null?primary_expression28.st:null)).put("args", list_e));
                    }


                    }
                    break;
                case 2 :
                    // Gen.g:122:4: ^( CALL ID ( ^( ELIST (e+= expr )+ ) )? )
                    {
                    match(input,CALL,FOLLOW_CALL_in_call939); 

                    match(input, Token.DOWN, null); 
                    ID29=(CTree)match(input,ID,FOLLOW_ID_in_call941); 
                    // Gen.g:122:14: ( ^( ELIST (e+= expr )+ ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==ELIST) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // Gen.g:122:16: ^( ELIST (e+= expr )+ )
                            {
                            match(input,ELIST,FOLLOW_ELIST_in_call946); 

                            match(input, Token.DOWN, null); 
                            // Gen.g:122:25: (e+= expr )+
                            int cnt16=0;
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( ((LA16_0>=INDEX && LA16_0<=CALL)||(LA16_0>=ID && LA16_0<=INT)||(LA16_0>=39 && LA16_0<=48)) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // Gen.g:122:25: e+= expr
                            	    {
                            	    pushFollow(FOLLOW_expr_in_call950);
                            	    e=expr();

                            	    state._fsp--;

                            	    if (list_e==null) list_e=new ArrayList();
                            	    list_e.add(e.getTemplate());


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt16 >= 1 ) break loop16;
                                        EarlyExitException eee =
                                            new EarlyExitException(16, input);
                                        throw eee;
                                }
                                cnt16++;
                            } while (true);


                            match(input, Token.UP, null); 

                            }
                            break;

                    }


                    match(input, Token.UP, null); 


                    // TEMPLATE REWRITE
                    // 123:3: -> call(reg=getreg()sym=$ID.symbolargs=$e)
                    {
                        retval.st = templateLib.getInstanceOf("call",
                      new STAttrMap().put("reg", getreg()).put("sym", ID29.symbol).put("args", list_e));
                    }


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
        return retval;
    }
    // $ANTLR end "call"

    public static class primary_expression_return extends TreeRuleReturnScope {
        public Type type;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primary_expression"
    // Gen.g:126:1: primary_expression returns [Type type] : ( ID -> load_var(reg=getreg()id=$ID) | STRING -> string(reg=getreg()s=new CString($STRING.text)sreg=getstr($STRING.text)) | INT -> int(reg=getreg()v=$INT.text));
    public final Gen.primary_expression_return primary_expression() throws RecognitionException {
        Gen.primary_expression_return retval = new Gen.primary_expression_return();
        retval.start = input.LT(1);

        CTree ID30=null;
        CTree STRING31=null;
        CTree INT32=null;

        try {
            // Gen.g:127:2: ( ID -> load_var(reg=getreg()id=$ID) | STRING -> string(reg=getreg()s=new CString($STRING.text)sreg=getstr($STRING.text)) | INT -> int(reg=getreg()v=$INT.text))
            int alt19=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt19=1;
                }
                break;
            case STRING:
                {
                alt19=2;
                }
                break;
            case INT:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // Gen.g:127:4: ID
                    {
                    ID30=(CTree)match(input,ID,FOLLOW_ID_in_primary_expression992); 
                    retval.type = ID30.symbol.type;


                    // TEMPLATE REWRITE
                    // 128:5: -> load_var(reg=getreg()id=$ID)
                    {
                        retval.st = templateLib.getInstanceOf("load_var",
                      new STAttrMap().put("reg", getreg()).put("id", ID30));
                    }


                    }
                    break;
                case 2 :
                    // Gen.g:129:4: STRING
                    {
                    STRING31=(CTree)match(input,STRING,FOLLOW_STRING_in_primary_expression1017); 


                    // TEMPLATE REWRITE
                    // 129:12: -> string(reg=getreg()s=new CString($STRING.text)sreg=getstr($STRING.text))
                    {
                        retval.st = templateLib.getInstanceOf("string",
                      new STAttrMap().put("reg", getreg()).put("s", new CString((STRING31!=null?STRING31.getText():null))).put("sreg", getstr((STRING31!=null?STRING31.getText():null))));
                    }


                    }
                    break;
                case 3 :
                    // Gen.g:131:4: INT
                    {
                    INT32=(CTree)match(input,INT,FOLLOW_INT_in_primary_expression1050); 
                    retval.type = (Type)symtab.globals.resolve("int");


                    // TEMPLATE REWRITE
                    // 132:5: -> int(reg=getreg()v=$INT.text)
                    {
                        retval.st = templateLib.getInstanceOf("int",
                      new STAttrMap().put("reg", getreg()).put("v", (INT32!=null?INT32.getText():null)));
                    }


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
        return retval;
    }
    // $ANTLR end "primary_expression"

    // Delegated rules


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\12\uffff";
    static final String DFA9_minS =
        "\1\17\1\uffff\1\2\4\uffff\1\16\2\uffff";
    static final String DFA9_maxS =
        "\1\44\1\uffff\1\2\4\uffff\1\22\2\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\2\1\3";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\3\1\1\1\2\17\uffff\1\4\1\5\1\uffff\1\6",
            "",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\11\3\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "78:1: statement : ( compound_statement | ^( '=' ID expression ) -> assign(id=$ID.textrhs=$expression.st) | ^( '=' ^( INDEX ID expr ) expression ) -> assign_array(sym=$ID.symbolindex=$expr.strhs=$expression.sttmp1=getreg()tmp2=getreg()) | call -> {$call.st} | ^( 'return' expression ) -> return(v=$expression.st) | ^( 'if' expression s1= statement (s2= statement )? ) -> if(cond=$expression.ststat1=$s1.ststat2=$s2.sttmp=getreg()) | ^( 'while' expression s= statement ) -> while(cond=$expression.ststat=$s.sttmp=getreg()));";
        }
    }
 

    public static final BitSet FOLLOW_FILE_in_translation_unit52 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_external_declaration_in_translation_unit56 = new BitSet(new long[]{0x0000000000000128L});
    public static final BitSet FOLLOW_function_definition_in_external_declaration86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_external_declaration95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCDEF_in_function_definition116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_function_definition118 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_type_specifier_in_function_definition120 = new BitSet(new long[]{0x0000000000010400L});
    public static final BitSet FOLLOW_ARGS_in_function_definition128 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_declaration_in_function_definition132 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARDEF_in_declaration195 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaration197 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARRAY_in_declaration200 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_declaration202 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_declaration204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARDEF_in_declaration284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaration286 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_type_specifier_in_declaration288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_in_type_tree317 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_tree_in_type_tree319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_type_tree321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_specifier_in_type_tree327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_specifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARG_in_parameter_declaration357 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration359 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ARRAY_in_parameter_declaration362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_specifier_in_parameter_declaration364 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_parameter_declaration366 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARG_in_parameter_declaration409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_parameter_declaration411 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_type_specifier_in_parameter_declaration413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_compound_statement_in_statement446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_statement452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_statement454 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_expression_in_statement456 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_statement477 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INDEX_in_statement480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_statement482 = new BitSet(new long[]{0x0001FF80001CC000L});
    public static final BitSet FOLLOW_expr_in_statement484 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement487 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_call_in_statement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement543 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement545 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_34_in_statement561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement563 = new BitSet(new long[]{0x0000001600038400L});
    public static final BitSet FOLLOW_statement_in_statement567 = new BitSet(new long[]{0x0000001600038408L});
    public static final BitSet FOLLOW_statement_in_statement571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_36_in_statement605 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement607 = new BitSet(new long[]{0x0000001600038400L});
    public static final BitSet FOLLOW_statement_in_statement611 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_compound_statement645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_compound_statement649 = new BitSet(new long[]{0x0000001600038528L});
    public static final BitSet FOLLOW_statement_in_compound_statement654 = new BitSet(new long[]{0x0000001600038408L});
    public static final BitSet FOLLOW_EXPR_in_expression682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression684 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_39_in_expr714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_40_in_expr716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_45_in_expr718 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_46_in_expr720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_47_in_expr722 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_48_in_expr724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_41_in_expr726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_42_in_expr728 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_43_in_expr730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_44_in_expr732 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr737 = new BitSet(new long[]{0x0001FF80001CC000L});
    public static final BitSet FOLLOW_expr_in_expr741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_expr774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr776 = new BitSet(new long[]{0x0001FF80001CC000L});
    public static final BitSet FOLLOW_expr_in_expr780 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_call_in_expr853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_expr864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_call897 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call899 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_ELIST_in_call905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primary_expression_in_call907 = new BitSet(new long[]{0x0001FF80001CC008L});
    public static final BitSet FOLLOW_expr_in_call911 = new BitSet(new long[]{0x0001FF80001CC008L});
    public static final BitSet FOLLOW_CALL_in_call939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_call941 = new BitSet(new long[]{0x0000000000002008L});
    public static final BitSet FOLLOW_ELIST_in_call946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_call950 = new BitSet(new long[]{0x0001FF80001CC008L});
    public static final BitSet FOLLOW_ID_in_primary_expression992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expression1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_expression1050 = new BitSet(new long[]{0x0000000000000002L});

}