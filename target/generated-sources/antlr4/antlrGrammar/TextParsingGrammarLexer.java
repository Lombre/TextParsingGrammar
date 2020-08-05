// Generated from TextParsingGrammar.g4 by ANTLR 4.8

    package antlrGrammar;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NormalWord=8, 
		NonWord=9, Punctuation=10, Comma=11, QuotationStart=12, QuotationEnd=13, 
		Spaces=14, Number=15, AllowedLetters=16, Newlines=17, WS=18, UnparsableChar=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NormalWord", 
			"NonWord", "Punctuation", "Comma", "QuotationStart", "QuotationEnd", 
			"Spaces", "Number", "AllowedLetters", "Newlines", "WS", "UnparsableChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\u2019'", "'('", "')'", "'\u201C'", "'\u201D'", "'\u2018'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "NormalWord", "NonWord", 
			"Punctuation", "Comma", "QuotationStart", "QuotationEnd", "Spaces", "Number", 
			"AllowedLetters", "Newlines", "WS", "UnparsableChar"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\5\t9\n\t\3\t\6\t<\n\t\r\t\16\t=\3\t\3\t\6\tB\n\t\r\t"+
		"\16\tC\7\tF\n\t\f\t\16\tI\13\t\3\t\6\tL\n\t\r\t\16\tM\3\t\3\t\3\t\5\t"+
		"S\n\t\3\n\6\nV\n\n\r\n\16\nW\3\n\3\n\6\n\\\n\n\r\n\16\n]\3\n\3\n\6\nb"+
		"\n\n\r\n\16\nc\3\n\6\ng\n\n\r\n\16\nh\3\n\3\n\3\n\3\n\3\n\6\np\n\n\r\n"+
		"\16\nq\3\n\3\n\6\nv\n\n\r\n\16\nw\5\nz\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u0081"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20\u008a\n\20\r\20\16\20\u008b"+
		"\3\20\5\20\u008f\n\20\3\20\7\20\u0092\n\20\f\20\16\20\u0095\13\20\3\20"+
		"\3\20\6\20\u0099\n\20\r\20\16\20\u009a\5\20\u009d\n\20\3\21\3\21\3\22"+
		"\3\22\3\23\6\23\u00a4\n\23\r\23\16\23\u00a5\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25\3\2\13\6\2##\60\60AA\u2028\u2028\4\2"+
		"..<=\5\2**\u201a\u201a\u201e\u201e\5\2++\u201b\u201b\u201f\u201f\n\2\""+
		"\"//\61\61??^^\u200c\u200c\u2015\u2016\u2062\u2062\3\2\62;\20\2\13\f\17"+
		"\17\"$*+.\61<=??AA\u200c\u200c\u2015\u2016\u201a\u201b\u201e\u201f\u2028"+
		"\u2028\u2062\u2062\4\2\f\f\17\17\3\2\13\13\2\u00c2\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63"+
		"\3\2\2\2\17\65\3\2\2\2\21R\3\2\2\2\23y\3\2\2\2\25{\3\2\2\2\27\u0080\3"+
		"\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u009c\3\2"+
		"\2\2!\u009e\3\2\2\2#\u00a0\3\2\2\2%\u00a3\3\2\2\2\'\u00a9\3\2\2\2)*\7"+
		"\u201b\2\2*\4\3\2\2\2+,\7*\2\2,\6\3\2\2\2-.\7+\2\2.\b\3\2\2\2/\60\7\u201e"+
		"\2\2\60\n\3\2\2\2\61\62\7\u201f\2\2\62\f\3\2\2\2\63\64\7\u201a\2\2\64"+
		"\16\3\2\2\2\65\66\7$\2\2\66\20\3\2\2\2\679\7\u201b\2\28\67\3\2\2\289\3"+
		"\2\2\29;\3\2\2\2:<\5!\21\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>G\3"+
		"\2\2\2?A\7\u201b\2\2@B\5!\21\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2"+
		"DF\3\2\2\2E?\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HS\3\2\2\2IG\3\2\2\2"+
		"JL\5!\21\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\u201b"+
		"\2\2PQ\7.\2\2QS\3\2\2\2R8\3\2\2\2RK\3\2\2\2S\22\3\2\2\2TV\5!\21\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2\2Ya\7\60\2\2Z\\\5!\21\2["+
		"Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\60\2\2`b\3\2\2"+
		"\2a[\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dz\3\2\2\2eg\5!\21\2fe\3\2\2"+
		"\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\60\2\2kl\7.\2\2lz\3\2\2"+
		"\2mz\5\37\20\2np\5!\21\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2"+
		"\2\2su\5\27\f\2tv\5!\21\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3"+
		"\2\2\2yU\3\2\2\2yf\3\2\2\2ym\3\2\2\2yo\3\2\2\2z\24\3\2\2\2{|\t\2\2\2|"+
		"\26\3\2\2\2}\u0081\t\3\2\2~\177\7\60\2\2\177\u0081\7.\2\2\u0080}\3\2\2"+
		"\2\u0080~\3\2\2\2\u0081\30\3\2\2\2\u0082\u0083\t\4\2\2\u0083\32\3\2\2"+
		"\2\u0084\u0085\t\5\2\2\u0085\34\3\2\2\2\u0086\u0087\t\6\2\2\u0087\36\3"+
		"\2\2\2\u0088\u008a\t\7\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\7\60"+
		"\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0093\3\2\2\2\u0090"+
		"\u0092\t\7\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u009d\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0098\7\60\2\2\u0097\u0099\t\7\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u0089\3\2\2\2\u009c\u0096\3\2\2\2\u009d \3\2\2\2\u009e\u009f\n\b\2\2"+
		"\u009f\"\3\2\2\2\u00a0\u00a1\t\t\2\2\u00a1$\3\2\2\2\u00a2\u00a4\t\n\2"+
		"\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\23\2\2\u00a8&\3\2\2\2\u00a9"+
		"\u00aa\13\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\24\2\2\u00ac(\3\2\2"+
		"\2\27\28=CGMRW]chqwy\u0080\u008b\u008e\u0093\u009a\u009c\u00a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}