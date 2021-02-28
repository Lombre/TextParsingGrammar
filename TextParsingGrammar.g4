
grammar TextParsingGrammar;


//For how to set up visitors to generate the desired classes.
//https://jakubdziworski.github.io/java/2016/04/01/antlr_visitor_vs_listener.html

//Maybe a better way to ignore dangling '’':
//https://stackoverflow.com/questions/34905464/antlr4-rule-not-ignoring-standalone-open-bracket


@header {
    package antlrGrammar;
}

start  : txt=text? EOF;         

text : Newlines* ((paragraph | skipLine) Newlines+)* (paragraph | skipLine) Newlines*;

paragraph : Spaces* (midParagraphSentence Spaces*)* endParagraphSentence Spaces* '’'? Punctuation* Spaces*;  

midParagraphSentence : sentence=danglingSentence sentenceEnding=endSentencePunctuation;

endParagraphSentence : sentence=danglingSentence sentenceEnding=endSentencePunctuation?;

skipLine : (~Newlines)+;// {System.out.println("Skipped line: " +  _localctx.getText());}; //Recording the line to check for errors.

//The (Spaces Punctuation)* is for cases like "Kage. . ."
//The comma is because of occurences like “You’re …,” I said.
endSentencePunctuation : (Punctuation+ (Spaces Punctuation)* Comma? | '’' Punctuation*);

// The (Punctuation+ Spaces*)? is for cases like "... and so it began"
danglingSentence : (Punctuation+ Spaces*)? ((word | quotedSentence) Comma? Spaces+)* (word | quotedSentence) Comma? Spaces*;


quotedSentence 	: quouteStart='(' midParagraph=paragraph quoteEnd=')' 
				| quouteStart='“' midParagraph=paragraph quoteEnd='”' 
				| quouteStart='"' midParagraph=paragraph quoteEnd='"' 
				//| quouteStart='[' midParagraph=paragraph quoteEnd=']'
				//| quouteStart='{' midParagraph=paragraph quoteEnd='}' 
				| quouteStart='‘' midParagraph=paragraph quoteEnd='’'
				| quouteStart='"' midParagraph=paragraph quoteEnd='"';

//Might solve the problem with quotes that are not closed. Should be included in endParagraphSentence then-
unclosedSentence : ('(' | '“' | '‘') paragraph ;

word : normalWord | nonWord;             // match lower-case identifiers

normalWord : NormalWord;
		   
//For some reason i need to make this rule, instead of just having it as part of the normalWord rule.
NormalWord : ('’')? NormalWordLetters+ ('’' NormalWordLetters+)* // To handle things like normal words, and '’Tention' and 'it’s'. The plus at the end is to avoid closing quotes.
		   | NormalWordLetters+ '’,'; // For cases like: 'somethin’,'
		 
nonWord :  NonWord;
		 
NonWord :('’')? NonWordLetters+ ('’' NonWordLetters+)*
		 |  NonWordLetters+ '.' (NonWordLetters+ '.')+ // To handle things like U.S.A.
		 |  NonWordLetters+ '.,' //To handle things like osv., 
		 |  Number
		 |  NonWordLetters+ Comma NonWordLetters+;  //To handle things like 12:00;
		 
Punctuation : [.!?…];

Comma : [,;:] | '.,';

QuotationStart : [(“‘];

QuotationEnd : [)”’];

Spaces : [\\=–  ⁠—/\u2014-];

Number : [0-9]+ ('.'? [0-9]*) | '.' [0-9]+; //Handles 1000, 100.99, 1.000.000 and .99


NormalWordLetters : [ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅabcdefghijklmnopqrstuvwxyzæøå];//~[\t.!?…&,;:'*_()“”‘’"`[\]{}%0123456789=–\r\n  ⁠—/-];

NonWordLetters : ~[\t.!?…,;:(“‘")”’=–\r\n  ⁠—/—-];

Newlines : [\r\n];

WS : [\t]+ -> skip ; // skip tabs

UnparsableChar : . -> skip;

