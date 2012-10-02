package org.sqlproc.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProcessorDslLexer extends Lexer {
    public static final int RULE_OR=29;
    public static final int RULE_PERCENT=27;
    public static final int RULE_AND=28;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int RULE_REST=4;
    public static final int T__90=90;
    public static final int RULE_LPAREN=13;
    public static final int RULE_IDENT_DOT=5;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_BAND=19;
    public static final int T__80=80;
    public static final int RULE_RBRACE=16;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_HASH=21;
    public static final int RULE_COMMA=10;
    public static final int T__85=85;
    public static final int RULE_QUESTI=17;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=37;
    public static final int RULE_ON_OFF=31;
    public static final int RULE_MINUS=11;
    public static final int RULE_STRING=9;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_IDENT=6;
    public static final int RULE_RPAREN=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_AT=22;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_SEMICOLON=36;
    public static final int RULE_OPTION_TYPE=34;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_NOT=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_NUMBER=7;
    public static final int T__59=59;
    public static final int RULE_LBRACE=15;
    public static final int RULE_BOR=20;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_CARET=23;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_MORE_THAN=26;
    public static final int RULE_STATEMEN_TYPE=32;
    public static final int RULE_PLUS=12;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=38;
    public static final int RULE_COLON=8;
    public static final int RULE_ESC_CHAR=30;
    public static final int T__39=39;
    public static final int RULE_EQUALS=24;
    public static final int RULE_LESS_THAN=25;
    public static final int RULE_WS=35;
    public static final int RULE_MAPPING_TYPE=33;

    // delegates
    // delegators

    public InternalProcessorDslLexer() {;} 
    public InternalProcessorDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProcessorDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:7: ( '_char' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:11:9: '_char'
            {
            match("_char"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:7: ( '_byte' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:12:9: '_byte'
            {
            match("_byte"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:7: ( '_short' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:13:9: '_short'
            {
            match("_short"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:7: ( '_int' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:14:9: '_int'
            {
            match("_int"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:7: ( '_long' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:15:9: '_long'
            {
            match("_long"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:7: ( '_float' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:16:9: '_float'
            {
            match("_float"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:7: ( '_double' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:17:9: '_double'
            {
            match("_double"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:7: ( '_boolean' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:18:9: '_boolean'
            {
            match("_boolean"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:7: ( '->' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:19:9: '->'
            {
            match("->"); 


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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:7: ( 'pojo' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:20:9: 'pojo'
            {
            match("pojo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:7: ( 'col' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:21:9: 'col'
            {
            match("col"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:7: ( 'ident' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:22:9: 'ident'
            {
            match("ident"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:7: ( 'const' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:23:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:7: ( 'out' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:7: ( 'colx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:25:9: 'colx'
            {
            match("colx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:7: ( 'identx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:26:9: 'identx'
            {
            match("identx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:7: ( 'constx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:27:9: 'constx'
            {
            match("constx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:7: ( 'outx' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:28:9: 'outx'
            {
            match("outx"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:7: ( 'table' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:29:9: 'table'
            {
            match("table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:7: ( 'dbcol' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:30:9: 'dbcol'
            {
            match("dbcol"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:7: ( 'prefix' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:31:9: 'prefix'
            {
            match("prefix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:7: ( 'package' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:32:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:7: ( 'suffix' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:33:9: 'suffix'
            {
            match("suffix"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:7: ( 'import' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:34:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:7: ( 'implements' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:35:9: 'implements'
            {
            match("implements"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:7: ( 'extends' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:36:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:7: ( 'discriminator' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:37:9: 'discriminator'
            {
            match("discriminator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:38:7: ( 'serializable' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:38:9: 'serializable'
            {
            match("serializable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:39:7: ( '.*' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:39:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:40:7: ( 'resolve references' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:40:9: 'resolve references'
            {
            match("resolve references"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:41:7: ( 'database' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:41:9: 'database'
            {
            match("database"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:42:7: ( 'pojogen' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:42:9: 'pojogen'
            {
            match("pojogen"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:43:7: ( 'online' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:43:9: 'online'
            {
            match("online"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:44:7: ( 'url' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:44:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:45:7: ( 'username' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:45:9: 'username'
            {
            match("username"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:46:7: ( 'password' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:46:9: 'password'
            {
            match("password"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:47:7: ( 'schema' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:47:9: 'schema'
            {
            match("schema"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:48:7: ( 'driver' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:48:9: 'driver'
            {
            match("driver"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:49:7: ( 'types sqltypes' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:49:9: 'types sqltypes'
            {
            match("types sqltypes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:50:7: ( 'types in table' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:50:9: 'types in table'
            {
            match("types in table"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:51:7: ( 'types for columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:51:9: 'types for columns'
            {
            match("types for columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:52:7: ( 'ignore tables' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:52:9: 'ignore tables'
            {
            match("ignore tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:53:7: ( 'only tables' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:53:9: 'only tables'
            {
            match("only tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:54:7: ( 'ignore columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:54:9: 'ignore columns'
            {
            match("ignore columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:55:7: ( 'required columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:55:9: 'required columns'
            {
            match("required columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:56:7: ( 'not required columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:56:9: 'not required columns'
            {
            match("not required columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:57:7: ( 'create columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:57:9: 'create columns'
            {
            match("create columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:58:7: ( 'rename tables' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:58:9: 'rename tables'
            {
            match("rename tables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:59:7: ( 'rename columns' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:59:9: 'rename columns'
            {
            match("rename columns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:60:7: ( 'ignore one-to-many' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:60:9: 'ignore one-to-many'
            {
            match("ignore one-to-many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:61:7: ( 'ignore many-to-one' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:61:9: 'ignore many-to-one'
            {
            match("ignore many-to-one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:62:7: ( 'inherit many-to-one' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:62:9: 'inherit many-to-one'
            {
            match("inherit many-to-one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:63:7: ( 'create one-to-many' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:63:9: 'create one-to-many'
            {
            match("create one-to-many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:64:7: ( 'create many-to-one' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:64:9: 'create many-to-one'
            {
            match("create many-to-one"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:65:7: ( 'tables many-to-many' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:65:9: 'tables many-to-many'
            {
            match("tables many-to-many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:66:7: ( 'inherit discriminator' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:66:9: 'inherit discriminator'
            {
            match("inherit discriminator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:67:7: ( 'generate methods' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:67:9: 'generate methods'
            {
            match("generate methods"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:68:7: ( '[]' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:68:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:69:7: ( 'final' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:69:9: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:70:7: ( 'abstract' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:70:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:71:7: ( 'required' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:71:9: 'required'
            {
            match("required"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:72:8: ( 'primaryKey' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:72:10: 'primaryKey'
            {
            match("primaryKey"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "RULE_ON_OFF"
    public final void mRULE_ON_OFF() throws RecognitionException {
        try {
            int _type = RULE_ON_OFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24851:13: ( ( 'ON' | 'OFF' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24851:15: ( 'ON' | 'OFF' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24851:15: ( 'ON' | 'OFF' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='N') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='F') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24851:16: 'ON'
                    {
                    match("ON"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24851:21: 'OFF'
                    {
                    match("OFF"); 


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
    // $ANTLR end "RULE_ON_OFF"

    // $ANTLR start "RULE_STATEMEN_TYPE"
    public final void mRULE_STATEMEN_TYPE() throws RecognitionException {
        try {
            int _type = RULE_STATEMEN_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24853:20: ( ( 'QRY' | 'CRUD' | 'CALL' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24853:22: ( 'QRY' | 'CRUD' | 'CALL' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24853:22: ( 'QRY' | 'CRUD' | 'CALL' )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='Q') ) {
                alt2=1;
            }
            else if ( (LA2_0=='C') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='R') ) {
                    alt2=2;
                }
                else if ( (LA2_2=='A') ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24853:23: 'QRY'
                    {
                    match("QRY"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24853:29: 'CRUD'
                    {
                    match("CRUD"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24853:36: 'CALL'
                    {
                    match("CALL"); 


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
    // $ANTLR end "RULE_STATEMEN_TYPE"

    // $ANTLR start "RULE_MAPPING_TYPE"
    public final void mRULE_MAPPING_TYPE() throws RecognitionException {
        try {
            int _type = RULE_MAPPING_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24855:19: ( 'OUT' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24855:21: 'OUT'
            {
            match("OUT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MAPPING_TYPE"

    // $ANTLR start "RULE_OPTION_TYPE"
    public final void mRULE_OPTION_TYPE() throws RecognitionException {
        try {
            int _type = RULE_OPTION_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:18: ( ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:20: ( 'OPT' | 'LOPT' | 'IOPT' | 'SOPT' | 'BOPT' )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 'O':
                {
                alt3=1;
                }
                break;
            case 'L':
                {
                alt3=2;
                }
                break;
            case 'I':
                {
                alt3=3;
                }
                break;
            case 'S':
                {
                alt3=4;
                }
                break;
            case 'B':
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:21: 'OPT'
                    {
                    match("OPT"); 


                    }
                    break;
                case 2 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:27: 'LOPT'
                    {
                    match("LOPT"); 


                    }
                    break;
                case 3 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:34: 'IOPT'
                    {
                    match("IOPT"); 


                    }
                    break;
                case 4 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:41: 'SOPT'
                    {
                    match("SOPT"); 


                    }
                    break;
                case 5 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24857:48: 'BOPT'
                    {
                    match("BOPT"); 


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
    // $ANTLR end "RULE_OPTION_TYPE"

    // $ANTLR start "RULE_IDENT_DOT"
    public final void mRULE_IDENT_DOT() throws RecognitionException {
        try {
            int _type = RULE_IDENT_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24859:16: ( RULE_IDENT ( '.' RULE_IDENT )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24859:18: RULE_IDENT ( '.' RULE_IDENT )+
            {
            mRULE_IDENT(); 
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24859:29: ( '.' RULE_IDENT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24859:30: '.' RULE_IDENT
            	    {
            	    match('.'); 
            	    mRULE_IDENT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT_DOT"

    // $ANTLR start "RULE_IDENT"
    public final void mRULE_IDENT() throws RecognitionException {
        try {
            int _type = RULE_IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24861:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )* )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24861:14: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24861:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '=' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||LA5_0=='='||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='='||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENT"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24863:13: ( ( '0' .. '9' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24863:15: ( '0' .. '9' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24863:15: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24863:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_ESC_CHAR"
    public final void mRULE_ESC_CHAR() throws RecognitionException {
        try {
            int _type = RULE_ESC_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24865:15: ( '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '.' | '/' ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24865:17: '\\\\' ( RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_LBRACE | RULE_RBRACE | RULE_BOR | RULE_HASH | RULE_AT | RULE_PERCENT | '.' | '/' )
            {
            match('\\'); 
            if ( (input.LA(1)>='#' && input.LA(1)<='%')||(input.LA(1)>='.' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<=';')||input.LA(1)=='@'||(input.LA(1)>='{' && input.LA(1)<='}') ) {
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
    // $ANTLR end "RULE_ESC_CHAR"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24867:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24867:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24867:24: ( options {greedy=false; } : . )*
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
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24867:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:41: ( '\\r' )? '\\n'
                    {
                    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24869:41: '\\r'
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
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24871:9: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24871:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24871:11: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_AND"
    public final void mRULE_AND() throws RecognitionException {
        try {
            int _type = RULE_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24873:10: ( '&' '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24873:12: '&' '&'
            {
            match('&'); 
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND"

    // $ANTLR start "RULE_OR"
    public final void mRULE_OR() throws RecognitionException {
        try {
            int _type = RULE_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24875:9: ( '|' '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24875:11: '|' '|'
            {
            match('|'); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24877:12: ( ':' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24877:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_SEMICOLON"
    public final void mRULE_SEMICOLON() throws RecognitionException {
        try {
            int _type = RULE_SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24879:16: ( ';' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24879:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMICOLON"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24881:13: ( '$' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24881:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24883:12: ( ',' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24883:14: ','
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

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24885:12: ( '-' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24885:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24887:11: ( '+' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24887:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24889:13: ( '(' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24889:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24891:13: ( ')' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24891:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_LBRACE"
    public final void mRULE_LBRACE() throws RecognitionException {
        try {
            int _type = RULE_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24893:13: ( '{' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24893:15: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACE"

    // $ANTLR start "RULE_RBRACE"
    public final void mRULE_RBRACE() throws RecognitionException {
        try {
            int _type = RULE_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24895:13: ( '}' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24895:15: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACE"

    // $ANTLR start "RULE_QUESTI"
    public final void mRULE_QUESTI() throws RecognitionException {
        try {
            int _type = RULE_QUESTI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24897:13: ( '?' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24897:15: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTI"

    // $ANTLR start "RULE_NOT"
    public final void mRULE_NOT() throws RecognitionException {
        try {
            int _type = RULE_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24899:10: ( '!' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24899:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT"

    // $ANTLR start "RULE_BAND"
    public final void mRULE_BAND() throws RecognitionException {
        try {
            int _type = RULE_BAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24901:11: ( '&' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24901:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BAND"

    // $ANTLR start "RULE_BOR"
    public final void mRULE_BOR() throws RecognitionException {
        try {
            int _type = RULE_BOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24903:10: ( '|' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24903:12: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOR"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24905:11: ( '#' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24905:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_AT"
    public final void mRULE_AT() throws RecognitionException {
        try {
            int _type = RULE_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24907:9: ( '@' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24907:11: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24909:12: ( '^' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24909:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_EQUALS"
    public final void mRULE_EQUALS() throws RecognitionException {
        try {
            int _type = RULE_EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24911:13: ( '=' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24911:15: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUALS"

    // $ANTLR start "RULE_LESS_THAN"
    public final void mRULE_LESS_THAN() throws RecognitionException {
        try {
            int _type = RULE_LESS_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24913:16: ( '<' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24913:18: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LESS_THAN"

    // $ANTLR start "RULE_MORE_THAN"
    public final void mRULE_MORE_THAN() throws RecognitionException {
        try {
            int _type = RULE_MORE_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24915:16: ( '>' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24915:18: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MORE_THAN"

    // $ANTLR start "RULE_PERCENT"
    public final void mRULE_PERCENT() throws RecognitionException {
        try {
            int _type = RULE_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24917:14: ( '%' )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24917:16: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PERCENT"

    // $ANTLR start "RULE_REST"
    public final void mRULE_REST() throws RecognitionException {
        try {
            int _type = RULE_REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24919:11: (~ ( RULE_SEMICOLON ) )
            // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:24919:13: ~ ( RULE_SEMICOLON )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<=':')||(input.LA(1)>='<' && input.LA(1)<='\uFFFF') ) {
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
    // $ANTLR end "RULE_REST"

    public void mTokens() throws RecognitionException {
        // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST )
        int alt12=97;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:172: T__66
                {
                mT__66(); 

                }
                break;
            case 29 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:178: T__67
                {
                mT__67(); 

                }
                break;
            case 30 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:184: T__68
                {
                mT__68(); 

                }
                break;
            case 31 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:190: T__69
                {
                mT__69(); 

                }
                break;
            case 32 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:196: T__70
                {
                mT__70(); 

                }
                break;
            case 33 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:202: T__71
                {
                mT__71(); 

                }
                break;
            case 34 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:208: T__72
                {
                mT__72(); 

                }
                break;
            case 35 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:214: T__73
                {
                mT__73(); 

                }
                break;
            case 36 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:220: T__74
                {
                mT__74(); 

                }
                break;
            case 37 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:226: T__75
                {
                mT__75(); 

                }
                break;
            case 38 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:232: T__76
                {
                mT__76(); 

                }
                break;
            case 39 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:238: T__77
                {
                mT__77(); 

                }
                break;
            case 40 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:244: T__78
                {
                mT__78(); 

                }
                break;
            case 41 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:250: T__79
                {
                mT__79(); 

                }
                break;
            case 42 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:256: T__80
                {
                mT__80(); 

                }
                break;
            case 43 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:262: T__81
                {
                mT__81(); 

                }
                break;
            case 44 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:268: T__82
                {
                mT__82(); 

                }
                break;
            case 45 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:274: T__83
                {
                mT__83(); 

                }
                break;
            case 46 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:280: T__84
                {
                mT__84(); 

                }
                break;
            case 47 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:286: T__85
                {
                mT__85(); 

                }
                break;
            case 48 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:292: T__86
                {
                mT__86(); 

                }
                break;
            case 49 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:298: T__87
                {
                mT__87(); 

                }
                break;
            case 50 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:304: T__88
                {
                mT__88(); 

                }
                break;
            case 51 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:310: T__89
                {
                mT__89(); 

                }
                break;
            case 52 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:316: T__90
                {
                mT__90(); 

                }
                break;
            case 53 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:322: T__91
                {
                mT__91(); 

                }
                break;
            case 54 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:328: T__92
                {
                mT__92(); 

                }
                break;
            case 55 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:334: T__93
                {
                mT__93(); 

                }
                break;
            case 56 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:340: T__94
                {
                mT__94(); 

                }
                break;
            case 57 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:346: T__95
                {
                mT__95(); 

                }
                break;
            case 58 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:352: T__96
                {
                mT__96(); 

                }
                break;
            case 59 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:358: T__97
                {
                mT__97(); 

                }
                break;
            case 60 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:364: T__98
                {
                mT__98(); 

                }
                break;
            case 61 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:370: T__99
                {
                mT__99(); 

                }
                break;
            case 62 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:376: T__100
                {
                mT__100(); 

                }
                break;
            case 63 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:383: RULE_ON_OFF
                {
                mRULE_ON_OFF(); 

                }
                break;
            case 64 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:395: RULE_STATEMEN_TYPE
                {
                mRULE_STATEMEN_TYPE(); 

                }
                break;
            case 65 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:414: RULE_MAPPING_TYPE
                {
                mRULE_MAPPING_TYPE(); 

                }
                break;
            case 66 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:432: RULE_OPTION_TYPE
                {
                mRULE_OPTION_TYPE(); 

                }
                break;
            case 67 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:449: RULE_IDENT_DOT
                {
                mRULE_IDENT_DOT(); 

                }
                break;
            case 68 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:464: RULE_IDENT
                {
                mRULE_IDENT(); 

                }
                break;
            case 69 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:475: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 70 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:487: RULE_ESC_CHAR
                {
                mRULE_ESC_CHAR(); 

                }
                break;
            case 71 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:501: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 72 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:517: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 73 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:533: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 74 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:541: RULE_AND
                {
                mRULE_AND(); 

                }
                break;
            case 75 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:550: RULE_OR
                {
                mRULE_OR(); 

                }
                break;
            case 76 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:558: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 77 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:569: RULE_SEMICOLON
                {
                mRULE_SEMICOLON(); 

                }
                break;
            case 78 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:584: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 79 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:596: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 80 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:607: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 81 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:618: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 82 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:628: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 83 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:640: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 84 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:652: RULE_LBRACE
                {
                mRULE_LBRACE(); 

                }
                break;
            case 85 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:664: RULE_RBRACE
                {
                mRULE_RBRACE(); 

                }
                break;
            case 86 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:676: RULE_QUESTI
                {
                mRULE_QUESTI(); 

                }
                break;
            case 87 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:688: RULE_NOT
                {
                mRULE_NOT(); 

                }
                break;
            case 88 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:697: RULE_BAND
                {
                mRULE_BAND(); 

                }
                break;
            case 89 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:707: RULE_BOR
                {
                mRULE_BOR(); 

                }
                break;
            case 90 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:716: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 91 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:726: RULE_AT
                {
                mRULE_AT(); 

                }
                break;
            case 92 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:734: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 93 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:745: RULE_EQUALS
                {
                mRULE_EQUALS(); 

                }
                break;
            case 94 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:757: RULE_LESS_THAN
                {
                mRULE_LESS_THAN(); 

                }
                break;
            case 95 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:772: RULE_MORE_THAN
                {
                mRULE_MORE_THAN(); 

                }
                break;
            case 96 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:787: RULE_PERCENT
                {
                mRULE_PERCENT(); 

                }
                break;
            case 97 :
                // ../org.sqlproc.dsl.ui/src-gen/org/sqlproc/dsl/ui/contentassist/antlr/internal/InternalProcessorDsl.g:1:800: RULE_REST
                {
                mRULE_REST(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\63\1\74\10\101\1\63\4\101\1\63\12\101\1\uffff\2\63\1"+
        "\uffff\1\157\1\161\34\uffff\4\101\2\uffff\22\101\1\uffff\5\101\1"+
        "\uffff\2\101\1\u00a6\12\101\34\uffff\5\101\1\u00b7\6\101\1\u00c0"+
        "\16\101\1\u00d0\5\101\1\uffff\1\u00a6\1\u00d6\1\u00d7\1\u00d8\6"+
        "\101\1\u00e0\4\101\1\u00e5\1\uffff\7\101\1\u00ed\1\uffff\17\101"+
        "\1\uffff\1\101\1\uffff\3\101\3\uffff\2\u00d8\4\u00d7\1\101\1\uffff"+
        "\4\101\1\uffff\1\u0107\1\101\1\u010a\4\101\1\uffff\1\101\1\uffff"+
        "\1\u0111\1\101\1\u0113\14\101\1\u0120\2\101\1\u0123\3\101\1\u0127"+
        "\1\uffff\1\101\1\u0129\1\uffff\1\u012a\3\101\1\u012e\1\101\3\uffff"+
        "\2\101\1\u0135\1\u0136\1\101\1\u0138\6\101\1\uffff\1\101\1\u0140"+
        "\1\uffff\1\101\1\u0142\1\101\4\uffff\1\101\1\uffff\1\101\5\uffff"+
        "\2\101\2\uffff\1\101\1\uffff\1\u0150\2\101\1\uffff\3\101\1\uffff"+
        "\1\101\1\uffff\1\u0159\3\uffff\1\101\5\uffff\1\101\1\u015e\1\101"+
        "\2\uffff\1\u0161\2\uffff\1\u0162\1\101\1\u0164\1\101\1\uffff\1\101"+
        "\2\uffff\1\101\1\uffff\1\101\5\uffff\1\u0169\1\u016a\2\101\2\uffff"+
        "\3\101\1\u0170\1\u0171\2\uffff";
    static final String DFA12_eofS =
        "\u0172\uffff";
    static final String DFA12_minS =
        "\1\0\1\142\1\76\10\56\1\52\4\56\1\135\12\56\1\uffff\1\43\1\52\1"+
        "\uffff\1\46\1\174\24\uffff\1\157\7\uffff\4\56\2\uffff\22\56\1\uffff"+
        "\5\56\1\uffff\15\56\34\uffff\35\56\1\40\3\56\1\uffff\20\56\1\uffff"+
        "\10\56\1\uffff\1\56\1\40\15\56\1\uffff\1\56\1\uffff\3\56\3\uffff"+
        "\7\56\1\uffff\4\56\1\uffff\7\56\1\uffff\1\56\1\uffff\1\56\1\40\25"+
        "\56\1\uffff\1\40\1\56\1\uffff\2\56\1\40\2\56\1\40\1\uffff\1\146"+
        "\1\uffff\11\56\1\40\2\56\1\uffff\2\56\1\uffff\3\56\1\uffff\1\143"+
        "\2\uffff\1\56\1\143\1\40\5\uffff\2\56\2\uffff\1\56\1\uffff\1\56"+
        "\1\40\1\56\1\143\3\56\1\uffff\1\56\1\uffff\1\56\3\uffff\1\56\4\uffff"+
        "\1\144\3\56\2\uffff\1\40\2\uffff\1\56\1\40\2\56\1\uffff\1\56\2\uffff"+
        "\1\56\1\uffff\1\56\5\uffff\4\56\2\uffff\5\56\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\76\10\172\1\52\4\172\1\135\12\172\1\uffff\1\175"+
        "\1\57\1\uffff\1\46\1\174\24\uffff\1\171\7\uffff\4\172\2\uffff\22"+
        "\172\1\uffff\5\172\1\uffff\15\172\34\uffff\41\172\1\uffff\20\172"+
        "\1\uffff\10\172\1\uffff\17\172\1\uffff\1\172\1\uffff\3\172\3\uffff"+
        "\7\172\1\uffff\4\172\1\uffff\7\172\1\uffff\1\172\1\uffff\27\172"+
        "\1\uffff\2\172\1\uffff\6\172\1\uffff\1\163\1\uffff\14\172\1\uffff"+
        "\2\172\1\uffff\3\172\1\uffff\1\157\2\uffff\1\172\1\164\1\172\5\uffff"+
        "\2\172\2\uffff\1\172\1\uffff\3\172\1\164\3\172\1\uffff\1\172\1\uffff"+
        "\1\172\3\uffff\1\172\4\uffff\1\155\3\172\2\uffff\1\172\2\uffff\4"+
        "\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\5\uffff\4\172\2\uffff"+
        "\5\172\2\uffff";
    static final String DFA12_acceptS =
        "\33\uffff\1\105\2\uffff\1\111\2\uffff\1\114\1\115\1\116\1\117\1"+
        "\121\1\122\1\123\1\124\1\125\1\126\1\127\1\132\1\133\1\134\1\135"+
        "\1\136\1\137\1\140\1\141\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\11\1"+
        "\120\4\uffff\1\104\1\103\22\uffff\1\35\5\uffff\1\72\15\uffff\1\105"+
        "\1\106\1\107\1\110\1\111\1\112\1\130\1\113\1\131\1\114\1\116\1\117"+
        "\1\121\1\122\1\123\1\124\1\125\1\126\1\127\1\132\1\133\1\134\1\135"+
        "\1\136\1\137\1\140\1\2\1\10\41\uffff\1\77\20\uffff\1\13\10\uffff"+
        "\1\16\17\uffff\1\42\1\uffff\1\56\3\uffff\1\101\1\102\1\100\7\uffff"+
        "\1\12\4\uffff\1\17\7\uffff\1\22\1\uffff\1\53\27\uffff\1\15\2\uffff"+
        "\1\14\6\uffff\1\23\1\uffff\1\24\14\uffff\1\73\2\uffff\1\25\3\uffff"+
        "\1\21\1\uffff\1\20\1\30\3\uffff\1\41\1\67\1\47\1\50\1\51\2\uffff"+
        "\1\46\1\27\1\uffff\1\45\7\uffff\1\40\1\uffff\1\26\1\uffff\1\57\1"+
        "\65\1\66\1\uffff\1\52\1\54\1\62\1\63\4\uffff\1\32\1\36\1\uffff\1"+
        "\60\1\61\4\uffff\1\44\1\uffff\1\64\1\70\1\uffff\1\37\1\uffff\1\55"+
        "\1\75\1\43\1\71\1\74\4\uffff\1\76\1\31\5\uffff\1\34\1\33";
    static final String DFA12_specialS =
        "\1\0\u0171\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\63\2\36\2\63\1\36\22\63\1\36\1\53\1\63\1\54\1\43\1\62\1"+
            "\37\1\63\1\46\1\47\1\63\1\45\1\44\1\2\1\13\1\35\12\33\1\41\1"+
            "\42\1\60\1\57\1\61\1\52\1\55\1\32\1\31\1\25\5\32\1\27\2\32\1"+
            "\26\2\32\1\23\1\32\1\24\1\32\1\30\7\32\1\20\1\34\1\63\1\56\1"+
            "\1\1\63\1\22\1\32\1\4\1\10\1\12\1\21\1\17\1\32\1\5\4\32\1\16"+
            "\1\6\1\3\1\32\1\14\1\11\1\7\1\15\5\32\1\50\1\40\1\51\uff82\63",
            "\1\65\1\64\1\72\1\uffff\1\71\2\uffff\1\67\2\uffff\1\70\6\uffff"+
            "\1\66",
            "\1\73",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\77\15\100\1\75\2\100\1\76\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\103\2\100\1\104\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\3\100\1\105\2\100\1\107\5\100\1\106\1\110\14"+
            "\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\112\6\100\1\111\5\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\113\27\100\1\114\1\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\117\1\115\6\100\1\116\10\100\1\120\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\2\100\1\123\1\100\1\122\17\100\1\121\5\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\27\100\1\124\2\100",
            "\1\125",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\126\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\127\1\130\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\131\13\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\132\25\100",
            "\1\133",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\134\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\100\1\135\30\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\5\100\1\137\7\100"+
            "\1\136\1\100\1\141\4\100\1\140\5\100\4\uffff\1\100\1\uffff\32"+
            "\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\21\100\1\142\10"+
            "\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\1\144\20\100\1"+
            "\143\10\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\16\100\1\145\13"+
            "\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\16\100\1\146\13"+
            "\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\16\100\1\147\13"+
            "\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\16\100\1\150\13"+
            "\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "\3\152\10\uffff\2\152\12\uffff\2\152\4\uffff\1\152\72\uffff"+
            "\3\152",
            "\1\153\4\uffff\1\154",
            "",
            "\1\156",
            "\1\160",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0084\11\uffff\1\u0083",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\11\100\1\u0085\20\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u0086\3\100\1\u0087\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\2\100\1\u0088\17\100\1\u0089\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u008a\1\100\1\u008b\14\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u008c\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u008d\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\17\100\1\u008e\12\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u008f\14\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\7\100\1\u0090\22\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u0091\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u0092\16\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\100\1\u0093\30\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\17\100\1\u0094\12\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\2\100\1\u0095\27\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u0096\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u0097\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u0098\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\5\100\1\u0099\24\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u009a\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\7\100\1\u009b\22\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u009c\6\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u009f\2\100\1\u009e\1\100\1\u009d\7"+
            "\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u00a0\16\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00a1\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u00a2\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u00a3\14\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u00a4\14\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u00a5\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\5\100\1\u00a7\24"+
            "\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\23\100\1\u00a8"+
            "\6\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\23\100\1\u00a9"+
            "\6\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\30\100\1\u00aa"+
            "\1\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\24\100\1\u00ab"+
            "\5\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\13\100\1\u00ac"+
            "\16\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\17\100\1\u00ad"+
            "\12\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\17\100\1\u00ae"+
            "\12\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\17\100\1\u00af"+
            "\12\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\17\100\1\u00b0"+
            "\12\100\4\uffff\1\100\1\uffff\32\100",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\u00b1\13\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\5\100\1\u00b2\24\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\14\100\1\u00b3\15\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\12\100\1\u00b4\17\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u00b5\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\27\100\1\u00b6\2\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u00b8\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u00b9\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u00ba\14\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u00bc\2\100\1\u00bb\13\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\u00bd\13\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00be\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\27\100\1\u00bf\2\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u00c1\17\100\1\u00c2\1\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u00c3\16\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00c4\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\u00c5\13\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\2\100\1\u00c6\27\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u00c7\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\25\100\1\u00c8\4\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\5\100\1\u00c9\24\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u00ca\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00cb\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00cc\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\u00cd\13\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\24\100\1\u00ce\5\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u00cf\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u00d1\10\100",
            "\1\u00d2\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00d3\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u00d4\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u00d5\6\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\3\100\1\u00d9\26"+
            "\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\13\100\1\u00da"+
            "\16\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\23\100\1\u00db"+
            "\6\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\23\100\1\u00dc"+
            "\6\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\23\100\1\u00dd"+
            "\6\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\23\100\1\u00de"+
            "\6\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\6\100\1\u00df\23\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u00e1\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u00e2\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u00e3\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\26\100\1\u00e4\3\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u00e6\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u00e7\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u00e8\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u00e9\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00ea\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u00eb\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u00ec\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u00ee\14\100",
            "\1\u00ef\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00f0\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u00f1\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u00f2\16\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u00f3\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\100\1\u00f4\30\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u00f5\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u00f6\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u00f7\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\14\100\1\u00f8\15\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u00f9\14\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u00fa\16\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u00fb\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\14\100\1\u00fc\15\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u00fd\14\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u00fe\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u00ff\16\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u0100\10\100",
            "",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u0101\25\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\27\100\1\u0102\2\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u0103\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\6\100\1\u0104\23\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\u0105\13\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\27\100\1\u0106\2\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u0108\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\27\100\1\u0109\2\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u010b\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\14\100\1\u010c\15\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u010d\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u010e\21\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u010f\25\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u0110\7\100",
            "\1\u0112\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u0114\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u0115\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u0116\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\27\100\1\u0117\2\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u0118\16\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u0119\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\3\100\1\u011a\26\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\25\100\1\u011b\4\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u011c\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u011d\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u011e\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u011f\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u0121\31\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u0122\14\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\30\100\1\u0124\1\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u0125\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u0126\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "\1\u0128\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u012b\25\100",
            "\1\u012c\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u012d\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\u012f\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "\1\u0132\2\uffff\1\u0131\11\uffff\1\u0130",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\14\100\1\u0133\15\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u0134\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u0137\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u0139\7\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u013a\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u013b\25\100",
            "\1\u013c\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\14\100\1\u013d\15\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u013e\6\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\2\100\1\u013f\27\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\12\100\1\u0141"+
            "\17\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\3\100\1\u0143\26\100",
            "",
            "\1\u0144\11\uffff\1\u0146\1\uffff\1\u0145",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u0147\14\100",
            "\1\u0149\11\uffff\1\u014b\1\uffff\1\u014a\4\uffff\1\u0148",
            "\1\u014c\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\10\100\1\u014d\21\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u014e\25\100",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\31\100\1\u014f",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\u0151\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\3\100\1\u0152\26\100",
            "\1\u0154\20\uffff\1\u0153",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u0155\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u0156\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u0157\6\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u0158\25\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u015a\6\100",
            "",
            "",
            "",
            "",
            "\1\u015c\10\uffff\1\u015b",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\15\100\1\u015d\14\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u015f\31\100",
            "",
            "",
            "\1\u0160\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\u0163\15\uffff\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff"+
            "\32\100\4\uffff\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\30\100\1\u0165\1\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\22\100\1\u0166\7\100",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\u0167\31\100",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\1\100\1\u0168\30\100",
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\23\100\1\u016b\6\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\13\100\1\u016c\16\100",
            "",
            "",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\16\100\1\u016d\13\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\4\100\1\u016e\25\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\21\100\1\u016f\10\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "\1\102\1\uffff\12\100\3\uffff\1\100\3\uffff\32\100\4\uffff"+
            "\1\100\1\uffff\32\100",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | RULE_ON_OFF | RULE_STATEMEN_TYPE | RULE_MAPPING_TYPE | RULE_OPTION_TYPE | RULE_IDENT_DOT | RULE_IDENT | RULE_NUMBER | RULE_ESC_CHAR | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_AND | RULE_OR | RULE_COLON | RULE_SEMICOLON | RULE_STRING | RULE_COMMA | RULE_MINUS | RULE_PLUS | RULE_LPAREN | RULE_RPAREN | RULE_LBRACE | RULE_RBRACE | RULE_QUESTI | RULE_NOT | RULE_BAND | RULE_BOR | RULE_HASH | RULE_AT | RULE_CARET | RULE_EQUALS | RULE_LESS_THAN | RULE_MORE_THAN | RULE_PERCENT | RULE_REST );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='_') ) {s = 1;}

                        else if ( (LA12_0=='-') ) {s = 2;}

                        else if ( (LA12_0=='p') ) {s = 3;}

                        else if ( (LA12_0=='c') ) {s = 4;}

                        else if ( (LA12_0=='i') ) {s = 5;}

                        else if ( (LA12_0=='o') ) {s = 6;}

                        else if ( (LA12_0=='t') ) {s = 7;}

                        else if ( (LA12_0=='d') ) {s = 8;}

                        else if ( (LA12_0=='s') ) {s = 9;}

                        else if ( (LA12_0=='e') ) {s = 10;}

                        else if ( (LA12_0=='.') ) {s = 11;}

                        else if ( (LA12_0=='r') ) {s = 12;}

                        else if ( (LA12_0=='u') ) {s = 13;}

                        else if ( (LA12_0=='n') ) {s = 14;}

                        else if ( (LA12_0=='g') ) {s = 15;}

                        else if ( (LA12_0=='[') ) {s = 16;}

                        else if ( (LA12_0=='f') ) {s = 17;}

                        else if ( (LA12_0=='a') ) {s = 18;}

                        else if ( (LA12_0=='O') ) {s = 19;}

                        else if ( (LA12_0=='Q') ) {s = 20;}

                        else if ( (LA12_0=='C') ) {s = 21;}

                        else if ( (LA12_0=='L') ) {s = 22;}

                        else if ( (LA12_0=='I') ) {s = 23;}

                        else if ( (LA12_0=='S') ) {s = 24;}

                        else if ( (LA12_0=='B') ) {s = 25;}

                        else if ( (LA12_0=='A'||(LA12_0>='D' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='K')||(LA12_0>='M' && LA12_0<='N')||LA12_0=='P'||LA12_0=='R'||(LA12_0>='T' && LA12_0<='Z')||LA12_0=='b'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='m')||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {s = 26;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 27;}

                        else if ( (LA12_0=='\\') ) {s = 28;}

                        else if ( (LA12_0=='/') ) {s = 29;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 30;}

                        else if ( (LA12_0=='&') ) {s = 31;}

                        else if ( (LA12_0=='|') ) {s = 32;}

                        else if ( (LA12_0==':') ) {s = 33;}

                        else if ( (LA12_0==';') ) {s = 34;}

                        else if ( (LA12_0=='$') ) {s = 35;}

                        else if ( (LA12_0==',') ) {s = 36;}

                        else if ( (LA12_0=='+') ) {s = 37;}

                        else if ( (LA12_0=='(') ) {s = 38;}

                        else if ( (LA12_0==')') ) {s = 39;}

                        else if ( (LA12_0=='{') ) {s = 40;}

                        else if ( (LA12_0=='}') ) {s = 41;}

                        else if ( (LA12_0=='?') ) {s = 42;}

                        else if ( (LA12_0=='!') ) {s = 43;}

                        else if ( (LA12_0=='#') ) {s = 44;}

                        else if ( (LA12_0=='@') ) {s = 45;}

                        else if ( (LA12_0=='^') ) {s = 46;}

                        else if ( (LA12_0=='=') ) {s = 47;}

                        else if ( (LA12_0=='<') ) {s = 48;}

                        else if ( (LA12_0=='>') ) {s = 49;}

                        else if ( (LA12_0=='%') ) {s = 50;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='\"'||LA12_0=='\''||LA12_0=='*'||LA12_0==']'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}