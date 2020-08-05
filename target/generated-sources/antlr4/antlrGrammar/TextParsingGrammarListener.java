// Generated from TextParsingGrammar.g4 by ANTLR 4.8

    package antlrGrammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TextParsingGrammarParser}.
 */
public interface TextParsingGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(TextParsingGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(TextParsingGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(TextParsingGrammarParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(TextParsingGrammarParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(TextParsingGrammarParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(TextParsingGrammarParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#midParagraphSentence}.
	 * @param ctx the parse tree
	 */
	void enterMidParagraphSentence(TextParsingGrammarParser.MidParagraphSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#midParagraphSentence}.
	 * @param ctx the parse tree
	 */
	void exitMidParagraphSentence(TextParsingGrammarParser.MidParagraphSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#endParagraphSentence}.
	 * @param ctx the parse tree
	 */
	void enterEndParagraphSentence(TextParsingGrammarParser.EndParagraphSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#endParagraphSentence}.
	 * @param ctx the parse tree
	 */
	void exitEndParagraphSentence(TextParsingGrammarParser.EndParagraphSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#skipLine}.
	 * @param ctx the parse tree
	 */
	void enterSkipLine(TextParsingGrammarParser.SkipLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#skipLine}.
	 * @param ctx the parse tree
	 */
	void exitSkipLine(TextParsingGrammarParser.SkipLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#endSentencePunctuation}.
	 * @param ctx the parse tree
	 */
	void enterEndSentencePunctuation(TextParsingGrammarParser.EndSentencePunctuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#endSentencePunctuation}.
	 * @param ctx the parse tree
	 */
	void exitEndSentencePunctuation(TextParsingGrammarParser.EndSentencePunctuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#danglingSentence}.
	 * @param ctx the parse tree
	 */
	void enterDanglingSentence(TextParsingGrammarParser.DanglingSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#danglingSentence}.
	 * @param ctx the parse tree
	 */
	void exitDanglingSentence(TextParsingGrammarParser.DanglingSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#quotedSentence}.
	 * @param ctx the parse tree
	 */
	void enterQuotedSentence(TextParsingGrammarParser.QuotedSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#quotedSentence}.
	 * @param ctx the parse tree
	 */
	void exitQuotedSentence(TextParsingGrammarParser.QuotedSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#unclosedSentence}.
	 * @param ctx the parse tree
	 */
	void enterUnclosedSentence(TextParsingGrammarParser.UnclosedSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#unclosedSentence}.
	 * @param ctx the parse tree
	 */
	void exitUnclosedSentence(TextParsingGrammarParser.UnclosedSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(TextParsingGrammarParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(TextParsingGrammarParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#normalWord}.
	 * @param ctx the parse tree
	 */
	void enterNormalWord(TextParsingGrammarParser.NormalWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#normalWord}.
	 * @param ctx the parse tree
	 */
	void exitNormalWord(TextParsingGrammarParser.NormalWordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TextParsingGrammarParser#nonWord}.
	 * @param ctx the parse tree
	 */
	void enterNonWord(TextParsingGrammarParser.NonWordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TextParsingGrammarParser#nonWord}.
	 * @param ctx the parse tree
	 */
	void exitNonWord(TextParsingGrammarParser.NonWordContext ctx);
}