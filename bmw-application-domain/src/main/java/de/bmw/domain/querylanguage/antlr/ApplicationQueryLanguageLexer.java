// Generated from ApplicationQueryLanguage.g4 by ANTLR 4.3

	package de.bmw.domain.querylanguage.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ApplicationQueryLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LADE=1, VON=2, WENN=3, OPERATOR=4, OPERATORPOSTFIX=5, WORD=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"LADE", "VON", "WENN", "OPERATOR", "OPERATORPOSTFIX", "WORD", "WS"
	};


	public ApplicationQueryLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ApplicationQueryLanguage.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\tD\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3\6\5\6\67"+
		"\n\6\3\7\6\7:\n\7\r\7\16\7;\3\b\6\b?\n\b\r\b\16\b@\3\b\3\b\2\2\t\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\3\2\4\4\2C\\c|\4\2\13\f\"\"J\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\3\31\3\2\2\2\5!\3\2\2\2\7+\3\2\2\2\t\61\3\2\2\2\13\66\3\2\2\2\r9\3\2"+
		"\2\2\17>\3\2\2\2\21\22\7n\2\2\22\23\7c\2\2\23\24\7f\2\2\24\32\7g\2\2\25"+
		"\26\7N\2\2\26\27\7C\2\2\27\30\7F\2\2\30\32\7G\2\2\31\21\3\2\2\2\31\25"+
		"\3\2\2\2\32\4\3\2\2\2\33\34\7x\2\2\34\35\7q\2\2\35\"\7p\2\2\36\37\7X\2"+
		"\2\37 \7Q\2\2 \"\7P\2\2!\33\3\2\2\2!\36\3\2\2\2\"\6\3\2\2\2#$\7y\2\2$"+
		"%\7g\2\2%&\7p\2\2&,\7p\2\2\'(\7Y\2\2()\7G\2\2)*\7P\2\2*,\7P\2\2+#\3\2"+
		"\2\2+\'\3\2\2\2,\b\3\2\2\2-.\7<\2\2.\62\7$\2\2/\60\7<\2\2\60\62\7,\2\2"+
		"\61-\3\2\2\2\61/\3\2\2\2\62\n\3\2\2\2\63\67\7$\2\2\64\65\7,\2\2\65\67"+
		"\7$\2\2\66\63\3\2\2\2\66\64\3\2\2\2\67\f\3\2\2\28:\t\2\2\298\3\2\2\2:"+
		";\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\16\3\2\2\2=?\t\3\2\2>=\3\2\2\2?@\3\2\2"+
		"\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\b\2\2C\20\3\2\2\2\n\2\31!+\61\66"+
		";@\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}