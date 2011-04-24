// $ANTLR 3.2 Sep 23, 2009 12:02:23 C.g 2009-11-23 14:20:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class CParser extends Parser {
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
    public static final int COMMENT=23;
    public static final int VARDEF=8;
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


        public CParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return CParser.tokenNames; }
    public String getGrammarFileName() { return "C.g"; }


    public static class translation_unit_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "translation_unit"
    // C.g:12:1: translation_unit : ( external_declaration )+ -> ^( FILE ( external_declaration )+ ) ;
    public final CParser.translation_unit_return translation_unit() throws RecognitionException {
        CParser.translation_unit_return retval = new CParser.translation_unit_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        CParser.external_declaration_return external_declaration1 = null;


        RewriteRuleSubtreeStream stream_external_declaration=new RewriteRuleSubtreeStream(adaptor,"rule external_declaration");
        try {
            // C.g:13:2: ( ( external_declaration )+ -> ^( FILE ( external_declaration )+ ) )
            // C.g:13:4: ( external_declaration )+
            {
            // C.g:13:4: ( external_declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=28 && LA1_0<=29)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C.g:13:4: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit78);
            	    external_declaration1=external_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_external_declaration.add(external_declaration1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);



            // AST REWRITE
            // elements: external_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 13:26: -> ^( FILE ( external_declaration )+ )
            {
                // C.g:13:29: ^( FILE ( external_declaration )+ )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(FILE, "FILE"), root_1);

                if ( !(stream_external_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_external_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_external_declaration.nextTree());

                }
                stream_external_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "translation_unit"

    public static class external_declaration_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "external_declaration"
    // C.g:16:1: external_declaration : ( function_definition -> function_definition | declaration -> declaration );
    public final CParser.external_declaration_return external_declaration() throws RecognitionException {
        CParser.external_declaration_return retval = new CParser.external_declaration_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        CParser.function_definition_return function_definition2 = null;

        CParser.declaration_return declaration3 = null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_function_definition=new RewriteRuleSubtreeStream(adaptor,"rule function_definition");
        try {
            // C.g:17:2: ( function_definition -> function_definition | declaration -> declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=28 && LA2_0<=29)) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==27||LA2_2==30) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==25) ) {
                        alt2=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C.g:17:4: function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_external_declaration99);
                    function_definition2=function_definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function_definition.add(function_definition2.getTree());


                    // AST REWRITE
                    // elements: function_definition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 17:24: -> function_definition
                    {
                        adaptor.addChild(root_0, stream_function_definition.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C.g:18:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_external_declaration108);
                    declaration3=declaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_declaration.add(declaration3.getTree());


                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 18:24: -> declaration
                    {
                        adaptor.addChild(root_0, stream_declaration.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "external_declaration"

    public static class function_definition_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function_definition"
    // C.g:21:1: function_definition : type_specifier ID '(' ( parameter_list )? ')' compound_statement -> ^( FUNCDEF ID type_specifier ( parameter_list )? compound_statement ) ;
    public final CParser.function_definition_return function_definition() throws RecognitionException {
        CParser.function_definition_return retval = new CParser.function_definition_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token ID5=null;
        Token char_literal6=null;
        Token char_literal8=null;
        CParser.type_specifier_return type_specifier4 = null;

        CParser.parameter_list_return parameter_list7 = null;

        CParser.compound_statement_return compound_statement9 = null;


        CTree ID5_tree=null;
        CTree char_literal6_tree=null;
        CTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        RewriteRuleSubtreeStream stream_compound_statement=new RewriteRuleSubtreeStream(adaptor,"rule compound_statement");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // C.g:22:2: ( type_specifier ID '(' ( parameter_list )? ')' compound_statement -> ^( FUNCDEF ID type_specifier ( parameter_list )? compound_statement ) )
            // C.g:22:4: type_specifier ID '(' ( parameter_list )? ')' compound_statement
            {
            pushFollow(FOLLOW_type_specifier_in_function_definition131);
            type_specifier4=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier4.getTree());
            ID5=(Token)match(input,ID,FOLLOW_ID_in_function_definition133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID5);

            char_literal6=(Token)match(input,25,FOLLOW_25_in_function_definition135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_25.add(char_literal6);

            // C.g:22:26: ( parameter_list )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=28 && LA3_0<=29)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C.g:22:26: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_function_definition137);
                    parameter_list7=parameter_list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_parameter_list.add(parameter_list7.getTree());

                    }
                    break;

            }

            char_literal8=(Token)match(input,26,FOLLOW_26_in_function_definition140); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_26.add(char_literal8);

            pushFollow(FOLLOW_compound_statement_in_function_definition142);
            compound_statement9=compound_statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_compound_statement.add(compound_statement9.getTree());


            // AST REWRITE
            // elements: ID, compound_statement, parameter_list, type_specifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 23:3: -> ^( FUNCDEF ID type_specifier ( parameter_list )? compound_statement )
            {
                // C.g:23:6: ^( FUNCDEF ID type_specifier ( parameter_list )? compound_statement )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                adaptor.addChild(root_1, stream_type_specifier.nextTree());
                // C.g:23:34: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                adaptor.addChild(root_1, stream_compound_statement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "function_definition"

    public static class declaration_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C.g:26:1: declaration : type_specifier declarator[$type_specifier.tree] ';' -> ^( VARDEF declarator ) ;
    public final CParser.declaration_return declaration() throws RecognitionException {
        CParser.declaration_return retval = new CParser.declaration_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token char_literal12=null;
        CParser.type_specifier_return type_specifier10 = null;

        CParser.declarator_return declarator11 = null;


        CTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try {
            // C.g:27:2: ( type_specifier declarator[$type_specifier.tree] ';' -> ^( VARDEF declarator ) )
            // C.g:27:4: type_specifier declarator[$type_specifier.tree] ';'
            {
            pushFollow(FOLLOW_type_specifier_in_declaration170);
            type_specifier10=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier10.getTree());
            pushFollow(FOLLOW_declarator_in_declaration172);
            declarator11=declarator((type_specifier10!=null?((CTree)type_specifier10.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator11.getTree());
            char_literal12=(Token)match(input,27,FOLLOW_27_in_declaration175); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_27.add(char_literal12);



            // AST REWRITE
            // elements: declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 28:3: -> ^( VARDEF declarator )
            {
                // C.g:28:6: ^( VARDEF declarator )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(VARDEF, "VARDEF"), root_1);

                adaptor.addChild(root_1, (declarator11!=null?declarator11.id:null));
                adaptor.addChild(root_1, stream_declarator.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class type_specifier_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type_specifier"
    // C.g:31:1: type_specifier : ( 'void' | 'int' );
    public final CParser.type_specifier_return type_specifier() throws RecognitionException {
        CParser.type_specifier_return retval = new CParser.type_specifier_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token set13=null;

        CTree set13_tree=null;

        try {
            // C.g:32:2: ( 'void' | 'int' )
            // C.g:
            {
            root_0 = (CTree)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CTree)adaptor.create(set13));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type_specifier"

    public static class declarator_return extends ParserRuleReturnScope {
        public CommonTree id;
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declarator"
    // C.g:36:1: declarator[CTree typeAST] returns [CommonTree id] : ( ID '[' expressionRoot ']' -> ^( ARRAY expressionRoot ) | ID ->);
    public final CParser.declarator_return declarator(CTree typeAST) throws RecognitionException {
        CParser.declarator_return retval = new CParser.declarator_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token ID14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        Token ID18=null;
        CParser.expressionRoot_return expressionRoot16 = null;


        CTree ID14_tree=null;
        CTree char_literal15_tree=null;
        CTree char_literal17_tree=null;
        CTree ID18_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expressionRoot=new RewriteRuleSubtreeStream(adaptor,"rule expressionRoot");
        try {
            // C.g:37:2: ( ID '[' expressionRoot ']' -> ^( ARRAY expressionRoot ) | ID ->)
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==30) ) {
                    alt4=1;
                }
                else if ( ((LA4_1>=26 && LA4_1<=27)||LA4_1==32) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // C.g:37:6: ID '[' expressionRoot ']'
                    {
                    ID14=(Token)match(input,ID,FOLLOW_ID_in_declarator221); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID14);

                    char_literal15=(Token)match(input,30,FOLLOW_30_in_declarator223); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal15);

                    pushFollow(FOLLOW_expressionRoot_in_declarator225);
                    expressionRoot16=expressionRoot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionRoot.add(expressionRoot16.getTree());
                    char_literal17=(Token)match(input,31,FOLLOW_31_in_declarator227); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal17);

                    if ( state.backtracking==0 ) {
                      retval.id =new CTree(ID14);
                    }


                    // AST REWRITE
                    // elements: expressionRoot
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 38:4: -> ^( ARRAY expressionRoot )
                    {
                        // C.g:38:7: ^( ARRAY expressionRoot )
                        {
                        CTree root_1 = (CTree)adaptor.nil();
                        root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(ARRAY, "ARRAY"), root_1);

                        adaptor.addChild(root_1, typeAST);
                        adaptor.addChild(root_1, stream_expressionRoot.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C.g:39:6: ID
                    {
                    ID18=(Token)match(input,ID,FOLLOW_ID_in_declarator249); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID18);

                    if ( state.backtracking==0 ) {
                      retval.id =new CTree(ID18);
                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 40:4: ->
                    {
                        adaptor.addChild(root_0, typeAST);

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declarator"

    public static class parameter_list_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_list"
    // C.g:43:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* -> ^( ARGS ( parameter_declaration )+ ) ;
    public final CParser.parameter_list_return parameter_list() throws RecognitionException {
        CParser.parameter_list_return retval = new CParser.parameter_list_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token char_literal20=null;
        CParser.parameter_declaration_return parameter_declaration19 = null;

        CParser.parameter_declaration_return parameter_declaration21 = null;


        CTree char_literal20_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_parameter_declaration=new RewriteRuleSubtreeStream(adaptor,"rule parameter_declaration");
        try {
            // C.g:44:2: ( parameter_declaration ( ',' parameter_declaration )* -> ^( ARGS ( parameter_declaration )+ ) )
            // C.g:44:4: parameter_declaration ( ',' parameter_declaration )*
            {
            pushFollow(FOLLOW_parameter_declaration_in_parameter_list269);
            parameter_declaration19=parameter_declaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration19.getTree());
            // C.g:44:26: ( ',' parameter_declaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==32) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C.g:44:27: ',' parameter_declaration
            	    {
            	    char_literal20=(Token)match(input,32,FOLLOW_32_in_parameter_list272); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal20);

            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list274);
            	    parameter_declaration21=parameter_declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_parameter_declaration.add(parameter_declaration21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);



            // AST REWRITE
            // elements: parameter_declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 45:3: -> ^( ARGS ( parameter_declaration )+ )
            {
                // C.g:45:6: ^( ARGS ( parameter_declaration )+ )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(ARGS, "ARGS"), root_1);

                if ( !(stream_parameter_declaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameter_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_declaration.nextTree());

                }
                stream_parameter_declaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class parameter_declaration_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_declaration"
    // C.g:48:1: parameter_declaration : type_specifier declarator[$type_specifier.tree] -> ^( ARG declarator ) ;
    public final CParser.parameter_declaration_return parameter_declaration() throws RecognitionException {
        CParser.parameter_declaration_return retval = new CParser.parameter_declaration_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        CParser.type_specifier_return type_specifier22 = null;

        CParser.declarator_return declarator23 = null;


        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_type_specifier=new RewriteRuleSubtreeStream(adaptor,"rule type_specifier");
        try {
            // C.g:49:2: ( type_specifier declarator[$type_specifier.tree] -> ^( ARG declarator ) )
            // C.g:49:4: type_specifier declarator[$type_specifier.tree]
            {
            pushFollow(FOLLOW_type_specifier_in_parameter_declaration298);
            type_specifier22=type_specifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type_specifier.add(type_specifier22.getTree());
            pushFollow(FOLLOW_declarator_in_parameter_declaration300);
            declarator23=declarator((type_specifier22!=null?((CTree)type_specifier22.tree):null));

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_declarator.add(declarator23.getTree());


            // AST REWRITE
            // elements: declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 50:4: -> ^( ARG declarator )
            {
                // C.g:50:7: ^( ARG declarator )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(ARG, "ARG"), root_1);

                adaptor.addChild(root_1, (declarator23!=null?declarator23.id:null));
                adaptor.addChild(root_1, stream_declarator.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_declaration"

    public static class statement_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C.g:55:1: statement options {backtrack=true; } : ( compound_statement | assignment_expression ';' -> assignment_expression | postfix_expression ';' -> postfix_expression | 'return' expressionRoot ';' -> ^( 'return' expressionRoot ) | 'if' '(' expressionRoot ')' s1= statement ( 'else' s2= statement )? -> ^( 'if' expressionRoot $s1 ( $s2)? ) | 'while' '(' expressionRoot ')' statement -> ^( 'while' expressionRoot statement ) );
    public final CParser.statement_return statement() throws RecognitionException {
        CParser.statement_return retval = new CParser.statement_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token char_literal26=null;
        Token char_literal28=null;
        Token string_literal29=null;
        Token char_literal31=null;
        Token string_literal32=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token string_literal36=null;
        Token string_literal37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        CParser.statement_return s1 = null;

        CParser.statement_return s2 = null;

        CParser.compound_statement_return compound_statement24 = null;

        CParser.assignment_expression_return assignment_expression25 = null;

        CParser.postfix_expression_return postfix_expression27 = null;

        CParser.expressionRoot_return expressionRoot30 = null;

        CParser.expressionRoot_return expressionRoot34 = null;

        CParser.expressionRoot_return expressionRoot39 = null;

        CParser.statement_return statement41 = null;


        CTree char_literal26_tree=null;
        CTree char_literal28_tree=null;
        CTree string_literal29_tree=null;
        CTree char_literal31_tree=null;
        CTree string_literal32_tree=null;
        CTree char_literal33_tree=null;
        CTree char_literal35_tree=null;
        CTree string_literal36_tree=null;
        CTree string_literal37_tree=null;
        CTree char_literal38_tree=null;
        CTree char_literal40_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_postfix_expression=new RewriteRuleSubtreeStream(adaptor,"rule postfix_expression");
        RewriteRuleSubtreeStream stream_assignment_expression=new RewriteRuleSubtreeStream(adaptor,"rule assignment_expression");
        RewriteRuleSubtreeStream stream_expressionRoot=new RewriteRuleSubtreeStream(adaptor,"rule expressionRoot");
        try {
            // C.g:57:2: ( compound_statement | assignment_expression ';' -> assignment_expression | postfix_expression ';' -> postfix_expression | 'return' expressionRoot ';' -> ^( 'return' expressionRoot ) | 'if' '(' expressionRoot ')' s1= statement ( 'else' s2= statement )? -> ^( 'if' expressionRoot $s1 ( $s2)? ) | 'while' '(' expressionRoot ')' statement -> ^( 'while' expressionRoot statement ) )
            int alt7=6;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C.g:57:4: compound_statement
                    {
                    root_0 = (CTree)adaptor.nil();

                    pushFollow(FOLLOW_compound_statement_in_statement334);
                    compound_statement24=compound_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compound_statement24.getTree());

                    }
                    break;
                case 2 :
                    // C.g:58:4: assignment_expression ';'
                    {
                    pushFollow(FOLLOW_assignment_expression_in_statement339);
                    assignment_expression25=assignment_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_assignment_expression.add(assignment_expression25.getTree());
                    char_literal26=(Token)match(input,27,FOLLOW_27_in_statement341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal26);



                    // AST REWRITE
                    // elements: assignment_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 58:32: -> assignment_expression
                    {
                        adaptor.addChild(root_0, stream_assignment_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C.g:59:4: postfix_expression ';'
                    {
                    pushFollow(FOLLOW_postfix_expression_in_statement352);
                    postfix_expression27=postfix_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_postfix_expression.add(postfix_expression27.getTree());
                    char_literal28=(Token)match(input,27,FOLLOW_27_in_statement354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal28);



                    // AST REWRITE
                    // elements: postfix_expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 59:32: -> postfix_expression
                    {
                        adaptor.addChild(root_0, stream_postfix_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C.g:60:4: 'return' expressionRoot ';'
                    {
                    string_literal29=(Token)match(input,33,FOLLOW_33_in_statement369); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_33.add(string_literal29);

                    pushFollow(FOLLOW_expressionRoot_in_statement371);
                    expressionRoot30=expressionRoot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionRoot.add(expressionRoot30.getTree());
                    char_literal31=(Token)match(input,27,FOLLOW_27_in_statement373); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(char_literal31);



                    // AST REWRITE
                    // elements: 33, expressionRoot
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 60:32: -> ^( 'return' expressionRoot )
                    {
                        // C.g:60:35: ^( 'return' expressionRoot )
                        {
                        CTree root_1 = (CTree)adaptor.nil();
                        root_1 = (CTree)adaptor.becomeRoot(stream_33.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expressionRoot.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C.g:61:4: 'if' '(' expressionRoot ')' s1= statement ( 'else' s2= statement )?
                    {
                    string_literal32=(Token)match(input,34,FOLLOW_34_in_statement386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal32);

                    char_literal33=(Token)match(input,25,FOLLOW_25_in_statement388); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal33);

                    pushFollow(FOLLOW_expressionRoot_in_statement390);
                    expressionRoot34=expressionRoot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionRoot.add(expressionRoot34.getTree());
                    char_literal35=(Token)match(input,26,FOLLOW_26_in_statement392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal35);

                    pushFollow(FOLLOW_statement_in_statement396);
                    s1=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(s1.getTree());
                    // C.g:61:45: ( 'else' s2= statement )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==35) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C.g:61:46: 'else' s2= statement
                            {
                            string_literal36=(Token)match(input,35,FOLLOW_35_in_statement399); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_35.add(string_literal36);

                            pushFollow(FOLLOW_statement_in_statement403);
                            s2=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_statement.add(s2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: s1, 34, expressionRoot, s2
                    // token labels: 
                    // rule labels: retval, s2, s1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_s2=new RewriteRuleSubtreeStream(adaptor,"rule s2",s2!=null?s2.tree:null);
                    RewriteRuleSubtreeStream stream_s1=new RewriteRuleSubtreeStream(adaptor,"rule s1",s1!=null?s1.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 62:11: -> ^( 'if' expressionRoot $s1 ( $s2)? )
                    {
                        // C.g:62:14: ^( 'if' expressionRoot $s1 ( $s2)? )
                        {
                        CTree root_1 = (CTree)adaptor.nil();
                        root_1 = (CTree)adaptor.becomeRoot(stream_34.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expressionRoot.nextTree());
                        adaptor.addChild(root_1, stream_s1.nextTree());
                        // C.g:62:40: ( $s2)?
                        if ( stream_s2.hasNext() ) {
                            adaptor.addChild(root_1, stream_s2.nextTree());

                        }
                        stream_s2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C.g:63:4: 'while' '(' expressionRoot ')' statement
                    {
                    string_literal37=(Token)match(input,36,FOLLOW_36_in_statement435); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal37);

                    char_literal38=(Token)match(input,25,FOLLOW_25_in_statement437); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal38);

                    pushFollow(FOLLOW_expressionRoot_in_statement439);
                    expressionRoot39=expressionRoot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expressionRoot.add(expressionRoot39.getTree());
                    char_literal40=(Token)match(input,26,FOLLOW_26_in_statement441); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal40);

                    pushFollow(FOLLOW_statement_in_statement443);
                    statement41=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statement.add(statement41.getTree());


                    // AST REWRITE
                    // elements: 36, expressionRoot, statement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 64:11: -> ^( 'while' expressionRoot statement )
                    {
                        // C.g:64:14: ^( 'while' expressionRoot statement )
                        {
                        CTree root_1 = (CTree)adaptor.nil();
                        root_1 = (CTree)adaptor.becomeRoot(stream_36.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_expressionRoot.nextTree());
                        adaptor.addChild(root_1, stream_statement.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class compound_statement_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compound_statement"
    // C.g:71:1: compound_statement : '{' ( declaration )* ( statement )* '}' -> ^( BLOCK ( declaration )* ( statement )* ) ;
    public final CParser.compound_statement_return compound_statement() throws RecognitionException {
        CParser.compound_statement_return retval = new CParser.compound_statement_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token char_literal42=null;
        Token char_literal45=null;
        CParser.declaration_return declaration43 = null;

        CParser.statement_return statement44 = null;


        CTree char_literal42_tree=null;
        CTree char_literal45_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // C.g:72:2: ( '{' ( declaration )* ( statement )* '}' -> ^( BLOCK ( declaration )* ( statement )* ) )
            // C.g:72:4: '{' ( declaration )* ( statement )* '}'
            {
            char_literal42=(Token)match(input,37,FOLLOW_37_in_compound_statement476); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_37.add(char_literal42);

            // C.g:72:8: ( declaration )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=29)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C.g:72:8: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement478);
            	    declaration43=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration43.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C.g:72:21: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=ID && LA9_0<=INT)||LA9_0==25||(LA9_0>=33 && LA9_0<=34)||(LA9_0>=36 && LA9_0<=37)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C.g:72:21: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compound_statement481);
            	    statement44=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement44.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal45=(Token)match(input,38,FOLLOW_38_in_compound_statement484); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_38.add(char_literal45);



            // AST REWRITE
            // elements: statement, declaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 72:36: -> ^( BLOCK ( declaration )* ( statement )* )
            {
                // C.g:72:39: ^( BLOCK ( declaration )* ( statement )* )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C.g:72:47: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                // C.g:72:60: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compound_statement"

    public static class assignment_expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment_expression"
    // C.g:77:1: assignment_expression : postfix_expression ( '=' expressionRoot )? ;
    public final CParser.assignment_expression_return assignment_expression() throws RecognitionException {
        CParser.assignment_expression_return retval = new CParser.assignment_expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token char_literal47=null;
        CParser.postfix_expression_return postfix_expression46 = null;

        CParser.expressionRoot_return expressionRoot48 = null;


        CTree char_literal47_tree=null;

        try {
            // C.g:78:2: ( postfix_expression ( '=' expressionRoot )? )
            // C.g:78:4: postfix_expression ( '=' expressionRoot )?
            {
            root_0 = (CTree)adaptor.nil();

            pushFollow(FOLLOW_postfix_expression_in_assignment_expression509);
            postfix_expression46=postfix_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression46.getTree());
            // C.g:78:23: ( '=' expressionRoot )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASSIGN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C.g:78:24: '=' expressionRoot
                    {
                    char_literal47=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment_expression512); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal47_tree = (CTree)adaptor.create(char_literal47);
                    root_0 = (CTree)adaptor.becomeRoot(char_literal47_tree, root_0);
                    }
                    pushFollow(FOLLOW_expressionRoot_in_assignment_expression515);
                    expressionRoot48=expressionRoot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionRoot48.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment_expression"

    public static class expressionRoot_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionRoot"
    // C.g:81:1: expressionRoot : expression -> ^( EXPR expression ) ;
    public final CParser.expressionRoot_return expressionRoot() throws RecognitionException {
        CParser.expressionRoot_return retval = new CParser.expressionRoot_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        CParser.expression_return expression49 = null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C.g:82:2: ( expression -> ^( EXPR expression ) )
            // C.g:82:4: expression
            {
            pushFollow(FOLLOW_expression_in_expressionRoot528);
            expression49=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression49.getTree());


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 82:15: -> ^( EXPR expression )
            {
                // C.g:82:18: ^( EXPR expression )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(EXPR, "EXPR"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionRoot"

    public static class expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C.g:85:1: expression : conditional_expression ;
    public final CParser.expression_return expression() throws RecognitionException {
        CParser.expression_return retval = new CParser.expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        CParser.conditional_expression_return conditional_expression50 = null;



        try {
            // C.g:86:2: ( conditional_expression )
            // C.g:86:4: conditional_expression
            {
            root_0 = (CTree)adaptor.nil();

            pushFollow(FOLLOW_conditional_expression_in_expression548);
            conditional_expression50=conditional_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional_expression50.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class conditional_expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional_expression"
    // C.g:89:1: conditional_expression : relational_expression ( ( '==' | '!=' ) relational_expression )? ;
    public final CParser.conditional_expression_return conditional_expression() throws RecognitionException {
        CParser.conditional_expression_return retval = new CParser.conditional_expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token set52=null;
        CParser.relational_expression_return relational_expression51 = null;

        CParser.relational_expression_return relational_expression53 = null;


        CTree set52_tree=null;

        try {
            // C.g:90:2: ( relational_expression ( ( '==' | '!=' ) relational_expression )? )
            // C.g:90:4: relational_expression ( ( '==' | '!=' ) relational_expression )?
            {
            root_0 = (CTree)adaptor.nil();

            pushFollow(FOLLOW_relational_expression_in_conditional_expression560);
            relational_expression51=relational_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression51.getTree());
            // C.g:90:26: ( ( '==' | '!=' ) relational_expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=39 && LA11_0<=40)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C.g:90:27: ( '==' | '!=' ) relational_expression
                    {
                    set52=(Token)input.LT(1);
                    set52=(Token)input.LT(1);
                    if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
                        input.consume();
                        if ( state.backtracking==0 ) root_0 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(set52), root_0);
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_relational_expression_in_conditional_expression570);
                    relational_expression53=relational_expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, relational_expression53.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional_expression"

    public static class relational_expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relational_expression"
    // C.g:93:1: relational_expression : additive_expression ( ( '<' | '>' | '<=' | '>=' ) additive_expression )* ;
    public final CParser.relational_expression_return relational_expression() throws RecognitionException {
        CParser.relational_expression_return retval = new CParser.relational_expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token set55=null;
        CParser.additive_expression_return additive_expression54 = null;

        CParser.additive_expression_return additive_expression56 = null;


        CTree set55_tree=null;

        try {
            // C.g:94:5: ( additive_expression ( ( '<' | '>' | '<=' | '>=' ) additive_expression )* )
            // C.g:94:7: additive_expression ( ( '<' | '>' | '<=' | '>=' ) additive_expression )*
            {
            root_0 = (CTree)adaptor.nil();

            pushFollow(FOLLOW_additive_expression_in_relational_expression586);
            additive_expression54=additive_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression54.getTree());
            // C.g:94:27: ( ( '<' | '>' | '<=' | '>=' ) additive_expression )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=41 && LA12_0<=44)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C.g:94:28: ( '<' | '>' | '<=' | '>=' ) additive_expression
            	    {
            	    set55=(Token)input.LT(1);
            	    set55=(Token)input.LT(1);
            	    if ( (input.LA(1)>=41 && input.LA(1)<=44) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(set55), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_relational_expression600);
            	    additive_expression56=additive_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additive_expression56.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relational_expression"

    public static class additive_expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additive_expression"
    // C.g:97:1: additive_expression : multiplicative_expression ( ( '+' | '-' ) multiplicative_expression )* ;
    public final CParser.additive_expression_return additive_expression() throws RecognitionException {
        CParser.additive_expression_return retval = new CParser.additive_expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token set58=null;
        CParser.multiplicative_expression_return multiplicative_expression57 = null;

        CParser.multiplicative_expression_return multiplicative_expression59 = null;


        CTree set58_tree=null;

        try {
            // C.g:98:2: ( multiplicative_expression ( ( '+' | '-' ) multiplicative_expression )* )
            // C.g:98:4: multiplicative_expression ( ( '+' | '-' ) multiplicative_expression )*
            {
            root_0 = (CTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression616);
            multiplicative_expression57=multiplicative_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression57.getTree());
            // C.g:98:30: ( ( '+' | '-' ) multiplicative_expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=45 && LA13_0<=46)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C.g:98:31: ( '+' | '-' ) multiplicative_expression
            	    {
            	    set58=(Token)input.LT(1);
            	    set58=(Token)input.LT(1);
            	    if ( (input.LA(1)>=45 && input.LA(1)<=46) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(set58), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression626);
            	    multiplicative_expression59=multiplicative_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicative_expression59.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additive_expression"

    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicative_expression"
    // C.g:101:1: multiplicative_expression : postfix_expression ( ( '*' | '/' ) postfix_expression )* ;
    public final CParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        CParser.multiplicative_expression_return retval = new CParser.multiplicative_expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token set61=null;
        CParser.postfix_expression_return postfix_expression60 = null;

        CParser.postfix_expression_return postfix_expression62 = null;


        CTree set61_tree=null;

        try {
            // C.g:102:2: ( postfix_expression ( ( '*' | '/' ) postfix_expression )* )
            // C.g:102:4: postfix_expression ( ( '*' | '/' ) postfix_expression )*
            {
            root_0 = (CTree)adaptor.nil();

            pushFollow(FOLLOW_postfix_expression_in_multiplicative_expression639);
            postfix_expression60=postfix_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression60.getTree());
            // C.g:102:23: ( ( '*' | '/' ) postfix_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=47 && LA14_0<=48)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C.g:102:24: ( '*' | '/' ) postfix_expression
            	    {
            	    set61=(Token)input.LT(1);
            	    set61=(Token)input.LT(1);
            	    if ( (input.LA(1)>=47 && input.LA(1)<=48) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) root_0 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(set61), root_0);
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_postfix_expression_in_multiplicative_expression649);
            	    postfix_expression62=postfix_expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, postfix_expression62.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"

    public static class postfix_expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfix_expression"
    // C.g:105:1: postfix_expression : ( primary_expression -> primary_expression ) ( '[' expression ']' -> ^( INDEX $postfix_expression expression ) | '(' argument_expression_list ')' -> ^( CALL $postfix_expression argument_expression_list ) | '(' ')' -> ^( CALL $postfix_expression) )* ;
    public final CParser.postfix_expression_return postfix_expression() throws RecognitionException {
        CParser.postfix_expression_return retval = new CParser.postfix_expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token char_literal64=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;
        CParser.primary_expression_return primary_expression63 = null;

        CParser.expression_return expression65 = null;

        CParser.argument_expression_list_return argument_expression_list68 = null;


        CTree char_literal64_tree=null;
        CTree char_literal66_tree=null;
        CTree char_literal67_tree=null;
        CTree char_literal69_tree=null;
        CTree char_literal70_tree=null;
        CTree char_literal71_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_primary_expression=new RewriteRuleSubtreeStream(adaptor,"rule primary_expression");
        RewriteRuleSubtreeStream stream_argument_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule argument_expression_list");
        try {
            // C.g:106:2: ( ( primary_expression -> primary_expression ) ( '[' expression ']' -> ^( INDEX $postfix_expression expression ) | '(' argument_expression_list ')' -> ^( CALL $postfix_expression argument_expression_list ) | '(' ')' -> ^( CALL $postfix_expression) )* )
            // C.g:106:6: ( primary_expression -> primary_expression ) ( '[' expression ']' -> ^( INDEX $postfix_expression expression ) | '(' argument_expression_list ')' -> ^( CALL $postfix_expression argument_expression_list ) | '(' ')' -> ^( CALL $postfix_expression) )*
            {
            // C.g:106:6: ( primary_expression -> primary_expression )
            // C.g:106:7: primary_expression
            {
            pushFollow(FOLLOW_primary_expression_in_postfix_expression665);
            primary_expression63=primary_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_primary_expression.add(primary_expression63.getTree());


            // AST REWRITE
            // elements: primary_expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 106:25: -> primary_expression
            {
                adaptor.addChild(root_0, stream_primary_expression.nextTree());

            }

            retval.tree = root_0;}
            }

            // C.g:107:9: ( '[' expression ']' -> ^( INDEX $postfix_expression expression ) | '(' argument_expression_list ')' -> ^( CALL $postfix_expression argument_expression_list ) | '(' ')' -> ^( CALL $postfix_expression) )*
            loop15:
            do {
                int alt15=4;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==30) ) {
                    alt15=1;
                }
                else if ( (LA15_0==25) ) {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==26) ) {
                        alt15=3;
                    }
                    else if ( ((LA15_3>=ID && LA15_3<=INT)||LA15_3==25) ) {
                        alt15=2;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // C.g:107:13: '[' expression ']'
            	    {
            	    char_literal64=(Token)match(input,30,FOLLOW_30_in_postfix_expression682); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_30.add(char_literal64);

            	    pushFollow(FOLLOW_expression_in_postfix_expression684);
            	    expression65=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression65.getTree());
            	    char_literal66=(Token)match(input,31,FOLLOW_31_in_postfix_expression686); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_31.add(char_literal66);



            	    // AST REWRITE
            	    // elements: postfix_expression, expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CTree)adaptor.nil();
            	    // 108:12: -> ^( INDEX $postfix_expression expression )
            	    {
            	        // C.g:108:15: ^( INDEX $postfix_expression expression )
            	        {
            	        CTree root_1 = (CTree)adaptor.nil();
            	        root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(INDEX, "INDEX"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_expression.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 2 :
            	    // C.g:109:13: '(' argument_expression_list ')'
            	    {
            	    char_literal67=(Token)match(input,25,FOLLOW_25_in_postfix_expression722); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_25.add(char_literal67);

            	    pushFollow(FOLLOW_argument_expression_list_in_postfix_expression724);
            	    argument_expression_list68=argument_expression_list();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_argument_expression_list.add(argument_expression_list68.getTree());
            	    char_literal69=(Token)match(input,26,FOLLOW_26_in_postfix_expression726); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_26.add(char_literal69);



            	    // AST REWRITE
            	    // elements: postfix_expression, argument_expression_list
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CTree)adaptor.nil();
            	    // 110:12: -> ^( CALL $postfix_expression argument_expression_list )
            	    {
            	        // C.g:110:15: ^( CALL $postfix_expression argument_expression_list )
            	        {
            	        CTree root_1 = (CTree)adaptor.nil();
            	        root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_argument_expression_list.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;
            	case 3 :
            	    // C.g:111:13: '(' ')'
            	    {
            	    char_literal70=(Token)match(input,25,FOLLOW_25_in_postfix_expression762); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_25.add(char_literal70);

            	    char_literal71=(Token)match(input,26,FOLLOW_26_in_postfix_expression764); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_26.add(char_literal71);



            	    // AST REWRITE
            	    // elements: postfix_expression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CTree)adaptor.nil();
            	    // 111:21: -> ^( CALL $postfix_expression)
            	    {
            	        // C.g:111:24: ^( CALL $postfix_expression)
            	        {
            	        CTree root_1 = (CTree)adaptor.nil();
            	        root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(CALL, "CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "postfix_expression"

    public static class argument_expression_list_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argument_expression_list"
    // C.g:115:1: argument_expression_list : expression ( ',' expression )* -> ^( ELIST ( expression )+ ) ;
    public final CParser.argument_expression_list_return argument_expression_list() throws RecognitionException {
        CParser.argument_expression_list_return retval = new CParser.argument_expression_list_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token char_literal73=null;
        CParser.expression_return expression72 = null;

        CParser.expression_return expression74 = null;


        CTree char_literal73_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C.g:116:2: ( expression ( ',' expression )* -> ^( ELIST ( expression )+ ) )
            // C.g:116:6: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_argument_expression_list797);
            expression72=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression72.getTree());
            // C.g:116:17: ( ',' expression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C.g:116:18: ',' expression
            	    {
            	    char_literal73=(Token)match(input,32,FOLLOW_32_in_argument_expression_list800); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_32.add(char_literal73);

            	    pushFollow(FOLLOW_expression_in_argument_expression_list802);
            	    expression74=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression74.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CTree)adaptor.nil();
            // 116:35: -> ^( ELIST ( expression )+ )
            {
                // C.g:116:38: ^( ELIST ( expression )+ )
                {
                CTree root_1 = (CTree)adaptor.nil();
                root_1 = (CTree)adaptor.becomeRoot((CTree)adaptor.create(ELIST, "ELIST"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "argument_expression_list"

    public static class primary_expression_return extends ParserRuleReturnScope {
        CTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary_expression"
    // C.g:119:1: primary_expression : ( ID | STRING | INT | '(' expression ')' -> expression );
    public final CParser.primary_expression_return primary_expression() throws RecognitionException {
        CParser.primary_expression_return retval = new CParser.primary_expression_return();
        retval.start = input.LT(1);

        CTree root_0 = null;

        Token ID75=null;
        Token STRING76=null;
        Token INT77=null;
        Token char_literal78=null;
        Token char_literal80=null;
        CParser.expression_return expression79 = null;


        CTree ID75_tree=null;
        CTree STRING76_tree=null;
        CTree INT77_tree=null;
        CTree char_literal78_tree=null;
        CTree char_literal80_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C.g:120:2: ( ID | STRING | INT | '(' expression ')' -> expression )
            int alt17=4;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt17=1;
                }
                break;
            case STRING:
                {
                alt17=2;
                }
                break;
            case INT:
                {
                alt17=3;
                }
                break;
            case 25:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C.g:120:4: ID
                    {
                    root_0 = (CTree)adaptor.nil();

                    ID75=(Token)match(input,ID,FOLLOW_ID_in_primary_expression824); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID75_tree = (CTree)adaptor.create(ID75);
                    adaptor.addChild(root_0, ID75_tree);
                    }

                    }
                    break;
                case 2 :
                    // C.g:121:4: STRING
                    {
                    root_0 = (CTree)adaptor.nil();

                    STRING76=(Token)match(input,STRING,FOLLOW_STRING_in_primary_expression829); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRING76_tree = (CTree)adaptor.create(STRING76);
                    adaptor.addChild(root_0, STRING76_tree);
                    }

                    }
                    break;
                case 3 :
                    // C.g:122:4: INT
                    {
                    root_0 = (CTree)adaptor.nil();

                    INT77=(Token)match(input,INT,FOLLOW_INT_in_primary_expression834); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT77_tree = (CTree)adaptor.create(INT77);
                    adaptor.addChild(root_0, INT77_tree);
                    }

                    }
                    break;
                case 4 :
                    // C.g:123:4: '(' expression ')'
                    {
                    char_literal78=(Token)match(input,25,FOLLOW_25_in_primary_expression839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal78);

                    pushFollow(FOLLOW_expression_in_primary_expression841);
                    expression79=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression79.getTree());
                    char_literal80=(Token)match(input,26,FOLLOW_26_in_primary_expression843); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal80);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CTree)adaptor.nil();
                    // 123:23: -> expression
                    {
                        adaptor.addChild(root_0, stream_expression.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary_expression"

    // $ANTLR start synpred2_C
    public final void synpred2_C_fragment() throws RecognitionException {   
        // C.g:58:4: ( assignment_expression ';' )
        // C.g:58:4: assignment_expression ';'
        {
        pushFollow(FOLLOW_assignment_expression_in_synpred2_C339);
        assignment_expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred2_C341); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_C

    // $ANTLR start synpred3_C
    public final void synpred3_C_fragment() throws RecognitionException {   
        // C.g:59:4: ( postfix_expression ';' )
        // C.g:59:4: postfix_expression ';'
        {
        pushFollow(FOLLOW_postfix_expression_in_synpred3_C352);
        postfix_expression();

        state._fsp--;
        if (state.failed) return ;
        match(input,27,FOLLOW_27_in_synpred3_C354); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_C

    // Delegated rules

    public final boolean synpred2_C() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_C_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_C() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_C_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\13\uffff";
    static final String DFA7_eofS =
        "\13\uffff";
    static final String DFA7_minS =
        "\1\22\1\uffff\4\0\5\uffff";
    static final String DFA7_maxS =
        "\1\45\1\uffff\4\0\5\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\4\uffff\1\4\1\5\1\6\1\2\1\3";
    static final String DFA7_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\5\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\1\3\1\4\4\uffff\1\5\7\uffff\1\6\1\7\1\uffff\1\10\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "55:1: statement options {backtrack=true; } : ( compound_statement | assignment_expression ';' -> assignment_expression | postfix_expression ';' -> postfix_expression | 'return' expressionRoot ';' -> ^( 'return' expressionRoot ) | 'if' '(' expressionRoot ')' s1= statement ( 'else' s2= statement )? -> ^( 'if' expressionRoot $s1 ( $s2)? ) | 'while' '(' expressionRoot ')' statement -> ^( 'while' expressionRoot statement ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_2 = input.LA(1);

                         
                        int index7_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_C()) ) {s = 9;}

                        else if ( (synpred3_C()) ) {s = 10;}

                         
                        input.seek(index7_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA7_3 = input.LA(1);

                         
                        int index7_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_C()) ) {s = 9;}

                        else if ( (synpred3_C()) ) {s = 10;}

                         
                        input.seek(index7_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA7_4 = input.LA(1);

                         
                        int index7_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_C()) ) {s = 9;}

                        else if ( (synpred3_C()) ) {s = 10;}

                         
                        input.seek(index7_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA7_5 = input.LA(1);

                         
                        int index7_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_C()) ) {s = 9;}

                        else if ( (synpred3_C()) ) {s = 10;}

                         
                        input.seek(index7_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_external_declaration_in_translation_unit78 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_function_definition_in_external_declaration99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_external_declaration108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_function_definition131 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ID_in_function_definition133 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_function_definition135 = new BitSet(new long[]{0x0000000034000000L});
    public static final BitSet FOLLOW_parameter_list_in_function_definition137 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_function_definition140 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_declaration170 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_declarator_in_declaration172 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_declaration175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_specifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator221 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_declarator223 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expressionRoot_in_declarator225 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_declarator227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list269 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_parameter_list272 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list274 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_type_specifier_in_parameter_declaration298 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_statement339 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_statement341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_statement352 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_statement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_statement369 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expressionRoot_in_statement371 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_statement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_statement386 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement388 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expressionRoot_in_statement390 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement392 = new BitSet(new long[]{0x00000036021C0000L});
    public static final BitSet FOLLOW_statement_in_statement396 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_statement399 = new BitSet(new long[]{0x00000036021C0000L});
    public static final BitSet FOLLOW_statement_in_statement403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_statement435 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_statement437 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expressionRoot_in_statement439 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_statement441 = new BitSet(new long[]{0x00000036021C0000L});
    public static final BitSet FOLLOW_statement_in_statement443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_compound_statement476 = new BitSet(new long[]{0x00000076321C0000L});
    public static final BitSet FOLLOW_declaration_in_compound_statement478 = new BitSet(new long[]{0x00000076321C0000L});
    public static final BitSet FOLLOW_statement_in_compound_statement481 = new BitSet(new long[]{0x00000076021C0000L});
    public static final BitSet FOLLOW_38_in_compound_statement484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_assignment_expression509 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ASSIGN_in_assignment_expression512 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expressionRoot_in_assignment_expression515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionRoot528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_expression548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_conditional_expression560 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_set_in_conditional_expression563 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_relational_expression_in_conditional_expression570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression586 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_set_in_relational_expression589 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression600 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression616 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_set_in_additive_expression619 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression626 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_multiplicative_expression639 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_set_in_multiplicative_expression642 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_postfix_expression_in_multiplicative_expression649 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression665 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_30_in_postfix_expression682 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expression_in_postfix_expression684 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_postfix_expression686 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_25_in_postfix_expression722 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression724 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_postfix_expression726 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_25_in_postfix_expression762 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_postfix_expression764 = new BitSet(new long[]{0x0000000042000002L});
    public static final BitSet FOLLOW_expression_in_argument_expression_list797 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_argument_expression_list800 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expression_in_argument_expression_list802 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ID_in_primary_expression824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_primary_expression829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primary_expression834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_primary_expression839 = new BitSet(new long[]{0x00000000021C0000L});
    public static final BitSet FOLLOW_expression_in_primary_expression841 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_primary_expression843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred2_C339 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred2_C341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_synpred3_C352 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_synpred3_C354 = new BitSet(new long[]{0x0000000000000002L});

}