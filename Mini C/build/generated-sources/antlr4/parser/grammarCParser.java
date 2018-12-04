// Generated from C:\Users\laris.DESKTOP-LM3EARV\Desktop\Mini C\grammar\parser\grammarC.g4 by ANTLR 4.6

package parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, DOUBLE=4, CHAR=5, SUM=6, DIV=7, MULT=8, MINUS=9, 
		TRUE=10, FALSE=11, EQUALS=12, B_EXPR=13, E_EXPR=14, SWITCH=15, CASE=16, 
		M_IGUAL=17, Ma_IGUAL=18, MAIOR=19, MENOR=20, EEQUALS=21, DIF=22, WHILE=23, 
		IF=24, DO=25, FOR=26, BREAK=27, DEFAULT=28, CHARC=29, NUM=30, ID=31, STRING=32, 
		ELSE=33, PRINTF=34, SCANF=35, B_BLOCK=36, E_BLOCK=37, EOL=38, WS=39;
	public static final int
		RULE_prog = 0, RULE_ifstmt = 1, RULE_cond = 2, RULE_expr = 3, RULE_term = 4, 
		RULE_fact = 5, RULE_booleanb = 6, RULE_relop = 7, RULE_block = 8, RULE_stmt = 9, 
		RULE_whilee = 10, RULE_foor = 11, RULE_forzin = 12, RULE_attr = 13, RULE_dec = 14, 
		RULE_type = 15;
	public static final String[] ruleNames = {
		"prog", "ifstmt", "cond", "expr", "term", "fact", "booleanb", "relop", 
		"block", "stmt", "whilee", "foor", "forzin", "attr", "dec", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'int'", "'double'", "'char'", "'+'", "'/'", "'*'", 
		"'-'", "'true'", "'false'", "'='", "'('", "')'", "'switch'", "'case'", 
		"'<='", "'>='", "'>'", "'<'", "'=='", "'!='", "'while'", "'if'", "'do'", 
		"'for'", "'break'", "'default'", null, null, null, null, "'else'", "'printf'", 
		"'scanf'", "'{'", "'}'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INT", "DOUBLE", "CHAR", "SUM", "DIV", "MULT", "MINUS", 
		"TRUE", "FALSE", "EQUALS", "B_EXPR", "E_EXPR", "SWITCH", "CASE", "M_IGUAL", 
		"Ma_IGUAL", "MAIOR", "MENOR", "EEQUALS", "DIF", "WHILE", "IF", "DO", "FOR", 
		"BREAK", "DEFAULT", "CHARC", "NUM", "ID", "STRING", "ELSE", "PRINTF", 
		"SCANF", "B_BLOCK", "E_BLOCK", "EOL", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "grammarC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				stmt();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << ID) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfstmtContext extends ParserRuleContext {
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	 
		public IfstmtContext() { }
		public void copyFrom(IfstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStmtContext extends IfstmtContext {
		public TerminalNode IF() { return getToken(grammarCParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStmtContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmtElseContext extends IfstmtContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(grammarCParser.IF, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(grammarCParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfStmtElseContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitIfStmtElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ifstmt);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(IF);
				setState(38);
				match(B_EXPR);
				setState(39);
				cond();
				setState(40);
				match(E_EXPR);
				setState(41);
				block();
				}
				break;
			case 2:
				_localctx = new IfStmtElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(IF);
				setState(44);
				match(B_EXPR);
				setState(45);
				cond();
				setState(46);
				match(E_EXPR);
				setState(47);
				((IfStmtElseContext)_localctx).b1 = block();
				setState(48);
				match(ELSE);
				setState(49);
				((IfStmtElseContext)_localctx).b2 = block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			expr(0);
			setState(54);
			relop();
			setState(55);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPlusContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprHContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprHContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprH(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMinContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprMinContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprMin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprTermContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(58);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprPlusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(61);
						match(SUM);
						setState(62);
						term(0);
						}
						break;
					case 2:
						{
						_localctx = new ExprMinContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(64);
						match(MINUS);
						setState(65);
						term(0);
						}
						break;
					case 3:
						{
						_localctx = new ExprHContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(67);
						term(0);
						}
						break;
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermDivContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitTermDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermMultContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitTermMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermFactContext extends TermContext {
		public FactContext fact() {
			return getRuleContext(FactContext.class,0);
		}
		public TermFactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitTermFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermFactContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(74);
			fact();
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new TermMultContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(76);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(77);
						match(MULT);
						setState(78);
						fact();
						}
						break;
					case 2:
						{
						_localctx = new TermDivContext(new TermContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(79);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(80);
						match(DIV);
						setState(81);
						fact();
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactContext extends ParserRuleContext {
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr2parContext extends FactContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr2parContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExpr2par(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStrContext extends FactContext {
		public TerminalNode STRING() { return getToken(grammarCParser.STRING, 0); }
		public ExprStrContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolContext extends FactContext {
		public BooleanbContext booleanb() {
			return getRuleContext(BooleanbContext.class,0);
		}
		public ExprBoolContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIdContext extends FactContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprIdContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNumContext extends FactContext {
		public TerminalNode NUM() { return getToken(grammarCParser.NUM, 0); }
		public ExprNumContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprCharContext extends FactContext {
		public TerminalNode CHARC() { return getToken(grammarCParser.CHARC, 0); }
		public ExprCharContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fact);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case B_EXPR:
				_localctx = new Expr2parContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(B_EXPR);
				setState(88);
				expr(0);
				setState(89);
				match(E_EXPR);
				}
				break;
			case NUM:
				_localctx = new ExprNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(NUM);
				}
				break;
			case ID:
				_localctx = new ExprIdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new ExprStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(STRING);
				}
				break;
			case CHARC:
				_localctx = new ExprCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(CHARC);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new ExprBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				booleanb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanbContext extends ParserRuleContext {
		public BooleanbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanb; }
	 
		public BooleanbContext() { }
		public void copyFrom(BooleanbContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprFalseContext extends BooleanbContext {
		public TerminalNode FALSE() { return getToken(grammarCParser.FALSE, 0); }
		public ExprFalseContext(BooleanbContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprTrueContext extends BooleanbContext {
		public TerminalNode TRUE() { return getToken(grammarCParser.TRUE, 0); }
		public ExprTrueContext(BooleanbContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitExprTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanbContext booleanb() throws RecognitionException {
		BooleanbContext _localctx = new BooleanbContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_booleanb);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new ExprTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new ExprFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitRelop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << M_IGUAL) | (1L << Ma_IGUAL) | (1L << MAIOR) | (1L << MENOR) | (1L << EEQUALS) | (1L << DIF))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockSingleContext extends BlockContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockSingleContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitBlockSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockComposeContext extends BlockContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockComposeContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitBlockCompose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case INT:
			case DOUBLE:
			case CHAR:
			case WHILE:
			case IF:
			case FOR:
			case ID:
			case STRING:
			case ELSE:
			case E_BLOCK:
				_localctx = new BlockSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(104);
					stmt();
					}
					break;
				}
				}
				break;
			case B_BLOCK:
				_localctx = new BlockComposeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(B_BLOCK);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << WHILE) | (1L << IF) | (1L << FOR) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					{
					setState(108);
					stmt();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(E_BLOCK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtWhileContext extends StmtContext {
		public WhileeContext whilee() {
			return getRuleContext(WhileeContext.class,0);
		}
		public StmtWhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAttrContext extends StmtContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarCParser.EOL, 0); }
		public StmtAttrContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtForContext extends StmtContext {
		public FoorContext foor() {
			return getRuleContext(FoorContext.class,0);
		}
		public StmtForContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfContext extends StmtContext {
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public StmtIfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmrDecContext extends StmtContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public TerminalNode EOL() { return getToken(grammarCParser.EOL, 0); }
		public StmrDecContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitStmrDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stmt);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				ifstmt();
				}
				break;
			case ID:
				_localctx = new StmtAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				attr();
				setState(119);
				match(EOL);
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
				_localctx = new StmrDecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				dec();
				setState(122);
				match(EOL);
				}
				break;
			case WHILE:
				_localctx = new StmtWhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				whilee();
				}
				break;
			case FOR:
				_localctx = new StmtForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				foor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileeContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(grammarCParser.WHILE, 0); }
		public TerminalNode B_EXPR() { return getToken(grammarCParser.B_EXPR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode E_EXPR() { return getToken(grammarCParser.E_EXPR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilee; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitWhilee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileeContext whilee() throws RecognitionException {
		WhileeContext _localctx = new WhileeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whilee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(WHILE);
			setState(129);
			match(B_EXPR);
			setState(130);
			cond();
			setState(131);
			match(E_EXPR);
			setState(132);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FoorContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(grammarCParser.FOR, 0); }
		public TerminalNode B_EXPR() { return getToken(grammarCParser.B_EXPR, 0); }
		public ForzinContext forzin() {
			return getRuleContext(ForzinContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(grammarCParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(grammarCParser.EOL, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public TerminalNode E_EXPR() { return getToken(grammarCParser.E_EXPR, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FoorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitFoor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FoorContext foor() throws RecognitionException {
		FoorContext _localctx = new FoorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_foor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(FOR);
			setState(135);
			match(B_EXPR);
			setState(136);
			forzin();
			setState(137);
			match(EOL);
			setState(138);
			cond();
			setState(139);
			match(EOL);
			setState(140);
			attr();
			setState(141);
			match(E_EXPR);
			setState(142);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForzinContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public ForzinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forzin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitForzin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForzinContext forzin() throws RecognitionException {
		ForzinContext _localctx = new ForzinContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_forzin);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				attr();
				}
				break;
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				dec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttrContext extends ParserRuleContext {
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
	 
		public AttrContext() { }
		public void copyFrom(AttrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AttrMinuMinusContext extends AttrContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public AttrMinuMinusContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitAttrMinuMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrSimpleContext extends AttrContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrSimpleContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitAttrSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrPlusPlusContext extends AttrContext {
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public AttrPlusPlusContext(AttrContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitAttrPlusPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attr);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AttrSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(ID);
				setState(149);
				match(EQUALS);
				setState(150);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AttrMinuMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ID);
				setState(152);
				match(MINUS);
				setState(153);
				match(MINUS);
				}
				break;
			case 3:
				_localctx = new AttrPlusPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(ID);
				setState(155);
				match(SUM);
				setState(156);
				match(SUM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclArrayContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclArrayContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclVSimpleContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclVSimpleContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclVSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclArraySContext extends DecContext {
		public TerminalNode CHAR() { return getToken(grammarCParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public TerminalNode STRING() { return getToken(grammarCParser.STRING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclArraySContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclArrayS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclValuePointerContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclValuePointerContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclValuePointer(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclSimpleContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public DeclSimpleContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclPointerContext extends DecContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(grammarCParser.ID, 0); }
		public DeclPointerContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitDeclPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dec);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new DeclSimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				type();
				setState(160);
				match(ID);
				}
				break;
			case 2:
				_localctx = new DeclPointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				type();
				setState(163);
				match(MULT);
				setState(164);
				match(ID);
				}
				break;
			case 3:
				_localctx = new DeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				type();
				setState(167);
				match(ID);
				setState(168);
				match(T__0);
				setState(169);
				expr(0);
				setState(170);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new DeclVSimpleContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				type();
				setState(173);
				match(ID);
				setState(174);
				match(EQUALS);
				setState(175);
				expr(0);
				}
				break;
			case 5:
				_localctx = new DeclValuePointerContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				type();
				setState(178);
				match(MULT);
				setState(179);
				match(ID);
				setState(180);
				match(EQUALS);
				setState(181);
				expr(0);
				}
				break;
			case 6:
				_localctx = new DeclArraySContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(CHAR);
				setState(184);
				match(ID);
				setState(185);
				match(T__0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << B_EXPR) | (1L << CHARC) | (1L << NUM) | (1L << ID) | (1L << STRING))) != 0)) {
					{
					setState(186);
					expr(0);
					}
				}

				setState(189);
				match(T__1);
				setState(190);
				match(EQUALS);
				setState(191);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(grammarCParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(grammarCParser.CHAR, 0); }
		public TerminalNode DOUBLE() { return getToken(grammarCParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(grammarCParser.STRING, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarCVisitor ) return ((grammarCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00c7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2$\n"+
		"\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3\66\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\7\5G\n\5\f\5\16\5J\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6U\n\6"+
		"\f\6\16\6X\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\5"+
		"\bg\n\b\3\t\3\t\3\n\5\nl\n\n\3\n\3\n\7\np\n\n\f\n\16\ns\13\n\3\n\5\nv"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0081\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\5\16\u0095\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a0"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00be\n\20\3\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\2"+
		"\4\b\n\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\23\30\4\2\5"+
		"\7\"\"\u00d3\2#\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\b;\3\2\2\2\nK\3\2\2"+
		"\2\fb\3\2\2\2\16f\3\2\2\2\20h\3\2\2\2\22u\3\2\2\2\24\u0080\3\2\2\2\26"+
		"\u0082\3\2\2\2\30\u0088\3\2\2\2\32\u0094\3\2\2\2\34\u009f\3\2\2\2\36\u00c2"+
		"\3\2\2\2 \u00c4\3\2\2\2\"$\5\24\13\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&\3\3\2\2\2\'(\7\32\2\2()\7\17\2\2)*\5\6\4\2*+\7\20\2\2+,\5\22"+
		"\n\2,\66\3\2\2\2-.\7\32\2\2./\7\17\2\2/\60\5\6\4\2\60\61\7\20\2\2\61\62"+
		"\5\22\n\2\62\63\7#\2\2\63\64\5\22\n\2\64\66\3\2\2\2\65\'\3\2\2\2\65-\3"+
		"\2\2\2\66\5\3\2\2\2\678\5\b\5\289\5\20\t\29:\5\b\5\2:\7\3\2\2\2;<\b\5"+
		"\1\2<=\5\n\6\2=H\3\2\2\2>?\f\6\2\2?@\7\b\2\2@G\5\n\6\2AB\f\5\2\2BC\7\13"+
		"\2\2CG\5\n\6\2DE\f\4\2\2EG\5\n\6\2F>\3\2\2\2FA\3\2\2\2FD\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2I\t\3\2\2\2JH\3\2\2\2KL\b\6\1\2LM\5\f\7\2MV\3"+
		"\2\2\2NO\f\5\2\2OP\7\n\2\2PU\5\f\7\2QR\f\4\2\2RS\7\t\2\2SU\5\f\7\2TN\3"+
		"\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2\2\2Y"+
		"Z\7\17\2\2Z[\5\b\5\2[\\\7\20\2\2\\c\3\2\2\2]c\7 \2\2^c\7!\2\2_c\7\"\2"+
		"\2`c\7\37\2\2ac\5\16\b\2bY\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3\2\2\2b`\3\2"+
		"\2\2ba\3\2\2\2c\r\3\2\2\2dg\7\f\2\2eg\7\r\2\2fd\3\2\2\2fe\3\2\2\2g\17"+
		"\3\2\2\2hi\t\2\2\2i\21\3\2\2\2jl\5\24\13\2kj\3\2\2\2kl\3\2\2\2lv\3\2\2"+
		"\2mq\7&\2\2np\5\24\13\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2"+
		"\2\2sq\3\2\2\2tv\7\'\2\2uk\3\2\2\2um\3\2\2\2v\23\3\2\2\2w\u0081\5\4\3"+
		"\2xy\5\34\17\2yz\7(\2\2z\u0081\3\2\2\2{|\5\36\20\2|}\7(\2\2}\u0081\3\2"+
		"\2\2~\u0081\5\26\f\2\177\u0081\5\30\r\2\u0080w\3\2\2\2\u0080x\3\2\2\2"+
		"\u0080{\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\25\3\2\2\2\u0082"+
		"\u0083\7\31\2\2\u0083\u0084\7\17\2\2\u0084\u0085\5\6\4\2\u0085\u0086\7"+
		"\20\2\2\u0086\u0087\5\22\n\2\u0087\27\3\2\2\2\u0088\u0089\7\34\2\2\u0089"+
		"\u008a\7\17\2\2\u008a\u008b\5\32\16\2\u008b\u008c\7(\2\2\u008c\u008d\5"+
		"\6\4\2\u008d\u008e\7(\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7\20\2\2\u0090"+
		"\u0091\5\22\n\2\u0091\31\3\2\2\2\u0092\u0095\5\34\17\2\u0093\u0095\5\36"+
		"\20\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\33\3\2\2\2\u0096\u0097"+
		"\7!\2\2\u0097\u0098\7\16\2\2\u0098\u00a0\5\b\5\2\u0099\u009a\7!\2\2\u009a"+
		"\u009b\7\13\2\2\u009b\u00a0\7\13\2\2\u009c\u009d\7!\2\2\u009d\u009e\7"+
		"\b\2\2\u009e\u00a0\7\b\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2\2\2\u009f"+
		"\u009c\3\2\2\2\u00a0\35\3\2\2\2\u00a1\u00a2\5 \21\2\u00a2\u00a3\7!\2\2"+
		"\u00a3\u00c3\3\2\2\2\u00a4\u00a5\5 \21\2\u00a5\u00a6\7\n\2\2\u00a6\u00a7"+
		"\7!\2\2\u00a7\u00c3\3\2\2\2\u00a8\u00a9\5 \21\2\u00a9\u00aa\7!\2\2\u00aa"+
		"\u00ab\7\3\2\2\u00ab\u00ac\5\b\5\2\u00ac\u00ad\7\4\2\2\u00ad\u00c3\3\2"+
		"\2\2\u00ae\u00af\5 \21\2\u00af\u00b0\7!\2\2\u00b0\u00b1\7\16\2\2\u00b1"+
		"\u00b2\5\b\5\2\u00b2\u00c3\3\2\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\n"+
		"\2\2\u00b5\u00b6\7!\2\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\5\b\5\2\u00b8"+
		"\u00c3\3\2\2\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\7!\2\2\u00bb\u00bd\7\3"+
		"\2\2\u00bc\u00be\5\b\5\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00c3\7"+
		"\"\2\2\u00c2\u00a1\3\2\2\2\u00c2\u00a4\3\2\2\2\u00c2\u00a8\3\2\2\2\u00c2"+
		"\u00ae\3\2\2\2\u00c2\u00b3\3\2\2\2\u00c2\u00b9\3\2\2\2\u00c3\37\3\2\2"+
		"\2\u00c4\u00c5\t\3\2\2\u00c5!\3\2\2\2\22%\65FHTVbfkqu\u0080\u0094\u009f"+
		"\u00bd\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}