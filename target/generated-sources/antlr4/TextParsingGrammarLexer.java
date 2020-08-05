// Generated from TextParsingGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TextParsingGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Punctuation=7, Comma=8, 
		QuotationStart=9, QuotationEnd=10, Spaces=11, WordForm=12, Number=13, 
		AllowedLetters=14, Newlines=15, WS=16, UnparsableChar=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Punctuation", "Comma", 
			"QuotationStart", "QuotationEnd", "Spaces", "WordForm", "Number", "AllowedLetters", 
			"Newlines", "WS", "UnparsableChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u2019'", "'('", "')'", "'\u201C'", "'\u201D'", "'\u2018'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Punctuation", "Comma", "QuotationStart", 
			"QuotationEnd", "Spaces", "WordForm", "Number", "AllowedLetters", "Newlines", 
			"WS", "UnparsableChar"
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


	public TextParsingGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TextParsingGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\5\t\67\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\5\r@\n\r\3\r\6\rC\n\r\r"+
		"\r\16\rD\3\r\3\r\6\rI\n\r\r\r\16\rJ\7\rM\n\r\f\r\16\rP\13\r\3\r\6\rS\n"+
		"\r\r\r\16\rT\3\r\3\r\3\r\3\r\6\r[\n\r\r\r\16\r\\\3\r\3\r\6\ra\n\r\r\r"+
		"\16\rb\3\r\3\r\6\rg\n\r\r\r\16\rh\3\r\6\rl\n\r\r\r\16\rm\3\r\3\r\3\r\3"+
		"\r\3\r\6\ru\n\r\r\r\16\rv\3\r\3\r\6\r{\n\r\r\r\16\r|\5\r\177\n\r\3\16"+
		"\6\16\u0082\n\16\r\16\16\16\u0083\3\16\5\16\u0087\n\16\3\16\7\16\u008a"+
		"\n\16\f\16\16\16\u008d\13\16\3\16\3\16\6\16\u0091\n\16\r\16\16\16\u0092"+
		"\5\16\u0095\n\16\3\17\3\17\3\20\3\20\3\21\6\21\u009c\n\21\r\21\16\21\u009d"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\13\6\2##\60\60"+
		"AA\u2028\u2028\4\2..<=\5\2**\u201a\u201a\u201e\u201e\5\2++\u201b\u201b"+
		"\u201f\u201f\n\2\"\"//\61\61??^^\u200c\u200c\u2015\u2016\u2062\u2062\3"+
		"\2\62;\20\2\13\f\17\17\"#*+.\61<=??AA\u200c\u200c\u2015\u2016\u201a\u201b"+
		"\u201e\u201f\u2028\u2028\u2062\u2062\4\2\f\f\17\17\3\2\13\13\2\u00bb\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2"+
		"\17\61\3\2\2\2\21\66\3\2\2\2\238\3\2\2\2\25:\3\2\2\2\27<\3\2\2\2\31~\3"+
		"\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009b\3\2\2"+
		"\2#\u00a1\3\2\2\2%&\7\u201b\2\2&\4\3\2\2\2\'(\7*\2\2(\6\3\2\2\2)*\7+\2"+
		"\2*\b\3\2\2\2+,\7\u201e\2\2,\n\3\2\2\2-.\7\u201f\2\2.\f\3\2\2\2/\60\7"+
		"\u201a\2\2\60\16\3\2\2\2\61\62\t\2\2\2\62\20\3\2\2\2\63\67\t\3\2\2\64"+
		"\65\7\60\2\2\65\67\7.\2\2\66\63\3\2\2\2\66\64\3\2\2\2\67\22\3\2\2\289"+
		"\t\4\2\29\24\3\2\2\2:;\t\5\2\2;\26\3\2\2\2<=\t\6\2\2=\30\3\2\2\2>@\7\u201b"+
		"\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\5\35\17\2BA\3\2\2\2CD\3\2\2\2DB\3"+
		"\2\2\2DE\3\2\2\2EN\3\2\2\2FH\7\u201b\2\2GI\5\35\17\2HG\3\2\2\2IJ\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LF\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2O\177\3\2\2\2PN\3\2\2\2QS\5\35\17\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU"+
		"\3\2\2\2UV\3\2\2\2VW\7\u201b\2\2WX\7.\2\2X\177\3\2\2\2Y[\5\35\17\2ZY\3"+
		"\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^f\7\60\2\2_a\5\35\17"+
		"\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7\60\2\2eg\3\2"+
		"\2\2f`\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\177\3\2\2\2jl\5\35\17\2"+
		"kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\60\2\2pq\7.\2\2"+
		"q\177\3\2\2\2r\177\5\33\16\2su\5\35\17\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wx\3\2\2\2xz\5\21\t\2y{\5\35\17\2zy\3\2\2\2{|\3\2\2\2|z\3\2"+
		"\2\2|}\3\2\2\2}\177\3\2\2\2~?\3\2\2\2~R\3\2\2\2~Z\3\2\2\2~k\3\2\2\2~r"+
		"\3\2\2\2~t\3\2\2\2\177\32\3\2\2\2\u0080\u0082\t\7\2\2\u0081\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0087\7\60\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3"+
		"\2\2\2\u0087\u008b\3\2\2\2\u0088\u008a\t\7\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u0095\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008e\u0090\7\60\2\2\u008f\u0091\t\7\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0081\3\2\2\2\u0094\u008e\3\2\2\2\u0095"+
		"\34\3\2\2\2\u0096\u0097\n\b\2\2\u0097\36\3\2\2\2\u0098\u0099\t\t\2\2\u0099"+
		" \3\2\2\2\u009a\u009c\t\n\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\b\21\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\13\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\b\22\2\2\u00a4$\3\2\2\2\26\2\66?DJNT\\bhmv|~\u0083\u0086\u008b"+
		"\u0092\u0094\u009d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}