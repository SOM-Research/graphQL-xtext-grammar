package oda.graphql.language.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGraphqlidlLexer extends Lexer {
    public static final int RULE_ENUM_VALUE=8;
    public static final int RULE_SCALAR=5;
    public static final int T__19=19;
    public static final int RULE_NULLVALUE=7;
    public static final int RULE_NONZERODIGIT=9;
    public static final int RULE_ID=14;
    public static final int RULE_COMMA=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=17;
    public static final int RULE_COMMENT=13;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_BOOLEANVALUE=6;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalGraphqlidlLexer() {;} 
    public InternalGraphqlidlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalGraphqlidlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalGraphqlidl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:11:7: ( 'schema' )
            // InternalGraphqlidl.g:11:9: 'schema'
            {
            match("schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:12:7: ( '{' )
            // InternalGraphqlidl.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:13:7: ( 'mutation' )
            // InternalGraphqlidl.g:13:9: 'mutation'
            {
            match("mutation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:14:7: ( ':' )
            // InternalGraphqlidl.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:15:7: ( 'subscription' )
            // InternalGraphqlidl.g:15:9: 'subscription'
            {
            match("subscription"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:16:7: ( '}' )
            // InternalGraphqlidl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:17:7: ( 'query' )
            // InternalGraphqlidl.g:17:9: 'query'
            {
            match("query"); 


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
            // InternalGraphqlidl.g:18:7: ( 'type' )
            // InternalGraphqlidl.g:18:9: 'type'
            {
            match("type"); 


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
            // InternalGraphqlidl.g:19:7: ( 'implements' )
            // InternalGraphqlidl.g:19:9: 'implements'
            {
            match("implements"); 


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
            // InternalGraphqlidl.g:20:7: ( 'interface' )
            // InternalGraphqlidl.g:20:9: 'interface'
            {
            match("interface"); 


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
            // InternalGraphqlidl.g:21:7: ( 'scalar' )
            // InternalGraphqlidl.g:21:9: 'scalar'
            {
            match("scalar"); 


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
            // InternalGraphqlidl.g:22:7: ( 'enum' )
            // InternalGraphqlidl.g:22:9: 'enum'
            {
            match("enum"); 


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
            // InternalGraphqlidl.g:23:7: ( 'union' )
            // InternalGraphqlidl.g:23:9: 'union'
            {
            match("union"); 


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
            // InternalGraphqlidl.g:24:7: ( '=' )
            // InternalGraphqlidl.g:24:9: '='
            {
            match('='); 

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
            // InternalGraphqlidl.g:25:7: ( '|' )
            // InternalGraphqlidl.g:25:9: '|'
            {
            match('|'); 

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
            // InternalGraphqlidl.g:26:7: ( 'input' )
            // InternalGraphqlidl.g:26:9: 'input'
            {
            match("input"); 


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
            // InternalGraphqlidl.g:27:7: ( '(' )
            // InternalGraphqlidl.g:27:9: '('
            {
            match('('); 

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
            // InternalGraphqlidl.g:28:7: ( ')' )
            // InternalGraphqlidl.g:28:9: ')'
            {
            match(')'); 

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
            // InternalGraphqlidl.g:29:7: ( '!' )
            // InternalGraphqlidl.g:29:9: '!'
            {
            match('!'); 

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
            // InternalGraphqlidl.g:30:7: ( '[' )
            // InternalGraphqlidl.g:30:9: '['
            {
            match('['); 

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
            // InternalGraphqlidl.g:31:7: ( ']' )
            // InternalGraphqlidl.g:31:9: ']'
            {
            match(']'); 

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
            // InternalGraphqlidl.g:32:7: ( '0' )
            // InternalGraphqlidl.g:32:9: '0'
            {
            match('0'); 

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
            // InternalGraphqlidl.g:33:7: ( '-' )
            // InternalGraphqlidl.g:33:9: '-'
            {
            match('-'); 

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
            // InternalGraphqlidl.g:34:7: ( '.' )
            // InternalGraphqlidl.g:34:9: '.'
            {
            match('.'); 

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
            // InternalGraphqlidl.g:35:7: ( 'e' )
            // InternalGraphqlidl.g:35:9: 'e'
            {
            match('e'); 

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
            // InternalGraphqlidl.g:36:7: ( 'E' )
            // InternalGraphqlidl.g:36:9: 'E'
            {
            match('E'); 

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
            // InternalGraphqlidl.g:37:7: ( '+' )
            // InternalGraphqlidl.g:37:9: '+'
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
            // InternalGraphqlidl.g:38:7: ( '\"' )
            // InternalGraphqlidl.g:38:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2226:12: ( ',' )
            // InternalGraphqlidl.g:2226:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2228:14: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGraphqlidl.g:2228:16: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalGraphqlidl.g:2228:20: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGraphqlidl.g:2228:20: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // InternalGraphqlidl.g:2228:36: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalGraphqlidl.g:2228:37: ( '\\r' )? '\\n'
                    {
                    // InternalGraphqlidl.g:2228:37: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalGraphqlidl.g:2228:37: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_BOOLEANVALUE"
    public final void mRULE_BOOLEANVALUE() throws RecognitionException {
        try {
            int _type = RULE_BOOLEANVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2230:19: ( ( 'true' | 'false' ) )
            // InternalGraphqlidl.g:2230:21: ( 'true' | 'false' )
            {
            // InternalGraphqlidl.g:2230:21: ( 'true' | 'false' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='t') ) {
                alt4=1;
            }
            else if ( (LA4_0=='f') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalGraphqlidl.g:2230:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:2230:29: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_BOOLEANVALUE"

    // $ANTLR start "RULE_NULLVALUE"
    public final void mRULE_NULLVALUE() throws RecognitionException {
        try {
            int _type = RULE_NULLVALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2232:16: ( 'null' )
            // InternalGraphqlidl.g:2232:18: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULLVALUE"

    // $ANTLR start "RULE_NONZERODIGIT"
    public final void mRULE_NONZERODIGIT() throws RecognitionException {
        try {
            int _type = RULE_NONZERODIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2234:19: ( '1' .. '9' )
            // InternalGraphqlidl.g:2234:21: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NONZERODIGIT"

    // $ANTLR start "RULE_SCALAR"
    public final void mRULE_SCALAR() throws RecognitionException {
        try {
            int _type = RULE_SCALAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2236:13: ( ( 'Int' | 'Float' | 'String' | 'Boolean' | 'ID' ) )
            // InternalGraphqlidl.g:2236:15: ( 'Int' | 'Float' | 'String' | 'Boolean' | 'ID' )
            {
            // InternalGraphqlidl.g:2236:15: ( 'Int' | 'Float' | 'String' | 'Boolean' | 'ID' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 'I':
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='n') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='D') ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'F':
                {
                alt5=2;
                }
                break;
            case 'S':
                {
                alt5=3;
                }
                break;
            case 'B':
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalGraphqlidl.g:2236:16: 'Int'
                    {
                    match("Int"); 


                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:2236:22: 'Float'
                    {
                    match("Float"); 


                    }
                    break;
                case 3 :
                    // InternalGraphqlidl.g:2236:30: 'String'
                    {
                    match("String"); 


                    }
                    break;
                case 4 :
                    // InternalGraphqlidl.g:2236:39: 'Boolean'
                    {
                    match("Boolean"); 


                    }
                    break;
                case 5 :
                    // InternalGraphqlidl.g:2236:49: 'ID'
                    {
                    match("ID"); 


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
    // $ANTLR end "RULE_SCALAR"

    // $ANTLR start "RULE_ENUM_VALUE"
    public final void mRULE_ENUM_VALUE() throws RecognitionException {
        try {
            int _type = RULE_ENUM_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2238:17: ( ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphqlidl.g:2238:19: ( 'A' .. 'Z' | '_' ) ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphqlidl.g:2238:34: ( 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalGraphqlidl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENUM_VALUE"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2240:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphqlidl.g:2240:13: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphqlidl.g:2240:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalGraphqlidl.g:
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
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2242:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalGraphqlidl.g:2242:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalGraphqlidl.g:2242:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGraphqlidl.g:2242:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalGraphqlidl.g:2242:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalGraphqlidl.g:
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
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2244:10: ( ( '0' .. '9' )+ )
            // InternalGraphqlidl.g:2244:12: ( '0' .. '9' )+
            {
            // InternalGraphqlidl.g:2244:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalGraphqlidl.g:2244:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2246:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalGraphqlidl.g:2246:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalGraphqlidl.g:2246:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalGraphqlidl.g:2246:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalGraphqlidl.g:2246:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalGraphqlidl.g:2246:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGraphqlidl.g:2246:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalGraphqlidl.g:2246:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalGraphqlidl.g:2246:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalGraphqlidl.g:2246:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalGraphqlidl.g:2246:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2248:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalGraphqlidl.g:2248:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalGraphqlidl.g:2248:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalGraphqlidl.g:2248:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2250:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalGraphqlidl.g:2250:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalGraphqlidl.g:2250:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalGraphqlidl.g:2250:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // InternalGraphqlidl.g:2250:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalGraphqlidl.g:2250:41: ( '\\r' )? '\\n'
                    {
                    // InternalGraphqlidl.g:2250:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalGraphqlidl.g:2250:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2252:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalGraphqlidl.g:2252:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalGraphqlidl.g:2252:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalGraphqlidl.g:
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalGraphqlidl.g:2254:16: ( . )
            // InternalGraphqlidl.g:2254:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalGraphqlidl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_COMMA | RULE_COMMENT | RULE_BOOLEANVALUE | RULE_NULLVALUE | RULE_NONZERODIGIT | RULE_SCALAR | RULE_ENUM_VALUE | RULE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=43;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalGraphqlidl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalGraphqlidl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalGraphqlidl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalGraphqlidl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalGraphqlidl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalGraphqlidl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalGraphqlidl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalGraphqlidl.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // InternalGraphqlidl.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // InternalGraphqlidl.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // InternalGraphqlidl.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // InternalGraphqlidl.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // InternalGraphqlidl.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // InternalGraphqlidl.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // InternalGraphqlidl.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // InternalGraphqlidl.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // InternalGraphqlidl.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // InternalGraphqlidl.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // InternalGraphqlidl.g:1:118: T__37
                {
                mT__37(); 

                }
                break;
            case 20 :
                // InternalGraphqlidl.g:1:124: T__38
                {
                mT__38(); 

                }
                break;
            case 21 :
                // InternalGraphqlidl.g:1:130: T__39
                {
                mT__39(); 

                }
                break;
            case 22 :
                // InternalGraphqlidl.g:1:136: T__40
                {
                mT__40(); 

                }
                break;
            case 23 :
                // InternalGraphqlidl.g:1:142: T__41
                {
                mT__41(); 

                }
                break;
            case 24 :
                // InternalGraphqlidl.g:1:148: T__42
                {
                mT__42(); 

                }
                break;
            case 25 :
                // InternalGraphqlidl.g:1:154: T__43
                {
                mT__43(); 

                }
                break;
            case 26 :
                // InternalGraphqlidl.g:1:160: T__44
                {
                mT__44(); 

                }
                break;
            case 27 :
                // InternalGraphqlidl.g:1:166: T__45
                {
                mT__45(); 

                }
                break;
            case 28 :
                // InternalGraphqlidl.g:1:172: T__46
                {
                mT__46(); 

                }
                break;
            case 29 :
                // InternalGraphqlidl.g:1:178: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 30 :
                // InternalGraphqlidl.g:1:189: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 31 :
                // InternalGraphqlidl.g:1:202: RULE_BOOLEANVALUE
                {
                mRULE_BOOLEANVALUE(); 

                }
                break;
            case 32 :
                // InternalGraphqlidl.g:1:220: RULE_NULLVALUE
                {
                mRULE_NULLVALUE(); 

                }
                break;
            case 33 :
                // InternalGraphqlidl.g:1:235: RULE_NONZERODIGIT
                {
                mRULE_NONZERODIGIT(); 

                }
                break;
            case 34 :
                // InternalGraphqlidl.g:1:253: RULE_SCALAR
                {
                mRULE_SCALAR(); 

                }
                break;
            case 35 :
                // InternalGraphqlidl.g:1:265: RULE_ENUM_VALUE
                {
                mRULE_ENUM_VALUE(); 

                }
                break;
            case 36 :
                // InternalGraphqlidl.g:1:281: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 37 :
                // InternalGraphqlidl.g:1:291: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 38 :
                // InternalGraphqlidl.g:1:299: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 39 :
                // InternalGraphqlidl.g:1:308: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 40 :
                // InternalGraphqlidl.g:1:320: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 41 :
                // InternalGraphqlidl.g:1:336: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalGraphqlidl.g:1:352: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 43 :
                // InternalGraphqlidl.g:1:360: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\53\1\uffff\1\53\2\uffff\3\53\1\66\1\53\7\uffff\1\77\2\uffff\1\104\1\uffff\1\107\2\uffff\2\53\1\114\5\117\1\53\3\47\2\uffff\3\53\2\uffff\1\53\2\uffff\6\53\1\uffff\1\53\13\uffff\1\117\6\uffff\2\53\1\uffff\1\53\1\146\1\uffff\3\53\4\uffff\16\53\1\146\1\uffff\10\53\1\u0080\1\u0081\3\53\1\u0085\2\53\1\u0088\7\53\1\u0090\2\uffff\2\53\1\u0093\1\uffff\1\u0094\1\u0081\1\uffff\1\146\2\53\1\u0097\1\u0098\2\53\1\uffff\2\53\2\uffff\1\146\1\53\2\uffff\4\53\1\146\1\53\1\u00a3\3\53\1\uffff\1\53\1\u00a8\1\53\1\u00aa\1\uffff\1\53\1\uffff\1\u00ac\1\uffff";
    static final String DFA19_eofS =
        "\u00ad\uffff";
    static final String DFA19_minS =
        "\1\0\1\60\1\uffff\1\60\2\uffff\5\60\7\uffff\1\60\2\uffff\1\60\1\uffff\1\0\2\uffff\11\60\1\101\1\0\1\52\2\uffff\3\60\2\uffff\1\60\2\uffff\6\60\1\uffff\1\60\13\uffff\1\60\6\uffff\2\60\1\uffff\2\60\1\uffff\3\60\4\uffff\17\60\1\uffff\31\60\2\uffff\3\60\1\uffff\2\60\1\uffff\7\60\1\uffff\2\60\2\uffff\2\60\2\uffff\12\60\1\uffff\4\60\1\uffff\1\60\1\uffff\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\172\1\uffff\1\172\2\uffff\5\172\7\uffff\1\71\2\uffff\1\172\1\uffff\1\uffff\2\uffff\2\172\1\71\7\172\1\uffff\1\57\2\uffff\3\172\2\uffff\1\172\2\uffff\6\172\1\uffff\1\172\13\uffff\1\172\6\uffff\2\172\1\uffff\2\172\1\uffff\3\172\4\uffff\17\172\1\uffff\31\172\2\uffff\3\172\1\uffff\2\172\1\uffff\7\172\1\uffff\2\172\2\uffff\2\172\2\uffff\12\172\1\uffff\4\172\1\uffff\1\172\1\uffff\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\6\5\uffff\1\16\1\17\1\21\1\22\1\23\1\24\1\25\1\uffff\1\27\1\30\1\uffff\1\33\1\uffff\1\35\1\36\14\uffff\1\52\1\53\3\uffff\1\44\1\2\1\uffff\1\4\1\6\6\uffff\1\31\1\uffff\1\16\1\17\1\21\1\22\1\23\1\24\1\25\1\26\1\46\1\27\1\30\1\uffff\1\32\1\33\1\47\1\34\1\35\1\36\2\uffff\1\41\2\uffff\1\43\3\uffff\1\45\1\50\1\51\1\52\17\uffff\1\42\31\uffff\1\10\1\37\3\uffff\1\14\2\uffff\1\40\7\uffff\1\7\2\uffff\1\20\1\15\2\uffff\1\1\1\13\12\uffff\1\3\4\uffff\1\12\1\uffff\1\11\1\uffff\1\5";
    static final String DFA19_specialS =
        "\1\0\26\uffff\1\1\14\uffff\1\2\u0088\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\47\2\46\2\47\1\46\22\47\1\46\1\17\1\27\1\31\3\47\1\44\1\15\1\16\1\47\1\26\1\30\1\23\1\24\1\45\1\22\11\34\1\4\2\47\1\13\3\47\1\41\1\40\2\41\1\25\1\36\2\41\1\35\11\41\1\37\7\41\1\20\1\47\1\21\1\43\1\41\1\47\4\42\1\11\1\32\2\42\1\10\3\42\1\3\1\33\2\42\1\6\1\42\1\1\1\7\1\12\5\42\1\2\1\14\1\5\uff82\47",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\50\21\52\1\51\5\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\55\5\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\60\5\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\62\6\52\1\61\1\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\63\1\64\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\65\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\67\14\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\100",
            "",
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\52",
            "",
            "\0\106",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\112\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\113\5\52",
            "\12\100",
            "\12\103\7\uffff\3\103\1\116\26\103\4\uffff\1\103\1\uffff\15\52\1\115\14\52",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\13\52\1\120\16\52",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\23\52\1\121\6\52",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\16\52\1\122\13\52",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\32\123\4\uffff\1\123\1\uffff\32\123",
            "\0\106",
            "\1\124\4\uffff\1\125",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\130\6\52\1\127\22\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\52\1\131\30\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\132\6\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\133\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\134\12\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\135\5\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\136\12\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\140\3\52\1\137\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\141\5\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\142\21\52",
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
            "",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\143\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\144\16\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\145\6\52",
            "\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\147\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\150\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\151\13\52",
            "",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\152\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\153\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\154\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\155\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\156\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\157\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\160\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\161\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\162\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\24\52\1\163\5\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\164\15\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\165\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\166\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\167\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\170\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\171\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\13\52\1\172\16\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\173\15\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\174\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\175\27\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\176\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\30\52\1\177\1\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0082\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u0083\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0084\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u0086\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u0087\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u0089\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u008a\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u008b\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u008c\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u008d\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\21\52\1\u008e\10\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u008f\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\14\52\1\u0091\15\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\u0092\24\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\6\52\1\u0095\23\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u0096\31\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u0099\21\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u009a\13\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u009b\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\1\u009c\31\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u009d\14\52",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\17\52\1\u009e\12\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u009f\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00a0\14\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\2\52\1\u00a1\27\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00a2\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\u00a4\6\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\4\52\1\u00a5\25\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\10\52\1\u00a6\21\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u00a7\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\16\52\1\u00a9\13\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u00ab\14\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | RULE_COMMA | RULE_COMMENT | RULE_BOOLEANVALUE | RULE_NULLVALUE | RULE_NONZERODIGIT | RULE_SCALAR | RULE_ENUM_VALUE | RULE_NAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='s') ) {s = 1;}

                        else if ( (LA19_0=='{') ) {s = 2;}

                        else if ( (LA19_0=='m') ) {s = 3;}

                        else if ( (LA19_0==':') ) {s = 4;}

                        else if ( (LA19_0=='}') ) {s = 5;}

                        else if ( (LA19_0=='q') ) {s = 6;}

                        else if ( (LA19_0=='t') ) {s = 7;}

                        else if ( (LA19_0=='i') ) {s = 8;}

                        else if ( (LA19_0=='e') ) {s = 9;}

                        else if ( (LA19_0=='u') ) {s = 10;}

                        else if ( (LA19_0=='=') ) {s = 11;}

                        else if ( (LA19_0=='|') ) {s = 12;}

                        else if ( (LA19_0=='(') ) {s = 13;}

                        else if ( (LA19_0==')') ) {s = 14;}

                        else if ( (LA19_0=='!') ) {s = 15;}

                        else if ( (LA19_0=='[') ) {s = 16;}

                        else if ( (LA19_0==']') ) {s = 17;}

                        else if ( (LA19_0=='0') ) {s = 18;}

                        else if ( (LA19_0=='-') ) {s = 19;}

                        else if ( (LA19_0=='.') ) {s = 20;}

                        else if ( (LA19_0=='E') ) {s = 21;}

                        else if ( (LA19_0=='+') ) {s = 22;}

                        else if ( (LA19_0=='\"') ) {s = 23;}

                        else if ( (LA19_0==',') ) {s = 24;}

                        else if ( (LA19_0=='#') ) {s = 25;}

                        else if ( (LA19_0=='f') ) {s = 26;}

                        else if ( (LA19_0=='n') ) {s = 27;}

                        else if ( ((LA19_0>='1' && LA19_0<='9')) ) {s = 28;}

                        else if ( (LA19_0=='I') ) {s = 29;}

                        else if ( (LA19_0=='F') ) {s = 30;}

                        else if ( (LA19_0=='S') ) {s = 31;}

                        else if ( (LA19_0=='B') ) {s = 32;}

                        else if ( (LA19_0=='A'||(LA19_0>='C' && LA19_0<='D')||(LA19_0>='G' && LA19_0<='H')||(LA19_0>='J' && LA19_0<='R')||(LA19_0>='T' && LA19_0<='Z')||LA19_0=='_') ) {s = 33;}

                        else if ( ((LA19_0>='a' && LA19_0<='d')||(LA19_0>='g' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='l')||(LA19_0>='o' && LA19_0<='p')||LA19_0=='r'||(LA19_0>='v' && LA19_0<='z')) ) {s = 34;}

                        else if ( (LA19_0=='^') ) {s = 35;}

                        else if ( (LA19_0=='\'') ) {s = 36;}

                        else if ( (LA19_0=='/') ) {s = 37;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 38;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||(LA19_0>='$' && LA19_0<='&')||LA19_0=='*'||(LA19_0>=';' && LA19_0<='<')||(LA19_0>='>' && LA19_0<='@')||LA19_0=='\\'||LA19_0=='`'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 39;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_23 = input.LA(1);

                        s = -1;
                        if ( ((LA19_23>='\u0000' && LA19_23<='\uFFFF')) ) {s = 70;}

                        else s = 71;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_36 = input.LA(1);

                        s = -1;
                        if ( ((LA19_36>='\u0000' && LA19_36<='\uFFFF')) ) {s = 70;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}