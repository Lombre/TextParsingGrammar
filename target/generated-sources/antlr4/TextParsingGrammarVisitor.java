// Generated from TextParsingGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TextParsingGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TextParsingGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(TextParsingGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(TextParsingGrammarParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(TextParsingGrammarParser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#midParagraphSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMidParagraphSentence(TextParsingGrammarParser.MidParagraphSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#endParagraphSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndParagraphSentence(TextParsingGrammarParser.EndParagraphSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#skipLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipLine(TextParsingGrammarParser.SkipLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#endSentencePunctuation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndSentencePunctuation(TextParsingGrammarParser.EndSentencePunctuationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#danglingSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDanglingSentence(TextParsingGrammarParser.DanglingSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#quotedSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedSentence(TextParsingGrammarParser.QuotedSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#unclosedSentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnclosedSentence(TextParsingGrammarParser.UnclosedSentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextParsingGrammarParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(TextParsingGrammarParser.WordContext ctx);
}