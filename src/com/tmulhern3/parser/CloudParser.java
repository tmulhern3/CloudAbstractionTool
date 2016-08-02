package com.tmulhern3.parser;

// Generated from C:\Users\Tim\IdeaProjects\CloudAbstractionTool\resources\Cloud.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CloudParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, SERVER=3, PROVIDER=4, EQ=5, LPAREN=6, RPAREN=7, ID=8, 
		WHITESPACE=9;
	public static final int
		RULE_program = 0, RULE_provider = 1, RULE_statement_sequence = 2, RULE_statement_sequence_prime = 3, 
		RULE_statement = 4, RULE_server_dec_seq = 5, RULE_server_dec_seq_prime = 6, 
		RULE_server_dec = 7;
	public static final String[] ruleNames = {
		"program", "provider", "statement_sequence", "statement_sequence_prime", 
		"statement", "server_dec_seq", "server_dec_seq_prime", "server_dec"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "'server'", "'provider'", "'='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BEGIN", "END", "SERVER", "PROVIDER", "EQ", "LPAREN", "RPAREN", 
		"ID", "WHITESPACE"
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
	public String getGrammarFileName() { return "Cloud.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CloudParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CloudParser.BEGIN, 0); }
		public ProviderContext provider() {
			return getRuleContext(ProviderContext.class,0);
		}
		public Statement_sequenceContext statement_sequence() {
			return getRuleContext(Statement_sequenceContext.class,0);
		}
		public TerminalNode END() { return getToken(CloudParser.END, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(BEGIN);
			setState(17);
			provider();
			setState(18);
			statement_sequence();
			setState(19);
			match(END);
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

	public static class ProviderContext extends ParserRuleContext {
		public TerminalNode PROVIDER() { return getToken(CloudParser.PROVIDER, 0); }
		public TerminalNode EQ() { return getToken(CloudParser.EQ, 0); }
		public TerminalNode ID() { return getToken(CloudParser.ID, 0); }
		public ProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitProvider(this);
		}
	}

	public final ProviderContext provider() throws RecognitionException {
		ProviderContext _localctx = new ProviderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_provider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(PROVIDER);
			setState(22);
			match(EQ);
			setState(23);
			match(ID);
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

	public static class Statement_sequenceContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_sequence_primeContext statement_sequence_prime() {
			return getRuleContext(Statement_sequence_primeContext.class,0);
		}
		public Statement_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterStatement_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitStatement_sequence(this);
		}
	}

	public final Statement_sequenceContext statement_sequence() throws RecognitionException {
		Statement_sequenceContext _localctx = new Statement_sequenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement_sequence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			statement();
			setState(26);
			statement_sequence_prime();
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

	public static class Statement_sequence_primeContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_sequence_primeContext statement_sequence_prime() {
			return getRuleContext(Statement_sequence_primeContext.class,0);
		}
		public Statement_sequence_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_sequence_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterStatement_sequence_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitStatement_sequence_prime(this);
		}
	}

	public final Statement_sequence_primeContext statement_sequence_prime() throws RecognitionException {
		Statement_sequence_primeContext _localctx = new Statement_sequence_primeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement_sequence_prime);
		try {
			setState(32);
			switch (_input.LA(1)) {
			case SERVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				statement();
				setState(29);
				statement_sequence_prime();
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SERVER() { return getToken(CloudParser.SERVER, 0); }
		public TerminalNode EQ() { return getToken(CloudParser.EQ, 0); }
		public TerminalNode LPAREN() { return getToken(CloudParser.LPAREN, 0); }
		public Server_dec_seqContext server_dec_seq() {
			return getRuleContext(Server_dec_seqContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CloudParser.RPAREN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(SERVER);
			setState(35);
			match(EQ);
			setState(36);
			match(LPAREN);
			setState(37);
			server_dec_seq();
			setState(38);
			match(RPAREN);
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

	public static class Server_dec_seqContext extends ParserRuleContext {
		public Server_decContext server_dec() {
			return getRuleContext(Server_decContext.class,0);
		}
		public Server_dec_seq_primeContext server_dec_seq_prime() {
			return getRuleContext(Server_dec_seq_primeContext.class,0);
		}
		public Server_dec_seqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_dec_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterServer_dec_seq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitServer_dec_seq(this);
		}
	}

	public final Server_dec_seqContext server_dec_seq() throws RecognitionException {
		Server_dec_seqContext _localctx = new Server_dec_seqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_server_dec_seq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			server_dec();
			setState(41);
			server_dec_seq_prime();
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

	public static class Server_dec_seq_primeContext extends ParserRuleContext {
		public Server_decContext server_dec() {
			return getRuleContext(Server_decContext.class,0);
		}
		public Server_dec_seq_primeContext server_dec_seq_prime() {
			return getRuleContext(Server_dec_seq_primeContext.class,0);
		}
		public Server_dec_seq_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_dec_seq_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterServer_dec_seq_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitServer_dec_seq_prime(this);
		}
	}

	public final Server_dec_seq_primeContext server_dec_seq_prime() throws RecognitionException {
		Server_dec_seq_primeContext _localctx = new Server_dec_seq_primeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_server_dec_seq_prime);
		try {
			setState(47);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				server_dec();
				setState(44);
				server_dec_seq_prime();
				}
				break;
			case RPAREN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Server_decContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CloudParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CloudParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(CloudParser.EQ, 0); }
		public Server_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_server_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).enterServer_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CloudListener ) ((CloudListener)listener).exitServer_dec(this);
		}
	}

	public final Server_decContext server_dec() throws RecognitionException {
		Server_decContext _localctx = new Server_decContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_server_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(EQ);
			setState(51);
			match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\138\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5#\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\62\n\b\3\t\3\t\3\t\3\t\3\t\2"+
		"\2\n\2\4\6\b\n\f\16\20\2\2\61\2\22\3\2\2\2\4\27\3\2\2\2\6\33\3\2\2\2\b"+
		"\"\3\2\2\2\n$\3\2\2\2\f*\3\2\2\2\16\61\3\2\2\2\20\63\3\2\2\2\22\23\7\3"+
		"\2\2\23\24\5\4\3\2\24\25\5\6\4\2\25\26\7\4\2\2\26\3\3\2\2\2\27\30\7\6"+
		"\2\2\30\31\7\7\2\2\31\32\7\n\2\2\32\5\3\2\2\2\33\34\5\n\6\2\34\35\5\b"+
		"\5\2\35\7\3\2\2\2\36\37\5\n\6\2\37 \5\b\5\2 #\3\2\2\2!#\3\2\2\2\"\36\3"+
		"\2\2\2\"!\3\2\2\2#\t\3\2\2\2$%\7\5\2\2%&\7\7\2\2&\'\7\b\2\2\'(\5\f\7\2"+
		"()\7\t\2\2)\13\3\2\2\2*+\5\20\t\2+,\5\16\b\2,\r\3\2\2\2-.\5\20\t\2./\5"+
		"\16\b\2/\62\3\2\2\2\60\62\3\2\2\2\61-\3\2\2\2\61\60\3\2\2\2\62\17\3\2"+
		"\2\2\63\64\7\n\2\2\64\65\7\7\2\2\65\66\7\n\2\2\66\21\3\2\2\2\4\"\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}