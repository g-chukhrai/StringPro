// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-15 12:58:50

  package stringpack;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class strgramLexer extends Lexer {
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
    public static final int COMMA=4;
    public static final int LIST=5;
    public static final int EOL=6;
    public static final int ID=7;
    public static final int EQUAL=8;
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

    public strgramLexer() {;} 
    public strgramLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public strgramLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:7:7: ( 'if' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:7:9: 'if'
            {
            match("if"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:8:7: ( 'else' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:8:9: 'else'
            {
            match("else"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:9:7: ( 'for' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:9:9: 'for'
            {
            match("for"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:10:7: ( 'in' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:10:9: 'in'
            {
            match("in"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:11:7: ( 'while' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:11:9: 'while'
            {
            match("while"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:7: ( 'return' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:12:9: 'return'
            {
            match("return"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:13:7: ( 'out' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:13:9: 'out'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:14:7: ( 'read' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:14:9: 'read'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:15:7: ( '.' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:15:9: '.'
            {
            match('.'); 

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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:7: ( 'Int' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:16:9: 'Int'
            {
            match("Int"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:17:7: ( 'String' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:17:9: 'String'
            {
            match("String"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:18:7: ( 'Char' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:18:9: 'Char'
            {
            match("Char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "MAIN_NAME"
    public final void mMAIN_NAME() throws RecognitionException {
        try {
            int _type = MAIN_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:12: ( 'MAIN' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:14: 'MAIN'
            {
            match("MAIN"); 


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:180:12: ( 'List' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:180:14: 'List'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:181:10: ( ',' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:181:12: ','
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:182:11: ( '=' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:182:13: '='
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:10: ( ';' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:12: ';'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:13: ( '(' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:184:15: '('
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:185:13: ( ')' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:185:15: ')'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:186:13: ( '{' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:186:15: '{'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:187:12: ( '}' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:187:14: '}'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:188:12: ( '[' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:188:14: '['
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:189:12: ( ']' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:189:14: ']'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:3: ( ( DIGIT )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:5: ( DIGIT )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:5: ( DIGIT )+
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
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:5: DIGIT
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:3: ( ( ALPHA )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:5: ( ALPHA )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:5: ( ALPHA )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:5: ALPHA
            	    {
            	    mALPHA(); 

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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:5: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:3: ( '0' .. '9' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:5: '0' .. '9'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "POSTFIX"
    public final void mPOSTFIX() throws RecognitionException {
        try {
            int _type = POSTFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:217:2: ( '++' | '--' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+') ) {
                alt3=1;
            }
            else if ( (LA3_0=='-') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:217:4: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:217:10: '--'
                    {
                    match("--"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSTFIX"

    // $ANTLR start "MATHOPER"
    public final void mMATHOPER() throws RecognitionException {
        try {
            int _type = MATHOPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:221:2: ( '-' | '+' | '*' | '/' )
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:2: ( ( '>' | '<' | '==' | '>=' | '<=' ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:5: ( '>' | '<' | '==' | '>=' | '<=' )
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:5: ( '>' | '<' | '==' | '>=' | '<=' )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:6: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:10: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:14: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:19: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:225:24: '<='
                    {
                    match("<="); 


                    }
                    break;

            }


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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:229:2: ( '\"' ( ALPHA )* '\"' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:229:6: '\"' ( ALPHA )* '\"'
            {
            match('\"'); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:229:10: ( ALPHA )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:229:10: ALPHA
            	    {
            	    mALPHA(); 

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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:233:3: ( '\\'' ( ALPHA )? '\\'' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:233:7: '\\'' ( ALPHA )? '\\''
            {
            match('\''); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:233:12: ( ALPHA )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:233:12: ALPHA
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:237:5: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:237:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:237:12: ( options {greedy=false; } : . )*
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
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:237:40: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:12: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:12: ~ ( '\\n' | '\\r' )
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

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:26: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:238:26: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

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
        // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | MAIN_NAME | LIST | COMMA | EQUAL | EOL | PAR_OPEN | PAR_CLOSE | CUR_OPEN | CUR_CLOSE | SQ_OPEN | SQ_CLOSE | INT | ID | WS | POSTFIX | MATHOPER | COMPROPER | STRING | CHAR | COMMENT )
        int alt11=32;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:28: T__29
                {
                mT__29(); 

                }
                break;
            case 5 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:34: T__30
                {
                mT__30(); 

                }
                break;
            case 6 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:40: T__31
                {
                mT__31(); 

                }
                break;
            case 7 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:46: T__32
                {
                mT__32(); 

                }
                break;
            case 8 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:52: T__33
                {
                mT__33(); 

                }
                break;
            case 9 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:58: T__34
                {
                mT__34(); 

                }
                break;
            case 10 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:64: T__35
                {
                mT__35(); 

                }
                break;
            case 11 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:70: T__36
                {
                mT__36(); 

                }
                break;
            case 12 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:76: T__37
                {
                mT__37(); 

                }
                break;
            case 13 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:82: MAIN_NAME
                {
                mMAIN_NAME(); 

                }
                break;
            case 14 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:92: LIST
                {
                mLIST(); 

                }
                break;
            case 15 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:97: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 16 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:103: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 17 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:109: EOL
                {
                mEOL(); 

                }
                break;
            case 18 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:113: PAR_OPEN
                {
                mPAR_OPEN(); 

                }
                break;
            case 19 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:122: PAR_CLOSE
                {
                mPAR_CLOSE(); 

                }
                break;
            case 20 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:132: CUR_OPEN
                {
                mCUR_OPEN(); 

                }
                break;
            case 21 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:141: CUR_CLOSE
                {
                mCUR_CLOSE(); 

                }
                break;
            case 22 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:151: SQ_OPEN
                {
                mSQ_OPEN(); 

                }
                break;
            case 23 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:159: SQ_CLOSE
                {
                mSQ_CLOSE(); 

                }
                break;
            case 24 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:168: INT
                {
                mINT(); 

                }
                break;
            case 25 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:172: ID
                {
                mID(); 

                }
                break;
            case 26 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:175: WS
                {
                mWS(); 

                }
                break;
            case 27 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:178: POSTFIX
                {
                mPOSTFIX(); 

                }
                break;
            case 28 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:186: MATHOPER
                {
                mMATHOPER(); 

                }
                break;
            case 29 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:195: COMPROPER
                {
                mCOMPROPER(); 

                }
                break;
            case 30 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:205: STRING
                {
                mSTRING(); 

                }
                break;
            case 31 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:212: CHAR
                {
                mCHAR(); 

                }
                break;
            case 32 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:217: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\6\27\1\uffff\5\27\1\uffff\1\54\12\uffff\3\37\4\uffff\1"+
        "\57\1\60\12\27\5\uffff\1\27\1\75\3\27\1\101\1\102\4\27\1\107\1\uffff"+
        "\2\27\1\112\2\uffff\1\27\1\114\1\115\1\116\1\uffff\1\117\1\27\1"+
        "\uffff\1\27\4\uffff\1\122\1\123\2\uffff";
    static final String DFA11_eofS =
        "\124\uffff";
    static final String DFA11_minS =
        "\1\11\1\146\1\154\1\157\1\150\1\145\1\165\1\uffff\1\156\1\164\1"+
        "\150\1\101\1\151\1\uffff\1\75\12\uffff\1\53\1\55\1\52\4\uffff\2"+
        "\101\1\163\1\162\1\151\1\141\2\164\1\162\1\141\1\111\1\163\5\uffff"+
        "\1\145\1\101\1\154\1\165\1\144\2\101\1\151\1\162\1\116\1\164\1\101"+
        "\1\uffff\1\145\1\162\1\101\2\uffff\1\156\3\101\1\uffff\1\101\1\156"+
        "\1\uffff\1\147\4\uffff\2\101\2\uffff";
    static final String DFA11_maxS =
        "\1\175\1\156\1\154\1\157\1\150\1\145\1\165\1\uffff\1\156\1\164"+
        "\1\150\1\101\1\151\1\uffff\1\75\12\uffff\1\53\1\55\1\57\4\uffff"+
        "\2\172\1\163\1\162\1\151\3\164\1\162\1\141\1\111\1\163\5\uffff\1"+
        "\145\1\172\1\154\1\165\1\144\2\172\1\151\1\162\1\116\1\164\1\172"+
        "\1\uffff\1\145\1\162\1\172\2\uffff\1\156\3\172\1\uffff\1\172\1\156"+
        "\1\uffff\1\147\4\uffff\2\172\2\uffff";
    static final String DFA11_acceptS =
        "\7\uffff\1\11\5\uffff\1\17\1\uffff\1\21\1\22\1\23\1\24\1\25\1\26"+
        "\1\27\1\30\1\31\1\32\3\uffff\1\35\1\36\1\37\1\34\14\uffff\1\20\1"+
        "\33\1\40\1\1\1\4\14\uffff\1\3\3\uffff\1\7\1\12\4\uffff\1\2\2\uffff"+
        "\1\10\1\uffff\1\14\1\15\1\16\1\5\2\uffff\1\6\1\13";
    static final String DFA11_specialS =
        "\124\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\uffff\1\35\4\uffff\1\36"+
            "\1\20\1\21\1\37\1\31\1\15\1\32\1\7\1\33\12\26\1\uffff\1\17\1"+
            "\34\1\16\1\34\2\uffff\2\27\1\12\5\27\1\10\2\27\1\14\1\13\5\27"+
            "\1\11\7\27\1\24\1\uffff\1\25\3\uffff\4\27\1\2\1\3\2\27\1\1\5"+
            "\27\1\6\2\27\1\5\4\27\1\4\3\27\1\22\1\uffff\1\23",
            "\1\40\7\uffff\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\55",
            "\1\56\4\uffff\1\56",
            "",
            "",
            "",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\65\22\uffff\1\64",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "\1\74",
            "\32\27\6\uffff\32\27",
            "\1\76",
            "\1\77",
            "\1\100",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\32\27\6\uffff\32\27",
            "",
            "\1\110",
            "\1\111",
            "\32\27\6\uffff\32\27",
            "",
            "",
            "\1\113",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "",
            "\32\27\6\uffff\32\27",
            "\1\120",
            "",
            "\1\121",
            "",
            "",
            "",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "",
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
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | MAIN_NAME | LIST | COMMA | EQUAL | EOL | PAR_OPEN | PAR_CLOSE | CUR_OPEN | CUR_CLOSE | SQ_OPEN | SQ_CLOSE | INT | ID | WS | POSTFIX | MATHOPER | COMPROPER | STRING | CHAR | COMMENT );";
        }
    }
 

}