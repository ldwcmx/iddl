// $ANTLR 3.4 D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g 2012-07-30 13:34:11
 package  com.it.iddl.parser.oracle; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OracleParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int ALIAS=4;
    public static final int AND=5;
    public static final int ARROW=6;
    public static final int AS=7;
    public static final int ASC=8;
    public static final int ASTERISK=9;
    public static final int BETWEEN=10;
    public static final int BITAND=11;
    public static final int BITOR=12;
    public static final int BITXOR=13;
    public static final int CAST=14;
    public static final int COLUMN=15;
    public static final int COLUMNAST=16;
    public static final int COLUMNS=17;
    public static final int COL_TAB=18;
    public static final int COMMA=19;
    public static final int CONDITION_LEFT=20;
    public static final int CONDITION_OR=21;
    public static final int CONDITION_OR_NOT=22;
    public static final int CONSIST=23;
    public static final int CROSS=24;
    public static final int DELETE=25;
    public static final int DESC=26;
    public static final int DISPLAYED_COLUMN=27;
    public static final int DISPLAYED_COUNT_COLUMN=28;
    public static final int DIVIDE=29;
    public static final int DOT=30;
    public static final int DOUBLEQUOTED_STRING=31;
    public static final int DOUBLEVERTBAR=32;
    public static final int EQ=33;
    public static final int EXPONENT=34;
    public static final int FORUPDATE=35;
    public static final int FULL=36;
    public static final int GEQ=37;
    public static final int GROUPBY=38;
    public static final int GTH=39;
    public static final int ID=40;
    public static final int IN=41;
    public static final int INFINITE=42;
    public static final int INNER=43;
    public static final int INSERT=44;
    public static final int INSERT_VAL=45;
    public static final int IN_LISTS=46;
    public static final int IS=47;
    public static final int ISNOT=48;
    public static final int JOIN=49;
    public static final int LEFT=50;
    public static final int LEQ=51;
    public static final int LIKE=52;
    public static final int LPAREN=53;
    public static final int LTH=54;
    public static final int MINUS=55;
    public static final int N=56;
    public static final int NAN=57;
    public static final int NEGATIVE=58;
    public static final int NOT=59;
    public static final int NOT_BETWEEN=60;
    public static final int NOT_EQ=61;
    public static final int NOT_LIKE=62;
    public static final int NOWAIT=63;
    public static final int NULL=64;
    public static final int NUMBER=65;
    public static final int OF=66;
    public static final int OR=67;
    public static final int ORDERBY=68;
    public static final int OUTER=69;
    public static final int PLUS=70;
    public static final int POINT=71;
    public static final int POSITIVE=72;
    public static final int PRIORITY=73;
    public static final int QUOTED_STRING=74;
    public static final int QUTED_STR=75;
    public static final int RIGHT=76;
    public static final int RPAREN=77;
    public static final int SELECT=78;
    public static final int SELECT_LIST=79;
    public static final int SET=80;
    public static final int SET_ELE=81;
    public static final int SHIFTLEFT=82;
    public static final int SHIFTRIGHT=83;
    public static final int SUBQUERY=84;
    public static final int TABLENAME=85;
    public static final int TABLENAMES=86;
    public static final int UNION=87;
    public static final int UPDATE=88;
    public static final int WAIT=89;
    public static final int WHERE=90;
    public static final int WS=91;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public OracleParserLexer() {} 
    public OracleParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OracleParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g"; }

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:9:7: ( '*/' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:9:9: '*/'
            {
            match("*/"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:10:7: ( '/*' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:10:9: '/*'
            {
            match("/*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:11:7: ( '?' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:11:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:12:7: ( 'AND' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:12:9: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:13:7: ( 'AS' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:13:9: 'AS'
            {
            match("AS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:14:7: ( 'BETWEEN' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:14:9: 'BETWEEN'
            {
            match("BETWEEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:15:7: ( 'BY' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:15:9: 'BY'
            {
            match("BY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:16:7: ( 'CAST' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:16:9: 'CAST'
            {
            match("CAST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:17:8: ( 'CROSS' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:17:10: 'CROSS'
            {
            match("CROSS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:18:8: ( 'DELETE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:18:10: 'DELETE'
            {
            match("DELETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:19:8: ( 'FALSE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:19:10: 'FALSE'
            {
            match("FALSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:20:8: ( 'FOR' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:20:10: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:21:8: ( 'FROM' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:21:10: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:22:8: ( 'FULL' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:22:10: 'FULL'
            {
            match("FULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:23:8: ( 'GRUOP' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:23:10: 'GRUOP'
            {
            match("GRUOP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:24:8: ( 'IN' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:24:10: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:25:8: ( 'INFINITE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:25:10: 'INFINITE'
            {
            match("INFINITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:26:8: ( 'INNER' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:26:10: 'INNER'
            {
            match("INNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:27:8: ( 'INSERT' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:27:10: 'INSERT'
            {
            match("INSERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:28:8: ( 'INTO' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:28:10: 'INTO'
            {
            match("INTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:29:8: ( 'IS' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:29:10: 'IS'
            {
            match("IS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:30:8: ( 'JOIN' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:30:10: 'JOIN'
            {
            match("JOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:31:8: ( 'LEFT' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:31:10: 'LEFT'
            {
            match("LEFT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:32:8: ( 'LIKE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:32:10: 'LIKE'
            {
            match("LIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:33:8: ( 'NAN' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:33:10: 'NAN'
            {
            match("NAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:34:8: ( 'NOT' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:34:10: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:35:8: ( 'NOWAIT' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:35:10: 'NOWAIT'
            {
            match("NOWAIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:36:8: ( 'NULL' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:36:10: 'NULL'
            {
            match("NULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:37:8: ( 'OF' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:37:10: 'OF'
            {
            match("OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:38:8: ( 'ON' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:38:10: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:39:8: ( 'OR' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:39:10: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:40:8: ( 'ORDER' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:40:10: 'ORDER'
            {
            match("ORDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:41:8: ( 'OUTER' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:41:10: 'OUTER'
            {
            match("OUTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:42:8: ( 'RIGHT' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:42:10: 'RIGHT'
            {
            match("RIGHT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:43:8: ( 'SELECT' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:43:10: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:44:8: ( 'SET' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:44:10: 'SET'
            {
            match("SET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:45:8: ( 'TRUE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:45:10: 'TRUE'
            {
            match("TRUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:46:8: ( 'UNION' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:46:10: 'UNION'
            {
            match("UNION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:47:8: ( 'UPDATE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:47:10: 'UPDATE'
            {
            match("UPDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:48:8: ( 'VALUES' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:48:10: 'VALUES'
            {
            match("VALUES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:49:8: ( 'WAIT' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:49:10: 'WAIT'
            {
            match("WAIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:50:8: ( 'WHERE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:50:10: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:398:5: ( '0' .. '9' ( '0' .. '9' )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:398:7: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); 

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:398:18: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:401:4: ( 'ASC' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:401:5: 'ASC'
            {
            match("ASC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:402:5: ( 'DESC' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:402:6: 'DESC'
            {
            match("DESC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            int _type = EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:404:2: ( '**' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:404:4: '**'
            {
            match("**"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:407:5: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:407:7: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:407:29: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '#' && LA2_0 <= '$')||(LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:
            	    {
            	    if ( (input.LA(1) >= '#' && input.LA(1) <= '$')||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:411:2: ( '+' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:411:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:415:2: ( ( ( N '.' N ) | ( '.' N ) ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:416:2: ( ( N '.' N ) | ( '.' N ) )
            {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:416:2: ( ( N '.' N ) | ( '.' N ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='.') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:416:3: ( N '.' N )
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:416:3: ( N '.' N )
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:416:5: N '.' N
                    {
                    mN(); 


                    match('.'); 

                    mN(); 


                    }


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:417:3: ( '.' N )
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:417:3: ( '.' N )
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:417:4: '.' N
                    {
                    match('.'); 

                    mN(); 


                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:423:2: ( '-' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:423:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:426:2: ( POINT )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:
            {
            if ( input.LA(1)=='.' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:429:2: ( ',' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:429:4: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:432:2: ( '=' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:432:4: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:436:2: ( '/' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:436:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:439:2: ( '*' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:439:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:442:2: ( '=>' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:442:4: '=>'
            {
            match("=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "DOUBLEVERTBAR"
    public final void mDOUBLEVERTBAR() throws RecognitionException {
        try {
            int _type = DOUBLEVERTBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:445:2: ( '||' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:445:4: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLEVERTBAR"

    // $ANTLR start "POINT"
    public final void mPOINT() throws RecognitionException {
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:451:2: ( '.' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:451:4: '.'
            {
            match('.'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "POINT"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:453:2: ( ')' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:453:4: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:456:2: ( '(' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:456:4: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "LTH"
    public final void mLTH() throws RecognitionException {
        try {
            int _type = LTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:459:2: ( '<' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:459:4: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LTH"

    // $ANTLR start "NOT_EQ"
    public final void mNOT_EQ() throws RecognitionException {
        try {
            int _type = NOT_EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:462:2: ( '<>' | '!=' | '^=' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt4=1;
                }
                break;
            case '!':
                {
                alt4=2;
                }
                break;
            case '^':
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:462:4: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:462:11: '!='
                    {
                    match("!="); 



                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:462:18: '^='
                    {
                    match("^="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT_EQ"

    // $ANTLR start "LEQ"
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:465:2: ( '<=' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:465:4: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEQ"

    // $ANTLR start "GEQ"
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:468:2: ( '>=' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:468:4: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GEQ"

    // $ANTLR start "GTH"
    public final void mGTH() throws RecognitionException {
        try {
            int _type = GTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:471:2: ( '>' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:471:4: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GTH"

    // $ANTLR start "QUOTED_STRING"
    public final void mQUOTED_STRING() throws RecognitionException {
        try {
            int _type = QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:479:2: ( '\\'' (~ '\\'' | '\\'\\'' )* '\\'' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:479:3: '\\'' (~ '\\'' | '\\'\\'' )* '\\''
            {
            match('\''); 

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:479:8: (~ '\\'' | '\\'\\'' )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        alt5=2;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:479:9: ~ '\\''
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:479:15: '\\'\\''
            	    {
            	    match("''"); 



            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_STRING"

    // $ANTLR start "DOUBLEQUOTED_STRING"
    public final void mDOUBLEQUOTED_STRING() throws RecognitionException {
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:485:2: ( '\"' (~ ( '\"' ) )* '\"' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:485:4: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:485:8: (~ ( '\"' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLEQUOTED_STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:487:5: ( ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:487:9: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' )
            {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:487:9: ( ' ' | '\\t' | '\\r' '\\n' | '\\n' | '\\r' )
            int alt7=5;
            switch ( input.LA(1) ) {
            case ' ':
                {
                alt7=1;
                }
                break;
            case '\t':
                {
                alt7=2;
                }
                break;
            case '\r':
                {
                int LA7_3 = input.LA(2);

                if ( (LA7_3=='\n') ) {
                    alt7=3;
                }
                else {
                    alt7=5;
                }
                }
                break;
            case '\n':
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:487:13: ' '
                    {
                    match(' '); 

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:488:7: '\\t'
                    {
                    match('\t'); 

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:489:7: '\\r' '\\n'
                    {
                    match('\r'); 

                    match('\n'); 

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:490:7: '\\n'
                    {
                    match('\n'); 

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:491:7: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "BITOR"
    public final void mBITOR() throws RecognitionException {
        try {
            int _type = BITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:497:2: ( '|' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:497:3: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITOR"

    // $ANTLR start "BITAND"
    public final void mBITAND() throws RecognitionException {
        try {
            int _type = BITAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:500:2: ( '&' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:500:3: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITAND"

    // $ANTLR start "BITXOR"
    public final void mBITXOR() throws RecognitionException {
        try {
            int _type = BITXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:503:2: ( '^' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:503:3: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITXOR"

    // $ANTLR start "SHIFTLEFT"
    public final void mSHIFTLEFT() throws RecognitionException {
        try {
            int _type = SHIFTLEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:506:2: ( '<<' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:506:3: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFTLEFT"

    // $ANTLR start "SHIFTRIGHT"
    public final void mSHIFTRIGHT() throws RecognitionException {
        try {
            int _type = SHIFTRIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:509:2: ( '>>' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:509:3: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SHIFTRIGHT"

    public void mTokens() throws RecognitionException {
        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:8: ( T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | N | ASC | DESC | EXPONENT | ID | PLUS | NUMBER | MINUS | DOT | COMMA | EQ | DIVIDE | ASTERISK | ARROW | DOUBLEVERTBAR | RPAREN | LPAREN | LTH | NOT_EQ | LEQ | GEQ | GTH | QUOTED_STRING | WS | BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT )
        int alt8=71;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:10: T__92
                {
                mT__92(); 


                }
                break;
            case 2 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:16: T__93
                {
                mT__93(); 


                }
                break;
            case 3 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:22: T__94
                {
                mT__94(); 


                }
                break;
            case 4 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:28: T__95
                {
                mT__95(); 


                }
                break;
            case 5 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:34: T__96
                {
                mT__96(); 


                }
                break;
            case 6 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:40: T__97
                {
                mT__97(); 


                }
                break;
            case 7 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:46: T__98
                {
                mT__98(); 


                }
                break;
            case 8 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:52: T__99
                {
                mT__99(); 


                }
                break;
            case 9 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:58: T__100
                {
                mT__100(); 


                }
                break;
            case 10 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:65: T__101
                {
                mT__101(); 


                }
                break;
            case 11 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:72: T__102
                {
                mT__102(); 


                }
                break;
            case 12 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:79: T__103
                {
                mT__103(); 


                }
                break;
            case 13 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:86: T__104
                {
                mT__104(); 


                }
                break;
            case 14 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:93: T__105
                {
                mT__105(); 


                }
                break;
            case 15 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:100: T__106
                {
                mT__106(); 


                }
                break;
            case 16 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:107: T__107
                {
                mT__107(); 


                }
                break;
            case 17 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:114: T__108
                {
                mT__108(); 


                }
                break;
            case 18 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:121: T__109
                {
                mT__109(); 


                }
                break;
            case 19 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:128: T__110
                {
                mT__110(); 


                }
                break;
            case 20 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:135: T__111
                {
                mT__111(); 


                }
                break;
            case 21 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:142: T__112
                {
                mT__112(); 


                }
                break;
            case 22 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:149: T__113
                {
                mT__113(); 


                }
                break;
            case 23 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:156: T__114
                {
                mT__114(); 


                }
                break;
            case 24 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:163: T__115
                {
                mT__115(); 


                }
                break;
            case 25 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:170: T__116
                {
                mT__116(); 


                }
                break;
            case 26 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:177: T__117
                {
                mT__117(); 


                }
                break;
            case 27 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:184: T__118
                {
                mT__118(); 


                }
                break;
            case 28 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:191: T__119
                {
                mT__119(); 


                }
                break;
            case 29 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:198: T__120
                {
                mT__120(); 


                }
                break;
            case 30 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:205: T__121
                {
                mT__121(); 


                }
                break;
            case 31 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:212: T__122
                {
                mT__122(); 


                }
                break;
            case 32 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:219: T__123
                {
                mT__123(); 


                }
                break;
            case 33 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:226: T__124
                {
                mT__124(); 


                }
                break;
            case 34 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:233: T__125
                {
                mT__125(); 


                }
                break;
            case 35 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:240: T__126
                {
                mT__126(); 


                }
                break;
            case 36 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:247: T__127
                {
                mT__127(); 


                }
                break;
            case 37 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:254: T__128
                {
                mT__128(); 


                }
                break;
            case 38 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:261: T__129
                {
                mT__129(); 


                }
                break;
            case 39 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:268: T__130
                {
                mT__130(); 


                }
                break;
            case 40 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:275: T__131
                {
                mT__131(); 


                }
                break;
            case 41 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:282: T__132
                {
                mT__132(); 


                }
                break;
            case 42 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:289: T__133
                {
                mT__133(); 


                }
                break;
            case 43 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:296: N
                {
                mN(); 


                }
                break;
            case 44 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:298: ASC
                {
                mASC(); 


                }
                break;
            case 45 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:302: DESC
                {
                mDESC(); 


                }
                break;
            case 46 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:307: EXPONENT
                {
                mEXPONENT(); 


                }
                break;
            case 47 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:316: ID
                {
                mID(); 


                }
                break;
            case 48 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:319: PLUS
                {
                mPLUS(); 


                }
                break;
            case 49 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:324: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 50 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:331: MINUS
                {
                mMINUS(); 


                }
                break;
            case 51 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:337: DOT
                {
                mDOT(); 


                }
                break;
            case 52 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:341: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 53 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:347: EQ
                {
                mEQ(); 


                }
                break;
            case 54 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:350: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 55 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:357: ASTERISK
                {
                mASTERISK(); 


                }
                break;
            case 56 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:366: ARROW
                {
                mARROW(); 


                }
                break;
            case 57 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:372: DOUBLEVERTBAR
                {
                mDOUBLEVERTBAR(); 


                }
                break;
            case 58 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:386: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 59 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:393: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 60 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:400: LTH
                {
                mLTH(); 


                }
                break;
            case 61 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:404: NOT_EQ
                {
                mNOT_EQ(); 


                }
                break;
            case 62 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:411: LEQ
                {
                mLEQ(); 


                }
                break;
            case 63 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:415: GEQ
                {
                mGEQ(); 


                }
                break;
            case 64 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:419: GTH
                {
                mGTH(); 


                }
                break;
            case 65 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:423: QUOTED_STRING
                {
                mQUOTED_STRING(); 


                }
                break;
            case 66 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:437: WS
                {
                mWS(); 


                }
                break;
            case 67 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:440: BITOR
                {
                mBITOR(); 


                }
                break;
            case 68 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:446: BITAND
                {
                mBITAND(); 


                }
                break;
            case 69 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:453: BITXOR
                {
                mBITXOR(); 


                }
                break;
            case 70 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:460: SHIFTLEFT
                {
                mSHIFTLEFT(); 


                }
                break;
            case 71 :
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:1:470: SHIFTRIGHT
                {
                mSHIFTRIGHT(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\50\1\52\1\uffff\21\26\1\114\2\uffff\1\116\2\uffff\1\120"+
        "\1\122\2\uffff\1\125\1\uffff\1\126\1\131\10\uffff\1\26\1\134\1\26"+
        "\1\136\10\26\1\154\1\155\6\26\1\165\1\166\1\170\11\26\1\114\16\uffff"+
        "\1\u0083\1\u0084\1\uffff\1\26\1\uffff\5\26\1\u008b\7\26\2\uffff"+
        "\3\26\1\u0096\1\u0097\2\26\2\uffff\1\26\1\uffff\3\26\1\u009e\6\26"+
        "\2\uffff\1\26\1\u00a6\2\26\1\u00a9\1\26\1\uffff\1\u00ab\1\u00ac"+
        "\4\26\1\u00b1\1\u00b2\1\u00b3\1\u00b4\2\uffff\1\26\1\u00b6\4\26"+
        "\1\uffff\1\u00bb\3\26\1\u00bf\2\26\1\uffff\1\u00c2\1\26\1\uffff"+
        "\1\u00c4\2\uffff\1\u00c5\1\26\1\u00c7\1\26\4\uffff\1\26\1\uffff"+
        "\1\u00ca\1\u00cb\1\u00cc\1\26\1\uffff\1\u00ce\2\26\1\uffff\1\u00d1"+
        "\1\26\1\uffff\1\u00d3\2\uffff\1\26\1\uffff\1\u00d5\1\u00d6\3\uffff"+
        "\1\u00d7\1\uffff\1\u00d8\1\u00d9\1\uffff\1\u00da\1\uffff\1\26\6"+
        "\uffff\1\u00dc\1\uffff";
    static final String DFA8_eofS =
        "\u00dd\uffff";
    static final String DFA8_minS =
        "\1\11\2\52\1\uffff\1\116\1\105\1\101\1\105\1\101\1\122\1\116\1\117"+
        "\1\105\1\101\1\106\1\111\1\105\1\122\1\116\2\101\1\56\2\uffff\1"+
        "\60\2\uffff\1\76\1\174\2\uffff\1\74\1\uffff\2\75\10\uffff\1\104"+
        "\1\43\1\124\1\43\1\123\1\117\2\114\1\122\1\117\1\114\1\125\2\43"+
        "\1\111\1\106\1\113\1\116\1\124\1\114\3\43\1\124\1\107\1\114\1\125"+
        "\1\111\1\104\1\114\1\111\1\105\1\56\16\uffff\2\43\1\uffff\1\127"+
        "\1\uffff\1\124\1\123\1\105\1\103\1\123\1\43\1\115\1\114\1\117\1"+
        "\111\2\105\1\117\2\uffff\1\116\1\124\1\105\2\43\1\101\1\114\2\uffff"+
        "\1\105\1\uffff\1\105\1\110\1\105\1\43\1\105\1\117\1\101\1\125\1"+
        "\124\1\122\2\uffff\1\105\1\43\1\123\1\124\1\43\1\105\1\uffff\2\43"+
        "\1\120\1\116\2\122\4\43\2\uffff\1\111\1\43\2\122\1\124\1\103\1\uffff"+
        "\1\43\1\116\1\124\1\105\1\43\2\105\1\uffff\1\43\1\105\1\uffff\1"+
        "\43\2\uffff\1\43\1\111\1\43\1\124\4\uffff\1\124\1\uffff\3\43\1\124"+
        "\1\uffff\1\43\1\105\1\123\1\uffff\1\43\1\116\1\uffff\1\43\2\uffff"+
        "\1\124\1\uffff\2\43\3\uffff\1\43\1\uffff\2\43\1\uffff\1\43\1\uffff"+
        "\1\105\6\uffff\1\43\1\uffff";
    static final String DFA8_maxS =
        "\1\174\1\57\1\52\1\uffff\1\123\1\131\1\122\1\105\1\125\1\122\1\123"+
        "\1\117\1\111\2\125\1\111\1\105\1\122\1\120\1\101\1\110\1\71\2\uffff"+
        "\1\71\2\uffff\1\76\1\174\2\uffff\1\76\1\uffff\1\75\1\76\10\uffff"+
        "\1\104\1\172\1\124\1\172\1\123\1\117\1\123\1\114\1\122\1\117\1\114"+
        "\1\125\2\172\1\111\1\106\1\113\1\116\1\127\1\114\3\172\1\124\1\107"+
        "\1\124\1\125\1\111\1\104\1\114\1\111\1\105\1\71\16\uffff\2\172\1"+
        "\uffff\1\127\1\uffff\1\124\1\123\1\105\1\103\1\123\1\172\1\115\1"+
        "\114\1\117\1\111\2\105\1\117\2\uffff\1\116\1\124\1\105\2\172\1\101"+
        "\1\114\2\uffff\1\105\1\uffff\1\105\1\110\1\105\1\172\1\105\1\117"+
        "\1\101\1\125\1\124\1\122\2\uffff\1\105\1\172\1\123\1\124\1\172\1"+
        "\105\1\uffff\2\172\1\120\1\116\2\122\4\172\2\uffff\1\111\1\172\2"+
        "\122\1\124\1\103\1\uffff\1\172\1\116\1\124\1\105\1\172\2\105\1\uffff"+
        "\1\172\1\105\1\uffff\1\172\2\uffff\1\172\1\111\1\172\1\124\4\uffff"+
        "\1\124\1\uffff\3\172\1\124\1\uffff\1\172\1\105\1\123\1\uffff\1\172"+
        "\1\116\1\uffff\1\172\2\uffff\1\124\1\uffff\2\172\3\uffff\1\172\1"+
        "\uffff\2\172\1\uffff\1\172\1\uffff\1\105\6\uffff\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\3\uffff\1\3\22\uffff\1\57\1\60\1\uffff\1\62\1\64\2\uffff\1\72\1"+
        "\73\1\uffff\1\75\2\uffff\1\101\1\102\1\104\1\1\1\56\1\67\1\2\1\66"+
        "\41\uffff\1\53\1\61\1\63\1\70\1\65\1\71\1\103\1\76\1\106\1\74\1"+
        "\105\1\77\1\107\1\100\2\uffff\1\5\1\uffff\1\7\15\uffff\1\20\1\25"+
        "\7\uffff\1\35\1\36\1\uffff\1\37\12\uffff\1\4\1\54\6\uffff\1\14\12"+
        "\uffff\1\31\1\32\6\uffff\1\44\7\uffff\1\10\2\uffff\1\55\1\uffff"+
        "\1\15\1\16\4\uffff\1\24\1\26\1\27\1\30\1\uffff\1\34\4\uffff\1\45"+
        "\3\uffff\1\51\2\uffff\1\11\1\uffff\1\13\1\17\1\uffff\1\22\2\uffff"+
        "\1\40\1\41\1\42\1\uffff\1\46\2\uffff\1\52\1\uffff\1\12\1\uffff\1"+
        "\23\1\33\1\43\1\47\1\50\1\6\1\uffff\1\21";
    static final String DFA8_specialS =
        "\u00dd\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\44\2\uffff\1\44\22\uffff\1\44\1\40\4\uffff\1\45\1\43\1\36"+
            "\1\35\1\1\1\27\1\32\1\31\1\30\1\2\12\25\2\uffff\1\37\1\33\1"+
            "\42\1\3\1\uffff\1\4\1\5\1\6\1\7\1\26\1\10\1\11\1\26\1\12\1\13"+
            "\1\26\1\14\1\26\1\15\1\16\2\26\1\17\1\20\1\21\1\22\1\23\1\24"+
            "\3\26\3\uffff\1\41\2\uffff\32\26\1\uffff\1\34",
            "\1\47\4\uffff\1\46",
            "\1\51",
            "",
            "\1\53\4\uffff\1\54",
            "\1\55\23\uffff\1\56",
            "\1\57\20\uffff\1\60",
            "\1\61",
            "\1\62\15\uffff\1\63\2\uffff\1\64\2\uffff\1\65",
            "\1\66",
            "\1\67\4\uffff\1\70",
            "\1\71",
            "\1\72\3\uffff\1\73",
            "\1\74\15\uffff\1\75\5\uffff\1\76",
            "\1\77\7\uffff\1\100\3\uffff\1\101\2\uffff\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106\1\uffff\1\107",
            "\1\110",
            "\1\111\6\uffff\1\112",
            "\1\115\1\uffff\12\113",
            "",
            "",
            "\12\115",
            "",
            "",
            "\1\117",
            "\1\121",
            "",
            "",
            "\1\124\1\123\1\40",
            "",
            "\1\40",
            "\1\127\1\130",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\2\26\13\uffff\12\26\7\uffff\2\26\1\133\27\26\4\uffff\1\26"+
            "\1\uffff\32\26",
            "\1\135",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\137",
            "\1\140",
            "\1\141\6\uffff\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\2\26\13\uffff\12\26\7\uffff\5\26\1\150\7\26\1\151\4\26\1\152"+
            "\1\153\6\26\4\uffff\1\26\1\uffff\32\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162\2\uffff\1\163",
            "\1\164",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\3\26\1\167\26\26\4\uffff\1\26"+
            "\1\uffff\32\26",
            "\1\171",
            "\1\172",
            "\1\173\7\uffff\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\115\1\uffff\12\113",
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
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u0085",
            "",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "",
            "",
            "\1\u00a5",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00a7",
            "\1\u00a8",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00aa",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "",
            "\1\u00b5",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00c3",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00c6",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00c8",
            "",
            "",
            "",
            "",
            "\1\u00c9",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00cd",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\1\u00d2",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "",
            "\1\u00d4",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            "",
            "\1\u00db",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\26\13\uffff\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32"+
            "\26",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | N | ASC | DESC | EXPONENT | ID | PLUS | NUMBER | MINUS | DOT | COMMA | EQ | DIVIDE | ASTERISK | ARROW | DOUBLEVERTBAR | RPAREN | LPAREN | LTH | NOT_EQ | LEQ | GEQ | GTH | QUOTED_STRING | WS | BITOR | BITAND | BITXOR | SHIFTLEFT | SHIFTRIGHT );";
        }
    }
 

}