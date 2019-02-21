// Generated from com/semantalytics/antlr/sparql/sparql10/Sparql10Lexer.g4 by ANTLR 4.7
package com.semantalytics.antlr.sparql.sparql10;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sparql10Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BASE=1, SELECT=2, ORDER=3, BY=4, FROM=5, GRAPH=6, STR=7, ISURI=8, PREFIX=9, 
		CONSTRUCT=10, LIMIT=11, ASC=12, DESC=13, NAMED=14, OPTIONAL=15, LANG=16, 
		ISIRI=17, DESCRIBE=18, OFFSET=19, WHERE=20, UNION=21, LANGMATCHES=22, 
		ISLITERAL=23, ASK=24, DISTINCT=25, FILTER=26, DATATYPE=27, REGEX=28, REDUCED=29, 
		A=30, BOUND=31, TRUE=32, SAMETERM=33, FALSE=34, AS=35, ISBLANK=36, IRI_REF=37, 
		PNAME_NS=38, PNAME_LN=39, BLANK_NODE_LABEL=40, VAR1=41, VAR2=42, LANGTAG=43, 
		INTEGER=44, DECIMAL=45, DOUBLE=46, INTEGER_POSITIVE=47, DECIMAL_POSITIVE=48, 
		DOUBLE_POSITIVE=49, INTEGER_NEGATIVE=50, DECIMAL_NEGATIVE=51, DOUBLE_NEGATIVE=52, 
		EXPONENT=53, STRING_LITERAL1=54, STRING_LITERAL2=55, STRING_LITERAL_LONG1=56, 
		STRING_LITERAL_LONG2=57, ECHAR=58, NIL=59, WS=60, ANON=61, PN_CHARS_BASE=62, 
		PN_CHARS_U=63, VARNAME=64, PN_CHARS=65, PN_PREFIX=66, PN_LOCAL=67, COMMENT=68, 
		ASTERISK=69, DOT=70, OPEN_CURLY_BRACE=71, CLOSE_CURLY_BRACE=72, SEMICOLON=73, 
		COMMA=74, OPEN_BRACE=75, CLOSE_BRACE=76, OPEN_SQUARE_BRACE=77, CLOSE_SQUARE_BRACE=78, 
		LESS_EQUAL=79, GREATER_EQUAL=80, NOT_EQUAL=81, NOT_SIGN=82, DIVIDE=83, 
		EQUAL=84, LESS=85, GREATER=86, PLUS=87, MINUS=88, AND=89, OR=90, REFERENCE=91;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BASE", "SELECT", "ORDER", "BY", "FROM", "GRAPH", "STR", "ISURI", "PREFIX", 
		"CONSTRUCT", "LIMIT", "ASC", "DESC", "NAMED", "OPTIONAL", "LANG", "ISIRI", 
		"DESCRIBE", "OFFSET", "WHERE", "UNION", "LANGMATCHES", "ISLITERAL", "ASK", 
		"DISTINCT", "FILTER", "DATATYPE", "REGEX", "REDUCED", "A", "BOUND", "TRUE", 
		"SAMETERM", "FALSE", "AS", "ISBLANK", "DIGIT", "TAB", "EOL", "EOL1", "EOL2", 
		"IRI_REF", "PNAME_NS", "PNAME_LN", "BLANK_NODE_LABEL", "VAR1", "VAR2", 
		"LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", "INTEGER_POSITIVE", "DECIMAL_POSITIVE", 
		"DOUBLE_POSITIVE", "INTEGER_NEGATIVE", "DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", 
		"EXPONENT", "STRING_LITERAL1", "STRING_LITERAL2", "STRING_LITERAL_LONG1", 
		"STRING_LITERAL_LONG2", "ECHAR", "NIL", "WS", "ANON", "PN_CHARS_BASE", 
		"PN_CHARS_U", "VARNAME", "PN_CHARS", "PN_PREFIX", "PN_LOCAL", "COMMENT", 
		"ASTERISK", "DOT", "OPEN_CURLY_BRACE", "CLOSE_CURLY_BRACE", "SEMICOLON", 
		"COMMA", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_SQUARE_BRACE", "CLOSE_SQUARE_BRACE", 
		"LESS_EQUAL", "GREATER_EQUAL", "NOT_EQUAL", "NOT_SIGN", "DIVIDE", "EQUAL", 
		"LESS", "GREATER", "PLUS", "MINUS", "AND", "OR", "REFERENCE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'*'", "'.'", "'{'", 
		"'}'", "';'", "','", "'('", "')'", "'['", "']'", "'<='", "'>='", "'!='", 
		"'!'", "'/'", "'='", "'<'", "'>'", "'+'", "'-'", "'&&'", "'||'", "'^^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BASE", "SELECT", "ORDER", "BY", "FROM", "GRAPH", "STR", "ISURI", 
		"PREFIX", "CONSTRUCT", "LIMIT", "ASC", "DESC", "NAMED", "OPTIONAL", "LANG", 
		"ISIRI", "DESCRIBE", "OFFSET", "WHERE", "UNION", "LANGMATCHES", "ISLITERAL", 
		"ASK", "DISTINCT", "FILTER", "DATATYPE", "REGEX", "REDUCED", "A", "BOUND", 
		"TRUE", "SAMETERM", "FALSE", "AS", "ISBLANK", "IRI_REF", "PNAME_NS", "PNAME_LN", 
		"BLANK_NODE_LABEL", "VAR1", "VAR2", "LANGTAG", "INTEGER", "DECIMAL", "DOUBLE", 
		"INTEGER_POSITIVE", "DECIMAL_POSITIVE", "DOUBLE_POSITIVE", "INTEGER_NEGATIVE", 
		"DECIMAL_NEGATIVE", "DOUBLE_NEGATIVE", "EXPONENT", "STRING_LITERAL1", 
		"STRING_LITERAL2", "STRING_LITERAL_LONG1", "STRING_LITERAL_LONG2", "ECHAR", 
		"NIL", "WS", "ANON", "PN_CHARS_BASE", "PN_CHARS_U", "VARNAME", "PN_CHARS", 
		"PN_PREFIX", "PN_LOCAL", "COMMENT", "ASTERISK", "DOT", "OPEN_CURLY_BRACE", 
		"CLOSE_CURLY_BRACE", "SEMICOLON", "COMMA", "OPEN_BRACE", "CLOSE_BRACE", 
		"OPEN_SQUARE_BRACE", "CLOSE_SQUARE_BRACE", "LESS_EQUAL", "GREATER_EQUAL", 
		"NOT_EQUAL", "NOT_SIGN", "DIVIDE", "EQUAL", "LESS", "GREATER", "PLUS", 
		"MINUS", "AND", "OR", "REFERENCE"
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


	public Sparql10Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sparql10Lexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2]\u0301\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\5(\u01b2\n(\3)\3)\3*\3*\3+\3+\7+\u01ba\n+\f+\16+\u01bd"+
		"\13+\3+\3+\3,\5,\u01c2\n,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\6\61\u01d6\n\61\r\61\16\61\u01d7\3\61\3\61\3\61\6"+
		"\61\u01dd\n\61\r\61\16\61\u01de\7\61\u01e1\n\61\f\61\16\61\u01e4\13\61"+
		"\3\62\6\62\u01e7\n\62\r\62\16\62\u01e8\3\63\6\63\u01ec\n\63\r\63\16\63"+
		"\u01ed\3\63\3\63\7\63\u01f2\n\63\f\63\16\63\u01f5\13\63\3\63\3\63\6\63"+
		"\u01f9\n\63\r\63\16\63\u01fa\5\63\u01fd\n\63\3\64\6\64\u0200\n\64\r\64"+
		"\16\64\u0201\3\64\3\64\7\64\u0206\n\64\f\64\16\64\u0209\13\64\3\64\3\64"+
		"\3\64\3\64\6\64\u020f\n\64\r\64\16\64\u0210\3\64\3\64\3\64\6\64\u0216"+
		"\n\64\r\64\16\64\u0217\3\64\3\64\5\64\u021c\n\64\3\65\3\65\3\65\3\66\3"+
		"\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\5;\u0232\n;\3"+
		";\6;\u0235\n;\r;\16;\u0236\3<\3<\3<\7<\u023c\n<\f<\16<\u023f\13<\3<\3"+
		"<\3=\3=\3=\7=\u0246\n=\f=\16=\u0249\13=\3=\3=\3>\3>\3>\3>\3>\3>\3>\5>"+
		"\u0254\n>\3>\3>\5>\u0258\n>\7>\u025a\n>\f>\16>\u025d\13>\3>\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3?\3?\5?\u026a\n?\3?\3?\5?\u026e\n?\7?\u0270\n?\f?\16?\u0273"+
		"\13?\3?\3?\3?\3?\3@\3@\3@\3A\3A\7A\u027e\nA\fA\16A\u0281\13A\3A\3A\3B"+
		"\3B\3B\5B\u0288\nB\3B\3B\3C\3C\7C\u028e\nC\fC\16C\u0291\13C\3C\3C\3D\3"+
		"D\3E\3E\5E\u0299\nE\3F\3F\5F\u029d\nF\3F\3F\7F\u02a1\nF\fF\16F\u02a4\13"+
		"F\3G\3G\5G\u02a8\nG\3H\3H\3H\7H\u02ad\nH\fH\16H\u02b0\13H\3H\5H\u02b3"+
		"\nH\3I\3I\5I\u02b7\nI\3I\3I\7I\u02bb\nI\fI\16I\u02be\13I\3I\5I\u02c1\n"+
		"I\3J\3J\7J\u02c5\nJ\fJ\16J\u02c8\13J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N"+
		"\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X"+
		"\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3_\3`\3`\3`\3a\3a\3a\13"+
		"\u01bb\u01e2\u023d\u0247\u025b\u0271\u027f\u028f\u02c6\2b\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\2M\2O\2Q\2S\2U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63o\64q\65s\66u\67"+
		"w8y9{:};\177<\u0081=\u0083>\u0085?\u0087@\u0089A\u008bB\u008dC\u008fD"+
		"\u0091E\u0093F\u0095G\u0097H\u0099I\u009bJ\u009dK\u009fL\u00a1M\u00a3"+
		"N\u00a5O\u00a7P\u00a9Q\u00abR\u00adS\u00afT\u00b1U\u00b3V\u00b5W\u00b7"+
		"X\u00b9Y\u00bbZ\u00bd[\u00bf\\\u00c1]\3\2#\4\2DDdd\4\2CCcc\4\2UUuu\4\2"+
		"GGgg\4\2NNnn\4\2EEee\4\2VVvv\4\2QQqq\4\2TTtt\4\2FFff\4\2[[{{\4\2HHhh\4"+
		"\2OOoo\4\2IIii\4\2RRrr\4\2JJjj\4\2KKkk\4\2WWww\4\2ZZzz\4\2PPpp\4\2YYy"+
		"y\4\2MMmm\n\2\2\"$$>>@@^^``bb}\177\4\2C\\c|\4\2--//\6\2\f\f\17\17))^^"+
		"\6\2\f\f\17\17$$^^\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\17\2C\\c|\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072"+
		"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\6\2\62;\u00b9\u00b9"+
		"\u0302\u0371\u2041\u2042\7\2//\62;\u00b9\u00b9\u0302\u0371\u2041\u2042"+
		"\2\u032b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2"+
		"\2\2\u00c1\3\2\2\2\3\u00c3\3\2\2\2\5\u00c8\3\2\2\2\7\u00cf\3\2\2\2\t\u00d5"+
		"\3\2\2\2\13\u00d8\3\2\2\2\r\u00dd\3\2\2\2\17\u00e3\3\2\2\2\21\u00e7\3"+
		"\2\2\2\23\u00ed\3\2\2\2\25\u00f4\3\2\2\2\27\u00fe\3\2\2\2\31\u0104\3\2"+
		"\2\2\33\u0108\3\2\2\2\35\u010d\3\2\2\2\37\u0113\3\2\2\2!\u011c\3\2\2\2"+
		"#\u0121\3\2\2\2%\u0127\3\2\2\2\'\u0130\3\2\2\2)\u0137\3\2\2\2+\u013d\3"+
		"\2\2\2-\u0143\3\2\2\2/\u014f\3\2\2\2\61\u0159\3\2\2\2\63\u015d\3\2\2\2"+
		"\65\u0166\3\2\2\2\67\u016d\3\2\2\29\u0176\3\2\2\2;\u017c\3\2\2\2=\u0184"+
		"\3\2\2\2?\u0186\3\2\2\2A\u018c\3\2\2\2C\u0191\3\2\2\2E\u019a\3\2\2\2G"+
		"\u01a0\3\2\2\2I\u01a3\3\2\2\2K\u01ab\3\2\2\2M\u01ad\3\2\2\2O\u01b1\3\2"+
		"\2\2Q\u01b3\3\2\2\2S\u01b5\3\2\2\2U\u01b7\3\2\2\2W\u01c1\3\2\2\2Y\u01c5"+
		"\3\2\2\2[\u01c8\3\2\2\2]\u01cd\3\2\2\2_\u01d0\3\2\2\2a\u01d3\3\2\2\2c"+
		"\u01e6\3\2\2\2e\u01fc\3\2\2\2g\u021b\3\2\2\2i\u021d\3\2\2\2k\u0220\3\2"+
		"\2\2m\u0223\3\2\2\2o\u0226\3\2\2\2q\u0229\3\2\2\2s\u022c\3\2\2\2u\u022f"+
		"\3\2\2\2w\u0238\3\2\2\2y\u0242\3\2\2\2{\u024c\3\2\2\2}\u0262\3\2\2\2\177"+
		"\u0278\3\2\2\2\u0081\u027b\3\2\2\2\u0083\u0287\3\2\2\2\u0085\u028b\3\2"+
		"\2\2\u0087\u0294\3\2\2\2\u0089\u0298\3\2\2\2\u008b\u029c\3\2\2\2\u008d"+
		"\u02a7\3\2\2\2\u008f\u02a9\3\2\2\2\u0091\u02b6\3\2\2\2\u0093\u02c2\3\2"+
		"\2\2\u0095\u02cd\3\2\2\2\u0097\u02cf\3\2\2\2\u0099\u02d1\3\2\2\2\u009b"+
		"\u02d3\3\2\2\2\u009d\u02d5\3\2\2\2\u009f\u02d7\3\2\2\2\u00a1\u02d9\3\2"+
		"\2\2\u00a3\u02db\3\2\2\2\u00a5\u02dd\3\2\2\2\u00a7\u02df\3\2\2\2\u00a9"+
		"\u02e1\3\2\2\2\u00ab\u02e4\3\2\2\2\u00ad\u02e7\3\2\2\2\u00af\u02ea\3\2"+
		"\2\2\u00b1\u02ec\3\2\2\2\u00b3\u02ee\3\2\2\2\u00b5\u02f0\3\2\2\2\u00b7"+
		"\u02f2\3\2\2\2\u00b9\u02f4\3\2\2\2\u00bb\u02f6\3\2\2\2\u00bd\u02f8\3\2"+
		"\2\2\u00bf\u02fb\3\2\2\2\u00c1\u02fe\3\2\2\2\u00c3\u00c4\t\2\2\2\u00c4"+
		"\u00c5\t\3\2\2\u00c5\u00c6\t\4\2\2\u00c6\u00c7\t\5\2\2\u00c7\4\3\2\2\2"+
		"\u00c8\u00c9\t\4\2\2\u00c9\u00ca\t\5\2\2\u00ca\u00cb\t\6\2\2\u00cb\u00cc"+
		"\t\5\2\2\u00cc\u00cd\t\7\2\2\u00cd\u00ce\t\b\2\2\u00ce\6\3\2\2\2\u00cf"+
		"\u00d0\t\t\2\2\u00d0\u00d1\t\n\2\2\u00d1\u00d2\t\13\2\2\u00d2\u00d3\t"+
		"\5\2\2\u00d3\u00d4\t\n\2\2\u00d4\b\3\2\2\2\u00d5\u00d6\t\2\2\2\u00d6\u00d7"+
		"\t\f\2\2\u00d7\n\3\2\2\2\u00d8\u00d9\t\r\2\2\u00d9\u00da\t\n\2\2\u00da"+
		"\u00db\t\t\2\2\u00db\u00dc\t\16\2\2\u00dc\f\3\2\2\2\u00dd\u00de\t\17\2"+
		"\2\u00de\u00df\t\n\2\2\u00df\u00e0\t\3\2\2\u00e0\u00e1\t\20\2\2\u00e1"+
		"\u00e2\t\21\2\2\u00e2\16\3\2\2\2\u00e3\u00e4\t\4\2\2\u00e4\u00e5\t\b\2"+
		"\2\u00e5\u00e6\t\n\2\2\u00e6\20\3\2\2\2\u00e7\u00e8\t\22\2\2\u00e8\u00e9"+
		"\t\4\2\2\u00e9\u00ea\t\23\2\2\u00ea\u00eb\t\n\2\2\u00eb\u00ec\t\22\2\2"+
		"\u00ec\22\3\2\2\2\u00ed\u00ee\t\20\2\2\u00ee\u00ef\t\n\2\2\u00ef\u00f0"+
		"\t\5\2\2\u00f0\u00f1\t\r\2\2\u00f1\u00f2\t\22\2\2\u00f2\u00f3\t\24\2\2"+
		"\u00f3\24\3\2\2\2\u00f4\u00f5\t\7\2\2\u00f5\u00f6\t\t\2\2\u00f6\u00f7"+
		"\t\25\2\2\u00f7\u00f8\t\4\2\2\u00f8\u00f9\t\b\2\2\u00f9\u00fa\t\n\2\2"+
		"\u00fa\u00fb\t\23\2\2\u00fb\u00fc\t\7\2\2\u00fc\u00fd\t\b\2\2\u00fd\26"+
		"\3\2\2\2\u00fe\u00ff\t\6\2\2\u00ff\u0100\t\22\2\2\u0100\u0101\t\16\2\2"+
		"\u0101\u0102\t\22\2\2\u0102\u0103\t\b\2\2\u0103\30\3\2\2\2\u0104\u0105"+
		"\t\3\2\2\u0105\u0106\t\4\2\2\u0106\u0107\t\7\2\2\u0107\32\3\2\2\2\u0108"+
		"\u0109\t\13\2\2\u0109\u010a\t\5\2\2\u010a\u010b\t\4\2\2\u010b\u010c\t"+
		"\7\2\2\u010c\34\3\2\2\2\u010d\u010e\t\25\2\2\u010e\u010f\t\3\2\2\u010f"+
		"\u0110\t\16\2\2\u0110\u0111\t\5\2\2\u0111\u0112\t\13\2\2\u0112\36\3\2"+
		"\2\2\u0113\u0114\t\t\2\2\u0114\u0115\t\20\2\2\u0115\u0116\t\b\2\2\u0116"+
		"\u0117\t\22\2\2\u0117\u0118\t\t\2\2\u0118\u0119\t\25\2\2\u0119\u011a\t"+
		"\3\2\2\u011a\u011b\t\6\2\2\u011b \3\2\2\2\u011c\u011d\t\6\2\2\u011d\u011e"+
		"\t\3\2\2\u011e\u011f\t\25\2\2\u011f\u0120\t\17\2\2\u0120\"\3\2\2\2\u0121"+
		"\u0122\t\22\2\2\u0122\u0123\t\4\2\2\u0123\u0124\t\22\2\2\u0124\u0125\t"+
		"\n\2\2\u0125\u0126\t\22\2\2\u0126$\3\2\2\2\u0127\u0128\t\13\2\2\u0128"+
		"\u0129\t\5\2\2\u0129\u012a\t\4\2\2\u012a\u012b\t\7\2\2\u012b\u012c\t\n"+
		"\2\2\u012c\u012d\t\22\2\2\u012d\u012e\t\2\2\2\u012e\u012f\t\5\2\2\u012f"+
		"&\3\2\2\2\u0130\u0131\t\t\2\2\u0131\u0132\t\r\2\2\u0132\u0133\t\r\2\2"+
		"\u0133\u0134\t\4\2\2\u0134\u0135\t\5\2\2\u0135\u0136\t\b\2\2\u0136(\3"+
		"\2\2\2\u0137\u0138\t\26\2\2\u0138\u0139\t\21\2\2\u0139\u013a\t\5\2\2\u013a"+
		"\u013b\t\n\2\2\u013b\u013c\t\5\2\2\u013c*\3\2\2\2\u013d\u013e\t\23\2\2"+
		"\u013e\u013f\t\25\2\2\u013f\u0140\t\22\2\2\u0140\u0141\t\t\2\2\u0141\u0142"+
		"\t\25\2\2\u0142,\3\2\2\2\u0143\u0144\t\6\2\2\u0144\u0145\t\3\2\2\u0145"+
		"\u0146\t\25\2\2\u0146\u0147\t\17\2\2\u0147\u0148\t\16\2\2\u0148\u0149"+
		"\t\3\2\2\u0149\u014a\t\b\2\2\u014a\u014b\t\7\2\2\u014b\u014c\t\21\2\2"+
		"\u014c\u014d\t\5\2\2\u014d\u014e\t\4\2\2\u014e.\3\2\2\2\u014f\u0150\t"+
		"\22\2\2\u0150\u0151\t\4\2\2\u0151\u0152\t\6\2\2\u0152\u0153\t\22\2\2\u0153"+
		"\u0154\t\b\2\2\u0154\u0155\t\5\2\2\u0155\u0156\t\n\2\2\u0156\u0157\t\3"+
		"\2\2\u0157\u0158\t\6\2\2\u0158\60\3\2\2\2\u0159\u015a\t\3\2\2\u015a\u015b"+
		"\t\4\2\2\u015b\u015c\t\27\2\2\u015c\62\3\2\2\2\u015d\u015e\t\13\2\2\u015e"+
		"\u015f\t\22\2\2\u015f\u0160\t\4\2\2\u0160\u0161\t\b\2\2\u0161\u0162\t"+
		"\22\2\2\u0162\u0163\t\25\2\2\u0163\u0164\t\7\2\2\u0164\u0165\t\b\2\2\u0165"+
		"\64\3\2\2\2\u0166\u0167\t\r\2\2\u0167\u0168\t\22\2\2\u0168\u0169\t\6\2"+
		"\2\u0169\u016a\t\b\2\2\u016a\u016b\t\5\2\2\u016b\u016c\t\n\2\2\u016c\66"+
		"\3\2\2\2\u016d\u016e\t\13\2\2\u016e\u016f\t\3\2\2\u016f\u0170\t\b\2\2"+
		"\u0170\u0171\t\3\2\2\u0171\u0172\t\b\2\2\u0172\u0173\t\f\2\2\u0173\u0174"+
		"\t\20\2\2\u0174\u0175\t\5\2\2\u01758\3\2\2\2\u0176\u0177\t\n\2\2\u0177"+
		"\u0178\t\5\2\2\u0178\u0179\t\17\2\2\u0179\u017a\t\5\2\2\u017a\u017b\t"+
		"\24\2\2\u017b:\3\2\2\2\u017c\u017d\t\n\2\2\u017d\u017e\t\5\2\2\u017e\u017f"+
		"\t\13\2\2\u017f\u0180\t\23\2\2\u0180\u0181\t\7\2\2\u0181\u0182\t\5\2\2"+
		"\u0182\u0183\t\13\2\2\u0183<\3\2\2\2\u0184\u0185\7c\2\2\u0185>\3\2\2\2"+
		"\u0186\u0187\t\2\2\2\u0187\u0188\t\t\2\2\u0188\u0189\t\23\2\2\u0189\u018a"+
		"\t\25\2\2\u018a\u018b\t\13\2\2\u018b@\3\2\2\2\u018c\u018d\t\b\2\2\u018d"+
		"\u018e\t\n\2\2\u018e\u018f\t\23\2\2\u018f\u0190\t\5\2\2\u0190B\3\2\2\2"+
		"\u0191\u0192\t\4\2\2\u0192\u0193\t\3\2\2\u0193\u0194\t\16\2\2\u0194\u0195"+
		"\t\5\2\2\u0195\u0196\t\b\2\2\u0196\u0197\t\5\2\2\u0197\u0198\t\n\2\2\u0198"+
		"\u0199\t\16\2\2\u0199D\3\2\2\2\u019a\u019b\t\r\2\2\u019b\u019c\t\3\2\2"+
		"\u019c\u019d\t\6\2\2\u019d\u019e\t\4\2\2\u019e\u019f\t\5\2\2\u019fF\3"+
		"\2\2\2\u01a0\u01a1\t\3\2\2\u01a1\u01a2\t\4\2\2\u01a2H\3\2\2\2\u01a3\u01a4"+
		"\t\22\2\2\u01a4\u01a5\t\4\2\2\u01a5\u01a6\t\2\2\2\u01a6\u01a7\t\6\2\2"+
		"\u01a7\u01a8\t\3\2\2\u01a8\u01a9\t\25\2\2\u01a9\u01aa\t\27\2\2\u01aaJ"+
		"\3\2\2\2\u01ab\u01ac\4\62;\2\u01acL\3\2\2\2\u01ad\u01ae\7\13\2\2\u01ae"+
		"N\3\2\2\2\u01af\u01b2\5Q)\2\u01b0\u01b2\5S*\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2P\3\2\2\2\u01b3\u01b4\7\f\2\2\u01b4R\3\2\2\2\u01b5"+
		"\u01b6\7\17\2\2\u01b6T\3\2\2\2\u01b7\u01bb\7>\2\2\u01b8\u01ba\n\30\2\2"+
		"\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bb\u01b9"+
		"\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\7@\2\2\u01bf"+
		"V\3\2\2\2\u01c0\u01c2\5\u008fH\2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2"+
		"\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\7<\2\2\u01c4X\3\2\2\2\u01c5\u01c6\5"+
		"W,\2\u01c6\u01c7\5\u0091I\2\u01c7Z\3\2\2\2\u01c8\u01c9\7a\2\2\u01c9\u01ca"+
		"\7<\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\5\u0091I\2\u01cc\\\3\2\2\2\u01cd"+
		"\u01ce\7A\2\2\u01ce\u01cf\5\u008bF\2\u01cf^\3\2\2\2\u01d0\u01d1\7&\2\2"+
		"\u01d1\u01d2\5\u008bF\2\u01d2`\3\2\2\2\u01d3\u01d5\7B\2\2\u01d4\u01d6"+
		"\t\31\2\2\u01d5\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2"+
		"\u01d7\u01d8\3\2\2\2\u01d8\u01e2\3\2\2\2\u01d9\u01dc\7/\2\2\u01da\u01db"+
		"\t\31\2\2\u01db\u01dd\4\62;\2\u01dc\u01da\3\2\2\2\u01dd\u01de\3\2\2\2"+
		"\u01de\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01d9"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3"+
		"b\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e7\5K&\2\u01e6\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9d\3\2\2\2"+
		"\u01ea\u01ec\5K&\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb"+
		"\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f3\5\u0097L"+
		"\2\u01f0\u01f2\5K&\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01fd\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6"+
		"\u01f8\5\u0097L\2\u01f7\u01f9\5K&\2\u01f8\u01f7\3\2\2\2\u01f9\u01fa\3"+
		"\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc"+
		"\u01eb\3\2\2\2\u01fc\u01f6\3\2\2\2\u01fdf\3\2\2\2\u01fe\u0200\5K&\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0203\3\2\2\2\u0203\u0207\5\u0097L\2\u0204\u0206\5K&\2\u0205"+
		"\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2"+
		"\2\2\u0208\u020a\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\5u;\2\u020b\u021c"+
		"\3\2\2\2\u020c\u020e\5\u0097L\2\u020d\u020f\5K&\2\u020e\u020d\3\2\2\2"+
		"\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0213\5u;\2\u0213\u021c\3\2\2\2\u0214\u0216\5K&\2\u0215"+
		"\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0215\3\2\2\2\u0217\u0218\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5u;\2\u021a\u021c\3\2\2\2\u021b\u01ff"+
		"\3\2\2\2\u021b\u020c\3\2\2\2\u021b\u0215\3\2\2\2\u021ch\3\2\2\2\u021d"+
		"\u021e\7-\2\2\u021e\u021f\5c\62\2\u021fj\3\2\2\2\u0220\u0221\7-\2\2\u0221"+
		"\u0222\5e\63\2\u0222l\3\2\2\2\u0223\u0224\7-\2\2\u0224\u0225\5g\64\2\u0225"+
		"n\3\2\2\2\u0226\u0227\7/\2\2\u0227\u0228\5c\62\2\u0228p\3\2\2\2\u0229"+
		"\u022a\7/\2\2\u022a\u022b\5e\63\2\u022br\3\2\2\2\u022c\u022d\7/\2\2\u022d"+
		"\u022e\5g\64\2\u022et\3\2\2\2\u022f\u0231\t\5\2\2\u0230\u0232\t\32\2\2"+
		"\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0234\3\2\2\2\u0233\u0235"+
		"\4\62;\2\u0234\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237v\3\2\2\2\u0238\u023d\7)\2\2\u0239\u023c\n\33\2\2"+
		"\u023a\u023c\5\177@\2\u023b\u0239\3\2\2\2\u023b\u023a\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023d\u023b\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\7)\2\2\u0241x\3\2\2\2\u0242\u0247\7$\2\2\u0243"+
		"\u0246\n\34\2\2\u0244\u0246\5\177@\2\u0245\u0243\3\2\2\2\u0245\u0244\3"+
		"\2\2\2\u0246\u0249\3\2\2\2\u0247\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248"+
		"\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\7$\2\2\u024bz\3\2\2\2\u024c"+
		"\u024d\7)\2\2\u024d\u024e\7)\2\2\u024e\u024f\7)\2\2\u024f\u025b\3\2\2"+
		"\2\u0250\u0254\7)\2\2\u0251\u0252\7)\2\2\u0252\u0254\7)\2\2\u0253\u0250"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0257\3\2\2\2\u0255"+
		"\u0258\n\35\2\2\u0256\u0258\5\177@\2\u0257\u0255\3\2\2\2\u0257\u0256\3"+
		"\2\2\2\u0258\u025a\3\2\2\2\u0259\u0253\3\2\2\2\u025a\u025d\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025e\u025f\7)\2\2\u025f\u0260\7)\2\2\u0260\u0261\7)\2\2\u0261|\3"+
		"\2\2\2\u0262\u0263\7$\2\2\u0263\u0264\7$\2\2\u0264\u0265\7$\2\2\u0265"+
		"\u0271\3\2\2\2\u0266\u026a\7$\2\2\u0267\u0268\7$\2\2\u0268\u026a\7$\2"+
		"\2\u0269\u0266\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026d"+
		"\3\2\2\2\u026b\u026e\n\36\2\2\u026c\u026e\5\177@\2\u026d\u026b\3\2\2\2"+
		"\u026d\u026c\3\2\2\2\u026e\u0270\3\2\2\2\u026f\u0269\3\2\2\2\u0270\u0273"+
		"\3\2\2\2\u0271\u0272\3\2\2\2\u0271\u026f\3\2\2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0274\u0275\7$\2\2\u0275\u0276\7$\2\2\u0276\u0277\7$\2"+
		"\2\u0277~\3\2\2\2\u0278\u0279\7^\2\2\u0279\u027a\t\37\2\2\u027a\u0080"+
		"\3\2\2\2\u027b\u027f\7*\2\2\u027c\u027e\5\u0083B\2\u027d\u027c\3\2\2\2"+
		"\u027e\u0281\3\2\2\2\u027f\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0282"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\7+\2\2\u0283\u0082\3\2\2\2\u0284"+
		"\u0288\7\"\2\2\u0285\u0288\5M\'\2\u0286\u0288\5O(\2\u0287\u0284\3\2\2"+
		"\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a"+
		"\bB\2\2\u028a\u0084\3\2\2\2\u028b\u028f\7]\2\2\u028c\u028e\5\u0083B\2"+
		"\u028d\u028c\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u0290\3\2\2\2\u028f\u028d"+
		"\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\7_\2\2\u0293"+
		"\u0086\3\2\2\2\u0294\u0295\t \2\2\u0295\u0088\3\2\2\2\u0296\u0299\5\u0087"+
		"D\2\u0297\u0299\7a\2\2\u0298\u0296\3\2\2\2\u0298\u0297\3\2\2\2\u0299\u008a"+
		"\3\2\2\2\u029a\u029d\5\u0089E\2\u029b\u029d\4\62;\2\u029c\u029a\3\2\2"+
		"\2\u029c\u029b\3\2\2\2\u029d\u02a2\3\2\2\2\u029e\u02a1\5\u0089E\2\u029f"+
		"\u02a1\t!\2\2\u02a0\u029e\3\2\2\2\u02a0\u029f\3\2\2\2\u02a1\u02a4\3\2"+
		"\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u008c\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a5\u02a8\5\u0089E\2\u02a6\u02a8\t\"\2\2\u02a7\u02a5"+
		"\3\2\2\2\u02a7\u02a6\3\2\2\2\u02a8\u008e\3\2\2\2\u02a9\u02b2\5\u0087D"+
		"\2\u02aa\u02ad\5\u008dG\2\u02ab\u02ad\5\u0097L\2\u02ac\u02aa\3\2\2\2\u02ac"+
		"\u02ab\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2"+
		"\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b3\5\u008dG\2\u02b2"+
		"\u02ae\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u0090\3\2\2\2\u02b4\u02b7\5\u0089"+
		"E\2\u02b5\u02b7\4\62;\2\u02b6\u02b4\3\2\2\2\u02b6\u02b5\3\2\2\2\u02b7"+
		"\u02c0\3\2\2\2\u02b8\u02bb\5\u008dG\2\u02b9\u02bb\5\u0097L\2\u02ba\u02b8"+
		"\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc"+
		"\u02bd\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c1\5\u008d"+
		"G\2\u02c0\u02bc\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u0092\3\2\2\2\u02c2"+
		"\u02c6\7%\2\2\u02c3\u02c5\13\2\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c9\u02ca\5O(\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\bJ\2"+
		"\2\u02cc\u0094\3\2\2\2\u02cd\u02ce\7,\2\2\u02ce\u0096\3\2\2\2\u02cf\u02d0"+
		"\7\60\2\2\u02d0\u0098\3\2\2\2\u02d1\u02d2\7}\2\2\u02d2\u009a\3\2\2\2\u02d3"+
		"\u02d4\7\177\2\2\u02d4\u009c\3\2\2\2\u02d5\u02d6\7=\2\2\u02d6\u009e\3"+
		"\2\2\2\u02d7\u02d8\7.\2\2\u02d8\u00a0\3\2\2\2\u02d9\u02da\7*\2\2\u02da"+
		"\u00a2\3\2\2\2\u02db\u02dc\7+\2\2\u02dc\u00a4\3\2\2\2\u02dd\u02de\7]\2"+
		"\2\u02de\u00a6\3\2\2\2\u02df\u02e0\7_\2\2\u02e0\u00a8\3\2\2\2\u02e1\u02e2"+
		"\7>\2\2\u02e2\u02e3\7?\2\2\u02e3\u00aa\3\2\2\2\u02e4\u02e5\7@\2\2\u02e5"+
		"\u02e6\7?\2\2\u02e6\u00ac\3\2\2\2\u02e7\u02e8\7#\2\2\u02e8\u02e9\7?\2"+
		"\2\u02e9\u00ae\3\2\2\2\u02ea\u02eb\7#\2\2\u02eb\u00b0\3\2\2\2\u02ec\u02ed"+
		"\7\61\2\2\u02ed\u00b2\3\2\2\2\u02ee\u02ef\7?\2\2\u02ef\u00b4\3\2\2\2\u02f0"+
		"\u02f1\7>\2\2\u02f1\u00b6\3\2\2\2\u02f2\u02f3\7@\2\2\u02f3\u00b8\3\2\2"+
		"\2\u02f4\u02f5\7-\2\2\u02f5\u00ba\3\2\2\2\u02f6\u02f7\7/\2\2\u02f7\u00bc"+
		"\3\2\2\2\u02f8\u02f9\7(\2\2\u02f9\u02fa\7(\2\2\u02fa\u00be\3\2\2\2\u02fb"+
		"\u02fc\7~\2\2\u02fc\u02fd\7~\2\2\u02fd\u00c0\3\2\2\2\u02fe\u02ff\7`\2"+
		"\2\u02ff\u0300\7`\2\2\u0300\u00c2\3\2\2\2/\2\u01b1\u01bb\u01c1\u01d7\u01de"+
		"\u01e2\u01e8\u01ed\u01f3\u01fa\u01fc\u0201\u0207\u0210\u0217\u021b\u0231"+
		"\u0236\u023b\u023d\u0245\u0247\u0253\u0257\u025b\u0269\u026d\u0271\u027f"+
		"\u0287\u028f\u0298\u029c\u02a0\u02a2\u02a7\u02ac\u02ae\u02b2\u02b6\u02ba"+
		"\u02bc\u02c0\u02c6\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}