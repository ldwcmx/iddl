// $ANTLR 3.4 D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g 2012-07-30 13:34:10

package com.it.iddl.parser.oracle;

import java.util.Map;
import java.util.HashMap;
import com.it.iddl.parser.sql.objecttree.oracle.function.OracleConsistStringRegister;
import com.it.iddl.parser.sql.objecttree.oracle.function.OracleFunctionRegister;
import com.it.iddl.parser.sql.objecttree.oracle.function.OracleHintRegister;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class OracleParserParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public OracleParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public OracleParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return OracleParserParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g"; }



    		protected OracleConsistStringRegister consistStringRegister;
    		protected OracleFunctionRegister functionRegister;
    		protected OracleHintRegister hintRegister;
    		
    		public OracleConsistStringRegister getConsistStringRegister(){
    			return consistStringRegister;
    		}
    		
    		public void setConsistStringRegister(OracleConsistStringRegister consistStringRegister){
    			this.consistStringRegister=consistStringRegister;
    		}

        	public OracleFunctionRegister getFunctionRegister() {
    			return functionRegister;
    		}
    		
    		public void setFunctionRegister(OracleFunctionRegister functionRegister) {
    			this.functionRegister = functionRegister;
    		}
    		
    		public void setOracleHintRegister(OracleHintRegister hintRegister){
    			this.hintRegister=hintRegister;
    		}
    		
    		protected void mismatch(IntStream input, int ttype, BitSet follow) throws RecognitionException {
    			throw new MismatchedTokenException(ttype, input);
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
    // Alter code generation so catch-clauses get replace with
    // this action.



    public static class beg_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "beg"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:131:1: beg : start_rule ;
    public final OracleParserParser.beg_return beg() throws RecognitionException {
        OracleParserParser.beg_return retval = new OracleParserParser.beg_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.start_rule_return start_rule1 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:131:5: ( start_rule )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:132:1: start_rule
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_start_rule_in_beg290);
            start_rule1=start_rule();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, start_rule1.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "beg"


    public static class start_rule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start_rule"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:135:1: start_rule : ( select_command | update_command | insert_command | delete_command );
    public final OracleParserParser.start_rule_return start_rule() throws RecognitionException {
        OracleParserParser.start_rule_return retval = new OracleParserParser.start_rule_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.select_command_return select_command2 =null;

        OracleParserParser.update_command_return update_command3 =null;

        OracleParserParser.insert_command_return insert_command4 =null;

        OracleParserParser.delete_command_return delete_command5 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:136:2: ( select_command | update_command | insert_command | delete_command )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt1=1;
                }
                break;
            case 130:
                {
                alt1=2;
                }
                break;
            case 110:
                {
                alt1=3;
                }
                break;
            case 101:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:136:3: select_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_select_command_in_start_rule302);
                    select_command2=select_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, select_command2.getTree());

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:137:3: update_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_update_command_in_start_rule306);
                    update_command3=update_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, update_command3.getTree());

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:138:3: insert_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_insert_command_in_start_rule310);
                    insert_command4=insert_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, insert_command4.getTree());

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:139:3: delete_command
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_delete_command_in_start_rule314);
                    delete_command5=delete_command();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, delete_command5.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start_rule"


    public static class setclause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "setclause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:143:1: setclause : 'SET' updateColumnSpecs -> ^( SET updateColumnSpecs ) ;
    public final OracleParserParser.setclause_return setclause() throws RecognitionException {
        OracleParserParser.setclause_return retval = new OracleParserParser.setclause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal6=null;
        OracleParserParser.updateColumnSpecs_return updateColumnSpecs7 =null;


        CommonTree string_literal6_tree=null;
        RewriteRuleTokenStream stream_127=new RewriteRuleTokenStream(adaptor,"token 127");
        RewriteRuleSubtreeStream stream_updateColumnSpecs=new RewriteRuleSubtreeStream(adaptor,"rule updateColumnSpecs");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:144:2: ( 'SET' updateColumnSpecs -> ^( SET updateColumnSpecs ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:144:3: 'SET' updateColumnSpecs
            {
            string_literal6=(Token)match(input,127,FOLLOW_127_in_setclause326); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_127.add(string_literal6);


            pushFollow(FOLLOW_updateColumnSpecs_in_setclause328);
            updateColumnSpecs7=updateColumnSpecs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_updateColumnSpecs.add(updateColumnSpecs7.getTree());

            // AST REWRITE
            // elements: updateColumnSpecs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 144:26: -> ^( SET updateColumnSpecs )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:144:28: ^( SET updateColumnSpecs )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SET, "SET")
                , root_1);

                adaptor.addChild(root_1, stream_updateColumnSpecs.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "setclause"


    public static class updateColumnSpecs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "updateColumnSpecs"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:147:1: updateColumnSpecs : updateColumnSpec ( COMMA updateColumnSpec )* -> ( ^( SET_ELE updateColumnSpec ) )+ ;
    public final OracleParserParser.updateColumnSpecs_return updateColumnSpecs() throws RecognitionException {
        OracleParserParser.updateColumnSpecs_return retval = new OracleParserParser.updateColumnSpecs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA9=null;
        OracleParserParser.updateColumnSpec_return updateColumnSpec8 =null;

        OracleParserParser.updateColumnSpec_return updateColumnSpec10 =null;


        CommonTree COMMA9_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_updateColumnSpec=new RewriteRuleSubtreeStream(adaptor,"rule updateColumnSpec");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:148:2: ( updateColumnSpec ( COMMA updateColumnSpec )* -> ( ^( SET_ELE updateColumnSpec ) )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:148:3: updateColumnSpec ( COMMA updateColumnSpec )*
            {
            pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs345);
            updateColumnSpec8=updateColumnSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_updateColumnSpec.add(updateColumnSpec8.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:148:20: ( COMMA updateColumnSpec )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:148:21: COMMA updateColumnSpec
            	    {
            	    COMMA9=(Token)match(input,COMMA,FOLLOW_COMMA_in_updateColumnSpecs348); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA9);


            	    pushFollow(FOLLOW_updateColumnSpec_in_updateColumnSpecs350);
            	    updateColumnSpec10=updateColumnSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_updateColumnSpec.add(updateColumnSpec10.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: updateColumnSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 148:45: -> ( ^( SET_ELE updateColumnSpec ) )+
            {
                if ( !(stream_updateColumnSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_updateColumnSpec.hasNext() ) {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:148:47: ^( SET_ELE updateColumnSpec )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(SET_ELE, "SET_ELE")
                    , root_1);

                    adaptor.addChild(root_1, stream_updateColumnSpec.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_updateColumnSpec.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpecs"


    public static class updateColumnSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "updateColumnSpec"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:150:1: updateColumnSpec : columnNameInUpdate EQ ^ expr ;
    public final OracleParserParser.updateColumnSpec_return updateColumnSpec() throws RecognitionException {
        OracleParserParser.updateColumnSpec_return retval = new OracleParserParser.updateColumnSpec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ12=null;
        OracleParserParser.columnNameInUpdate_return columnNameInUpdate11 =null;

        OracleParserParser.expr_return expr13 =null;


        CommonTree EQ12_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:151:2: ( columnNameInUpdate EQ ^ expr )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:151:3: columnNameInUpdate EQ ^ expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_columnNameInUpdate_in_updateColumnSpec368);
            columnNameInUpdate11=columnNameInUpdate();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameInUpdate11.getTree());

            EQ12=(Token)match(input,EQ,FOLLOW_EQ_in_updateColumnSpec370); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EQ12_tree = 
            (CommonTree)adaptor.create(EQ12)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(EQ12_tree, root_0);
            }

            pushFollow(FOLLOW_expr_in_updateColumnSpec373);
            expr13=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr13.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "updateColumnSpec"


    public static class groupByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupByClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:154:1: groupByClause : 'GRUOP' 'BY' columnNamesAfterWhere -> ^( GROUPBY columnNamesAfterWhere ) ;
    public final OracleParserParser.groupByClause_return groupByClause() throws RecognitionException {
        OracleParserParser.groupByClause_return retval = new OracleParserParser.groupByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal14=null;
        Token string_literal15=null;
        OracleParserParser.columnNamesAfterWhere_return columnNamesAfterWhere16 =null;


        CommonTree string_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleSubtreeStream stream_columnNamesAfterWhere=new RewriteRuleSubtreeStream(adaptor,"rule columnNamesAfterWhere");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:155:2: ( 'GRUOP' 'BY' columnNamesAfterWhere -> ^( GROUPBY columnNamesAfterWhere ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:155:3: 'GRUOP' 'BY' columnNamesAfterWhere
            {
            string_literal14=(Token)match(input,106,FOLLOW_106_in_groupByClause383); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_106.add(string_literal14);


            string_literal15=(Token)match(input,98,FOLLOW_98_in_groupByClause385); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(string_literal15);


            pushFollow(FOLLOW_columnNamesAfterWhere_in_groupByClause387);
            columnNamesAfterWhere16=columnNamesAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNamesAfterWhere.add(columnNamesAfterWhere16.getTree());

            // AST REWRITE
            // elements: columnNamesAfterWhere
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 155:37: -> ^( GROUPBY columnNamesAfterWhere )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:155:39: ^( GROUPBY columnNamesAfterWhere )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(GROUPBY, "GROUPBY")
                , root_1);

                adaptor.addChild(root_1, stream_columnNamesAfterWhere.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupByClause"


    public static class orderByClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderByClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:157:1: orderByClause : 'ORDER' 'BY' columnNamesAfterWhere -> ^( ORDERBY columnNamesAfterWhere ) ;
    public final OracleParserParser.orderByClause_return orderByClause() throws RecognitionException {
        OracleParserParser.orderByClause_return retval = new OracleParserParser.orderByClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal17=null;
        Token string_literal18=null;
        OracleParserParser.columnNamesAfterWhere_return columnNamesAfterWhere19 =null;


        CommonTree string_literal17_tree=null;
        CommonTree string_literal18_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_columnNamesAfterWhere=new RewriteRuleSubtreeStream(adaptor,"rule columnNamesAfterWhere");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:158:2: ( 'ORDER' 'BY' columnNamesAfterWhere -> ^( ORDERBY columnNamesAfterWhere ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:158:3: 'ORDER' 'BY' columnNamesAfterWhere
            {
            string_literal17=(Token)match(input,123,FOLLOW_123_in_orderByClause406); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(string_literal17);


            string_literal18=(Token)match(input,98,FOLLOW_98_in_orderByClause408); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_98.add(string_literal18);


            pushFollow(FOLLOW_columnNamesAfterWhere_in_orderByClause410);
            columnNamesAfterWhere19=columnNamesAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNamesAfterWhere.add(columnNamesAfterWhere19.getTree());

            // AST REWRITE
            // elements: columnNamesAfterWhere
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 158:37: -> ^( ORDERBY columnNamesAfterWhere )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:158:39: ^( ORDERBY columnNamesAfterWhere )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ORDERBY, "ORDERBY")
                , root_1);

                adaptor.addChild(root_1, stream_columnNamesAfterWhere.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderByClause"


    public static class columnNamesAfterWhere_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnNamesAfterWhere"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:162:1: columnNamesAfterWhere : columnNameAfterWhere ( COMMA ! columnNameAfterWhere )* ;
    public final OracleParserParser.columnNamesAfterWhere_return columnNamesAfterWhere() throws RecognitionException {
        OracleParserParser.columnNamesAfterWhere_return retval = new OracleParserParser.columnNamesAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA21=null;
        OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere20 =null;

        OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere22 =null;


        CommonTree COMMA21_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:163:5: ( columnNameAfterWhere ( COMMA ! columnNameAfterWhere )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:163:6: columnNameAfterWhere ( COMMA ! columnNameAfterWhere )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere430);
            columnNameAfterWhere20=columnNameAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere20.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:163:27: ( COMMA ! columnNameAfterWhere )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:163:28: COMMA ! columnNameAfterWhere
            	    {
            	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_columnNamesAfterWhere433); if (state.failed) return retval;

            	    pushFollow(FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere436);
            	    columnNameAfterWhere22=columnNameAfterWhere();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere22.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnNamesAfterWhere"


    public static class whereClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:166:1: whereClause : 'WHERE' sqlCondition -> ^( WHERE sqlCondition ) ;
    public final OracleParserParser.whereClause_return whereClause() throws RecognitionException {
        OracleParserParser.whereClause_return retval = new OracleParserParser.whereClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal23=null;
        OracleParserParser.sqlCondition_return sqlCondition24 =null;


        CommonTree string_literal23_tree=null;
        RewriteRuleTokenStream stream_133=new RewriteRuleTokenStream(adaptor,"token 133");
        RewriteRuleSubtreeStream stream_sqlCondition=new RewriteRuleSubtreeStream(adaptor,"rule sqlCondition");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:167:2: ( 'WHERE' sqlCondition -> ^( WHERE sqlCondition ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:167:3: 'WHERE' sqlCondition
            {
            string_literal23=(Token)match(input,133,FOLLOW_133_in_whereClause452); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_133.add(string_literal23);


            pushFollow(FOLLOW_sqlCondition_in_whereClause454);
            sqlCondition24=sqlCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sqlCondition.add(sqlCondition24.getTree());

            // AST REWRITE
            // elements: sqlCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 167:23: -> ^( WHERE sqlCondition )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:167:25: ^( WHERE sqlCondition )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHERE, "WHERE")
                , root_1);

                adaptor.addChild(root_1, stream_sqlCondition.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whereClause"


    public static class sqlCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sqlCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:170:1: sqlCondition : ( 'NOT' condition_or -> ^( CONDITION_OR_NOT condition_or ) | condition_or -> ^( CONDITION_OR condition_or ) );
    public final OracleParserParser.sqlCondition_return sqlCondition() throws RecognitionException {
        OracleParserParser.sqlCondition_return retval = new OracleParserParser.sqlCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal25=null;
        OracleParserParser.condition_or_return condition_or26 =null;

        OracleParserParser.condition_or_return condition_or27 =null;


        CommonTree string_literal25_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleSubtreeStream stream_condition_or=new RewriteRuleSubtreeStream(adaptor,"rule condition_or");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:171:2: ( 'NOT' condition_or -> ^( CONDITION_OR_NOT condition_or ) | condition_or -> ^( CONDITION_OR condition_or ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==117) ) {
                alt4=1;
            }
            else if ( (LA4_0==ASTERISK||LA4_0==ID||LA4_0==LPAREN||(LA4_0 >= MINUS && LA4_0 <= N)||LA4_0==NUMBER||LA4_0==PLUS||LA4_0==QUOTED_STRING||LA4_0==94||LA4_0==99||LA4_0==102||LA4_0==119||LA4_0==128) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:171:3: 'NOT' condition_or
                    {
                    string_literal25=(Token)match(input,117,FOLLOW_117_in_sqlCondition470); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal25);


                    pushFollow(FOLLOW_condition_or_in_sqlCondition472);
                    condition_or26=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or26.getTree());

                    // AST REWRITE
                    // elements: condition_or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 171:21: -> ^( CONDITION_OR_NOT condition_or )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:171:23: ^( CONDITION_OR_NOT condition_or )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONDITION_OR_NOT, "CONDITION_OR_NOT")
                        , root_1);

                        adaptor.addChild(root_1, stream_condition_or.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:172:3: condition_or
                    {
                    pushFollow(FOLLOW_condition_or_in_sqlCondition483);
                    condition_or27=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or27.getTree());

                    // AST REWRITE
                    // elements: condition_or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 172:16: -> ^( CONDITION_OR condition_or )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:172:18: ^( CONDITION_OR condition_or )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONDITION_OR, "CONDITION_OR")
                        , root_1);

                        adaptor.addChild(root_1, stream_condition_or.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sqlCondition"


    public static class condition_or_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_or"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:176:1: condition_or : condition_and ( 'OR' ^ condition_and )* ;
    public final OracleParserParser.condition_or_return condition_or() throws RecognitionException {
        OracleParserParser.condition_or_return retval = new OracleParserParser.condition_or_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal29=null;
        OracleParserParser.condition_and_return condition_and28 =null;

        OracleParserParser.condition_and_return condition_and30 =null;


        CommonTree string_literal29_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:177:2: ( condition_and ( 'OR' ^ condition_and )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:177:3: condition_and ( 'OR' ^ condition_and )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_condition_and_in_condition_or501);
            condition_and28=condition_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_and28.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:177:17: ( 'OR' ^ condition_and )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==122) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:177:19: 'OR' ^ condition_and
            	    {
            	    string_literal29=(Token)match(input,122,FOLLOW_122_in_condition_or505); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal29_tree = 
            	    (CommonTree)adaptor.create(string_literal29)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal29_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_condition_and_in_condition_or508);
            	    condition_and30=condition_and();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_and30.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_or"


    public static class condition_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_and"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:180:1: condition_and : condition_PAREN ( 'AND' ^ condition_PAREN )* ;
    public final OracleParserParser.condition_and_return condition_and() throws RecognitionException {
        OracleParserParser.condition_and_return retval = new OracleParserParser.condition_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal32=null;
        OracleParserParser.condition_PAREN_return condition_PAREN31 =null;

        OracleParserParser.condition_PAREN_return condition_PAREN33 =null;


        CommonTree string_literal32_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:181:2: ( condition_PAREN ( 'AND' ^ condition_PAREN )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:181:3: condition_PAREN ( 'AND' ^ condition_PAREN )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_condition_PAREN_in_condition_and521);
            condition_PAREN31=condition_PAREN();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_PAREN31.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:181:19: ( 'AND' ^ condition_PAREN )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==95) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:181:21: 'AND' ^ condition_PAREN
            	    {
            	    string_literal32=(Token)match(input,95,FOLLOW_95_in_condition_and525); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal32_tree = 
            	    (CommonTree)adaptor.create(string_literal32)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal32_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_condition_PAREN_in_condition_and528);
            	    condition_PAREN33=condition_PAREN();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_PAREN33.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_and"


    public static class condition_PAREN_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_PAREN"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:183:1: condition_PAREN : ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr );
    public final OracleParserParser.condition_PAREN_return condition_PAREN() throws RecognitionException {
        OracleParserParser.condition_PAREN_return retval = new OracleParserParser.condition_PAREN_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN34=null;
        Token RPAREN36=null;
        OracleParserParser.condition_or_return condition_or35 =null;

        OracleParserParser.condition_expr_return condition_expr37 =null;


        CommonTree LPAREN34_tree=null;
        CommonTree RPAREN36_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_condition_or=new RewriteRuleSubtreeStream(adaptor,"rule condition_or");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:184:2: ( ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN -> ^( PRIORITY condition_or ) | condition_expr )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LPAREN) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred1_OracleParser()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA7_0==ASTERISK||LA7_0==ID||(LA7_0 >= MINUS && LA7_0 <= N)||LA7_0==NUMBER||LA7_0==PLUS||LA7_0==QUOTED_STRING||LA7_0==94||LA7_0==99||LA7_0==102||LA7_0==119||LA7_0==128) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:184:3: ( LPAREN condition_or RPAREN )=> LPAREN condition_or RPAREN
                    {
                    LPAREN34=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_condition_PAREN548); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN34);


                    pushFollow(FOLLOW_condition_or_in_condition_PAREN550);
                    condition_or35=condition_or();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_or.add(condition_or35.getTree());

                    RPAREN36=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_condition_PAREN552); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN36);


                    // AST REWRITE
                    // elements: condition_or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 184:59: -> ^( PRIORITY condition_or )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:184:61: ^( PRIORITY condition_or )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(PRIORITY, "PRIORITY")
                        , root_1);

                        adaptor.addChild(root_1, stream_condition_or.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:185:3: condition_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_condition_expr_in_condition_PAREN562);
                    condition_expr37=condition_expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_expr37.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_PAREN"


    public static class condition_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_expr"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:187:1: condition_expr : condition_left ^ ( comparisonCondition ^| inCondition ^| isCondition ^| likeCondition ^| betweenCondition ^) ;
    public final OracleParserParser.condition_expr_return condition_expr() throws RecognitionException {
        OracleParserParser.condition_expr_return retval = new OracleParserParser.condition_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.condition_left_return condition_left38 =null;

        OracleParserParser.comparisonCondition_return comparisonCondition39 =null;

        OracleParserParser.inCondition_return inCondition40 =null;

        OracleParserParser.isCondition_return isCondition41 =null;

        OracleParserParser.likeCondition_return likeCondition42 =null;

        OracleParserParser.betweenCondition_return betweenCondition43 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:188:2: ( condition_left ^ ( comparisonCondition ^| inCondition ^| isCondition ^| likeCondition ^| betweenCondition ^) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:188:4: condition_left ^ ( comparisonCondition ^| inCondition ^| isCondition ^| likeCondition ^| betweenCondition ^)
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_condition_left_in_condition_expr572);
            condition_left38=condition_left();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(condition_left38.getTree(), root_0);

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:189:2: ( comparisonCondition ^| inCondition ^| isCondition ^| likeCondition ^| betweenCondition ^)
            int alt8=5;
            switch ( input.LA(1) ) {
            case EQ:
            case GEQ:
            case GTH:
            case LEQ:
            case LTH:
            case NOT_EQ:
                {
                alt8=1;
                }
                break;
            case 117:
                {
                switch ( input.LA(2) ) {
                case 115:
                    {
                    alt8=4;
                    }
                    break;
                case 97:
                    {
                    alt8=5;
                    }
                    break;
                case 107:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;

                }

                }
                break;
            case 107:
                {
                alt8=2;
                }
                break;
            case 112:
                {
                alt8=3;
                }
                break;
            case 115:
                {
                alt8=4;
                }
                break;
            case 97:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:189:3: comparisonCondition ^
                    {
                    pushFollow(FOLLOW_comparisonCondition_in_condition_expr577);
                    comparisonCondition39=comparisonCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(comparisonCondition39.getTree(), root_0);

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:190:4: inCondition ^
                    {
                    pushFollow(FOLLOW_inCondition_in_condition_expr583);
                    inCondition40=inCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(inCondition40.getTree(), root_0);

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:191:4: isCondition ^
                    {
                    pushFollow(FOLLOW_isCondition_in_condition_expr589);
                    isCondition41=isCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(isCondition41.getTree(), root_0);

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:192:4: likeCondition ^
                    {
                    pushFollow(FOLLOW_likeCondition_in_condition_expr596);
                    likeCondition42=likeCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(likeCondition42.getTree(), root_0);

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:193:4: betweenCondition ^
                    {
                    pushFollow(FOLLOW_betweenCondition_in_condition_expr602);
                    betweenCondition43=betweenCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(betweenCondition43.getTree(), root_0);

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_expr"


    public static class condition_left_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_left"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:196:1: condition_left : expr -> ^( CONDITION_LEFT expr ) ;
    public final OracleParserParser.condition_left_return condition_left() throws RecognitionException {
        OracleParserParser.condition_left_return retval = new OracleParserParser.condition_left_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.expr_return expr44 =null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:197:2: ( expr -> ^( CONDITION_LEFT expr ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:197:3: expr
            {
            pushFollow(FOLLOW_expr_in_condition_left616);
            expr44=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr44.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 197:7: -> ^( CONDITION_LEFT expr )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:197:9: ^( CONDITION_LEFT expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(CONDITION_LEFT, "CONDITION_LEFT")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_left"


    public static class betweenCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "betweenCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:199:1: betweenCondition : ( 'NOT' 'BETWEEN' between_and -> ^( NOT_BETWEEN between_and ) | 'BETWEEN' between_and -> ^( BETWEEN between_and ) );
    public final OracleParserParser.betweenCondition_return betweenCondition() throws RecognitionException {
        OracleParserParser.betweenCondition_return retval = new OracleParserParser.betweenCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal48=null;
        OracleParserParser.between_and_return between_and47 =null;

        OracleParserParser.between_and_return between_and49 =null;


        CommonTree string_literal45_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleSubtreeStream stream_between_and=new RewriteRuleSubtreeStream(adaptor,"rule between_and");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:200:2: ( 'NOT' 'BETWEEN' between_and -> ^( NOT_BETWEEN between_and ) | 'BETWEEN' between_and -> ^( BETWEEN between_and ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==117) ) {
                alt9=1;
            }
            else if ( (LA9_0==97) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:200:4: 'NOT' 'BETWEEN' between_and
                    {
                    string_literal45=(Token)match(input,117,FOLLOW_117_in_betweenCondition632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal45);


                    string_literal46=(Token)match(input,97,FOLLOW_97_in_betweenCondition634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_97.add(string_literal46);


                    pushFollow(FOLLOW_between_and_in_betweenCondition636);
                    between_and47=between_and();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_between_and.add(between_and47.getTree());

                    // AST REWRITE
                    // elements: between_and
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 200:31: -> ^( NOT_BETWEEN between_and )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:200:33: ^( NOT_BETWEEN between_and )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NOT_BETWEEN, "NOT_BETWEEN")
                        , root_1);

                        adaptor.addChild(root_1, stream_between_and.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:201:4: 'BETWEEN' between_and
                    {
                    string_literal48=(Token)match(input,97,FOLLOW_97_in_betweenCondition647); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_97.add(string_literal48);


                    pushFollow(FOLLOW_between_and_in_betweenCondition649);
                    between_and49=between_and();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_between_and.add(between_and49.getTree());

                    // AST REWRITE
                    // elements: between_and
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 201:25: -> ^( BETWEEN between_and )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:201:27: ^( BETWEEN between_and )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(BETWEEN, "BETWEEN")
                        , root_1);

                        adaptor.addChild(root_1, stream_between_and.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "betweenCondition"


    public static class between_and_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "between_and"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:204:1: between_and : between_and_expression 'AND' ^ between_and_expression ;
    public final OracleParserParser.between_and_return between_and() throws RecognitionException {
        OracleParserParser.between_and_return retval = new OracleParserParser.between_and_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal51=null;
        OracleParserParser.between_and_expression_return between_and_expression50 =null;

        OracleParserParser.between_and_expression_return between_and_expression52 =null;


        CommonTree string_literal51_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:205:2: ( between_and_expression 'AND' ^ between_and_expression )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:205:3: between_and_expression 'AND' ^ between_and_expression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_between_and_expression_in_between_and666);
            between_and_expression50=between_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, between_and_expression50.getTree());

            string_literal51=(Token)match(input,95,FOLLOW_95_in_between_and668); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal51_tree = 
            (CommonTree)adaptor.create(string_literal51)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(string_literal51_tree, root_0);
            }

            pushFollow(FOLLOW_between_and_expression_in_between_and671);
            between_and_expression52=between_and_expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, between_and_expression52.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "between_and"


    public static class between_and_expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "between_and_expression"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:208:1: between_and_expression : expr_bit ;
    public final OracleParserParser.between_and_expression_return between_and_expression() throws RecognitionException {
        OracleParserParser.between_and_expression_return retval = new OracleParserParser.between_and_expression_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.expr_bit_return expr_bit53 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:209:2: ( expr_bit )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:209:3: expr_bit
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_bit_in_between_and_expression683);
            expr_bit53=expr_bit();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bit53.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "between_and_expression"


    public static class isCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "isCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:212:1: isCondition : ( 'IS' 'NOT' condition_is_valobject -> ^( ISNOT condition_is_valobject ) | 'IS' condition_is_valobject -> ^( IS condition_is_valobject ) );
    public final OracleParserParser.isCondition_return isCondition() throws RecognitionException {
        OracleParserParser.isCondition_return retval = new OracleParserParser.isCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal57=null;
        OracleParserParser.condition_is_valobject_return condition_is_valobject56 =null;

        OracleParserParser.condition_is_valobject_return condition_is_valobject58 =null;


        CommonTree string_literal54_tree=null;
        CommonTree string_literal55_tree=null;
        CommonTree string_literal57_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_112=new RewriteRuleTokenStream(adaptor,"token 112");
        RewriteRuleSubtreeStream stream_condition_is_valobject=new RewriteRuleSubtreeStream(adaptor,"rule condition_is_valobject");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:213:2: ( 'IS' 'NOT' condition_is_valobject -> ^( ISNOT condition_is_valobject ) | 'IS' condition_is_valobject -> ^( IS condition_is_valobject ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==112) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==117) ) {
                    alt10=1;
                }
                else if ( (LA10_1==108||LA10_1==116||LA10_1==119) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:213:4: 'IS' 'NOT' condition_is_valobject
                    {
                    string_literal54=(Token)match(input,112,FOLLOW_112_in_isCondition695); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal54);


                    string_literal55=(Token)match(input,117,FOLLOW_117_in_isCondition697); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal55);


                    pushFollow(FOLLOW_condition_is_valobject_in_isCondition699);
                    condition_is_valobject56=condition_is_valobject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_is_valobject.add(condition_is_valobject56.getTree());

                    // AST REWRITE
                    // elements: condition_is_valobject
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 213:37: -> ^( ISNOT condition_is_valobject )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:213:39: ^( ISNOT condition_is_valobject )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ISNOT, "ISNOT")
                        , root_1);

                        adaptor.addChild(root_1, stream_condition_is_valobject.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:214:3: 'IS' condition_is_valobject
                    {
                    string_literal57=(Token)match(input,112,FOLLOW_112_in_isCondition709); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_112.add(string_literal57);


                    pushFollow(FOLLOW_condition_is_valobject_in_isCondition711);
                    condition_is_valobject58=condition_is_valobject();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condition_is_valobject.add(condition_is_valobject58.getTree());

                    // AST REWRITE
                    // elements: condition_is_valobject
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 214:30: -> ^( IS condition_is_valobject )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:214:32: ^( IS condition_is_valobject )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IS, "IS")
                        , root_1);

                        adaptor.addChild(root_1, stream_condition_is_valobject.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "isCondition"


    public static class condition_is_valobject_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition_is_valobject"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:218:1: condition_is_valobject : ( 'NAN' -> NAN | 'INFINITE' -> INFINITE | 'NULL' -> NULL );
    public final OracleParserParser.condition_is_valobject_return condition_is_valobject() throws RecognitionException {
        OracleParserParser.condition_is_valobject_return retval = new OracleParserParser.condition_is_valobject_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal59=null;
        Token string_literal60=null;
        Token string_literal61=null;

        CommonTree string_literal59_tree=null;
        CommonTree string_literal60_tree=null;
        CommonTree string_literal61_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_108=new RewriteRuleTokenStream(adaptor,"token 108");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:219:2: ( 'NAN' -> NAN | 'INFINITE' -> INFINITE | 'NULL' -> NULL )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt11=1;
                }
                break;
            case 108:
                {
                alt11=2;
                }
                break;
            case 119:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:219:4: 'NAN'
                    {
                    string_literal59=(Token)match(input,116,FOLLOW_116_in_condition_is_valobject729); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(string_literal59);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 219:10: -> NAN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(NAN, "NAN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:220:4: 'INFINITE'
                    {
                    string_literal60=(Token)match(input,108,FOLLOW_108_in_condition_is_valobject737); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_108.add(string_literal60);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 220:15: -> INFINITE
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(INFINITE, "INFINITE")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:221:4: 'NULL'
                    {
                    string_literal61=(Token)match(input,119,FOLLOW_119_in_condition_is_valobject745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_119.add(string_literal61);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 221:11: -> NULL
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(NULL, "NULL")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition_is_valobject"


    public static class inCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:224:1: inCondition : (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) ) -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? ) ;
    public final OracleParserParser.inCondition_return inCondition() throws RecognitionException {
        OracleParserParser.inCondition_return retval = new OracleParserParser.inCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token not=null;
        Token string_literal62=null;
        Token LPAREN64=null;
        Token RPAREN66=null;
        OracleParserParser.subquery_return subquery63 =null;

        OracleParserParser.inCondition_expr_bits_return inCondition_expr_bits65 =null;


        CommonTree not_tree=null;
        CommonTree string_literal62_tree=null;
        CommonTree LPAREN64_tree=null;
        CommonTree RPAREN66_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_107=new RewriteRuleTokenStream(adaptor,"token 107");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_inCondition_expr_bits=new RewriteRuleSubtreeStream(adaptor,"rule inCondition_expr_bits");
        RewriteRuleSubtreeStream stream_subquery=new RewriteRuleSubtreeStream(adaptor,"rule subquery");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:225:2: ( (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) ) -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:225:3: (not= 'NOT' )? 'IN' ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) )
            {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:225:3: (not= 'NOT' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==117) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:225:4: not= 'NOT'
                    {
                    not=(Token)match(input,117,FOLLOW_117_in_inCondition761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(not);


                    }
                    break;

            }


            string_literal62=(Token)match(input,107,FOLLOW_107_in_inCondition765); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_107.add(string_literal62);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:225:21: ( subquery | ( LPAREN inCondition_expr_bits RPAREN ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LPAREN) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==126) ) {
                    alt13=1;
                }
                else if ( (LA13_1==ASTERISK||LA13_1==ID||LA13_1==LPAREN||(LA13_1 >= MINUS && LA13_1 <= N)||LA13_1==NUMBER||LA13_1==PLUS||LA13_1==QUOTED_STRING||LA13_1==94||LA13_1==99||LA13_1==102||LA13_1==119||LA13_1==128) ) {
                    alt13=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:225:23: subquery
                    {
                    pushFollow(FOLLOW_subquery_in_inCondition769);
                    subquery63=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subquery.add(subquery63.getTree());

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:226:3: ( LPAREN inCondition_expr_bits RPAREN )
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:226:3: ( LPAREN inCondition_expr_bits RPAREN )
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:226:5: LPAREN inCondition_expr_bits RPAREN
                    {
                    LPAREN64=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_inCondition775); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN64);


                    pushFollow(FOLLOW_inCondition_expr_bits_in_inCondition777);
                    inCondition_expr_bits65=inCondition_expr_bits();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_inCondition_expr_bits.add(inCondition_expr_bits65.getTree());

                    RPAREN66=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_inCondition779); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN66);


                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: inCondition_expr_bits, subquery, not
            // token labels: not
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_not=new RewriteRuleTokenStream(adaptor,"token not",not);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 226:42: -> ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:226:44: ^( IN ( $not)? ( subquery )? ( inCondition_expr_bits )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IN, "IN")
                , root_1);

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:226:50: ( $not)?
                if ( stream_not.hasNext() ) {
                    adaptor.addChild(root_1, stream_not.nextNode());

                }
                stream_not.reset();

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:226:55: ( subquery )?
                if ( stream_subquery.hasNext() ) {
                    adaptor.addChild(root_1, stream_subquery.nextTree());

                }
                stream_subquery.reset();

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:226:65: ( inCondition_expr_bits )?
                if ( stream_inCondition_expr_bits.hasNext() ) {
                    adaptor.addChild(root_1, stream_inCondition_expr_bits.nextTree());

                }
                stream_inCondition_expr_bits.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inCondition"


    public static class likeCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "likeCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:230:1: likeCondition : ( 'NOT' 'LIKE' value -> ^( NOT_LIKE value ) | 'LIKE' value -> ^( LIKE value ) );
    public final OracleParserParser.likeCondition_return likeCondition() throws RecognitionException {
        OracleParserParser.likeCondition_return retval = new OracleParserParser.likeCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal67=null;
        Token string_literal68=null;
        Token string_literal70=null;
        OracleParserParser.value_return value69 =null;

        OracleParserParser.value_return value71 =null;


        CommonTree string_literal67_tree=null;
        CommonTree string_literal68_tree=null;
        CommonTree string_literal70_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:231:2: ( 'NOT' 'LIKE' value -> ^( NOT_LIKE value ) | 'LIKE' value -> ^( LIKE value ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==117) ) {
                alt14=1;
            }
            else if ( (LA14_0==115) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:231:3: 'NOT' 'LIKE' value
                    {
                    string_literal67=(Token)match(input,117,FOLLOW_117_in_likeCondition806); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_117.add(string_literal67);


                    string_literal68=(Token)match(input,115,FOLLOW_115_in_likeCondition807); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(string_literal68);


                    pushFollow(FOLLOW_value_in_likeCondition810);
                    value69=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value69.getTree());

                    // AST REWRITE
                    // elements: value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 231:21: -> ^( NOT_LIKE value )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:231:23: ^( NOT_LIKE value )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NOT_LIKE, "NOT_LIKE")
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:232:3: 'LIKE' value
                    {
                    string_literal70=(Token)match(input,115,FOLLOW_115_in_likeCondition820); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(string_literal70);


                    pushFollow(FOLLOW_value_in_likeCondition822);
                    value71=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value71.getTree());

                    // AST REWRITE
                    // elements: value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:15: -> ^( LIKE value )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:232:17: ^( LIKE value )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LIKE, "LIKE")
                        , root_1);

                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "likeCondition"


    public static class inCondition_expr_bits_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "inCondition_expr_bits"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:235:1: inCondition_expr_bits : expr ( COMMA expr )* -> ^( IN_LISTS ( expr )+ ) ;
    public final OracleParserParser.inCondition_expr_bits_return inCondition_expr_bits() throws RecognitionException {
        OracleParserParser.inCondition_expr_bits_return retval = new OracleParserParser.inCondition_expr_bits_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA73=null;
        OracleParserParser.expr_return expr72 =null;

        OracleParserParser.expr_return expr74 =null;


        CommonTree COMMA73_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:235:22: ( expr ( COMMA expr )* -> ^( IN_LISTS ( expr )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:236:2: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_inCondition_expr_bits838);
            expr72=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr72.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:236:6: ( COMMA expr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:236:7: COMMA expr
            	    {
            	    COMMA73=(Token)match(input,COMMA,FOLLOW_COMMA_in_inCondition_expr_bits840); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA73);


            	    pushFollow(FOLLOW_expr_in_inCondition_expr_bits842);
            	    expr74=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr74.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 236:19: -> ^( IN_LISTS ( expr )+ )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:236:21: ^( IN_LISTS ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IN_LISTS, "IN_LISTS")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "inCondition_expr_bits"


    public static class identifiers_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifiers"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:239:1: identifiers : columnNameAfterWhere ( COMMA identifier )* ;
    public final OracleParserParser.identifiers_return identifiers() throws RecognitionException {
        OracleParserParser.identifiers_return retval = new OracleParserParser.identifiers_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA76=null;
        OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere75 =null;

        OracleParserParser.identifier_return identifier77 =null;


        CommonTree COMMA76_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:240:2: ( columnNameAfterWhere ( COMMA identifier )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:240:3: columnNameAfterWhere ( COMMA identifier )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_columnNameAfterWhere_in_identifiers862);
            columnNameAfterWhere75=columnNameAfterWhere();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnNameAfterWhere75.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:240:24: ( COMMA identifier )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:240:25: COMMA identifier
            	    {
            	    COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifiers865); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    COMMA76_tree = 
            	    (CommonTree)adaptor.create(COMMA76)
            	    ;
            	    adaptor.addChild(root_0, COMMA76_tree);
            	    }

            	    pushFollow(FOLLOW_identifier_in_identifiers867);
            	    identifier77=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier77.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifiers"


    public static class comparisonCondition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisonCondition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:243:1: comparisonCondition : relational_op expr -> ^( relational_op expr ) ;
    public final OracleParserParser.comparisonCondition_return comparisonCondition() throws RecognitionException {
        OracleParserParser.comparisonCondition_return retval = new OracleParserParser.comparisonCondition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.relational_op_return relational_op78 =null;

        OracleParserParser.expr_return expr79 =null;


        RewriteRuleSubtreeStream stream_relational_op=new RewriteRuleSubtreeStream(adaptor,"rule relational_op");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:244:2: ( relational_op expr -> ^( relational_op expr ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:244:3: relational_op expr
            {
            pushFollow(FOLLOW_relational_op_in_comparisonCondition879);
            relational_op78=relational_op();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_relational_op.add(relational_op78.getTree());

            pushFollow(FOLLOW_expr_in_comparisonCondition881);
            expr79=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr79.getTree());

            // AST REWRITE
            // elements: relational_op, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 244:21: -> ^( relational_op expr )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:244:23: ^( relational_op expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_relational_op.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comparisonCondition"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:247:1: expr : ( expr_bit | subquery ) ;
    public final OracleParserParser.expr_return expr() throws RecognitionException {
        OracleParserParser.expr_return retval = new OracleParserParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.expr_bit_return expr_bit80 =null;

        OracleParserParser.subquery_return subquery81 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:247:6: ( ( expr_bit | subquery ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:247:7: ( expr_bit | subquery )
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:247:7: ( expr_bit | subquery )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ASTERISK||LA17_0==ID||(LA17_0 >= MINUS && LA17_0 <= N)||LA17_0==NUMBER||LA17_0==PLUS||LA17_0==QUOTED_STRING||LA17_0==94||LA17_0==99||LA17_0==102||LA17_0==119||LA17_0==128) ) {
                alt17=1;
            }
            else if ( (LA17_0==LPAREN) ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2==ASTERISK||LA17_2==ID||LA17_2==LPAREN||(LA17_2 >= MINUS && LA17_2 <= N)||LA17_2==NUMBER||LA17_2==PLUS||LA17_2==QUOTED_STRING||LA17_2==94||LA17_2==99||LA17_2==102||LA17_2==119||LA17_2==128) ) {
                    alt17=1;
                }
                else if ( (LA17_2==126) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:247:8: expr_bit
                    {
                    pushFollow(FOLLOW_expr_bit_in_expr898);
                    expr_bit80=expr_bit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bit80.getTree());

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:248:4: subquery
                    {
                    pushFollow(FOLLOW_subquery_in_expr903);
                    subquery81=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery81.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class subquery_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subquery"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:252:1: subquery : LPAREN select_command RPAREN -> ^( SUBQUERY select_command ) ;
    public final OracleParserParser.subquery_return subquery() throws RecognitionException {
        OracleParserParser.subquery_return retval = new OracleParserParser.subquery_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LPAREN82=null;
        Token RPAREN84=null;
        OracleParserParser.select_command_return select_command83 =null;


        CommonTree LPAREN82_tree=null;
        CommonTree RPAREN84_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_select_command=new RewriteRuleSubtreeStream(adaptor,"rule select_command");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:252:9: ( LPAREN select_command RPAREN -> ^( SUBQUERY select_command ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:253:2: LPAREN select_command RPAREN
            {
            LPAREN82=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subquery919); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN82);


            pushFollow(FOLLOW_select_command_in_subquery921);
            select_command83=select_command();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_select_command.add(select_command83.getTree());

            RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subquery923); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN84);


            // AST REWRITE
            // elements: select_command
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 253:30: -> ^( SUBQUERY select_command )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:253:32: ^( SUBQUERY select_command )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SUBQUERY, "SUBQUERY")
                , root_1);

                adaptor.addChild(root_1, stream_select_command.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subquery"


    public static class expr_bit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_bit"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:256:1: expr_bit : expr_add ( ( BITOR ^| BITAND ^| BITXOR ^| SHIFTLEFT ^| SHIFTRIGHT ^) ( expr_add ) )* ;
    public final OracleParserParser.expr_bit_return expr_bit() throws RecognitionException {
        OracleParserParser.expr_bit_return retval = new OracleParserParser.expr_bit_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BITOR86=null;
        Token BITAND87=null;
        Token BITXOR88=null;
        Token SHIFTLEFT89=null;
        Token SHIFTRIGHT90=null;
        OracleParserParser.expr_add_return expr_add85 =null;

        OracleParserParser.expr_add_return expr_add91 =null;


        CommonTree BITOR86_tree=null;
        CommonTree BITAND87_tree=null;
        CommonTree BITXOR88_tree=null;
        CommonTree SHIFTLEFT89_tree=null;
        CommonTree SHIFTRIGHT90_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:2: ( expr_add ( ( BITOR ^| BITAND ^| BITXOR ^| SHIFTLEFT ^| SHIFTRIGHT ^) ( expr_add ) )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:3: expr_add ( ( BITOR ^| BITAND ^| BITXOR ^| SHIFTLEFT ^| SHIFTRIGHT ^) ( expr_add ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_add_in_expr_bit941);
            expr_add85=expr_add();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add85.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:12: ( ( BITOR ^| BITAND ^| BITXOR ^| SHIFTLEFT ^| SHIFTRIGHT ^) ( expr_add ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= BITAND && LA19_0 <= BITXOR)||(LA19_0 >= SHIFTLEFT && LA19_0 <= SHIFTRIGHT)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:14: ( BITOR ^| BITAND ^| BITXOR ^| SHIFTLEFT ^| SHIFTRIGHT ^) ( expr_add )
            	    {
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:14: ( BITOR ^| BITAND ^| BITXOR ^| SHIFTLEFT ^| SHIFTRIGHT ^)
            	    int alt18=5;
            	    switch ( input.LA(1) ) {
            	    case BITOR:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case BITAND:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case BITXOR:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case SHIFTLEFT:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    case SHIFTRIGHT:
            	        {
            	        alt18=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:16: BITOR ^
            	            {
            	            BITOR86=(Token)match(input,BITOR,FOLLOW_BITOR_in_expr_bit947); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITOR86_tree = 
            	            (CommonTree)adaptor.create(BITOR86)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITOR86_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:25: BITAND ^
            	            {
            	            BITAND87=(Token)match(input,BITAND,FOLLOW_BITAND_in_expr_bit952); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITAND87_tree = 
            	            (CommonTree)adaptor.create(BITAND87)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITAND87_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:33: BITXOR ^
            	            {
            	            BITXOR88=(Token)match(input,BITXOR,FOLLOW_BITXOR_in_expr_bit955); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            BITXOR88_tree = 
            	            (CommonTree)adaptor.create(BITXOR88)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(BITXOR88_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:41: SHIFTLEFT ^
            	            {
            	            SHIFTLEFT89=(Token)match(input,SHIFTLEFT,FOLLOW_SHIFTLEFT_in_expr_bit958); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SHIFTLEFT89_tree = 
            	            (CommonTree)adaptor.create(SHIFTLEFT89)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SHIFTLEFT89_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:52: SHIFTRIGHT ^
            	            {
            	            SHIFTRIGHT90=(Token)match(input,SHIFTRIGHT,FOLLOW_SHIFTRIGHT_in_expr_bit961); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            SHIFTRIGHT90_tree = 
            	            (CommonTree)adaptor.create(SHIFTRIGHT90)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(SHIFTRIGHT90_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:65: ( expr_add )
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:257:66: expr_add
            	    {
            	    pushFollow(FOLLOW_expr_add_in_expr_bit966);
            	    expr_add91=expr_add();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add91.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_bit"


    public static class expr_add_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_add"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:259:1: expr_add : expr_mul ( ( PLUS ^| MINUS ^) ( expr_mul ) )* ;
    public final OracleParserParser.expr_add_return expr_add() throws RecognitionException {
        OracleParserParser.expr_add_return retval = new OracleParserParser.expr_add_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS93=null;
        Token MINUS94=null;
        OracleParserParser.expr_mul_return expr_mul92 =null;

        OracleParserParser.expr_mul_return expr_mul95 =null;


        CommonTree PLUS93_tree=null;
        CommonTree MINUS94_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:2: ( expr_mul ( ( PLUS ^| MINUS ^) ( expr_mul ) )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:3: expr_mul ( ( PLUS ^| MINUS ^) ( expr_mul ) )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_mul_in_expr_add979);
            expr_mul92=expr_mul();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul92.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:12: ( ( PLUS ^| MINUS ^) ( expr_mul ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==MINUS||LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:14: ( PLUS ^| MINUS ^) ( expr_mul )
            	    {
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:14: ( PLUS ^| MINUS ^)
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==PLUS) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==MINUS) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:16: PLUS ^
            	            {
            	            PLUS93=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_add985); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            PLUS93_tree = 
            	            (CommonTree)adaptor.create(PLUS93)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(PLUS93_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:24: MINUS ^
            	            {
            	            MINUS94=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_add990); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            MINUS94_tree = 
            	            (CommonTree)adaptor.create(MINUS94)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(MINUS94_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:33: ( expr_mul )
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:260:34: expr_mul
            	    {
            	    pushFollow(FOLLOW_expr_mul_in_expr_add996);
            	    expr_mul95=expr_mul();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul95.getTree());

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_add"


    public static class expr_mul_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_mul"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:262:1: expr_mul : expr_sign ( ( ASTERISK ^| DIVIDE ^) expr_sign )* ;
    public final OracleParserParser.expr_mul_return expr_mul() throws RecognitionException {
        OracleParserParser.expr_mul_return retval = new OracleParserParser.expr_mul_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASTERISK97=null;
        Token DIVIDE98=null;
        OracleParserParser.expr_sign_return expr_sign96 =null;

        OracleParserParser.expr_sign_return expr_sign99 =null;


        CommonTree ASTERISK97_tree=null;
        CommonTree DIVIDE98_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:263:2: ( expr_sign ( ( ASTERISK ^| DIVIDE ^) expr_sign )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:263:4: expr_sign ( ( ASTERISK ^| DIVIDE ^) expr_sign )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_sign_in_expr_mul1010);
            expr_sign96=expr_sign();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_sign96.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:263:14: ( ( ASTERISK ^| DIVIDE ^) expr_sign )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ASTERISK||LA23_0==DIVIDE) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:263:16: ( ASTERISK ^| DIVIDE ^) expr_sign
            	    {
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:263:16: ( ASTERISK ^| DIVIDE ^)
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==ASTERISK) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==DIVIDE) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:263:18: ASTERISK ^
            	            {
            	            ASTERISK97=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_expr_mul1016); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            ASTERISK97_tree = 
            	            (CommonTree)adaptor.create(ASTERISK97)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(ASTERISK97_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:263:30: DIVIDE ^
            	            {
            	            DIVIDE98=(Token)match(input,DIVIDE,FOLLOW_DIVIDE_in_expr_mul1021); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            DIVIDE98_tree = 
            	            (CommonTree)adaptor.create(DIVIDE98)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(DIVIDE98_tree, root_0);
            	            }

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_expr_sign_in_expr_mul1026);
            	    expr_sign99=expr_sign();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_sign99.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_mul"


    public static class expr_sign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_sign"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:265:1: expr_sign : ( PLUS expr_pow -> ^( POSITIVE expr_pow ) | MINUS expr_pow -> ^( NEGATIVE expr_pow ) | expr_pow );
    public final OracleParserParser.expr_sign_return expr_sign() throws RecognitionException {
        OracleParserParser.expr_sign_return retval = new OracleParserParser.expr_sign_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS100=null;
        Token MINUS102=null;
        OracleParserParser.expr_pow_return expr_pow101 =null;

        OracleParserParser.expr_pow_return expr_pow103 =null;

        OracleParserParser.expr_pow_return expr_pow104 =null;


        CommonTree PLUS100_tree=null;
        CommonTree MINUS102_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_expr_pow=new RewriteRuleSubtreeStream(adaptor,"rule expr_pow");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:266:2: ( PLUS expr_pow -> ^( POSITIVE expr_pow ) | MINUS expr_pow -> ^( NEGATIVE expr_pow ) | expr_pow )
            int alt24=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt24=1;
                }
                break;
            case MINUS:
                {
                alt24=2;
                }
                break;
            case ASTERISK:
            case ID:
            case LPAREN:
            case N:
            case NUMBER:
            case QUOTED_STRING:
            case 94:
            case 99:
            case 102:
            case 119:
            case 128:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:266:4: PLUS expr_pow
                    {
                    PLUS100=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr_sign1039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS.add(PLUS100);


                    pushFollow(FOLLOW_expr_pow_in_expr_sign1041);
                    expr_pow101=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_pow.add(expr_pow101.getTree());

                    // AST REWRITE
                    // elements: expr_pow
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 266:18: -> ^( POSITIVE expr_pow )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:266:21: ^( POSITIVE expr_pow )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(POSITIVE, "POSITIVE")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr_pow.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:267:4: MINUS expr_pow
                    {
                    MINUS102=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr_sign1054); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS.add(MINUS102);


                    pushFollow(FOLLOW_expr_pow_in_expr_sign1056);
                    expr_pow103=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expr_pow.add(expr_pow103.getTree());

                    // AST REWRITE
                    // elements: expr_pow
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 267:19: -> ^( NEGATIVE expr_pow )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:267:22: ^( NEGATIVE expr_pow )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NEGATIVE, "NEGATIVE")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr_pow.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:268:4: expr_pow
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_pow_in_expr_sign1069);
                    expr_pow104=expr_pow();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_pow104.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_sign"


    public static class expr_pow_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_pow"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:270:1: expr_pow : expr_expr ( EXPONENT ^ expr_expr )* ;
    public final OracleParserParser.expr_pow_return expr_pow() throws RecognitionException {
        OracleParserParser.expr_pow_return retval = new OracleParserParser.expr_pow_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EXPONENT106=null;
        OracleParserParser.expr_expr_return expr_expr105 =null;

        OracleParserParser.expr_expr_return expr_expr107 =null;


        CommonTree EXPONENT106_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:271:2: ( expr_expr ( EXPONENT ^ expr_expr )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:271:4: expr_expr ( EXPONENT ^ expr_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_expr_in_expr_pow1079);
            expr_expr105=expr_expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_expr105.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:271:14: ( EXPONENT ^ expr_expr )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==EXPONENT) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:271:16: EXPONENT ^ expr_expr
            	    {
            	    EXPONENT106=(Token)match(input,EXPONENT,FOLLOW_EXPONENT_in_expr_pow1083); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EXPONENT106_tree = 
            	    (CommonTree)adaptor.create(EXPONENT106)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(EXPONENT106_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_expr_expr_in_expr_pow1086);
            	    expr_expr107=expr_expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_expr107.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_pow"


    public static class expr_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_expr"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:274:1: expr_expr : ( value | boolean_literal | 'NULL' |{...}? ID ( LPAREN ( values_func )? RPAREN ) -> ^( ID ( values_func )? ) |{...}? ID -> ^( CONSIST ID ) | 'CAST' LPAREN values_func 'AS' ID RPAREN -> ^( CAST values_func ID ) );
    public final OracleParserParser.expr_expr_return expr_expr() throws RecognitionException {
        OracleParserParser.expr_expr_return retval = new OracleParserParser.expr_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal110=null;
        Token ID111=null;
        Token LPAREN112=null;
        Token RPAREN114=null;
        Token ID115=null;
        Token string_literal116=null;
        Token LPAREN117=null;
        Token string_literal119=null;
        Token ID120=null;
        Token RPAREN121=null;
        OracleParserParser.value_return value108 =null;

        OracleParserParser.boolean_literal_return boolean_literal109 =null;

        OracleParserParser.values_func_return values_func113 =null;

        OracleParserParser.values_func_return values_func118 =null;


        CommonTree string_literal110_tree=null;
        CommonTree ID111_tree=null;
        CommonTree LPAREN112_tree=null;
        CommonTree RPAREN114_tree=null;
        CommonTree ID115_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree LPAREN117_tree=null;
        CommonTree string_literal119_tree=null;
        CommonTree ID120_tree=null;
        CommonTree RPAREN121_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_values_func=new RewriteRuleSubtreeStream(adaptor,"rule values_func");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:275:2: ( value | boolean_literal | 'NULL' |{...}? ID ( LPAREN ( values_func )? RPAREN ) -> ^( ID ( values_func )? ) |{...}? ID -> ^( CONSIST ID ) | 'CAST' LPAREN values_func 'AS' ID RPAREN -> ^( CAST values_func ID ) )
            int alt27=6;
            switch ( input.LA(1) ) {
            case ASTERISK:
            case LPAREN:
            case N:
            case NUMBER:
            case QUOTED_STRING:
            case 94:
                {
                alt27=1;
                }
                break;
            case ID:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==LPAREN) ) {
                    alt27=4;
                }
                else if ( (!(((consistStringRegister.containsKey(input.LT(1).getText().toUpperCase()))))) ) {
                    alt27=1;
                }
                else if ( ((consistStringRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                    alt27=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;

                }
                }
                break;
            case 102:
            case 128:
                {
                alt27=2;
                }
                break;
            case 119:
                {
                alt27=3;
                }
                break;
            case 99:
                {
                alt27=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:275:3: value
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_value_in_expr_expr1099);
                    value108=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, value108.getTree());

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:276:3: boolean_literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_boolean_literal_in_expr_expr1103);
                    boolean_literal109=boolean_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, boolean_literal109.getTree());

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:277:3: 'NULL'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    string_literal110=(Token)match(input,119,FOLLOW_119_in_expr_expr1107); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal110_tree = 
                    (CommonTree)adaptor.create(string_literal110)
                    ;
                    adaptor.addChild(root_0, string_literal110_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:280:3: {...}? ID ( LPAREN ( values_func )? RPAREN )
                    {
                    if ( !((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "expr_expr", "functionRegister.containsKey(input.LT(1).getText().toUpperCase())");
                    }

                    ID111=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1115); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID111);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:280:75: ( LPAREN ( values_func )? RPAREN )
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:280:76: LPAREN ( values_func )? RPAREN
                    {
                    LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_expr1118); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN112);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:280:83: ( values_func )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==ASTERISK||LA26_0==ID||LA26_0==LPAREN||(LA26_0 >= MINUS && LA26_0 <= N)||LA26_0==NUMBER||LA26_0==PLUS||LA26_0==QUOTED_STRING||LA26_0==94||LA26_0==99||LA26_0==102||LA26_0==119||LA26_0==128) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:280:83: values_func
                            {
                            pushFollow(FOLLOW_values_func_in_expr_expr1120);
                            values_func113=values_func();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_values_func.add(values_func113.getTree());

                            }
                            break;

                    }


                    RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_expr1123); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN114);


                    }


                    // AST REWRITE
                    // elements: values_func, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 280:103: -> ^( ID ( values_func )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:280:105: ^( ID ( values_func )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ID.nextNode()
                        , root_1);

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:280:110: ( values_func )?
                        if ( stream_values_func.hasNext() ) {
                            adaptor.addChild(root_1, stream_values_func.nextTree());

                        }
                        stream_values_func.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:281:3: {...}? ID
                    {
                    if ( !((consistStringRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "expr_expr", "consistStringRegister.containsKey(input.LT(1).getText().toUpperCase())");
                    }

                    ID115=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1137); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID115);


                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 281:80: -> ^( CONSIST ID )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:281:82: ^( CONSIST ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSIST, "CONSIST")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:282:3: 'CAST' LPAREN values_func 'AS' ID RPAREN
                    {
                    string_literal116=(Token)match(input,99,FOLLOW_99_in_expr_expr1148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_99.add(string_literal116);


                    LPAREN117=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_expr_expr1150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN117);


                    pushFollow(FOLLOW_values_func_in_expr_expr1152);
                    values_func118=values_func();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_values_func.add(values_func118.getTree());

                    string_literal119=(Token)match(input,96,FOLLOW_96_in_expr_expr1154); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(string_literal119);


                    ID120=(Token)match(input,ID,FOLLOW_ID_in_expr_expr1156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID120);


                    RPAREN121=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_expr_expr1158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN121);


                    // AST REWRITE
                    // elements: values_func, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 282:43: -> ^( CAST values_func ID )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:282:45: ^( CAST values_func ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CAST, "CAST")
                        , root_1);

                        adaptor.addChild(root_1, stream_values_func.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr_expr"


    public static class sql_condition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "sql_condition"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:287:1: sql_condition : condition_or ;
    public final OracleParserParser.sql_condition_return sql_condition() throws RecognitionException {
        OracleParserParser.sql_condition_return retval = new OracleParserParser.sql_condition_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.condition_or_return condition_or122 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:288:2: ( condition_or )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:288:4: condition_or
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_condition_or_in_sql_condition1178);
            condition_or122=condition_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, condition_or122.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "sql_condition"


    public static class relational_op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_op"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:290:1: relational_op : ( EQ | LTH | GTH | NOT_EQ | LEQ | GEQ );
    public final OracleParserParser.relational_op_return relational_op() throws RecognitionException {
        OracleParserParser.relational_op_return retval = new OracleParserParser.relational_op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set123=null;

        CommonTree set123_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:291:2: ( EQ | LTH | GTH | NOT_EQ | LEQ | GEQ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set123=(Token)input.LT(1);

            if ( input.LA(1)==EQ||input.LA(1)==GEQ||input.LA(1)==GTH||input.LA(1)==LEQ||input.LA(1)==LTH||input.LA(1)==NOT_EQ ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set123)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_op"


    public static class fromClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:294:1: fromClause : 'FROM' ! selected_table ;
    public final OracleParserParser.fromClause_return fromClause() throws RecognitionException {
        OracleParserParser.fromClause_return retval = new OracleParserParser.fromClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal124=null;
        OracleParserParser.selected_table_return selected_table125 =null;


        CommonTree string_literal124_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:295:2: ( 'FROM' ! selected_table )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:295:3: 'FROM' ! selected_table
            {
            root_0 = (CommonTree)adaptor.nil();


            string_literal124=(Token)match(input,104,FOLLOW_104_in_fromClause1218); if (state.failed) return retval;

            pushFollow(FOLLOW_selected_table_in_fromClause1221);
            selected_table125=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selected_table125.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fromClause"


    public static class select_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_list"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:298:1: select_list : displayed_column ( COMMA displayed_column )* -> ^( SELECT_LIST ( displayed_column )+ ) ;
    public final OracleParserParser.select_list_return select_list() throws RecognitionException {
        OracleParserParser.select_list_return retval = new OracleParserParser.select_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA127=null;
        OracleParserParser.displayed_column_return displayed_column126 =null;

        OracleParserParser.displayed_column_return displayed_column128 =null;


        CommonTree COMMA127_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_displayed_column=new RewriteRuleSubtreeStream(adaptor,"rule displayed_column");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:299:2: ( displayed_column ( COMMA displayed_column )* -> ^( SELECT_LIST ( displayed_column )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:299:4: displayed_column ( COMMA displayed_column )*
            {
            pushFollow(FOLLOW_displayed_column_in_select_list1232);
            displayed_column126=displayed_column();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_displayed_column.add(displayed_column126.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:299:21: ( COMMA displayed_column )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:299:23: COMMA displayed_column
            	    {
            	    COMMA127=(Token)match(input,COMMA,FOLLOW_COMMA_in_select_list1236); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA127);


            	    pushFollow(FOLLOW_displayed_column_in_select_list1238);
            	    displayed_column128=displayed_column();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_displayed_column.add(displayed_column128.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // AST REWRITE
            // elements: displayed_column
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 299:48: -> ^( SELECT_LIST ( displayed_column )+ )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:299:50: ^( SELECT_LIST ( displayed_column )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT_LIST, "SELECT_LIST")
                , root_1);

                if ( !(stream_displayed_column.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_displayed_column.hasNext() ) {
                    adaptor.addChild(root_1, stream_displayed_column.nextTree());

                }
                stream_displayed_column.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_list"


    public static class displayed_column_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "displayed_column"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:302:1: displayed_column : ({...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )? -> ^( ID ( values_func )? ( alias )? ) |{...}? ID ( alias )? -> ^( CONSIST ID ( alias )? ) | ( table_alias )? column ( alias )? -> ^( COLUMN ( table_alias )? column ( alias )? ) );
    public final OracleParserParser.displayed_column_return displayed_column() throws RecognitionException {
        OracleParserParser.displayed_column_return retval = new OracleParserParser.displayed_column_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID129=null;
        Token LPAREN130=null;
        Token RPAREN132=null;
        Token ID134=null;
        OracleParserParser.values_func_return values_func131 =null;

        OracleParserParser.alias_return alias133 =null;

        OracleParserParser.alias_return alias135 =null;

        OracleParserParser.table_alias_return table_alias136 =null;

        OracleParserParser.column_return column137 =null;

        OracleParserParser.alias_return alias138 =null;


        CommonTree ID129_tree=null;
        CommonTree LPAREN130_tree=null;
        CommonTree RPAREN132_tree=null;
        CommonTree ID134_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias");
        RewriteRuleSubtreeStream stream_column=new RewriteRuleSubtreeStream(adaptor,"rule column");
        RewriteRuleSubtreeStream stream_values_func=new RewriteRuleSubtreeStream(adaptor,"rule values_func");
        RewriteRuleSubtreeStream stream_table_alias=new RewriteRuleSubtreeStream(adaptor,"rule table_alias");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:303:2: ({...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )? -> ^( ID ( values_func )? ( alias )? ) |{...}? ID ( alias )? -> ^( CONSIST ID ( alias )? ) | ( table_alias )? column ( alias )? -> ^( COLUMN ( table_alias )? column ( alias )? ) )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==LPAREN) ) {
                    alt34=1;
                }
                else if ( ((consistStringRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                    alt34=2;
                }
                else if ( (true) ) {
                    alt34=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA34_0==ASTERISK||LA34_0==N) ) {
                alt34=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:2: {...}? ID ( ( LPAREN ( values_func )? RPAREN ) ) ( alias )?
                    {
                    if ( !((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "displayed_column", "functionRegister.containsKey(input.LT(1).getText().toUpperCase())");
                    }

                    ID129=(Token)match(input,ID,FOLLOW_ID_in_displayed_column1263); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID129);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:74: ( ( LPAREN ( values_func )? RPAREN ) )
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:75: ( LPAREN ( values_func )? RPAREN )
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:75: ( LPAREN ( values_func )? RPAREN )
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:76: LPAREN ( values_func )? RPAREN
                    {
                    LPAREN130=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_displayed_column1267); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN130);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:83: ( values_func )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==ASTERISK||LA29_0==ID||LA29_0==LPAREN||(LA29_0 >= MINUS && LA29_0 <= N)||LA29_0==NUMBER||LA29_0==PLUS||LA29_0==QUOTED_STRING||LA29_0==94||LA29_0==99||LA29_0==102||LA29_0==119||LA29_0==128) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:83: values_func
                            {
                            pushFollow(FOLLOW_values_func_in_displayed_column1269);
                            values_func131=values_func();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_values_func.add(values_func131.getTree());

                            }
                            break;

                    }


                    RPAREN132=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_displayed_column1272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN132);


                    }


                    }


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:105: ( alias )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==ID||LA30_0==96) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:105: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1276);
                            alias133=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias133.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: alias, values_func, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 304:111: -> ^( ID ( values_func )? ( alias )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:113: ^( ID ( values_func )? ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ID.nextNode()
                        , root_1);

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:118: ( values_func )?
                        if ( stream_values_func.hasNext() ) {
                            adaptor.addChild(root_1, stream_values_func.nextTree());

                        }
                        stream_values_func.reset();

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:304:131: ( alias )?
                        if ( stream_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_alias.nextTree());

                        }
                        stream_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:305:3: {...}? ID ( alias )?
                    {
                    if ( !((consistStringRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "displayed_column", "consistStringRegister.containsKey(input.LT(1).getText().toUpperCase())");
                    }

                    ID134=(Token)match(input,ID,FOLLOW_ID_in_displayed_column1293); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID134);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:305:80: ( alias )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ID||LA31_0==96) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:305:80: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1295);
                            alias135=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias135.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: ID, alias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 305:87: -> ^( CONSIST ID ( alias )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:305:89: ^( CONSIST ID ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(CONSIST, "CONSIST")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:305:102: ( alias )?
                        if ( stream_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_alias.nextTree());

                        }
                        stream_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:3: ( table_alias )? column ( alias )?
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:3: ( table_alias )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==ID) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==DOT) ) {
                            alt32=1;
                        }
                    }
                    switch (alt32) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_displayed_column1310);
                            table_alias136=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias136.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_displayed_column1314);
                    column137=column();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_column.add(column137.getTree());

                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:24: ( alias )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==ID||LA33_0==96) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:25: alias
                            {
                            pushFollow(FOLLOW_alias_in_displayed_column1317);
                            alias138=alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_alias.add(alias138.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: table_alias, alias, column
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 306:32: -> ^( COLUMN ( table_alias )? column ( alias )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:34: ^( COLUMN ( table_alias )? column ( alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COLUMN, "COLUMN")
                        , root_1);

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:43: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_1, stream_column.nextTree());

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:306:63: ( alias )?
                        if ( stream_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_alias.nextTree());

                        }
                        stream_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "displayed_column"


    public static class columnNameAfterWhere_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnNameAfterWhere"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:309:1: columnNameAfterWhere : ( ( table_alias )? identifier -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier ASC -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier DESC -> ^( DESC identifier ( table_alias )? ) );
    public final OracleParserParser.columnNameAfterWhere_return columnNameAfterWhere() throws RecognitionException {
        OracleParserParser.columnNameAfterWhere_return retval = new OracleParserParser.columnNameAfterWhere_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASC143=null;
        Token DESC146=null;
        OracleParserParser.table_alias_return table_alias139 =null;

        OracleParserParser.identifier_return identifier140 =null;

        OracleParserParser.table_alias_return table_alias141 =null;

        OracleParserParser.identifier_return identifier142 =null;

        OracleParserParser.table_alias_return table_alias144 =null;

        OracleParserParser.identifier_return identifier145 =null;


        CommonTree ASC143_tree=null;
        CommonTree DESC146_tree=null;
        RewriteRuleTokenStream stream_DESC=new RewriteRuleTokenStream(adaptor,"token DESC");
        RewriteRuleTokenStream stream_ASC=new RewriteRuleTokenStream(adaptor,"token ASC");
        RewriteRuleSubtreeStream stream_table_alias=new RewriteRuleSubtreeStream(adaptor,"rule table_alias");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:310:2: ( ( table_alias )? identifier -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier ASC -> ^( ASC identifier ( table_alias )? ) | ( table_alias )? identifier DESC -> ^( DESC identifier ( table_alias )? ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==ID) ) {
                switch ( input.LA(2) ) {
                case DOT:
                    {
                    int LA38_2 = input.LA(3);

                    if ( (LA38_2==ID) ) {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case COMMA:
                        case RPAREN:
                        case 103:
                        case 123:
                            {
                            alt38=1;
                            }
                            break;
                        case ASC:
                            {
                            alt38=2;
                            }
                            break;
                        case DESC:
                            {
                            alt38=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 38, 6, input);

                            throw nvae;

                        }

                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 2, input);

                        throw nvae;

                    }
                    }
                    break;
                case EOF:
                case COMMA:
                case RPAREN:
                case 103:
                case 123:
                    {
                    alt38=1;
                    }
                    break;
                case ASC:
                    {
                    alt38=2;
                    }
                    break;
                case DESC:
                    {
                    alt38=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:310:3: ( table_alias )? identifier
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:310:3: ( table_alias )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ID) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==DOT) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:310:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1342);
                            table_alias139=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias139.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1345);
                    identifier140=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier140.getTree());

                    // AST REWRITE
                    // elements: table_alias, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 310:28: -> ^( ASC identifier ( table_alias )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:310:30: ^( ASC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ASC, "ASC")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:310:47: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:311:3: ( table_alias )? identifier ASC
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:311:3: ( table_alias )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==ID) ) {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==DOT) ) {
                            alt36=1;
                        }
                    }
                    switch (alt36) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:311:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1360);
                            table_alias141=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias141.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1363);
                    identifier142=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier142.getTree());

                    ASC143=(Token)match(input,ASC,FOLLOW_ASC_in_columnNameAfterWhere1366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASC.add(ASC143);


                    // AST REWRITE
                    // elements: table_alias, identifier, ASC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 311:33: -> ^( ASC identifier ( table_alias )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:311:35: ^( ASC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ASC.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:311:52: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:312:3: ( table_alias )? identifier DESC
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:312:3: ( table_alias )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==ID) ) {
                        int LA37_1 = input.LA(2);

                        if ( (LA37_1==DOT) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:312:3: table_alias
                            {
                            pushFollow(FOLLOW_table_alias_in_columnNameAfterWhere1381);
                            table_alias144=table_alias();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_alias.add(table_alias144.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_columnNameAfterWhere1384);
                    identifier145=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier145.getTree());

                    DESC146=(Token)match(input,DESC,FOLLOW_DESC_in_columnNameAfterWhere1387); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DESC.add(DESC146);


                    // AST REWRITE
                    // elements: DESC, table_alias, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 312:33: -> ^( DESC identifier ( table_alias )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:312:35: ^( DESC identifier ( table_alias )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_DESC.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:312:53: ( table_alias )?
                        if ( stream_table_alias.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_alias.nextTree());

                        }
                        stream_table_alias.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnNameAfterWhere"


    public static class columnNameInUpdate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "columnNameInUpdate"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:315:1: columnNameInUpdate : ( table_alias )? identifier ;
    public final OracleParserParser.columnNameInUpdate_return columnNameInUpdate() throws RecognitionException {
        OracleParserParser.columnNameInUpdate_return retval = new OracleParserParser.columnNameInUpdate_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.table_alias_return table_alias147 =null;

        OracleParserParser.identifier_return identifier148 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:316:2: ( ( table_alias )? identifier )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:316:3: ( table_alias )? identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:316:3: ( table_alias )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==DOT) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:316:3: table_alias
                    {
                    pushFollow(FOLLOW_table_alias_in_columnNameInUpdate1409);
                    table_alias147=table_alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, table_alias147.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_columnNameInUpdate1412);
            identifier148=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier148.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "columnNameInUpdate"


    public static class table_alias_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_alias"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:318:1: table_alias : identifier DOT -> ^( COL_TAB identifier ) ;
    public final OracleParserParser.table_alias_return table_alias() throws RecognitionException {
        OracleParserParser.table_alias_return retval = new OracleParserParser.table_alias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT150=null;
        OracleParserParser.identifier_return identifier149 =null;


        CommonTree DOT150_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:319:2: ( identifier DOT -> ^( COL_TAB identifier ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:319:3: identifier DOT
            {
            pushFollow(FOLLOW_identifier_in_table_alias1422);
            identifier149=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier149.getTree());

            DOT150=(Token)match(input,DOT,FOLLOW_DOT_in_table_alias1424); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(DOT150);


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 319:17: -> ^( COL_TAB identifier )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:319:19: ^( COL_TAB identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COL_TAB, "COL_TAB")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_alias"


    public static class column_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:321:1: column : ( ASTERISK |{...}? N | identifier );
    public final OracleParserParser.column_return column() throws RecognitionException {
        OracleParserParser.column_return retval = new OracleParserParser.column_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ASTERISK151=null;
        Token N152=null;
        OracleParserParser.identifier_return identifier153 =null;


        CommonTree ASTERISK151_tree=null;
        CommonTree N152_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:322:2: ( ASTERISK |{...}? N | identifier )
            int alt40=3;
            switch ( input.LA(1) ) {
            case ASTERISK:
                {
                alt40=1;
                }
                break;
            case N:
                {
                alt40=2;
                }
                break;
            case ID:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:322:3: ASTERISK
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ASTERISK151=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_column1440); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASTERISK151_tree = 
                    (CommonTree)adaptor.create(ASTERISK151)
                    ;
                    adaptor.addChild(root_0, ASTERISK151_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:323:3: {...}? N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    if ( !(("1".equals(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "column", "\"1\".equals(input.LT(1).getText().toUpperCase())");
                    }

                    N152=(Token)match(input,N,FOLLOW_N_in_column1446); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    N152_tree = 
                    (CommonTree)adaptor.create(N152)
                    ;
                    adaptor.addChild(root_0, N152_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:324:3: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifier_in_column1450);
                    identifier153=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier153.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column"


    public static class values_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "values"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:326:1: values : expr ( COMMA expr )* -> ^( INSERT_VAL ( expr )* ) ;
    public final OracleParserParser.values_return values() throws RecognitionException {
        OracleParserParser.values_return retval = new OracleParserParser.values_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA155=null;
        OracleParserParser.expr_return expr154 =null;

        OracleParserParser.expr_return expr156 =null;


        CommonTree COMMA155_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:327:2: ( expr ( COMMA expr )* -> ^( INSERT_VAL ( expr )* ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:327:3: expr ( COMMA expr )*
            {
            pushFollow(FOLLOW_expr_in_values1459);
            expr154=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr154.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:327:8: ( COMMA expr )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:327:10: COMMA expr
            	    {
            	    COMMA155=(Token)match(input,COMMA,FOLLOW_COMMA_in_values1463); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA155);


            	    pushFollow(FOLLOW_expr_in_values1465);
            	    expr156=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr.add(expr156.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 327:23: -> ^( INSERT_VAL ( expr )* )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:327:25: ^( INSERT_VAL ( expr )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INSERT_VAL, "INSERT_VAL")
                , root_1);

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:327:38: ( expr )*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "values"


    public static class values_func_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "values_func"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:329:1: values_func : expr ( COMMA ! expr )* ;
    public final OracleParserParser.values_func_return values_func() throws RecognitionException {
        OracleParserParser.values_func_return retval = new OracleParserParser.values_func_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA158=null;
        OracleParserParser.expr_return expr157 =null;

        OracleParserParser.expr_return expr159 =null;


        CommonTree COMMA158_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:330:2: ( expr ( COMMA ! expr )* )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:330:3: expr ( COMMA ! expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_expr_in_values_func1484);
            expr157=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr157.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:330:8: ( COMMA ! expr )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMA) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:330:10: COMMA ! expr
            	    {
            	    COMMA158=(Token)match(input,COMMA,FOLLOW_COMMA_in_values_func1488); if (state.failed) return retval;

            	    pushFollow(FOLLOW_expr_in_values_func1491);
            	    expr159=expr();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr159.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "values_func"


    public static class value_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:332:1: value : ( N | NUMBER | '?' | LPAREN ! expr RPAREN !| quoted_string -> ^( QUTED_STR quoted_string ) | column_spec );
    public final OracleParserParser.value_return value() throws RecognitionException {
        OracleParserParser.value_return retval = new OracleParserParser.value_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token N160=null;
        Token NUMBER161=null;
        Token char_literal162=null;
        Token LPAREN163=null;
        Token RPAREN165=null;
        OracleParserParser.expr_return expr164 =null;

        OracleParserParser.quoted_string_return quoted_string166 =null;

        OracleParserParser.column_spec_return column_spec167 =null;


        CommonTree N160_tree=null;
        CommonTree NUMBER161_tree=null;
        CommonTree char_literal162_tree=null;
        CommonTree LPAREN163_tree=null;
        CommonTree RPAREN165_tree=null;
        RewriteRuleSubtreeStream stream_quoted_string=new RewriteRuleSubtreeStream(adaptor,"rule quoted_string");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:333:2: ( N | NUMBER | '?' | LPAREN ! expr RPAREN !| quoted_string -> ^( QUTED_STR quoted_string ) | column_spec )
            int alt43=6;
            switch ( input.LA(1) ) {
            case N:
                {
                alt43=1;
                }
                break;
            case NUMBER:
                {
                alt43=2;
                }
                break;
            case 94:
                {
                alt43=3;
                }
                break;
            case LPAREN:
                {
                alt43=4;
                }
                break;
            case QUOTED_STRING:
                {
                alt43=5;
                }
                break;
            case ASTERISK:
            case ID:
                {
                alt43=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:333:3: N
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    N160=(Token)match(input,N,FOLLOW_N_in_value1505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    N160_tree = 
                    (CommonTree)adaptor.create(N160)
                    ;
                    adaptor.addChild(root_0, N160_tree);
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:334:3: NUMBER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    NUMBER161=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_value1509); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NUMBER161_tree = 
                    (CommonTree)adaptor.create(NUMBER161)
                    ;
                    adaptor.addChild(root_0, NUMBER161_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:335:3: '?'
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal162=(Token)match(input,94,FOLLOW_94_in_value1513); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal162_tree = 
                    (CommonTree)adaptor.create(char_literal162)
                    ;
                    adaptor.addChild(root_0, char_literal162_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:336:3: LPAREN ! expr RPAREN !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LPAREN163=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_value1517); if (state.failed) return retval;

                    pushFollow(FOLLOW_expr_in_value1520);
                    expr164=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr164.getTree());

                    RPAREN165=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_value1522); if (state.failed) return retval;

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:337:3: quoted_string
                    {
                    pushFollow(FOLLOW_quoted_string_in_value1527);
                    quoted_string166=quoted_string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quoted_string.add(quoted_string166.getTree());

                    // AST REWRITE
                    // elements: quoted_string
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 337:17: -> ^( QUTED_STR quoted_string )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:337:19: ^( QUTED_STR quoted_string )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(QUTED_STR, "QUTED_STR")
                        , root_1);

                        adaptor.addChild(root_1, stream_quoted_string.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:338:3: column_spec
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_column_spec_in_value1538);
                    column_spec167=column_spec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, column_spec167.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class column_specs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_specs"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:342:1: column_specs : column_spec ( COMMA column_spec )* -> ^( COLUMNS ( column_spec )+ ) ;
    public final OracleParserParser.column_specs_return column_specs() throws RecognitionException {
        OracleParserParser.column_specs_return retval = new OracleParserParser.column_specs_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA169=null;
        OracleParserParser.column_spec_return column_spec168 =null;

        OracleParserParser.column_spec_return column_spec170 =null;


        CommonTree COMMA169_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_column_spec=new RewriteRuleSubtreeStream(adaptor,"rule column_spec");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:343:2: ( column_spec ( COMMA column_spec )* -> ^( COLUMNS ( column_spec )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:343:4: column_spec ( COMMA column_spec )*
            {
            pushFollow(FOLLOW_column_spec_in_column_specs1550);
            column_spec168=column_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_column_spec.add(column_spec168.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:343:16: ( COMMA column_spec )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:343:18: COMMA column_spec
            	    {
            	    COMMA169=(Token)match(input,COMMA,FOLLOW_COMMA_in_column_specs1554); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA169);


            	    pushFollow(FOLLOW_column_spec_in_column_specs1556);
            	    column_spec170=column_spec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_column_spec.add(column_spec170.getTree());

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            // AST REWRITE
            // elements: column_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 343:38: -> ^( COLUMNS ( column_spec )+ )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:343:40: ^( COLUMNS ( column_spec )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(COLUMNS, "COLUMNS")
                , root_1);

                if ( !(stream_column_spec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_column_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_column_spec.nextTree());

                }
                stream_column_spec.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_specs"


    public static class selected_table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selected_table"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:346:1: selected_table : a_table ( COMMA a_table )* -> ^( TABLENAMES ( a_table )+ ) ;
    public final OracleParserParser.selected_table_return selected_table() throws RecognitionException {
        OracleParserParser.selected_table_return retval = new OracleParserParser.selected_table_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMMA172=null;
        OracleParserParser.a_table_return a_table171 =null;

        OracleParserParser.a_table_return a_table173 =null;


        CommonTree COMMA172_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_a_table=new RewriteRuleSubtreeStream(adaptor,"rule a_table");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:347:2: ( a_table ( COMMA a_table )* -> ^( TABLENAMES ( a_table )+ ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:347:3: a_table ( COMMA a_table )*
            {
            pushFollow(FOLLOW_a_table_in_selected_table1577);
            a_table171=a_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_a_table.add(a_table171.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:347:11: ( COMMA a_table )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==COMMA) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:347:12: COMMA a_table
            	    {
            	    COMMA172=(Token)match(input,COMMA,FOLLOW_COMMA_in_selected_table1580); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA172);


            	    pushFollow(FOLLOW_a_table_in_selected_table1582);
            	    a_table173=a_table();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_a_table.add(a_table173.getTree());

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            // AST REWRITE
            // elements: a_table
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 347:27: -> ^( TABLENAMES ( a_table )+ )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:347:29: ^( TABLENAMES ( a_table )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TABLENAMES, "TABLENAMES")
                , root_1);

                if ( !(stream_a_table.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_a_table.hasNext() ) {
                    adaptor.addChild(root_1, stream_a_table.nextTree());

                }
                stream_a_table.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selected_table"


    public static class a_table_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "a_table"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:349:1: a_table : table_spec ( alias )? ( join_claus )? -> ^( TABLENAME table_spec ( alias )? ( join_claus )? ) ;
    public final OracleParserParser.a_table_return a_table() throws RecognitionException {
        OracleParserParser.a_table_return retval = new OracleParserParser.a_table_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.table_spec_return table_spec174 =null;

        OracleParserParser.alias_return alias175 =null;

        OracleParserParser.join_claus_return join_claus176 =null;


        RewriteRuleSubtreeStream stream_join_claus=new RewriteRuleSubtreeStream(adaptor,"rule join_claus");
        RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias");
        RewriteRuleSubtreeStream stream_table_spec=new RewriteRuleSubtreeStream(adaptor,"rule table_spec");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:2: ( table_spec ( alias )? ( join_claus )? -> ^( TABLENAME table_spec ( alias )? ( join_claus )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:3: table_spec ( alias )? ( join_claus )?
            {
            pushFollow(FOLLOW_table_spec_in_a_table1600);
            table_spec174=table_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_spec.add(table_spec174.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:15: ( alias )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ID||LA46_0==96) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:15: alias
                    {
                    pushFollow(FOLLOW_alias_in_a_table1603);
                    alias175=alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alias.add(alias175.getTree());

                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:22: ( join_claus )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==100||LA47_0==105||LA47_0==109||(LA47_0 >= 113 && LA47_0 <= 114)||LA47_0==125||LA47_0==129) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:22: join_claus
                    {
                    pushFollow(FOLLOW_join_claus_in_a_table1606);
                    join_claus176=join_claus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join_claus.add(join_claus176.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: join_claus, alias, table_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 350:33: -> ^( TABLENAME table_spec ( alias )? ( join_claus )? )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:35: ^( TABLENAME table_spec ( alias )? ( join_claus )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(TABLENAME, "TABLENAME")
                , root_1);

                adaptor.addChild(root_1, stream_table_spec.nextTree());

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:58: ( alias )?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:350:65: ( join_claus )?
                if ( stream_join_claus.hasNext() ) {
                    adaptor.addChild(root_1, stream_join_claus.nextTree());

                }
                stream_join_claus.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "a_table"


    public static class table_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_spec"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:352:1: table_spec : ( ( schema_name DOT !)? table_name | subquery |{...}? ID LPAREN values_func RPAREN -> ^( ID ( values_func )? ) );
    public final OracleParserParser.table_spec_return table_spec() throws RecognitionException {
        OracleParserParser.table_spec_return retval = new OracleParserParser.table_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT178=null;
        Token ID181=null;
        Token LPAREN182=null;
        Token RPAREN184=null;
        OracleParserParser.schema_name_return schema_name177 =null;

        OracleParserParser.table_name_return table_name179 =null;

        OracleParserParser.subquery_return subquery180 =null;

        OracleParserParser.values_func_return values_func183 =null;


        CommonTree DOT178_tree=null;
        CommonTree ID181_tree=null;
        CommonTree LPAREN182_tree=null;
        CommonTree RPAREN184_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_values_func=new RewriteRuleSubtreeStream(adaptor,"rule values_func");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:353:2: ( ( schema_name DOT !)? table_name | subquery |{...}? ID LPAREN values_func RPAREN -> ^( ID ( values_func )? ) )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:353:3: ( schema_name DOT !)? table_name
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:353:3: ( schema_name DOT !)?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==ID) ) {
                        int LA48_1 = input.LA(2);

                        if ( (LA48_1==DOT) ) {
                            alt48=1;
                        }
                    }
                    switch (alt48) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:353:5: schema_name DOT !
                            {
                            pushFollow(FOLLOW_schema_name_in_table_spec1630);
                            schema_name177=schema_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, schema_name177.getTree());

                            DOT178=(Token)match(input,DOT,FOLLOW_DOT_in_table_spec1632); if (state.failed) return retval;

                            }
                            break;

                    }


                    pushFollow(FOLLOW_table_name_in_table_spec1637);
                    table_name179=table_name();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, table_name179.getTree());

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:354:4: subquery
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_subquery_in_table_spec1643);
                    subquery180=subquery();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subquery180.getTree());

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:355:3: {...}? ID LPAREN values_func RPAREN
                    {
                    if ( !((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "table_spec", "functionRegister.containsKey(input.LT(1).getText().toUpperCase())");
                    }

                    ID181=(Token)match(input,ID,FOLLOW_ID_in_table_spec1649); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID181);


                    LPAREN182=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_table_spec1651); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN182);


                    pushFollow(FOLLOW_values_func_in_table_spec1653);
                    values_func183=values_func();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_values_func.add(values_func183.getTree());

                    RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_table_spec1655); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN184);


                    // AST REWRITE
                    // elements: values_func, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 355:100: -> ^( ID ( values_func )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:355:102: ^( ID ( values_func )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_ID.nextNode()
                        , root_1);

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:355:107: ( values_func )?
                        if ( stream_values_func.hasNext() ) {
                            adaptor.addChild(root_1, stream_values_func.nextTree());

                        }
                        stream_values_func.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_spec"


    public static class join_claus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_claus"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:357:1: join_claus : ( join_type )? 'JOIN' table_spec ( alias )? 'ON' column_spec EQ column_spec -> ^( JOIN table_spec ( alias )? column_spec column_spec ( join_type )? ) ;
    public final OracleParserParser.join_claus_return join_claus() throws RecognitionException {
        OracleParserParser.join_claus_return retval = new OracleParserParser.join_claus_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal186=null;
        Token string_literal189=null;
        Token EQ191=null;
        OracleParserParser.join_type_return join_type185 =null;

        OracleParserParser.table_spec_return table_spec187 =null;

        OracleParserParser.alias_return alias188 =null;

        OracleParserParser.column_spec_return column_spec190 =null;

        OracleParserParser.column_spec_return column_spec192 =null;


        CommonTree string_literal186_tree=null;
        CommonTree string_literal189_tree=null;
        CommonTree EQ191_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_113=new RewriteRuleTokenStream(adaptor,"token 113");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias");
        RewriteRuleSubtreeStream stream_column_spec=new RewriteRuleSubtreeStream(adaptor,"rule column_spec");
        RewriteRuleSubtreeStream stream_table_spec=new RewriteRuleSubtreeStream(adaptor,"rule table_spec");
        RewriteRuleSubtreeStream stream_join_type=new RewriteRuleSubtreeStream(adaptor,"rule join_type");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:2: ( ( join_type )? 'JOIN' table_spec ( alias )? 'ON' column_spec EQ column_spec -> ^( JOIN table_spec ( alias )? column_spec column_spec ( join_type )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:3: ( join_type )? 'JOIN' table_spec ( alias )? 'ON' column_spec EQ column_spec
            {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:3: ( join_type )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==100||LA50_0==105||LA50_0==109||LA50_0==114||LA50_0==125||LA50_0==129) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:3: join_type
                    {
                    pushFollow(FOLLOW_join_type_in_join_claus1671);
                    join_type185=join_type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_join_type.add(join_type185.getTree());

                    }
                    break;

            }


            string_literal186=(Token)match(input,113,FOLLOW_113_in_join_claus1674); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_113.add(string_literal186);


            pushFollow(FOLLOW_table_spec_in_join_claus1676);
            table_spec187=table_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_table_spec.add(table_spec187.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:33: ( alias )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==ID||LA51_0==96) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:33: alias
                    {
                    pushFollow(FOLLOW_alias_in_join_claus1679);
                    alias188=alias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alias.add(alias188.getTree());

                    }
                    break;

            }


            string_literal189=(Token)match(input,121,FOLLOW_121_in_join_claus1682); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_121.add(string_literal189);


            pushFollow(FOLLOW_column_spec_in_join_claus1684);
            column_spec190=column_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_column_spec.add(column_spec190.getTree());

            EQ191=(Token)match(input,EQ,FOLLOW_EQ_in_join_claus1686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQ.add(EQ191);


            pushFollow(FOLLOW_column_spec_in_join_claus1688);
            column_spec192=column_spec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_column_spec.add(column_spec192.getTree());

            // AST REWRITE
            // elements: join_type, column_spec, alias, column_spec, table_spec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 358:72: -> ^( JOIN table_spec ( alias )? column_spec column_spec ( join_type )? )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:74: ^( JOIN table_spec ( alias )? column_spec column_spec ( join_type )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(JOIN, "JOIN")
                , root_1);

                adaptor.addChild(root_1, stream_table_spec.nextTree());

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:92: ( alias )?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

                adaptor.addChild(root_1, stream_column_spec.nextTree());

                adaptor.addChild(root_1, stream_column_spec.nextTree());

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:358:123: ( join_type )?
                if ( stream_join_type.hasNext() ) {
                    adaptor.addChild(root_1, stream_join_type.nextTree());

                }
                stream_join_type.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_claus"


    public static class join_type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join_type"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:361:1: join_type : ( 'INNER' -> INNER | 'LEFT' ( outer )? -> LEFT ( outer )? | 'RIGHT' ( outer )? -> RIGHT ( outer )? | 'FULL' ( outer )? -> FULL ( outer )? | 'UNION' -> UNION | 'CROSS' -> CROSS );
    public final OracleParserParser.join_type_return join_type() throws RecognitionException {
        OracleParserParser.join_type_return retval = new OracleParserParser.join_type_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal193=null;
        Token string_literal194=null;
        Token string_literal196=null;
        Token string_literal198=null;
        Token string_literal200=null;
        Token string_literal201=null;
        OracleParserParser.outer_return outer195 =null;

        OracleParserParser.outer_return outer197 =null;

        OracleParserParser.outer_return outer199 =null;


        CommonTree string_literal193_tree=null;
        CommonTree string_literal194_tree=null;
        CommonTree string_literal196_tree=null;
        CommonTree string_literal198_tree=null;
        CommonTree string_literal200_tree=null;
        CommonTree string_literal201_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_114=new RewriteRuleTokenStream(adaptor,"token 114");
        RewriteRuleTokenStream stream_109=new RewriteRuleTokenStream(adaptor,"token 109");
        RewriteRuleTokenStream stream_105=new RewriteRuleTokenStream(adaptor,"token 105");
        RewriteRuleTokenStream stream_129=new RewriteRuleTokenStream(adaptor,"token 129");
        RewriteRuleTokenStream stream_100=new RewriteRuleTokenStream(adaptor,"token 100");
        RewriteRuleSubtreeStream stream_outer=new RewriteRuleSubtreeStream(adaptor,"rule outer");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:362:2: ( 'INNER' -> INNER | 'LEFT' ( outer )? -> LEFT ( outer )? | 'RIGHT' ( outer )? -> RIGHT ( outer )? | 'FULL' ( outer )? -> FULL ( outer )? | 'UNION' -> UNION | 'CROSS' -> CROSS )
            int alt55=6;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt55=1;
                }
                break;
            case 114:
                {
                alt55=2;
                }
                break;
            case 125:
                {
                alt55=3;
                }
                break;
            case 105:
                {
                alt55=4;
                }
                break;
            case 129:
                {
                alt55=5;
                }
                break;
            case 100:
                {
                alt55=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }

            switch (alt55) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:362:3: 'INNER'
                    {
                    string_literal193=(Token)match(input,109,FOLLOW_109_in_join_type1715); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_109.add(string_literal193);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 362:10: -> INNER
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(INNER, "INNER")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:363:3: 'LEFT' ( outer )?
                    {
                    string_literal194=(Token)match(input,114,FOLLOW_114_in_join_type1721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_114.add(string_literal194);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:363:10: ( outer )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==124) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:363:10: outer
                            {
                            pushFollow(FOLLOW_outer_in_join_type1723);
                            outer195=outer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_outer.add(outer195.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: outer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 363:17: -> LEFT ( outer )?
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(LEFT, "LEFT")
                        );

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:363:24: ( outer )?
                        if ( stream_outer.hasNext() ) {
                            adaptor.addChild(root_0, stream_outer.nextTree());

                        }
                        stream_outer.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:364:3: 'RIGHT' ( outer )?
                    {
                    string_literal196=(Token)match(input,125,FOLLOW_125_in_join_type1734); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_125.add(string_literal196);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:364:11: ( outer )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==124) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:364:11: outer
                            {
                            pushFollow(FOLLOW_outer_in_join_type1736);
                            outer197=outer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_outer.add(outer197.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: outer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 364:18: -> RIGHT ( outer )?
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(RIGHT, "RIGHT")
                        );

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:364:27: ( outer )?
                        if ( stream_outer.hasNext() ) {
                            adaptor.addChild(root_0, stream_outer.nextTree());

                        }
                        stream_outer.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:365:3: 'FULL' ( outer )?
                    {
                    string_literal198=(Token)match(input,105,FOLLOW_105_in_join_type1748); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_105.add(string_literal198);


                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:365:10: ( outer )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==124) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:365:10: outer
                            {
                            pushFollow(FOLLOW_outer_in_join_type1750);
                            outer199=outer();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_outer.add(outer199.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: outer
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 365:17: -> FULL ( outer )?
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(FULL, "FULL")
                        );

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:365:25: ( outer )?
                        if ( stream_outer.hasNext() ) {
                            adaptor.addChild(root_0, stream_outer.nextTree());

                        }
                        stream_outer.reset();

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:366:3: 'UNION'
                    {
                    string_literal200=(Token)match(input,129,FOLLOW_129_in_join_type1762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_129.add(string_literal200);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 366:11: -> UNION
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(UNION, "UNION")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:367:3: 'CROSS'
                    {
                    string_literal201=(Token)match(input,100,FOLLOW_100_in_join_type1770); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_100.add(string_literal201);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 367:11: -> CROSS
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(CROSS, "CROSS")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join_type"


    public static class outer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "outer"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:369:1: outer : 'OUTER' -> OUTER ;
    public final OracleParserParser.outer_return outer() throws RecognitionException {
        OracleParserParser.outer_return retval = new OracleParserParser.outer_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal202=null;

        CommonTree string_literal202_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:370:2: ( 'OUTER' -> OUTER )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:370:3: 'OUTER'
            {
            string_literal202=(Token)match(input,124,FOLLOW_124_in_outer1783); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_124.add(string_literal202);


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

            root_0 = (CommonTree)adaptor.nil();
            // 370:11: -> OUTER
            {
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(OUTER, "OUTER")
                );

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outer"


    public static class table_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table_name"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:372:1: table_name : identifier ;
    public final OracleParserParser.table_name_return table_name() throws RecognitionException {
        OracleParserParser.table_name_return retval = new OracleParserParser.table_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.identifier_return identifier203 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:373:2: ( identifier )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:373:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_table_name1796);
            identifier203=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier203.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table_name"


    public static class column_spec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column_spec"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:376:1: column_spec : ( ( table_name DOT )? identifier -> ^( COLUMN identifier ( table_name )? ) | ASTERISK -> ^( COLUMNAST ASTERISK ) );
    public final OracleParserParser.column_spec_return column_spec() throws RecognitionException {
        OracleParserParser.column_spec_return retval = new OracleParserParser.column_spec_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token DOT205=null;
        Token ASTERISK207=null;
        OracleParserParser.table_name_return table_name204 =null;

        OracleParserParser.identifier_return identifier206 =null;


        CommonTree DOT205_tree=null;
        CommonTree ASTERISK207_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_ASTERISK=new RewriteRuleTokenStream(adaptor,"token ASTERISK");
        RewriteRuleSubtreeStream stream_table_name=new RewriteRuleSubtreeStream(adaptor,"rule table_name");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:377:2: ( ( table_name DOT )? identifier -> ^( COLUMN identifier ( table_name )? ) | ASTERISK -> ^( COLUMNAST ASTERISK ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==ID) ) {
                alt57=1;
            }
            else if ( (LA57_0==ASTERISK) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }
            switch (alt57) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:377:3: ( table_name DOT )? identifier
                    {
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:377:3: ( table_name DOT )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==ID) ) {
                        int LA56_1 = input.LA(2);

                        if ( (LA56_1==DOT) ) {
                            alt56=1;
                        }
                    }
                    switch (alt56) {
                        case 1 :
                            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:377:4: table_name DOT
                            {
                            pushFollow(FOLLOW_table_name_in_column_spec1808);
                            table_name204=table_name();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_table_name.add(table_name204.getTree());

                            DOT205=(Token)match(input,DOT,FOLLOW_DOT_in_column_spec1810); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT205);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_column_spec1814);
                    identifier206=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier206.getTree());

                    // AST REWRITE
                    // elements: table_name, identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 377:32: -> ^( COLUMN identifier ( table_name )? )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:377:34: ^( COLUMN identifier ( table_name )? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COLUMN, "COLUMN")
                        , root_1);

                        adaptor.addChild(root_1, stream_identifier.nextTree());

                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:377:54: ( table_name )?
                        if ( stream_table_name.hasNext() ) {
                            adaptor.addChild(root_1, stream_table_name.nextTree());

                        }
                        stream_table_name.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:378:3: ASTERISK
                    {
                    ASTERISK207=(Token)match(input,ASTERISK,FOLLOW_ASTERISK_in_column_spec1828); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ASTERISK.add(ASTERISK207);


                    // AST REWRITE
                    // elements: ASTERISK
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 378:11: -> ^( COLUMNAST ASTERISK )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:378:13: ^( COLUMNAST ASTERISK )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(COLUMNAST, "COLUMNAST")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ASTERISK.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column_spec"


    public static class schema_name_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "schema_name"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:381:1: schema_name : identifier ;
    public final OracleParserParser.schema_name_return schema_name() throws RecognitionException {
        OracleParserParser.schema_name_return retval = new OracleParserParser.schema_name_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.identifier_return identifier208 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:382:2: ( identifier )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:382:3: identifier
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_schema_name1844);
            identifier208=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier208.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "schema_name"


    public static class boolean_literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_literal"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:385:1: boolean_literal : ( 'TRUE' | 'FALSE' );
    public final OracleParserParser.boolean_literal_return boolean_literal() throws RecognitionException {
        OracleParserParser.boolean_literal_return retval = new OracleParserParser.boolean_literal_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set209=null;

        CommonTree set209_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:386:2: ( 'TRUE' | 'FALSE' )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set209=(Token)input.LT(1);

            if ( input.LA(1)==102||input.LA(1)==128 ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set209)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_literal"


    public static class alias_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alias"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:389:1: alias : ( 'AS' )? identifier -> ^( AS identifier ) ;
    public final OracleParserParser.alias_return alias() throws RecognitionException {
        OracleParserParser.alias_return retval = new OracleParserParser.alias_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal210=null;
        OracleParserParser.identifier_return identifier211 =null;


        CommonTree string_literal210_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:390:2: ( ( 'AS' )? identifier -> ^( AS identifier ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:390:4: ( 'AS' )? identifier
            {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:390:4: ( 'AS' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==96) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:390:6: 'AS'
                    {
                    string_literal210=(Token)match(input,96,FOLLOW_96_in_alias1874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_96.add(string_literal210);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_alias1878);
            identifier211=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier211.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 390:23: -> ^( AS identifier )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:390:25: ^( AS identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(AS, "AS")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alias"


    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifier"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:393:1: identifier : ID ;
    public final OracleParserParser.identifier_return identifier() throws RecognitionException {
        OracleParserParser.identifier_return retval = new OracleParserParser.identifier_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID212=null;

        CommonTree ID212_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:394:2: ( ID )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:394:4: ID
            {
            root_0 = (CommonTree)adaptor.nil();


            ID212=(Token)match(input,ID,FOLLOW_ID_in_identifier1896); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID212_tree = 
            (CommonTree)adaptor.create(ID212)
            ;
            adaptor.addChild(root_0, ID212_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "identifier"


    public static class quoted_string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "quoted_string"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:474:1: quoted_string : QUOTED_STRING ;
    public final OracleParserParser.quoted_string_return quoted_string() throws RecognitionException {
        OracleParserParser.quoted_string_return retval = new OracleParserParser.quoted_string_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token QUOTED_STRING213=null;

        CommonTree QUOTED_STRING213_tree=null;

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:475:2: ( QUOTED_STRING )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:475:4: QUOTED_STRING
            {
            root_0 = (CommonTree)adaptor.nil();


            QUOTED_STRING213=(Token)match(input,QUOTED_STRING,FOLLOW_QUOTED_STRING_in_quoted_string2270); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUOTED_STRING213_tree = 
            (CommonTree)adaptor.create(QUOTED_STRING213)
            ;
            adaptor.addChild(root_0, QUOTED_STRING213_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "quoted_string"


    public static class selectClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selectClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:517:1: selectClause : 'SELECT' ( indexClause )? select_list -> ^( SELECT ( indexClause )? select_list ) ;
    public final OracleParserParser.selectClause_return selectClause() throws RecognitionException {
        OracleParserParser.selectClause_return retval = new OracleParserParser.selectClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal214=null;
        OracleParserParser.indexClause_return indexClause215 =null;

        OracleParserParser.select_list_return select_list216 =null;


        CommonTree string_literal214_tree=null;
        RewriteRuleTokenStream stream_126=new RewriteRuleTokenStream(adaptor,"token 126");
        RewriteRuleSubtreeStream stream_select_list=new RewriteRuleSubtreeStream(adaptor,"rule select_list");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:518:5: ( 'SELECT' ( indexClause )? select_list -> ^( SELECT ( indexClause )? select_list ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:518:6: 'SELECT' ( indexClause )? select_list
            {
            string_literal214=(Token)match(input,126,FOLLOW_126_in_selectClause2455); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_126.add(string_literal214);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:518:16: ( indexClause )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==93) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:518:16: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_selectClause2458);
                    indexClause215=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause215.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_select_list_in_selectClause2461);
            select_list216=select_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_select_list.add(select_list216.getTree());

            // AST REWRITE
            // elements: indexClause, select_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 518:40: -> ^( SELECT ( indexClause )? select_list )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:518:42: ^( SELECT ( indexClause )? select_list )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(SELECT, "SELECT")
                , root_1);

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:518:52: ( indexClause )?
                if ( stream_indexClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexClause.nextTree());

                }
                stream_indexClause.reset();

                adaptor.addChild(root_1, stream_select_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "selectClause"


    public static class select_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:521:1: select_command : selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( for_update )? ;
    public final OracleParserParser.select_command_return select_command() throws RecognitionException {
        OracleParserParser.select_command_return retval = new OracleParserParser.select_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        OracleParserParser.selectClause_return selectClause217 =null;

        OracleParserParser.fromClause_return fromClause218 =null;

        OracleParserParser.whereClause_return whereClause219 =null;

        OracleParserParser.groupByClause_return groupByClause220 =null;

        OracleParserParser.orderByClause_return orderByClause221 =null;

        OracleParserParser.for_update_return for_update222 =null;



        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:6: ( selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( for_update )? )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:8: selectClause ( fromClause )? ( whereClause )? ( groupByClause )? ( orderByClause )? ( for_update )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_selectClause_in_select_command2492);
            selectClause217=selectClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, selectClause217.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:21: ( fromClause )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==104) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:22: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_select_command2495);
                    fromClause218=fromClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fromClause218.getTree());

                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:35: ( whereClause )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==133) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_select_command2500);
                    whereClause219=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whereClause219.getTree());

                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:50: ( groupByClause )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==106) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:50: groupByClause
                    {
                    pushFollow(FOLLOW_groupByClause_in_select_command2504);
                    groupByClause220=groupByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, groupByClause220.getTree());

                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:65: ( orderByClause )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==123) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:66: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_select_command2508);
                    orderByClause221=orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, orderByClause221.getTree());

                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:82: ( for_update )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==103) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:522:82: for_update
                    {
                    pushFollow(FOLLOW_for_update_in_select_command2512);
                    for_update222=for_update();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, for_update222.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_command"


    public static class indexClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "indexClause"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:524:2: indexClause : '/*' '+' ( hints )+ '*/' -> ( hints )+ ;
    public final OracleParserParser.indexClause_return indexClause() throws RecognitionException {
        OracleParserParser.indexClause_return retval = new OracleParserParser.indexClause_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal223=null;
        Token char_literal224=null;
        Token string_literal226=null;
        OracleParserParser.hints_return hints225 =null;


        CommonTree string_literal223_tree=null;
        CommonTree char_literal224_tree=null;
        CommonTree string_literal226_tree=null;
        RewriteRuleTokenStream stream_PLUS=new RewriteRuleTokenStream(adaptor,"token PLUS");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_hints=new RewriteRuleSubtreeStream(adaptor,"rule hints");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:525:3: ( '/*' '+' ( hints )+ '*/' -> ( hints )+ )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:525:4: '/*' '+' ( hints )+ '*/'
            {
            string_literal223=(Token)match(input,93,FOLLOW_93_in_indexClause2528); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_93.add(string_literal223);


            char_literal224=(Token)match(input,PLUS,FOLLOW_PLUS_in_indexClause2530); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PLUS.add(char_literal224);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:525:13: ( hints )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==ID) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:525:13: hints
            	    {
            	    pushFollow(FOLLOW_hints_in_indexClause2532);
            	    hints225=hints();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_hints.add(hints225.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);


            string_literal226=(Token)match(input,92,FOLLOW_92_in_indexClause2535); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_92.add(string_literal226);


            // AST REWRITE
            // elements: hints
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 525:24: -> ( hints )+
            {
                if ( !(stream_hints.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hints.hasNext() ) {
                    adaptor.addChild(root_0, stream_hints.nextTree());

                }
                stream_hints.reset();

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "indexClause"


    public static class hints_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hints"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:528:2: hints :{...}? ID ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )? -> ^( ID ( identifier )* ) ;
    public final OracleParserParser.hints_return hints() throws RecognitionException {
        OracleParserParser.hints_return retval = new OracleParserParser.hints_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID227=null;
        Token LPAREN228=null;
        Token COMMA230=null;
        Token RPAREN232=null;
        OracleParserParser.identifier_return identifier229 =null;

        OracleParserParser.identifier_return identifier231 =null;


        CommonTree ID227_tree=null;
        CommonTree LPAREN228_tree=null;
        CommonTree COMMA230_tree=null;
        CommonTree RPAREN232_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:529:3: ({...}? ID ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )? -> ^( ID ( identifier )* ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:529:4: {...}? ID ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )?
            {
            if ( !((hintRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "hints", "hintRegister.containsKey(input.LT(1).getText().toUpperCase())");
            }

            ID227=(Token)match(input,ID,FOLLOW_ID_in_hints2559); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID227);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:530:7: ( LPAREN identifier ( ( COMMA )? identifier )* RPAREN )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==LPAREN) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:530:8: LPAREN identifier ( ( COMMA )? identifier )* RPAREN
                    {
                    LPAREN228=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hints2562); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN228);


                    pushFollow(FOLLOW_identifier_in_hints2564);
                    identifier229=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier229.getTree());

                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:530:26: ( ( COMMA )? identifier )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==COMMA||LA67_0==ID) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:530:27: ( COMMA )? identifier
                    	    {
                    	    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:530:27: ( COMMA )?
                    	    int alt66=2;
                    	    int LA66_0 = input.LA(1);

                    	    if ( (LA66_0==COMMA) ) {
                    	        alt66=1;
                    	    }
                    	    switch (alt66) {
                    	        case 1 :
                    	            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:530:27: COMMA
                    	            {
                    	            COMMA230=(Token)match(input,COMMA,FOLLOW_COMMA_in_hints2567); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_COMMA.add(COMMA230);


                    	            }
                    	            break;

                    	    }


                    	    pushFollow(FOLLOW_identifier_in_hints2570);
                    	    identifier231=identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier231.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    RPAREN232=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hints2574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN232);


                    }
                    break;

            }


            // AST REWRITE
            // elements: identifier, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 531:4: -> ^( ID ( identifier )* )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:531:6: ^( ID ( identifier )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_ID.nextNode()
                , root_1);

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:531:11: ( identifier )*
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hints"


    public static class insert_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "insert_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:534:1: insert_command : 'INSERT' ( indexClause )? 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN ) -> ^( INSERT ( indexClause )? selected_table column_specs values ) ;
    public final OracleParserParser.insert_command_return insert_command() throws RecognitionException {
        OracleParserParser.insert_command_return retval = new OracleParserParser.insert_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal233=null;
        Token string_literal235=null;
        Token LPAREN237=null;
        Token RPAREN239=null;
        Token string_literal240=null;
        Token LPAREN241=null;
        Token RPAREN243=null;
        OracleParserParser.indexClause_return indexClause234 =null;

        OracleParserParser.selected_table_return selected_table236 =null;

        OracleParserParser.column_specs_return column_specs238 =null;

        OracleParserParser.values_return values242 =null;


        CommonTree string_literal233_tree=null;
        CommonTree string_literal235_tree=null;
        CommonTree LPAREN237_tree=null;
        CommonTree RPAREN239_tree=null;
        CommonTree string_literal240_tree=null;
        CommonTree LPAREN241_tree=null;
        CommonTree RPAREN243_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_110=new RewriteRuleTokenStream(adaptor,"token 110");
        RewriteRuleTokenStream stream_111=new RewriteRuleTokenStream(adaptor,"token 111");
        RewriteRuleTokenStream stream_131=new RewriteRuleTokenStream(adaptor,"token 131");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_selected_table=new RewriteRuleSubtreeStream(adaptor,"rule selected_table");
        RewriteRuleSubtreeStream stream_values=new RewriteRuleSubtreeStream(adaptor,"rule values");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        RewriteRuleSubtreeStream stream_column_specs=new RewriteRuleSubtreeStream(adaptor,"rule column_specs");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:535:2: ( 'INSERT' ( indexClause )? 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN ) -> ^( INSERT ( indexClause )? selected_table column_specs values ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:535:4: 'INSERT' ( indexClause )? 'INTO' selected_table ( LPAREN column_specs RPAREN )? ( 'VALUES' LPAREN values RPAREN )
            {
            string_literal233=(Token)match(input,110,FOLLOW_110_in_insert_command2601); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_110.add(string_literal233);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:535:13: ( indexClause )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==93) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:535:13: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_insert_command2603);
                    indexClause234=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause234.getTree());

                    }
                    break;

            }


            string_literal235=(Token)match(input,111,FOLLOW_111_in_insert_command2606); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_111.add(string_literal235);


            pushFollow(FOLLOW_selected_table_in_insert_command2608);
            selected_table236=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selected_table.add(selected_table236.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:536:3: ( LPAREN column_specs RPAREN )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LPAREN) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:536:5: LPAREN column_specs RPAREN
                    {
                    LPAREN237=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_command2614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN237);


                    pushFollow(FOLLOW_column_specs_in_insert_command2616);
                    column_specs238=column_specs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_column_specs.add(column_specs238.getTree());

                    RPAREN239=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_command2619); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN239);


                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:537:3: ( 'VALUES' LPAREN values RPAREN )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:537:4: 'VALUES' LPAREN values RPAREN
            {
            string_literal240=(Token)match(input,131,FOLLOW_131_in_insert_command2627); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_131.add(string_literal240);


            LPAREN241=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_insert_command2629); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN241);


            pushFollow(FOLLOW_values_in_insert_command2631);
            values242=values();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_values.add(values242.getTree());

            RPAREN243=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_insert_command2633); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN243);


            }


            // AST REWRITE
            // elements: indexClause, selected_table, values, column_specs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 538:4: -> ^( INSERT ( indexClause )? selected_table column_specs values )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:538:6: ^( INSERT ( indexClause )? selected_table column_specs values )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(INSERT, "INSERT")
                , root_1);

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:538:15: ( indexClause )?
                if ( stream_indexClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexClause.nextTree());

                }
                stream_indexClause.reset();

                adaptor.addChild(root_1, stream_selected_table.nextTree());

                adaptor.addChild(root_1, stream_column_specs.nextTree());

                adaptor.addChild(root_1, stream_values.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "insert_command"


    public static class for_update_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "for_update"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:540:1: for_update : 'FOR' 'UPDATE' ( of_statement )? ( wait_statement )? -> ^( FORUPDATE ( of_statement )? ( wait_statement )? ) ;
    public final OracleParserParser.for_update_return for_update() throws RecognitionException {
        OracleParserParser.for_update_return retval = new OracleParserParser.for_update_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal244=null;
        Token string_literal245=null;
        OracleParserParser.of_statement_return of_statement246 =null;

        OracleParserParser.wait_statement_return wait_statement247 =null;


        CommonTree string_literal244_tree=null;
        CommonTree string_literal245_tree=null;
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_of_statement=new RewriteRuleSubtreeStream(adaptor,"rule of_statement");
        RewriteRuleSubtreeStream stream_wait_statement=new RewriteRuleSubtreeStream(adaptor,"rule wait_statement");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:2: ( 'FOR' 'UPDATE' ( of_statement )? ( wait_statement )? -> ^( FORUPDATE ( of_statement )? ( wait_statement )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:3: 'FOR' 'UPDATE' ( of_statement )? ( wait_statement )?
            {
            string_literal244=(Token)match(input,103,FOLLOW_103_in_for_update2659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_103.add(string_literal244);


            string_literal245=(Token)match(input,130,FOLLOW_130_in_for_update2661); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_130.add(string_literal245);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:18: ( of_statement )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==120) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:18: of_statement
                    {
                    pushFollow(FOLLOW_of_statement_in_for_update2663);
                    of_statement246=of_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_of_statement.add(of_statement246.getTree());

                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:32: ( wait_statement )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==118||LA72_0==132) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:32: wait_statement
                    {
                    pushFollow(FOLLOW_wait_statement_in_for_update2666);
                    wait_statement247=wait_statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_wait_statement.add(wait_statement247.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: of_statement, wait_statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 541:47: -> ^( FORUPDATE ( of_statement )? ( wait_statement )? )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:49: ^( FORUPDATE ( of_statement )? ( wait_statement )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FORUPDATE, "FORUPDATE")
                , root_1);

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:61: ( of_statement )?
                if ( stream_of_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_of_statement.nextTree());

                }
                stream_of_statement.reset();

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:541:75: ( wait_statement )?
                if ( stream_wait_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_wait_statement.nextTree());

                }
                stream_wait_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "for_update"


    public static class of_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "of_statement"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:543:1: of_statement : 'OF' expr -> ^( OF expr ) ;
    public final OracleParserParser.of_statement_return of_statement() throws RecognitionException {
        OracleParserParser.of_statement_return retval = new OracleParserParser.of_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal248=null;
        OracleParserParser.expr_return expr249 =null;


        CommonTree string_literal248_tree=null;
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:544:2: ( 'OF' expr -> ^( OF expr ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:544:3: 'OF' expr
            {
            string_literal248=(Token)match(input,120,FOLLOW_120_in_of_statement2686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_120.add(string_literal248);


            pushFollow(FOLLOW_expr_in_of_statement2688);
            expr249=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr.add(expr249.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 544:12: -> ^( OF expr )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:544:14: ^( OF expr )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OF, "OF")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "of_statement"


    public static class wait_statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wait_statement"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:546:1: wait_statement : ( 'NOWAIT' -> ^( NOWAIT ) | 'WAIT' N -> ^( WAIT N ) );
    public final OracleParserParser.wait_statement_return wait_statement() throws RecognitionException {
        OracleParserParser.wait_statement_return retval = new OracleParserParser.wait_statement_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal250=null;
        Token string_literal251=null;
        Token N252=null;

        CommonTree string_literal250_tree=null;
        CommonTree string_literal251_tree=null;
        CommonTree N252_tree=null;
        RewriteRuleTokenStream stream_132=new RewriteRuleTokenStream(adaptor,"token 132");
        RewriteRuleTokenStream stream_N=new RewriteRuleTokenStream(adaptor,"token N");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");

        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:547:2: ( 'NOWAIT' -> ^( NOWAIT ) | 'WAIT' N -> ^( WAIT N ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==118) ) {
                alt73=1;
            }
            else if ( (LA73_0==132) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;

            }
            switch (alt73) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:547:3: 'NOWAIT'
                    {
                    string_literal250=(Token)match(input,118,FOLLOW_118_in_wait_statement2703); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(string_literal250);


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

                    root_0 = (CommonTree)adaptor.nil();
                    // 547:11: -> ^( NOWAIT )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:547:13: ^( NOWAIT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(NOWAIT, "NOWAIT")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:548:3: 'WAIT' N
                    {
                    string_literal251=(Token)match(input,132,FOLLOW_132_in_wait_statement2711); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_132.add(string_literal251);


                    N252=(Token)match(input,N,FOLLOW_N_in_wait_statement2713); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_N.add(N252);


                    // AST REWRITE
                    // elements: N
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 548:12: -> ^( WAIT N )
                    {
                        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:548:14: ^( WAIT N )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(WAIT, "WAIT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_N.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "wait_statement"


    public static class delete_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "delete_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:551:1: delete_command : 'DELETE' ( indexClause )? fromClause ( whereClause )? ( orderByClause )? -> ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? ) ;
    public final OracleParserParser.delete_command_return delete_command() throws RecognitionException {
        OracleParserParser.delete_command_return retval = new OracleParserParser.delete_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal253=null;
        OracleParserParser.indexClause_return indexClause254 =null;

        OracleParserParser.fromClause_return fromClause255 =null;

        OracleParserParser.whereClause_return whereClause256 =null;

        OracleParserParser.orderByClause_return orderByClause257 =null;


        CommonTree string_literal253_tree=null;
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:2: ( 'DELETE' ( indexClause )? fromClause ( whereClause )? ( orderByClause )? -> ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:3: 'DELETE' ( indexClause )? fromClause ( whereClause )? ( orderByClause )?
            {
            string_literal253=(Token)match(input,101,FOLLOW_101_in_delete_command2730); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_101.add(string_literal253);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:12: ( indexClause )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==93) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:12: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_delete_command2732);
                    indexClause254=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause254.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_fromClause_in_delete_command2735);
            fromClause255=fromClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromClause.add(fromClause255.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:36: ( whereClause )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==133) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_delete_command2737);
                    whereClause256=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(whereClause256.getTree());

                    }
                    break;

            }


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:49: ( orderByClause )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==123) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:49: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_delete_command2740);
                    orderByClause257=orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause257.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: indexClause, orderByClause, fromClause, whereClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 552:65: -> ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:67: ^( DELETE ( indexClause )? fromClause ( whereClause )? ( orderByClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(DELETE, "DELETE")
                , root_1);

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:76: ( indexClause )?
                if ( stream_indexClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexClause.nextTree());

                }
                stream_indexClause.reset();

                adaptor.addChild(root_1, stream_fromClause.nextTree());

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:100: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:552:113: ( orderByClause )?
                if ( stream_orderByClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderByClause.nextTree());

                }
                stream_orderByClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "delete_command"


    public static class update_command_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "update_command"
    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:554:1: update_command : 'UPDATE' ( indexClause )? selected_table setclause ( whereClause )? -> ^( UPDATE selected_table setclause ( whereClause )? ) ;
    public final OracleParserParser.update_command_return update_command() throws RecognitionException {
        OracleParserParser.update_command_return retval = new OracleParserParser.update_command_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal258=null;
        OracleParserParser.indexClause_return indexClause259 =null;

        OracleParserParser.selected_table_return selected_table260 =null;

        OracleParserParser.setclause_return setclause261 =null;

        OracleParserParser.whereClause_return whereClause262 =null;


        CommonTree string_literal258_tree=null;
        RewriteRuleTokenStream stream_130=new RewriteRuleTokenStream(adaptor,"token 130");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_selected_table=new RewriteRuleSubtreeStream(adaptor,"rule selected_table");
        RewriteRuleSubtreeStream stream_indexClause=new RewriteRuleSubtreeStream(adaptor,"rule indexClause");
        RewriteRuleSubtreeStream stream_setclause=new RewriteRuleSubtreeStream(adaptor,"rule setclause");
        try {
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:2: ( 'UPDATE' ( indexClause )? selected_table setclause ( whereClause )? -> ^( UPDATE selected_table setclause ( whereClause )? ) )
            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:3: 'UPDATE' ( indexClause )? selected_table setclause ( whereClause )?
            {
            string_literal258=(Token)match(input,130,FOLLOW_130_in_update_command2768); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_130.add(string_literal258);


            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:12: ( indexClause )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==93) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:12: indexClause
                    {
                    pushFollow(FOLLOW_indexClause_in_update_command2770);
                    indexClause259=indexClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_indexClause.add(indexClause259.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_selected_table_in_update_command2773);
            selected_table260=selected_table();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_selected_table.add(selected_table260.getTree());

            pushFollow(FOLLOW_setclause_in_update_command2776);
            setclause261=setclause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_setclause.add(setclause261.getTree());

            // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:51: ( whereClause )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==133) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:51: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_update_command2778);
                    whereClause262=whereClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_whereClause.add(whereClause262.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: selected_table, whereClause, setclause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 555:65: -> ^( UPDATE selected_table setclause ( whereClause )? )
            {
                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:67: ^( UPDATE selected_table setclause ( whereClause )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(UPDATE, "UPDATE")
                , root_1);

                adaptor.addChild(root_1, stream_selected_table.nextTree());

                adaptor.addChild(root_1, stream_setclause.nextTree());

                // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:555:101: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.nextTree());

                }
                stream_whereClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
        throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "update_command"

    // $ANTLR start synpred1_OracleParser
    public final void synpred1_OracleParser_fragment() throws RecognitionException {
        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:184:3: ( LPAREN condition_or RPAREN )
        // D:\\project\\iac-rqq\\iddl\\iddl-parser\\src\\main\\java\\com\\it\\iddl\\parser\\oracle\\OracleParser.g:184:4: LPAREN condition_or RPAREN
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_OracleParser541); if (state.failed) return ;

        pushFollow(FOLLOW_condition_or_in_synpred1_OracleParser543);
        condition_or();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred1_OracleParser545); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_OracleParser

    // Delegated rules

    public final boolean synpred1_OracleParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_OracleParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA49_eotS =
        "\25\uffff";
    static final String DFA49_eofS =
        "\1\uffff\1\4\23\uffff";
    static final String DFA49_minS =
        "\1\50\1\23\1\uffff\1\11\2\uffff\2\11\1\50\1\11\2\0\3\11\1\0\1\50"+
        "\2\0\1\11\1\0";
    static final String DFA49_maxS =
        "\1\65\1\u0085\1\uffff\1\u0080\2\uffff\2\123\1\50\1\u0080\2\0\3\123"+
        "\1\0\1\50\2\0\1\123\1\0";
    static final String DFA49_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\3\17\uffff";
    static final String DFA49_specialS =
        "\12\uffff\1\4\1\5\3\uffff\1\3\1\uffff\1\2\1\1\1\uffff\1\0}>";
    static final String[] DFA49_transitionS = {
            "\1\1\14\uffff\1\2",
            "\1\4\12\uffff\1\4\11\uffff\1\4\14\uffff\1\3\27\uffff\1\4\22"+
            "\uffff\1\4\3\uffff\1\4\2\uffff\1\4\1\uffff\2\4\2\uffff\1\4\3"+
            "\uffff\2\4\6\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1\uffff\1\4\1"+
            "\uffff\1\4\1\uffff\1\4\1\uffff\1\4",
            "",
            "\1\7\36\uffff\1\6\14\uffff\1\5\1\uffff\2\5\10\uffff\1\5\4\uffff"+
            "\1\5\3\uffff\1\5\23\uffff\1\5\4\uffff\1\5\2\uffff\1\5\20\uffff"+
            "\1\5\10\uffff\1\5",
            "",
            "",
            "\1\5\1\uffff\3\5\5\uffff\1\11\11\uffff\1\5\1\10\3\uffff\1\5"+
            "\22\uffff\1\5\1\uffff\1\5\16\uffff\1\5\6\uffff\1\12\4\uffff"+
            "\2\5",
            "\1\5\1\uffff\3\5\5\uffff\1\11\11\uffff\1\5\4\uffff\1\5\24\uffff"+
            "\1\5\16\uffff\1\5\6\uffff\1\13\4\uffff\2\5",
            "\1\14",
            "\1\16\36\uffff\1\15\14\uffff\1\5\1\uffff\2\5\10\uffff\1\5\4"+
            "\uffff\1\5\3\uffff\1\5\23\uffff\1\5\4\uffff\1\5\2\uffff\1\5"+
            "\20\uffff\1\5\10\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\5\1\uffff\3\5\5\uffff\1\11\11\uffff\1\5\4\uffff\1\5\24\uffff"+
            "\1\5\16\uffff\1\5\6\uffff\1\17\4\uffff\2\5",
            "\1\5\1\uffff\3\5\5\uffff\1\11\11\uffff\1\5\1\20\3\uffff\1\5"+
            "\22\uffff\1\5\1\uffff\1\5\16\uffff\1\5\6\uffff\1\21\4\uffff"+
            "\2\5",
            "\1\5\1\uffff\3\5\5\uffff\1\11\11\uffff\1\5\4\uffff\1\5\24\uffff"+
            "\1\5\16\uffff\1\5\6\uffff\1\22\4\uffff\2\5",
            "\1\uffff",
            "\1\23",
            "\1\uffff",
            "\1\uffff",
            "\1\5\1\uffff\3\5\5\uffff\1\11\11\uffff\1\5\4\uffff\1\5\24\uffff"+
            "\1\5\16\uffff\1\5\6\uffff\1\24\4\uffff\2\5",
            "\1\uffff"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "352:1: table_spec : ( ( schema_name DOT !)? table_name | subquery |{...}? ID LPAREN values_func RPAREN -> ^( ID ( values_func )? ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_20 = input.LA(1);

                         
                        int index49_20 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))))) ) {s = 4;}

                        else if ( ((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {s = 5;}

                         
                        input.seek(index49_20);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA49_18 = input.LA(1);

                         
                        int index49_18 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))))) ) {s = 4;}

                        else if ( ((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {s = 5;}

                         
                        input.seek(index49_18);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA49_17 = input.LA(1);

                         
                        int index49_17 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))))) ) {s = 4;}

                        else if ( ((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {s = 5;}

                         
                        input.seek(index49_17);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA49_15 = input.LA(1);

                         
                        int index49_15 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))))) ) {s = 4;}

                        else if ( ((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {s = 5;}

                         
                        input.seek(index49_15);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA49_10 = input.LA(1);

                         
                        int index49_10 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))))) ) {s = 4;}

                        else if ( ((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {s = 5;}

                         
                        input.seek(index49_10);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA49_11 = input.LA(1);

                         
                        int index49_11 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (!(((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))))) ) {s = 4;}

                        else if ( ((functionRegister.containsKey(input.LT(1).getText().toUpperCase()))) ) {s = 5;}

                         
                        input.seek(index49_11);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_start_rule_in_beg290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_command_in_start_rule302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_update_command_in_start_rule306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insert_command_in_start_rule310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_delete_command_in_start_rule314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_setclause326 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_updateColumnSpecs_in_setclause328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs345 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_updateColumnSpecs348 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_updateColumnSpec_in_updateColumnSpecs350 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_columnNameInUpdate_in_updateColumnSpec368 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EQ_in_updateColumnSpec370 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_updateColumnSpec373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_groupByClause383 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_groupByClause385 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_groupByClause387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_orderByClause406 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_orderByClause408 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_columnNamesAfterWhere_in_orderByClause410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere430 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_columnNamesAfterWhere433 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_columnNamesAfterWhere436 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_133_in_whereClause452 = new BitSet(new long[]{0x01A0010000000200L,0x00A0004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_sqlCondition_in_whereClause454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_sqlCondition470 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_or_in_sqlCondition472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_sqlCondition483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_and_in_condition_or501 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_condition_or505 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_and_in_condition_or508 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition_and521 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_condition_and525 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_PAREN_in_condition_and528 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LPAREN_in_condition_PAREN548 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_or_in_condition_PAREN550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_condition_PAREN552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_expr_in_condition_PAREN562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_left_in_condition_expr572 = new BitSet(new long[]{0x204800A200000000L,0x0029080200000000L});
    public static final BitSet FOLLOW_comparisonCondition_in_condition_expr577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inCondition_in_condition_expr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_isCondition_in_condition_expr589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_likeCondition_in_condition_expr596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenCondition_in_condition_expr602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_condition_left616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_betweenCondition632 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_betweenCondition634 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_betweenCondition647 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_between_and_in_betweenCondition649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_and_expression_in_between_and666 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_95_in_between_and668 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_between_and_expression_in_between_and671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_bit_in_between_and_expression683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_isCondition695 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_isCondition697 = new BitSet(new long[]{0x0000000000000000L,0x0090100000000000L});
    public static final BitSet FOLLOW_condition_is_valobject_in_isCondition699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_isCondition709 = new BitSet(new long[]{0x0000000000000000L,0x0090100000000000L});
    public static final BitSet FOLLOW_condition_is_valobject_in_isCondition711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_condition_is_valobject729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_condition_is_valobject737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_condition_is_valobject745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_inCondition761 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_inCondition765 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_subquery_in_inCondition769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_inCondition775 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_inCondition_expr_bits_in_inCondition777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_inCondition779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_likeCondition806 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_likeCondition807 = new BitSet(new long[]{0x0120010000000200L,0x0000000040000402L});
    public static final BitSet FOLLOW_value_in_likeCondition810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_likeCondition820 = new BitSet(new long[]{0x0120010000000200L,0x0000000040000402L});
    public static final BitSet FOLLOW_value_in_likeCondition822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_inCondition_expr_bits838 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_inCondition_expr_bits840 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_inCondition_expr_bits842 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_columnNameAfterWhere_in_identifiers862 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_identifiers865 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_identifiers867 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_relational_op_in_comparisonCondition879 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_comparisonCondition881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_bit_in_expr898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_expr903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subquery919 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_select_command_in_subquery921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_subquery923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_add_in_expr_bit941 = new BitSet(new long[]{0x0000000000003802L,0x00000000000C0000L});
    public static final BitSet FOLLOW_BITOR_in_expr_bit947 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_BITAND_in_expr_bit952 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_BITXOR_in_expr_bit955 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_SHIFTLEFT_in_expr_bit958 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_SHIFTRIGHT_in_expr_bit961 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_add_in_expr_bit966 = new BitSet(new long[]{0x0000000000003802L,0x00000000000C0000L});
    public static final BitSet FOLLOW_expr_mul_in_expr_add979 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_PLUS_in_expr_add985 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_MINUS_in_expr_add990 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_mul_in_expr_add996 = new BitSet(new long[]{0x0080000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_expr_sign_in_expr_mul1010 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_ASTERISK_in_expr_mul1016 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_DIVIDE_in_expr_mul1021 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_sign_in_expr_mul1026 = new BitSet(new long[]{0x0000000020000202L});
    public static final BitSet FOLLOW_PLUS_in_expr_sign1039 = new BitSet(new long[]{0x0120010000000200L,0x0080004840000402L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_expr_sign1054 = new BitSet(new long[]{0x0120010000000200L,0x0080004840000402L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_pow_in_expr_sign1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_expr_in_expr_pow1079 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_EXPONENT_in_expr_pow1083 = new BitSet(new long[]{0x0120010000000200L,0x0080004840000402L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_expr_in_expr_pow1086 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_value_in_expr_expr1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_expr_expr1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_expr_expr1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_expr1115 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_expr_expr1118 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840002442L,0x0000000000000001L});
    public static final BitSet FOLLOW_values_func_in_expr_expr1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_expr_expr1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expr_expr1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_expr_expr1148 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_expr_expr1150 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_values_func_in_expr_expr1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_96_in_expr_expr1154 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_expr_expr1156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_expr_expr1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condition_or_in_sql_condition1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_fromClause1218 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_selected_table_in_fromClause1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1232 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_select_list1236 = new BitSet(new long[]{0x0100010000000200L});
    public static final BitSet FOLLOW_displayed_column_in_select_list1238 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1263 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_displayed_column1267 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840002442L,0x0000000000000001L});
    public static final BitSet FOLLOW_values_func_in_displayed_column1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_displayed_column1272 = new BitSet(new long[]{0x0000010000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_alias_in_displayed_column1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_displayed_column1293 = new BitSet(new long[]{0x0000010000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_alias_in_displayed_column1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_displayed_column1310 = new BitSet(new long[]{0x0100010000000200L});
    public static final BitSet FOLLOW_column_in_displayed_column1314 = new BitSet(new long[]{0x0000010000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_alias_in_displayed_column1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1342 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1360 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1363 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ASC_in_columnNameAfterWhere1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameAfterWhere1381 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameAfterWhere1384 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DESC_in_columnNameAfterWhere1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_alias_in_columnNameInUpdate1409 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_columnNameInUpdate1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_alias1422 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_DOT_in_table_alias1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_column1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_N_in_column1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_values1459 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_values1463 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_values1465 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_expr_in_values_func1484 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_values_func1488 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_values_func1491 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_N_in_value1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_value1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_value1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_value1517 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_value1520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_value1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quoted_string_in_value1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_spec_in_value1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_spec_in_column_specs1550 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_column_specs1554 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_column_spec_in_column_specs1556 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_a_table_in_selected_table1577 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_COMMA_in_selected_table1580 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_a_table_in_selected_table1582 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_table_spec_in_a_table1600 = new BitSet(new long[]{0x0000010000000002L,0x2006221100000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_alias_in_a_table1603 = new BitSet(new long[]{0x0000000000000002L,0x2006221000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_join_claus_in_a_table1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_name_in_table_spec1630 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_DOT_in_table_spec1632 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_table_name_in_table_spec1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_spec1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_table_spec1649 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_table_spec1651 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_values_func_in_table_spec1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_table_spec1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_type_in_join_claus1671 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_join_claus1674 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_table_spec_in_join_claus1676 = new BitSet(new long[]{0x0000010000000000L,0x0200000100000000L});
    public static final BitSet FOLLOW_alias_in_join_claus1679 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_join_claus1682 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_column_spec_in_join_claus1684 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_EQ_in_join_claus1686 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_column_spec_in_join_claus1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_join_type1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_join_type1721 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_outer_in_join_type1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_join_type1734 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_outer_in_join_type1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_join_type1748 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
    public static final BitSet FOLLOW_outer_in_join_type1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_join_type1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_join_type1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_outer1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_name1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_column_spec1808 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_DOT_in_column_spec1810 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_column_spec1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASTERISK_in_column_spec1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_schema_name1844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_alias1874 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_alias1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_STRING_in_quoted_string2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_selectClause2455 = new BitSet(new long[]{0x0100010000000200L,0x0000000020000000L});
    public static final BitSet FOLLOW_indexClause_in_selectClause2458 = new BitSet(new long[]{0x0100010000000200L});
    public static final BitSet FOLLOW_select_list_in_selectClause2461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectClause_in_select_command2492 = new BitSet(new long[]{0x0000000000000002L,0x0800058000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_fromClause_in_select_command2495 = new BitSet(new long[]{0x0000000000000002L,0x0800048000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_whereClause_in_select_command2500 = new BitSet(new long[]{0x0000000000000002L,0x0800048000000000L});
    public static final BitSet FOLLOW_groupByClause_in_select_command2504 = new BitSet(new long[]{0x0000000000000002L,0x0800008000000000L});
    public static final BitSet FOLLOW_orderByClause_in_select_command2508 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_for_update_in_select_command2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_indexClause2528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_PLUS_in_indexClause2530 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_hints_in_indexClause2532 = new BitSet(new long[]{0x0000010000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_indexClause2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_hints2559 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_hints2562 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_hints2564 = new BitSet(new long[]{0x0000010000080000L,0x0000000000002000L});
    public static final BitSet FOLLOW_COMMA_in_hints2567 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_identifier_in_hints2570 = new BitSet(new long[]{0x0000010000080000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_hints2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_insert_command2601 = new BitSet(new long[]{0x0000000000000000L,0x0000800020000000L});
    public static final BitSet FOLLOW_indexClause_in_insert_command2603 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_insert_command2606 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_selected_table_in_insert_command2608 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_LPAREN_in_insert_command2614 = new BitSet(new long[]{0x0000010000000200L});
    public static final BitSet FOLLOW_column_specs_in_insert_command2616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_command2619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_insert_command2627 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LPAREN_in_insert_command2629 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_values_in_insert_command2631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_insert_command2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_for_update2659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_for_update2661 = new BitSet(new long[]{0x0000000000000002L,0x0140000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_of_statement_in_for_update2663 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_wait_statement_in_for_update2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_of_statement2686 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_expr_in_of_statement2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_wait_statement2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_wait_statement2711 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_N_in_wait_statement2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_delete_command2730 = new BitSet(new long[]{0x0000000000000000L,0x0000010020000000L});
    public static final BitSet FOLLOW_indexClause_in_delete_command2732 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_fromClause_in_delete_command2735 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_whereClause_in_delete_command2737 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_delete_command2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_update_command2768 = new BitSet(new long[]{0x0020010000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_indexClause_in_update_command2770 = new BitSet(new long[]{0x0020010000000000L});
    public static final BitSet FOLLOW_selected_table_in_update_command2773 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_setclause_in_update_command2776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_whereClause_in_update_command2778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_OracleParser541 = new BitSet(new long[]{0x01A0010000000200L,0x0080004840000442L,0x0000000000000001L});
    public static final BitSet FOLLOW_condition_or_in_synpred1_OracleParser543 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred1_OracleParser545 = new BitSet(new long[]{0x0000000000000002L});

}