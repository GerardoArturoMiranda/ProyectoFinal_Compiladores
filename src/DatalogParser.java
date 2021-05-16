// Generated from /Users/gerardoarturomiranda/Documents/Diseño de Compiladores/ProyectoFinal_Compiladores/src/Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NOT=7, COUNT=8, AVG=9, 
		SUM=10, MIN=11, MAX=12, INTEGERLITERAL=13, FLOATINGPOINTLITERAL=14, BOOLEANLITERAL=15, 
		CHARACTERLITERAL=16, STRINGLITERAL=17, PREDICATE=18, IDENTIFIER=19, WS=20, 
		COMMENT=21, MULTILINE_COMMENT=22, BIGGERTHAN=23, BIGGEREQUALTHAN=24, SMALLERTHAN=25, 
		SMALLEREQUALTHAN=26, NOTEQUAL=27, EQUAL=28;
	public static final int
		RULE_program = 0, RULE_fact = 1, RULE_literalList = 2, RULE_facts = 3, 
		RULE_condition = 4, RULE_rule = 5, RULE_end = 6, RULE_rules = 7, RULE_query = 8, 
		RULE_atom = 9, RULE_atoms = 10, RULE_variableOrLiteral = 11, RULE_variableOrLiterals = 12, 
		RULE_aggregateVariable = 13, RULE_aggregateOp = 14, RULE_variable = 15, 
		RULE_predicate = 16, RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fact", "literalList", "facts", "condition", "rule", "end", 
			"rules", "query", "atom", "atoms", "variableOrLiteral", "variableOrLiterals", 
			"aggregateVariable", "aggregateOp", "variable", "predicate", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "':-'", "'.'", "'?-'", "'not'", "'count'", 
			"'avg'", "'sum'", "'min'", "'max'", null, null, null, null, null, null, 
			null, null, null, null, "'>'", "'>='", "'<'", "'<='", "'<>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NOT", "COUNT", "AVG", "SUM", 
			"MIN", "MAX", "INTEGERLITERAL", "FLOATINGPOINTLITERAL", "BOOLEANLITERAL", 
			"CHARACTERLITERAL", "STRINGLITERAL", "PREDICATE", "IDENTIFIER", "WS", 
			"COMMENT", "MULTILINE_COMMENT", "BIGGERTHAN", "BIGGEREQUALTHAN", "SMALLERTHAN", 
			"SMALLEREQUALTHAN", "NOTEQUAL", "EQUAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public FactsContext facts() {
			return getRuleContext(FactsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				facts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(37);
					facts();
					}
					break;
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT || _la==PREDICATE) {
					{
					setState(40);
					rules();
					}
				}

				setState(43);
				query();
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

	public static class FactContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public LiteralListContext literalList() {
			return getRuleContext(LiteralListContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			predicate();
			setState(47);
			match(T__0);
			setState(48);
			literalList();
			setState(49);
			match(T__1);
			setState(50);
			end();
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

	public static class LiteralListContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public LiteralListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteralList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitLiteralList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralListContext literalList() throws RecognitionException {
		LiteralListContext _localctx = new LiteralListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			literal();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(53);
				match(T__2);
				setState(54);
				literal();
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FactsContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public FactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFacts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFacts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitFacts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactsContext facts() throws RecognitionException {
		FactsContext _localctx = new FactsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_facts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(60);
					fact();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ConditionContext extends ParserRuleContext {
		public List<VariableOrLiteralContext> variableOrLiteral() {
			return getRuleContexts(VariableOrLiteralContext.class);
		}
		public VariableOrLiteralContext variableOrLiteral(int i) {
			return getRuleContext(VariableOrLiteralContext.class,i);
		}
		public TerminalNode BIGGERTHAN() { return getToken(DatalogParser.BIGGERTHAN, 0); }
		public TerminalNode BIGGEREQUALTHAN() { return getToken(DatalogParser.BIGGEREQUALTHAN, 0); }
		public TerminalNode SMALLEREQUALTHAN() { return getToken(DatalogParser.SMALLEREQUALTHAN, 0); }
		public TerminalNode SMALLERTHAN() { return getToken(DatalogParser.SMALLERTHAN, 0); }
		public TerminalNode NOTEQUAL() { return getToken(DatalogParser.NOTEQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(DatalogParser.EQUAL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				variableOrLiteral();
				setState(66);
				match(BIGGERTHAN);
				setState(67);
				variableOrLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				variableOrLiteral();
				setState(70);
				match(BIGGEREQUALTHAN);
				setState(71);
				variableOrLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				variableOrLiteral();
				setState(74);
				match(SMALLEREQUALTHAN);
				setState(75);
				variableOrLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				variableOrLiteral();
				setState(78);
				match(SMALLERTHAN);
				setState(79);
				variableOrLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				variableOrLiteral();
				setState(82);
				match(NOTEQUAL);
				setState(83);
				variableOrLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				variableOrLiteral();
				setState(86);
				match(EQUAL);
				setState(87);
				variableOrLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
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

	public static class RuleContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			atom();
			setState(93);
			match(T__3);
			setState(94);
			atoms();
			setState(95);
			end();
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__4);
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

	public static class RulesContext extends ParserRuleContext {
		public List<RuleContext> rule() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				rule();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOT || _la==PREDICATE );
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

	public static class QueryContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__5);
			setState(105);
			atom();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(106);
				match(T__2);
				setState(107);
				condition();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			end();
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

	public static class AtomContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public VariableOrLiteralsContext variableOrLiterals() {
			return getRuleContext(VariableOrLiteralsContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DatalogParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREDICATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				predicate();
				setState(116);
				match(T__0);
				setState(117);
				variableOrLiterals();
				setState(118);
				match(T__1);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(NOT);
				setState(121);
				atom();
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

	public static class AtomsContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAtoms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAtoms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atoms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			atom();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(125);
				match(T__2);
				setState(126);
				atom();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableOrLiteralContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AggregateVariableContext aggregateVariable() {
			return getRuleContext(AggregateVariableContext.class,0);
		}
		public VariableOrLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariableOrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariableOrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVariableOrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrLiteralContext variableOrLiteral() throws RecognitionException {
		VariableOrLiteralContext _localctx = new VariableOrLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableOrLiteral);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				variable();
				}
				break;
			case INTEGERLITERAL:
			case FLOATINGPOINTLITERAL:
			case BOOLEANLITERAL:
			case CHARACTERLITERAL:
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				literal();
				}
				break;
			case COUNT:
			case AVG:
			case SUM:
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				aggregateVariable();
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

	public static class VariableOrLiteralsContext extends ParserRuleContext {
		public List<VariableOrLiteralContext> variableOrLiteral() {
			return getRuleContexts(VariableOrLiteralContext.class);
		}
		public VariableOrLiteralContext variableOrLiteral(int i) {
			return getRuleContext(VariableOrLiteralContext.class,i);
		}
		public VariableOrLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariableOrLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariableOrLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVariableOrLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrLiteralsContext variableOrLiterals() throws RecognitionException {
		VariableOrLiteralsContext _localctx = new VariableOrLiteralsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableOrLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			variableOrLiteral();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(138);
				match(T__2);
				setState(139);
				variableOrLiteral();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class AggregateVariableContext extends ParserRuleContext {
		public AggregateOpContext aggregateOp() {
			return getRuleContext(AggregateOpContext.class,0);
		}
		public TerminalNode SMALLERTHAN() { return getToken(DatalogParser.SMALLERTHAN, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode BIGGERTHAN() { return getToken(DatalogParser.BIGGERTHAN, 0); }
		public AggregateVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAggregateVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAggregateVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAggregateVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateVariableContext aggregateVariable() throws RecognitionException {
		AggregateVariableContext _localctx = new AggregateVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggregateVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			aggregateOp();
			setState(146);
			match(SMALLERTHAN);
			setState(147);
			variable();
			setState(148);
			match(BIGGERTHAN);
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

	public static class AggregateOpContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(DatalogParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(DatalogParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(DatalogParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(DatalogParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(DatalogParser.MAX, 0); }
		public AggregateOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAggregateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAggregateOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateOpContext aggregateOp() throws RecognitionException {
		AggregateOpContext _localctx = new AggregateOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggregateOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COUNT) | (1L << AVG) | (1L << SUM) | (1L << MIN) | (1L << MAX))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(DatalogParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(IDENTIFIER);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode PREDICATE() { return getToken(DatalogParser.PREDICATE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PREDICATE);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(DatalogParser.INTEGERLITERAL, 0); }
		public TerminalNode FLOATINGPOINTLITERAL() { return getToken(DatalogParser.FLOATINGPOINTLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(DatalogParser.BOOLEANLITERAL, 0); }
		public TerminalNode CHARACTERLITERAL() { return getToken(DatalogParser.CHARACTERLITERAL, 0); }
		public TerminalNode STRINGLITERAL() { return getToken(DatalogParser.STRINGLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERLITERAL) | (1L << FLOATINGPOINTLITERAL) | (1L << BOOLEANLITERAL) | (1L << CHARACTERLITERAL) | (1L << STRINGLITERAL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\5\2,\n\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\6\5@\n\5\r\5\16\5A\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\6\tg\n\t\r\t\16\th\3\n\3\n\3\n\3\n\7\no\n\n\f\n\16\nr\13\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13}\n\13\3\f\3\f\3\f\7\f\u0082\n\f"+
		"\f\f\16\f\u0085\13\f\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\16\7\16\u008f"+
		"\n\16\f\16\16\16\u0092\13\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\4\3\2\n\16\3\2\17\23\2\u00a0\2.\3\2\2\2\4\60\3\2\2\2\6\66\3"+
		"\2\2\2\b?\3\2\2\2\n\\\3\2\2\2\f^\3\2\2\2\16c\3\2\2\2\20f\3\2\2\2\22j\3"+
		"\2\2\2\24|\3\2\2\2\26~\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u0093"+
		"\3\2\2\2\36\u0098\3\2\2\2 \u009a\3\2\2\2\"\u009c\3\2\2\2$\u009e\3\2\2"+
		"\2&/\5\b\5\2\')\5\b\5\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\20\t\2+*\3"+
		"\2\2\2+,\3\2\2\2,-\3\2\2\2-/\5\22\n\2.&\3\2\2\2.(\3\2\2\2/\3\3\2\2\2\60"+
		"\61\5\"\22\2\61\62\7\3\2\2\62\63\5\6\4\2\63\64\7\4\2\2\64\65\5\16\b\2"+
		"\65\5\3\2\2\2\66;\5$\23\2\678\7\5\2\28:\5$\23\29\67\3\2\2\2:=\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2>@\5\4\3\2?>\3\2\2\2@A\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CD\5\30\r\2DE\7\31\2\2EF\5\30\r\2F]\3"+
		"\2\2\2GH\5\30\r\2HI\7\32\2\2IJ\5\30\r\2J]\3\2\2\2KL\5\30\r\2LM\7\34\2"+
		"\2MN\5\30\r\2N]\3\2\2\2OP\5\30\r\2PQ\7\33\2\2QR\5\30\r\2R]\3\2\2\2ST\5"+
		"\30\r\2TU\7\35\2\2UV\5\30\r\2V]\3\2\2\2WX\5\30\r\2XY\7\36\2\2YZ\5\30\r"+
		"\2Z]\3\2\2\2[]\3\2\2\2\\C\3\2\2\2\\G\3\2\2\2\\K\3\2\2\2\\O\3\2\2\2\\S"+
		"\3\2\2\2\\W\3\2\2\2\\[\3\2\2\2]\13\3\2\2\2^_\5\24\13\2_`\7\6\2\2`a\5\26"+
		"\f\2ab\5\16\b\2b\r\3\2\2\2cd\7\7\2\2d\17\3\2\2\2eg\5\f\7\2fe\3\2\2\2g"+
		"h\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\21\3\2\2\2jk\7\b\2\2kp\5\24\13\2lm\7\5"+
		"\2\2mo\5\n\6\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2"+
		"\2\2st\5\16\b\2t\23\3\2\2\2uv\5\"\22\2vw\7\3\2\2wx\5\32\16\2xy\7\4\2\2"+
		"y}\3\2\2\2z{\7\t\2\2{}\5\24\13\2|u\3\2\2\2|z\3\2\2\2}\25\3\2\2\2~\u0083"+
		"\5\24\13\2\177\u0080\7\5\2\2\u0080\u0082\5\24\13\2\u0081\177\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\27\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0086\u008a\5 \21\2\u0087\u008a\5$\23\2\u0088\u008a"+
		"\5\34\17\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2"+
		"\u008a\31\3\2\2\2\u008b\u0090\5\30\r\2\u008c\u008d\7\5\2\2\u008d\u008f"+
		"\5\30\r\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\33\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094"+
		"\5\36\20\2\u0094\u0095\7\33\2\2\u0095\u0096\5 \21\2\u0096\u0097\7\31\2"+
		"\2\u0097\35\3\2\2\2\u0098\u0099\t\2\2\2\u0099\37\3\2\2\2\u009a\u009b\7"+
		"\25\2\2\u009b!\3\2\2\2\u009c\u009d\7\24\2\2\u009d#\3\2\2\2\u009e\u009f"+
		"\t\3\2\2\u009f%\3\2\2\2\16(+.;A\\hp|\u0083\u0089\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}