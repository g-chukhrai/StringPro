// $ANTLR 3.2 Sep 23, 2009 12:02:23 C.g 2009-11-23 14:20:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CLexer extends Lexer {
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

    public CLexer() {;} 
    public CLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C.g"; }

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:3:8: ( '=' )
            // C.g:3:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:4:7: ( '(' )
            // C.g:4:9: '('
            {
            match('('); 

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
            // C.g:5:7: ( ')' )
            // C.g:5:9: ')'
            {
            match(')'); 

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
            // C.g:6:7: ( ';' )
            // C.g:6:9: ';'
            {
            match(';'); 

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
            // C.g:7:7: ( 'void' )
            // C.g:7:9: 'void'
            {
            match("void"); 


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
            // C.g:8:7: ( 'int' )
            // C.g:8:9: 'int'
            {
            match("int"); 


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
            // C.g:9:7: ( '[' )
            // C.g:9:9: '['
            {
            match('['); 

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
            // C.g:10:7: ( ']' )
            // C.g:10:9: ']'
            {
            match(']'); 

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
            // C.g:11:7: ( ',' )
            // C.g:11:9: ','
            {
            match(','); 

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
            // C.g:12:7: ( 'return' )
            // C.g:12:9: 'return'
            {
            match("return"); 


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
            // C.g:13:7: ( 'if' )
            // C.g:13:9: 'if'
            {
            match("if"); 


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
            // C.g:14:7: ( 'else' )
            // C.g:14:9: 'else'
            {
            match("else"); 


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
            // C.g:15:7: ( 'while' )
            // C.g:15:9: 'while'
            {
            match("while"); 


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
            // C.g:16:7: ( '{' )
            // C.g:16:9: '{'
            {
            match('{'); 

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
            // C.g:17:7: ( '}' )
            // C.g:17:9: '}'
            {
            match('}'); 

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
            // C.g:18:7: ( '==' )
            // C.g:18:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:19:7: ( '!=' )
            // C.g:19:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:20:7: ( '<' )
            // C.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:21:7: ( '>' )
            // C.g:21:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:22:7: ( '<=' )
            // C.g:22:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:23:7: ( '>=' )
            // C.g:23:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:24:7: ( '+' )
            // C.g:24:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:25:7: ( '-' )
            // C.g:25:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:26:7: ( '*' )
            // C.g:26:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:27:7: ( '/' )
            // C.g:27:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:129:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // C.g:129:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C.g:129:11: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C.g:134:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "LETTER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:139:5: ( ( '0' .. '9' )+ )
            // C.g:139:7: ( '0' .. '9' )+
            {
            // C.g:139:7: ( '0' .. '9' )+
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
            	    // C.g:139:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:141:7: ( '\"' ( . )* '\"' )
            // C.g:141:9: '\"' ( . )* '\"'
            {
            match('\"'); 
            // C.g:141:13: ( . )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\"') ) {
                    alt3=2;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C.g:141:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 
            setText(getText().substring(1, getText().length()-1));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:143:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C.g:143:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
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

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:147:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C.g:147:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C.g:147:14: ( options {greedy=false; } : . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='*') ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1=='/') ) {
                        alt4=2;
                    }
                    else if ( ((LA4_1>='\u0000' && LA4_1<='.')||(LA4_1>='0' && LA4_1<='\uFFFF')) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>='\u0000' && LA4_0<=')')||(LA4_0>='+' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C.g:147:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C.g:151:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C.g:151:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C.g:151:12: (~ ( '\\n' | '\\r' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C.g:151:12: ~ ( '\\n' | '\\r' )
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
            	    break loop5;
                }
            } while (true);

            // C.g:151:26: ( '\\r' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\r') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C.g:151:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // C.g:1:8: ( ASSIGN | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | ID | INT | STRING | WS | COMMENT | LINE_COMMENT )
        int alt7=31;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // C.g:1:10: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 2 :
                // C.g:1:17: T__25
                {
                mT__25(); 

                }
                break;
            case 3 :
                // C.g:1:23: T__26
                {
                mT__26(); 

                }
                break;
            case 4 :
                // C.g:1:29: T__27
                {
                mT__27(); 

                }
                break;
            case 5 :
                // C.g:1:35: T__28
                {
                mT__28(); 

                }
                break;
            case 6 :
                // C.g:1:41: T__29
                {
                mT__29(); 

                }
                break;
            case 7 :
                // C.g:1:47: T__30
                {
                mT__30(); 

                }
                break;
            case 8 :
                // C.g:1:53: T__31
                {
                mT__31(); 

                }
                break;
            case 9 :
                // C.g:1:59: T__32
                {
                mT__32(); 

                }
                break;
            case 10 :
                // C.g:1:65: T__33
                {
                mT__33(); 

                }
                break;
            case 11 :
                // C.g:1:71: T__34
                {
                mT__34(); 

                }
                break;
            case 12 :
                // C.g:1:77: T__35
                {
                mT__35(); 

                }
                break;
            case 13 :
                // C.g:1:83: T__36
                {
                mT__36(); 

                }
                break;
            case 14 :
                // C.g:1:89: T__37
                {
                mT__37(); 

                }
                break;
            case 15 :
                // C.g:1:95: T__38
                {
                mT__38(); 

                }
                break;
            case 16 :
                // C.g:1:101: T__39
                {
                mT__39(); 

                }
                break;
            case 17 :
                // C.g:1:107: T__40
                {
                mT__40(); 

                }
                break;
            case 18 :
                // C.g:1:113: T__41
                {
                mT__41(); 

                }
                break;
            case 19 :
                // C.g:1:119: T__42
                {
                mT__42(); 

                }
                break;
            case 20 :
                // C.g:1:125: T__43
                {
                mT__43(); 

                }
                break;
            case 21 :
                // C.g:1:131: T__44
                {
                mT__44(); 

                }
                break;
            case 22 :
                // C.g:1:137: T__45
                {
                mT__45(); 

                }
                break;
            case 23 :
                // C.g:1:143: T__46
                {
                mT__46(); 

                }
                break;
            case 24 :
                // C.g:1:149: T__47
                {
                mT__47(); 

                }
                break;
            case 25 :
                // C.g:1:155: T__48
                {
                mT__48(); 

                }
                break;
            case 26 :
                // C.g:1:161: ID
                {
                mID(); 

                }
                break;
            case 27 :
                // C.g:1:164: INT
                {
                mINT(); 

                }
                break;
            case 28 :
                // C.g:1:168: STRING
                {
                mSTRING(); 

                }
                break;
            case 29 :
                // C.g:1:175: WS
                {
                mWS(); 

                }
                break;
            case 30 :
                // C.g:1:178: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 31 :
                // C.g:1:186: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\1\33\3\uffff\2\26\3\uffff\3\26\3\uffff\1\43\1\45\3\uffff"+
        "\1\50\6\uffff\2\26\1\53\3\26\7\uffff\1\26\1\60\1\uffff\3\26\1\64"+
        "\1\uffff\1\26\1\66\1\26\1\uffff\1\26\1\uffff\1\71\1\72\2\uffff";
    static final String DFA7_eofS =
        "\73\uffff";
    static final String DFA7_minS =
        "\1\11\1\75\3\uffff\1\157\1\146\3\uffff\1\145\1\154\1\150\3\uffff"+
        "\2\75\3\uffff\1\52\6\uffff\1\151\1\164\1\60\1\164\1\163\1\151\7"+
        "\uffff\1\144\1\60\1\uffff\1\165\1\145\1\154\1\60\1\uffff\1\162\1"+
        "\60\1\145\1\uffff\1\156\1\uffff\2\60\2\uffff";
    static final String DFA7_maxS =
        "\1\175\1\75\3\uffff\1\157\1\156\3\uffff\1\145\1\154\1\150\3\uffff"+
        "\2\75\3\uffff\1\57\6\uffff\1\151\1\164\1\172\1\164\1\163\1\151\7"+
        "\uffff\1\144\1\172\1\uffff\1\165\1\145\1\154\1\172\1\uffff\1\162"+
        "\1\172\1\145\1\uffff\1\156\1\uffff\2\172\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\4\2\uffff\1\7\1\10\1\11\3\uffff\1\16\1\17\1\21"+
        "\2\uffff\1\26\1\27\1\30\1\uffff\1\32\1\33\1\34\1\35\1\20\1\1\6\uffff"+
        "\1\24\1\22\1\25\1\23\1\36\1\37\1\31\2\uffff\1\13\4\uffff\1\6\3\uffff"+
        "\1\5\1\uffff\1\14\2\uffff\1\15\1\12";
    static final String DFA7_specialS =
        "\73\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\31\1\uffff\2\31\22\uffff\1\31\1\17\1\30\5\uffff\1\2\1\3\1"+
            "\24\1\22\1\11\1\23\1\uffff\1\25\12\27\1\uffff\1\4\1\20\1\1\1"+
            "\21\2\uffff\32\26\1\7\1\uffff\1\10\1\uffff\1\26\1\uffff\4\26"+
            "\1\13\3\26\1\6\10\26\1\12\3\26\1\5\1\14\3\26\1\15\1\uffff\1"+
            "\16",
            "\1\32",
            "",
            "",
            "",
            "\1\34",
            "\1\36\7\uffff\1\35",
            "",
            "",
            "",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "",
            "",
            "\1\42",
            "\1\44",
            "",
            "",
            "",
            "\1\46\4\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\51",
            "\1\52",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\65",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\67",
            "",
            "\1\70",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
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
            return "1:1: Tokens : ( ASSIGN | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | ID | INT | STRING | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}