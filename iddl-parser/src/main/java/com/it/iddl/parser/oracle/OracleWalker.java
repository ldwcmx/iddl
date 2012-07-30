// $ANTLR 3.4 D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g 2012-07-30 13:42:33

package  com.it.iddl.parser.oracle; 

import static com.it.iddl.parser.util.Utils.*;

import com.it.iddl.parser.sql.function.*;
import com.it.iddl.parser.sql.objecttree.*;
import com.it.iddl.parser.sql.objecttree.impl.*;
import com.it.iddl.parser.sql.objecttree.oracle.*;
import com.it.iddl.parser.sql.objecttree.oracle.function.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class OracleWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALIAS", "AND", "ARROW", "AS", "ASC", "ASTERISK", "BETWEEN", "BITAND", "BITOR", "BITXOR", "CAST", "COLUMN", "COLUMNAST", "COLUMNS", "COL_TAB", "COMMA", "CONDITION_LEFT", "CONDITION_OR", "CONDITION_OR_NOT", "CONSIST", "CROSS", "DELETE", "DESC", "DISPLAYED_COLUMN", "DISPLAYED_COUNT_COLUMN", "DIVIDE", "DOT", "DOUBLEQUOTED_STRING", "DOUBLEVERTBAR", "EQ", "EXPONENT", "FORUPDATE", "FULL", "GEQ", "GROUPBY", "GTH", "ID", "IN", "INFINITE", "INNER", "INSERT", "INSERT_VAL", "IN_LISTS", "IS", "ISNOT", "JOIN", "LEFT", "LEQ", "LIKE", "LPAREN", "LTH", "MINUS", "N", "NAN", "NEGATIVE", "NOT", "NOT_BETWEEN", "NOT_EQ", "NOT_LIKE", "NOWAIT", "NULL", "NUMBER", "OF", "OR", "ORDERBY", "OUTER", "PLUS", "POINT", "POSITIVE", "PRIORITY", "QUOTED_STRING", "QUTED_STR", "RIGHT", "RPAREN", "SELECT", "SELECT_LIST", "SET", "SET_ELE", "SHIFTLEFT", "SHIFTRIGHT", "SUBQUERY", "TABLENAME", "TABLENAMES", "UNION", "UPDATE", "WAIT", "WHERE", "WS", "'*/'", "'/*'", "'?'", "'AND'", "'AS'", "'BETWEEN'", "'BY'", "'CAST'", "'CROSS'", "'DELETE'", "'FALSE'", "'FOR'", "'FROM'", "'FULL'", "'GRUOP'", "'IN'", "'INFINITE'", "'INNER'", "'INSERT'", "'INTO'", "'IS'", "'JOIN'", "'LEFT'", "'LIKE'", "'NAN'", "'NOT'", "'NOWAIT'", "'NULL'", "'OF'", "'ON'", "'OR'", "'ORDER'", "'OUTER'", "'RIGHT'", "'SELECT'", "'SET'", "'TRUE'", "'UNION'", "'UPDATE'", "'VALUES'", "'WAIT'", "'WHERE'"
    };

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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public OracleWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public OracleWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return OracleWalker.tokenNames; }
    public String getGrammarFileName() { return "D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g"; }



    		protected OracleConsistStringRegister consistStringRegister;
    		protected OracleHintRegister hintRegister;
    		protected OracleFunctionRegister functionRegister;
    		
    		public OracleConsistStringRegister getConsistStringRegister(){
    			return consistStringRegister;
    		}
    		
    		public void setConsistStringRegister(OracleConsistStringRegister consist){
    			this.consistStringRegister=consist;
    		}

        	public OracleFunctionRegister getFunctionRegister() {
    			return functionRegister;
    		}
    		
    		public void setFunctionRegister(OracleFunctionRegister functionRegister) {
    			this.functionRegister = functionRegister;
    		}
    		
    		public void setOracleHint(OracleHintRegister hintreg){
    			this.hintRegister=hintreg;
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:63:1: beg returns [DMLCommon obj] : start_rule ;
    public final OracleWalker.beg_return beg() throws RecognitionException {
        OracleWalker.beg_return retval = new OracleWalker.beg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.start_rule_return start_rule1 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:63:27: ( start_rule )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:64:1: start_rule
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_start_rule_in_beg48);
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:67:1: start_rule returns [DMLCommon obj] : ( select_command[null] | insert_command | update_command | delete_command );
    public final OracleWalker.start_rule_return start_rule() throws RecognitionException {
        OracleWalker.start_rule_return retval = new OracleWalker.start_rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.select_command_return select_command2 =null;

        OracleWalker.insert_command_return insert_command3 =null;

        OracleWalker.update_command_return update_command4 =null;

        OracleWalker.delete_command_return delete_command5 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:68:2: ( select_command[null] | insert_command | update_command | delete_command )
            int alt1=4;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:68:3: select_command[null]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_select_command_in_start_rule65);
                    select_command2=select_command(null);

                    state._fsp--;

                    adaptor.addChild(root_0, select_command2.getTree());


                    retval.obj =(select_command2!=null?select_command2.select:null);

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:69:3: insert_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_insert_command_in_start_rule71);
                    insert_command3=insert_command();

                    state._fsp--;

                    adaptor.addChild(root_0, insert_command3.getTree());


                    retval.obj =(insert_command3!=null?insert_command3.ins:null);

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:70:3: update_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_update_command_in_start_rule76);
                    update_command4=update_command();

                    state._fsp--;

                    adaptor.addChild(root_0, update_command4.getTree());


                    retval.obj =(update_command4!=null?update_command4.update:null);

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:71:3: delete_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_delete_command_in_start_rule81);
                    delete_command5=delete_command();

                    state._fsp--;

                    adaptor.addChild(root_0, delete_command5.getTree());


                    retval.obj =(delete_command5!=null?delete_command5.del:null);

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:74:1: setclause[Update update] : ^( SET ( updateColumnSpecs[$update] )+ ) ;
    public final OracleWalker.setclause_return setclause(Update update) throws RecognitionException {
        OracleWalker.setclause_return retval = new OracleWalker.setclause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET6=null;
        OracleWalker.updateColumnSpecs_return updateColumnSpecs7 =null;


        CommonTree SET6_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:75:2: ( ^( SET ( updateColumnSpecs[$update] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:75:3: ^( SET ( updateColumnSpecs[$update] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SET6=(CommonTree)match(input,SET,FOLLOW_SET_in_setclause94); 
            SET6_tree = (CommonTree)adaptor.dupNode(SET6);


            root_1 = (CommonTree)adaptor.becomeRoot(SET6_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:75:9: ( updateColumnSpecs[$update] )+
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
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:75:9: updateColumnSpecs[$update]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_updateColumnSpecs_in_setclause96);
            	    updateColumnSpecs7=updateColumnSpecs(update);

            	    state._fsp--;

            	    adaptor.addChild(root_1, updateColumnSpecs7.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:77:1: updateColumnSpecs[Update update] : ^( SET_ELE updateColumnSpec[$update] ) ;
    public final OracleWalker.updateColumnSpecs_return updateColumnSpecs(Update update) throws RecognitionException {
        OracleWalker.updateColumnSpecs_return retval = new OracleWalker.updateColumnSpecs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SET_ELE8=null;
        OracleWalker.updateColumnSpec_return updateColumnSpec9 =null;


        CommonTree SET_ELE8_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:78:2: ( ^( SET_ELE updateColumnSpec[$update] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:78:3: ^( SET_ELE updateColumnSpec[$update] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SET_ELE8=(CommonTree)match(input,SET_ELE,FOLLOW_SET_ELE_in_updateColumnSpecs111); 
            SET_ELE8_tree = (CommonTree)adaptor.dupNode(SET_ELE8);


            root_1 = (CommonTree)adaptor.becomeRoot(SET_ELE8_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs113);
            updateColumnSpec9=updateColumnSpec(update);

            state._fsp--;

            adaptor.addChild(root_1, updateColumnSpec9.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:80:1: updateColumnSpec[Update update] : ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) ;
    public final OracleWalker.updateColumnSpec_return updateColumnSpec(Update update) throws RecognitionException {
        OracleWalker.updateColumnSpec_return retval = new OracleWalker.updateColumnSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ10=null;
        OracleWalker.table_alias_return table_alias11 =null;

        OracleWalker.identifier_return identifier12 =null;

        OracleWalker.expr_return expr13 =null;


        CommonTree EQ10_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:81:2: ( ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:81:3: ^( EQ ( table_alias )? identifier expr[$update.getIndexHolder()] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ10=(CommonTree)match(input,EQ,FOLLOW_EQ_in_updateColumnSpec127); 
            EQ10_tree = (CommonTree)adaptor.dupNode(EQ10);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ10_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:81:8: ( table_alias )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==COL_TAB) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:81:8: table_alias
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_alias_in_updateColumnSpec129);
                    table_alias11=table_alias();

                    state._fsp--;

                    adaptor.addChild(root_1, table_alias11.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_updateColumnSpec132);
            identifier12=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier12.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_updateColumnSpec134);
            expr13=expr(update.getIndexHolder());

            state._fsp--;

            adaptor.addChild(root_1, expr13.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	update.addSetElement((identifier12!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier12.start),input.getTreeAdaptor().getTokenStopIndex(identifier12.start))):null),(table_alias11!=null?table_alias11.aText:null),(expr13!=null?expr13.valueObj:null));
            	

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


    public static class values_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "values"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:88:1: values[Insert ins] : ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) ;
    public final OracleWalker.values_return values(Insert ins) throws RecognitionException {
        OracleWalker.values_return retval = new OracleWalker.values_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT_VAL14=null;
        OracleWalker.expr_return expr15 =null;


        CommonTree INSERT_VAL14_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:88:20: ( ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:88:21: ^( INSERT_VAL ( expr[$ins.getIndexHolder()] )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSERT_VAL14=(CommonTree)match(input,INSERT_VAL,FOLLOW_INSERT_VAL_in_values151); 
            INSERT_VAL14_tree = (CommonTree)adaptor.dupNode(INSERT_VAL14);


            root_1 = (CommonTree)adaptor.becomeRoot(INSERT_VAL14_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:88:34: ( expr[$ins.getIndexHolder()] )*
                loop4:
                do {
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ASTERISK||(LA4_0 >= BITAND && LA4_0 <= COLUMNAST)||LA4_0==CONSIST||LA4_0==DIVIDE||LA4_0==ID||(LA4_0 >= MINUS && LA4_0 <= N)||LA4_0==NEGATIVE||LA4_0==NUMBER||LA4_0==PLUS||LA4_0==POSITIVE||LA4_0==QUTED_STR||(LA4_0 >= SHIFTLEFT && LA4_0 <= SUBQUERY)||LA4_0==94||LA4_0==102||LA4_0==119||LA4_0==128) ) {
                        alt4=1;
                    }


                    switch (alt4) {
                	case 1 :
                	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:88:35: expr[$ins.getIndexHolder()]
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_expr_in_values154);
                	    expr15=expr(ins.getIndexHolder());

                	    state._fsp--;

                	    adaptor.addChild(root_1, expr15.getTree());


                	    ins.addValue((expr15!=null?expr15.valueObj:null));

                	    }
                	    break;

                	default :
                	    break loop4;
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:90:1: column_specs[Insert ins] : ^( COLUMNS ( column_spec[$ins] )+ ) ;
    public final OracleWalker.column_specs_return column_specs(Insert ins) throws RecognitionException {
        OracleWalker.column_specs_return retval = new OracleWalker.column_specs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMNS16=null;
        OracleWalker.column_spec_return column_spec17 =null;


        CommonTree COLUMNS16_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:91:2: ( ^( COLUMNS ( column_spec[$ins] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:91:3: ^( COLUMNS ( column_spec[$ins] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMNS16=(CommonTree)match(input,COLUMNS,FOLLOW_COLUMNS_in_column_specs170); 
            COLUMNS16_tree = (CommonTree)adaptor.dupNode(COLUMNS16);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMNS16_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:91:13: ( column_spec[$ins] )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COLUMN) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:91:13: column_spec[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_spec_in_column_specs172);
            	    column_spec17=column_spec(ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_spec17.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:93:1: column_spec[Insert ins] : ^( COLUMN identifier ( table_name )? ) ;
    public final OracleWalker.column_spec_return column_spec(Insert ins) throws RecognitionException {
        OracleWalker.column_spec_return retval = new OracleWalker.column_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN18=null;
        OracleWalker.identifier_return identifier19 =null;

        OracleWalker.table_name_return table_name20 =null;


        CommonTree COLUMN18_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:94:2: ( ^( COLUMN identifier ( table_name )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:94:3: ^( COLUMN identifier ( table_name )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMN18=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_column_spec186); 
            COLUMN18_tree = (CommonTree)adaptor.dupNode(COLUMN18);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN18_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_column_spec188);
            identifier19=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier19.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:94:23: ( table_name )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:94:23: table_name
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_column_spec190);
                    table_name20=table_name();

                    state._fsp--;

                    adaptor.addChild(root_1, table_name20.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		ins.addColumnTandC((table_name20!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name20.start),input.getTreeAdaptor().getTokenStopIndex(table_name20.start))):null),(identifier19!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier19.start),input.getTreeAdaptor().getTokenStopIndex(identifier19.start))):null));
            	

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:102:1: whereClause[WhereCondition where] : ^( WHERE sqlCondition[$where] ) ;
    public final OracleWalker.whereClause_return whereClause(WhereCondition where) throws RecognitionException {
        OracleWalker.whereClause_return retval = new OracleWalker.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree WHERE21=null;
        OracleWalker.sqlCondition_return sqlCondition22 =null;


        CommonTree WHERE21_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:103:2: ( ^( WHERE sqlCondition[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:103:3: ^( WHERE sqlCondition[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WHERE21=(CommonTree)match(input,WHERE,FOLLOW_WHERE_in_whereClause209); 
            WHERE21_tree = (CommonTree)adaptor.dupNode(WHERE21);


            root_1 = (CommonTree)adaptor.becomeRoot(WHERE21_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_sqlCondition_in_whereClause211);
            sqlCondition22=sqlCondition(where);

            state._fsp--;

            adaptor.addChild(root_1, sqlCondition22.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:106:1: groupByClause[WhereCondition where] : ^( GROUPBY groupAfterWhere ) ;
    public final OracleWalker.groupByClause_return groupByClause(WhereCondition where) throws RecognitionException {
        OracleWalker.groupByClause_return retval = new OracleWalker.groupByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GROUPBY23=null;
        OracleWalker.groupAfterWhere_return groupAfterWhere24 =null;


        CommonTree GROUPBY23_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:107:2: ( ^( GROUPBY groupAfterWhere ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:107:3: ^( GROUPBY groupAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            GROUPBY23=(CommonTree)match(input,GROUPBY,FOLLOW_GROUPBY_in_groupByClause226); 
            GROUPBY23_tree = (CommonTree)adaptor.dupNode(GROUPBY23);


            root_1 = (CommonTree)adaptor.becomeRoot(GROUPBY23_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_groupAfterWhere_in_groupByClause228);
            groupAfterWhere24=groupAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, groupAfterWhere24.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		where.setGroupByColumnList((groupAfterWhere24!=null?groupAfterWhere24.ret:null));
            	

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


    public static class orderByClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderByClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:111:1: orderByClause[WhereCondition where] : ^( ORDERBY columnNamesAfterWhere ) ;
    public final OracleWalker.orderByClause_return orderByClause(WhereCondition where) throws RecognitionException {
        OracleWalker.orderByClause_return retval = new OracleWalker.orderByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ORDERBY25=null;
        OracleWalker.columnNamesAfterWhere_return columnNamesAfterWhere26 =null;


        CommonTree ORDERBY25_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:112:2: ( ^( ORDERBY columnNamesAfterWhere ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:112:3: ^( ORDERBY columnNamesAfterWhere )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ORDERBY25=(CommonTree)match(input,ORDERBY,FOLLOW_ORDERBY_in_orderByClause241); 
            ORDERBY25_tree = (CommonTree)adaptor.dupNode(ORDERBY25);


            root_1 = (CommonTree)adaptor.becomeRoot(ORDERBY25_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_columnNamesAfterWhere_in_orderByClause243);
            columnNamesAfterWhere26=columnNamesAfterWhere();

            state._fsp--;

            adaptor.addChild(root_1, columnNamesAfterWhere26.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		where.setOrderByColumnList((columnNamesAfterWhere26!=null?columnNamesAfterWhere26.ret:null));
            	

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:116:1: columnNamesAfterWhere returns [List<OrderByElement> ret] : ( columnNameAfterWhere[$ret] )+ ;
    public final OracleWalker.columnNamesAfterWhere_return columnNamesAfterWhere() throws RecognitionException {
        OracleWalker.columnNamesAfterWhere_return retval = new OracleWalker.columnNamesAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.columnNameAfterWhere_return columnNameAfterWhere27 =null;




        	retval.ret = new ArrayList<OrderByElement>();

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:120:2: ( ( columnNameAfterWhere[$ret] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:120:3: ( columnNameAfterWhere[$ret] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:120:3: ( columnNameAfterWhere[$ret] )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==ASC||LA7_0==DESC) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:120:4: columnNameAfterWhere[$ret]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere262);
            	    columnNameAfterWhere27=columnNameAfterWhere(retval.ret);

            	    state._fsp--;

            	    adaptor.addChild(root_0, columnNameAfterWhere27.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:122:1: columnNameAfterWhere[List<OrderByElement> orderByEles] : ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) );
    public final OracleWalker.columnNameAfterWhere_return columnNameAfterWhere(List<OrderByElement> orderByEles) throws RecognitionException {
        OracleWalker.columnNameAfterWhere_return retval = new OracleWalker.columnNameAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASC28=null;
        CommonTree DESC31=null;
        OracleWalker.identifier_return identifier29 =null;

        OracleWalker.table_alias_return table_alias30 =null;

        OracleWalker.identifier_return identifier32 =null;

        OracleWalker.table_alias_return table_alias33 =null;


        CommonTree ASC28_tree=null;
        CommonTree DESC31_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:123:2: ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ASC) ) {
                alt10=1;
            }
            else if ( (LA10_0==DESC) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:123:3: ^( ASC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASC28=(CommonTree)match(input,ASC,FOLLOW_ASC_in_columnNameAfterWhere276); 
                    ASC28_tree = (CommonTree)adaptor.dupNode(ASC28);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASC28_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere279);
                    identifier29=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier29.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:123:21: ( table_alias )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==COL_TAB) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:123:21: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere281);
                            table_alias30=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias30.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		orderByEles.add(new OrderByElement((table_alias30!=null?table_alias30.aText:null),(identifier29!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier29.start),input.getTreeAdaptor().getTokenStopIndex(identifier29.start))):null),true));
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:126:3: ^( DESC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DESC31=(CommonTree)match(input,DESC,FOLLOW_DESC_in_columnNameAfterWhere289); 
                    DESC31_tree = (CommonTree)adaptor.dupNode(DESC31);


                    root_1 = (CommonTree)adaptor.becomeRoot(DESC31_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere292);
                    identifier32=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier32.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:126:22: ( table_alias )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==COL_TAB) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:126:22: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere294);
                            table_alias33=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias33.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		orderByEles.add(new OrderByElement((table_alias33!=null?table_alias33.aText:null),(identifier32!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier32.start),input.getTreeAdaptor().getTokenStopIndex(identifier32.start))):null),false));
                    	

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:131:1: groupAfterWhere returns [List<GroupByElement> ret] : ( afterWhere[$ret] )+ ;
    public final OracleWalker.groupAfterWhere_return groupAfterWhere() throws RecognitionException {
        OracleWalker.groupAfterWhere_return retval = new OracleWalker.groupAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.afterWhere_return afterWhere34 =null;




        	retval.ret = new ArrayList<GroupByElement>();

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:135:2: ( ( afterWhere[$ret] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:135:3: ( afterWhere[$ret] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:135:3: ( afterWhere[$ret] )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ASC||LA11_0==DESC) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:135:4: afterWhere[$ret]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_afterWhere_in_groupAfterWhere316);
            	    afterWhere34=afterWhere(retval.ret);

            	    state._fsp--;

            	    adaptor.addChild(root_0, afterWhere34.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:137:1: afterWhere[List<GroupByElement> groupByElementList] : ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) );
    public final OracleWalker.afterWhere_return afterWhere(List<GroupByElement> groupByElementList) throws RecognitionException {
        OracleWalker.afterWhere_return retval = new OracleWalker.afterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASC35=null;
        CommonTree DESC38=null;
        OracleWalker.identifier_return identifier36 =null;

        OracleWalker.table_alias_return table_alias37 =null;

        OracleWalker.identifier_return identifier39 =null;

        OracleWalker.table_alias_return table_alias40 =null;


        CommonTree ASC35_tree=null;
        CommonTree DESC38_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:138:2: ( ^( ASC identifier ( table_alias )? ) | ^( DESC identifier ( table_alias )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ASC) ) {
                alt14=1;
            }
            else if ( (LA14_0==DESC) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:138:3: ^( ASC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASC35=(CommonTree)match(input,ASC,FOLLOW_ASC_in_afterWhere330); 
                    ASC35_tree = (CommonTree)adaptor.dupNode(ASC35);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASC35_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_afterWhere333);
                    identifier36=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier36.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:138:21: ( table_alias )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==COL_TAB) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:138:21: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_afterWhere335);
                            table_alias37=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias37.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		groupByElementList.add(new GroupByElement((table_alias37!=null?table_alias37.aText:null),(identifier36!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier36.start),input.getTreeAdaptor().getTokenStopIndex(identifier36.start))):null),true));
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:141:3: ^( DESC identifier ( table_alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DESC38=(CommonTree)match(input,DESC,FOLLOW_DESC_in_afterWhere343); 
                    DESC38_tree = (CommonTree)adaptor.dupNode(DESC38);


                    root_1 = (CommonTree)adaptor.becomeRoot(DESC38_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_afterWhere346);
                    identifier39=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier39.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:141:22: ( table_alias )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==COL_TAB) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:141:22: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_afterWhere348);
                            table_alias40=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias40.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		groupByElementList.add(new GroupByElement((table_alias40!=null?table_alias40.aText:null),(identifier39!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier39.start),input.getTreeAdaptor().getTokenStopIndex(identifier39.start))):null),false));
                    	

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


    public static class sqlCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sqlCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:146:1: sqlCondition[WhereCondition where] : ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) );
    public final OracleWalker.sqlCondition_return sqlCondition(WhereCondition where) throws RecognitionException {
        OracleWalker.sqlCondition_return retval = new OracleWalker.sqlCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_OR_NOT41=null;
        CommonTree CONDITION_OR43=null;
        OracleWalker.condition_return condition42 =null;

        OracleWalker.condition_return condition44 =null;


        CommonTree CONDITION_OR_NOT41_tree=null;
        CommonTree CONDITION_OR43_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:148:2: ( ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] ) | ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==CONDITION_OR_NOT) ) {
                alt15=1;
            }
            else if ( (LA15_0==CONDITION_OR) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:148:3: ^( CONDITION_OR_NOT condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONDITION_OR_NOT41=(CommonTree)match(input,CONDITION_OR_NOT,FOLLOW_CONDITION_OR_NOT_in_sqlCondition365); 
                    CONDITION_OR_NOT41_tree = (CommonTree)adaptor.dupNode(CONDITION_OR_NOT41);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR_NOT41_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition367);
                    condition42=condition(where.getHolder(), where.getExpGroup(), false);

                    state._fsp--;

                    adaptor.addChild(root_1, condition42.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:149:3: ^( CONDITION_OR condition[where.getHolder(),where.getExpGroup(),false] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONDITION_OR43=(CommonTree)match(input,CONDITION_OR,FOLLOW_CONDITION_OR_in_sqlCondition374); 
                    CONDITION_OR43_tree = (CommonTree)adaptor.dupNode(CONDITION_OR43);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_OR43_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_sqlCondition376);
                    condition44=condition(where.getHolder(), where.getExpGroup(), false);

                    state._fsp--;

                    adaptor.addChild(root_1, condition44.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:152:1: condition[BindIndexHolder where,ExpressionGroup eg,boolean isPriority] : ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) );
    public final OracleWalker.condition_return condition(BindIndexHolder where, ExpressionGroup eg, boolean isPriority) throws RecognitionException {
        OracleWalker.condition_return retval = new OracleWalker.condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree string_literal45=null;
        CommonTree string_literal46=null;
        CommonTree PRIORITY49=null;
        OracleWalker.condition_return s1 =null;

        OracleWalker.condition_return condition47 =null;

        OracleWalker.condition_PAREN_return condition_PAREN48 =null;

        OracleWalker.condition_return condition50 =null;


        CommonTree string_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree PRIORITY49_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:156:2: ( ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ ) | ^( 'AND' ( condition[where,andExp,$isPriority] )+ ) | condition_PAREN[where,$eg] | ^( PRIORITY condition[where,$eg,true] ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt18=1;
                }
                break;
            case 95:
                {
                alt18=2;
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
                alt18=3;
                }
                break;
            case PRIORITY:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:157:2: ^( 'OR' (s1= condition[where,orExp,$isPriority] )+ )
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
                    string_literal45=(CommonTree)match(input,122,FOLLOW_122_in_condition397); 
                    string_literal45_tree = (CommonTree)adaptor.dupNode(string_literal45);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:160:12: (s1= condition[where,orExp,$isPriority] )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==EQ||LA16_0==GEQ||LA16_0==GTH||LA16_0==IN||(LA16_0 >= IS && LA16_0 <= ISNOT)||(LA16_0 >= LEQ && LA16_0 <= LIKE)||LA16_0==LTH||(LA16_0 >= NOT_EQ && LA16_0 <= NOT_LIKE)||LA16_0==PRIORITY||LA16_0==95||LA16_0==122) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:160:12: s1= condition[where,orExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition401);
                    	    s1=condition(where, orExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, s1.getTree());


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
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:162:2: ^( 'AND' ( condition[where,andExp,$isPriority] )+ )
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
                    string_literal46=(CommonTree)match(input,95,FOLLOW_95_in_condition413); 
                    string_literal46_tree = (CommonTree)adaptor.dupNode(string_literal46);


                    root_1 = (CommonTree)adaptor.becomeRoot(string_literal46_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:165:11: ( condition[where,andExp,$isPriority] )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==EQ||LA17_0==GEQ||LA17_0==GTH||LA17_0==IN||(LA17_0 >= IS && LA17_0 <= ISNOT)||(LA17_0 >= LEQ && LA17_0 <= LIKE)||LA17_0==LTH||(LA17_0 >= NOT_EQ && LA17_0 <= NOT_LIKE)||LA17_0==PRIORITY||LA17_0==95||LA17_0==122) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:165:11: condition[where,andExp,$isPriority]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_condition_in_condition415);
                    	    condition47=condition(where, andExp, isPriority);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, condition47.getTree());


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:170:3: condition_PAREN[where,$eg]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_PAREN_in_condition426);
                    condition_PAREN48=condition_PAREN(where, eg);

                    state._fsp--;

                    adaptor.addChild(root_0, condition_PAREN48.getTree());


                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:171:3: ^( PRIORITY condition[where,$eg,true] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PRIORITY49=(CommonTree)match(input,PRIORITY,FOLLOW_PRIORITY_in_condition432); 
                    PRIORITY49_tree = (CommonTree)adaptor.dupNode(PRIORITY49);


                    root_1 = (CommonTree)adaptor.becomeRoot(PRIORITY49_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_condition_in_condition434);
                    condition50=condition(where, eg, true);

                    state._fsp--;

                    adaptor.addChild(root_1, condition50.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:191:1: condition_PAREN[BindIndexHolder where,ExpressionGroup exp] : ( condition_expr[$where,$exp] )+ ;
    public final OracleWalker.condition_PAREN_return condition_PAREN(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.condition_PAREN_return retval = new OracleWalker.condition_PAREN_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.condition_expr_return condition_expr51 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:192:2: ( ( condition_expr[$where,$exp] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:192:3: ( condition_expr[$where,$exp] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:192:3: ( condition_expr[$where,$exp] )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                switch ( input.LA(1) ) {
                case EQ:
                    {
                    alt19=1;
                    }
                    break;
                case NOT_EQ:
                    {
                    alt19=1;
                    }
                    break;
                case LTH:
                    {
                    alt19=1;
                    }
                    break;
                case GTH:
                    {
                    alt19=1;
                    }
                    break;
                case LEQ:
                    {
                    alt19=1;
                    }
                    break;
                case GEQ:
                    {
                    alt19=1;
                    }
                    break;
                case IN:
                    {
                    alt19=1;
                    }
                    break;
                case ISNOT:
                    {
                    alt19=1;
                    }
                    break;
                case IS:
                    {
                    alt19=1;
                    }
                    break;
                case NOT_LIKE:
                    {
                    alt19=1;
                    }
                    break;
                case LIKE:
                    {
                    alt19=1;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:192:3: condition_expr[$where,$exp]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_condition_expr_in_condition_PAREN449);
            	    condition_expr51=condition_expr(where, exp);

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition_expr51.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:194:1: condition_expr[BindIndexHolder where,ExpressionGroup exp] : ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] );
    public final OracleWalker.condition_expr_return condition_expr(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.condition_expr_return retval = new OracleWalker.condition_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.comparisonCondition_return comparisonCondition52 =null;

        OracleWalker.inCondition_return inCondition53 =null;

        OracleWalker.isCondition_return isCondition54 =null;

        OracleWalker.likeCondition_return likeCondition55 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:195:2: ( comparisonCondition[$where,$exp] | inCondition[$where,$exp] | isCondition[$where,$exp] | likeCondition[$where,$exp] )
            int alt20=4;
            switch ( input.LA(1) ) {
            case EQ:
            case GEQ:
            case GTH:
            case LEQ:
            case LTH:
            case NOT_EQ:
                {
                alt20=1;
                }
                break;
            case IN:
                {
                alt20=2;
                }
                break;
            case IS:
            case ISNOT:
                {
                alt20=3;
                }
                break;
            case LIKE:
            case NOT_LIKE:
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:195:4: comparisonCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_comparisonCondition_in_condition_expr462);
                    comparisonCondition52=comparisonCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, comparisonCondition52.getTree());


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:196:4: inCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_inCondition_in_condition_expr468);
                    inCondition53=inCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, inCondition53.getTree());


                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:197:4: isCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_isCondition_in_condition_expr475);
                    isCondition54=isCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, isCondition54.getTree());


                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:198:4: likeCondition[$where,$exp]
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_likeCondition_in_condition_expr482);
                    likeCondition55=likeCondition(where, exp);

                    state._fsp--;

                    adaptor.addChild(root_0, likeCondition55.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:201:1: betweenCondition : ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) );
    public final OracleWalker.betweenCondition_return betweenCondition() throws RecognitionException {
        OracleWalker.betweenCondition_return retval = new OracleWalker.betweenCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_BETWEEN56=null;
        CommonTree BETWEEN58=null;
        OracleWalker.between_and_return between_and57 =null;

        OracleWalker.between_and_return between_and59 =null;


        CommonTree NOT_BETWEEN56_tree=null;
        CommonTree BETWEEN58_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:202:2: ( ^( NOT_BETWEEN between_and ) | ^( BETWEEN between_and ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NOT_BETWEEN) ) {
                alt21=1;
            }
            else if ( (LA21_0==BETWEEN) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:202:3: ^( NOT_BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT_BETWEEN56=(CommonTree)match(input,NOT_BETWEEN,FOLLOW_NOT_BETWEEN_in_betweenCondition494); 
                    NOT_BETWEEN56_tree = (CommonTree)adaptor.dupNode(NOT_BETWEEN56);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_BETWEEN56_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition496);
                        between_and57=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and57.getTree());


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:203:3: ^( BETWEEN between_and )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BETWEEN58=(CommonTree)match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenCondition502); 
                    BETWEEN58_tree = (CommonTree)adaptor.dupNode(BETWEEN58);


                    root_1 = (CommonTree)adaptor.becomeRoot(BETWEEN58_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_between_and_in_betweenCondition504);
                        between_and59=between_and();

                        state._fsp--;

                        adaptor.addChild(root_1, between_and59.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:205:1: between_and :;
    public final OracleWalker.between_and_return between_and() throws RecognitionException {
        OracleWalker.between_and_return retval = new OracleWalker.between_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:206:2: ()
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:207:2: 
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:208:1: likeCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) );
    public final OracleWalker.likeCondition_return likeCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.likeCondition_return retval = new OracleWalker.likeCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOT_LIKE60=null;
        CommonTree LIKE63=null;
        OracleWalker.expr_return expr61 =null;

        OracleWalker.left_cond_return left_cond62 =null;

        OracleWalker.expr_return expr64 =null;

        OracleWalker.left_cond_return left_cond65 =null;


        CommonTree NOT_LIKE60_tree=null;
        CommonTree LIKE63_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:209:2: ( ^( NOT_LIKE expr[$where] left_cond[$where] ) | ^( LIKE expr[$where] left_cond[$where] ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==NOT_LIKE) ) {
                alt22=1;
            }
            else if ( (LA22_0==LIKE) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:209:3: ^( NOT_LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT_LIKE60=(CommonTree)match(input,NOT_LIKE,FOLLOW_NOT_LIKE_in_likeCondition525); 
                    NOT_LIKE60_tree = (CommonTree)adaptor.dupNode(NOT_LIKE60);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_LIKE60_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition527);
                    expr61=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr61.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition530);
                    left_cond62=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond62.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    			NotLike notlike=new NotLike();
                    		notlike.setLeft((left_cond62!=null?left_cond62.ret:null));
                    		notlike.setRight((expr61!=null?expr61.valueObj:null));
                    		exp.addExpression(notlike);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:215:3: ^( LIKE expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LIKE63=(CommonTree)match(input,LIKE,FOLLOW_LIKE_in_likeCondition538); 
                    LIKE63_tree = (CommonTree)adaptor.dupNode(LIKE63);


                    root_1 = (CommonTree)adaptor.becomeRoot(LIKE63_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_likeCondition540);
                    expr64=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr64.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_likeCondition543);
                    left_cond65=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond65.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		Like like=new Like();
                    		like.setLeft((left_cond65!=null?left_cond65.ret:null));
                    		like.setRight((expr64!=null?expr64.valueObj:null));
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:223:1: isCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) );
    public final OracleWalker.isCondition_return isCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.isCondition_return retval = new OracleWalker.isCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ISNOT66=null;
        CommonTree NULL67=null;
        CommonTree IS69=null;
        CommonTree NULL70=null;
        OracleWalker.left_cond_return left_cond68 =null;

        OracleWalker.left_cond_return left_cond71 =null;


        CommonTree ISNOT66_tree=null;
        CommonTree NULL67_tree=null;
        CommonTree IS69_tree=null;
        CommonTree NULL70_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:224:2: ( ^( ISNOT NULL left_cond[$where] ) | ^( IS NULL left_cond[$where] ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ISNOT) ) {
                alt23=1;
            }
            else if ( (LA23_0==IS) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:224:3: ^( ISNOT NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ISNOT66=(CommonTree)match(input,ISNOT,FOLLOW_ISNOT_in_isCondition559); 
                    ISNOT66_tree = (CommonTree)adaptor.dupNode(ISNOT66);


                    root_1 = (CommonTree)adaptor.becomeRoot(ISNOT66_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL67=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition561); 
                    NULL67_tree = (CommonTree)adaptor.dupNode(NULL67);


                    adaptor.addChild(root_1, NULL67_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition563);
                    left_cond68=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond68.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		IsNot arg=new IsNot();
                    		arg.setLeft((left_cond68!=null?left_cond68.ret:null));
                    		arg.setRight(null);
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:230:3: ^( IS NULL left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    IS69=(CommonTree)match(input,IS,FOLLOW_IS_in_isCondition571); 
                    IS69_tree = (CommonTree)adaptor.dupNode(IS69);


                    root_1 = (CommonTree)adaptor.becomeRoot(IS69_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    NULL70=(CommonTree)match(input,NULL,FOLLOW_NULL_in_isCondition573); 
                    NULL70_tree = (CommonTree)adaptor.dupNode(NULL70);


                    adaptor.addChild(root_1, NULL70_tree);


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_isCondition575);
                    left_cond71=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond71.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		Is arg=new Is();
                    		arg.setLeft((left_cond71!=null?left_cond71.ret:null));
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:239:1: comparisonCondition[BindIndexHolder where,ExpressionGroup exp] : ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) );
    public final OracleWalker.comparisonCondition_return comparisonCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.comparisonCondition_return retval = new OracleWalker.comparisonCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ72=null;
        CommonTree NOT_EQ75=null;
        CommonTree LTH78=null;
        CommonTree GTH81=null;
        CommonTree LEQ84=null;
        CommonTree GEQ87=null;
        OracleWalker.expr_return expr73 =null;

        OracleWalker.left_cond_return left_cond74 =null;

        OracleWalker.expr_return expr76 =null;

        OracleWalker.left_cond_return left_cond77 =null;

        OracleWalker.expr_return expr79 =null;

        OracleWalker.left_cond_return left_cond80 =null;

        OracleWalker.expr_return expr82 =null;

        OracleWalker.left_cond_return left_cond83 =null;

        OracleWalker.expr_return expr85 =null;

        OracleWalker.left_cond_return left_cond86 =null;

        OracleWalker.expr_return expr88 =null;

        OracleWalker.left_cond_return left_cond89 =null;


        CommonTree EQ72_tree=null;
        CommonTree NOT_EQ75_tree=null;
        CommonTree LTH78_tree=null;
        CommonTree GTH81_tree=null;
        CommonTree LEQ84_tree=null;
        CommonTree GEQ87_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:240:2: ( ^( EQ expr[$where] left_cond[$where] ) | ^( NOT_EQ expr[$where] left_cond[$where] ) | ^( LTH expr[$where] left_cond[$where] ) | ^( GTH expr[$where] left_cond[$where] ) | ^( LEQ expr[$where] left_cond[$where] ) | ^( GEQ expr[$where] left_cond[$where] ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt24=1;
                }
                break;
            case NOT_EQ:
                {
                alt24=2;
                }
                break;
            case LTH:
                {
                alt24=3;
                }
                break;
            case GTH:
                {
                alt24=4;
                }
                break;
            case LEQ:
                {
                alt24=5;
                }
                break;
            case GEQ:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:240:3: ^( EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    EQ72=(CommonTree)match(input,EQ,FOLLOW_EQ_in_comparisonCondition592); 
                    EQ72_tree = (CommonTree)adaptor.dupNode(EQ72);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQ72_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition594);
                    expr73=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr73.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition597);
                    left_cond74=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond74.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		Equivalent arg=new Equivalent();
                    		arg.setLeft((left_cond74!=null?left_cond74.ret:null));
                    		arg.setRight((expr73!=null?expr73.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:247:3: ^( NOT_EQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOT_EQ75=(CommonTree)match(input,NOT_EQ,FOLLOW_NOT_EQ_in_comparisonCondition607); 
                    NOT_EQ75_tree = (CommonTree)adaptor.dupNode(NOT_EQ75);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_EQ75_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition609);
                    expr76=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr76.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition612);
                    left_cond77=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond77.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		NotEquivalent arg=new NotEquivalent();
                    		arg.setLeft((left_cond77!=null?left_cond77.ret:null));
                    		arg.setRight((expr76!=null?expr76.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:254:3: ^( LTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LTH78=(CommonTree)match(input,LTH,FOLLOW_LTH_in_comparisonCondition622); 
                    LTH78_tree = (CommonTree)adaptor.dupNode(LTH78);


                    root_1 = (CommonTree)adaptor.becomeRoot(LTH78_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition624);
                    expr79=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr79.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition627);
                    left_cond80=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond80.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		LessThan arg=new LessThan();
                    		arg.setLeft((left_cond80!=null?left_cond80.ret:null));
                    		arg.setRight((expr79!=null?expr79.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:261:3: ^( GTH expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GTH81=(CommonTree)match(input,GTH,FOLLOW_GTH_in_comparisonCondition637); 
                    GTH81_tree = (CommonTree)adaptor.dupNode(GTH81);


                    root_1 = (CommonTree)adaptor.becomeRoot(GTH81_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition639);
                    expr82=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr82.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition642);
                    left_cond83=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond83.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		GreaterThan arg=new GreaterThan();
                    		arg.setLeft((left_cond83!=null?left_cond83.ret:null));
                    		arg.setRight((expr82!=null?expr82.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:268:3: ^( LEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    LEQ84=(CommonTree)match(input,LEQ,FOLLOW_LEQ_in_comparisonCondition652); 
                    LEQ84_tree = (CommonTree)adaptor.dupNode(LEQ84);


                    root_1 = (CommonTree)adaptor.becomeRoot(LEQ84_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition654);
                    expr85=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr85.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition657);
                    left_cond86=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond86.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		LessThanOrEquivalent arg=new LessThanOrEquivalent();
                    		arg.setLeft((left_cond86!=null?left_cond86.ret:null));
                    		arg.setRight((expr85!=null?expr85.valueObj:null));
                    		exp.addExpression(arg);
                    	

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:275:3: ^( GEQ expr[$where] left_cond[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    GEQ87=(CommonTree)match(input,GEQ,FOLLOW_GEQ_in_comparisonCondition667); 
                    GEQ87_tree = (CommonTree)adaptor.dupNode(GEQ87);


                    root_1 = (CommonTree)adaptor.becomeRoot(GEQ87_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_comparisonCondition669);
                    expr88=expr(where);

                    state._fsp--;

                    adaptor.addChild(root_1, expr88.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_left_cond_in_comparisonCondition672);
                    left_cond89=left_cond(where);

                    state._fsp--;

                    adaptor.addChild(root_1, left_cond89.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		GreaterThanOrEquivalent arg=new GreaterThanOrEquivalent();
                    		arg.setLeft((left_cond89!=null?left_cond89.ret:null));
                    		arg.setRight((expr88!=null?expr88.valueObj:null));
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:284:1: left_cond[BindIndexHolder where] returns [Object ret] : ^( CONDITION_LEFT expr[$where] ) ;
    public final OracleWalker.left_cond_return left_cond(BindIndexHolder where) throws RecognitionException {
        OracleWalker.left_cond_return retval = new OracleWalker.left_cond_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CONDITION_LEFT90=null;
        OracleWalker.expr_return expr91 =null;


        CommonTree CONDITION_LEFT90_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:286:2: ( ^( CONDITION_LEFT expr[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:286:3: ^( CONDITION_LEFT expr[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            CONDITION_LEFT90=(CommonTree)match(input,CONDITION_LEFT,FOLLOW_CONDITION_LEFT_in_left_cond693); 
            CONDITION_LEFT90_tree = (CommonTree)adaptor.dupNode(CONDITION_LEFT90);


            root_1 = (CommonTree)adaptor.becomeRoot(CONDITION_LEFT90_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_left_cond695);
            expr91=expr(where);

            state._fsp--;

            adaptor.addChild(root_1, expr91.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		retval.ret =(expr91!=null?expr91.valueObj:null);
            	

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:291:1: in_list[BindIndexHolder where] returns [List list] : ^( IN_LISTS inCondition_expr_adds[$where] ) ;
    public final OracleWalker.in_list_return in_list(BindIndexHolder where) throws RecognitionException {
        OracleWalker.in_list_return retval = new OracleWalker.in_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IN_LISTS92=null;
        OracleWalker.inCondition_expr_adds_return inCondition_expr_adds93 =null;


        CommonTree IN_LISTS92_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:292:2: ( ^( IN_LISTS inCondition_expr_adds[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:292:3: ^( IN_LISTS inCondition_expr_adds[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IN_LISTS92=(CommonTree)match(input,IN_LISTS,FOLLOW_IN_LISTS_in_in_list714); 
            IN_LISTS92_tree = (CommonTree)adaptor.dupNode(IN_LISTS92);


            root_1 = (CommonTree)adaptor.becomeRoot(IN_LISTS92_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_inCondition_expr_adds_in_in_list716);
            inCondition_expr_adds93=inCondition_expr_adds(where);

            state._fsp--;

            adaptor.addChild(root_1, inCondition_expr_adds93.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		retval.list =(inCondition_expr_adds93!=null?inCondition_expr_adds93.list:null);
            	

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:297:1: inCondition[BindIndexHolder where,ExpressionGroup exp] : ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] ) ;
    public final OracleWalker.inCondition_return inCondition(BindIndexHolder where, ExpressionGroup exp) throws RecognitionException {
        OracleWalker.inCondition_return retval = new OracleWalker.inCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree not=null;
        CommonTree IN94=null;
        OracleWalker.subquery_return subquery95 =null;

        OracleWalker.in_list_return in_list96 =null;

        OracleWalker.left_cond_return left_cond97 =null;


        CommonTree not_tree=null;
        CommonTree IN94_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:2: ( ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:3: ^( IN (not= 'NOT' )? ( subquery[$where] )? ( in_list[$where] )? left_cond[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            IN94=(CommonTree)match(input,IN,FOLLOW_IN_in_inCondition734); 
            IN94_tree = (CommonTree)adaptor.dupNode(IN94);


            root_1 = (CommonTree)adaptor.becomeRoot(IN94_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:11: (not= 'NOT' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==117) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:11: not= 'NOT'
                    {
                    _last = (CommonTree)input.LT(1);
                    not=(CommonTree)match(input,117,FOLLOW_117_in_inCondition738); 
                    not_tree = (CommonTree)adaptor.dupNode(not);


                    adaptor.addChild(root_1, not_tree);


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:19: ( subquery[$where] )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SUBQUERY) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:19: subquery[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_inCondition741);
                    subquery95=subquery(where);

                    state._fsp--;

                    adaptor.addChild(root_1, subquery95.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:37: ( in_list[$where] )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==IN_LISTS) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:298:37: in_list[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_in_list_in_inCondition745);
                    in_list96=in_list(where);

                    state._fsp--;

                    adaptor.addChild(root_1, in_list96.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_left_cond_in_inCondition750);
            left_cond97=left_cond(where);

            state._fsp--;

            adaptor.addChild(root_1, left_cond97.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		if((not!=null?not.getText():null)!=null){
            			if((subquery95!=null?subquery95.subselect:null)!=null){
            				NotInExpression arg=new NotInExpression();
            				arg.setLeft((left_cond97!=null?left_cond97.ret:null));
            				arg.setRight((subquery95!=null?subquery95.subselect:null));
            				exp.addExpression(arg);
            			}
            			else if((in_list96!=null?in_list96.list:null)!=null){
            					NotInExpression arg=new NotInExpression();
            					arg.setLeft((left_cond97!=null?left_cond97.ret:null));
            					arg.setRight((in_list96!=null?in_list96.list:null));
            					exp.addExpression(arg);
            			}
            		}else{
            			if((subquery95!=null?subquery95.subselect:null)!=null){
            				InExpression arg=new InExpression();
            				arg.setLeft((left_cond97!=null?left_cond97.ret:null));
            				arg.setRight((subquery95!=null?subquery95.subselect:null));
            				exp.addExpression(arg);}
            			else if((in_list96!=null?in_list96.list:null)!=null){
            					InExpression arg=new InExpression();
            					arg.setLeft((left_cond97!=null?left_cond97.ret:null));
            					arg.setRight((in_list96!=null?in_list96.list:null));
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:334:1: inCondition_expr_adds[BindIndexHolder where] returns [List list] : ( expr_add[$where] )+ ;
    public final OracleWalker.inCondition_expr_adds_return inCondition_expr_adds(BindIndexHolder where) throws RecognitionException {
        OracleWalker.inCondition_expr_adds_return retval = new OracleWalker.inCondition_expr_adds_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.expr_add_return expr_add98 =null;



        retval.list =new ArrayList();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:335:31: ( ( expr_add[$where] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:336:2: ( expr_add[$where] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:336:2: ( expr_add[$where] )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ASTERISK||(LA28_0 >= BITAND && LA28_0 <= COLUMNAST)||LA28_0==CONSIST||LA28_0==DIVIDE||LA28_0==ID||(LA28_0 >= MINUS && LA28_0 <= N)||LA28_0==NEGATIVE||LA28_0==NUMBER||LA28_0==PLUS||LA28_0==POSITIVE||LA28_0==QUTED_STR||(LA28_0 >= SHIFTLEFT && LA28_0 <= SHIFTRIGHT)||LA28_0==94||LA28_0==102||LA28_0==119||LA28_0==128) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:336:3: expr_add[$where]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_expr_add_in_inCondition_expr_adds784);
            	    expr_add98=expr_add(where);

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add98.getTree());



            	    		retval.list.add((expr_add98!=null?expr_add98.valueObjExpr:null));
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:343:1: expr[BindIndexHolder where] returns [Object valueObj] : ( expr_add[$where] | subquery[$where] ) ;
    public final OracleWalker.expr_return expr(BindIndexHolder where) throws RecognitionException {
        OracleWalker.expr_return retval = new OracleWalker.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.expr_add_return expr_add99 =null;

        OracleWalker.subquery_return subquery100 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:344:2: ( ( expr_add[$where] | subquery[$where] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:344:3: ( expr_add[$where] | subquery[$where] )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:344:3: ( expr_add[$where] | subquery[$where] )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ASTERISK||(LA29_0 >= BITAND && LA29_0 <= COLUMNAST)||LA29_0==CONSIST||LA29_0==DIVIDE||LA29_0==ID||(LA29_0 >= MINUS && LA29_0 <= N)||LA29_0==NEGATIVE||LA29_0==NUMBER||LA29_0==PLUS||LA29_0==POSITIVE||LA29_0==QUTED_STR||(LA29_0 >= SHIFTLEFT && LA29_0 <= SHIFTRIGHT)||LA29_0==94||LA29_0==102||LA29_0==119||LA29_0==128) ) {
                alt29=1;
            }
            else if ( (LA29_0==SUBQUERY) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:344:4: expr_add[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr809);
                    expr_add99=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_0, expr_add99.getTree());


                    retval.valueObj =(expr_add99!=null?expr_add99.valueObjExpr:null);

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:345:3: subquery[$where]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_expr816);
                    subquery100=subquery(where);

                    state._fsp--;

                    adaptor.addChild(root_0, subquery100.getTree());


                    retval.valueObj =(subquery100!=null?subquery100.subselect:null);

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:349:1: expr_add[BindIndexHolder where] returns [Object valueObjExpr] : ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) | ^( CAST ( expr[$where] )* ID ) );
    public final OracleWalker.expr_add_return expr_add(BindIndexHolder where) throws RecognitionException {
        OracleWalker.expr_add_return retval = new OracleWalker.expr_add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NEGATIVE101=null;
        CommonTree POSITIVE102=null;
        CommonTree PLUS103=null;
        CommonTree MINUS104=null;
        CommonTree BITOR105=null;
        CommonTree BITAND106=null;
        CommonTree BITXOR107=null;
        CommonTree SHIFTLEFT108=null;
        CommonTree SHIFTRIGHT109=null;
        CommonTree ASTERISK110=null;
        CommonTree DIVIDE111=null;
        CommonTree N112=null;
        CommonTree NUMBER113=null;
        CommonTree string_literal115=null;
        CommonTree char_literal116=null;
        CommonTree QUTED_STR117=null;
        CommonTree COLUMN119=null;
        CommonTree COLUMNAST122=null;
        CommonTree ASTERISK123=null;
        CommonTree ID124=null;
        CommonTree CONSIST126=null;
        CommonTree ID127=null;
        CommonTree CAST128=null;
        CommonTree ID130=null;
        OracleWalker.expr_add_return s1 =null;

        OracleWalker.expr_add_return s2 =null;

        OracleWalker.boolean_literal_return boolean_literal114 =null;

        OracleWalker.quoted_string_return quoted_string118 =null;

        OracleWalker.identifier_return identifier120 =null;

        OracleWalker.table_name_return table_name121 =null;

        OracleWalker.expr_return expr125 =null;

        OracleWalker.expr_return expr129 =null;


        CommonTree NEGATIVE101_tree=null;
        CommonTree POSITIVE102_tree=null;
        CommonTree PLUS103_tree=null;
        CommonTree MINUS104_tree=null;
        CommonTree BITOR105_tree=null;
        CommonTree BITAND106_tree=null;
        CommonTree BITXOR107_tree=null;
        CommonTree SHIFTLEFT108_tree=null;
        CommonTree SHIFTRIGHT109_tree=null;
        CommonTree ASTERISK110_tree=null;
        CommonTree DIVIDE111_tree=null;
        CommonTree N112_tree=null;
        CommonTree NUMBER113_tree=null;
        CommonTree string_literal115_tree=null;
        CommonTree char_literal116_tree=null;
        CommonTree QUTED_STR117_tree=null;
        CommonTree COLUMN119_tree=null;
        CommonTree COLUMNAST122_tree=null;
        CommonTree ASTERISK123_tree=null;
        CommonTree ID124_tree=null;
        CommonTree CONSIST126_tree=null;
        CommonTree ID127_tree=null;
        CommonTree CAST128_tree=null;
        CommonTree ID130_tree=null;


        List<Object> list=new ArrayList<Object>(2);

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:353:2: ( ^( NEGATIVE s1= expr_add[$where] ) | ^( POSITIVE s1= expr_add[$where] ) | ^( PLUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( MINUS s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITAND s1= expr_add[$where] s2= expr_add[$where] ) | ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] ) | ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] ) | ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] ) | ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] ) | N | NUMBER | boolean_literal | 'NULL' | '?' | ^( QUTED_STR quoted_string ) | ^( COLUMN identifier ( table_name )? ) | ^( COLUMNAST ASTERISK ) | ^( ID ( expr[$where] )* ) | ^( CONSIST ID ) | ^( CAST ( expr[$where] )* ID ) )
            int alt33=22;
            switch ( input.LA(1) ) {
            case NEGATIVE:
                {
                alt33=1;
                }
                break;
            case POSITIVE:
                {
                alt33=2;
                }
                break;
            case PLUS:
                {
                alt33=3;
                }
                break;
            case MINUS:
                {
                alt33=4;
                }
                break;
            case BITOR:
                {
                alt33=5;
                }
                break;
            case BITAND:
                {
                alt33=6;
                }
                break;
            case BITXOR:
                {
                alt33=7;
                }
                break;
            case SHIFTLEFT:
                {
                alt33=8;
                }
                break;
            case SHIFTRIGHT:
                {
                alt33=9;
                }
                break;
            case ASTERISK:
                {
                alt33=10;
                }
                break;
            case DIVIDE:
                {
                alt33=11;
                }
                break;
            case N:
                {
                alt33=12;
                }
                break;
            case NUMBER:
                {
                alt33=13;
                }
                break;
            case 102:
            case 128:
                {
                alt33=14;
                }
                break;
            case 119:
                {
                alt33=15;
                }
                break;
            case 94:
                {
                alt33=16;
                }
                break;
            case QUTED_STR:
                {
                alt33=17;
                }
                break;
            case COLUMN:
                {
                alt33=18;
                }
                break;
            case COLUMNAST:
                {
                alt33=19;
                }
                break;
            case ID:
                {
                alt33=20;
                }
                break;
            case CONSIST:
                {
                alt33=21;
                }
                break;
            case CAST:
                {
                alt33=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:353:3: ^( NEGATIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NEGATIVE101=(CommonTree)match(input,NEGATIVE,FOLLOW_NEGATIVE_in_expr_add844); 
                    NEGATIVE101_tree = (CommonTree)adaptor.dupNode(NEGATIVE101);


                    root_1 = (CommonTree)adaptor.becomeRoot(NEGATIVE101_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add848);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:356:3: ^( POSITIVE s1= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    POSITIVE102=(CommonTree)match(input,POSITIVE,FOLLOW_POSITIVE_in_expr_add857); 
                    POSITIVE102_tree = (CommonTree)adaptor.dupNode(POSITIVE102);


                    root_1 = (CommonTree)adaptor.becomeRoot(POSITIVE102_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add861);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:359:3: ^( PLUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    PLUS103=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr_add870); 
                    PLUS103_tree = (CommonTree)adaptor.dupNode(PLUS103);


                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS103_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add874);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add879);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:366:3: ^( MINUS s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    MINUS104=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr_add888); 
                    MINUS104_tree = (CommonTree)adaptor.dupNode(MINUS104);


                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS104_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add892);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add897);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:373:3: ^( BITOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BITOR105=(CommonTree)match(input,BITOR,FOLLOW_BITOR_in_expr_add905); 
                    BITOR105_tree = (CommonTree)adaptor.dupNode(BITOR105);


                    root_1 = (CommonTree)adaptor.becomeRoot(BITOR105_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add909);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add914);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:380:3: ^( BITAND s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BITAND106=(CommonTree)match(input,BITAND,FOLLOW_BITAND_in_expr_add922); 
                    BITAND106_tree = (CommonTree)adaptor.dupNode(BITAND106);


                    root_1 = (CommonTree)adaptor.becomeRoot(BITAND106_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add926);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add931);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:387:3: ^( BITXOR s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    BITXOR107=(CommonTree)match(input,BITXOR,FOLLOW_BITXOR_in_expr_add939); 
                    BITXOR107_tree = (CommonTree)adaptor.dupNode(BITXOR107);


                    root_1 = (CommonTree)adaptor.becomeRoot(BITXOR107_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add943);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add948);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:394:3: ^( SHIFTLEFT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHIFTLEFT108=(CommonTree)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_expr_add956); 
                    SHIFTLEFT108_tree = (CommonTree)adaptor.dupNode(SHIFTLEFT108);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTLEFT108_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add960);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add965);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:401:3: ^( SHIFTRIGHT s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    SHIFTRIGHT109=(CommonTree)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_expr_add973); 
                    SHIFTRIGHT109_tree = (CommonTree)adaptor.dupNode(SHIFTRIGHT109);


                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFTRIGHT109_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add977);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add982);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:408:3: ^( ASTERISK s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ASTERISK110=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add990); 
                    ASTERISK110_tree = (CommonTree)adaptor.dupNode(ASTERISK110);


                    root_1 = (CommonTree)adaptor.becomeRoot(ASTERISK110_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add994);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add999);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:415:3: ^( DIVIDE s1= expr_add[$where] s2= expr_add[$where] )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    DIVIDE111=(CommonTree)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_add1007); 
                    DIVIDE111_tree = (CommonTree)adaptor.dupNode(DIVIDE111);


                    root_1 = (CommonTree)adaptor.becomeRoot(DIVIDE111_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1011);
                    s1=expr_add(where);

                    state._fsp--;

                    adaptor.addChild(root_1, s1.getTree());


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_add_in_expr_add1016);
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
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:422:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    N112=(CommonTree)match(input,N,FOLLOW_N_in_expr_add1023); 
                    N112_tree = (CommonTree)adaptor.dupNode(N112);


                    adaptor.addChild(root_0, N112_tree);


                    retval.valueObjExpr =new BigDecimal((N112!=null?N112.getText():null));

                    }
                    break;
                case 13 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:423:3: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    NUMBER113=(CommonTree)match(input,NUMBER,FOLLOW_NUMBER_in_expr_add1029); 
                    NUMBER113_tree = (CommonTree)adaptor.dupNode(NUMBER113);


                    adaptor.addChild(root_0, NUMBER113_tree);


                    retval.valueObjExpr =new BigDecimal((NUMBER113!=null?NUMBER113.getText():null));

                    }
                    break;
                case 14 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:424:3: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_boolean_literal_in_expr_add1034);
                    boolean_literal114=boolean_literal();

                    state._fsp--;

                    adaptor.addChild(root_0, boolean_literal114.getTree());


                    }
                    break;
                case 15 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:425:3: 'NULL'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    string_literal115=(CommonTree)match(input,119,FOLLOW_119_in_expr_add1038); 
                    string_literal115_tree = (CommonTree)adaptor.dupNode(string_literal115);


                    adaptor.addChild(root_0, string_literal115_tree);


                    retval.valueObjExpr =null;

                    }
                    break;
                case 16 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:426:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    char_literal116=(CommonTree)match(input,94,FOLLOW_94_in_expr_add1044); 
                    char_literal116_tree = (CommonTree)adaptor.dupNode(char_literal116);


                    adaptor.addChild(root_0, char_literal116_tree);



                    	BindVar val=new BindVar(where.selfAddAndGet());
                    	retval.valueObjExpr =val;
                    	

                    }
                    break;
                case 17 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:430:3: ^( QUTED_STR quoted_string )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    QUTED_STR117=(CommonTree)match(input,QUTED_STR,FOLLOW_QUTED_STR_in_expr_add1050); 
                    QUTED_STR117_tree = (CommonTree)adaptor.dupNode(QUTED_STR117);


                    root_1 = (CommonTree)adaptor.becomeRoot(QUTED_STR117_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_quoted_string_in_expr_add1052);
                    quoted_string118=quoted_string();

                    state._fsp--;

                    adaptor.addChild(root_1, quoted_string118.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    retval.valueObjExpr =(quoted_string118!=null?quoted_string118.aText:null);

                    }
                    break;
                case 18 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:431:3: ^( COLUMN identifier ( table_name )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMN119=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_expr_add1059); 
                    COLUMN119_tree = (CommonTree)adaptor.dupNode(COLUMN119);


                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN119_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_expr_add1061);
                    identifier120=identifier();

                    state._fsp--;

                    adaptor.addChild(root_1, identifier120.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:431:23: ( table_name )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ID) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:431:23: table_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_name_in_expr_add1063);
                            table_name121=table_name();

                            state._fsp--;

                            adaptor.addChild(root_1, table_name121.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	Column col=new ColumnImpl((table_name121!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name121.start),input.getTreeAdaptor().getTokenStopIndex(table_name121.start))):null),(identifier120!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier120.start),input.getTreeAdaptor().getTokenStopIndex(identifier120.start))):null),null);
                    	retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 19 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:436:3: ^( COLUMNAST ASTERISK )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMNAST122=(CommonTree)match(input,COLUMNAST,FOLLOW_COLUMNAST_in_expr_add1073); 
                    COLUMNAST122_tree = (CommonTree)adaptor.dupNode(COLUMNAST122);


                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMNAST122_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ASTERISK123=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_add1075); 
                    ASTERISK123_tree = (CommonTree)adaptor.dupNode(ASTERISK123);


                    adaptor.addChild(root_1, ASTERISK123_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	Column col=new ColumnImpl(null,(ASTERISK123!=null?ASTERISK123.getText():null),null);
                    	retval.valueObjExpr =col;
                    	

                    }
                    break;
                case 20 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:441:3: ^( ID ( expr[$where] )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ID124=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1084); 
                    ID124_tree = (CommonTree)adaptor.dupNode(ID124);


                    root_1 = (CommonTree)adaptor.becomeRoot(ID124_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:442:2: ( expr[$where] )*
                        loop31:
                        do {
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==ASTERISK||(LA31_0 >= BITAND && LA31_0 <= COLUMNAST)||LA31_0==CONSIST||LA31_0==DIVIDE||LA31_0==ID||(LA31_0 >= MINUS && LA31_0 <= N)||LA31_0==NEGATIVE||LA31_0==NUMBER||LA31_0==PLUS||LA31_0==POSITIVE||LA31_0==QUTED_STR||(LA31_0 >= SHIFTLEFT && LA31_0 <= SUBQUERY)||LA31_0==94||LA31_0==102||LA31_0==119||LA31_0==128) ) {
                                alt31=1;
                            }


                            switch (alt31) {
                        	case 1 :
                        	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:442:3: expr[$where]
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_expr_add1089);
                        	    expr125=expr(where);

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr125.getTree());


                        	    list.add((expr125!=null?expr125.valueObj:null));

                        	    }
                        	    break;

                        	default :
                        	    break loop31;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	Function func=functionRegister.get(((ID124!=null?ID124.getText():null)).toUpperCase());
                    	func.setValue(list);
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 21 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:447:3: ^( CONSIST ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONSIST126=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_expr_add1100); 
                    CONSIST126_tree = (CommonTree)adaptor.dupNode(CONSIST126);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST126_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID127=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1102); 
                    ID127_tree = (CommonTree)adaptor.dupNode(ID127);


                    adaptor.addChild(root_1, ID127_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	Function func=consistStringRegister.get(((ID127!=null?ID127.getText():null)).toUpperCase());
                    	retval.valueObjExpr =func;
                    	

                    }
                    break;
                case 22 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:451:3: ^( CAST ( expr[$where] )* ID )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CAST128=(CommonTree)match(input,CAST,FOLLOW_CAST_in_expr_add1109); 
                    CAST128_tree = (CommonTree)adaptor.dupNode(CAST128);


                    root_1 = (CommonTree)adaptor.becomeRoot(CAST128_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:451:10: ( expr[$where] )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==ID) ) {
                            int LA32_1 = input.LA(2);

                            if ( (LA32_1==DOWN) ) {
                                alt32=1;
                            }


                        }
                        else if ( (LA32_0==ASTERISK||(LA32_0 >= BITAND && LA32_0 <= COLUMNAST)||LA32_0==CONSIST||LA32_0==DIVIDE||(LA32_0 >= MINUS && LA32_0 <= N)||LA32_0==NEGATIVE||LA32_0==NUMBER||LA32_0==PLUS||LA32_0==POSITIVE||LA32_0==QUTED_STR||(LA32_0 >= SHIFTLEFT && LA32_0 <= SUBQUERY)||LA32_0==94||LA32_0==102||LA32_0==119||LA32_0==128) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:451:11: expr[$where]
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expr_in_expr_add1112);
                    	    expr129=expr(where);

                    	    state._fsp--;

                    	    adaptor.addChild(root_1, expr129.getTree());


                    	    list.add((expr129!=null?expr129.valueObj:null));

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    _last = (CommonTree)input.LT(1);
                    ID130=(CommonTree)match(input,ID,FOLLOW_ID_in_expr_add1118); 
                    ID130_tree = (CommonTree)adaptor.dupNode(ID130);


                    adaptor.addChild(root_1, ID130_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	//list.add("vartabletype");
                    	Cast func= new Cast();
                    	func.setType((ID130!=null?ID130.getText():null));
                    	func.setValue(list);
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


    public static class value_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:459:1: value : ( N | NUMBER | '?' );
    public final OracleWalker.value_return value() throws RecognitionException {
        OracleWalker.value_return retval = new OracleWalker.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set131=null;

        CommonTree set131_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:459:7: ( N | NUMBER | '?' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            set131=(CommonTree)input.LT(1);

            if ( input.LA(1)==N||input.LA(1)==NUMBER||input.LA(1)==94 ) {
                input.consume();
                set131_tree = (CommonTree)adaptor.dupNode(set131);


                adaptor.addChild(root_0, set131_tree);

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:464:1: boolean_literal returns [Object valueObj] : (s1= 'TRUE' |s1= 'FALSE' );
    public final OracleWalker.boolean_literal_return boolean_literal() throws RecognitionException {
        OracleWalker.boolean_literal_return retval = new OracleWalker.boolean_literal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree s1=null;

        CommonTree s1_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:465:2: (s1= 'TRUE' |s1= 'FALSE' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==128) ) {
                alt34=1;
            }
            else if ( (LA34_0==102) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:465:3: s1= 'TRUE'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,128,FOLLOW_128_in_boolean_literal1152); 
                    s1_tree = (CommonTree)adaptor.dupNode(s1);


                    adaptor.addChild(root_0, s1_tree);


                    retval.valueObj =Boolean.parseBoolean((s1!=null?s1.getText():null));

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:466:4: s1= 'FALSE'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    s1=(CommonTree)match(input,102,FOLLOW_102_in_boolean_literal1161); 
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:470:1: select_list[Select select] : ^( SELECT_LIST ( displayed_column[$select] )+ ) ;
    public final OracleWalker.select_list_return select_list(Select select) throws RecognitionException {
        OracleWalker.select_list_return retval = new OracleWalker.select_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT_LIST132=null;
        OracleWalker.displayed_column_return displayed_column133 =null;


        CommonTree SELECT_LIST132_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:471:2: ( ^( SELECT_LIST ( displayed_column[$select] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:471:3: ^( SELECT_LIST ( displayed_column[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT_LIST132=(CommonTree)match(input,SELECT_LIST,FOLLOW_SELECT_LIST_in_select_list1177); 
            SELECT_LIST132_tree = (CommonTree)adaptor.dupNode(SELECT_LIST132);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT_LIST132_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:471:17: ( displayed_column[$select] )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COLUMN||LA35_0==CONSIST||LA35_0==ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:471:17: displayed_column[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_displayed_column_in_select_list1179);
            	    displayed_column133=displayed_column(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, displayed_column133.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
    // $ANTLR end "select_list"


    public static class fromClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:473:1: fromClause[Select select] : ^( TABLENAMES ( table[$select] )+ ) ;
    public final OracleWalker.fromClause_return fromClause(Select select) throws RecognitionException {
        OracleWalker.fromClause_return retval = new OracleWalker.fromClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES134=null;
        OracleWalker.table_return table135 =null;


        CommonTree TABLENAMES134_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:474:2: ( ^( TABLENAMES ( table[$select] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:474:3: ^( TABLENAMES ( table[$select] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLENAMES134=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_fromClause1194); 
            TABLENAMES134_tree = (CommonTree)adaptor.dupNode(TABLENAMES134);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES134_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:474:16: ( table[$select] )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==TABLENAME) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:474:16: table[$select]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_fromClause1196);
            	    table135=table(select);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table135.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:476:1: join_clause[DMLCommon common] returns [JoinClause joinClause] : ^( JOIN table_name ( alias )? temp1= join_column temp2= join_column ( join_type )? ) ;
    public final OracleWalker.join_clause_return join_clause(DMLCommon common) throws RecognitionException {
        OracleWalker.join_clause_return retval = new OracleWalker.join_clause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree JOIN136=null;
        OracleWalker.join_column_return temp1 =null;

        OracleWalker.join_column_return temp2 =null;

        OracleWalker.table_name_return table_name137 =null;

        OracleWalker.alias_return alias138 =null;

        OracleWalker.join_type_return join_type139 =null;


        CommonTree JOIN136_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:477:2: ( ^( JOIN table_name ( alias )? temp1= join_column temp2= join_column ( join_type )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:477:3: ^( JOIN table_name ( alias )? temp1= join_column temp2= join_column ( join_type )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            JOIN136=(CommonTree)match(input,JOIN,FOLLOW_JOIN_in_join_clause1214); 
            JOIN136_tree = (CommonTree)adaptor.dupNode(JOIN136);


            root_1 = (CommonTree)adaptor.becomeRoot(JOIN136_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_name_in_join_clause1216);
            table_name137=table_name();

            state._fsp--;

            adaptor.addChild(root_1, table_name137.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:477:21: ( alias )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==AS) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:477:21: alias
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_alias_in_join_clause1218);
                    alias138=alias();

                    state._fsp--;

                    adaptor.addChild(root_1, alias138.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_join_column_in_join_clause1223);
            temp1=join_column();

            state._fsp--;

            adaptor.addChild(root_1, temp1.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_join_column_in_join_clause1227);
            temp2=join_column();

            state._fsp--;

            adaptor.addChild(root_1, temp2.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:477:64: ( join_type )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==CROSS||LA38_0==FULL||LA38_0==INNER||LA38_0==LEFT||LA38_0==RIGHT||LA38_0==UNION) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:477:64: join_type
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_join_type_in_join_clause1229);
                    join_type139=join_type();

                    state._fsp--;

                    adaptor.addChild(root_1, join_type139.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		retval.joinClause = new JoinClause();
            		TableNameImpl tableName = new TableNameImpl();
            		tableName.setTablename((table_name137!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name137.start),input.getTreeAdaptor().getTokenStopIndex(table_name137.start))):null));
            		tableName.setAlias((alias138!=null?alias138.aliText:null));
            		retval.joinClause.setTableName(tableName);
            		retval.joinClause.setLeftCondition((temp1!=null?temp1.col:null));
            		retval.joinClause.setRightCondition((temp2!=null?temp2.col:null));
            		retval.joinClause.setJoinType((join_type139!=null?join_type139.joinType:null));
            	

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


    public static class join_type_return extends TreeRuleReturnScope {
        public JoinType joinType;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_type"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:490:1: join_type returns [JoinType joinType] : ( INNER | LEFT ( outer )? | RIGHT ( outer )? | FULL ( outer )? | UNION | CROSS );
    public final OracleWalker.join_type_return join_type() throws RecognitionException {
        OracleWalker.join_type_return retval = new OracleWalker.join_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INNER140=null;
        CommonTree LEFT141=null;
        CommonTree RIGHT143=null;
        CommonTree FULL145=null;
        CommonTree UNION147=null;
        CommonTree CROSS148=null;
        OracleWalker.outer_return outer142 =null;

        OracleWalker.outer_return outer144 =null;

        OracleWalker.outer_return outer146 =null;


        CommonTree INNER140_tree=null;
        CommonTree LEFT141_tree=null;
        CommonTree RIGHT143_tree=null;
        CommonTree FULL145_tree=null;
        CommonTree UNION147_tree=null;
        CommonTree CROSS148_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:491:2: ( INNER | LEFT ( outer )? | RIGHT ( outer )? | FULL ( outer )? | UNION | CROSS )
            int alt42=6;
            switch ( input.LA(1) ) {
            case INNER:
                {
                alt42=1;
                }
                break;
            case LEFT:
                {
                alt42=2;
                }
                break;
            case RIGHT:
                {
                alt42=3;
                }
                break;
            case FULL:
                {
                alt42=4;
                }
                break;
            case UNION:
                {
                alt42=5;
                }
                break;
            case CROSS:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:491:3: INNER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    INNER140=(CommonTree)match(input,INNER,FOLLOW_INNER_in_join_type1248); 
                    INNER140_tree = (CommonTree)adaptor.dupNode(INNER140);


                    adaptor.addChild(root_0, INNER140_tree);



                    		retval.joinType = JoinType.INNER;
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:495:3: LEFT ( outer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    LEFT141=(CommonTree)match(input,LEFT,FOLLOW_LEFT_in_join_type1256); 
                    LEFT141_tree = (CommonTree)adaptor.dupNode(LEFT141);


                    adaptor.addChild(root_0, LEFT141_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:495:8: ( outer )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==OUTER) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:495:8: outer
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_outer_in_join_type1258);
                            outer142=outer();

                            state._fsp--;

                            adaptor.addChild(root_0, outer142.getTree());


                            }
                            break;

                    }



                    		boolean outter = (outer142!=null?outer142.outter:false);
                    		if(outter){
                    			retval.joinType = JoinType.LEFT_OUTER;
                    		}else{
                    			retval.joinType = JoinType.LEFT;
                    		}
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:504:3: RIGHT ( outer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    RIGHT143=(CommonTree)match(input,RIGHT,FOLLOW_RIGHT_in_join_type1266); 
                    RIGHT143_tree = (CommonTree)adaptor.dupNode(RIGHT143);


                    adaptor.addChild(root_0, RIGHT143_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:504:9: ( outer )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==OUTER) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:504:9: outer
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_outer_in_join_type1268);
                            outer144=outer();

                            state._fsp--;

                            adaptor.addChild(root_0, outer144.getTree());


                            }
                            break;

                    }



                    		boolean outter = (outer144!=null?outer144.outter:false);
                    		if(outter){
                    			retval.joinType = JoinType.RIGHT_OUTER;
                    		}else{
                    			retval.joinType = JoinType.RIGHT;
                    		}
                    	

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:513:3: FULL ( outer )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    FULL145=(CommonTree)match(input,FULL,FOLLOW_FULL_in_join_type1276); 
                    FULL145_tree = (CommonTree)adaptor.dupNode(FULL145);


                    adaptor.addChild(root_0, FULL145_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:513:8: ( outer )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==OUTER) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:513:8: outer
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_outer_in_join_type1278);
                            outer146=outer();

                            state._fsp--;

                            adaptor.addChild(root_0, outer146.getTree());


                            }
                            break;

                    }



                    		boolean outter = (outer146!=null?outer146.outter:false);
                    		if(outter){
                    			retval.joinType = JoinType.FULL_OUTER;
                    		}else{
                    			retval.joinType = JoinType.FULL;
                    		}
                    	

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:522:3: UNION
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    UNION147=(CommonTree)match(input,UNION,FOLLOW_UNION_in_join_type1287); 
                    UNION147_tree = (CommonTree)adaptor.dupNode(UNION147);


                    adaptor.addChild(root_0, UNION147_tree);



                    		retval.joinType = JoinType.UNION;
                    	

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:526:3: CROSS
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    CROSS148=(CommonTree)match(input,CROSS,FOLLOW_CROSS_in_join_type1295); 
                    CROSS148_tree = (CommonTree)adaptor.dupNode(CROSS148);


                    adaptor.addChild(root_0, CROSS148_tree);



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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:531:1: outer returns [boolean outter] : OUTER ;
    public final OracleWalker.outer_return outer() throws RecognitionException {
        OracleWalker.outer_return retval = new OracleWalker.outer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OUTER149=null;

        CommonTree OUTER149_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:532:2: ( OUTER )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:532:3: OUTER
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            OUTER149=(CommonTree)match(input,OUTER,FOLLOW_OUTER_in_outer1312); 
            OUTER149_tree = (CommonTree)adaptor.dupNode(OUTER149);


            adaptor.addChild(root_0, OUTER149_tree);



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


    public static class join_column_return extends TreeRuleReturnScope {
        public Column col;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_column"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:537:1: join_column returns [Column col] : ^( COLUMN identifier ( table_name )? ) ;
    public final OracleWalker.join_column_return join_column() throws RecognitionException {
        OracleWalker.join_column_return retval = new OracleWalker.join_column_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COLUMN150=null;
        OracleWalker.identifier_return identifier151 =null;

        OracleWalker.table_name_return table_name152 =null;


        CommonTree COLUMN150_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:538:2: ( ^( COLUMN identifier ( table_name )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:538:3: ^( COLUMN identifier ( table_name )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COLUMN150=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_join_column1328); 
            COLUMN150_tree = (CommonTree)adaptor.dupNode(COLUMN150);


            root_1 = (CommonTree)adaptor.becomeRoot(COLUMN150_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_join_column1330);
            identifier151=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier151.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:538:23: ( table_name )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:538:23: table_name
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_join_column1332);
                    table_name152=table_name();

                    state._fsp--;

                    adaptor.addChild(root_1, table_name152.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		    retval.col =new ColumnImpl((table_name152!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name152.start),input.getTreeAdaptor().getTokenStopIndex(table_name152.start))):null),(identifier151!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier151.start),input.getTreeAdaptor().getTokenStopIndex(identifier151.start))):null),null);
            			
            		

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


    public static class table_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:544:1: table[DMLCommon common] : ^( TABLENAME table_spec[$common] ( join_clause[$common] )? ) ;
    public final OracleWalker.table_return table(DMLCommon common) throws RecognitionException {
        OracleWalker.table_return retval = new OracleWalker.table_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAME153=null;
        OracleWalker.table_spec_return table_spec154 =null;

        OracleWalker.join_clause_return join_clause155 =null;


        CommonTree TABLENAME153_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:545:2: ( ^( TABLENAME table_spec[$common] ( join_clause[$common] )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:545:3: ^( TABLENAME table_spec[$common] ( join_clause[$common] )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLENAME153=(CommonTree)match(input,TABLENAME,FOLLOW_TABLENAME_in_table1352); 
            TABLENAME153_tree = (CommonTree)adaptor.dupNode(TABLENAME153);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAME153_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_table_spec_in_table1354);
            table_spec154=table_spec(common);

            state._fsp--;

            adaptor.addChild(root_1, table_spec154.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:545:35: ( join_clause[$common] )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==JOIN) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:545:35: join_clause[$common]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_join_clause_in_table1357);
                    join_clause155=join_clause(common);

                    state._fsp--;

                    adaptor.addChild(root_1, join_clause155.getTree());


                    }
                    break;

            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		TableName tableName = (table_spec154!=null?table_spec154.tableName:null);
            		tableName.setJoinClause((join_clause155!=null?join_clause155.joinClause:null));
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:552:1: tables[DMLCommon common] : ^( TABLENAMES ( table[$common] )+ ) ;
    public final OracleWalker.tables_return tables(DMLCommon common) throws RecognitionException {
        OracleWalker.tables_return retval = new OracleWalker.tables_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TABLENAMES156=null;
        OracleWalker.table_return table157 =null;


        CommonTree TABLENAMES156_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:553:2: ( ^( TABLENAMES ( table[$common] )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:553:3: ^( TABLENAMES ( table[$common] )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            TABLENAMES156=(CommonTree)match(input,TABLENAMES,FOLLOW_TABLENAMES_in_tables1374); 
            TABLENAMES156_tree = (CommonTree)adaptor.dupNode(TABLENAMES156);


            root_1 = (CommonTree)adaptor.becomeRoot(TABLENAMES156_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:553:16: ( table[$common] )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==TABLENAME) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:553:16: table[$common]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_table_in_tables1376);
            	    table157=table(common);

            	    state._fsp--;

            	    adaptor.addChild(root_1, table157.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:555:1: table_spec[DMLCommon common] returns [TableName tableName] : ( ( schema_name )? table_name ( alias )? | subquery[$common.getIndexHolder()] ( alias )? | ^( ID ( expr[$common.getIndexHolder()] ) ) ( alias )? );
    public final OracleWalker.table_spec_return table_spec(DMLCommon common) throws RecognitionException {
        OracleWalker.table_spec_return retval = new OracleWalker.table_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID163=null;
        OracleWalker.schema_name_return schema_name158 =null;

        OracleWalker.table_name_return table_name159 =null;

        OracleWalker.alias_return alias160 =null;

        OracleWalker.subquery_return subquery161 =null;

        OracleWalker.alias_return alias162 =null;

        OracleWalker.expr_return expr164 =null;

        OracleWalker.alias_return alias165 =null;


        CommonTree ID163_tree=null;


        	List<Object> list=new ArrayList<Object>(2);
        	
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:559:2: ( ( schema_name )? table_name ( alias )? | subquery[$common.getIndexHolder()] ( alias )? | ^( ID ( expr[$common.getIndexHolder()] ) ) ( alias )? )
            int alt50=3;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ID) ) {
                int LA50_1 = input.LA(2);

                if ( (LA50_1==DOWN) ) {
                    alt50=3;
                }
                else if ( (LA50_1==UP||LA50_1==AS||LA50_1==ID||LA50_1==JOIN) ) {
                    alt50=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA50_0==SUBQUERY) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }
            switch (alt50) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:559:3: ( schema_name )? table_name ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:559:3: ( schema_name )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==ID) ) {
                        int LA46_1 = input.LA(2);

                        if ( (LA46_1==ID) ) {
                            alt46=1;
                        }
                    }
                    switch (alt46) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:559:5: schema_name
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_schema_name_in_table_spec1400);
                            schema_name158=schema_name();

                            state._fsp--;

                            adaptor.addChild(root_0, schema_name158.getTree());


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_table_name_in_table_spec1404);
                    table_name159=table_name();

                    state._fsp--;

                    adaptor.addChild(root_0, table_name159.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:559:31: ( alias )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==AS) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:559:31: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1407);
                            alias160=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias160.getTree());


                            }
                            break;

                    }



                    		retval.tableName = getTableNameAndSchemaName((table_name159!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(table_name159.start),input.getTreeAdaptor().getTokenStopIndex(table_name159.start))):null),(schema_name158!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(schema_name158.start),input.getTreeAdaptor().getTokenStopIndex(schema_name158.start))):null),(alias160!=null?alias160.aliText:null), true);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:563:3: subquery[$common.getIndexHolder()] ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_subquery_in_table_spec1415);
                    subquery161=subquery(common.getIndexHolder());

                    state._fsp--;

                    adaptor.addChild(root_0, subquery161.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:563:38: ( alias )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==AS) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:563:38: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1418);
                            alias162=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias162.getTree());


                            }
                            break;

                    }



                    		retval.tableName = getTableSubQuery((subquery161!=null?subquery161.subselect:null),(alias162!=null?alias162.aliText:null), true);

                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:568:3: ^( ID ( expr[$common.getIndexHolder()] ) ) ( alias )?
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ID163=(CommonTree)match(input,ID,FOLLOW_ID_in_table_spec1427); 
                    ID163_tree = (CommonTree)adaptor.dupNode(ID163);


                    root_1 = (CommonTree)adaptor.becomeRoot(ID163_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:568:8: ( expr[$common.getIndexHolder()] )
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:568:9: expr[$common.getIndexHolder()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_table_spec1430);
                    expr164=expr(common.getIndexHolder());

                    state._fsp--;

                    adaptor.addChild(root_1, expr164.getTree());


                    list.add((expr164!=null?expr164.valueObj:null));

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:568:70: ( alias )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AS) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:568:70: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_table_spec1437);
                            alias165=alias();

                            state._fsp--;

                            adaptor.addChild(root_0, alias165.getTree());


                            }
                            break;

                    }



                    		Function func=functionRegister.get(((ID163!=null?ID163.getText():null)).toUpperCase());
                    		func.setValue(list);
                    		retval.tableName = getTableFunction(func,(alias165!=null?alias165.aliText:null), true);
                    	

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:576:1: schema_name : identifier ;
    public final OracleWalker.schema_name_return schema_name() throws RecognitionException {
        OracleWalker.schema_name_return retval = new OracleWalker.schema_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.identifier_return identifier166 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:577:2: ( identifier )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:577:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_schema_name1452);
            identifier166=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier166.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:579:1: subquery[BindIndexHolder holder] returns [Select subselect] : ^( SUBQUERY select_command[$holder] ) ;
    public final OracleWalker.subquery_return subquery(BindIndexHolder holder) throws RecognitionException {
        OracleWalker.subquery_return retval = new OracleWalker.subquery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SUBQUERY167=null;
        OracleWalker.select_command_return select_command168 =null;


        CommonTree SUBQUERY167_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:579:60: ( ^( SUBQUERY select_command[$holder] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:580:2: ^( SUBQUERY select_command[$holder] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SUBQUERY167=(CommonTree)match(input,SUBQUERY,FOLLOW_SUBQUERY_in_subquery1467); 
            SUBQUERY167_tree = (CommonTree)adaptor.dupNode(SUBQUERY167);


            root_1 = (CommonTree)adaptor.becomeRoot(SUBQUERY167_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_command_in_subquery1469);
            select_command168=select_command(holder);

            state._fsp--;

            adaptor.addChild(root_1, select_command168.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	retval.subselect =(select_command168!=null?select_command168.select:null);
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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:586:1: table_name : identifier ;
    public final OracleWalker.table_name_return table_name() throws RecognitionException {
        OracleWalker.table_name_return retval = new OracleWalker.table_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.identifier_return identifier169 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:587:2: ( identifier )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:587:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_name1484);
            identifier169=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier169.getTree());


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


    public static class displayed_column_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "displayed_column"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:589:1: displayed_column[Select select] : ( ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) );
    public final OracleWalker.displayed_column_return displayed_column(Select select) throws RecognitionException {
        OracleWalker.displayed_column_return retval = new OracleWalker.displayed_column_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID170=null;
        CommonTree CONSIST173=null;
        CommonTree ID174=null;
        CommonTree COLUMN176=null;
        OracleWalker.expr_return expr171 =null;

        OracleWalker.alias_return alias172 =null;

        OracleWalker.alias_return alias175 =null;

        OracleWalker.table_alias_return table_alias177 =null;

        OracleWalker.columnAnt_return columnAnt178 =null;

        OracleWalker.alias_return alias179 =null;


        CommonTree ID170_tree=null;
        CommonTree CONSIST173_tree=null;
        CommonTree ID174_tree=null;
        CommonTree COLUMN176_tree=null;


        List<Object> list=new ArrayList<Object>(10);

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:593:2: ( ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* ) | ^( CONSIST ID ( alias )? ) | ^( COLUMN ( table_alias )? columnAnt ( alias )? ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt56=1;
                }
                break;
            case CONSIST:
                {
                alt56=2;
                }
                break;
            case COLUMN:
                {
                alt56=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }

            switch (alt56) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:594:2: ^( ID ( expr[$select.getIndexHolder()] ( alias )? )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    ID170=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1502); 
                    ID170_tree = (CommonTree)adaptor.dupNode(ID170);


                    root_1 = (CommonTree)adaptor.becomeRoot(ID170_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:594:8: ( expr[$select.getIndexHolder()] ( alias )? )*
                        loop52:
                        do {
                            int alt52=2;
                            int LA52_0 = input.LA(1);

                            if ( (LA52_0==ASTERISK||(LA52_0 >= BITAND && LA52_0 <= COLUMNAST)||LA52_0==CONSIST||LA52_0==DIVIDE||LA52_0==ID||(LA52_0 >= MINUS && LA52_0 <= N)||LA52_0==NEGATIVE||LA52_0==NUMBER||LA52_0==PLUS||LA52_0==POSITIVE||LA52_0==QUTED_STR||(LA52_0 >= SHIFTLEFT && LA52_0 <= SUBQUERY)||LA52_0==94||LA52_0==102||LA52_0==119||LA52_0==128) ) {
                                alt52=1;
                            }


                            switch (alt52) {
                        	case 1 :
                        	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:594:9: expr[$select.getIndexHolder()] ( alias )?
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expr_in_displayed_column1506);
                        	    expr171=expr(select.getIndexHolder());

                        	    state._fsp--;

                        	    adaptor.addChild(root_1, expr171.getTree());


                        	    list.add((expr171!=null?expr171.valueObj:null));

                        	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:594:67: ( alias )?
                        	    int alt51=2;
                        	    int LA51_0 = input.LA(1);

                        	    if ( (LA51_0==AS) ) {
                        	        alt51=1;
                        	    }
                        	    switch (alt51) {
                        	        case 1 :
                        	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:594:67: alias
                        	            {
                        	            _last = (CommonTree)input.LT(1);
                        	            pushFollow(FOLLOW_alias_in_displayed_column1510);
                        	            alias172=alias();

                        	            state._fsp--;

                        	            adaptor.addChild(root_1, alias172.getTree());


                        	            }
                        	            break;

                        	    }


                        	    }
                        	    break;

                        	default :
                        	    break loop52;
                            }
                        } while (true);


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	Function func=functionRegister.get(((ID170!=null?ID170.getText():null)).toUpperCase());
                    	func.setValue(list);
                    	FunctionColumn funcolumn=new FunctionColumn();
                    	funcolumn.setFunction(func);
                    	funcolumn.setAlias((alias172!=null?alias172.aliText:null));
                    	select.addColumn(funcolumn);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:602:3: ^( CONSIST ID ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    CONSIST173=(CommonTree)match(input,CONSIST,FOLLOW_CONSIST_in_displayed_column1522); 
                    CONSIST173_tree = (CommonTree)adaptor.dupNode(CONSIST173);


                    root_1 = (CommonTree)adaptor.becomeRoot(CONSIST173_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    ID174=(CommonTree)match(input,ID,FOLLOW_ID_in_displayed_column1524); 
                    ID174_tree = (CommonTree)adaptor.dupNode(ID174);


                    adaptor.addChild(root_1, ID174_tree);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:602:16: ( alias )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==AS) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:602:16: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1526);
                            alias175=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias175.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    	Function func=consistStringRegister.get(((ID174!=null?ID174.getText():null)).toUpperCase());
                    	FunctionColumn funcolumn=new FunctionColumn();
                    	funcolumn.setFunction(func);
                    	funcolumn.setAlias((alias175!=null?alias175.aliText:null));
                    	select.addColumn(funcolumn);
                    	

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:609:3: ^( COLUMN ( table_alias )? columnAnt ( alias )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    COLUMN176=(CommonTree)match(input,COLUMN,FOLLOW_COLUMN_in_displayed_column1534); 
                    COLUMN176_tree = (CommonTree)adaptor.dupNode(COLUMN176);


                    root_1 = (CommonTree)adaptor.becomeRoot(COLUMN176_tree, root_1);


                    match(input, Token.DOWN, null); 
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:609:12: ( table_alias )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==COL_TAB) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:609:12: table_alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_table_alias_in_displayed_column1536);
                            table_alias177=table_alias();

                            state._fsp--;

                            adaptor.addChild(root_1, table_alias177.getTree());


                            }
                            break;

                    }


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_columnAnt_in_displayed_column1539);
                    columnAnt178=columnAnt();

                    state._fsp--;

                    adaptor.addChild(root_1, columnAnt178.getTree());


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:609:35: ( alias )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==AS) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:609:35: alias
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_alias_in_displayed_column1541);
                            alias179=alias();

                            state._fsp--;

                            adaptor.addChild(root_1, alias179.getTree());


                            }
                            break;

                    }


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    select.addColumn((table_alias177!=null?table_alias177.aText:null),(columnAnt178!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(columnAnt178.start),input.getTreeAdaptor().getTokenStopIndex(columnAnt178.start))):null),(alias179!=null?alias179.aliText:null));

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:614:1: columnAnt returns [String aText] : ( ASTERISK | N | identifier );
    public final OracleWalker.columnAnt_return columnAnt() throws RecognitionException {
        OracleWalker.columnAnt_return retval = new OracleWalker.columnAnt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASTERISK180=null;
        CommonTree N181=null;
        OracleWalker.identifier_return identifier182 =null;


        CommonTree ASTERISK180_tree=null;
        CommonTree N181_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:615:2: ( ASTERISK | N | identifier )
            int alt57=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt57=1;
                }
                break;
            case N:
                {
                alt57=2;
                }
                break;
            case ID:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:615:3: ASTERISK
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    ASTERISK180=(CommonTree)match(input,ASTERISK,FOLLOW_ASTERISK_in_columnAnt1565); 
                    ASTERISK180_tree = (CommonTree)adaptor.dupNode(ASTERISK180);


                    adaptor.addChild(root_0, ASTERISK180_tree);


                    retval.aText =(ASTERISK180!=null?ASTERISK180.getText():null);

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:616:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    N181=(CommonTree)match(input,N,FOLLOW_N_in_columnAnt1571); 
                    N181_tree = (CommonTree)adaptor.dupNode(N181);


                    adaptor.addChild(root_0, N181_tree);


                    retval.aText =(N181!=null?N181.getText():null);

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:617:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_identifier_in_columnAnt1577);
                    identifier182=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier182.getTree());


                    retval.aText =(identifier182!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier182.start),input.getTreeAdaptor().getTokenStopIndex(identifier182.start))):null);

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
        public String aText;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quoted_string"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:620:1: quoted_string returns [String aText] : QUOTED_STRING ;
    public final OracleWalker.quoted_string_return quoted_string() throws RecognitionException {
        OracleWalker.quoted_string_return retval = new OracleWalker.quoted_string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUOTED_STRING183=null;

        CommonTree QUOTED_STRING183_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:621:2: ( QUOTED_STRING )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:621:4: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            QUOTED_STRING183=(CommonTree)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_quoted_string1593); 
            QUOTED_STRING183_tree = (CommonTree)adaptor.dupNode(QUOTED_STRING183);


            adaptor.addChild(root_0, QUOTED_STRING183_tree);


            retval.aText = (QUOTED_STRING183!=null?QUOTED_STRING183.getText():null).substring(1, (QUOTED_STRING183!=null?QUOTED_STRING183.getText():null).length() - 1);

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:624:1: identifier : ID ;
    public final OracleWalker.identifier_return identifier() throws RecognitionException {
        OracleWalker.identifier_return retval = new OracleWalker.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID184=null;

        CommonTree ID184_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:625:2: ( ID )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:625:3: ID
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            ID184=(CommonTree)match(input,ID,FOLLOW_ID_in_identifier1605); 
            ID184_tree = (CommonTree)adaptor.dupNode(ID184);


            adaptor.addChild(root_0, ID184_tree);


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:627:1: table_alias returns [String aText] : ^( COL_TAB identifier ) ;
    public final OracleWalker.table_alias_return table_alias() throws RecognitionException {
        OracleWalker.table_alias_return retval = new OracleWalker.table_alias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree COL_TAB185=null;
        OracleWalker.identifier_return identifier186 =null;


        CommonTree COL_TAB185_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:628:2: ( ^( COL_TAB identifier ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:628:3: ^( COL_TAB identifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            COL_TAB185=(CommonTree)match(input,COL_TAB,FOLLOW_COL_TAB_in_table_alias1622); 
            COL_TAB185_tree = (CommonTree)adaptor.dupNode(COL_TAB185);


            root_1 = (CommonTree)adaptor.becomeRoot(COL_TAB185_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_table_alias1624);
            identifier186=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier186.getTree());


            retval.aText =(identifier186!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier186.start),input.getTreeAdaptor().getTokenStopIndex(identifier186.start))):null);

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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:631:1: alias returns [String aliText] : ^( AS identifier ) ;
    public final OracleWalker.alias_return alias() throws RecognitionException {
        OracleWalker.alias_return retval = new OracleWalker.alias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AS187=null;
        OracleWalker.identifier_return identifier188 =null;


        CommonTree AS187_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:632:2: ( ^( AS identifier ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:632:3: ^( AS identifier )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            AS187=(CommonTree)match(input,AS,FOLLOW_AS_in_alias1643); 
            AS187_tree = (CommonTree)adaptor.dupNode(AS187);


            root_1 = (CommonTree)adaptor.becomeRoot(AS187_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_identifier_in_alias1645);
            identifier188=identifier();

            state._fsp--;

            adaptor.addChild(root_1, identifier188.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            retval.aliText =(identifier188!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier188.start),input.getTreeAdaptor().getTokenStopIndex(identifier188.start))):null);

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


    public static class selectClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:638:1: selectClause[Select select] : ^( SELECT ( indexClause[select] )? select_list[$select] ) ;
    public final OracleWalker.selectClause_return selectClause(Select select) throws RecognitionException {
        OracleWalker.selectClause_return retval = new OracleWalker.selectClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SELECT189=null;
        OracleWalker.indexClause_return indexClause190 =null;

        OracleWalker.select_list_return select_list191 =null;


        CommonTree SELECT189_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:639:5: ( ^( SELECT ( indexClause[select] )? select_list[$select] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:639:6: ^( SELECT ( indexClause[select] )? select_list[$select] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            SELECT189=(CommonTree)match(input,SELECT,FOLLOW_SELECT_in_selectClause1666); 
            SELECT189_tree = (CommonTree)adaptor.dupNode(SELECT189);


            root_1 = (CommonTree)adaptor.becomeRoot(SELECT189_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:639:15: ( indexClause[select] )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==ID) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:639:15: indexClause[select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_selectClause1668);
                    indexClause190=indexClause(select);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause190.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_select_list_in_selectClause1672);
            select_list191=select_list(select);

            state._fsp--;

            adaptor.addChild(root_1, select_list191.getTree());


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


    public static class indexClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "indexClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:642:1: indexClause[DMLCommon dmlCommon] : ( hints[$dmlCommon] )+ ;
    public final OracleWalker.indexClause_return indexClause(DMLCommon dmlCommon) throws RecognitionException {
        OracleWalker.indexClause_return retval = new OracleWalker.indexClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.hints_return hints192 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:643:2: ( ( hints[$dmlCommon] )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:643:3: ( hints[$dmlCommon] )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:643:3: ( hints[$dmlCommon] )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==ID) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:643:3: hints[$dmlCommon]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_hints_in_indexClause1691);
            	    hints192=hints(dmlCommon);

            	    state._fsp--;

            	    adaptor.addChild(root_0, hints192.getTree());


            	    }
            	    break;

            	default :
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
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
    // $ANTLR end "indexClause"


    public static class hints_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hints"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:646:1: hints[DMLCommon dmlCommon] : ^( ID ( identifier )* ) ;
    public final OracleWalker.hints_return hints(DMLCommon dmlCommon) throws RecognitionException {
        OracleWalker.hints_return retval = new OracleWalker.hints_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ID193=null;
        OracleWalker.identifier_return identifier194 =null;


        CommonTree ID193_tree=null;


        	List<String> list=new ArrayList<String>();
        	
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:650:2: ( ^( ID ( identifier )* ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:650:3: ^( ID ( identifier )* )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            ID193=(CommonTree)match(input,ID,FOLLOW_ID_in_hints1711); 
            ID193_tree = (CommonTree)adaptor.dupNode(ID193);


            root_1 = (CommonTree)adaptor.becomeRoot(ID193_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:650:9: ( identifier )*
                loop60:
                do {
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ID) ) {
                        alt60=1;
                    }


                    switch (alt60) {
                	case 1 :
                	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:650:10: identifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_identifier_in_hints1715);
                	    identifier194=identifier();

                	    state._fsp--;

                	    adaptor.addChild(root_1, identifier194.getTree());


                	    list.add(((identifier194!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(identifier194.start),input.getTreeAdaptor().getTokenStopIndex(identifier194.start))):null)));

                	    }
                	    break;

                	default :
                	    break loop60;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            	HintSetter hint=hintRegister.get(((ID193!=null?ID193.getText():null)).toUpperCase());
            	hint.addHint(list);
            	dmlCommon.addHint(hint);
            	

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
    // $ANTLR end "hints"


    public static class select_command_return extends TreeRuleReturnScope {
        public Select select;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:657:1: select_command[BindIndexHolder holder] returns [Select select] : selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( for_update[$select] )? ;
    public final OracleWalker.select_command_return select_command(BindIndexHolder holder) throws RecognitionException {
        OracleWalker.select_command_return retval = new OracleWalker.select_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        OracleWalker.selectClause_return selectClause195 =null;

        OracleWalker.fromClause_return fromClause196 =null;

        OracleWalker.whereClause_return whereClause197 =null;

        OracleWalker.groupByClause_return groupByClause198 =null;

        OracleWalker.orderByClause_return orderByClause199 =null;

        OracleWalker.for_update_return for_update200 =null;




        if(holder ==null){
        	retval.select =new OracleSelect();
        	}
        else{
        	retval.select = new OracleSelect(holder);
        }


        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:6: ( selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( for_update[$select] )? )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:8: selectClause[$select] ( fromClause[$select] )? ( whereClause[$select.getWhere()] )? ( groupByClause[$select.getWhere()] )? ( orderByClause[$select.getWhere()] )? ( for_update[$select] )?
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_selectClause_in_select_command1743);
            selectClause195=selectClause(retval.select);

            state._fsp--;

            adaptor.addChild(root_0, selectClause195.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:30: ( fromClause[$select] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==TABLENAMES) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:31: fromClause[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_fromClause_in_select_command1747);
                    fromClause196=fromClause(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, fromClause196.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:54: ( whereClause[$select.getWhere()] )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==WHERE) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:55: whereClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_select_command1754);
                    whereClause197=whereClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, whereClause197.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:89: ( groupByClause[$select.getWhere()] )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==GROUPBY) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:90: groupByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_groupByClause_in_select_command1760);
                    groupByClause198=groupByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, groupByClause198.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:126: ( orderByClause[$select.getWhere()] )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ORDERBY) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:127: orderByClause[$select.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_select_command1766);
                    orderByClause199=orderByClause(retval.select.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_0, orderByClause199.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:163: ( for_update[$select] )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==FORUPDATE) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:667:164: for_update[$select]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_for_update_in_select_command1772);
                    for_update200=for_update(retval.select);

                    state._fsp--;

                    adaptor.addChild(root_0, for_update200.getTree());


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


    public static class for_update_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_update"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:669:1: for_update[Select select] : ^( FORUPDATE ( of_statement[update] )? ( wait_statement[update] )? ) ;
    public final OracleWalker.for_update_return for_update(Select select) throws RecognitionException {
        OracleWalker.for_update_return retval = new OracleWalker.for_update_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FORUPDATE201=null;
        OracleWalker.of_statement_return of_statement202 =null;

        OracleWalker.wait_statement_return wait_statement203 =null;


        CommonTree FORUPDATE201_tree=null;


        		OracleForUpdate update = new OracleForUpdate();
        	
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:673:2: ( ^( FORUPDATE ( of_statement[update] )? ( wait_statement[update] )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:673:3: ^( FORUPDATE ( of_statement[update] )? ( wait_statement[update] )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            FORUPDATE201=(CommonTree)match(input,FORUPDATE,FOLLOW_FORUPDATE_in_for_update1795); 
            FORUPDATE201_tree = (CommonTree)adaptor.dupNode(FORUPDATE201);


            root_1 = (CommonTree)adaptor.becomeRoot(FORUPDATE201_tree, root_1);


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:673:15: ( of_statement[update] )?
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==OF) ) {
                    alt66=1;
                }
                switch (alt66) {
                    case 1 :
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:673:15: of_statement[update]
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_of_statement_in_for_update1797);
                        of_statement202=of_statement(update);

                        state._fsp--;

                        adaptor.addChild(root_1, of_statement202.getTree());


                        }
                        break;

                }


                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:673:37: ( wait_statement[update] )?
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==NOWAIT||LA67_0==WAIT) ) {
                    alt67=1;
                }
                switch (alt67) {
                    case 1 :
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:673:37: wait_statement[update]
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_wait_statement_in_for_update1801);
                        wait_statement203=wait_statement(update);

                        state._fsp--;

                        adaptor.addChild(root_1, wait_statement203.getTree());


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		select.addForUpdate(update);
            	

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


    public static class of_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "of_statement"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:678:1: of_statement[OracleForUpdate update] : ^( OF expr[null] ) ;
    public final OracleWalker.of_statement_return of_statement(OracleForUpdate update) throws RecognitionException {
        OracleWalker.of_statement_return retval = new OracleWalker.of_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree OF204=null;
        OracleWalker.expr_return expr205 =null;


        CommonTree OF204_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:679:2: ( ^( OF expr[null] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:679:3: ^( OF expr[null] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            OF204=(CommonTree)match(input,OF,FOLLOW_OF_in_of_statement1819); 
            OF204_tree = (CommonTree)adaptor.dupNode(OF204);


            root_1 = (CommonTree)adaptor.becomeRoot(OF204_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_of_statement1821);
            expr205=expr(null);

            state._fsp--;

            adaptor.addChild(root_1, expr205.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }



            		update.setOfColumn((Column)(expr205!=null?expr205.valueObj:null));
            	

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
    // $ANTLR end "of_statement"


    public static class wait_statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wait_statement"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:684:1: wait_statement[OracleForUpdate update] : ( ^( NOWAIT ( N )? ) | ^( WAIT N ) );
    public final OracleWalker.wait_statement_return wait_statement(OracleForUpdate update) throws RecognitionException {
        OracleWalker.wait_statement_return retval = new OracleWalker.wait_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree NOWAIT206=null;
        CommonTree N207=null;
        CommonTree WAIT208=null;
        CommonTree N209=null;

        CommonTree NOWAIT206_tree=null;
        CommonTree N207_tree=null;
        CommonTree WAIT208_tree=null;
        CommonTree N209_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:685:2: ( ^( NOWAIT ( N )? ) | ^( WAIT N ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==NOWAIT) ) {
                alt69=1;
            }
            else if ( (LA69_0==WAIT) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:685:3: ^( NOWAIT ( N )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    NOWAIT206=(CommonTree)match(input,NOWAIT,FOLLOW_NOWAIT_in_wait_statement1837); 
                    NOWAIT206_tree = (CommonTree)adaptor.dupNode(NOWAIT206);


                    root_1 = (CommonTree)adaptor.becomeRoot(NOWAIT206_tree, root_1);


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); 
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:685:12: ( N )?
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==N) ) {
                            alt68=1;
                        }
                        switch (alt68) {
                            case 1 :
                                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:685:12: N
                                {
                                _last = (CommonTree)input.LT(1);
                                N207=(CommonTree)match(input,N,FOLLOW_N_in_wait_statement1839); 
                                N207_tree = (CommonTree)adaptor.dupNode(N207);


                                adaptor.addChild(root_1, N207_tree);


                                }
                                break;

                        }


                        match(input, Token.UP, null); 
                    }
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		update.setWait(0);
                    	

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:689:3: ^( WAIT N )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    _last = (CommonTree)input.LT(1);
                    WAIT208=(CommonTree)match(input,WAIT,FOLLOW_WAIT_in_wait_statement1849); 
                    WAIT208_tree = (CommonTree)adaptor.dupNode(WAIT208);


                    root_1 = (CommonTree)adaptor.becomeRoot(WAIT208_tree, root_1);


                    match(input, Token.DOWN, null); 
                    _last = (CommonTree)input.LT(1);
                    N209=(CommonTree)match(input,N,FOLLOW_N_in_wait_statement1851); 
                    N209_tree = (CommonTree)adaptor.dupNode(N209);


                    adaptor.addChild(root_1, N209_tree);


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }



                    		update.setWait(Integer.valueOf((N209!=null?N209.getText():null)));
                    	

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
    // $ANTLR end "wait_statement"


    public static class delete_command_return extends TreeRuleReturnScope {
        public Delete del;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:694:1: delete_command returns [Delete del] : ^( DELETE ( indexClause[$del] )? tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ) ;
    public final OracleWalker.delete_command_return delete_command() throws RecognitionException {
        OracleWalker.delete_command_return retval = new OracleWalker.delete_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DELETE210=null;
        OracleWalker.indexClause_return indexClause211 =null;

        OracleWalker.tables_return tables212 =null;

        OracleWalker.whereClause_return whereClause213 =null;

        OracleWalker.orderByClause_return orderByClause214 =null;


        CommonTree DELETE210_tree=null;

        retval.del =new OracleDelete();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:2: ( ^( DELETE ( indexClause[$del] )? tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:3: ^( DELETE ( indexClause[$del] )? tables[$del] ( whereClause[$del.getWhere()] )? ( orderByClause[$del.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            DELETE210=(CommonTree)match(input,DELETE,FOLLOW_DELETE_in_delete_command1872); 
            DELETE210_tree = (CommonTree)adaptor.dupNode(DELETE210);


            root_1 = (CommonTree)adaptor.becomeRoot(DELETE210_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:12: ( indexClause[$del] )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==ID) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:12: indexClause[$del]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_delete_command1874);
                    indexClause211=indexClause(retval.del);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause211.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_delete_command1878);
            tables212=tables(retval.del);

            state._fsp--;

            adaptor.addChild(root_1, tables212.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:44: ( whereClause[$del.getWhere()] )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==WHERE) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:44: whereClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_delete_command1881);
                    whereClause213=whereClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause213.getTree());


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:74: ( orderByClause[$del.getWhere()] )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ORDERBY) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:696:74: orderByClause[$del.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_orderByClause_in_delete_command1885);
                    orderByClause214=orderByClause(retval.del.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, orderByClause214.getTree());


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
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:698:1: update_command returns [Update update] : ^( UPDATE ( indexClause[$update] )? tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ) ;
    public final OracleWalker.update_command_return update_command() throws RecognitionException {
        OracleWalker.update_command_return retval = new OracleWalker.update_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree UPDATE215=null;
        OracleWalker.indexClause_return indexClause216 =null;

        OracleWalker.tables_return tables217 =null;

        OracleWalker.setclause_return setclause218 =null;

        OracleWalker.whereClause_return whereClause219 =null;


        CommonTree UPDATE215_tree=null;

        retval.update =new OracleUpdate();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:700:2: ( ^( UPDATE ( indexClause[$update] )? tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:700:3: ^( UPDATE ( indexClause[$update] )? tables[$update] setclause[$update] ( whereClause[$update.getWhere()] )? )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            UPDATE215=(CommonTree)match(input,UPDATE,FOLLOW_UPDATE_in_update_command1905); 
            UPDATE215_tree = (CommonTree)adaptor.dupNode(UPDATE215);


            root_1 = (CommonTree)adaptor.becomeRoot(UPDATE215_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:700:12: ( indexClause[$update] )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:700:12: indexClause[$update]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_update_command1907);
                    indexClause216=indexClause(retval.update);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause216.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_update_command1911);
            tables217=tables(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, tables217.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_setclause_in_update_command1914);
            setclause218=setclause(retval.update);

            state._fsp--;

            adaptor.addChild(root_1, setclause218.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:700:69: ( whereClause[$update.getWhere()] )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==WHERE) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:700:69: whereClause[$update.getWhere()]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_whereClause_in_update_command1917);
                    whereClause219=whereClause(retval.update.getWhere());

                    state._fsp--;

                    adaptor.addChild(root_1, whereClause219.getTree());


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


    public static class insert_command_return extends TreeRuleReturnScope {
        public Insert ins;
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:704:1: insert_command returns [Insert ins] : ^( INSERT ( indexClause[$ins] )? tables[$ins] ( column_specs[$ins] )* values[$ins] ) ;
    public final OracleWalker.insert_command_return insert_command() throws RecognitionException {
        OracleWalker.insert_command_return retval = new OracleWalker.insert_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INSERT220=null;
        OracleWalker.indexClause_return indexClause221 =null;

        OracleWalker.tables_return tables222 =null;

        OracleWalker.column_specs_return column_specs223 =null;

        OracleWalker.values_return values224 =null;


        CommonTree INSERT220_tree=null;

        retval.ins =new Insert();
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:706:2: ( ^( INSERT ( indexClause[$ins] )? tables[$ins] ( column_specs[$ins] )* values[$ins] ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:706:3: ^( INSERT ( indexClause[$ins] )? tables[$ins] ( column_specs[$ins] )* values[$ins] )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            INSERT220=(CommonTree)match(input,INSERT,FOLLOW_INSERT_in_insert_command1941); 
            INSERT220_tree = (CommonTree)adaptor.dupNode(INSERT220);


            root_1 = (CommonTree)adaptor.becomeRoot(INSERT220_tree, root_1);


            match(input, Token.DOWN, null); 
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:706:12: ( indexClause[$ins] )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==ID) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:706:12: indexClause[$ins]
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_indexClause_in_insert_command1943);
                    indexClause221=indexClause(retval.ins);

                    state._fsp--;

                    adaptor.addChild(root_1, indexClause221.getTree());


                    }
                    break;

            }


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_tables_in_insert_command1947);
            tables222=tables(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, tables222.getTree());


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:706:44: ( column_specs[$ins] )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==COLUMNS) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleWalker.g:706:44: column_specs[$ins]
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_column_specs_in_insert_command1950);
            	    column_specs223=column_specs(retval.ins);

            	    state._fsp--;

            	    adaptor.addChild(root_1, column_specs223.getTree());


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_values_in_insert_command1954);
            values224=values(retval.ins);

            state._fsp--;

            adaptor.addChild(root_1, values224.getTree());


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

    // Delegated rules


 

    public static final BitSet FOLLOW_start_rule_in_beg48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_command_in_start_rule65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_command_in_start_rule71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_command_in_start_rule76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_command_in_start_rule81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setclause94 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpecs_in_setclause96 = new BitSet(new long[]{0x0000000000000008L,0x0000000000020000L});
    public static final BitSet FOLLOW_SET_ELE_in_updateColumnSpecs111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_updateColumnSpec127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_updateColumnSpec129 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_updateColumnSpec132 = new BitSet(new long[]{0x058001002081FA00L,0x00800040401C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_updateColumnSpec134 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_VAL_in_values151 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_values154 = new BitSet(new long[]{0x058001002081FA08L,0x00800040401C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_COLUMNS_in_column_specs170 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_column_spec_in_column_specs172 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_COLUMN_in_column_spec186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_column_spec188 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_table_name_in_column_spec190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_whereClause209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sqlCondition_in_whereClause211 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUPBY_in_groupByClause226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_groupAfterWhere_in_groupByClause228 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORDERBY_in_orderByClause241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_orderByClause243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere262 = new BitSet(new long[]{0x0000000004000102L});
    public static final BitSet FOLLOW_ASC_in_columnNameAfterWhere276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere279 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere281 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_columnNameAfterWhere289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere292 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_afterWhere_in_groupAfterWhere316 = new BitSet(new long[]{0x0000000004000102L});
    public static final BitSet FOLLOW_ASC_in_afterWhere330 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_afterWhere333 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_table_alias_in_afterWhere335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESC_in_afterWhere343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_afterWhere346 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_table_alias_in_afterWhere348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_NOT_in_sqlCondition365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_OR_in_sqlCondition374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_sqlCondition376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_122_in_condition397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition401 = new BitSet(new long[]{0x605982A200000008L,0x0400000080000200L});
    public static final BitSet FOLLOW_95_in_condition413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition415 = new BitSet(new long[]{0x605982A200000008L,0x0400000080000200L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIORITY_in_condition432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_condition434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_condition_expr_in_condition_PAREN449 = new BitSet(new long[]{0x605982A200000002L});
    public static final BitSet FOLLOW_comparisonCondition_in_condition_expr462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inCondition_in_condition_expr468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isCondition_in_condition_expr475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeCondition_in_condition_expr482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_BETWEEN_in_betweenCondition494 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition496 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenCondition502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_LIKE_in_likeCondition525 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition527 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIKE_in_likeCondition538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_likeCondition540 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_likeCondition543 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ISNOT_in_isCondition559 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition561 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition563 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IS_in_isCondition571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_isCondition573 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_isCondition575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_comparisonCondition592 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition594 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQ_in_comparisonCondition607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition609 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition612 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LTH_in_comparisonCondition622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition624 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition627 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GTH_in_comparisonCondition637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition639 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition642 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LEQ_in_comparisonCondition652 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition654 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition657 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GEQ_in_comparisonCondition667 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition669 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_comparisonCondition672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_LEFT_in_left_cond693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_left_cond695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_LISTS_in_in_list714 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inCondition_expr_adds_in_in_list716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IN_in_inCondition734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_117_in_inCondition738 = new BitSet(new long[]{0x0000400000100000L,0x0000000000100000L});
    public static final BitSet FOLLOW_subquery_in_inCondition741 = new BitSet(new long[]{0x0000400000100000L});
    public static final BitSet FOLLOW_in_list_in_inCondition745 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_left_cond_in_inCondition750 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expr_add_in_inCondition_expr_adds784 = new BitSet(new long[]{0x058001002081FA02L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_expr816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEGATIVE_in_expr_add844 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add848 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITIVE_in_expr_add857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr_add870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add874 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr_add888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add892 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITOR_in_expr_add905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add909 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITAND_in_expr_add922 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add926 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add931 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BITXOR_in_expr_add939 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add943 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add948 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTLEFT_in_expr_add956 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add960 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFTRIGHT_in_expr_add973 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add977 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add990 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add994 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add999 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVIDE_in_expr_add1007 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1011 = new BitSet(new long[]{0x058001002081FA00L,0x00800040400C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_add1016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_N_in_expr_add1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr_add1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_expr_add1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_expr_add1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_expr_add1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUTED_STR_in_expr_add1050 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_quoted_string_in_expr_add1052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_expr_add1059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_expr_add1061 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_table_name_in_expr_add1063 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMNAST_in_expr_add1073 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_add1075 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr_add1084 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_add1089 = new BitSet(new long[]{0x058001002081FA08L,0x00800040401C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_CONSIST_in_expr_add1100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr_add1102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_in_expr_add1109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr_add1112 = new BitSet(new long[]{0x058001002081FA00L,0x00800040401C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_ID_in_expr_add1118 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_128_in_boolean_literal1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_boolean_literal1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_LIST_in_select_list1177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1179 = new BitSet(new long[]{0x0000010000808008L});
    public static final BitSet FOLLOW_TABLENAMES_in_fromClause1194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_fromClause1196 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L});
    public static final BitSet FOLLOW_JOIN_in_join_clause1214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_name_in_join_clause1216 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_alias_in_join_clause1218 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_join_column_in_join_clause1223 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_join_column_in_join_clause1227 = new BitSet(new long[]{0x0004081001000008L,0x0000000000801000L});
    public static final BitSet FOLLOW_join_type_in_join_clause1229 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INNER_in_join_type1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFT_in_join_type1256 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_outer_in_join_type1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_join_type1266 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_outer_in_join_type1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FULL_in_join_type1276 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_outer_in_join_type1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNION_in_join_type1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CROSS_in_join_type1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUTER_in_outer1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLUMN_in_join_column1328 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_join_column1330 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_table_name_in_join_column1332 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TABLENAME_in_table1352 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_spec_in_table1354 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_join_clause_in_table1357 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TABLENAMES_in_tables1374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_in_tables1376 = new BitSet(new long[]{0x0000000000000008L,0x0000000000200000L});
    public static final BitSet FOLLOW_schema_name_in_table_spec1400 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_table_name_in_table_spec1404 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_alias_in_table_spec1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_spec1415 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_alias_in_table_spec1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_spec1427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_table_spec1430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_alias_in_table_spec1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_schema_name1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUBQUERY_in_subquery1467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_select_command_in_subquery1469 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_identifier_in_table_name1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_displayed_column1506 = new BitSet(new long[]{0x058001002081FA88L,0x00800040401C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_alias_in_displayed_column1510 = new BitSet(new long[]{0x058001002081FA08L,0x00800040401C0942L,0x0000000000000001L});
    public static final BitSet FOLLOW_CONSIST_in_displayed_column1522 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_displayed_column1524 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_alias_in_displayed_column1526 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLUMN_in_displayed_column1534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_table_alias_in_displayed_column1536 = new BitSet(new long[]{0x0100010000000200L});
    public static final BitSet FOLLOW_columnAnt_in_displayed_column1539 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_alias_in_displayed_column1541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASTERISK_in_columnAnt1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_columnAnt1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_columnAnt1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_quoted_string1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COL_TAB_in_table_alias1622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_table_alias1624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AS_in_alias1643 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_alias1645 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_in_selectClause1666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_selectClause1668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_select_list_in_selectClause1672 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_hints_in_indexClause1691 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ID_in_hints1711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_identifier_in_hints1715 = new BitSet(new long[]{0x0000010000000008L});
    public static final BitSet FOLLOW_selectClause_in_select_command1743 = new BitSet(new long[]{0x0000004800000002L,0x0000000004400010L});
    public static final BitSet FOLLOW_fromClause_in_select_command1747 = new BitSet(new long[]{0x0000004800000002L,0x0000000004000010L});
    public static final BitSet FOLLOW_whereClause_in_select_command1754 = new BitSet(new long[]{0x0000004800000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_groupByClause_in_select_command1760 = new BitSet(new long[]{0x0000000800000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_orderByClause_in_select_command1766 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_for_update_in_select_command1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORUPDATE_in_for_update1795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_of_statement_in_for_update1797 = new BitSet(new long[]{0x8000000000000008L,0x0000000002000000L});
    public static final BitSet FOLLOW_wait_statement_in_for_update1801 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OF_in_of_statement1819 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_of_statement1821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOWAIT_in_wait_statement1837 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_wait_statement1839 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WAIT_in_wait_statement1849 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_N_in_wait_statement1851 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DELETE_in_delete_command1872 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_delete_command1874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_tables_in_delete_command1878 = new BitSet(new long[]{0x0000000000000008L,0x0000000004000010L});
    public static final BitSet FOLLOW_whereClause_in_delete_command1881 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_orderByClause_in_delete_command1885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UPDATE_in_update_command1905 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_update_command1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_tables_in_update_command1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_setclause_in_update_command1914 = new BitSet(new long[]{0x0000000000000008L,0x0000000004000000L});
    public static final BitSet FOLLOW_whereClause_in_update_command1917 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSERT_in_insert_command1941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_indexClause_in_insert_command1943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_tables_in_insert_command1947 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_column_specs_in_insert_command1950 = new BitSet(new long[]{0x0000200000020000L});
    public static final BitSet FOLLOW_values_in_insert_command1954 = new BitSet(new long[]{0x0000000000000008L});

}