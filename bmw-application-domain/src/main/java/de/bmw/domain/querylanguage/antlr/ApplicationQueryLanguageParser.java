// Generated from ApplicationQueryLanguage.g4 by ANTLR 4.3

	package de.bmw.domain.querylanguage.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApplicationQueryLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LADE=1, VON=2, WENN=3, OPERATOR=4, OPERATORPOSTFIX=5, WORD=6, WS=7;
	public static final String[] tokenNames = {
		"<INVALID>", "LADE", "VON", "WENN", "OPERATOR", "OPERATORPOSTFIX", "WORD", 
		"WS"
	};
	public static final int
		RULE_query = 0, RULE_ladeexpr = 1, RULE_vonexpr = 2, RULE_wennexpr = 3;
	public static final String[] ruleNames = {
		"query", "ladeexpr", "vonexpr", "wennexpr"
	};

	@Override
	public String getGrammarFileName() { return "ApplicationQueryLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ApplicationQueryLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QueryContext extends ParserRuleContext {
		public VonexprContext vonexpr() {
			return getRuleContext(VonexprContext.class,0);
		}
		public WennexprContext wennexpr(int i) {
			return getRuleContext(WennexprContext.class,i);
		}
		public LadeexprContext ladeexpr(int i) {
			return getRuleContext(LadeexprContext.class,i);
		}
		public List<WennexprContext> wennexpr() {
			return getRuleContexts(WennexprContext.class);
		}
		public List<LadeexprContext> ladeexpr() {
			return getRuleContexts(LadeexprContext.class);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApplicationQueryLanguageVisitor ) return ((ApplicationQueryLanguageVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8); ladeexpr();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LADE );
			setState(13); vonexpr();
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); wennexpr();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WENN );
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

	public static class LadeexprContext extends ParserRuleContext {
		public LadeexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladeexpr; }
	 
		public LadeexprContext() { }
		public void copyFrom(LadeexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LadeContext extends LadeexprContext {
		public TerminalNode WORD() { return getToken(ApplicationQueryLanguageParser.WORD, 0); }
		public TerminalNode OPERATORPOSTFIX() { return getToken(ApplicationQueryLanguageParser.OPERATORPOSTFIX, 0); }
		public TerminalNode LADE() { return getToken(ApplicationQueryLanguageParser.LADE, 0); }
		public TerminalNode OPERATOR() { return getToken(ApplicationQueryLanguageParser.OPERATOR, 0); }
		public LadeContext(LadeexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApplicationQueryLanguageVisitor ) return ((ApplicationQueryLanguageVisitor<? extends T>)visitor).visitLade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LadeexprContext ladeexpr() throws RecognitionException {
		LadeexprContext _localctx = new LadeexprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ladeexpr);
		try {
			_localctx = new LadeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(LADE);
			setState(20); match(OPERATOR);
			setState(21); match(WORD);
			setState(22); match(OPERATORPOSTFIX);
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

	public static class VonexprContext extends ParserRuleContext {
		public VonexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vonexpr; }
	 
		public VonexprContext() { }
		public void copyFrom(VonexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VonContext extends VonexprContext {
		public TerminalNode WORD() { return getToken(ApplicationQueryLanguageParser.WORD, 0); }
		public TerminalNode OPERATORPOSTFIX() { return getToken(ApplicationQueryLanguageParser.OPERATORPOSTFIX, 0); }
		public TerminalNode VON() { return getToken(ApplicationQueryLanguageParser.VON, 0); }
		public TerminalNode OPERATOR() { return getToken(ApplicationQueryLanguageParser.OPERATOR, 0); }
		public VonContext(VonexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApplicationQueryLanguageVisitor ) return ((ApplicationQueryLanguageVisitor<? extends T>)visitor).visitVon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VonexprContext vonexpr() throws RecognitionException {
		VonexprContext _localctx = new VonexprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vonexpr);
		try {
			_localctx = new VonContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(VON);
			setState(25); match(OPERATOR);
			setState(26); match(WORD);
			setState(27); match(OPERATORPOSTFIX);
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

	public static class WennexprContext extends ParserRuleContext {
		public WennexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wennexpr; }
	 
		public WennexprContext() { }
		public void copyFrom(WennexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WennContext extends WennexprContext {
		public TerminalNode WENN() { return getToken(ApplicationQueryLanguageParser.WENN, 0); }
		public TerminalNode WORD() { return getToken(ApplicationQueryLanguageParser.WORD, 0); }
		public TerminalNode OPERATORPOSTFIX() { return getToken(ApplicationQueryLanguageParser.OPERATORPOSTFIX, 0); }
		public TerminalNode OPERATOR() { return getToken(ApplicationQueryLanguageParser.OPERATOR, 0); }
		public WennContext(WennexprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ApplicationQueryLanguageVisitor ) return ((ApplicationQueryLanguageVisitor<? extends T>)visitor).visitWenn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WennexprContext wennexpr() throws RecognitionException {
		WennexprContext _localctx = new WennexprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_wennexpr);
		try {
			_localctx = new WennContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29); match(WENN);
			setState(30); match(OPERATOR);
			setState(31); match(WORD);
			setState(32); match(OPERATORPOSTFIX);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\t%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\6\2\f\n\2\r\2\16\2\r\3\2\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\2\2\6\2\4\6\b\2\2\"\2\13\3\2\2\2\4\25\3\2\2\2\6\32\3\2\2\2\b\37\3\2\2"+
		"\2\n\f\5\4\3\2\13\n\3\2\2\2\f\r\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16\17"+
		"\3\2\2\2\17\21\5\6\4\2\20\22\5\b\5\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21"+
		"\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\7\3\2\2\26\27\7\6\2\2\27\30"+
		"\7\b\2\2\30\31\7\7\2\2\31\5\3\2\2\2\32\33\7\4\2\2\33\34\7\6\2\2\34\35"+
		"\7\b\2\2\35\36\7\7\2\2\36\7\3\2\2\2\37 \7\5\2\2 !\7\6\2\2!\"\7\b\2\2\""+
		"#\7\7\2\2#\t\3\2\2\2\4\r\23";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}