// Generated from /Users/gerardoarturomiranda/Documents/Diseño de Compiladores/ProyectoFinal_Compiladores/src/Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NOT=9, 
		COUNT=10, AVG=11, SUM=12, MIN=13, MAX=14, IntegerLiteral=15, FloatingPointLiteral=16, 
		BooleanLiteral=17, CharacterLiteral=18, StringLiteral=19, Predicate=20, 
		Identifier=21, WS=22, COMMENT=23, MULTILINE_COMMENT=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NOT", 
			"COUNT", "AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "DecimalIntegerLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
			"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
			"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
			"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
			"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", 
			"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", 
			"BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
			"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
			"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
			"BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", "SingleCharacter", 
			"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
			"OctalEscape", "ZeroToThree", "Predicate", "Identifier", "IdentifierLetter", 
			"IdentifierLetterOrDigit", "WS", "COMMENT", "MULTILINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'.'", "','", "':-'", "'?-'", "'<'", "'>'", "'not'", 
			"'count'", "'avg'", "'sum'", "'min'", "'max'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NOT", "COUNT", 
			"AVG", "SUM", "MIN", "MAX", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "Predicate", "Identifier", 
			"WS", "COMMENT", "MULTILINE_COMMENT"
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u01f3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00be\n\20"+
		"\3\21\3\21\5\21\u00c2\n\21\3\22\3\22\5\22\u00c6\n\22\3\23\3\23\5\23\u00ca"+
		"\n\23\3\24\3\24\5\24\u00ce\n\24\3\25\3\25\3\26\3\26\3\26\5\26\u00d5\n"+
		"\26\3\26\3\26\3\26\5\26\u00da\n\26\5\26\u00dc\n\26\3\27\3\27\5\27\u00e0"+
		"\n\27\3\27\5\27\u00e3\n\27\3\30\3\30\5\30\u00e7\n\30\3\31\3\31\3\32\6"+
		"\32\u00ec\n\32\r\32\16\32\u00ed\3\33\3\33\5\33\u00f2\n\33\3\34\6\34\u00f5"+
		"\n\34\r\34\16\34\u00f6\3\35\3\35\3\35\3\35\3\36\3\36\5\36\u00ff\n\36\3"+
		"\36\5\36\u0102\n\36\3\37\3\37\3 \6 \u0107\n \r \16 \u0108\3!\3!\5!\u010d"+
		"\n!\3\"\3\"\5\"\u0111\n\"\3\"\3\"\3#\3#\5#\u0117\n#\3#\5#\u011a\n#\3$"+
		"\3$\3%\6%\u011f\n%\r%\16%\u0120\3&\3&\5&\u0125\n&\3\'\3\'\3\'\3\'\3(\3"+
		"(\5(\u012d\n(\3(\5(\u0130\n(\3)\3)\3*\6*\u0135\n*\r*\16*\u0136\3+\3+\5"+
		"+\u013b\n+\3,\3,\5,\u013f\n,\3-\3-\3-\5-\u0144\n-\3-\5-\u0147\n-\3-\5"+
		"-\u014a\n-\3-\3-\3-\5-\u014f\n-\3-\5-\u0152\n-\3-\3-\3-\5-\u0157\n-\3"+
		"-\3-\3-\5-\u015c\n-\3.\3.\3.\3/\3/\3\60\5\60\u0164\n\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\63\5\63\u016f\n\63\3\64\3\64\5\64\u0173\n"+
		"\64\3\64\3\64\3\64\5\64\u0178\n\64\3\64\3\64\5\64\u017c\n\64\3\65\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u018c"+
		"\n\67\38\38\38\38\38\38\38\38\58\u0196\n8\39\39\3:\3:\5:\u019c\n:\3:\3"+
		":\3;\6;\u01a1\n;\r;\16;\u01a2\3<\3<\5<\u01a7\n<\3=\3=\3=\5=\u01ac\n=\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u01b9\n>\3?\3?\3@\3@\7@\u01bf\n@\f"+
		"@\16@\u01c2\13@\3A\3A\3A\7A\u01c7\nA\fA\16A\u01ca\13A\3B\3B\3C\3C\3D\6"+
		"D\u01d1\nD\rD\16D\u01d2\3D\3D\3E\3E\7E\u01d9\nE\fE\16E\u01dc\13E\3E\5"+
		"E\u01df\nE\3E\3E\3F\3F\3F\3F\3F\7F\u01e8\nF\fF\16F\u01eb\13F\3F\3F\3F"+
		"\5F\u01f0\nF\3F\3F\3\u01e9\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2"+
		"\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\22Y\2[\2]\2_"+
		"\2a\2c\2e\2g\2i\2k\2m\23o\24q\2s\25u\2w\2y\2{\2}\2\177\26\u0081\27\u0083"+
		"\2\u0085\2\u0087\30\u0089\31\u008b\32\3\2\26\4\2NNnn\3\2\63;\4\2ZZzz\5"+
		"\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2R"+
		"Rrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65"+
		"\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\3\f\f\17\17"+
		"\2\u0200\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2W\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2s\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2"+
		"\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13\u0095\3\2\2\2\r\u0098\3\2\2\2\17"+
		"\u009b\3\2\2\2\21\u009d\3\2\2\2\23\u009f\3\2\2\2\25\u00a3\3\2\2\2\27\u00a9"+
		"\3\2\2\2\31\u00ad\3\2\2\2\33\u00b1\3\2\2\2\35\u00b5\3\2\2\2\37\u00bd\3"+
		"\2\2\2!\u00bf\3\2\2\2#\u00c3\3\2\2\2%\u00c7\3\2\2\2\'\u00cb\3\2\2\2)\u00cf"+
		"\3\2\2\2+\u00db\3\2\2\2-\u00dd\3\2\2\2/\u00e6\3\2\2\2\61\u00e8\3\2\2\2"+
		"\63\u00eb\3\2\2\2\65\u00f1\3\2\2\2\67\u00f4\3\2\2\29\u00f8\3\2\2\2;\u00fc"+
		"\3\2\2\2=\u0103\3\2\2\2?\u0106\3\2\2\2A\u010c\3\2\2\2C\u010e\3\2\2\2E"+
		"\u0114\3\2\2\2G\u011b\3\2\2\2I\u011e\3\2\2\2K\u0124\3\2\2\2M\u0126\3\2"+
		"\2\2O\u012a\3\2\2\2Q\u0131\3\2\2\2S\u0134\3\2\2\2U\u013a\3\2\2\2W\u013e"+
		"\3\2\2\2Y\u015b\3\2\2\2[\u015d\3\2\2\2]\u0160\3\2\2\2_\u0163\3\2\2\2a"+
		"\u0167\3\2\2\2c\u0169\3\2\2\2e\u016b\3\2\2\2g\u017b\3\2\2\2i\u017d\3\2"+
		"\2\2k\u0180\3\2\2\2m\u018b\3\2\2\2o\u0195\3\2\2\2q\u0197\3\2\2\2s\u0199"+
		"\3\2\2\2u\u01a0\3\2\2\2w\u01a6\3\2\2\2y\u01ab\3\2\2\2{\u01b8\3\2\2\2}"+
		"\u01ba\3\2\2\2\177\u01bc\3\2\2\2\u0081\u01c3\3\2\2\2\u0083\u01cb\3\2\2"+
		"\2\u0085\u01cd\3\2\2\2\u0087\u01d0\3\2\2\2\u0089\u01d6\3\2\2\2\u008b\u01e2"+
		"\3\2\2\2\u008d\u008e\7*\2\2\u008e\4\3\2\2\2\u008f\u0090\7+\2\2\u0090\6"+
		"\3\2\2\2\u0091\u0092\7\60\2\2\u0092\b\3\2\2\2\u0093\u0094\7.\2\2\u0094"+
		"\n\3\2\2\2\u0095\u0096\7<\2\2\u0096\u0097\7/\2\2\u0097\f\3\2\2\2\u0098"+
		"\u0099\7A\2\2\u0099\u009a\7/\2\2\u009a\16\3\2\2\2\u009b\u009c\7>\2\2\u009c"+
		"\20\3\2\2\2\u009d\u009e\7@\2\2\u009e\22\3\2\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7v\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7e\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2"+
		"\u00a8\26\3\2\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7x\2\2\u00ab\u00ac\7"+
		"i\2\2\u00ac\30\3\2\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7w\2\2\u00af\u00b0"+
		"\7o\2\2\u00b0\32\3\2\2\2\u00b1\u00b2\7o\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7o\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8"+
		"\7z\2\2\u00b8\36\3\2\2\2\u00b9\u00be\5!\21\2\u00ba\u00be\5#\22\2\u00bb"+
		"\u00be\5%\23\2\u00bc\u00be\5\'\24\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be \3\2\2\2\u00bf\u00c1"+
		"\5+\26\2\u00c0\u00c2\5)\25\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\"\3\2\2\2\u00c3\u00c5\59\35\2\u00c4\u00c6\5)\25\2\u00c5\u00c4\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6$\3\2\2\2\u00c7\u00c9\5C\"\2\u00c8\u00ca\5)"+
		"\25\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca&\3\2\2\2\u00cb\u00cd"+
		"\5M\'\2\u00cc\u00ce\5)\25\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"(\3\2\2\2\u00cf\u00d0\t\2\2\2\u00d0*\3\2\2\2\u00d1\u00dc\7\62\2\2\u00d2"+
		"\u00d9\5\61\31\2\u00d3\u00d5\5-\27\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3"+
		"\2\2\2\u00d5\u00da\3\2\2\2\u00d6\u00d7\5\67\34\2\u00d7\u00d8\5-\27\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d1\3\2\2\2\u00db\u00d2\3\2\2\2\u00dc,\3\2\2\2\u00dd\u00e2"+
		"\5/\30\2\u00de\u00e0\5\63\32\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e3\5/\30\2\u00e2\u00df\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3.\3\2\2\2\u00e4\u00e7\7\62\2\2\u00e5\u00e7\5\61\31\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\t\3\2"+
		"\2\u00e9\62\3\2\2\2\u00ea\u00ec\5\65\33\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\64\3\2\2\2\u00ef"+
		"\u00f2\5/\30\2\u00f0\u00f2\7a\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\66\3\2\2\2\u00f3\u00f5\7a\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f78\3\2\2\2\u00f8"+
		"\u00f9\7\62\2\2\u00f9\u00fa\t\4\2\2\u00fa\u00fb\5;\36\2\u00fb:\3\2\2\2"+
		"\u00fc\u0101\5=\37\2\u00fd\u00ff\5? \2\u00fe\u00fd\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\5=\37\2\u0101\u00fe\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102<\3\2\2\2\u0103\u0104\t\5\2\2\u0104>\3\2\2\2\u0105"+
		"\u0107\5A!\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2"+
		"\2\u0108\u0109\3\2\2\2\u0109@\3\2\2\2\u010a\u010d\5=\37\2\u010b\u010d"+
		"\7a\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010dB\3\2\2\2\u010e\u0110"+
		"\7\62\2\2\u010f\u0111\5\67\34\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2"+
		"\2\u0111\u0112\3\2\2\2\u0112\u0113\5E#\2\u0113D\3\2\2\2\u0114\u0119\5"+
		"G$\2\u0115\u0117\5I%\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011a\5G$\2\u0119\u0116\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"F\3\2\2\2\u011b\u011c\t\6\2\2\u011cH\3\2\2\2\u011d\u011f\5K&\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"J\3\2\2\2\u0122\u0125\5G$\2\u0123\u0125\7a\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0123\3\2\2\2\u0125L\3\2\2\2\u0126\u0127\7\62\2\2\u0127\u0128\t\7\2\2"+
		"\u0128\u0129\5O(\2\u0129N\3\2\2\2\u012a\u012f\5Q)\2\u012b\u012d\5S*\2"+
		"\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130"+
		"\5Q)\2\u012f\u012c\3\2\2\2\u012f\u0130\3\2\2\2\u0130P\3\2\2\2\u0131\u0132"+
		"\t\b\2\2\u0132R\3\2\2\2\u0133\u0135\5U+\2\u0134\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137T\3\2\2\2\u0138"+
		"\u013b\5Q)\2\u0139\u013b\7a\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2"+
		"\2\u013bV\3\2\2\2\u013c\u013f\5Y-\2\u013d\u013f\5e\63\2\u013e\u013c\3"+
		"\2\2\2\u013e\u013d\3\2\2\2\u013fX\3\2\2\2\u0140\u0141\5-\27\2\u0141\u0143"+
		"\7\60\2\2\u0142\u0144\5-\27\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0146\3\2\2\2\u0145\u0147\5[.\2\u0146\u0145\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a\5c\62\2\u0149\u0148\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\u015c\3\2\2\2\u014b\u014c\7\60\2\2\u014c\u014e\5"+
		"-\27\2\u014d\u014f\5[.\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0151\3\2\2\2\u0150\u0152\5c\62\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2"+
		"\2\2\u0152\u015c\3\2\2\2\u0153\u0154\5-\27\2\u0154\u0156\5[.\2\u0155\u0157"+
		"\5c\62\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u015c\3\2\2\2\u0158"+
		"\u0159\5-\27\2\u0159\u015a\5c\62\2\u015a\u015c\3\2\2\2\u015b\u0140\3\2"+
		"\2\2\u015b\u014b\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0158\3\2\2\2\u015c"+
		"Z\3\2\2\2\u015d\u015e\5]/\2\u015e\u015f\5_\60\2\u015f\\\3\2\2\2\u0160"+
		"\u0161\t\t\2\2\u0161^\3\2\2\2\u0162\u0164\5a\61\2\u0163\u0162\3\2\2\2"+
		"\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\5-\27\2\u0166`\3"+
		"\2\2\2\u0167\u0168\t\n\2\2\u0168b\3\2\2\2\u0169\u016a\t\13\2\2\u016ad"+
		"\3\2\2\2\u016b\u016c\5g\64\2\u016c\u016e\5i\65\2\u016d\u016f\5c\62\2\u016e"+
		"\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016ff\3\2\2\2\u0170\u0172\59\35\2"+
		"\u0171\u0173\7\60\2\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u017c"+
		"\3\2\2\2\u0174\u0175\7\62\2\2\u0175\u0177\t\4\2\2\u0176\u0178\5;\36\2"+
		"\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a"+
		"\7\60\2\2\u017a\u017c\5;\36\2\u017b\u0170\3\2\2\2\u017b\u0174\3\2\2\2"+
		"\u017ch\3\2\2\2\u017d\u017e\5k\66\2\u017e\u017f\5_\60\2\u017fj\3\2\2\2"+
		"\u0180\u0181\t\f\2\2\u0181l\3\2\2\2\u0182\u0183\7v\2\2\u0183\u0184\7t"+
		"\2\2\u0184\u0185\7w\2\2\u0185\u018c\7g\2\2\u0186\u0187\7h\2\2\u0187\u0188"+
		"\7c\2\2\u0188\u0189\7n\2\2\u0189\u018a\7u\2\2\u018a\u018c\7g\2\2\u018b"+
		"\u0182\3\2\2\2\u018b\u0186\3\2\2\2\u018cn\3\2\2\2\u018d\u018e\7)\2\2\u018e"+
		"\u018f\5q9\2\u018f\u0190\7)\2\2\u0190\u0196\3\2\2\2\u0191\u0192\7)\2\2"+
		"\u0192\u0193\5y=\2\u0193\u0194\7)\2\2\u0194\u0196\3\2\2\2\u0195\u018d"+
		"\3\2\2\2\u0195\u0191\3\2\2\2\u0196p\3\2\2\2\u0197\u0198\n\r\2\2\u0198"+
		"r\3\2\2\2\u0199\u019b\7$\2\2\u019a\u019c\5u;\2\u019b\u019a\3\2\2\2\u019b"+
		"\u019c\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\7$\2\2\u019et\3\2\2\2\u019f"+
		"\u01a1\5w<\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2"+
		"\2\u01a2\u01a3\3\2\2\2\u01a3v\3\2\2\2\u01a4\u01a7\n\16\2\2\u01a5\u01a7"+
		"\5y=\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7x\3\2\2\2\u01a8\u01a9"+
		"\7^\2\2\u01a9\u01ac\t\17\2\2\u01aa\u01ac\5{>\2\u01ab\u01a8\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01acz\3\2\2\2\u01ad\u01ae\7^\2\2\u01ae\u01b9\5G$\2\u01af"+
		"\u01b0\7^\2\2\u01b0\u01b1\5G$\2\u01b1\u01b2\5G$\2\u01b2\u01b9\3\2\2\2"+
		"\u01b3\u01b4\7^\2\2\u01b4\u01b5\5}?\2\u01b5\u01b6\5G$\2\u01b6\u01b7\5"+
		"G$\2\u01b7\u01b9\3\2\2\2\u01b8\u01ad\3\2\2\2\u01b8\u01af\3\2\2\2\u01b8"+
		"\u01b3\3\2\2\2\u01b9|\3\2\2\2\u01ba\u01bb\t\20\2\2\u01bb~\3\2\2\2\u01bc"+
		"\u01c0\5\u0083B\2\u01bd\u01bf\5\u0085C\2\u01be\u01bd\3\2\2\2\u01bf\u01c2"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u0080\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c3\u01c4\7A\2\2\u01c4\u01c8\5\u0083B\2\u01c5\u01c7\5"+
		"\u0085C\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9\u0082\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cc"+
		"\t\21\2\2\u01cc\u0084\3\2\2\2\u01cd\u01ce\t\22\2\2\u01ce\u0086\3\2\2\2"+
		"\u01cf\u01d1\t\23\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\bD\2\2\u01d5"+
		"\u0088\3\2\2\2\u01d6\u01da\7\'\2\2\u01d7\u01d9\n\24\2\2\u01d8\u01d7\3"+
		"\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01df\t\25\2\2\u01de\u01dd\3"+
		"\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\bE\2\2\u01e1\u008a\3\2\2\2\u01e2"+
		"\u01e3\7\61\2\2\u01e3\u01e4\7,\2\2\u01e4\u01e9\3\2\2\2\u01e5\u01e8\5\u008b"+
		"F\2\u01e6\u01e8\13\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8"+
		"\u01eb\3\2\2\2\u01e9\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ef\3\2"+
		"\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\7,\2\2\u01ed\u01f0\7\61\2\2\u01ee"+
		"\u01f0\7\2\2\3\u01ef\u01ec\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f1\3\2"+
		"\2\2\u01f1\u01f2\bF\2\2\u01f2\u008c\3\2\2\2:\2\u00bd\u00c1\u00c5\u00c9"+
		"\u00cd\u00d4\u00d9\u00db\u00df\u00e2\u00e6\u00ed\u00f1\u00f6\u00fe\u0101"+
		"\u0108\u010c\u0110\u0116\u0119\u0120\u0124\u012c\u012f\u0136\u013a\u013e"+
		"\u0143\u0146\u0149\u014e\u0151\u0156\u015b\u0163\u016e\u0172\u0177\u017b"+
		"\u018b\u0195\u019b\u01a2\u01a6\u01ab\u01b8\u01c0\u01c8\u01d2\u01da\u01de"+
		"\u01e7\u01e9\u01ef\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}