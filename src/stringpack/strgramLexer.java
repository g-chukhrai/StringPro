// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g 2011-03-15 10:35:47

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
    public static final int TYPE=4;
    public static final int COMMA=5;
    public static final int LIST=6;
    public static final int EOL=7;
    public static final int ID=8;
    public static final int EQUAL=9;
    public static final int MATHOPER=10;
    public static final int PARENTHESES_OPEN=11;
    public static final int PARENTHESES_CLOSE=12;
    public static final int INT=13;
    public static final int STRING=14;
    public static final int COMPROPER=15;
    public static final int POSTFIXOPER=16;
    public static final int MAIN_NAME=17;
    public static final int CURLY_OPEN=18;
    public static final int CURLY_CLOSE=19;
    public static final int SQUARE_OPEN=20;
    public static final int SQUARE_CLOSE=21;
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

    // $ANTLR start "MAIN_NAME"
    public final void mMAIN_NAME() throws RecognitionException {
        try {
            int _type = MAIN_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:12: ( 'Main' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:162:14: 'Main'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:10: ( 'List' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:163:12: 'List'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:10: ( ',' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:164:12: ','
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:9: ( '=' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:165:11: '='
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:166:8: ( ';' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:166:10: ';'
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

    // $ANTLR start "PARENTHESES_OPEN"
    public final void mPARENTHESES_OPEN() throws RecognitionException {
        try {
            int _type = PARENTHESES_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:19: ( '(' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:167:21: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARENTHESES_OPEN"

    // $ANTLR start "PARENTHESES_CLOSE"
    public final void mPARENTHESES_CLOSE() throws RecognitionException {
        try {
            int _type = PARENTHESES_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:19: ( ')' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:168:21: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PARENTHESES_CLOSE"

    // $ANTLR start "CURLY_OPEN"
    public final void mCURLY_OPEN() throws RecognitionException {
        try {
            int _type = CURLY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:15: ( '{' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:169:17: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURLY_OPEN"

    // $ANTLR start "CURLY_CLOSE"
    public final void mCURLY_CLOSE() throws RecognitionException {
        try {
            int _type = CURLY_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:16: ( '}' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:170:18: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CURLY_CLOSE"

    // $ANTLR start "SQUARE_OPEN"
    public final void mSQUARE_OPEN() throws RecognitionException {
        try {
            int _type = SQUARE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:14: ( '[' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:171:16: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUARE_OPEN"

    // $ANTLR start "SQUARE_CLOSE"
    public final void mSQUARE_CLOSE() throws RecognitionException {
        try {
            int _type = SQUARE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:16: ( ']' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:172:18: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQUARE_CLOSE"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:2: ( 'Int' | 'String' | 'Char' )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 'I':
                {
                alt1=1;
                }
                break;
            case 'S':
                {
                alt1=2;
                }
                break;
            case 'C':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:5: 'Int'
                    {
                    match("Int"); 


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:13: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:175:24: 'Char'
                    {
                    match("Char"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:3: ( ( DIGIT )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:5: ( DIGIT )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:5: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:179:6: DIGIT
            	    {
            	    mDIGIT(); 

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
    // $ANTLR end "INT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:3: ( ( ALPHA )+ )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:5: ( ALPHA )+
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:5: ( ALPHA )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:183:5: ALPHA
            	    {
            	    mALPHA(); 

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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:187:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:187:5: ( 'a' .. 'z' | 'A' .. 'Z' )
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:3: ( '0' .. '9' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:191:5: '0' .. '9'
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:194:8: ( ' ' | '\\r' | '\\t' | '\\n' )
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

    // $ANTLR start "POSTFIXOPER"
    public final void mPOSTFIXOPER() throws RecognitionException {
        try {
            int _type = POSTFIXOPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:2: ( '++' | '--' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+') ) {
                alt4=1;
            }
            else if ( (LA4_0=='-') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:4: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:198:10: '--'
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
    // $ANTLR end "POSTFIXOPER"

    // $ANTLR start "MATHOPER"
    public final void mMATHOPER() throws RecognitionException {
        try {
            int _type = MATHOPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:202:2: ( '-' | '+' | '*' | '/' )
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:2: ( ( '>' | '<' | '==' | '>=' | '<=' ) )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:5: ( '>' | '<' | '==' | '>=' | '<=' )
            {
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:5: ( '>' | '<' | '==' | '>=' | '<=' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='=') ) {
                    alt5=4;
                }
                else {
                    alt5=1;}
                }
                break;
            case '<':
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='=') ) {
                    alt5=5;
                }
                else {
                    alt5=2;}
                }
                break;
            case '=':
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:6: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:10: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:14: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 4 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:19: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:206:24: '<='
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
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:2: ( '\"' ( ALPHA )+ '\"' )
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:6: '\"' ( ALPHA )+ '\"'
            {
            match('\"'); 
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:10: ( ALPHA )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='A' && LA6_0<='Z')||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:210:10: ALPHA
            	    {
            	    mALPHA(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:5: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:7: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:12: ( options {greedy=false; } : . )*
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
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:213:40: .
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
                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:12: (~ ( '\\n' | '\\r' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:12: ~ ( '\\n' | '\\r' )
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

                    // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:26: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:214:26: '\\r'
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
        // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | MAIN_NAME | LIST | COMMA | EQUAL | EOL | PARENTHESES_OPEN | PARENTHESES_CLOSE | CURLY_OPEN | CURLY_CLOSE | SQUARE_OPEN | SQUARE_CLOSE | TYPE | INT | ID | WS | POSTFIXOPER | MATHOPER | COMPROPER | STRING | COMMENT )
        int alt11=29;
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
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:64: MAIN_NAME
                {
                mMAIN_NAME(); 

                }
                break;
            case 11 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:74: LIST
                {
                mLIST(); 

                }
                break;
            case 12 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:79: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 13 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:85: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 14 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:91: EOL
                {
                mEOL(); 

                }
                break;
            case 15 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:95: PARENTHESES_OPEN
                {
                mPARENTHESES_OPEN(); 

                }
                break;
            case 16 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:112: PARENTHESES_CLOSE
                {
                mPARENTHESES_CLOSE(); 

                }
                break;
            case 17 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:130: CURLY_OPEN
                {
                mCURLY_OPEN(); 

                }
                break;
            case 18 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:141: CURLY_CLOSE
                {
                mCURLY_CLOSE(); 

                }
                break;
            case 19 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:153: SQUARE_OPEN
                {
                mSQUARE_OPEN(); 

                }
                break;
            case 20 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:165: SQUARE_CLOSE
                {
                mSQUARE_CLOSE(); 

                }
                break;
            case 21 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:178: TYPE
                {
                mTYPE(); 

                }
                break;
            case 22 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:183: INT
                {
                mINT(); 

                }
                break;
            case 23 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:187: ID
                {
                mID(); 

                }
                break;
            case 24 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:190: WS
                {
                mWS(); 

                }
                break;
            case 25 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:193: POSTFIXOPER
                {
                mPOSTFIXOPER(); 

                }
                break;
            case 26 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:205: MATHOPER
                {
                mMATHOPER(); 

                }
                break;
            case 27 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:214: COMPROPER
                {
                mCOMPROPER(); 

                }
                break;
            case 28 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:224: STRING
                {
                mSTRING(); 

                }
                break;
            case 29 :
                // D:\\JavaProj\\stringpro\\src\\stringpack\\strgram.g:1:231: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\6\27\1\uffff\2\27\1\uffff\1\50\7\uffff\3\27\3\uffff\3"+
        "\36\3\uffff\1\56\1\57\7\27\1\uffff\3\27\4\uffff\1\27\1\74\3\27\1"+
        "\100\2\27\1\103\2\27\1\106\1\uffff\2\27\1\111\1\uffff\1\112\1\113"+
        "\1\uffff\1\27\1\103\1\uffff\1\115\1\27\3\uffff\1\27\1\uffff\1\120"+
        "\1\103\1\uffff";
    static final String DFA11_eofS =
        "\121\uffff";
    static final String DFA11_minS =
        "\1\11\1\146\1\154\1\157\1\150\1\145\1\165\1\uffff\1\141\1\151\1"+
        "\uffff\1\75\7\uffff\1\156\1\164\1\150\3\uffff\1\53\1\55\1\52\3\uffff"+
        "\2\101\1\163\1\162\1\151\1\141\1\164\1\151\1\163\1\uffff\1\164\1"+
        "\162\1\141\4\uffff\1\145\1\101\1\154\1\165\1\144\1\101\1\156\1\164"+
        "\1\101\1\151\1\162\1\101\1\uffff\1\145\1\162\1\101\1\uffff\2\101"+
        "\1\uffff\1\156\1\101\1\uffff\1\101\1\156\3\uffff\1\147\1\uffff\2"+
        "\101\1\uffff";
    static final String DFA11_maxS =
        "\1\175\1\156\1\154\1\157\1\150\1\145\1\165\1\uffff\1\141\1\151"+
        "\1\uffff\1\75\7\uffff\1\156\1\164\1\150\3\uffff\1\53\1\55\1\57\3"+
        "\uffff\2\172\1\163\1\162\1\151\2\164\1\151\1\163\1\uffff\1\164\1"+
        "\162\1\141\4\uffff\1\145\1\172\1\154\1\165\1\144\1\172\1\156\1\164"+
        "\1\172\1\151\1\162\1\172\1\uffff\1\145\1\162\1\172\1\uffff\2\172"+
        "\1\uffff\1\156\1\172\1\uffff\1\172\1\156\3\uffff\1\147\1\uffff\2"+
        "\172\1\uffff";
    static final String DFA11_acceptS =
        "\7\uffff\1\11\2\uffff\1\14\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23"+
        "\1\24\3\uffff\1\26\1\27\1\30\3\uffff\1\33\1\34\1\32\11\uffff\1\15"+
        "\3\uffff\1\31\1\35\1\1\1\4\14\uffff\1\3\3\uffff\1\7\2\uffff\1\25"+
        "\2\uffff\1\2\2\uffff\1\10\1\12\1\13\1\uffff\1\5\2\uffff\1\6";
    static final String DFA11_specialS =
        "\121\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\uffff\1\35\5\uffff\1\15"+
            "\1\16\1\36\1\31\1\12\1\32\1\7\1\33\12\26\1\uffff\1\14\1\34\1"+
            "\13\1\34\2\uffff\2\27\1\25\5\27\1\23\2\27\1\11\1\10\5\27\1\24"+
            "\7\27\1\21\1\uffff\1\22\3\uffff\4\27\1\2\1\3\2\27\1\1\5\27\1"+
            "\6\2\27\1\5\4\27\1\4\3\27\1\17\1\uffff\1\20",
            "\1\37\7\uffff\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\1\46",
            "\1\47",
            "",
            "\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "\1\54",
            "\1\54",
            "\1\55\4\uffff\1\55",
            "",
            "",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\64\22\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "",
            "",
            "\1\73",
            "\32\27\6\uffff\32\27",
            "\1\75",
            "\1\76",
            "\1\77",
            "\32\27\6\uffff\32\27",
            "\1\101",
            "\1\102",
            "\32\27\6\uffff\32\27",
            "\1\104",
            "\1\105",
            "\32\27\6\uffff\32\27",
            "",
            "\1\107",
            "\1\110",
            "\32\27\6\uffff\32\27",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
            "",
            "\1\114",
            "\32\27\6\uffff\32\27",
            "",
            "\32\27\6\uffff\32\27",
            "\1\116",
            "",
            "",
            "",
            "\1\117",
            "",
            "\32\27\6\uffff\32\27",
            "\32\27\6\uffff\32\27",
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
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | MAIN_NAME | LIST | COMMA | EQUAL | EOL | PARENTHESES_OPEN | PARENTHESES_CLOSE | CURLY_OPEN | CURLY_CLOSE | SQUARE_OPEN | SQUARE_CLOSE | TYPE | INT | ID | WS | POSTFIXOPER | MATHOPER | COMPROPER | STRING | COMMENT );";
        }
    }
 

}