// $ANTLR 3.4 D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g 2012-07-30 12:05:08

package  com.it.iddl.parser.mysql; 

import com.it.iddl.parser.sql.objecttree.*;
import com.it.iddl.parser.sql.objecttree.impl.*;
import com.it.iddl.parser.sql.function.*;

import com.it.iddl.parser.sql.objecttree.mysql.*;

import com.it.iddl.parser.sql.objecttree.mysql.function.*;
import static com.it.iddl.parser.util.Utils.*;
import com.it.iddl.parser.sql.objecttree.mysql.function.date.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.it.iddl.parser.AntlrStringStream;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MySQLWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "AND", "ARROW", "AS", "ASC", "ASTERISK", "BETWEEN", "BITAND", "BITOR", "BITXOR", "COLUMN", "COLUMNAST", "COLUMNS", "COL_TAB", "COMMA", "CONDITION_LEFT", "CONDITION_OR", "CONDITION_OR_NOT", "CONSIST", "CROSS", "DELETE", "DESC", "DISPLAYED_COLUMN", "DISPLAYED_COUNT_COLUMN", "DISTINCT", "DIVIDE", "DOT", "DOUBLEQUOTED_STRING", "DOUBLEVERTBAR", "EQ", "EXPONENT", "FORUPDATE", "FULL", "GEQ", "GROUPBY", "GTH", "HAVING", "ID", "IN", "INFINITE", "INNER", "INSERT", "INSERT_VAL", "INTERVAL", "IN_LISTS", "IS", "ISNOT", "JOIN", "LEFT", "LEQ", "LIKE", "LPAREN", "LTH", "MINUS", "N", "NAN", "NEGATIVE", "NOT", "NOT_BETWEEN", "NOT_EQ", "NOT_LIKE", "NULL", "NUMBER", "OR", "ORDERBY", "OUTER", "PLUS", "POINT", "POSITIVE", "PRIORITY", "QUOTED_STRING", "QUTED_STR", "RANGE", "REPLACE", "RIGHT", "RPAREN", "SELECT", "SELECT_LIST", "SET", "SET_ELE", "SHAREMODE", "SHIFTLEFT", "SHIFTRIGHT", "SKIP", "SUBQUERY", "TABLENAME", "TABLENAMES", "TIME", "TIME_FUC", "TIME_FUC_NAME", "UNION", "UNIT", "UPDATE", "WHERE", "WS", "'?'", "'AND'", "'AS'", "'BETWEEN'", "'BY'", "'CROSS'", "'DELETE'", "'DISTINCT'", "'FALSE'", "'FOR'", "'FORCE'", "'FROM'", "'FULL'", "'GROUP'", "'HAVING'", "'IGNORE'", "'IN'", "'INDEX'", "'INFINITE'", "'INNER'", "'INSERT'", "'INTO'", "'IS'", "'JOIN'", "'LEFT'", "'LIKE'", "'LIMIT'", "'LOCK'", "'MODE'", "'NAN'", "'NOT'", "'NULL'", "'ON'", "'OR'", "'ORDER'", "'OUTER'", "'REPLACE'", "'RIGHT'", "'ROWNUM'", "'SELECT'", "'SET'", "'SHARE'", "'TRUE'", "'UNION'", "'UPDATE'", "'VALUES'", "'WHERE'"
    };

    public static final int EOF=-1;
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
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int T__136=136;
    public static final int T__137=137;
    public static final int T__138=138;
    public static final int T__139=139;
    public static final int T__140=140;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__145=145;
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
    public static final int COLUMN=14;
    public static final int COLUMNAST=15;
    public static final int COLUMNS=16;
    public static final int COL_TAB=17;
    public static final int COMMA=18;
    public static final int CONDITION_LEFT=19;
    public static final int CONDITION_OR=20;
    public static final int CONDITION_OR_NOT=21;
    public static final int CONSIST=22;
    public static final int CROSS=23;
    public static final int DELETE=24;
    public static final int DESC=25;
    public static final int DISPLAYED_COLUMN=26;
    public static final int DISPLAYED_COUNT_COLUMN=27;
    public static final int DISTINCT=28;
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
    public static final int HAVING=40;
    public static final int ID=41;
    public static final int IN=42;
    public static final int INFINITE=43;
    public static final int INNER=44;
    public static final int INSERT=45;
    public static final int INSERT_VAL=46;
    public static final int INTERVAL=47;
    public static final int IN_LISTS=48;
    public static final int IS=49;
    public static final int ISNOT=50;
    public static final int JOIN=51;
    public static final int LEFT=52;
    public static final int LEQ=53;
    public static final int LIKE=54;
    public static final int LPAREN=55;
    public static final int LTH=56;
    public static final int MINUS=57;
    public static final int N=58;
    public static final int NAN=59;
    public static final int NEGATIVE=60;
    public static final int NOT=61;
    public static final int NOT_BETWEEN=62;
    public static final int NOT_EQ=63;
    public static final int NOT_LIKE=64;
    public static final int NULL=65;
    public static final int NUMBER=66;
    public static final int OR=67;
    public static final int ORDERBY=68;
    public static final int OUTER=69;
    public static final int PLUS=70;
    public static final int POINT=71;
    public static final int POSITIVE=72;
    public static final int PRIORITY=73;
    public static final int QUOTED_STRING=74;
    public static final int QUTED_STR=75;
    public static final int RANGE=76;
    public static final int REPLACE=77;
    public static final int RIGHT=78;
    public static final int RPAREN=79;
    public static final int SELECT=80;
    public static final int SELECT_LIST=81;
    public static final int SET=82;
    public static final int SET_ELE=83;
    public static final int SHAREMODE=84;
    public static final int SHIFTLEFT=85;
    public static final int SHIFTRIGHT=86;
    public static final int SKIP=87;
    public static final int SUBQUERY=88;
    public static final int TABLENAME=89;
    public static final int TABLENAMES=90;
    public static final int TIME=91;
    public static final int TIME_FUC=92;
    public static final int TIME_FUC_NAME=93;
    public static final int UNION=94;
    public static final int UNIT=95;
    public static final int UPDATE=96;
    public static final int WHERE=97;
    public static final int WS=98;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public MySQLWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public MySQLWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return MySQLWalker.tokenNames; }
    public String getGrammarFileName() { return "D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g"; }


    		protected MySQLConsistStringRegister consistStringRegister;
    		
    		public MySQLConsistStringRegister getConsistStringRegister(){
    				return consistStringRegister;
    		}
    		
    		public void setConsistStringRegister(MySQLConsistStringRegister consistStringRegister){
    				this.consistStringRegister=consistStringRegister;
    		}
    		
    		protected  MySQLFunctionRegister functionRegister;

    		public MySQLFunctionRegister getFunctionRegister() {
    			return functionRegister;
    		}
    		
    		public void setFunctionRegister(MySQLFunctionRegister functionRegister) {
    			this.functionRegister = functionRegister;
    		}

    		public boolean mismatchIsMissingToken(IntStream arg0, BitSet follow) {
    			if ( follow==null ) {
    				throw new IllegalArgumentException("can't know what's wrong...");
    			}
    			throw new IllegalArgumentException("LT(1)=="+((TokenStream)input).LT(1)+" is consistent with what follows; inserting...viable tokens="+follow.toString(getTokenNames())+"LT(1)="+((TokenStream)input).LT(1));
    		}
    		
    		public boolean mismatchIsUnwantedToken(IntStream input, int ttype) {
        		throw new IllegalArgumentException(""+ttype);
        	}


    public static class beg_return extends TreeRuleReturnScope {
        public DMLCommon obj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beg"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:63:1: beg returns [DMLCommon obj] : start_rule ;
    public final MySQLWalker.beg_return beg() throws RecognitionException {
        MySQLWalker.beg_return retval = new MySQLWalker.beg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.start_rule_return start_rule1 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:64:9: ( start_rule )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:64:10: start_rule
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_start_rule_in_beg57);
            start_rule1=start_rule();

            state._fsp--;

            adaptor.addChild(root_0, start_rule1.getTree());


            retval.obj =(start_rule1!=null?start_rule1.obj:null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beg"


    public static class start_rule_return extends TreeRuleReturnScope {
        public DMLCommon obj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start_rule"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:67:1: start_rule returns [DMLCommon obj] : ( select_command[null] | insert_command | update_command | delete_command | replace_command );
    public final MySQLWalker.start_rule_return start_rule() throws RecognitionException {
        MySQLWalker.start_rule_return retval = new MySQLWalker.start_rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.select_command_return select_command2 =null;

        MySQLWalker.insert_command_return insert_command3 =null;

        MySQLWalker.update_command_return update_command4 =null;

        MySQLWalker.delete_command_return delete_command5 =null;

        MySQLWalker.replace_command_return replace_command6 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:68:2: ( select_command[null] | insert_command | update_command | delete_command | replace_command )
            int alt1=5;
            switch ( input.LA(1) ) {
            case SELECT:
                {
                alt1=1;
                }
                break;
            case INSERT:
                {
                alt1=2;
                }
                break;
            case UPDATE:
                {
                alt1=3;
                }
                break;
            case DELETE:
                {
                alt1=4;
                }
                break;
            case REPLACE:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:68:3: select_command[null]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_select_command_in_start_rule74);
                    select_command2=select_command(null);

                    state._fsp--;

                    adaptor.addChild(root_0, select_command2.getTree());


                    retval.obj =(select_command2!=null?select_command2.select:null);

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:69:3: insert_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_insert_command_in_start_rule80);
                    insert_command3=insert_command();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_command3.getTree());


                    retval.obj =(insert_command3!=null?insert_command3.ins:null);

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:70:3: update_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_update_command_in_start_rule85);
                    update_command4=update_command();

                    state._fsp--;

                    adaptor.addChild(root_0, update_command4.getTree());


                    retval.obj =(update_command4!=null?update_command4.update:null);

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:71:3: delete_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_delete_command_in_start_rule90);
                    delete_command5=delete_command();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_command5.getTree());


                    retval.obj =(delete_command5!=null?delete_command5.del:null);

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:72:3: replace_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_replace_command_in_start_rule95);
                    replace_command6=replace_command();

                    state._fsp--;

                    adaptor.addChild(root_0, replace_command6.getTree());


                    retval.obj =(replace_command6!=null?replace_command6.replace:null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start_rule"


    public static class setclause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "setclause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:75:1: setclause[Update update] : ^( SET ( updateColumnSpecs[$update] )+ ) ;
    public final MySQLWalker.setclause_return setclause(Update update) throws RecognitionException {
        MySQLWalker.setclause_return retval = new MySQLWalker.setclause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET7=null;
        MySQLWalker.updateColumnSpecs_return updateColumnSpecs8 =null;


        CommonTree SET7_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:76:2: ( ^( SET ( updateColumnSpecs[$update] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:76:3: ^( SET ( updateColumnSpecs[$update] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SET7=(CommonTree)match(input,SET,FOLLOW_SET_in_setclause108); 
            SET7_tree = (CommonTree)adaptor.dupNode(SET7);


            root_1 = (CommonTree)adaptor.becomeRoot(SET7_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:76:9: ( updateColumnSpecs[$update] )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==SET_ELE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:76:9: updateColumnSpecs[$update]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_updateColumnSpecs_in_setclause110);
            	    updateColumnSpecs8=updateColumnSpecs(update);

            	    state._fsp--;

            	    adaptor.addChild(root_1, updateColumnSpecs8.getTree());


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


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "setclause"


    public static class updateColumnSpecs_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "updateColumnSpecs"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:79:1: updateColumnSpecs[Update update] : ^( SET_ELE updateColumnSpec[$update] ) ;
    public final MySQLWalker.updateColumnSpecs_return updateColumnSpecs(Update update) throws RecognitionException {
        MySQLWalker.updateColumnSpecs_return retval = new MySQLWalker.updateColumnSpecs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET_ELE9=null;
        MySQLWalker.updateColumnSpec_return updateColumnSpec10 =null;


        CommonTree SET_ELE9_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:80:2: ( ^( SET_ELE updateColumnSpec[$update] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:80:3: ^( SET_ELE updateColumnSpec[$update] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SET_ELE9=(CommonTree)match(input,SET_ELE,FOLLOW_SET_ELE_in_updateColumnSpecs127); 
            SET_ELE9_tree = (CommonTree)adaptor.dupNode(SET_ELE9);


            root_1 = (CommonTree)adaptor.becomeRoot(SET_ELE9_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs129);
            updateColumnSpec10=updateColumnSpec(update);

            state._fsp--;

            adaptor.addChild(root_1, updateColumnSpec10.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpecs"


    public static class updateColumnSpec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "updateColumnSpec"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:83:1: updateColumnSpec[Update update] : ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) ;
    public final MySQLWalker.updateColumnSpec_return updateColumnSpec(Update update) throws RecognitionException {
        MySQLWalker.updateColumnSpec_return retval = new MySQLWalker.updateColumnSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ11=null;
        MySQLWalker.table_alias_return table_alias12 =null;

        MySQLWalker.identifier_return identifier13 =null;

        MySQLWalker.expr_return expr14 =null;


        CommonTree EQ11_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:84:2: ( ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:84:3: ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ11=(CommonTree)match(input,EQ,FOLLOW_EQ_in_updateColumnSpec145); 
            EQ11_tree = (CommonTree)adaptor.dupNode(EQ11);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ11_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:84:8: ( table_alias )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==COL_TAB) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:84:8: table_alias
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_alias_in_updateColumnSpec147);
                    table_alias12=table_alias();

                    state._fsp--;

                    adaptor.addChild(root_1, table_alias12.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_updateColumnSpec150);
            identifier13=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier13.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_updateColumnSpec152);
            expr14=expr(update.getIndexHolder());

            state._fsp--;

            adaptor.addChild(root_1, expr14.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	update.addSetElement((identifier13!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier13.start),input.getTreeAdaptor().getTokenStopIndex(identifier13.start))):null),(table_alias12!=null?table_alias12.aText:null),(expr14!=null?expr14.valueObj:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpec"


    public static class insert_command_return extends TreeRuleReturnScope {
        public Insert ins;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:90:1: insert_command returns [Insert ins] : ^( INSERT tables[$ins] ( column_specs[$ins] )* values[$ins] ) ;
    public final MySQLWalker.insert_command_return insert_command() throws RecognitionException {
        MySQLWalker.insert_command_return retval = new MySQLWalker.insert_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT15=null;
        MySQLWalker.tables_return tables16 =null;

        MySQLWalker.column_specs_return column_specs17 =null;

        MySQLWalker.values_return values18 =null;


        CommonTree INSERT15_tree=null;

        retval.ins =new Insert();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:92:2: ( ^( INSERT tables[$ins] ( column_specs[$ins] )* values[$ins] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:92:3: ^( INSERT tables[$ins] ( column_specs[$ins] )* values[$ins] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSERT15=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insert_command175); 
            INSERT15_tree = (CommonTree)adaptor.dupNode(INSERT15);


            root_1 = (CommonTree)adaptor.becomeRoot(INSERT15_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_insert_command177);
            tables16=tables(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, tables16.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:92:25: ( column_specs[$ins] )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COLUMNS) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:92:25: column_specs[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_specs_in_insert_command180);
            	    column_specs17=column_specs(retval.ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_specs17.getTree());


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_values_in_insert_command184);
            values18=values(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, values18.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_command"


    public static class replace_command_return extends TreeRuleReturnScope {
        public Replace replace;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replace_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:95:1: replace_command returns [Replace replace] : ^( REPLACE tables[$replace] ( column_specs[$replace] )* values[$replace] ) ;
    public final MySQLWalker.replace_command_return replace_command() throws RecognitionException {
        MySQLWalker.replace_command_return retval = new MySQLWalker.replace_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree REPLACE19=null;
        MySQLWalker.tables_return tables20 =null;

        MySQLWalker.column_specs_return column_specs21 =null;

        MySQLWalker.values_return values22 =null;


        CommonTree REPLACE19_tree=null;

        retval.replace =new Replace();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:97:2: ( ^( REPLACE tables[$replace] ( column_specs[$replace] )* values[$replace] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:97:3: ^( REPLACE tables[$replace] ( column_specs[$replace] )* values[$replace] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            REPLACE19=(CommonTree)match(input,REPLACE,FOLLOW_REPLACE_in_replace_command205); 
            REPLACE19_tree = (CommonTree)adaptor.dupNode(REPLACE19);


            root_1 = (CommonTree)adaptor.becomeRoot(REPLACE19_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_replace_command207);
            tables20=tables(retval.replace);

            state._fsp--;

            adaptor.addChild(root_1, tables20.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:97:30: ( column_specs[$replace] )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COLUMNS) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:97:30: column_specs[$replace]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_specs_in_replace_command210);
            	    column_specs21=column_specs(retval.replace);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_specs21.getTree());


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_values_in_replace_command214);
            values22=values(retval.replace);

            state._fsp--;

            adaptor.addChild(root_1, values22.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "replace_command"


    public static class values_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "values"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:100:1: values[Insert ins] : ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) ;
    public final MySQLWalker.values_return values(Insert ins) throws RecognitionException {
        MySQLWalker.values_return retval = new MySQLWalker.values_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT_VAL23=null;
        MySQLWalker.expr_return expr24 =null;


        CommonTree INSERT_VAL23_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:101:9: ( ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:101:10: ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSERT_VAL23=(CommonTree)match(input,INSERT_VAL,FOLLOW_INSERT_VAL_in_values237); 
            INSERT_VAL23_tree = (CommonTree)adaptor.dupNode(INSERT_VAL23);


            root_1 = (CommonTree)adaptor.becomeRoot(INSERT_VAL23_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:101:23: ( expr[$ins.getIndexHolder()] )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==ASTERISK||(LA6_0 >= BITAND && LA6_0 <= COLUMNAST)||LA6_0==CONSIST||LA6_0==DIVIDE||LA6_0==ID||LA6_0==INTERVAL||(LA6_0 >= MINUS && LA6_0 <= N)||LA6_0==NEGATIVE||LA6_0==NUMBER||LA6_0==PLUS||LA6_0==POSITIVE||LA6_0==QUTED_STR||(LA6_0 >= SHIFTLEFT && LA6_0 <= SHIFTRIGHT)||LA6_0==SUBQUERY||LA6_0==99||LA6_0==107||LA6_0==130||LA6_0==137||LA6_0==141) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:101:24: expr[$ins.getIndexHolder()]
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_expr_in_values240);
                	    expr24=expr(ins.getIndexHolder());

                	    state._fsp--;

                	    adaptor.addChild(root_1, expr24.getTree());


                	    ins.addValue((expr24!=null?expr24.valueObj:null));

                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "values"


    public static class column_specs_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_specs"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:104:1: column_specs[Insert ins] : ^( COLUMNS ( column_spec[$ins] )+ ) ;
    public final MySQLWalker.column_specs_return column_specs(Insert ins) throws RecognitionException {
        MySQLWalker.column_specs_return retval = new MySQLWalker.column_specs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMNS25=null;
        MySQLWalker.column_spec_return column_spec26 =null;


        CommonTree COLUMNS25_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:105:2: ( ^( COLUMNS ( column_spec[$ins] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:105:3: ^( COLUMNS ( column_spec[$ins] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMNS25=(CommonTree)match(input,COLUMNS,FOLLOW_COLUMNS_in_column_specs258); 
            COLUMNS25_tree = (CommonTree)adaptor.dupNode(COLUMNS25);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMNS25_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:105:13: ( column_spec[$ins] )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==COLUMN) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:105:13: column_spec[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_spec_in_column_specs260);
            	    column_spec26=column_spec(ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_spec26.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_specs"


    public static class column_spec_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_spec"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:108:1: column_spec[Insert ins] : ^( COLUMN identifier ( table_name )? ) ;
    public final MySQLWalker.column_spec_return column_spec(Insert ins) throws RecognitionException {
        MySQLWalker.column_spec_return retval = new MySQLWalker.column_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN27=null;
        MySQLWalker.identifier_return identifier28 =null;

        MySQLWalker.table_name_return table_name29 =null;


        CommonTree COLUMN27_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:109:2: ( ^( COLUMN identifier ( table_name )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:109:3: ^( COLUMN identifier ( table_name )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMN27=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column_spec276); 
            COLUMN27_tree = (CommonTree)adaptor.dupNode(COLUMN27);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN27_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_column_spec278);
            identifier28=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier28.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:109:23: ( table_name )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:109:23: table_name
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_column_spec280);
                    table_name29=table_name();

                    state._fsp--;

                    adaptor.addChild(root_1, table_name29.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		ins.addColumnTandC((table_name29!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name29.start),input.getTreeAdaptor().getTokenStopIndex(table_name29.start))):null),(identifier28!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier28.start),input.getTreeAdaptor().getTokenStopIndex(identifier28.start))):null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_spec"


    public static class whereClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:115:1: whereClause[WhereCondition where] : ^( WHERE sqlCondition[$where] ) ;
    public final MySQLWalker.whereClause_return whereClause(WhereCondition where) throws RecognitionException {
        MySQLWalker.whereClause_return retval = new MySQLWalker.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE30=null;
        MySQLWalker.sqlCondition_return sqlCondition31 =null;


        CommonTree WHERE30_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:116:2: ( ^( WHERE sqlCondition[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:116:3: ^( WHERE sqlCondition[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHERE30=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_whereClause297); 
            WHERE30_tree = (CommonTree)adaptor.dupNode(WHERE30);


            root_1 = (CommonTree)adaptor.becomeRoot(WHERE30_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sqlCondition_in_whereClause299);
            sqlCondition31=sqlCondition(where);

            state._fsp--;

            adaptor.addChild(root_1, sqlCondition31.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class groupByClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:119:1: groupByClause[WhereCondition where] : ^( GROUPBY groupAfterWhere ) ;
    public final MySQLWalker.groupByClause_return groupByClause(WhereCondition where) throws RecognitionException {
        MySQLWalker.groupByClause_return retval = new MySQLWalker.groupByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUPBY32=null;
        MySQLWalker.groupAfterWhere_return groupAfterWhere33 =null;


        CommonTree GROUPBY32_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:120:2: ( ^( GROUPBY groupAfterWhere ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:120:3: ^( GROUPBY groupAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GROUPBY32=(CommonTree)match(input,GROUPBY,FOLLOW_GROUPBY_in_groupByClause314); 
            GROUPBY32_tree = (CommonTree)adaptor.dupNode(GROUPBY32);


            root_1 = (CommonTree)adaptor.becomeRoot(GROUPBY32_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupAfterWhere_in_groupByClause316);
            groupAfterWhere33=groupAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, groupAfterWhere33.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		where.setGroupByColumnList((groupAfterWhere33!=null?groupAfterWhere33.ret:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupByClause"


    public static class havingClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "havingClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:126:1: havingClause[HavingCondition having] : ^( HAVING condition_PAREN[having.getHolder(),having.getExpGroup()] ) ;
    public final MySQLWalker.havingClause_return havingClause(HavingCondition having) throws RecognitionException {
        MySQLWalker.havingClause_return retval = new MySQLWalker.havingClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree HAVING34=null;
        MySQLWalker.condition_PAREN_return condition_PAREN35 =null;


        CommonTree HAVING34_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:127:9: ( ^( HAVING condition_PAREN[having.getHolder(),having.getExpGroup()] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:127:10: ^( HAVING condition_PAREN[having.getHolder(),having.getExpGroup()] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            HAVING34=(CommonTree)match(input,HAVING,FOLLOW_HAVING_in_havingClause340); 
            HAVING34_tree = (CommonTree)adaptor.dupNode(HAVING34);


            root_1 = (CommonTree)adaptor.becomeRoot(HAVING34_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_condition_PAREN_in_havingClause342);
            condition_PAREN35=condition_PAREN(having.getHolder(), having.getExpGroup());

            state._fsp--;

            adaptor.addChild(root_1, condition_PAREN35.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "havingClause"


    public static class orderByClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderByClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:130:1: orderByClause[WhereCondition where] : ^( ORDERBY columnNamesAfterWhere ) ;
    public final MySQLWalker.orderByClause_return orderByClause(WhereCondition where) throws RecognitionException {
        MySQLWalker.orderByClause_return retval = new MySQLWalker.orderByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDERBY36=null;
        MySQLWalker.columnNamesAfterWhere_return columnNamesAfterWhere37 =null;


        CommonTree ORDERBY36_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:131:2: ( ^( ORDERBY columnNamesAfterWhere ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:131:3: ^( ORDERBY columnNamesAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ORDERBY36=(CommonTree)match(input,ORDERBY,FOLLOW_ORDERBY_in_orderByClause371); 
            ORDERBY36_tree = (CommonTree)adaptor.dupNode(ORDERBY36);


            root_1 = (CommonTree)adaptor.becomeRoot(ORDERBY36_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_columnNamesAfterWhere_in_orderByClause373);
            columnNamesAfterWhere37=columnNamesAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, columnNamesAfterWhere37.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		where.setOrderByColumnList((columnNamesAfterWhere37!=null?columnNamesAfterWhere37.ret:null));
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderByClause"


    public static class columnNamesAfterWhere_return extends TreeRuleReturnScope {
        public List<OrderByElement> ret;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnNamesAfterWhere"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:137:1: columnNamesAfterWhere returns [List<OrderByElement> ret] : ( columnNameAfterWhere[$ret] )+ ;
    public final MySQLWalker.columnNamesAfterWhere_return columnNamesAfterWhere() throws RecognitionException {
        MySQLWalker.columnNamesAfterWhere_return retval = new MySQLWalker.columnNamesAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.columnNameAfterWhere_return columnNameAfterWhere38 =null;




        	retval.ret = new ArrayList<OrderByElement>();

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:141:2: ( ( columnNameAfterWhere[$ret] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:141:3: ( columnNameAfterWhere[$ret] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:141:3: ( columnNameAfterWhere[$ret] )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ASC||LA9_0==DESC) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:141:4: columnNameAfterWhere[$ret]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere396);
            	    columnNameAfterWhere38=columnNameAfterWhere(retval.ret);

            	    state._fsp--;

            	    adaptor.addChild(root_0, columnNameAfterWhere38.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnNamesAfterWhere"


    public static class columnNameAfterWhere_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnNameAfterWhere"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:143:1: columnNameAfterWhere[List<OrderByElement> orderByElementList] : ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) );
    public final MySQLWalker.columnNameAfterWhere_return columnNameAfterWhere(List<OrderByElement> orderByElementList) throws RecognitionException {
        MySQLWalker.columnNameAfterWhere_return retval = new MySQLWalker.columnNameAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASC39=null;
        CommonTree DESC42=null;
        MySQLWalker.identifier_return identifier40 =null;

        MySQLWalker.table_alias_return table_alias41 =null;

        MySQLWalker.identifier_return identifier43 =null;

        MySQLWalker.table_alias_return table_alias44 =null;


        CommonTree ASC39_tree=null;
        CommonTree DESC42_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:144:2: ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==ASC) ) {
                alt12=1;
            }
            else if ( (LA12_0==DESC) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:144:3: ^( ASC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASC39=(CommonTree)match(input,ASC,FOLLOW_ASC_in_columnNameAfterWhere410); 
                    ASC39_tree = (CommonTree)adaptor.dupNode(ASC39);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASC39_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere413);
                    identifier40=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier40.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:144:21: ( table_alias )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==COL_TAB) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:144:21: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere415);
                            table_alias41=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias41.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		orderByElementList.add(new OrderByElement((table_alias41!=null?table_alias41.aText:null),(identifier40!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier40.start),input.getTreeAdaptor().getTokenStopIndex(identifier40.start))):null),true));
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:148:3: ^( DESC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DESC42=(CommonTree)match(input,DESC,FOLLOW_DESC_in_columnNameAfterWhere425); 
                    DESC42_tree = (CommonTree)adaptor.dupNode(DESC42);


                    root_1 = (CommonTree)adaptor.becomeRoot(DESC42_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere428);
                    identifier43=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier43.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:148:22: ( table_alias )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==COL_TAB) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:148:22: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere430);
                            table_alias44=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias44.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		orderByElementList.add(new OrderByElement((table_alias44!=null?table_alias44.aText:null),(identifier43!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier43.start),input.getTreeAdaptor().getTokenStopIndex(identifier43.start))):null),false));
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnNameAfterWhere"


    public static class groupAfterWhere_return extends TreeRuleReturnScope {
        public List<GroupByElement> ret;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupAfterWhere"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:155:1: groupAfterWhere returns [List<GroupByElement> ret] : ( afterWhere[$ret] )+ ;
    public final MySQLWalker.groupAfterWhere_return groupAfterWhere() throws RecognitionException {
        MySQLWalker.groupAfterWhere_return retval = new MySQLWalker.groupAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.afterWhere_return afterWhere45 =null;




        	retval.ret = new ArrayList<GroupByElement>();

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:159:2: ( ( afterWhere[$ret] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:159:3: ( afterWhere[$ret] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:159:3: ( afterWhere[$ret] )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ASC||LA13_0==DESC) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:159:4: afterWhere[$ret]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_afterWhere_in_groupAfterWhere456);
            	    afterWhere45=afterWhere(retval.ret);

            	    state._fsp--;

            	    adaptor.addChild(root_0, afterWhere45.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupAfterWhere"


    public static class afterWhere_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "afterWhere"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:161:1: afterWhere[List<GroupByElement> groupByElementList] : ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) );
    public final MySQLWalker.afterWhere_return afterWhere(List<GroupByElement> groupByElementList) throws RecognitionException {
        MySQLWalker.afterWhere_return retval = new MySQLWalker.afterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASC46=null;
        CommonTree DESC49=null;
        MySQLWalker.identifier_return identifier47 =null;

        MySQLWalker.table_alias_return table_alias48 =null;

        MySQLWalker.identifier_return identifier50 =null;

        MySQLWalker.table_alias_return table_alias51 =null;


        CommonTree ASC46_tree=null;
        CommonTree DESC49_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:162:2: ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ASC) ) {
                alt16=1;
            }
            else if ( (LA16_0==DESC) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:162:3: ^( ASC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASC46=(CommonTree)match(input,ASC,FOLLOW_ASC_in_afterWhere470); 
                    ASC46_tree = (CommonTree)adaptor.dupNode(ASC46);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASC46_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_afterWhere473);
                    identifier47=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier47.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:162:21: ( table_alias )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==COL_TAB) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:162:21: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_afterWhere475);
                            table_alias48=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias48.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		groupByElementList.add(new GroupByElement((table_alias48!=null?table_alias48.aText:null),(identifier47!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier47.start),input.getTreeAdaptor().getTokenStopIndex(identifier47.start))):null),true));
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:166:3: ^( DESC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DESC49=(CommonTree)match(input,DESC,FOLLOW_DESC_in_afterWhere485); 
                    DESC49_tree = (CommonTree)adaptor.dupNode(DESC49);


                    root_1 = (CommonTree)adaptor.becomeRoot(DESC49_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_afterWhere488);
                    identifier50=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier50.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:166:22: ( table_alias )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==COL_TAB) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:166:22: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_afterWhere490);
                            table_alias51=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias51.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		groupByElementList.add(new GroupByElement((table_alias51!=null?table_alias51.aText:null),(identifier50!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier50.start),input.getTreeAdaptor().getTokenStopIndex(identifier50.start))):null),false));
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "afterWhere"


    public static class selectClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:172:1: selectClause[Select select] : ^( SELECT select_list[$select] ) ;
    public final MySQLWalker.selectClause_return selectClause(Select select) throws RecognitionException {
        MySQLWalker.selectClause_return retval = new MySQLWalker.selectClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT52=null;
        MySQLWalker.select_list_return select_list53 =null;


        CommonTree SELECT52_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:173:9: ( ^( SELECT select_list[$select] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:173:10: ^( SELECT select_list[$select] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT52=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_selectClause514); 
            SELECT52_tree = (CommonTree)adaptor.dupNode(SELECT52);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT52_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_list_in_selectClause517);
            select_list53=select_list(select);

            state._fsp--;

            adaptor.addChild(root_1, select_list53.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class sqlCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sqlCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:176:1: sqlCondition[WhereCondition where] : ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) );
    public final MySQLWalker.sqlCondition_return sqlCondition(WhereCondition where) throws RecognitionException {
        MySQLWalker.sqlCondition_return retval = new MySQLWalker.sqlCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_OR_NOT54=null;
        CommonTree CONDITION_OR56=null;
        MySQLWalker.condition_return condition55 =null;

        MySQLWalker.condition_return condition57 =null;


        CommonTree CONDITION_OR_NOT54_tree=null;
        CommonTree CONDITION_OR56_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:177:2: ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==CONDITION_OR_NOT) ) {
                alt17=1;
            }
            else if ( (LA17_0==CONDITION_OR) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:177:3: ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONDITION_OR_NOT54=(CommonTree)match(input,CONDITION_OR_NOT,FOLLOW_CONDITION_OR_NOT_in_sqlCondition548); 
                    CONDITION_OR_NOT54_tree = (CommonTree)adaptor.dupNode(CONDITION_OR_NOT54);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR_NOT54_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition550);
                    condition55=condition(where.getHolder(), where.getExpGroup(), false);

                    state._fsp--;

                    adaptor.addChild(root_1, condition55.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:178:3: ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONDITION_OR56=(CommonTree)match(input,CONDITION_OR,FOLLOW_CONDITION_OR_in_sqlCondition557); 
                    CONDITION_OR56_tree = (CommonTree)adaptor.dupNode(CONDITION_OR56);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR56_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition559);
                    condition57=condition(where.getHolder(), where.getExpGroup(), false);

                    state._fsp--;

                    adaptor.addChild(root_1, condition57.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sqlCondition"


    public static class condition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:181:1: condition[BindIndexHolder where,ExpressionGroup eg,boolean isPriority] : ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) );
    public final MySQLWalker.condition_return condition(BindIndexHolder where, ExpressionGroup eg, boolean isPriority) throws RecognitionException {
        MySQLWalker.condition_return retval = new MySQLWalker.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal58=null;
        CommonTree string_literal59=null;
        CommonTree PRIORITY62=null;
        MySQLWalker.condition_return s1 =null;

        MySQLWalker.condition_return condition60 =null;

        MySQLWalker.condition_PAREN_return condition_PAREN61 =null;

        MySQLWalker.condition_return condition63 =null;


        CommonTree string_literal58_tree=null;
        CommonTree string_literal59_tree=null;
        CommonTree PRIORITY62_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:182:2: ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 132:
                {
                alt20=1;
                }
                break;
            case 100:
                {
                alt20=2;
                }
                break;
            case EQ:
            case GEQ:
            case GTH:
            case IN:
            case IS:
            case ISNOT:
            case LEQ:
            case LIKE:
            case LTH:
            case NOT_EQ:
            case NOT_LIKE:
                {
                alt20=3;
                }
                break;
            case PRIORITY:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:183:2: ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();



                    		ORExpressionGroup orExp=new ORExpressionGroup();
                    		eg.addExpressionGroup(orExp);
                    	

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal58=(CommonTree)match(input,132,FOLLOW_132_in_condition577); 
                    string_literal58_tree = (CommonTree)adaptor.dupNode(string_literal58);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal58_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:186:12: (s1= condition[where,orExp,$isPriority] )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==EQ||LA18_0==GEQ||LA18_0==GTH||LA18_0==IN||(LA18_0 >= IS && LA18_0 <= ISNOT)||(LA18_0 >= LEQ && LA18_0 <= LIKE)||LA18_0==LTH||(LA18_0 >= NOT_EQ && LA18_0 <= NOT_LIKE)||LA18_0==PRIORITY||LA18_0==100||LA18_0==132) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:186:12: s1= condition[where,orExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition581);
                    	    s1=condition(where, orExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, s1.getTree());


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


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:188:2: ^( 'AND' ( condition[where,andExp,$isPriority] )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();



                    		ExpressionGroup andExp=new ExpressionGroup();
                    		eg.addExpressionGroup(andExp);
                    	

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    string_literal59=(CommonTree)match(input,100,FOLLOW_100_in_condition593); 
                    string_literal59_tree = (CommonTree)adaptor.dupNode(string_literal59);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal59_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:191:11: ( condition[where,andExp,$isPriority] )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==EQ||LA19_0==GEQ||LA19_0==GTH||LA19_0==IN||(LA19_0 >= IS && LA19_0 <= ISNOT)||(LA19_0 >= LEQ && LA19_0 <= LIKE)||LA19_0==LTH||(LA19_0 >= NOT_EQ && LA19_0 <= NOT_LIKE)||LA19_0==PRIORITY||LA19_0==100||LA19_0==132) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:191:11: condition[where,andExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition595);
                    	    condition60=condition(where, andExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, condition60.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:192:3: condition_PAREN[where,$eg]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_PAREN_in_condition602);
                    condition_PAREN61=condition_PAREN(where, eg);

                    state._fsp--;

                    adaptor.addChild(root_0, condition_PAREN61.getTree());


                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:193:3: ^( PRIORITY condition[where,$eg,true] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PRIORITY62=(CommonTree)match(input,PRIORITY,FOLLOW_PRIORITY_in_condition608); 
                    PRIORITY62_tree = (CommonTree)adaptor.dupNode(PRIORITY62);


                    root_1 = (CommonTree)adaptor.becomeRoot(PRIORITY62_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition610);
                    condition63=condition(where, eg, true);

                    state._fsp--;

                    adaptor.addChild(root_1, condition63.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class condition_PAREN_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_PAREN"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:196:1: condition_PAREN[BindIndexHolder where,ExpressionGroup exp] : ( condition_expr[$where,$exp] )+ ;
    public final MySQLWalker.condition_PAREN_return condition_PAREN(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.condition_PAREN_return retval = new MySQLWalker.condition_PAREN_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.condition_expr_return condition_expr64 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:197:2: ( ( condition_expr[$where,$exp] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:197:3: ( condition_expr[$where,$exp] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:197:3: ( condition_expr[$where,$exp] )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case EQ:
                    {
                    alt21=1;
                    }
                    break;
                case NOT_EQ:
                    {
                    alt21=1;
                    }
                    break;
                case LTH:
                    {
                    alt21=1;
                    }
                    break;
                case GTH:
                    {
                    alt21=1;
                    }
                    break;
                case LEQ:
                    {
                    alt21=1;
                    }
                    break;
                case GEQ:
                    {
                    alt21=1;
                    }
                    break;
                case IN:
                    {
                    alt21=1;
                    }
                    break;
                case ISNOT:
                    {
                    alt21=1;
                    }
                    break;
                case IS:
                    {
                    alt21=1;
                    }
                    break;
                case NOT_LIKE:
                    {
                    alt21=1;
                    }
                    break;
                case LIKE:
                    {
                    alt21=1;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:197:3: condition_expr[$where,$exp]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_condition_expr_in_condition_PAREN623);
            	    condition_expr64=condition_expr(where, exp);

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition_expr64.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_PAREN"


    public static class condition_expr_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_expr"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:200:1: condition_expr[BindIndexHolder where,ExpressionGroup exp] : ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] );
    public final MySQLWalker.condition_expr_return condition_expr(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.condition_expr_return retval = new MySQLWalker.condition_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.comparisonCondition_return comparisonCondition65 =null;

        MySQLWalker.inCondition_return inCondition66 =null;

        MySQLWalker.isCondition_return isCondition67 =null;

        MySQLWalker.likeCondition_return likeCondition68 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:201:2: ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] )
            int alt22=4;
            switch ( input.LA(1) ) {
            case EQ:
            case GEQ:
            case GTH:
            case LEQ:
            case LTH:
            case NOT_EQ:
                {
                alt22=1;
                }
                break;
            case IN:
                {
                alt22=2;
                }
                break;
            case IS:
            case ISNOT:
                {
                alt22=3;
                }
                break;
            case LIKE:
            case NOT_LIKE:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:201:4: comparisonCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_comparisonCondition_in_condition_expr638);
                    comparisonCondition65=comparisonCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, comparisonCondition65.getTree());


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:202:4: inCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_inCondition_in_condition_expr644);
                    inCondition66=inCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, inCondition66.getTree());


                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:203:4: isCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_isCondition_in_condition_expr651);
                    isCondition67=isCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, isCondition67.getTree());


                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:204:4: likeCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_likeCondition_in_condition_expr658);
                    likeCondition68=likeCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, likeCondition68.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_expr"


    public static class betweenCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "betweenCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:208:1: betweenCondition : ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) );
    public final MySQLWalker.betweenCondition_return betweenCondition() throws RecognitionException {
        MySQLWalker.betweenCondition_return retval = new MySQLWalker.betweenCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_BETWEEN69=null;
        CommonTree BETWEEN71=null;
        MySQLWalker.between_and_return between_and70 =null;

        MySQLWalker.between_and_return between_and72 =null;


        CommonTree NOT_BETWEEN69_tree=null;
        CommonTree BETWEEN71_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:209:2: ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==NOT_BETWEEN) ) {
                alt23=1;
            }
            else if ( (LA23_0==BETWEEN) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:209:3: ^( NOT_BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT_BETWEEN69=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenCondition672); 
                    NOT_BETWEEN69_tree = (CommonTree)adaptor.dupNode(NOT_BETWEEN69);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_BETWEEN69_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition674);
                        between_and70=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and70.getTree());


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:210:3: ^( BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BETWEEN71=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenCondition680); 
                    BETWEEN71_tree = (CommonTree)adaptor.dupNode(BETWEEN71);


                    root_1 = (CommonTree)adaptor.becomeRoot(BETWEEN71_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition682);
                        between_and72=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and72.getTree());


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "betweenCondition"


    public static class between_and_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "between_and"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:213:1: between_and :;
    public final MySQLWalker.between_and_return between_and() throws RecognitionException {
        MySQLWalker.between_and_return retval = new MySQLWalker.between_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:214:2: ()
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:215:2: 
            {
            root_0 = (CommonTree)adaptor.nil();


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "between_and"


    public static class likeCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "likeCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:217:1: likeCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) );
    public final MySQLWalker.likeCondition_return likeCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.likeCondition_return retval = new MySQLWalker.likeCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_LIKE73=null;
        CommonTree LIKE76=null;
        MySQLWalker.expr_return expr74 =null;

        MySQLWalker.left_cond_return left_cond75 =null;

        MySQLWalker.expr_return expr77 =null;

        MySQLWalker.left_cond_return left_cond78 =null;


        CommonTree NOT_LIKE73_tree=null;
        CommonTree LIKE76_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:218:2: ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NOT_LIKE) ) {
                alt24=1;
            }
            else if ( (LA24_0==LIKE) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:218:3: ^( NOT_LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT_LIKE73=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeCondition707); 
                    NOT_LIKE73_tree = (CommonTree)adaptor.dupNode(NOT_LIKE73);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_LIKE73_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition709);
                    expr74=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr74.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition712);
                    left_cond75=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond75.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    			NotLike notlike=new NotLike();
                    		notlike.setLeft((left_cond75!=null?left_cond75.ret:null));
                    		notlike.setRight((expr74!=null?expr74.valueObj:null));
                    		exp.addExpression(notlike);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:224:3: ^( LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LIKE76=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeCondition720); 
                    LIKE76_tree = (CommonTree)adaptor.dupNode(LIKE76);


                    root_1 = (CommonTree)adaptor.becomeRoot(LIKE76_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition722);
                    expr77=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr77.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition725);
                    left_cond78=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond78.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		Like like=new Like();
                    		like.setLeft((left_cond78!=null?left_cond78.ret:null));
                    		like.setRight((expr77!=null?expr77.valueObj:null));
                    		exp.addExpression(like);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "likeCondition"


    public static class isCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:232:1: isCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) );
    public final MySQLWalker.isCondition_return isCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.isCondition_return retval = new MySQLWalker.isCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ISNOT79=null;
        CommonTree NULL80=null;
        CommonTree IS82=null;
        CommonTree NULL83=null;
        MySQLWalker.left_cond_return left_cond81 =null;

        MySQLWalker.left_cond_return left_cond84 =null;


        CommonTree ISNOT79_tree=null;
        CommonTree NULL80_tree=null;
        CommonTree IS82_tree=null;
        CommonTree NULL83_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:233:2: ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ISNOT) ) {
                alt25=1;
            }
            else if ( (LA25_0==IS) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:233:3: ^( ISNOT NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ISNOT79=(CommonTree)match(input,ISNOT,FOLLOW_ISNOT_in_isCondition741); 
                    ISNOT79_tree = (CommonTree)adaptor.dupNode(ISNOT79);


                    root_1 = (CommonTree)adaptor.becomeRoot(ISNOT79_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL80=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition743); 
                    NULL80_tree = (CommonTree)adaptor.dupNode(NULL80);


                    adaptor.addChild(root_1, NULL80_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition745);
                    left_cond81=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond81.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		IsNot arg=new IsNot();
                    		arg.setLeft((left_cond81!=null?left_cond81.ret:null));
                    		arg.setRight(null);
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:239:3: ^( IS NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IS82=(CommonTree)match(input,IS,FOLLOW_IS_in_isCondition753); 
                    IS82_tree = (CommonTree)adaptor.dupNode(IS82);


                    root_1 = (CommonTree)adaptor.becomeRoot(IS82_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL83=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition755); 
                    NULL83_tree = (CommonTree)adaptor.dupNode(NULL83);


                    adaptor.addChild(root_1, NULL83_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition757);
                    left_cond84=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond84.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		Is arg=new Is();
                    		arg.setLeft((left_cond84!=null?left_cond84.ret:null));
                    		arg.setRight(null);
                    		exp.addExpression(arg);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "isCondition"


    public static class comparisonCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisonCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:248:1: comparisonCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) );
    public final MySQLWalker.comparisonCondition_return comparisonCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.comparisonCondition_return retval = new MySQLWalker.comparisonCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ85=null;
        CommonTree NOT_EQ88=null;
        CommonTree LTH91=null;
        CommonTree GTH94=null;
        CommonTree LEQ97=null;
        CommonTree GEQ100=null;
        MySQLWalker.expr_return expr86 =null;

        MySQLWalker.left_cond_return left_cond87 =null;

        MySQLWalker.expr_return expr89 =null;

        MySQLWalker.left_cond_return left_cond90 =null;

        MySQLWalker.expr_return expr92 =null;

        MySQLWalker.left_cond_return left_cond93 =null;

        MySQLWalker.expr_return expr95 =null;

        MySQLWalker.left_cond_return left_cond96 =null;

        MySQLWalker.expr_return expr98 =null;

        MySQLWalker.left_cond_return left_cond99 =null;

        MySQLWalker.expr_return expr101 =null;

        MySQLWalker.left_cond_return left_cond102 =null;


        CommonTree EQ85_tree=null;
        CommonTree NOT_EQ88_tree=null;
        CommonTree LTH91_tree=null;
        CommonTree GTH94_tree=null;
        CommonTree LEQ97_tree=null;
        CommonTree GEQ100_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:249:2: ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt26=1;
                }
                break;
            case NOT_EQ:
                {
                alt26=2;
                }
                break;
            case LTH:
                {
                alt26=3;
                }
                break;
            case GTH:
                {
                alt26=4;
                }
                break;
            case LEQ:
                {
                alt26=5;
                }
                break;
            case GEQ:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:249:3: ^( EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ85=(CommonTree)match(input,EQ,FOLLOW_EQ_in_comparisonCondition774); 
                    EQ85_tree = (CommonTree)adaptor.dupNode(EQ85);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQ85_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition776);
                    expr86=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr86.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition779);
                    left_cond87=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond87.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		Equivalent arg=new Equivalent();
                    		arg.setLeft((left_cond87!=null?left_cond87.ret:null));
                    		arg.setRight((expr86!=null?expr86.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:256:3: ^( NOT_EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT_EQ88=(CommonTree)match(input,NOT_EQ,FOLLOW_NOT_EQ_in_comparisonCondition789); 
                    NOT_EQ88_tree = (CommonTree)adaptor.dupNode(NOT_EQ88);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_EQ88_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition791);
                    expr89=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr89.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition794);
                    left_cond90=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond90.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		NotEquivalent arg=new NotEquivalent();
                    		arg.setLeft((left_cond90!=null?left_cond90.ret:null));
                    		arg.setRight((expr89!=null?expr89.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:263:3: ^( LTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LTH91=(CommonTree)match(input,LTH,FOLLOW_LTH_in_comparisonCondition804); 
                    LTH91_tree = (CommonTree)adaptor.dupNode(LTH91);


                    root_1 = (CommonTree)adaptor.becomeRoot(LTH91_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition806);
                    expr92=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr92.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition809);
                    left_cond93=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond93.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		LessThan arg=new LessThan();
                    		arg.setLeft((left_cond93!=null?left_cond93.ret:null));
                    		arg.setRight((expr92!=null?expr92.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:270:3: ^( GTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GTH94=(CommonTree)match(input,GTH,FOLLOW_GTH_in_comparisonCondition819); 
                    GTH94_tree = (CommonTree)adaptor.dupNode(GTH94);


                    root_1 = (CommonTree)adaptor.becomeRoot(GTH94_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition821);
                    expr95=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr95.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition824);
                    left_cond96=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond96.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		GreaterThan arg=new GreaterThan();
                    		arg.setLeft((left_cond96!=null?left_cond96.ret:null));
                    		arg.setRight((expr95!=null?expr95.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:277:3: ^( LEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LEQ97=(CommonTree)match(input,LEQ,FOLLOW_LEQ_in_comparisonCondition834); 
                    LEQ97_tree = (CommonTree)adaptor.dupNode(LEQ97);


                    root_1 = (CommonTree)adaptor.becomeRoot(LEQ97_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition836);
                    expr98=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr98.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition839);
                    left_cond99=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond99.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		LessThanOrEquivalent arg=new LessThanOrEquivalent();
                    		arg.setLeft((left_cond99!=null?left_cond99.ret:null));
                    		arg.setRight((expr98!=null?expr98.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:284:3: ^( GEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GEQ100=(CommonTree)match(input,GEQ,FOLLOW_GEQ_in_comparisonCondition849); 
                    GEQ100_tree = (CommonTree)adaptor.dupNode(GEQ100);


                    root_1 = (CommonTree)adaptor.becomeRoot(GEQ100_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition851);
                    expr101=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr101.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition854);
                    left_cond102=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond102.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		GreaterThanOrEquivalent arg=new GreaterThanOrEquivalent();
                    		arg.setLeft((left_cond102!=null?left_cond102.ret:null));
                    		arg.setRight((expr101!=null?expr101.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comparisonCondition"


    public static class left_cond_return extends TreeRuleReturnScope {
        public Object ret;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "left_cond"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:293:1: left_cond[BindIndexHolder where] returns [Object ret] : ^( CONDITION_LEFT expr[$where] ) ;
    public final MySQLWalker.left_cond_return left_cond(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.left_cond_return retval = new MySQLWalker.left_cond_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_LEFT103=null;
        MySQLWalker.expr_return expr104 =null;


        CommonTree CONDITION_LEFT103_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:295:2: ( ^( CONDITION_LEFT expr[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:295:3: ^( CONDITION_LEFT expr[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CONDITION_LEFT103=(CommonTree)match(input,CONDITION_LEFT,FOLLOW_CONDITION_LEFT_in_left_cond876); 
            CONDITION_LEFT103_tree = (CommonTree)adaptor.dupNode(CONDITION_LEFT103);


            root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_LEFT103_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_left_cond878);
            expr104=expr(where);

            state._fsp--;

            adaptor.addChild(root_1, expr104.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		retval.ret =(expr104!=null?expr104.valueObj:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "left_cond"


    public static class in_list_return extends TreeRuleReturnScope {
        public List list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "in_list"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:301:1: in_list[BindIndexHolder where] returns [List list] : ^( IN_LISTS inCondition_expr_adds[$where] ) ;
    public final MySQLWalker.in_list_return in_list(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.in_list_return retval = new MySQLWalker.in_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IN_LISTS105=null;
        MySQLWalker.inCondition_expr_adds_return inCondition_expr_adds106 =null;


        CommonTree IN_LISTS105_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:302:2: ( ^( IN_LISTS inCondition_expr_adds[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:302:3: ^( IN_LISTS inCondition_expr_adds[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IN_LISTS105=(CommonTree)match(input,IN_LISTS,FOLLOW_IN_LISTS_in_in_list899); 
            IN_LISTS105_tree = (CommonTree)adaptor.dupNode(IN_LISTS105);


            root_1 = (CommonTree)adaptor.becomeRoot(IN_LISTS105_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_inCondition_expr_adds_in_in_list901);
            inCondition_expr_adds106=inCondition_expr_adds(where);

            state._fsp--;

            adaptor.addChild(root_1, inCondition_expr_adds106.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		retval.list =(inCondition_expr_adds106!=null?inCondition_expr_adds106.list:null);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "in_list"


    public static class inCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:308:1: inCondition[BindIndexHolder where,ExpressionGroup exp] : ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] ) ;
    public final MySQLWalker.inCondition_return inCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        MySQLWalker.inCondition_return retval = new MySQLWalker.inCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree not=null;
        CommonTree IN107=null;
        MySQLWalker.subquery_return subquery108 =null;

        MySQLWalker.in_list_return in_list109 =null;

        MySQLWalker.left_cond_return left_cond110 =null;


        CommonTree not_tree=null;
        CommonTree IN107_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:2: ( ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:3: ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IN107=(CommonTree)match(input,IN,FOLLOW_IN_in_inCondition921); 
            IN107_tree = (CommonTree)adaptor.dupNode(IN107);


            root_1 = (CommonTree)adaptor.becomeRoot(IN107_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:11: (not= 'NOT' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==129) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:11: not= 'NOT'
                    {
                    _last = (CommonTree)input.LT(1);
                    not=(CommonTree)match(input,129,FOLLOW_129_in_inCondition925); 
                    not_tree = (CommonTree)adaptor.dupNode(not);


                    adaptor.addChild(root_1, not_tree);


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:19: ( subquery[$where] )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SUBQUERY) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:19: subquery[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_inCondition928);
                    subquery108=subquery(where);

                    state._fsp--;

                    adaptor.addChild(root_1, subquery108.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:37: ( in_list[$where] )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==IN_LISTS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:309:37: in_list[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_in_list_in_inCondition932);
                    in_list109=in_list(where);

                    state._fsp--;

                    adaptor.addChild(root_1, in_list109.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_left_cond_in_inCondition937);
            left_cond110=left_cond(where);

            state._fsp--;

            adaptor.addChild(root_1, left_cond110.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		if((not!=null?not.getText():null)!=null){
            			if((subquery108!=null?subquery108.subselect:null)!=null){
            					NotInExpression arg=new NotInExpression();
            					arg.setLeft((left_cond110!=null?left_cond110.ret:null));
            					arg.setRight((subquery108!=null?subquery108.subselect:null));
            					exp.addExpression(arg);
            			}
            			else if((in_list109!=null?in_list109.list:null)!=null){
            					NotInExpression arg=new NotInExpression();
            					arg.setLeft((left_cond110!=null?left_cond110.ret:null));
            					arg.setRight((in_list109!=null?in_list109.list:null));
            					exp.addExpression(arg);
            			}
            		}else{
            			if((subquery108!=null?subquery108.subselect:null)!=null){
            					InExpression arg=new InExpression();
            					arg.setLeft((left_cond110!=null?left_cond110.ret:null));
            					arg.setRight((subquery108!=null?subquery108.subselect:null));
            					exp.addExpression(arg);
            			}
            			else if((in_list109!=null?in_list109.list:null)!=null){
            					InExpression arg=new InExpression();
            					arg.setLeft((left_cond110!=null?left_cond110.ret:null));
            					arg.setRight((in_list109!=null?in_list109.list:null));
            					exp.addExpression(arg);
            			}
            		}
            		;
            		

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inCondition"


    public static class inCondition_expr_adds_return extends TreeRuleReturnScope {
        public List list;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inCondition_expr_adds"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:343:1: inCondition_expr_adds[BindIndexHolder where] returns [List list] : ( expr_add[$where] )+ ;
    public final MySQLWalker.inCondition_expr_adds_return inCondition_expr_adds(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.inCondition_expr_adds_return retval = new MySQLWalker.inCondition_expr_adds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.expr_add_return expr_add111 =null;



        retval.list =new ArrayList();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:344:31: ( ( expr_add[$where] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:345:2: ( expr_add[$where] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:345:2: ( expr_add[$where] )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==ASTERISK||(LA30_0 >= BITAND && LA30_0 <= COLUMNAST)||LA30_0==CONSIST||LA30_0==DIVIDE||LA30_0==ID||LA30_0==INTERVAL||(LA30_0 >= MINUS && LA30_0 <= N)||LA30_0==NEGATIVE||LA30_0==NUMBER||LA30_0==PLUS||LA30_0==POSITIVE||LA30_0==QUTED_STR||(LA30_0 >= SHIFTLEFT && LA30_0 <= SHIFTRIGHT)||LA30_0==99||LA30_0==107||LA30_0==130||LA30_0==137||LA30_0==141) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:345:3: expr_add[$where]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_add_in_inCondition_expr_adds968);
            	    expr_add111=expr_add(where);

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add111.getTree());



            	    		retval.list.add((expr_add111!=null?expr_add111.valueObjExpr:null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inCondition_expr_adds"


    public static class expr_return extends TreeRuleReturnScope {
        public Object valueObj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:352:1: expr[BindIndexHolder where] returns [Object valueObj] : ( expr_add[$where] | subquery[$where] ) ;
    public final MySQLWalker.expr_return expr(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.expr_return retval = new MySQLWalker.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.expr_add_return expr_add112 =null;

        MySQLWalker.subquery_return subquery113 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:353:2: ( ( expr_add[$where] | subquery[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:353:3: ( expr_add[$where] | subquery[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:353:3: ( expr_add[$where] | subquery[$where] )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==ASTERISK||(LA31_0 >= BITAND && LA31_0 <= COLUMNAST)||LA31_0==CONSIST||LA31_0==DIVIDE||LA31_0==ID||LA31_0==INTERVAL||(LA31_0 >= MINUS && LA31_0 <= N)||LA31_0==NEGATIVE||LA31_0==NUMBER||LA31_0==PLUS||LA31_0==POSITIVE||LA31_0==QUTED_STR||(LA31_0 >= SHIFTLEFT && LA31_0 <= SHIFTRIGHT)||LA31_0==99||LA31_0==107||LA31_0==130||LA31_0==137||LA31_0==141) ) {
                alt31=1;
            }
            else if ( (LA31_0==SUBQUERY) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:353:4: expr_add[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr993);
                    expr_add112=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_0, expr_add112.getTree());


                    retval.valueObj =(expr_add112!=null?expr_add112.valueObjExpr:null);

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:354:3: subquery[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_expr1000);
                    subquery113=subquery(where);

                    state._fsp--;

                    adaptor.addChild(root_0, subquery113.getTree());


                    retval.valueObj =(subquery113!=null?subquery113.subselect:null);

                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class expr_add_return extends TreeRuleReturnScope {
        public Object valueObjExpr;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_add"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:358:1: expr_add[BindIndexHolder where] returns [Object valueObjExpr] : ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | 'ROWNUM' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( INTERVAL i_v= inner_value[$where] u= unit ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) );
    public final MySQLWalker.expr_add_return expr_add(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.expr_add_return retval = new MySQLWalker.expr_add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NEGATIVE114=null;
        CommonTree POSITIVE115=null;
        CommonTree PLUS116=null;
        CommonTree MINUS117=null;
        CommonTree BITOR118=null;
        CommonTree BITAND119=null;
        CommonTree BITXOR120=null;
        CommonTree SHIFTLEFT121=null;
        CommonTree SHIFTRIGHT122=null;
        CommonTree ASTERISK123=null;
        CommonTree DIVIDE124=null;
        CommonTree N125=null;
        CommonTree NUMBER126=null;
        CommonTree string_literal128=null;
        CommonTree string_literal129=null;
        CommonTree char_literal130=null;
        CommonTree QUTED_STR131=null;
        CommonTree COLUMN133=null;
        CommonTree COLUMNAST136=null;
        CommonTree ASTERISK137=null;
        CommonTree INTERVAL138=null;
        CommonTree ID139=null;
        CommonTree CONSIST141=null;
        CommonTree ID142=null;
        MySQLWalker.expr_add_return s1 =null;

        MySQLWalker.expr_add_return s2 =null;

        MySQLWalker.inner_value_return i_v =null;

        MySQLWalker.unit_return u =null;

        MySQLWalker.boolean_literal_return boolean_literal127 =null;

        MySQLWalker.quoted_string_return quoted_string132 =null;

        MySQLWalker.identifier_return identifier134 =null;

        MySQLWalker.table_name_return table_name135 =null;

        MySQLWalker.expr_return expr140 =null;


        CommonTree NEGATIVE114_tree=null;
        CommonTree POSITIVE115_tree=null;
        CommonTree PLUS116_tree=null;
        CommonTree MINUS117_tree=null;
        CommonTree BITOR118_tree=null;
        CommonTree BITAND119_tree=null;
        CommonTree BITXOR120_tree=null;
        CommonTree SHIFTLEFT121_tree=null;
        CommonTree SHIFTRIGHT122_tree=null;
        CommonTree ASTERISK123_tree=null;
        CommonTree DIVIDE124_tree=null;
        CommonTree N125_tree=null;
        CommonTree NUMBER126_tree=null;
        CommonTree string_literal128_tree=null;
        CommonTree string_literal129_tree=null;
        CommonTree char_literal130_tree=null;
        CommonTree QUTED_STR131_tree=null;
        CommonTree COLUMN133_tree=null;
        CommonTree COLUMNAST136_tree=null;
        CommonTree ASTERISK137_tree=null;
        CommonTree INTERVAL138_tree=null;
        CommonTree ID139_tree=null;
        CommonTree CONSIST141_tree=null;
        CommonTree ID142_tree=null;


        List<Object> list=new ArrayList<Object>();

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:362:2: ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | 'ROWNUM' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( INTERVAL i_v= inner_value[$where] u= unit ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) )
            int alt34=23;
            switch ( input.LA(1) ) {
            case NEGATIVE:
                {
                alt34=1;
                }
                break;
            case POSITIVE:
                {
                alt34=2;
                }
                break;
            case PLUS:
                {
                alt34=3;
                }
                break;
            case MINUS:
                {
                alt34=4;
                }
                break;
            case BITOR:
                {
                alt34=5;
                }
                break;
            case BITAND:
                {
                alt34=6;
                }
                break;
            case BITXOR:
                {
                alt34=7;
                }
                break;
            case SHIFTLEFT:
                {
                alt34=8;
                }
                break;
            case SHIFTRIGHT:
                {
                alt34=9;
                }
                break;
            case ASTERISK:
                {
                alt34=10;
                }
                break;
            case DIVIDE:
                {
                alt34=11;
                }
                break;
            case N:
                {
                alt34=12;
                }
                break;
            case NUMBER:
                {
                alt34=13;
                }
                break;
            case 107:
            case 141:
                {
                alt34=14;
                }
                break;
            case 130:
                {
                alt34=15;
                }
                break;
            case 137:
                {
                alt34=16;
                }
                break;
            case 99:
                {
                alt34=17;
                }
                break;
            case QUTED_STR:
                {
                alt34=18;
                }
                break;
            case COLUMN:
                {
                alt34=19;
                }
                break;
            case COLUMNAST:
                {
                alt34=20;
                }
                break;
            case INTERVAL:
                {
                alt34=21;
                }
                break;
            case ID:
                {
                alt34=22;
                }
                break;
            case CONSIST:
                {
                alt34=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }

            switch (alt34) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:362:3: ^( NEGATIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NEGATIVE114=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_expr_add1028); 
                    NEGATIVE114_tree = (CommonTree)adaptor.dupNode(NEGATIVE114);


                    root_1 = (CommonTree)adaptor.becomeRoot(NEGATIVE114_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1032);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  retval.valueObjExpr =((BigDecimal)(s1!=null?s1.valueObjExpr:null)).negate();
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:365:3: ^( POSITIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    POSITIVE115=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_expr_add1041); 
                    POSITIVE115_tree = (CommonTree)adaptor.dupNode(POSITIVE115);


                    root_1 = (CommonTree)adaptor.becomeRoot(POSITIVE115_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1045);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  retval.valueObjExpr =(s1!=null?s1.valueObjExpr:null);
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:368:3: ^( PLUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS116=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr_add1054); 
                    PLUS116_tree = (CommonTree)adaptor.dupNode(PLUS116);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS116_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1058);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1063);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new Add();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:375:3: ^( MINUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS117=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr_add1072); 
                    MINUS117_tree = (CommonTree)adaptor.dupNode(MINUS117);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS117_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1076);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1081);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new Subtract();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:382:3: ^( BITOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BITOR118=(CommonTree)match(input,BITOR,FOLLOW_BITOR_in_expr_add1089); 
                    BITOR118_tree = (CommonTree)adaptor.dupNode(BITOR118);


                    root_1 = (CommonTree)adaptor.becomeRoot(BITOR118_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1093);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1098);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new BitOr();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:389:3: ^( BITAND s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BITAND119=(CommonTree)match(input,BITAND,FOLLOW_BITAND_in_expr_add1106); 
                    BITAND119_tree = (CommonTree)adaptor.dupNode(BITAND119);


                    root_1 = (CommonTree)adaptor.becomeRoot(BITAND119_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1110);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1115);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new BitAnd();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 7 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:396:3: ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BITXOR120=(CommonTree)match(input,BITXOR,FOLLOW_BITXOR_in_expr_add1123); 
                    BITXOR120_tree = (CommonTree)adaptor.dupNode(BITXOR120);


                    root_1 = (CommonTree)adaptor.becomeRoot(BITXOR120_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1127);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1132);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new BitXOr();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 8 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:403:3: ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHIFTLEFT121=(CommonTree)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_expr_add1140); 
                    SHIFTLEFT121_tree = (CommonTree)adaptor.dupNode(SHIFTLEFT121);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTLEFT121_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1144);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1149);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new ShiftLeft();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 9 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:410:3: ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHIFTRIGHT122=(CommonTree)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_expr_add1157); 
                    SHIFTRIGHT122_tree = (CommonTree)adaptor.dupNode(SHIFTRIGHT122);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTRIGHT122_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1161);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1166);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new ShiftRight();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 10 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:417:3: ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASTERISK123=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add1174); 
                    ASTERISK123_tree = (CommonTree)adaptor.dupNode(ASTERISK123);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK123_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1178);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1183);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new Multiply();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 11 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:424:3: ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DIVIDE124=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_add1191); 
                    DIVIDE124_tree = (CommonTree)adaptor.dupNode(DIVIDE124);


                    root_1 = (CommonTree)adaptor.becomeRoot(DIVIDE124_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1195);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1200);
                    s2=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s2.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=new Divide();
                    	  list.add((s1!=null?s1.valueObjExpr:null));
                    	  list.add((s2!=null?s2.valueObjExpr:null));
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 12 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:431:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    N125=(CommonTree)match(input,N,FOLLOW_N_in_expr_add1207); 
                    N125_tree = (CommonTree)adaptor.dupNode(N125);


                    adaptor.addChild(root_0, N125_tree);



                    	  retval.valueObjExpr =new BigDecimal((N125!=null?N125.getText():null));
                    	

                    }
                    break;
                case 13 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:435:3: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NUMBER126=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expr_add1215); 
                    NUMBER126_tree = (CommonTree)adaptor.dupNode(NUMBER126);


                    adaptor.addChild(root_0, NUMBER126_tree);



                    	  retval.valueObjExpr =new BigDecimal((NUMBER126!=null?NUMBER126.getText():null));
                    	

                    }
                    break;
                case 14 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:439:3: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_literal_in_expr_add1222);
                    boolean_literal127=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal127.getTree());


                    }
                    break;
                case 15 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:440:3: 'NULL'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    string_literal128=(CommonTree)match(input,130,FOLLOW_130_in_expr_add1226); 
                    string_literal128_tree = (CommonTree)adaptor.dupNode(string_literal128);


                    adaptor.addChild(root_0, string_literal128_tree);



                    	  retval.valueObjExpr =null;
                    	

                    }
                    break;
                case 16 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:444:3: 'ROWNUM'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    string_literal129=(CommonTree)match(input,137,FOLLOW_137_in_expr_add1234); 
                    string_literal129_tree = (CommonTree)adaptor.dupNode(string_literal129);


                    adaptor.addChild(root_0, string_literal129_tree);


                    }
                    break;
                case 17 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:445:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal130=(CommonTree)match(input,99,FOLLOW_99_in_expr_add1238); 
                    char_literal130_tree = (CommonTree)adaptor.dupNode(char_literal130);


                    adaptor.addChild(root_0, char_literal130_tree);



                    	  BindVar val=new BindVar(where.selfAddAndGet());
                    	  retval.valueObjExpr =val;
                    	

                    }
                    break;
                case 18 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:449:3: ^( QUTED_STR quoted_string )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    QUTED_STR131=(CommonTree)match(input,QUTED_STR,FOLLOW_QUTED_STR_in_expr_add1244); 
                    QUTED_STR131_tree = (CommonTree)adaptor.dupNode(QUTED_STR131);


                    root_1 = (CommonTree)adaptor.becomeRoot(QUTED_STR131_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_quoted_string_in_expr_add1246);
                    quoted_string132=quoted_string();

                    state._fsp--;

                    adaptor.addChild(root_1, quoted_string132.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  retval.valueObjExpr =(quoted_string132!=null?quoted_string132.aText:null);
                    	

                    }
                    break;
                case 19 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:452:3: ^( COLUMN identifier ( table_name )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMN133=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_expr_add1253); 
                    COLUMN133_tree = (CommonTree)adaptor.dupNode(COLUMN133);


                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN133_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_expr_add1255);
                    identifier134=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier134.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:452:23: ( table_name )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ID) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:452:23: table_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_name_in_expr_add1257);
                            table_name135=table_name();

                            state._fsp--;

                            adaptor.addChild(root_1, table_name135.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Column col=new ColumnImpl((table_name135!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name135.start),input.getTreeAdaptor().getTokenStopIndex(table_name135.start))):null),(identifier134!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier134.start),input.getTreeAdaptor().getTokenStopIndex(identifier134.start))):null),null);
                    	  retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 20 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:457:3: ^( COLUMNAST ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMNAST136=(CommonTree)match(input,COLUMNAST,FOLLOW_COLUMNAST_in_expr_add1267); 
                    COLUMNAST136_tree = (CommonTree)adaptor.dupNode(COLUMNAST136);


                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMNAST136_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASTERISK137=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add1269); 
                    ASTERISK137_tree = (CommonTree)adaptor.dupNode(ASTERISK137);


                    adaptor.addChild(root_1, ASTERISK137_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Column col=new ColumnImpl(null,(ASTERISK137!=null?ASTERISK137.getText():null),null);
                    	  retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 21 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:466:3: ^( INTERVAL i_v= inner_value[$where] u= unit )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    INTERVAL138=(CommonTree)match(input,INTERVAL,FOLLOW_INTERVAL_in_expr_add1286); 
                    INTERVAL138_tree = (CommonTree)adaptor.dupNode(INTERVAL138);


                    root_1 = (CommonTree)adaptor.becomeRoot(INTERVAL138_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_inner_value_in_expr_add1290);
                    i_v=inner_value(where);

                    state._fsp--;

                    adaptor.addChild(root_1, i_v.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_unit_in_expr_add1295);
                    u=unit();

                    state._fsp--;

                    adaptor.addChild(root_1, u.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function intervalObj=new Interval();	
                    	  list.add((i_v!=null?i_v.valueObj:null));
                    	  list.add((u!=null?u.unitObj:null));
                    	  intervalObj.setValue(list);
                    	  retval.valueObjExpr =intervalObj;
                    	

                    }
                    break;
                case 22 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:474:3: ^( ID ( expr[$where] )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ID139=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1304); 
                    ID139_tree = (CommonTree)adaptor.dupNode(ID139);


                    root_1 = (CommonTree)adaptor.becomeRoot(ID139_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:474:8: ( expr[$where] )*
                        loop33:
                        do {
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==ASTERISK||(LA33_0 >= BITAND && LA33_0 <= COLUMNAST)||LA33_0==CONSIST||LA33_0==DIVIDE||LA33_0==ID||LA33_0==INTERVAL||(LA33_0 >= MINUS && LA33_0 <= N)||LA33_0==NEGATIVE||LA33_0==NUMBER||LA33_0==PLUS||LA33_0==POSITIVE||LA33_0==QUTED_STR||(LA33_0 >= SHIFTLEFT && LA33_0 <= SHIFTRIGHT)||LA33_0==SUBQUERY||LA33_0==99||LA33_0==107||LA33_0==130||LA33_0==137||LA33_0==141) ) {
                                alt33=1;
                            }


                            switch (alt33) {
                        	case 1 :
                        	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:474:9: expr[$where]
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_expr_add1307);
                        	    expr140=expr(where);

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr140.getTree());


                        	    list.add((expr140!=null?expr140.valueObj:null));

                        	    }
                        	    break;

                        	default :
                        	    break loop33;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=functionRegister.get(((ID139!=null?ID139.getText():null)).toUpperCase());
                    	  func.setValue(list);
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 23 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:480:3: ^( CONSIST ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONSIST141=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_expr_add1320); 
                    CONSIST141_tree = (CommonTree)adaptor.dupNode(CONSIST141);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST141_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID142=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1322); 
                    ID142_tree = (CommonTree)adaptor.dupNode(ID142);


                    adaptor.addChild(root_1, ID142_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=consistStringRegister.get(((ID142!=null?ID142.getText():null)).toUpperCase());
                    	  retval.valueObjExpr =func;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_add"


    public static class inner_value_return extends TreeRuleReturnScope {
        public Object valueObj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inner_value"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:526:1: inner_value[BindIndexHolder where] returns [Object valueObj] : ( '?' | N | MINUS N );
    public final MySQLWalker.inner_value_return inner_value(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.inner_value_return retval = new MySQLWalker.inner_value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree char_literal143=null;
        CommonTree N144=null;
        CommonTree MINUS145=null;
        CommonTree N146=null;

        CommonTree char_literal143_tree=null;
        CommonTree N144_tree=null;
        CommonTree MINUS145_tree=null;
        CommonTree N146_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:527:2: ( '?' | N | MINUS N )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt35=1;
                }
                break;
            case N:
                {
                alt35=2;
                }
                break;
            case MINUS:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }

            switch (alt35) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:527:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal143=(CommonTree)match(input,99,FOLLOW_99_in_inner_value1380); 
                    char_literal143_tree = (CommonTree)adaptor.dupNode(char_literal143);


                    adaptor.addChild(root_0, char_literal143_tree);



                    	  BindVar val=new BindVar(where.selfAddAndGet());
                    	  retval.valueObj =val;
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:531:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    N144=(CommonTree)match(input,N,FOLLOW_N_in_inner_value1385); 
                    N144_tree = (CommonTree)adaptor.dupNode(N144);


                    adaptor.addChild(root_0, N144_tree);



                    	  retval.valueObj =(N144!=null?N144.getText():null);
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:534:3: MINUS N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    MINUS145=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_inner_value1390); 
                    MINUS145_tree = (CommonTree)adaptor.dupNode(MINUS145);


                    adaptor.addChild(root_0, MINUS145_tree);


                    _last = (CommonTree)input.LT(1);
                    N146=(CommonTree)match(input,N,FOLLOW_N_in_inner_value1392); 
                    N146_tree = (CommonTree)adaptor.dupNode(N146);


                    adaptor.addChild(root_0, N146_tree);



                    	  StringBuilder sb=new StringBuilder();
                    	  sb.append((MINUS145!=null?MINUS145.getText():null));
                    	  sb.append((N146!=null?N146.getText():null));
                    	  retval.valueObj =sb;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inner_value"


    public static class unit_return extends TreeRuleReturnScope {
        public Object unitObj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unit"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:542:1: unit returns [Object unitObj] : ^( UNIT ID ) ;
    public final MySQLWalker.unit_return unit() throws RecognitionException {
        MySQLWalker.unit_return retval = new MySQLWalker.unit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UNIT147=null;
        CommonTree ID148=null;

        CommonTree UNIT147_tree=null;
        CommonTree ID148_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:543:9: ( ^( UNIT ID ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:543:10: ^( UNIT ID )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UNIT147=(CommonTree)match(input,UNIT,FOLLOW_UNIT_in_unit1417); 
            UNIT147_tree = (CommonTree)adaptor.dupNode(UNIT147);


            root_1 = (CommonTree)adaptor.becomeRoot(UNIT147_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            ID148=(CommonTree)match(input,ID,FOLLOW_ID_in_unit1419); 
            ID148_tree = (CommonTree)adaptor.dupNode(ID148);


            adaptor.addChild(root_1, ID148_tree);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



              	retval.unitObj =consistStringRegister.get(((ID148!=null?ID148.getText():null)).toUpperCase());
                    

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unit"


    public static class value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:549:1: value : ( N | NUMBER | '?' );
    public final MySQLWalker.value_return value() throws RecognitionException {
        MySQLWalker.value_return retval = new MySQLWalker.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set149=null;

        CommonTree set149_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:549:7: ( N | NUMBER | '?' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set149=(CommonTree)input.LT(1);

            if ( input.LA(1)==N||input.LA(1)==NUMBER||input.LA(1)==99 ) {
                input.consume();
                set149_tree = (CommonTree)adaptor.dupNode(set149);


                adaptor.addChild(root_0, set149_tree);

                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class boolean_literal_return extends TreeRuleReturnScope {
        public Object valueObj;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_literal"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:555:1: boolean_literal returns [Object valueObj] : (s1= 'TRUE' |s1= 'FALSE' );
    public final MySQLWalker.boolean_literal_return boolean_literal() throws RecognitionException {
        MySQLWalker.boolean_literal_return retval = new MySQLWalker.boolean_literal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s1=null;

        CommonTree s1_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:556:2: (s1= 'TRUE' |s1= 'FALSE' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==141) ) {
                alt36=1;
            }
            else if ( (LA36_0==107) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:556:3: s1= 'TRUE'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,141,FOLLOW_141_in_boolean_literal1466); 
                    s1_tree = (CommonTree)adaptor.dupNode(s1);


                    adaptor.addChild(root_0, s1_tree);


                    retval.valueObj =Boolean.parseBoolean((s1!=null?s1.getText():null));

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:557:4: s1= 'FALSE'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,107,FOLLOW_107_in_boolean_literal1475); 
                    s1_tree = (CommonTree)adaptor.dupNode(s1);


                    adaptor.addChild(root_0, s1_tree);


                    retval.valueObj =Boolean.parseBoolean((s1!=null?s1.getText():null));

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_literal"


    public static class select_list_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_list"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:560:1: select_list[Select select] : ^( SELECT_LIST dis_col[$select] ) ;
    public final MySQLWalker.select_list_return select_list(Select select) throws RecognitionException {
        MySQLWalker.select_list_return retval = new MySQLWalker.select_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_LIST150=null;
        MySQLWalker.dis_col_return dis_col151 =null;


        CommonTree SELECT_LIST150_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:561:2: ( ^( SELECT_LIST dis_col[$select] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:561:3: ^( SELECT_LIST dis_col[$select] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT_LIST150=(CommonTree)match(input,SELECT_LIST,FOLLOW_SELECT_LIST_in_select_list1489); 
            SELECT_LIST150_tree = (CommonTree)adaptor.dupNode(SELECT_LIST150);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_LIST150_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_dis_col_in_select_list1491);
            dis_col151=dis_col(select);

            state._fsp--;

            adaptor.addChild(root_1, dis_col151.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_list"


    public static class dis_col_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dis_col"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:564:1: dis_col[Select select] : ( ( displayed_column[$select] )+ | distinct_col[$select] );
    public final MySQLWalker.dis_col_return dis_col(Select select) throws RecognitionException {
        MySQLWalker.dis_col_return retval = new MySQLWalker.dis_col_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.displayed_column_return displayed_column152 =null;

        MySQLWalker.distinct_col_return distinct_col153 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:565:2: ( ( displayed_column[$select] )+ | distinct_col[$select] )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==COLUMN||LA38_0==CONSIST||LA38_0==ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==DISTINCT) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:565:3: ( displayed_column[$select] )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:565:3: ( displayed_column[$select] )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==COLUMN||LA37_0==CONSIST||LA37_0==ID) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:565:4: displayed_column[$select]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_displayed_column_in_dis_col1506);
                    	    displayed_column152=displayed_column(select);

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, displayed_column152.getTree());


                    	    select.addColumn((displayed_column152!=null?displayed_column152.column:null));

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:566:4: distinct_col[$select]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_distinct_col_in_dis_col1515);
                    distinct_col153=distinct_col(select);

                    state._fsp--;

                    adaptor.addChild(root_0, distinct_col153.getTree());



                              //duplicated for resultset compact
                    	  select.setDistinct((distinct_col153!=null?distinct_col153.dis:null));
                              //the real version to use
                    	  FunctionColumn funcolumn=new FunctionColumn();
                    	  funcolumn.setFunction((distinct_col153!=null?distinct_col153.dis:null));
                    	  select.addColumn(funcolumn);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dis_col"


    public static class fromClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:577:1: fromClause[Select select] : ^( TABLENAMES ( table[$select] )+ ) ;
    public final MySQLWalker.fromClause_return fromClause(Select select) throws RecognitionException {
        MySQLWalker.fromClause_return retval = new MySQLWalker.fromClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES154=null;
        MySQLWalker.table_return table155 =null;


        CommonTree TABLENAMES154_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:578:2: ( ^( TABLENAMES ( table[$select] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:578:3: ^( TABLENAMES ( table[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLENAMES154=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_fromClause1533); 
            TABLENAMES154_tree = (CommonTree)adaptor.dupNode(TABLENAMES154);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES154_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:578:16: ( table[$select] )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==TABLENAME) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:578:16: table[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_fromClause1535);
            	    table155=table(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table155.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fromClause"


    public static class join_clause_return extends TreeRuleReturnScope {
        public JoinClause joinClause;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_clause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:581:1: join_clause[DMLCommon common] returns [JoinClause joinClause] : ^( JOIN table_name ( alias )? temp1= join_column temp2= join_column ( join_type )? ) ;
    public final MySQLWalker.join_clause_return join_clause(DMLCommon common) throws RecognitionException {
        MySQLWalker.join_clause_return retval = new MySQLWalker.join_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree JOIN156=null;
        MySQLWalker.join_column_return temp1 =null;

        MySQLWalker.join_column_return temp2 =null;

        MySQLWalker.table_name_return table_name157 =null;

        MySQLWalker.alias_return alias158 =null;

        MySQLWalker.join_type_return join_type159 =null;


        CommonTree JOIN156_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:582:9: ( ^( JOIN table_name ( alias )? temp1= join_column temp2= join_column ( join_type )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:582:10: ^( JOIN table_name ( alias )? temp1= join_column temp2= join_column ( join_type )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            JOIN156=(CommonTree)match(input,JOIN,FOLLOW_JOIN_in_join_clause1562); 
            JOIN156_tree = (CommonTree)adaptor.dupNode(JOIN156);


            root_1 = (CommonTree)adaptor.becomeRoot(JOIN156_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_name_in_join_clause1564);
            table_name157=table_name();

            state._fsp--;

            adaptor.addChild(root_1, table_name157.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:582:28: ( alias )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==AS) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:582:28: alias
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_alias_in_join_clause1566);
                    alias158=alias();

                    state._fsp--;

                    adaptor.addChild(root_1, alias158.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_join_column_in_join_clause1571);
            temp1=join_column();

            state._fsp--;

            adaptor.addChild(root_1, temp1.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_join_column_in_join_clause1575);
            temp2=join_column();

            state._fsp--;

            adaptor.addChild(root_1, temp2.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:582:71: ( join_type )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==CROSS||LA41_0==FULL||LA41_0==INNER||LA41_0==LEFT||LA41_0==RIGHT||LA41_0==UNION) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:582:71: join_type
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_join_type_in_join_clause1577);
                    join_type159=join_type();

                    state._fsp--;

                    adaptor.addChild(root_1, join_type159.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



                      retval.joinClause = new JoinClause();
                      TableNameImpl tableName = new TableNameImpl();
                      tableName.setTablename((table_name157!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name157.start),input.getTreeAdaptor().getTokenStopIndex(table_name157.start))):null));
                      tableName.setAlias((alias158!=null?alias158.aliText:null));
                      retval.joinClause.setTableName(tableName);
                      retval.joinClause.setLeftCondition((temp1!=null?temp1.col:null));
                      retval.joinClause.setRightCondition((temp2!=null?temp2.col:null));
                      retval.joinClause.setJoinType((join_type159!=null?join_type159.joinType:null));
                    

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_clause"


    public static class join_column_return extends TreeRuleReturnScope {
        public Column col;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_column"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:595:1: join_column returns [Column col] : ^( COLUMN identifier ( table_name )? ) ;
    public final MySQLWalker.join_column_return join_column() throws RecognitionException {
        MySQLWalker.join_column_return retval = new MySQLWalker.join_column_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN160=null;
        MySQLWalker.identifier_return identifier161 =null;

        MySQLWalker.table_name_return table_name162 =null;


        CommonTree COLUMN160_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:596:9: ( ^( COLUMN identifier ( table_name )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:596:10: ^( COLUMN identifier ( table_name )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMN160=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_join_column1620); 
            COLUMN160_tree = (CommonTree)adaptor.dupNode(COLUMN160);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN160_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_join_column1622);
            identifier161=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier161.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:596:30: ( table_name )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:596:30: table_name
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_join_column1624);
                    table_name162=table_name();

                    state._fsp--;

                    adaptor.addChild(root_1, table_name162.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



                       retval.col =new ColumnImpl((table_name162!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name162.start),input.getTreeAdaptor().getTokenStopIndex(table_name162.start))):null),(identifier161!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier161.start),input.getTreeAdaptor().getTokenStopIndex(identifier161.start))):null),null);
                       
                    

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_column"


    public static class join_type_return extends TreeRuleReturnScope {
        public JoinType joinType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_type"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:603:1: join_type returns [JoinType joinType] : ( INNER | LEFT ( outer )? | RIGHT ( outer )? | FULL ( outer )? | UNION | CROSS );
    public final MySQLWalker.join_type_return join_type() throws RecognitionException {
        MySQLWalker.join_type_return retval = new MySQLWalker.join_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INNER163=null;
        CommonTree LEFT164=null;
        CommonTree RIGHT166=null;
        CommonTree FULL168=null;
        CommonTree UNION170=null;
        CommonTree CROSS171=null;
        MySQLWalker.outer_return outer165 =null;

        MySQLWalker.outer_return outer167 =null;

        MySQLWalker.outer_return outer169 =null;


        CommonTree INNER163_tree=null;
        CommonTree LEFT164_tree=null;
        CommonTree RIGHT166_tree=null;
        CommonTree FULL168_tree=null;
        CommonTree UNION170_tree=null;
        CommonTree CROSS171_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:604:2: ( INNER | LEFT ( outer )? | RIGHT ( outer )? | FULL ( outer )? | UNION | CROSS )
            int alt46=6;
            switch ( input.LA(1) ) {
            case INNER:
                {
                alt46=1;
                }
                break;
            case LEFT:
                {
                alt46=2;
                }
                break;
            case RIGHT:
                {
                alt46=3;
                }
                break;
            case FULL:
                {
                alt46=4;
                }
                break;
            case UNION:
                {
                alt46=5;
                }
                break;
            case CROSS:
                {
                alt46=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }

            switch (alt46) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:604:3: INNER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INNER163=(CommonTree)match(input,INNER,FOLLOW_INNER_in_join_type1665); 
                    INNER163_tree = (CommonTree)adaptor.dupNode(INNER163);


                    adaptor.addChild(root_0, INNER163_tree);



                    		retval.joinType = JoinType.INNER;
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:608:3: LEFT ( outer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LEFT164=(CommonTree)match(input,LEFT,FOLLOW_LEFT_in_join_type1673); 
                    LEFT164_tree = (CommonTree)adaptor.dupNode(LEFT164);


                    adaptor.addChild(root_0, LEFT164_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:608:8: ( outer )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==OUTER) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:608:8: outer
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_outer_in_join_type1675);
                            outer165=outer();

                            state._fsp--;

                            adaptor.addChild(root_0, outer165.getTree());


                            }
                            break;

                    }



                    		boolean outter = (outer165!=null?outer165.outter:false);
                    		if(outter){
                    			retval.joinType = JoinType.LEFT_OUTER;
                    		}else{
                    			retval.joinType = JoinType.LEFT;
                    		}
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:617:3: RIGHT ( outer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    RIGHT166=(CommonTree)match(input,RIGHT,FOLLOW_RIGHT_in_join_type1683); 
                    RIGHT166_tree = (CommonTree)adaptor.dupNode(RIGHT166);


                    adaptor.addChild(root_0, RIGHT166_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:617:9: ( outer )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==OUTER) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:617:9: outer
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_outer_in_join_type1685);
                            outer167=outer();

                            state._fsp--;

                            adaptor.addChild(root_0, outer167.getTree());


                            }
                            break;

                    }



                    		boolean outter = (outer167!=null?outer167.outter:false);
                    		if(outter){
                    			retval.joinType = JoinType.RIGHT_OUTER;
                    		}else{
                    			retval.joinType = JoinType.RIGHT;
                    		}
                    	

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:626:3: FULL ( outer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FULL168=(CommonTree)match(input,FULL,FOLLOW_FULL_in_join_type1693); 
                    FULL168_tree = (CommonTree)adaptor.dupNode(FULL168);


                    adaptor.addChild(root_0, FULL168_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:626:8: ( outer )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==OUTER) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:626:8: outer
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_outer_in_join_type1695);
                            outer169=outer();

                            state._fsp--;

                            adaptor.addChild(root_0, outer169.getTree());


                            }
                            break;

                    }



                    		boolean outter = (outer169!=null?outer169.outter:false);
                    		if(outter){
                    			retval.joinType = JoinType.FULL_OUTER;
                    		}else{
                    			retval.joinType = JoinType.FULL;
                    		}
                    	

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:635:3: UNION
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    UNION170=(CommonTree)match(input,UNION,FOLLOW_UNION_in_join_type1704); 
                    UNION170_tree = (CommonTree)adaptor.dupNode(UNION170);


                    adaptor.addChild(root_0, UNION170_tree);



                    		retval.joinType = JoinType.UNION;
                    	

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:639:3: CROSS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CROSS171=(CommonTree)match(input,CROSS,FOLLOW_CROSS_in_join_type1712); 
                    CROSS171_tree = (CommonTree)adaptor.dupNode(CROSS171);


                    adaptor.addChild(root_0, CROSS171_tree);



                    		retval.joinType = JoinType.CROSS;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_type"


    public static class outer_return extends TreeRuleReturnScope {
        public boolean outter;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outer"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:645:1: outer returns [boolean outter] : OUTER ;
    public final MySQLWalker.outer_return outer() throws RecognitionException {
        MySQLWalker.outer_return retval = new MySQLWalker.outer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OUTER172=null;

        CommonTree OUTER172_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:646:2: ( OUTER )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:646:3: OUTER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            OUTER172=(CommonTree)match(input,OUTER,FOLLOW_OUTER_in_outer1731); 
            OUTER172_tree = (CommonTree)adaptor.dupNode(OUTER172);


            adaptor.addChild(root_0, OUTER172_tree);



            		retval.outter = true;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outer"


    public static class table_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:652:1: table[DMLCommon common] : ^( TABLENAME table_spec[$common] ( join_clause[$common] )? ) ;
    public final MySQLWalker.table_return table(DMLCommon common) throws RecognitionException {
        MySQLWalker.table_return retval = new MySQLWalker.table_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAME173=null;
        MySQLWalker.table_spec_return table_spec174 =null;

        MySQLWalker.join_clause_return join_clause175 =null;


        CommonTree TABLENAME173_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:653:2: ( ^( TABLENAME table_spec[$common] ( join_clause[$common] )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:653:3: ^( TABLENAME table_spec[$common] ( join_clause[$common] )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLENAME173=(CommonTree)match(input,TABLENAME,FOLLOW_TABLENAME_in_table1746); 
            TABLENAME173_tree = (CommonTree)adaptor.dupNode(TABLENAME173);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAME173_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_spec_in_table1748);
            table_spec174=table_spec(common);

            state._fsp--;

            adaptor.addChild(root_1, table_spec174.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:653:35: ( join_clause[$common] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==JOIN) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:653:35: join_clause[$common]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_join_clause_in_table1751);
                    join_clause175=join_clause(common);

                    state._fsp--;

                    adaptor.addChild(root_1, join_clause175.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		TableName tableName = (table_spec174!=null?table_spec174.tableName:null);
            		tableName.setJoinClause((join_clause175!=null?join_clause175.joinClause:null));
            		common.addTable(tableName);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table"


    public static class tables_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tables"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:661:1: tables[DMLCommon common] : ^( TABLENAMES ( table[$common] )+ ) ;
    public final MySQLWalker.tables_return tables(DMLCommon common) throws RecognitionException {
        MySQLWalker.tables_return retval = new MySQLWalker.tables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES176=null;
        MySQLWalker.table_return table177 =null;


        CommonTree TABLENAMES176_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:662:2: ( ^( TABLENAMES ( table[$common] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:662:3: ^( TABLENAMES ( table[$common] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLENAMES176=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_tables1770); 
            TABLENAMES176_tree = (CommonTree)adaptor.dupNode(TABLENAMES176);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES176_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:662:16: ( table[$common] )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==TABLENAME) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:662:16: table[$common]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_tables1772);
            	    table177=table(common);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table177.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tables"


    public static class table_spec_return extends TreeRuleReturnScope {
        public TableName tableName;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_spec"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:665:1: table_spec[DMLCommon common] returns [TableName tableName] : ( ( schema_name )? table_name ( alias )? | subquery[$common.getIndexHolder()] ( alias )? );
    public final MySQLWalker.table_spec_return table_spec(DMLCommon common) throws RecognitionException {
        MySQLWalker.table_spec_return retval = new MySQLWalker.table_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.schema_name_return schema_name178 =null;

        MySQLWalker.table_name_return table_name179 =null;

        MySQLWalker.alias_return alias180 =null;

        MySQLWalker.subquery_return subquery181 =null;

        MySQLWalker.alias_return alias182 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:666:2: ( ( schema_name )? table_name ( alias )? | subquery[$common.getIndexHolder()] ( alias )? )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ID) ) {
                alt52=1;
            }
            else if ( (LA52_0==SUBQUERY) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }
            switch (alt52) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:666:3: ( schema_name )? table_name ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:666:3: ( schema_name )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==ID) ) {
                        int LA49_1 = input.LA(2);

                        if ( (LA49_1==ID) ) {
                            alt49=1;
                        }
                    }
                    switch (alt49) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:666:5: schema_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_schema_name_in_table_spec1793);
                            schema_name178=schema_name();

                            state._fsp--;

                            adaptor.addChild(root_0, schema_name178.getTree());


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_table_spec1797);
                    table_name179=table_name();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name179.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:666:31: ( alias )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==AS) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:666:31: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1800);
                            alias180=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias180.getTree());


                            }
                            break;

                    }



                    		retval.tableName = getTableNameAndSchemaName((table_name179!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name179.start),input.getTreeAdaptor().getTokenStopIndex(table_name179.start))):null),(schema_name178!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(schema_name178.start),input.getTreeAdaptor().getTokenStopIndex(schema_name178.start))):null),(alias180!=null?alias180.aliText:null), false);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:670:3: subquery[$common.getIndexHolder()] ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_table_spec1808);
                    subquery181=subquery(common.getIndexHolder());

                    state._fsp--;

                    adaptor.addChild(root_0, subquery181.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:670:38: ( alias )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==AS) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:670:38: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1811);
                            alias182=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias182.getTree());


                            }
                            break;

                    }



                    		retval.tableName = getTableSubQuery((subquery181!=null?subquery181.subselect:null),(alias182!=null?alias182.aliText:null), false);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_spec"


    public static class schema_name_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_name"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:676:1: schema_name : identifier ;
    public final MySQLWalker.schema_name_return schema_name() throws RecognitionException {
        MySQLWalker.schema_name_return retval = new MySQLWalker.schema_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.identifier_return identifier183 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:677:2: ( identifier )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:677:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_schema_name1826);
            identifier183=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier183.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema_name"


    public static class subquery_return extends TreeRuleReturnScope {
        public Select subselect;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subquery"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:680:1: subquery[BindIndexHolder where] returns [Select subselect] : ^( SUBQUERY select_command[$where] ) ;
    public final MySQLWalker.subquery_return subquery(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.subquery_return retval = new MySQLWalker.subquery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBQUERY184=null;
        MySQLWalker.select_command_return select_command185 =null;


        CommonTree SUBQUERY184_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:680:59: ( ^( SUBQUERY select_command[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:681:2: ^( SUBQUERY select_command[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SUBQUERY184=(CommonTree)match(input,SUBQUERY,FOLLOW_SUBQUERY_in_subquery1843); 
            SUBQUERY184_tree = (CommonTree)adaptor.dupNode(SUBQUERY184);


            root_1 = (CommonTree)adaptor.becomeRoot(SUBQUERY184_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_command_in_subquery1845);
            select_command185=select_command(where);

            state._fsp--;

            adaptor.addChild(root_1, select_command185.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	retval.subselect =(select_command185!=null?select_command185.select:null);
            	retval.subselect.setSubSelect(true);
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subquery"


    public static class table_name_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_name"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:688:1: table_name : identifier ;
    public final MySQLWalker.table_name_return table_name() throws RecognitionException {
        MySQLWalker.table_name_return retval = new MySQLWalker.table_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.identifier_return identifier186 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:689:2: ( identifier )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:689:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_name1862);
            identifier186=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier186.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_name"


    public static class distinct_col_return extends TreeRuleReturnScope {
        public Distinct dis;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "distinct_col"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:692:1: distinct_col[Select select] returns [Distinct dis] : ^( DISTINCT ( displayed_column[$select] )+ ) ;
    public final MySQLWalker.distinct_col_return distinct_col(Select select) throws RecognitionException {
        MySQLWalker.distinct_col_return retval = new MySQLWalker.distinct_col_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DISTINCT187=null;
        MySQLWalker.displayed_column_return displayed_column188 =null;


        CommonTree DISTINCT187_tree=null;


        Distinct dis=new Distinct();

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:696:2: ( ^( DISTINCT ( displayed_column[$select] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:697:2: ^( DISTINCT ( displayed_column[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DISTINCT187=(CommonTree)match(input,DISTINCT,FOLLOW_DISTINCT_in_distinct_col1885); 
            DISTINCT187_tree = (CommonTree)adaptor.dupNode(DISTINCT187);


            root_1 = (CommonTree)adaptor.becomeRoot(DISTINCT187_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:698:2: ( displayed_column[$select] )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COLUMN||LA53_0==CONSIST||LA53_0==ID) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:698:3: displayed_column[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_displayed_column_in_distinct_col1890);
            	    displayed_column188=displayed_column(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, displayed_column188.getTree());


            	    dis.addColumn((displayed_column188!=null?displayed_column188.column:null));

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	  retval.dis =dis;
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "distinct_col"


    public static class displayed_column_return extends TreeRuleReturnScope {
        public Column column;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "displayed_column"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:703:1: displayed_column[Select select] returns [Column column] : ( ^( ID ( expr[$select.getIndexHolder()] )* ( alias )? ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) );
    public final MySQLWalker.displayed_column_return displayed_column(Select select) throws RecognitionException {
        MySQLWalker.displayed_column_return retval = new MySQLWalker.displayed_column_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID189=null;
        CommonTree CONSIST192=null;
        CommonTree ID193=null;
        CommonTree COLUMN195=null;
        MySQLWalker.expr_return expr190 =null;

        MySQLWalker.alias_return alias191 =null;

        MySQLWalker.alias_return alias194 =null;

        MySQLWalker.table_alias_return table_alias196 =null;

        MySQLWalker.columnAnt_return columnAnt197 =null;

        MySQLWalker.alias_return alias198 =null;


        CommonTree ID189_tree=null;
        CommonTree CONSIST192_tree=null;
        CommonTree ID193_tree=null;
        CommonTree COLUMN195_tree=null;


        List<Object> list=new ArrayList<Object>();

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:707:2: ( ^( ID ( expr[$select.getIndexHolder()] )* ( alias )? ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt59=1;
                }
                break;
            case CONSIST:
                {
                alt59=2;
                }
                break;
            case COLUMN:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:708:2: ^( ID ( expr[$select.getIndexHolder()] )* ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ID189=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1920); 
                    ID189_tree = (CommonTree)adaptor.dupNode(ID189);


                    root_1 = (CommonTree)adaptor.becomeRoot(ID189_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:708:6: ( expr[$select.getIndexHolder()] )*
                        loop54:
                        do {
                            int alt54=2;
                            int LA54_0 = input.LA(1);

                            if ( (LA54_0==ASTERISK||(LA54_0 >= BITAND && LA54_0 <= COLUMNAST)||LA54_0==CONSIST||LA54_0==DIVIDE||LA54_0==ID||LA54_0==INTERVAL||(LA54_0 >= MINUS && LA54_0 <= N)||LA54_0==NEGATIVE||LA54_0==NUMBER||LA54_0==PLUS||LA54_0==POSITIVE||LA54_0==QUTED_STR||(LA54_0 >= SHIFTLEFT && LA54_0 <= SHIFTRIGHT)||LA54_0==SUBQUERY||LA54_0==99||LA54_0==107||LA54_0==130||LA54_0==137||LA54_0==141) ) {
                                alt54=1;
                            }


                            switch (alt54) {
                        	case 1 :
                        	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:708:7: expr[$select.getIndexHolder()]
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_displayed_column1922);
                        	    expr190=expr(select.getIndexHolder());

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr190.getTree());


                        	    list.add((expr190!=null?expr190.valueObj:null));

                        	    }
                        	    break;

                        	default :
                        	    break loop54;
                            }
                        } while (true);


                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:708:67: ( alias )?
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==AS) ) {
                            alt55=1;
                        }
                        switch (alt55) {
                            case 1 :
                                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:708:67: alias
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_alias_in_displayed_column1928);
                                alias191=alias();

                                state._fsp--;

                                adaptor.addChild(root_1, alias191.getTree());


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=functionRegister.get(((ID189!=null?ID189.getText():null)).toUpperCase());
                    	  func.setValue(list);
                    	  FunctionColumn funcolumn=new FunctionColumn();
                    	  funcolumn.setFunction(func);
                    	  funcolumn.setAlias((alias191!=null?alias191.aliText:null));
                    	  //select.addColumn(funcolumn);
                    	  retval.column =funcolumn;
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:718:3: ^( CONSIST ID ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONSIST192=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_displayed_column1939); 
                    CONSIST192_tree = (CommonTree)adaptor.dupNode(CONSIST192);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST192_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID193=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1941); 
                    ID193_tree = (CommonTree)adaptor.dupNode(ID193);


                    adaptor.addChild(root_1, ID193_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:718:16: ( alias )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==AS) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:718:16: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1943);
                            alias194=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias194.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Function func=consistStringRegister.get(((ID193!=null?ID193.getText():null)).toUpperCase());
                    	  FunctionColumn funcolumn=new FunctionColumn();
                    	  funcolumn.setFunction(func);
                    	  funcolumn.setAlias((alias194!=null?alias194.aliText:null));
                    	  //select.addColumn(funcolumn);
                    	  retval.column =funcolumn;
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:726:3: ^( COLUMN ( table_alias )? columnAnt ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMN195=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_displayed_column1951); 
                    COLUMN195_tree = (CommonTree)adaptor.dupNode(COLUMN195);


                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN195_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:726:12: ( table_alias )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==COL_TAB) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:726:12: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_displayed_column1953);
                            table_alias196=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias196.getTree());


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_columnAnt_in_displayed_column1956);
                    columnAnt197=columnAnt();

                    state._fsp--;

                    adaptor.addChild(root_1, columnAnt197.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:726:35: ( alias )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==AS) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:726:35: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1958);
                            alias198=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias198.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	  Column columnImp=new ColumnImpl((table_alias196!=null?table_alias196.aText:null),(columnAnt197!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(columnAnt197.start),input.getTreeAdaptor().getTokenStopIndex(columnAnt197.start))):null),(alias198!=null?alias198.aliText:null));
                    	  //select.addColumn(column)
                    	  retval.column =columnImp;
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "displayed_column"


    public static class columnAnt_return extends TreeRuleReturnScope {
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnAnt"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:754:1: columnAnt returns [String aText] : ( ASTERISK | N | identifier );
    public final MySQLWalker.columnAnt_return columnAnt() throws RecognitionException {
        MySQLWalker.columnAnt_return retval = new MySQLWalker.columnAnt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASTERISK199=null;
        CommonTree N200=null;
        MySQLWalker.identifier_return identifier201 =null;


        CommonTree ASTERISK199_tree=null;
        CommonTree N200_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:755:2: ( ASTERISK | N | identifier )
            int alt60=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt60=1;
                }
                break;
            case N:
                {
                alt60=2;
                }
                break;
            case ID:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;

            }

            switch (alt60) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:755:3: ASTERISK
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ASTERISK199=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_columnAnt2008); 
                    ASTERISK199_tree = (CommonTree)adaptor.dupNode(ASTERISK199);


                    adaptor.addChild(root_0, ASTERISK199_tree);


                    retval.aText =(ASTERISK199!=null?ASTERISK199.getText():null);

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:756:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    N200=(CommonTree)match(input,N,FOLLOW_N_in_columnAnt2014); 
                    N200_tree = (CommonTree)adaptor.dupNode(N200);


                    adaptor.addChild(root_0, N200_tree);


                    retval.aText =(N200!=null?N200.getText():null);

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:757:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnAnt2020);
                    identifier201=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier201.getTree());


                    retval.aText =(identifier201!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier201.start),input.getTreeAdaptor().getTokenStopIndex(identifier201.start))):null);

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnAnt"


    public static class quoted_string_return extends TreeRuleReturnScope {
        public Object aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quoted_string"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:760:1: quoted_string returns [Object aText] : QUOTED_STRING ;
    public final MySQLWalker.quoted_string_return quoted_string() throws RecognitionException {
        MySQLWalker.quoted_string_return retval = new MySQLWalker.quoted_string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUOTED_STRING202=null;

        CommonTree QUOTED_STRING202_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:761:2: ( QUOTED_STRING )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:761:4: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            QUOTED_STRING202=(CommonTree)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_quoted_string2036); 
            QUOTED_STRING202_tree = (CommonTree)adaptor.dupNode(QUOTED_STRING202);


            adaptor.addChild(root_0, QUOTED_STRING202_tree);



                        String temp=(QUOTED_STRING202!=null?QUOTED_STRING202.getText():null);
                        AntlrStringStream st = new AntlrStringStream(
                        		temp);
                        MySQLDateWalker.quoted_string_return ret = null;
            			MySQLDateParserLexer pl = new MySQLDateParserLexer(
            					st);
            			TokenRewriteStream tokens = new TokenRewriteStream(
            					pl);
            			MySQLDateParserParser pa = new MySQLDateParserParser(
            					tokens);

            			MySQLDateParserParser.quoted_string_return beg = null;
            			beg = pa.quoted_string();
            			CommonTree tree = (CommonTree) beg
            					.getTree();
            			CommonTreeNodeStream nodes = new CommonTreeNodeStream(
            					tree);
            			nodes.setTokenStream(tokens);
            			MySQLDateWalker walker = new MySQLDateWalker(nodes);
            			ret = walker.quoted_string();
            			Object tempObj =ret.aText;
            			if(tempObj!=null){
            				 retval.aText=tempObj;
            			}else{
            				 retval.aText=temp.substring(1,temp.length() - 1);;
            			}
            	

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quoted_string"


    public static class identifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:791:1: identifier : ID ;
    public final MySQLWalker.identifier_return identifier() throws RecognitionException {
        MySQLWalker.identifier_return retval = new MySQLWalker.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID203=null;

        CommonTree ID203_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:792:2: ( ID )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:792:3: ID
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            ID203=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier2048); 
            ID203_tree = (CommonTree)adaptor.dupNode(ID203);


            adaptor.addChild(root_0, ID203_tree);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class table_alias_return extends TreeRuleReturnScope {
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_alias"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:795:1: table_alias returns [String aText] : ^( COL_TAB identifier ) ;
    public final MySQLWalker.table_alias_return table_alias() throws RecognitionException {
        MySQLWalker.table_alias_return retval = new MySQLWalker.table_alias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COL_TAB204=null;
        MySQLWalker.identifier_return identifier205 =null;


        CommonTree COL_TAB204_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:796:2: ( ^( COL_TAB identifier ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:796:3: ^( COL_TAB identifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COL_TAB204=(CommonTree)match(input,COL_TAB,FOLLOW_COL_TAB_in_table_alias2070); 
            COL_TAB204_tree = (CommonTree)adaptor.dupNode(COL_TAB204);


            root_1 = (CommonTree)adaptor.becomeRoot(COL_TAB204_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_alias2072);
            identifier205=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier205.getTree());


            retval.aText =(identifier205!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier205.start),input.getTreeAdaptor().getTokenStopIndex(identifier205.start))):null);

            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_alias"


    public static class alias_return extends TreeRuleReturnScope {
        public String aliText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alias"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:799:1: alias returns [String aliText] : ^( AS identifier ) ;
    public final MySQLWalker.alias_return alias() throws RecognitionException {
        MySQLWalker.alias_return retval = new MySQLWalker.alias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AS206=null;
        MySQLWalker.identifier_return identifier207 =null;


        CommonTree AS206_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:800:2: ( ^( AS identifier ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:800:3: ^( AS identifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AS206=(CommonTree)match(input,AS,FOLLOW_AS_in_alias2091); 
            AS206_tree = (CommonTree)adaptor.dupNode(AS206);


            root_1 = (CommonTree)adaptor.becomeRoot(AS206_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_alias2093);
            identifier207=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier207.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            retval.aliText =(identifier207!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier207.start),input.getTreeAdaptor().getTokenStopIndex(identifier207.start))):null);

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alias"


    public static class select_command_return extends TreeRuleReturnScope {
        public Select select;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:807:1: select_command[BindIndexHolder where] returns [Select select] : selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( havingClause[$select.getHaving()] )? ( orderByClause[$select.getWhere()] )? ( limitClause[(MyWhereCondition)$select.getWhere()] )? ( for_update[$select] )? ;
    public final MySQLWalker.select_command_return select_command(BindIndexHolder where) throws RecognitionException {
        MySQLWalker.select_command_return retval = new MySQLWalker.select_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        MySQLWalker.selectClause_return selectClause208 =null;

        MySQLWalker.fromClause_return fromClause209 =null;

        MySQLWalker.whereClause_return whereClause210 =null;

        MySQLWalker.groupByClause_return groupByClause211 =null;

        MySQLWalker.havingClause_return havingClause212 =null;

        MySQLWalker.orderByClause_return orderByClause213 =null;

        MySQLWalker.limitClause_return limitClause214 =null;

        MySQLWalker.for_update_return for_update215 =null;




        	  if(null==where){
        	   retval.select =new MySelect();
        	  }else{
        	   retval.select = new MySelect(where);
        	  }
        	 
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:6: ( selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( havingClause[$select.getHaving()] )? ( orderByClause[$select.getWhere()] )? ( limitClause[(MyWhereCondition)$select.getWhere()] )? ( for_update[$select] )? )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:8: selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( havingClause[$select.getHaving()] )? ( orderByClause[$select.getWhere()] )? ( limitClause[(MyWhereCondition)$select.getWhere()] )? ( for_update[$select] )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_select_command2123);
            selectClause208=selectClause(retval.select);

            state._fsp--;

            adaptor.addChild(root_0, selectClause208.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:30: ( fromClause[$select] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==TABLENAMES) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:31: fromClause[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fromClause_in_select_command2127);
                    fromClause209=fromClause(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, fromClause209.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:54: ( whereClause[$select.getWhere()] )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==WHERE) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:55: whereClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_select_command2134);
                    whereClause210=whereClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, whereClause210.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:89: ( groupByClause[$select.getWhere()] )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==GROUPBY) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:90: groupByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupByClause_in_select_command2140);
                    groupByClause211=groupByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, groupByClause211.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:126: ( havingClause[$select.getHaving()] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==HAVING) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:127: havingClause[$select.getHaving()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_havingClause_in_select_command2146);
                    havingClause212=havingClause(retval.select.getHaving());

                    state._fsp--;

                    adaptor.addChild(root_0, havingClause212.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:163: ( orderByClause[$select.getWhere()] )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ORDERBY) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:164: orderByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_select_command2152);
                    orderByClause213=orderByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, orderByClause213.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:201: ( limitClause[(MyWhereCondition)$select.getWhere()] )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==125) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:202: limitClause[(MyWhereCondition)$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_select_command2159);
                    limitClause214=limitClause((MyWhereCondition)retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, limitClause214.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:254: ( for_update[$select] )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==FORUPDATE||LA67_0==SHAREMODE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:815:254: for_update[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_for_update_in_select_command2164);
                    for_update215=for_update(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, for_update215.getTree());


                    }
                    break;

            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_command"


    public static class delete_command_return extends TreeRuleReturnScope {
        public Delete del;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:817:1: delete_command returns [Delete del] : ^( DELETE tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ( limitClause[(MyWhereCondition)$del.getWhere()] )? ) ;
    public final MySQLWalker.delete_command_return delete_command() throws RecognitionException {
        MySQLWalker.delete_command_return retval = new MySQLWalker.delete_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE216=null;
        MySQLWalker.tables_return tables217 =null;

        MySQLWalker.whereClause_return whereClause218 =null;

        MySQLWalker.orderByClause_return orderByClause219 =null;

        MySQLWalker.limitClause_return limitClause220 =null;


        CommonTree DELETE216_tree=null;

        retval.del =new Delete();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:2: ( ^( DELETE tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ( limitClause[(MyWhereCondition)$del.getWhere()] )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:3: ^( DELETE tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ( limitClause[(MyWhereCondition)$del.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DELETE216=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_delete_command2187); 
            DELETE216_tree = (CommonTree)adaptor.dupNode(DELETE216);


            root_1 = (CommonTree)adaptor.becomeRoot(DELETE216_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_delete_command2189);
            tables217=tables(retval.del);

            state._fsp--;

            adaptor.addChild(root_1, tables217.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:25: ( whereClause[$del.getWhere()] )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==WHERE) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:25: whereClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_delete_command2192);
                    whereClause218=whereClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause218.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:55: ( orderByClause[$del.getWhere()] )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==ORDERBY) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:55: orderByClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_delete_command2196);
                    orderByClause219=orderByClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, orderByClause219.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:88: ( limitClause[(MyWhereCondition)$del.getWhere()] )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==125) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:819:89: limitClause[(MyWhereCondition)$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_delete_command2202);
                    limitClause220=limitClause((MyWhereCondition)retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, limitClause220.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_command"


    public static class update_command_return extends TreeRuleReturnScope {
        public Update update;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:821:1: update_command returns [Update update] : ^( UPDATE tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ( orderByClause[$update.getWhere()] )? ( limitClause[(MyWhereCondition)$update.getWhere()] )? ) ;
    public final MySQLWalker.update_command_return update_command() throws RecognitionException {
        MySQLWalker.update_command_return retval = new MySQLWalker.update_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE221=null;
        MySQLWalker.tables_return tables222 =null;

        MySQLWalker.setclause_return setclause223 =null;

        MySQLWalker.whereClause_return whereClause224 =null;

        MySQLWalker.orderByClause_return orderByClause225 =null;

        MySQLWalker.limitClause_return limitClause226 =null;


        CommonTree UPDATE221_tree=null;

        retval.update =new Update();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:2: ( ^( UPDATE tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ( orderByClause[$update.getWhere()] )? ( limitClause[(MyWhereCondition)$update.getWhere()] )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:3: ^( UPDATE tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ( orderByClause[$update.getWhere()] )? ( limitClause[(MyWhereCondition)$update.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UPDATE221=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_update_command2224); 
            UPDATE221_tree = (CommonTree)adaptor.dupNode(UPDATE221);


            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE221_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_update_command2226);
            tables222=tables(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, tables222.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_setclause_in_update_command2229);
            setclause223=setclause(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, setclause223.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:47: ( whereClause[$update.getWhere()] )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==WHERE) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:47: whereClause[$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_update_command2232);
                    whereClause224=whereClause(retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause224.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:80: ( orderByClause[$update.getWhere()] )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ORDERBY) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:80: orderByClause[$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_update_command2236);
                    orderByClause225=orderByClause(retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, orderByClause225.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:116: ( limitClause[(MyWhereCondition)$update.getWhere()] )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==125) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:823:117: limitClause[(MyWhereCondition)$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_limitClause_in_update_command2242);
                    limitClause226=limitClause((MyWhereCondition)retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, limitClause226.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_command"


    public static class limitClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limitClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:826:1: limitClause[MyWhereCondition where] : ^( 'LIMIT' ( skip[$where] )? range[$where] ) ;
    public final MySQLWalker.limitClause_return limitClause(MyWhereCondition where) throws RecognitionException {
        MySQLWalker.limitClause_return retval = new MySQLWalker.limitClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal227=null;
        MySQLWalker.skip_return skip228 =null;

        MySQLWalker.range_return range229 =null;


        CommonTree string_literal227_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:827:2: ( ^( 'LIMIT' ( skip[$where] )? range[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:827:3: ^( 'LIMIT' ( skip[$where] )? range[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            string_literal227=(CommonTree)match(input,125,FOLLOW_125_in_limitClause2259); 
            string_literal227_tree = (CommonTree)adaptor.dupNode(string_literal227);


            root_1 = (CommonTree)adaptor.becomeRoot(string_literal227_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:827:13: ( skip[$where] )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==SKIP) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:827:13: skip[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_skip_in_limitClause2261);
                    skip228=skip(where);

                    state._fsp--;

                    adaptor.addChild(root_1, skip228.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_range_in_limitClause2265);
            range229=range(where);

            state._fsp--;

            adaptor.addChild(root_1, range229.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limitClause"


    public static class skip_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "skip"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:829:1: skip[MyWhereCondition where] : ( ^( SKIP MINUS N ) | ^( SKIP N ) | ^( SKIP '?' ) );
    public final MySQLWalker.skip_return skip(MyWhereCondition where) throws RecognitionException {
        MySQLWalker.skip_return retval = new MySQLWalker.skip_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SKIP230=null;
        CommonTree MINUS231=null;
        CommonTree N232=null;
        CommonTree SKIP233=null;
        CommonTree N234=null;
        CommonTree SKIP235=null;
        CommonTree char_literal236=null;

        CommonTree SKIP230_tree=null;
        CommonTree MINUS231_tree=null;
        CommonTree N232_tree=null;
        CommonTree SKIP233_tree=null;
        CommonTree N234_tree=null;
        CommonTree SKIP235_tree=null;
        CommonTree char_literal236_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:830:2: ( ^( SKIP MINUS N ) | ^( SKIP N ) | ^( SKIP '?' ) )
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==SKIP) ) {
                int LA75_1 = input.LA(2);

                if ( (LA75_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        alt75=1;
                        }
                        break;
                    case N:
                        {
                        alt75=2;
                        }
                        break;
                    case 99:
                        {
                        alt75=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }
            switch (alt75) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:830:3: ^( SKIP MINUS N )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SKIP230=(CommonTree)match(input,SKIP,FOLLOW_SKIP_in_skip2279); 
                    SKIP230_tree = (CommonTree)adaptor.dupNode(SKIP230);


                    root_1 = (CommonTree)adaptor.becomeRoot(SKIP230_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    MINUS231=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_skip2281); 
                    MINUS231_tree = (CommonTree)adaptor.dupNode(MINUS231);


                    adaptor.addChild(root_1, MINUS231_tree);


                    _last = (CommonTree)input.LT(1);
                    N232=(CommonTree)match(input,N,FOLLOW_N_in_skip2283); 
                    N232_tree = (CommonTree)adaptor.dupNode(N232);


                    adaptor.addChild(root_1, N232_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    where.setStart(-Integer.valueOf((N232!=null?N232.getText():null)));

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:831:3: ^( SKIP N )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SKIP233=(CommonTree)match(input,SKIP,FOLLOW_SKIP_in_skip2290); 
                    SKIP233_tree = (CommonTree)adaptor.dupNode(SKIP233);


                    root_1 = (CommonTree)adaptor.becomeRoot(SKIP233_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    N234=(CommonTree)match(input,N,FOLLOW_N_in_skip2292); 
                    N234_tree = (CommonTree)adaptor.dupNode(N234);


                    adaptor.addChild(root_1, N234_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    where.setStart(Integer.valueOf((N234!=null?N234.getText():null)));

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:832:3: ^( SKIP '?' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SKIP235=(CommonTree)match(input,SKIP,FOLLOW_SKIP_in_skip2299); 
                    SKIP235_tree = (CommonTree)adaptor.dupNode(SKIP235);


                    root_1 = (CommonTree)adaptor.becomeRoot(SKIP235_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    char_literal236=(CommonTree)match(input,99,FOLLOW_99_in_skip2301); 
                    char_literal236_tree = (CommonTree)adaptor.dupNode(char_literal236);


                    adaptor.addChild(root_1, char_literal236_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		BindVar val=new BindVar(where.selfAddAndGet());
                    		where.setStart(val);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "skip"


    public static class range_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "range"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:837:1: range[MyWhereCondition where] : ( ^( RANGE MINUS N ) | ^( RANGE N ) | ^( RANGE '?' ) );
    public final MySQLWalker.range_return range(MyWhereCondition where) throws RecognitionException {
        MySQLWalker.range_return retval = new MySQLWalker.range_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree RANGE237=null;
        CommonTree MINUS238=null;
        CommonTree N239=null;
        CommonTree RANGE240=null;
        CommonTree N241=null;
        CommonTree RANGE242=null;
        CommonTree char_literal243=null;

        CommonTree RANGE237_tree=null;
        CommonTree MINUS238_tree=null;
        CommonTree N239_tree=null;
        CommonTree RANGE240_tree=null;
        CommonTree N241_tree=null;
        CommonTree RANGE242_tree=null;
        CommonTree char_literal243_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:838:2: ( ^( RANGE MINUS N ) | ^( RANGE N ) | ^( RANGE '?' ) )
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RANGE) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case MINUS:
                        {
                        alt76=1;
                        }
                        break;
                    case N:
                        {
                        alt76=2;
                        }
                        break;
                    case 99:
                        {
                        alt76=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 2, input);

                        throw nvae;

                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:838:3: ^( RANGE MINUS N )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    RANGE237=(CommonTree)match(input,RANGE,FOLLOW_RANGE_in_range2315); 
                    RANGE237_tree = (CommonTree)adaptor.dupNode(RANGE237);


                    root_1 = (CommonTree)adaptor.becomeRoot(RANGE237_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    MINUS238=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_range2317); 
                    MINUS238_tree = (CommonTree)adaptor.dupNode(MINUS238);


                    adaptor.addChild(root_1, MINUS238_tree);


                    _last = (CommonTree)input.LT(1);
                    N239=(CommonTree)match(input,N,FOLLOW_N_in_range2319); 
                    N239_tree = (CommonTree)adaptor.dupNode(N239);


                    adaptor.addChild(root_1, N239_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    where.setRange(-Integer.valueOf((N239!=null?N239.getText():null)));

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:839:3: ^( RANGE N )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    RANGE240=(CommonTree)match(input,RANGE,FOLLOW_RANGE_in_range2326); 
                    RANGE240_tree = (CommonTree)adaptor.dupNode(RANGE240);


                    root_1 = (CommonTree)adaptor.becomeRoot(RANGE240_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    N241=(CommonTree)match(input,N,FOLLOW_N_in_range2328); 
                    N241_tree = (CommonTree)adaptor.dupNode(N241);


                    adaptor.addChild(root_1, N241_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    where.setRange(Integer.valueOf((N241!=null?N241.getText():null)));

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:840:3: ^( RANGE '?' )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    RANGE242=(CommonTree)match(input,RANGE,FOLLOW_RANGE_in_range2335); 
                    RANGE242_tree = (CommonTree)adaptor.dupNode(RANGE242);


                    root_1 = (CommonTree)adaptor.becomeRoot(RANGE242_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    char_literal243=(CommonTree)match(input,99,FOLLOW_99_in_range2337); 
                    char_literal243_tree = (CommonTree)adaptor.dupNode(char_literal243);


                    adaptor.addChild(root_1, char_literal243_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		BindVar val=new BindVar(where.selfAddAndGet());
                    	where.setRange(val);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "range"


    public static class for_update_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_update"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:846:1: for_update[Select select] : ( ^( FORUPDATE ( N )? ) | ^( SHAREMODE ( N )? ) );
    public final MySQLWalker.for_update_return for_update(Select select) throws RecognitionException {
        MySQLWalker.for_update_return retval = new MySQLWalker.for_update_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FORUPDATE244=null;
        CommonTree N245=null;
        CommonTree SHAREMODE246=null;
        CommonTree N247=null;

        CommonTree FORUPDATE244_tree=null;
        CommonTree N245_tree=null;
        CommonTree SHAREMODE246_tree=null;
        CommonTree N247_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:847:2: ( ^( FORUPDATE ( N )? ) | ^( SHAREMODE ( N )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==FORUPDATE) ) {
                alt79=1;
            }
            else if ( (LA79_0==SHAREMODE) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:847:3: ^( FORUPDATE ( N )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    FORUPDATE244=(CommonTree)match(input,FORUPDATE,FOLLOW_FORUPDATE_in_for_update2353); 
                    FORUPDATE244_tree = (CommonTree)adaptor.dupNode(FORUPDATE244);


                    root_1 = (CommonTree)adaptor.becomeRoot(FORUPDATE244_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:847:15: ( N )?
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==N) ) {
                            alt77=1;
                        }
                        switch (alt77) {
                            case 1 :
                                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:847:15: N
                                {
                                _last = (CommonTree)input.LT(1);
                                N245=(CommonTree)match(input,N,FOLLOW_N_in_for_update2355); 
                                N245_tree = (CommonTree)adaptor.dupNode(N245);


                                adaptor.addChild(root_1, N245_tree);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		MySQLForUpdate forUpdate = new MySQLForUpdate();
                    		select.addForUpdate(forUpdate);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:852:3: ^( SHAREMODE ( N )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHAREMODE246=(CommonTree)match(input,SHAREMODE,FOLLOW_SHAREMODE_in_for_update2365); 
                    SHAREMODE246_tree = (CommonTree)adaptor.dupNode(SHAREMODE246);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHAREMODE246_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:852:15: ( N )?
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==N) ) {
                            alt78=1;
                        }
                        switch (alt78) {
                            case 1 :
                                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\mysql\\MySQLWalker.g:852:15: N
                                {
                                _last = (CommonTree)input.LT(1);
                                N247=(CommonTree)match(input,N,FOLLOW_N_in_for_update2367); 
                                N247_tree = (CommonTree)adaptor.dupNode(N247);


                                adaptor.addChild(root_1, N247_tree);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		MySQLLockInShareMode share = new MySQLLockInShareMode();
                    		select.addForUpdate(share);
                    	

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_update"

    // Delegated rules


 

    public static final BitSet FOLLOW_start_rule_in_beg57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_command_in_start_rule74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_command_in_start_rule80 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_command_in_start_rule85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_command_in_start_rule90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_replace_command_in_start_rule95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setclause108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpecs_in_setclause110 = new BitSet(new long[]{0x0000000000000008L,0x0000000000080000L});
    public static final BitSet FOLLOW_SET_ELE_in_updateColumnSpecs127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_updateColumnSpec145 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_updateColumnSpec147 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_identifier_in_updateColumnSpec150 = new BitSet(new long[]{0x160082002040FA00L,0x0000080801600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_in_updateColumnSpec152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_insert_command175 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tables_in_insert_command177 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_column_specs_in_insert_command180 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_values_in_insert_command184 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPLACE_in_replace_command205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tables_in_replace_command207 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_column_specs_in_replace_command210 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_values_in_replace_command214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_VAL_in_values237 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_values240 = new BitSet(new long[]{0x160082002040FA08L,0x0000080801600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_COLUMNS_in_column_specs258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_column_spec_in_column_specs260 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_COLUMN_in_column_spec276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_column_spec278 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_table_name_in_column_spec280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_whereClause297 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlCondition_in_whereClause299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUPBY_in_groupByClause314 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupAfterWhere_in_groupByClause316 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_HAVING_in_havingClause340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_PAREN_in_havingClause342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDERBY_in_orderByClause371 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_orderByClause373 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere396 = new BitSet(new long[]{0x0000000002000102L});
    public static final BitSet FOLLOW_ASC_in_columnNameAfterWhere410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere413 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_columnNameAfterWhere425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere428 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_afterWhere_in_groupAfterWhere456 = new BitSet(new long[]{0x0000000002000102L});
    public static final BitSet FOLLOW_ASC_in_afterWhere470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_afterWhere473 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_table_alias_in_afterWhere475 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_afterWhere485 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_afterWhere488 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_table_alias_in_afterWhere490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectClause514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_select_list_in_selectClause517 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_NOT_in_sqlCondition548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition550 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_in_sqlCondition557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_132_in_condition577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition581 = new BitSet(new long[]{0x816604A200000008L,0x0000001000000201L,0x0000000000000010L});
    public static final BitSet FOLLOW_100_in_condition593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition595 = new BitSet(new long[]{0x816604A200000008L,0x0000001000000201L,0x0000000000000010L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIORITY_in_condition608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition610 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_condition_expr_in_condition_PAREN623 = new BitSet(new long[]{0x816604A200000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_comparisonCondition_in_condition_expr638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inCondition_in_condition_expr644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isCondition_in_condition_expr651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeCondition_in_condition_expr658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenCondition672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenCondition680 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition682 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeCondition707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition709 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition712 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIKE_in_likeCondition720 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition722 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition725 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNOT_in_isCondition741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition743 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition745 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_in_isCondition753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition755 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition757 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_comparisonCondition774 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition776 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQ_in_comparisonCondition789 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition791 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition794 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTH_in_comparisonCondition804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTH_in_comparisonCondition819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition821 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition824 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_comparisonCondition834 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition836 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition839 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_comparisonCondition849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition851 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_LEFT_in_left_cond876 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_left_cond878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_LISTS_in_in_list899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inCondition_expr_adds_in_in_list901 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_inCondition921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_129_in_inCondition925 = new BitSet(new long[]{0x0001000000080000L,0x0000000001000000L});
    public static final BitSet FOLLOW_subquery_in_inCondition928 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_in_list_in_inCondition932 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_left_cond_in_inCondition937 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_add_in_inCondition_expr_adds968 = new BitSet(new long[]{0x160082002040FA02L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_expr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_in_expr_add1028 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1032 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITIVE_in_expr_add1041 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1045 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr_add1054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1058 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr_add1072 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1076 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITOR_in_expr_add1089 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1093 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITAND_in_expr_add1106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1110 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITXOR_in_expr_add1123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1127 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTLEFT_in_expr_add1140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1144 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTRIGHT_in_expr_add1157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1161 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add1174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1178 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1183 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expr_add1191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1195 = new BitSet(new long[]{0x160082002040FA00L,0x0000080800600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_N_in_expr_add1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr_add1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_expr_add1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_expr_add1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_expr_add1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_expr_add1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUTED_STR_in_expr_add1244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_quoted_string_in_expr_add1246 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_expr_add1253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_expr_add1255 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_table_name_in_expr_add1257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMNAST_in_expr_add1267 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add1269 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERVAL_in_expr_add1286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inner_value_in_expr_add1290 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_unit_in_expr_add1295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr_add1304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_add1307 = new BitSet(new long[]{0x160082002040FA08L,0x0000080801600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_CONSIST_in_expr_add1320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr_add1322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_99_in_inner_value1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_inner_value1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_inner_value1390 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_N_in_inner_value1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIT_in_unit1417 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_unit1419 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_141_in_boolean_literal1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_boolean_literal1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_LIST_in_select_list1489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_dis_col_in_select_list1491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_displayed_column_in_dis_col1506 = new BitSet(new long[]{0x0000020000404002L});
    public static final BitSet FOLLOW_distinct_col_in_dis_col1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLENAMES_in_fromClause1533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_fromClause1535 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_JOIN_in_join_clause1562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_name_in_join_clause1564 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_alias_in_join_clause1566 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_join_column_in_join_clause1571 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_join_column_in_join_clause1575 = new BitSet(new long[]{0x0010101000800008L,0x0000000040004000L});
    public static final BitSet FOLLOW_join_type_in_join_clause1577 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_join_column1620 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_join_column1622 = new BitSet(new long[]{0x0000020000000008L});
    public static final BitSet FOLLOW_table_name_in_join_column1624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNER_in_join_type1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_join_type1673 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_outer_in_join_type1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_join_type1683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_outer_in_join_type1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_in_join_type1693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_outer_in_join_type1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNION_in_join_type1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CROSS_in_join_type1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUTER_in_outer1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TABLENAME_in_table1746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_spec_in_table1748 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_join_clause_in_table1751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TABLENAMES_in_tables1770 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_tables1772 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_schema_name_in_table_spec1793 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_table_name_in_table_spec1797 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_alias_in_table_spec1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_spec1808 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_alias_in_table_spec1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_schema_name1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBQUERY_in_subquery1843 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_select_command_in_subquery1845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_table_name1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_distinct_col1885 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_displayed_column_in_distinct_col1890 = new BitSet(new long[]{0x0000020000404008L});
    public static final BitSet FOLLOW_ID_in_displayed_column1920 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_displayed_column1922 = new BitSet(new long[]{0x160082002040FA88L,0x0000080801600944L,0x0000000000002204L});
    public static final BitSet FOLLOW_alias_in_displayed_column1928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSIST_in_displayed_column1939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_displayed_column1941 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_alias_in_displayed_column1943 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_displayed_column1951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_displayed_column1953 = new BitSet(new long[]{0x0400020000000200L});
    public static final BitSet FOLLOW_columnAnt_in_displayed_column1956 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_alias_in_displayed_column1958 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_columnAnt2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_columnAnt2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_columnAnt2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_quoted_string2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COL_TAB_in_table_alias2070 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_table_alias2072 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_alias2091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_alias2093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_selectClause_in_select_command2123 = new BitSet(new long[]{0x0000014800000002L,0x2000000204100010L});
    public static final BitSet FOLLOW_fromClause_in_select_command2127 = new BitSet(new long[]{0x0000014800000002L,0x2000000200100010L});
    public static final BitSet FOLLOW_whereClause_in_select_command2134 = new BitSet(new long[]{0x0000014800000002L,0x2000000000100010L});
    public static final BitSet FOLLOW_groupByClause_in_select_command2140 = new BitSet(new long[]{0x0000010800000002L,0x2000000000100010L});
    public static final BitSet FOLLOW_havingClause_in_select_command2146 = new BitSet(new long[]{0x0000000800000002L,0x2000000000100010L});
    public static final BitSet FOLLOW_orderByClause_in_select_command2152 = new BitSet(new long[]{0x0000000800000002L,0x2000000000100000L});
    public static final BitSet FOLLOW_limitClause_in_select_command2159 = new BitSet(new long[]{0x0000000800000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_for_update_in_select_command2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_delete_command2187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tables_in_delete_command2189 = new BitSet(new long[]{0x0000000000000008L,0x2000000200000010L});
    public static final BitSet FOLLOW_whereClause_in_delete_command2192 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000010L});
    public static final BitSet FOLLOW_orderByClause_in_delete_command2196 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_limitClause_in_delete_command2202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_update_command2224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tables_in_update_command2226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_setclause_in_update_command2229 = new BitSet(new long[]{0x0000000000000008L,0x2000000200000010L});
    public static final BitSet FOLLOW_whereClause_in_update_command2232 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000010L});
    public static final BitSet FOLLOW_orderByClause_in_update_command2236 = new BitSet(new long[]{0x0000000000000008L,0x2000000000000000L});
    public static final BitSet FOLLOW_limitClause_in_update_command2242 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_125_in_limitClause2259 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_skip_in_limitClause2261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_range_in_limitClause2265 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_in_skip2279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_skip2281 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_N_in_skip2283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_in_skip2290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_skip2292 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_in_skip2299 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_99_in_skip2301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RANGE_in_range2315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_range2317 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_N_in_range2319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RANGE_in_range2326 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_range2328 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RANGE_in_range2335 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_99_in_range2337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORUPDATE_in_for_update2353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_for_update2355 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHAREMODE_in_for_update2365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_for_update2367 = new BitSet(new long[]{0x0000000000000008L});

}