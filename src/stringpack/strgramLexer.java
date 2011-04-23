// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-04-23 22:49:06

package stringpack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramLexer extends Lexer {
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

    public strgramLexer() {;} 
    public strgramLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public strgramLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g"; }

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:7:7: ( 'Int' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:7:9: 'Int'
            {
            match("Int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:8:7: ( 'String' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:8:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:9:7: ( 'Char' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:9:9: 'Char'
            {
            match("Char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:10:7: ( 'if' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:10:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:11:7: ( 'else' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:11:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:7: ( 'for' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:13:7: ( 'while' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:13:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:14:7: ( 'out' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:14:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:15:7: ( 'read' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:15:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:7: ( 'toInt' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:9: 'toInt'
            {
            match("toInt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:17:7: ( 'length' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:17:9: 'length'
            {
            match("length"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:18:7: ( 'append' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:18:9: 'append'
            {
            match("append"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:19:7: ( 'compare' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:19:9: 'compare'
            {
            match("compare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:7: ( 'copy' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:20:9: 'copy'
            {
            match("copy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:21:7: ( 'return' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:21:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "MAIN_NAME"
    public final void mMAIN_NAME() throws RecognitionException {
        try {
            int _type = MAIN_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:492:13: ( 'Main' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:492:16: 'Main'
            {
            match("Main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAIN_NAME"

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:493:13: ( 'List' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:493:16: 'List'
            {
            match("List"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:494:13: ( ',' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:494:16: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:495:13: ( '=' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:495:16: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            int _type = EOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:496:13: ( ';' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:496:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EOL"

    // $ANTLR start "PAR_OPEN"
    public final void mPAR_OPEN() throws RecognitionException {
        try {
            int _type = PAR_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:497:13: ( '(' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:497:16: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAR_OPEN"

    // $ANTLR start "PAR_CLOSE"
    public final void mPAR_CLOSE() throws RecognitionException {
        try {
            int _type = PAR_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:498:13: ( ')' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:498:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PAR_CLOSE"

    // $ANTLR start "CUR_OPEN"
    public final void mCUR_OPEN() throws RecognitionException {
        try {
            int _type = CUR_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:499:13: ( '{' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:499:16: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CUR_OPEN"

    // $ANTLR start "CUR_CLOSE"
    public final void mCUR_CLOSE() throws RecognitionException {
        try {
            int _type = CUR_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:500:13: ( '}' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:500:16: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CUR_CLOSE"

    // $ANTLR start "SQ_OPEN"
    public final void mSQ_OPEN() throws RecognitionException {
        try {
            int _type = SQ_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:501:13: ( '[' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:501:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQ_OPEN"

    // $ANTLR start "SQ_CLOSE"
    public final void mSQ_CLOSE() throws RecognitionException {
        try {
            int _type = SQ_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:502:13: ( ']' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:502:16: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQ_CLOSE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:503:13: ( ( DIGIT )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:503:16: ( DIGIT )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:503:16: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:503:16: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:504:13: ( ( ALPHA | DIGIT )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:504:15: ( ALPHA | DIGIT )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:504:15: ( ALPHA | DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:508:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:509:3: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:517:3: ( '0' .. '9' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:518:3: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:521:5: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:521:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:521:9: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "MATHOPER"
    public final void mMATHOPER() throws RecognitionException {
        try {
            int _type = MATHOPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:525:3: ( '-' | '+' | '*' | '/' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:
            {
            if ( (input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MATHOPER"

    // $ANTLR start "COMPROPER"
    public final void mCOMPROPER() throws RecognitionException {
        try {
            int _type = COMPROPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:533:3: ( '>' | '<' | '==' | '>=' | '<=' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='=') ) {
                    alt4=4;
                }
                else {
                    alt4=1;}
                }
                break;
            case '<':
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2=='=') ) {
                    alt4=5;
                }
                else {
                    alt4=2;}
                }
                break;
            case '=':
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:534:5: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:535:5: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:536:5: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:537:5: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:538:5: '<='
                    {
                    match("<="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPROPER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:542:3: ( '\"' ( . )* '\"' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:543:3: '\"' ( . )* '\"'
            {
            match('\"'); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:543:7: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\"') ) {
                    alt5=2;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:543:7: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHAR"
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:547:3: ( '\\'' ( ALPHA )? '\\'' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:548:3: '\\'' ( ALPHA )? '\\''
            {
            match('\''); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:548:8: ( ALPHA )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:548:8: ALPHA
                    {
                    mALPHA(); 

                    }
                    break;

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHAR"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:552:3: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='*') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='/') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:553:3: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:553:8: ( options {greedy=false; } : . )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='*') ) {
                            int LA7_1 = input.LA(2);

                            if ( (LA7_1=='/') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:553:34: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 


                         _channel = HIDDEN;
                        

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:557:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:558:3: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:558:3: ~ ( '\\n' | '\\r' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:562:3: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:562:3: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                         _channel = HIDDEN;
                        

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | MAIN_NAME | LIST | COMMA | EQUAL | EOL | PAR_OPEN | PAR_CLOSE | CUR_OPEN | CUR_CLOSE | SQ_OPEN | SQ_CLOSE | INT | ID | WS | MATHOPER | COMPROPER | STRING | CHAR | COMMENT )
        int alt11=34;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:10: T__25
                {
                mT__25(); 

                }
                break;
            case 2 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:16: T__26
                {
                mT__26(); 

                }
                break;
            case 3 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:22: T__27
                {
                mT__27(); 

                }
                break;
            case 4 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:28: T__28
                {
                mT__28(); 

                }
                break;
            case 5 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:34: T__29
                {
                mT__29(); 

                }
                break;
            case 6 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:40: T__30
                {
                mT__30(); 

                }
                break;
            case 7 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:46: T__31
                {
                mT__31(); 

                }
                break;
            case 8 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:52: T__32
                {
                mT__32(); 

                }
                break;
            case 9 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:58: T__33
                {
                mT__33(); 

                }
                break;
            case 10 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:64: T__34
                {
                mT__34(); 

                }
                break;
            case 11 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:70: T__35
                {
                mT__35(); 

                }
                break;
            case 12 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:76: T__36
                {
                mT__36(); 

                }
                break;
            case 13 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:82: T__37
                {
                mT__37(); 

                }
                break;
            case 14 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:88: T__38
                {
                mT__38(); 

                }
                break;
            case 15 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:94: T__39
                {
                mT__39(); 

                }
                break;
            case 16 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:100: MAIN_NAME
                {
                mMAIN_NAME(); 

                }
                break;
            case 17 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:110: LIST
                {
                mLIST(); 

                }
                break;
            case 18 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:115: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 19 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:121: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 20 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:127: EOL
                {
                mEOL(); 

                }
                break;
            case 21 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:131: PAR_OPEN
                {
                mPAR_OPEN(); 

                }
                break;
            case 22 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:140: PAR_CLOSE
                {
                mPAR_CLOSE(); 

                }
                break;
            case 23 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:150: CUR_OPEN
                {
                mCUR_OPEN(); 

                }
                break;
            case 24 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:159: CUR_CLOSE
                {
                mCUR_CLOSE(); 

                }
                break;
            case 25 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:169: SQ_OPEN
                {
                mSQ_OPEN(); 

                }
                break;
            case 26 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:177: SQ_CLOSE
                {
                mSQ_CLOSE(); 

                }
                break;
            case 27 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:186: INT
                {
                mINT(); 

                }
                break;
            case 28 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:190: ID
                {
                mID(); 

                }
                break;
            case 29 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:193: WS
                {
                mWS(); 

                }
                break;
            case 30 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:196: MATHOPER
                {
                mMATHOPER(); 

                }
                break;
            case 31 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:205: COMPROPER
                {
                mCOMPROPER(); 

                }
                break;
            case 32 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:215: STRING
                {
                mSTRING(); 

                }
                break;
            case 33 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:222: CHAR
                {
                mCHAR(); 

                }
                break;
            case 34 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:227: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\17\32\1\uffff\1\60\7\uffff\1\61\2\uffff\1\40\4\uffff\3"+
        "\32\1\66\13\32\3\uffff\1\104\2\32\1\uffff\1\32\1\110\1\32\1\112"+
        "\11\32\1\uffff\1\32\1\125\1\126\1\uffff\1\32\1\uffff\1\130\5\32"+
        "\1\136\1\137\1\140\1\32\2\uffff\1\142\1\uffff\1\32\1\144\3\32\3"+
        "\uffff\1\150\1\uffff\1\151\1\uffff\1\152\1\153\1\32\4\uffff\1\155"+
        "\1\uffff";
    static final String DFA11_eofS =
        "\156\uffff";
    static final String DFA11_minS =
        "\1\11\1\156\1\164\1\150\1\146\1\154\1\157\1\150\1\165\1\145\1\157"+
        "\1\145\1\160\1\157\1\141\1\151\1\uffff\1\75\7\uffff\1\60\2\uffff"+
        "\1\52\4\uffff\1\164\1\162\1\141\1\60\1\163\1\162\1\151\1\164\1\141"+
        "\1\111\1\156\1\160\1\155\1\151\1\163\3\uffff\1\60\1\151\1\162\1"+
        "\uffff\1\145\1\60\1\154\1\60\1\144\1\165\1\156\1\147\1\145\1\160"+
        "\1\171\1\156\1\164\1\uffff\1\156\2\60\1\uffff\1\145\1\uffff\1\60"+
        "\1\162\2\164\1\156\1\141\3\60\1\147\2\uffff\1\60\1\uffff\1\156\1"+
        "\60\1\150\1\144\1\162\3\uffff\1\60\1\uffff\1\60\1\uffff\2\60\1\145"+
        "\4\uffff\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\156\1\164\1\150\1\146\1\154\1\157\1\150\1\165\1\145\1"+
        "\157\1\145\1\160\1\157\1\141\1\151\1\uffff\1\75\7\uffff\1\172\2"+
        "\uffff\1\57\4\uffff\1\164\1\162\1\141\1\172\1\163\1\162\1\151\2"+
        "\164\1\111\1\156\2\160\1\151\1\163\3\uffff\1\172\1\151\1\162\1\uffff"+
        "\1\145\1\172\1\154\1\172\1\144\1\165\1\156\1\147\1\145\1\160\1\171"+
        "\1\156\1\164\1\uffff\1\156\2\172\1\uffff\1\145\1\uffff\1\172\1\162"+
        "\2\164\1\156\1\141\3\172\1\147\2\uffff\1\172\1\uffff\1\156\1\172"+
        "\1\150\1\144\1\162\3\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\145"+
        "\4\uffff\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\20\uffff\1\22\1\uffff\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\uffff"+
        "\1\34\1\35\1\uffff\1\37\1\40\1\41\1\36\17\uffff\1\23\1\33\1\42\3"+
        "\uffff\1\4\15\uffff\1\1\3\uffff\1\6\1\uffff\1\10\12\uffff\1\3\1"+
        "\5\1\uffff\1\11\5\uffff\1\16\1\20\1\21\1\uffff\1\7\1\uffff\1\12"+
        "\3\uffff\1\2\1\17\1\13\1\14\1\uffff\1\15";
    static final String DFA11_specialS =
        "\156\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\33\2\uffff\1\33\22\uffff\1\33\1\uffff\1\36\4\uffff\1\37"+
            "\1\23\1\24\2\40\1\20\1\40\1\uffff\1\34\12\31\1\uffff\1\22\1"+
            "\35\1\21\1\35\2\uffff\2\32\1\3\5\32\1\1\2\32\1\17\1\16\5\32"+
            "\1\2\7\32\1\27\1\uffff\1\30\3\uffff\1\14\1\32\1\15\1\32\1\5"+
            "\1\6\2\32\1\4\2\32\1\13\2\32\1\10\2\32\1\11\1\32\1\12\2\32\1"+
            "\7\3\32\1\25\1\uffff\1\26",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "",
            "\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\32\6\uffff\32\32",
            "",
            "",
            "\1\62\4\uffff\1\62",
            "",
            "",
            "",
            "",
            "\1\63",
            "\1\64",
            "\1\65",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73\22\uffff\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100\2\uffff\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\111",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "",
            "\1\124",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\1\127",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\141",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\1\143",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            "\1\154",
            "",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\6\uffff\32\32",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | MAIN_NAME | LIST | COMMA | EQUAL | EOL | PAR_OPEN | PAR_CLOSE | CUR_OPEN | CUR_CLOSE | SQ_OPEN | SQ_CLOSE | INT | ID | WS | MATHOPER | COMPROPER | STRING | CHAR | COMMENT );";
        }
    }
 

}