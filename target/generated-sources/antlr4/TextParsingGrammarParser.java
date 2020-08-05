// Generated from TextParsingGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TextParsingGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Punctuation=7, Comma=8, 
		QuotationStart=9, QuotationEnd=10, Spaces=11, WordForm=12, Number=13, 
		AllowedLetters=14, Newlines=15, WS=16, UnparsableChar=17;
	public static final int
		RULE_start = 0, RULE_text = 1, RULE_paragraph = 2, RULE_midParagraphSentence = 3, 
		RULE_endParagraphSentence = 4, RULE_skipLine = 5, RULE_endSentencePunctuation = 6, 
		RULE_danglingSentence = 7, RULE_quotedSentence = 8, RULE_unclosedSentence = 9, 
		RULE_word = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "text", "paragraph", "midParagraphSentence", "endParagraphSentence", 
			"skipLine", "endSentencePunctuation", "danglingSentence", "quotedSentence", 
			"unclosedSentence", "word"
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

	@Override
	public String getGrammarFileName() { return "TextParsingGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TextParsingGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TextContext txt;
		public TerminalNode EOF() { return getToken(TextParsingGrammarParser.EOF, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			((StartContext)_localctx).txt = text();
			setState(23);
			match(EOF);
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

	public static class TextContext extends ParserRuleContext {
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public List<TerminalNode> Newlines() { return getTokens(TextParsingGrammarParser.Newlines); }
		public TerminalNode Newlines(int i) {
			return getToken(TextParsingGrammarParser.Newlines, i);
		}
		public List<SkipLineContext> skipLine() {
			return getRuleContexts(SkipLineContext.class);
		}
		public SkipLineContext skipLine(int i) {
			return getRuleContext(SkipLineContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Newlines) {
				{
				{
				setState(25);
				match(Newlines);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(33);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(31);
						paragraph();
						}
						break;
					case 2:
						{
						setState(32);
						skipLine();
						}
						break;
					}
					setState(36); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(35);
						match(Newlines);
						}
						}
						setState(38); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Newlines );
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(45);
			paragraph();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Newlines) {
				{
				{
				setState(46);
				match(Newlines);
				}
				}
				setState(51);
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

	public static class ParagraphContext extends ParserRuleContext {
		public EndParagraphSentenceContext endParagraphSentence() {
			return getRuleContext(EndParagraphSentenceContext.class,0);
		}
		public List<TerminalNode> Spaces() { return getTokens(TextParsingGrammarParser.Spaces); }
		public TerminalNode Spaces(int i) {
			return getToken(TextParsingGrammarParser.Spaces, i);
		}
		public List<MidParagraphSentenceContext> midParagraphSentence() {
			return getRuleContexts(MidParagraphSentenceContext.class);
		}
		public MidParagraphSentenceContext midParagraphSentence(int i) {
			return getRuleContext(MidParagraphSentenceContext.class,i);
		}
		public List<TerminalNode> Punctuation() { return getTokens(TextParsingGrammarParser.Punctuation); }
		public TerminalNode Punctuation(int i) {
			return getToken(TextParsingGrammarParser.Punctuation, i);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitParagraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitParagraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paragraph);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Spaces) {
				{
				{
				setState(52);
				match(Spaces);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					midParagraphSentence();
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Spaces) {
						{
						{
						setState(59);
						match(Spaces);
						}
						}
						setState(64);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(70);
			endParagraphSentence();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					match(Spaces);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(77);
				match(T__0);
				}
				break;
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Punctuation) {
				{
				{
				setState(80);
				match(Punctuation);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Spaces) {
				{
				{
				setState(86);
				match(Spaces);
				}
				}
				setState(91);
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

	public static class MidParagraphSentenceContext extends ParserRuleContext {
		public DanglingSentenceContext sentence;
		public EndSentencePunctuationContext sentenceEnding;
		public DanglingSentenceContext danglingSentence() {
			return getRuleContext(DanglingSentenceContext.class,0);
		}
		public EndSentencePunctuationContext endSentencePunctuation() {
			return getRuleContext(EndSentencePunctuationContext.class,0);
		}
		public MidParagraphSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midParagraphSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterMidParagraphSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitMidParagraphSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitMidParagraphSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MidParagraphSentenceContext midParagraphSentence() throws RecognitionException {
		MidParagraphSentenceContext _localctx = new MidParagraphSentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_midParagraphSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((MidParagraphSentenceContext)_localctx).sentence = danglingSentence();
			setState(93);
			((MidParagraphSentenceContext)_localctx).sentenceEnding = endSentencePunctuation();
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

	public static class EndParagraphSentenceContext extends ParserRuleContext {
		public DanglingSentenceContext sentence;
		public EndSentencePunctuationContext sentenceEnding;
		public DanglingSentenceContext danglingSentence() {
			return getRuleContext(DanglingSentenceContext.class,0);
		}
		public EndSentencePunctuationContext endSentencePunctuation() {
			return getRuleContext(EndSentencePunctuationContext.class,0);
		}
		public EndParagraphSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endParagraphSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterEndParagraphSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitEndParagraphSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitEndParagraphSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndParagraphSentenceContext endParagraphSentence() throws RecognitionException {
		EndParagraphSentenceContext _localctx = new EndParagraphSentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endParagraphSentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			((EndParagraphSentenceContext)_localctx).sentence = danglingSentence();
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(96);
				((EndParagraphSentenceContext)_localctx).sentenceEnding = endSentencePunctuation();
				}
				break;
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

	public static class SkipLineContext extends ParserRuleContext {
		public List<TerminalNode> Newlines() { return getTokens(TextParsingGrammarParser.Newlines); }
		public TerminalNode Newlines(int i) {
			return getToken(TextParsingGrammarParser.Newlines, i);
		}
		public SkipLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skipLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterSkipLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitSkipLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitSkipLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkipLineContext skipLine() throws RecognitionException {
		SkipLineContext _localctx = new SkipLineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_skipLine);
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
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Newlines) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Punctuation) | (1L << Comma) | (1L << QuotationStart) | (1L << QuotationEnd) | (1L << Spaces) | (1L << WordForm) | (1L << Number) | (1L << AllowedLetters) | (1L << WS) | (1L << UnparsableChar))) != 0) );
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

	public static class EndSentencePunctuationContext extends ParserRuleContext {
		public List<TerminalNode> Punctuation() { return getTokens(TextParsingGrammarParser.Punctuation); }
		public TerminalNode Punctuation(int i) {
			return getToken(TextParsingGrammarParser.Punctuation, i);
		}
		public List<TerminalNode> Spaces() { return getTokens(TextParsingGrammarParser.Spaces); }
		public TerminalNode Spaces(int i) {
			return getToken(TextParsingGrammarParser.Spaces, i);
		}
		public TerminalNode Comma() { return getToken(TextParsingGrammarParser.Comma, 0); }
		public EndSentencePunctuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endSentencePunctuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterEndSentencePunctuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitEndSentencePunctuation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitEndSentencePunctuation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndSentencePunctuationContext endSentencePunctuation() throws RecognitionException {
		EndSentencePunctuationContext _localctx = new EndSentencePunctuationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_endSentencePunctuation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Punctuation:
				{
				setState(105); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(104);
						match(Punctuation);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(107); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						match(Spaces);
						setState(110);
						match(Punctuation);
						}
						} 
					}
					setState(115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(116);
					match(Comma);
					}
				}

				}
				break;
			case T__0:
				{
				setState(119);
				match(T__0);
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(120);
						match(Punctuation);
						}
						} 
					}
					setState(125);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class DanglingSentenceContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public List<QuotedSentenceContext> quotedSentence() {
			return getRuleContexts(QuotedSentenceContext.class);
		}
		public QuotedSentenceContext quotedSentence(int i) {
			return getRuleContext(QuotedSentenceContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TextParsingGrammarParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TextParsingGrammarParser.Comma, i);
		}
		public List<TerminalNode> Spaces() { return getTokens(TextParsingGrammarParser.Spaces); }
		public TerminalNode Spaces(int i) {
			return getToken(TextParsingGrammarParser.Spaces, i);
		}
		public List<TerminalNode> Punctuation() { return getTokens(TextParsingGrammarParser.Punctuation); }
		public TerminalNode Punctuation(int i) {
			return getToken(TextParsingGrammarParser.Punctuation, i);
		}
		public DanglingSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_danglingSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterDanglingSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitDanglingSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitDanglingSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DanglingSentenceContext danglingSentence() throws RecognitionException {
		DanglingSentenceContext _localctx = new DanglingSentenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_danglingSentence);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Punctuation) {
				{
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(Punctuation);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Punctuation );
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Spaces) {
					{
					{
					setState(133);
					match(Spaces);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WordForm:
						{
						setState(141);
						word();
						}
						break;
					case T__1:
					case T__3:
					case T__5:
						{
						setState(142);
						quotedSentence();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(145);
						match(Comma);
						}
					}

					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(148);
						match(Spaces);
						}
						}
						setState(151); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Spaces );
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WordForm:
				{
				setState(158);
				word();
				}
				break;
			case T__1:
			case T__3:
			case T__5:
				{
				setState(159);
				quotedSentence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(162);
				match(Comma);
				}
			}

			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(Spaces);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class QuotedSentenceContext extends ParserRuleContext {
		public Token quouteStart;
		public ParagraphContext midParagraph;
		public Token quoteEnd;
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public QuotedSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterQuotedSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitQuotedSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitQuotedSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedSentenceContext quotedSentence() throws RecognitionException {
		QuotedSentenceContext _localctx = new QuotedSentenceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quotedSentence);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				((QuotedSentenceContext)_localctx).quouteStart = match(T__1);
				setState(172);
				((QuotedSentenceContext)_localctx).midParagraph = paragraph();
				setState(173);
				((QuotedSentenceContext)_localctx).quoteEnd = match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((QuotedSentenceContext)_localctx).quouteStart = match(T__3);
				setState(176);
				((QuotedSentenceContext)_localctx).midParagraph = paragraph();
				setState(177);
				((QuotedSentenceContext)_localctx).quoteEnd = match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				((QuotedSentenceContext)_localctx).quouteStart = match(T__5);
				setState(180);
				((QuotedSentenceContext)_localctx).midParagraph = paragraph();
				setState(181);
				((QuotedSentenceContext)_localctx).quoteEnd = match(T__0);
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

	public static class UnclosedSentenceContext extends ParserRuleContext {
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public UnclosedSentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unclosedSentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterUnclosedSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitUnclosedSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitUnclosedSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnclosedSentenceContext unclosedSentence() throws RecognitionException {
		UnclosedSentenceContext _localctx = new UnclosedSentenceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unclosedSentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(186);
			paragraph();
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WordForm() { return getToken(TextParsingGrammarParser.WordForm, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WordForm);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\5\3$\n"+
		"\3\3\3\6\3\'\n\3\r\3\16\3(\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\4\7\48\n\4\f\4\16\4;\13\4\3\4\3\4\7\4?\n\4\f\4\16"+
		"\4B\13\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\4\5"+
		"\4Q\n\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3"+
		"\5\3\5\3\6\3\6\5\6d\n\6\3\7\6\7g\n\7\r\7\16\7h\3\b\6\bl\n\b\r\b\16\bm"+
		"\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\b\5\bx\n\b\3\b\3\b\7\b|\n\b\f\b\16"+
		"\b\177\13\b\5\b\u0081\n\b\3\t\6\t\u0084\n\t\r\t\16\t\u0085\3\t\7\t\u0089"+
		"\n\t\f\t\16\t\u008c\13\t\5\t\u008e\n\t\3\t\3\t\5\t\u0092\n\t\3\t\5\t\u0095"+
		"\n\t\3\t\6\t\u0098\n\t\r\t\16\t\u0099\7\t\u009c\n\t\f\t\16\t\u009f\13"+
		"\t\3\t\3\t\5\t\u00a3\n\t\3\t\5\t\u00a6\n\t\3\t\7\t\u00a9\n\t\f\t\16\t"+
		"\u00ac\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ba"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\4\3"+
		"\2\21\21\5\2\4\4\6\6\b\b\2\u00d4\2\30\3\2\2\2\4\36\3\2\2\2\69\3\2\2\2"+
		"\b^\3\2\2\2\na\3\2\2\2\ff\3\2\2\2\16\u0080\3\2\2\2\20\u008d\3\2\2\2\22"+
		"\u00b9\3\2\2\2\24\u00bb\3\2\2\2\26\u00be\3\2\2\2\30\31\5\4\3\2\31\32\7"+
		"\2\2\3\32\3\3\2\2\2\33\35\7\21\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37,\3\2\2\2 \36\3\2\2\2!$\5\6\4\2\"$\5\f\7\2#!\3\2"+
		"\2\2#\"\3\2\2\2$&\3\2\2\2%\'\7\21\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2)+\3\2\2\2*#\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2"+
		".,\3\2\2\2/\63\5\6\4\2\60\62\7\21\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\668\7\r\2\2\67\66\3"+
		"\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:E\3\2\2\2;9\3\2\2\2<@\5\b\5\2="+
		"?\7\r\2\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2"+
		"C<\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HL\5\n\6\2"+
		"IK\7\r\2\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2\2"+
		"OQ\7\3\2\2PO\3\2\2\2PQ\3\2\2\2QU\3\2\2\2RT\7\t\2\2SR\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2V[\3\2\2\2WU\3\2\2\2XZ\7\r\2\2YX\3\2\2\2Z]\3\2\2\2"+
		"[Y\3\2\2\2[\\\3\2\2\2\\\7\3\2\2\2][\3\2\2\2^_\5\20\t\2_`\5\16\b\2`\t\3"+
		"\2\2\2ac\5\20\t\2bd\5\16\b\2cb\3\2\2\2cd\3\2\2\2d\13\3\2\2\2eg\n\2\2\2"+
		"fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\r\3\2\2\2jl\7\t\2\2kj\3\2\2"+
		"\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2op\7\r\2\2pr\7\t\2\2qo\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vx\7\n\2\2wv\3\2\2"+
		"\2wx\3\2\2\2x\u0081\3\2\2\2y}\7\3\2\2z|\7\t\2\2{z\3\2\2\2|\177\3\2\2\2"+
		"}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080k\3\2\2\2\u0080"+
		"y\3\2\2\2\u0081\17\3\2\2\2\u0082\u0084\7\t\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008a\3\2"+
		"\2\2\u0087\u0089\7\r\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u0083\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u009d\3\2\2\2\u008f"+
		"\u0092\5\26\f\2\u0090\u0092\5\22\n\2\u0091\u008f\3\2\2\2\u0091\u0090\3"+
		"\2\2\2\u0092\u0094\3\2\2\2\u0093\u0095\7\n\2\2\u0094\u0093\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\7\r\2\2\u0097\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0091\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00a3\5\26\f\2\u00a1\u00a3\5\22\n\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3"+
		"\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a6\7\n\2\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00aa\3\2\2\2\u00a7\u00a9\7\r\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\21\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\5\6\4"+
		"\2\u00af\u00b0\7\5\2\2\u00b0\u00ba\3\2\2\2\u00b1\u00b2\7\6\2\2\u00b2\u00b3"+
		"\5\6\4\2\u00b3\u00b4\7\7\2\2\u00b4\u00ba\3\2\2\2\u00b5\u00b6\7\b\2\2\u00b6"+
		"\u00b7\5\6\4\2\u00b7\u00b8\7\3\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ad\3\2"+
		"\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00bc"+
		"\t\3\2\2\u00bc\u00bd\5\6\4\2\u00bd\25\3\2\2\2\u00be\u00bf\7\16\2\2\u00bf"+
		"\27\3\2\2\2 \36#(,\639@ELPU[chmsw}\u0080\u0085\u008a\u008d\u0091\u0094"+
		"\u0099\u009d\u00a2\u00a5\u00aa\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}