// Generated from TextParsingGrammar.g4 by ANTLR 4.8

    package antlrGrammar;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NormalWord=8, 
		NonWord=9, Punctuation=10, Comma=11, QuotationStart=12, QuotationEnd=13, 
		Spaces=14, Number=15, AllowedLetters=16, Newlines=17, WS=18, UnparsableChar=19;
	public static final int
		RULE_start = 0, RULE_text = 1, RULE_paragraph = 2, RULE_midParagraphSentence = 3, 
		RULE_endParagraphSentence = 4, RULE_skipLine = 5, RULE_endSentencePunctuation = 6, 
		RULE_danglingSentence = 7, RULE_quotedSentence = 8, RULE_unclosedSentence = 9, 
		RULE_word = 10, RULE_normalWord = 11, RULE_nonWord = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "text", "paragraph", "midParagraphSentence", "endParagraphSentence", 
			"skipLine", "endSentencePunctuation", "danglingSentence", "quotedSentence", 
			"unclosedSentence", "word", "normalWord", "nonWord"
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << NormalWord) | (1L << NonWord) | (1L << Punctuation) | (1L << Comma) | (1L << QuotationStart) | (1L << QuotationEnd) | (1L << Spaces) | (1L << Number) | (1L << AllowedLetters) | (1L << Newlines) | (1L << WS) | (1L << UnparsableChar))) != 0)) {
				{
				setState(26);
				((StartContext)_localctx).txt = text();
				}
			}

			setState(29);
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
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Newlines) {
				{
				{
				setState(31);
				match(Newlines);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(37);
						paragraph();
						}
						break;
					case 2:
						{
						setState(38);
						skipLine();
						}
						break;
					}
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(41);
						match(Newlines);
						}
						}
						setState(44); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Newlines );
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(51);
			paragraph();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Newlines) {
				{
				{
				setState(52);
				match(Newlines);
				}
				}
				setState(57);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Spaces) {
				{
				{
				setState(58);
				match(Spaces);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					midParagraphSentence();
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Spaces) {
						{
						{
						setState(65);
						match(Spaces);
						}
						}
						setState(70);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(76);
			endParagraphSentence();
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(Spaces);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(83);
				match(T__0);
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Punctuation) {
				{
				{
				setState(86);
				match(Punctuation);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Spaces) {
				{
				{
				setState(92);
				match(Spaces);
				}
				}
				setState(97);
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
			setState(98);
			((MidParagraphSentenceContext)_localctx).sentence = danglingSentence();
			setState(99);
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
			setState(101);
			((EndParagraphSentenceContext)_localctx).sentence = danglingSentence();
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(102);
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
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
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
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << NormalWord) | (1L << NonWord) | (1L << Punctuation) | (1L << Comma) | (1L << QuotationStart) | (1L << QuotationEnd) | (1L << Spaces) | (1L << Number) | (1L << AllowedLetters) | (1L << WS) | (1L << UnparsableChar))) != 0) );
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Punctuation:
				{
				setState(111); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(110);
						match(Punctuation);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(113); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(115);
						match(Spaces);
						setState(116);
						match(Punctuation);
						}
						} 
					}
					setState(121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(122);
					match(Comma);
					}
				}

				}
				break;
			case T__0:
				{
				setState(125);
				match(T__0);
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(126);
						match(Punctuation);
						}
						} 
					}
					setState(131);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Punctuation) {
				{
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(Punctuation);
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Punctuation );
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Spaces) {
					{
					{
					setState(139);
					match(Spaces);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NormalWord:
					case NonWord:
						{
						setState(147);
						word();
						}
						break;
					case T__1:
					case T__3:
					case T__5:
					case T__6:
						{
						setState(148);
						quotedSentence();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(151);
						match(Comma);
						}
					}

					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(154);
						match(Spaces);
						}
						}
						setState(157); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==Spaces );
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NormalWord:
			case NonWord:
				{
				setState(164);
				word();
				}
				break;
			case T__1:
			case T__3:
			case T__5:
			case T__6:
				{
				setState(165);
				quotedSentence();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(168);
				match(Comma);
				}
			}

			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					match(Spaces);
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				((QuotedSentenceContext)_localctx).quouteStart = match(T__1);
				setState(178);
				((QuotedSentenceContext)_localctx).midParagraph = paragraph();
				setState(179);
				((QuotedSentenceContext)_localctx).quoteEnd = match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				((QuotedSentenceContext)_localctx).quouteStart = match(T__3);
				setState(182);
				((QuotedSentenceContext)_localctx).midParagraph = paragraph();
				setState(183);
				((QuotedSentenceContext)_localctx).quoteEnd = match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				((QuotedSentenceContext)_localctx).quouteStart = match(T__5);
				setState(186);
				((QuotedSentenceContext)_localctx).midParagraph = paragraph();
				setState(187);
				((QuotedSentenceContext)_localctx).quoteEnd = match(T__0);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				((QuotedSentenceContext)_localctx).quouteStart = match(T__6);
				setState(190);
				((QuotedSentenceContext)_localctx).midParagraph = paragraph();
				setState(191);
				((QuotedSentenceContext)_localctx).quoteEnd = match(T__6);
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
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(196);
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
		public NormalWordContext normalWord() {
			return getRuleContext(NormalWordContext.class,0);
		}
		public NonWordContext nonWord() {
			return getRuleContext(NonWordContext.class,0);
		}
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NormalWord:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				normalWord();
				}
				break;
			case NonWord:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				nonWord();
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

	public static class NormalWordContext extends ParserRuleContext {
		public TerminalNode NormalWord() { return getToken(TextParsingGrammarParser.NormalWord, 0); }
		public NormalWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterNormalWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitNormalWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitNormalWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalWordContext normalWord() throws RecognitionException {
		NormalWordContext _localctx = new NormalWordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_normalWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(NormalWord);
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

	public static class NonWordContext extends ParserRuleContext {
		public TerminalNode NonWord() { return getToken(TextParsingGrammarParser.NonWord, 0); }
		public NonWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).enterNonWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextParsingGrammarListener ) ((TextParsingGrammarListener)listener).exitNonWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextParsingGrammarVisitor ) return ((TextParsingGrammarVisitor<? extends T>)visitor).visitNonWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonWordContext nonWord() throws RecognitionException {
		NonWordContext _localctx = new NonWordContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nonWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(NonWord);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\3\2\3\3\7\3#\n\3\f"+
		"\3\16\3&\13\3\3\3\3\3\5\3*\n\3\3\3\6\3-\n\3\r\3\16\3.\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\7\4>\n\4\f\4\16\4A\13\4"+
		"\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\7\4J\n\4\f\4\16\4M\13\4\3\4\3\4\7\4Q"+
		"\n\4\f\4\16\4T\13\4\3\4\5\4W\n\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\7\4`"+
		"\n\4\f\4\16\4c\13\4\3\5\3\5\3\5\3\6\3\6\5\6j\n\6\3\7\6\7m\n\7\r\7\16\7"+
		"n\3\b\6\br\n\b\r\b\16\bs\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\5\b~\n\b"+
		"\3\b\3\b\7\b\u0082\n\b\f\b\16\b\u0085\13\b\5\b\u0087\n\b\3\t\6\t\u008a"+
		"\n\t\r\t\16\t\u008b\3\t\7\t\u008f\n\t\f\t\16\t\u0092\13\t\5\t\u0094\n"+
		"\t\3\t\3\t\5\t\u0098\n\t\3\t\5\t\u009b\n\t\3\t\6\t\u009e\n\t\r\t\16\t"+
		"\u009f\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\t\3\t\5\t\u00a9\n\t\3\t\5\t"+
		"\u00ac\n\t\3\t\7\t\u00af\n\t\f\t\16\t\u00b2\13\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c4\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\5\f\u00cb\n\f\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\2\4\3\2\23\23\5\2\4\4\6\6\b\b\2\u00e5\2\35\3\2\2\2\4$"+
		"\3\2\2\2\6?\3\2\2\2\bd\3\2\2\2\ng\3\2\2\2\fl\3\2\2\2\16\u0086\3\2\2\2"+
		"\20\u0093\3\2\2\2\22\u00c3\3\2\2\2\24\u00c5\3\2\2\2\26\u00ca\3\2\2\2\30"+
		"\u00cc\3\2\2\2\32\u00ce\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\35\36\3\2"+
		"\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!#\7\23\2\2\"!\3\2\2\2#&\3\2"+
		"\2\2$\"\3\2\2\2$%\3\2\2\2%\62\3\2\2\2&$\3\2\2\2\'*\5\6\4\2(*\5\f\7\2)"+
		"\'\3\2\2\2)(\3\2\2\2*,\3\2\2\2+-\7\23\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\61\3\2\2\2\60)\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63"+
		"\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\659\5\6\4\2\668\7\23\2\2\67\66\3"+
		"\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;9\3\2\2\2<>\7\20\2\2"+
		"=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@K\3\2\2\2A?\3\2\2\2BF\5\b\5\2"+
		"CE\7\20\2\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2IB\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2NR\5\n\6"+
		"\2OQ\7\20\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2"+
		"\2\2UW\7\3\2\2VU\3\2\2\2VW\3\2\2\2W[\3\2\2\2XZ\7\f\2\2YX\3\2\2\2Z]\3\2"+
		"\2\2[Y\3\2\2\2[\\\3\2\2\2\\a\3\2\2\2][\3\2\2\2^`\7\20\2\2_^\3\2\2\2`c"+
		"\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\7\3\2\2\2ca\3\2\2\2de\5\20\t\2ef\5\16\b"+
		"\2f\t\3\2\2\2gi\5\20\t\2hj\5\16\b\2ih\3\2\2\2ij\3\2\2\2j\13\3\2\2\2km"+
		"\n\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\r\3\2\2\2pr\7\f\2\2"+
		"qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2ty\3\2\2\2uv\7\20\2\2vx\7\f\2"+
		"\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|~\7\r\2"+
		"\2}|\3\2\2\2}~\3\2\2\2~\u0087\3\2\2\2\177\u0083\7\3\2\2\u0080\u0082\7"+
		"\f\2\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086q\3\2\2\2"+
		"\u0086\177\3\2\2\2\u0087\17\3\2\2\2\u0088\u008a\7\f\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u0090\3\2\2\2\u008d\u008f\7\20\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0089\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u00a3\3\2"+
		"\2\2\u0095\u0098\5\26\f\2\u0096\u0098\5\22\n\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u009b\7\r\2\2\u009a\u0099\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009e\7\20\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0097\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a9\5\26\f\2\u00a7\u00a9\5\22\n\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a7\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\7\r\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b0\3\2\2\2\u00ad\u00af\7\20\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\21\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\4\2\2\u00b4\u00b5"+
		"\5\6\4\2\u00b5\u00b6\7\5\2\2\u00b6\u00c4\3\2\2\2\u00b7\u00b8\7\6\2\2\u00b8"+
		"\u00b9\5\6\4\2\u00b9\u00ba\7\7\2\2\u00ba\u00c4\3\2\2\2\u00bb\u00bc\7\b"+
		"\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\7\3\2\2\u00be\u00c4\3\2\2\2\u00bf"+
		"\u00c0\7\t\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\7\t\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00b7\3\2\2\2\u00c3\u00bb\3\2\2\2\u00c3"+
		"\u00bf\3\2\2\2\u00c4\23\3\2\2\2\u00c5\u00c6\t\3\2\2\u00c6\u00c7\5\6\4"+
		"\2\u00c7\25\3\2\2\2\u00c8\u00cb\5\30\r\2\u00c9\u00cb\5\32\16\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\7\n\2\2\u00cd"+
		"\31\3\2\2\2\u00ce\u00cf\7\13\2\2\u00cf\33\3\2\2\2\"\35$).\629?FKRV[ai"+
		"nsy}\u0083\u0086\u008b\u0090\u0093\u0097\u009a\u009f\u00a3\u00a8\u00ab"+
		"\u00b0\u00c3\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}