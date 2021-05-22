// Generated from /Users/gerardoarturomiranda/Documents/Diseño_de_Compiladores/ProyectoFinal_Compiladores/src/Datalog.g4 by ANTLR 4.9.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NOT=7, COUNT=8, AVG=9, 
		SUM=10, MIN=11, MAX=12, INTEGERLITERAL=13, FLOATINGPOINTLITERAL=14, BOOLEANLITERAL=15, 
		CHARACTERLITERAL=16, STRINGLITERAL=17, PREDICATE=18, IDENTIFIER=19, WS=20, 
		COMMENT=21, MULTILINE_COMMENT=22, BIGGERTHAN=23, BIGGEREQUALTHAN=24, SMALLERTHAN=25, 
		SMALLEREQUALTHAN=26, NOTEQUAL=27, EQUAL=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NOT", "COUNT", "AVG", 
			"SUM", "MIN", "MAX", "INTEGERLITERAL", "DECIMALINTEGERLITERAL", "HEXINTEGERLITERAL", 
			"OCTALINTEGERLITERAL", "BINARYINTEGERLITERAL", "INTEGERTYPESUFFIX", "DECIMALNUMERAL", 
			"DIGITS", "DIGIT", "NONZERODIGIT", "DIGITSANDUNDERSCORES", "DIGITORUNDERSCORE", 
			"UNDERSCORES", "HEXNUMERAL", "HEXDIGITS", "HEXDIGIT", "HEXDIGITSANDUNDERSCORES", 
			"HEXDIGITORUNDERSCORE", "OCTALNUMERAL", "OCTALDIGITS", "OCTALDIGIT", 
			"OCTALDIGITSANDUNDERSCORES", "OCTALDIGITORUNDERSCORE", "BINARYNUMERAL", 
			"BINARYDIGITS", "BINARYDIGIT", "BINARYDIGITSANDUNDERSCORES", "BINARYDIGITORUNDERSCORE", 
			"FLOATINGPOINTLITERAL", "DECIMALFLOATINGPOINTLITERAL", "EXPONENTPART", 
			"EXPONENTINDICATOR", "SIGNEDINTEGER", "SIGN", "FLOATTYPESUFFIX", "HEXADECIMALFLOATINGPOINTLITERAL", 
			"HEXSIGNIFICAND", "BINARYEXPONENT", "BINARYEXPONENTINDICATOR", "BOOLEANLITERAL", 
			"CHARACTERLITERAL", "SINGLECHARACTER", "STRINGLITERAL", "STRINGCHARACTERS", 
			"STRINGCHARACTER", "ESCAPESEQUENCE", "OCTALESCAPE", "ZEROTOTHREE", "PREDICATE", 
			"IDENTIFIER", "IDENTIFIERLETTER", "IDENTIFIERLETTERORDIGIT", "WS", "COMMENT", 
			"MULTILINE_COMMENT", "BIGGERTHAN", "BIGGEREQUALTHAN", "SMALLERTHAN", 
			"SMALLEREQUALTHAN", "NOTEQUAL", "EQUAL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "':-'", "'.'", "'?-'", "'not'", "'count'", 
			"'avg'", "'sum'", "'min'", "'max'", null, null, null, null, null, null, 
			null, null, null, null, "'>'", "'>='", "'<'", "'<='", "'<>'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NOT", "COUNT", "AVG", "SUM", 
			"MIN", "MAX", "INTEGERLITERAL", "FLOATINGPOINTLITERAL", "BOOLEANLITERAL", 
			"CHARACTERLITERAL", "STRINGLITERAL", "PREDICATE", "IDENTIFIER", "WS", 
			"COMMENT", "MULTILINE_COMMENT", "BIGGERTHAN", "BIGGEREQUALTHAN", "SMALLERTHAN", 
			"SMALLEREQUALTHAN", "NOTEQUAL", "EQUAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u0206\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c2\n\16"+
		"\3\17\3\17\5\17\u00c6\n\17\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\5\21\u00ce"+
		"\n\21\3\22\3\22\5\22\u00d2\n\22\3\23\3\23\3\24\3\24\3\24\5\24\u00d9\n"+
		"\24\3\24\3\24\3\24\5\24\u00de\n\24\5\24\u00e0\n\24\3\25\3\25\5\25\u00e4"+
		"\n\25\3\25\5\25\u00e7\n\25\3\26\3\26\5\26\u00eb\n\26\3\27\3\27\3\30\6"+
		"\30\u00f0\n\30\r\30\16\30\u00f1\3\31\3\31\5\31\u00f6\n\31\3\32\6\32\u00f9"+
		"\n\32\r\32\16\32\u00fa\3\33\3\33\3\33\3\33\3\34\3\34\5\34\u0103\n\34\3"+
		"\34\5\34\u0106\n\34\3\35\3\35\3\36\6\36\u010b\n\36\r\36\16\36\u010c\3"+
		"\37\3\37\5\37\u0111\n\37\3 \3 \5 \u0115\n \3 \3 \3!\3!\5!\u011b\n!\3!"+
		"\5!\u011e\n!\3\"\3\"\3#\6#\u0123\n#\r#\16#\u0124\3$\3$\5$\u0129\n$\3%"+
		"\3%\3%\3%\3&\3&\5&\u0131\n&\3&\5&\u0134\n&\3\'\3\'\3(\6(\u0139\n(\r(\16"+
		"(\u013a\3)\3)\5)\u013f\n)\3*\3*\5*\u0143\n*\3+\3+\3+\5+\u0148\n+\3+\5"+
		"+\u014b\n+\3+\5+\u014e\n+\3+\3+\3+\5+\u0153\n+\3+\5+\u0156\n+\3+\3+\3"+
		"+\5+\u015b\n+\3+\3+\3+\5+\u0160\n+\3,\3,\3,\3-\3-\3.\5.\u0168\n.\3.\3"+
		".\3/\3/\3\60\3\60\3\61\3\61\3\61\5\61\u0173\n\61\3\62\3\62\5\62\u0177"+
		"\n\62\3\62\3\62\3\62\5\62\u017c\n\62\3\62\3\62\5\62\u0180\n\62\3\63\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0190"+
		"\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u019a\n\66\3\67\3\67"+
		"\38\38\58\u01a0\n8\38\38\39\69\u01a5\n9\r9\169\u01a6\3:\3:\5:\u01ab\n"+
		":\3;\3;\3;\5;\u01b0\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u01bd\n<\3"+
		"=\3=\3>\3>\7>\u01c3\n>\f>\16>\u01c6\13>\3?\3?\3?\7?\u01cb\n?\f?\16?\u01ce"+
		"\13?\3@\3@\3A\3A\3B\6B\u01d5\nB\rB\16B\u01d6\3B\3B\3C\3C\7C\u01dd\nC\f"+
		"C\16C\u01e0\13C\3C\5C\u01e3\nC\3C\3C\3D\3D\3D\3D\3D\7D\u01ec\nD\fD\16"+
		"D\u01ef\13D\3D\3D\3D\5D\u01f4\nD\3D\3D\3E\3E\3F\3F\3F\3G\3G\3H\3H\3H\3"+
		"I\3I\3I\3J\3J\3\u01ed\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\20U\2W\2Y\2[\2]\2_\2a\2c\2"+
		"e\2g\2i\21k\22m\2o\23q\2s\2u\2w\2y\2{\24}\25\177\2\u0081\2\u0083\26\u0085"+
		"\27\u0087\30\u0089\31\u008b\32\u008d\33\u008f\34\u0091\35\u0093\36\3\2"+
		"\26\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2"+
		"GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n"+
		"\2$$))^^ddhhppttvv\3\2\62\65\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\16\17\""+
		"\"\4\2\f\f\17\17\4\3\f\f\17\17\2\u0213\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2S\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2o\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\u0083\3"+
		"\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2"+
		"\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\3\u0095"+
		"\3\2\2\2\5\u0097\3\2\2\2\7\u0099\3\2\2\2\t\u009b\3\2\2\2\13\u009e\3\2"+
		"\2\2\r\u00a0\3\2\2\2\17\u00a3\3\2\2\2\21\u00a7\3\2\2\2\23\u00ad\3\2\2"+
		"\2\25\u00b1\3\2\2\2\27\u00b5\3\2\2\2\31\u00b9\3\2\2\2\33\u00c1\3\2\2\2"+
		"\35\u00c3\3\2\2\2\37\u00c7\3\2\2\2!\u00cb\3\2\2\2#\u00cf\3\2\2\2%\u00d3"+
		"\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00ea\3\2\2\2-\u00ec\3\2\2\2"+
		"/\u00ef\3\2\2\2\61\u00f5\3\2\2\2\63\u00f8\3\2\2\2\65\u00fc\3\2\2\2\67"+
		"\u0100\3\2\2\29\u0107\3\2\2\2;\u010a\3\2\2\2=\u0110\3\2\2\2?\u0112\3\2"+
		"\2\2A\u0118\3\2\2\2C\u011f\3\2\2\2E\u0122\3\2\2\2G\u0128\3\2\2\2I\u012a"+
		"\3\2\2\2K\u012e\3\2\2\2M\u0135\3\2\2\2O\u0138\3\2\2\2Q\u013e\3\2\2\2S"+
		"\u0142\3\2\2\2U\u015f\3\2\2\2W\u0161\3\2\2\2Y\u0164\3\2\2\2[\u0167\3\2"+
		"\2\2]\u016b\3\2\2\2_\u016d\3\2\2\2a\u016f\3\2\2\2c\u017f\3\2\2\2e\u0181"+
		"\3\2\2\2g\u0184\3\2\2\2i\u018f\3\2\2\2k\u0199\3\2\2\2m\u019b\3\2\2\2o"+
		"\u019d\3\2\2\2q\u01a4\3\2\2\2s\u01aa\3\2\2\2u\u01af\3\2\2\2w\u01bc\3\2"+
		"\2\2y\u01be\3\2\2\2{\u01c0\3\2\2\2}\u01c7\3\2\2\2\177\u01cf\3\2\2\2\u0081"+
		"\u01d1\3\2\2\2\u0083\u01d4\3\2\2\2\u0085\u01da\3\2\2\2\u0087\u01e6\3\2"+
		"\2\2\u0089\u01f7\3\2\2\2\u008b\u01f9\3\2\2\2\u008d\u01fc\3\2\2\2\u008f"+
		"\u01fe\3\2\2\2\u0091\u0201\3\2\2\2\u0093\u0204\3\2\2\2\u0095\u0096\7*"+
		"\2\2\u0096\4\3\2\2\2\u0097\u0098\7+\2\2\u0098\6\3\2\2\2\u0099\u009a\7"+
		".\2\2\u009a\b\3\2\2\2\u009b\u009c\7<\2\2\u009c\u009d\7/\2\2\u009d\n\3"+
		"\2\2\2\u009e\u009f\7\60\2\2\u009f\f\3\2\2\2\u00a0\u00a1\7A\2\2\u00a1\u00a2"+
		"\7/\2\2\u00a2\16\3\2\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\20\3\2\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa"+
		"\7w\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7v\2\2\u00ac\22\3\2\2\2\u00ad\u00ae"+
		"\7c\2\2\u00ae\u00af\7x\2\2\u00af\u00b0\7i\2\2\u00b0\24\3\2\2\2\u00b1\u00b2"+
		"\7u\2\2\u00b2\u00b3\7w\2\2\u00b3\u00b4\7o\2\2\u00b4\26\3\2\2\2\u00b5\u00b6"+
		"\7o\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8\30\3\2\2\2\u00b9\u00ba"+
		"\7o\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7z\2\2\u00bc\32\3\2\2\2\u00bd\u00c2"+
		"\5\35\17\2\u00be\u00c2\5\37\20\2\u00bf\u00c2\5!\21\2\u00c0\u00c2\5#\22"+
		"\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\34\3\2\2\2\u00c3\u00c5\5\'\24\2\u00c4\u00c6\5%\23\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\36\3\2\2\2\u00c7\u00c9\5\65\33"+
		"\2\u00c8\u00ca\5%\23\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca "+
		"\3\2\2\2\u00cb\u00cd\5? \2\u00cc\u00ce\5%\23\2\u00cd\u00cc\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\"\3\2\2\2\u00cf\u00d1\5I%\2\u00d0\u00d2\5%\23\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2$\3\2\2\2\u00d3\u00d4\t\2\2\2"+
		"\u00d4&\3\2\2\2\u00d5\u00e0\7\62\2\2\u00d6\u00dd\5-\27\2\u00d7\u00d9\5"+
		")\25\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00de\3\2\2\2\u00da"+
		"\u00db\5\63\32\2\u00db\u00dc\5)\25\2\u00dc\u00de\3\2\2\2\u00dd\u00d8\3"+
		"\2\2\2\u00dd\u00da\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d5\3\2\2\2\u00df"+
		"\u00d6\3\2\2\2\u00e0(\3\2\2\2\u00e1\u00e6\5+\26\2\u00e2\u00e4\5/\30\2"+
		"\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7"+
		"\5+\26\2\u00e6\u00e3\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7*\3\2\2\2\u00e8"+
		"\u00eb\7\62\2\2\u00e9\u00eb\5-\27\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3"+
		"\2\2\2\u00eb,\3\2\2\2\u00ec\u00ed\t\3\2\2\u00ed.\3\2\2\2\u00ee\u00f0\5"+
		"\61\31\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\60\3\2\2\2\u00f3\u00f6\5+\26\2\u00f4\u00f6\7a\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\62\3\2\2\2\u00f7\u00f9"+
		"\7a\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\64\3\2\2\2\u00fc\u00fd\7\62\2\2\u00fd\u00fe\t\4\2"+
		"\2\u00fe\u00ff\5\67\34\2\u00ff\66\3\2\2\2\u0100\u0105\59\35\2\u0101\u0103"+
		"\5;\36\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\59\35\2\u0105\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u01068\3\2\2\2"+
		"\u0107\u0108\t\5\2\2\u0108:\3\2\2\2\u0109\u010b\5=\37\2\u010a\u0109\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"<\3\2\2\2\u010e\u0111\59\35\2\u010f\u0111\7a\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111>\3\2\2\2\u0112\u0114\7\62\2\2\u0113\u0115\5\63\32"+
		"\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\5A!\2\u0117@\3\2\2\2\u0118\u011d\5C\"\2\u0119\u011b\5E#\2\u011a\u0119"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\5C\"\2\u011d"+
		"\u011a\3\2\2\2\u011d\u011e\3\2\2\2\u011eB\3\2\2\2\u011f\u0120\t\6\2\2"+
		"\u0120D\3\2\2\2\u0121\u0123\5G$\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125F\3\2\2\2\u0126\u0129"+
		"\5C\"\2\u0127\u0129\7a\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"H\3\2\2\2\u012a\u012b\7\62\2\2\u012b\u012c\t\7\2\2\u012c\u012d\5K&\2\u012d"+
		"J\3\2\2\2\u012e\u0133\5M\'\2\u012f\u0131\5O(\2\u0130\u012f\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\5M\'\2\u0133\u0130\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134L\3\2\2\2\u0135\u0136\t\b\2\2\u0136N\3\2"+
		"\2\2\u0137\u0139\5Q)\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013bP\3\2\2\2\u013c\u013f\5M\'\2\u013d\u013f"+
		"\7a\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013fR\3\2\2\2\u0140\u0143"+
		"\5U+\2\u0141\u0143\5a\61\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143"+
		"T\3\2\2\2\u0144\u0145\5)\25\2\u0145\u0147\7\60\2\2\u0146\u0148\5)\25\2"+
		"\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u014b"+
		"\5W,\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c"+
		"\u014e\5_\60\2\u014d\u014c\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0160\3\2"+
		"\2\2\u014f\u0150\7\60\2\2\u0150\u0152\5)\25\2\u0151\u0153\5W,\2\u0152"+
		"\u0151\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0156\5_"+
		"\60\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0160\3\2\2\2\u0157"+
		"\u0158\5)\25\2\u0158\u015a\5W,\2\u0159\u015b\5_\60\2\u015a\u0159\3\2\2"+
		"\2\u015a\u015b\3\2\2\2\u015b\u0160\3\2\2\2\u015c\u015d\5)\25\2\u015d\u015e"+
		"\5_\60\2\u015e\u0160\3\2\2\2\u015f\u0144\3\2\2\2\u015f\u014f\3\2\2\2\u015f"+
		"\u0157\3\2\2\2\u015f\u015c\3\2\2\2\u0160V\3\2\2\2\u0161\u0162\5Y-\2\u0162"+
		"\u0163\5[.\2\u0163X\3\2\2\2\u0164\u0165\t\t\2\2\u0165Z\3\2\2\2\u0166\u0168"+
		"\5]/\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\5)\25\2\u016a\\\3\2\2\2\u016b\u016c\t\n\2\2\u016c^\3\2\2\2\u016d"+
		"\u016e\t\13\2\2\u016e`\3\2\2\2\u016f\u0170\5c\62\2\u0170\u0172\5e\63\2"+
		"\u0171\u0173\5_\60\2\u0172\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173b\3"+
		"\2\2\2\u0174\u0176\5\65\33\2\u0175\u0177\7\60\2\2\u0176\u0175\3\2\2\2"+
		"\u0176\u0177\3\2\2\2\u0177\u0180\3\2\2\2\u0178\u0179\7\62\2\2\u0179\u017b"+
		"\t\4\2\2\u017a\u017c\5\67\34\2\u017b\u017a\3\2\2\2\u017b\u017c\3\2\2\2"+
		"\u017c\u017d\3\2\2\2\u017d\u017e\7\60\2\2\u017e\u0180\5\67\34\2\u017f"+
		"\u0174\3\2\2\2\u017f\u0178\3\2\2\2\u0180d\3\2\2\2\u0181\u0182\5g\64\2"+
		"\u0182\u0183\5[.\2\u0183f\3\2\2\2\u0184\u0185\t\f\2\2\u0185h\3\2\2\2\u0186"+
		"\u0187\7v\2\2\u0187\u0188\7t\2\2\u0188\u0189\7w\2\2\u0189\u0190\7g\2\2"+
		"\u018a\u018b\7h\2\2\u018b\u018c\7c\2\2\u018c\u018d\7n\2\2\u018d\u018e"+
		"\7u\2\2\u018e\u0190\7g\2\2\u018f\u0186\3\2\2\2\u018f\u018a\3\2\2\2\u0190"+
		"j\3\2\2\2\u0191\u0192\7)\2\2\u0192\u0193\5m\67\2\u0193\u0194\7)\2\2\u0194"+
		"\u019a\3\2\2\2\u0195\u0196\7)\2\2\u0196\u0197\5u;\2\u0197\u0198\7)\2\2"+
		"\u0198\u019a\3\2\2\2\u0199\u0191\3\2\2\2\u0199\u0195\3\2\2\2\u019al\3"+
		"\2\2\2\u019b\u019c\n\r\2\2\u019cn\3\2\2\2\u019d\u019f\7$\2\2\u019e\u01a0"+
		"\5q9\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a2\7$\2\2\u01a2p\3\2\2\2\u01a3\u01a5\5s:\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7r\3\2\2\2"+
		"\u01a8\u01ab\n\16\2\2\u01a9\u01ab\5u;\2\u01aa\u01a8\3\2\2\2\u01aa\u01a9"+
		"\3\2\2\2\u01abt\3\2\2\2\u01ac\u01ad\7^\2\2\u01ad\u01b0\t\17\2\2\u01ae"+
		"\u01b0\5w<\2\u01af\u01ac\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0v\3\2\2\2\u01b1"+
		"\u01b2\7^\2\2\u01b2\u01bd\5C\"\2\u01b3\u01b4\7^\2\2\u01b4\u01b5\5C\"\2"+
		"\u01b5\u01b6\5C\"\2\u01b6\u01bd\3\2\2\2\u01b7\u01b8\7^\2\2\u01b8\u01b9"+
		"\5y=\2\u01b9\u01ba\5C\"\2\u01ba\u01bb\5C\"\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01b1\3\2\2\2\u01bc\u01b3\3\2\2\2\u01bc\u01b7\3\2\2\2\u01bdx\3\2\2\2"+
		"\u01be\u01bf\t\20\2\2\u01bfz\3\2\2\2\u01c0\u01c4\5\177@\2\u01c1\u01c3"+
		"\5\u0081A\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2"+
		"\2\u01c4\u01c5\3\2\2\2\u01c5|\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8"+
		"\7A\2\2\u01c8\u01cc\5\177@\2\u01c9\u01cb\5\u0081A\2\u01ca\u01c9\3\2\2"+
		"\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd~"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u01d0\t\21\2\2\u01d0\u0080\3\2\2\2"+
		"\u01d1\u01d2\t\22\2\2\u01d2\u0082\3\2\2\2\u01d3\u01d5\t\23\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d9\bB\2\2\u01d9\u0084\3\2\2\2\u01da\u01de\7\'"+
		"\2\2\u01db\u01dd\n\24\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2"+
		"\2\2\u01e1\u01e3\t\25\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4"+
		"\u01e5\bC\2\2\u01e5\u0086\3\2\2\2\u01e6\u01e7\7\61\2\2\u01e7\u01e8\7,"+
		"\2\2\u01e8\u01ed\3\2\2\2\u01e9\u01ec\5\u0087D\2\u01ea\u01ec\13\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01ee\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f3\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0"+
		"\u01f1\7,\2\2\u01f1\u01f4\7\61\2\2\u01f2\u01f4\7\2\2\3\u01f3\u01f0\3\2"+
		"\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\bD\2\2\u01f6"+
		"\u0088\3\2\2\2\u01f7\u01f8\7@\2\2\u01f8\u008a\3\2\2\2\u01f9\u01fa\7@\2"+
		"\2\u01fa\u01fb\7?\2\2\u01fb\u008c\3\2\2\2\u01fc\u01fd\7>\2\2\u01fd\u008e"+
		"\3\2\2\2\u01fe\u01ff\7>\2\2\u01ff\u0200\7?\2\2\u0200\u0090\3\2\2\2\u0201"+
		"\u0202\7>\2\2\u0202\u0203\7@\2\2\u0203\u0092\3\2\2\2\u0204\u0205\7?\2"+
		"\2\u0205\u0094\3\2\2\2:\2\u00c1\u00c5\u00c9\u00cd\u00d1\u00d8\u00dd\u00df"+
		"\u00e3\u00e6\u00ea\u00f1\u00f5\u00fa\u0102\u0105\u010c\u0110\u0114\u011a"+
		"\u011d\u0124\u0128\u0130\u0133\u013a\u013e\u0142\u0147\u014a\u014d\u0152"+
		"\u0155\u015a\u015f\u0167\u0172\u0176\u017b\u017f\u018f\u0199\u019f\u01a6"+
		"\u01aa\u01af\u01bc\u01c4\u01cc\u01d6\u01de\u01e2\u01eb\u01ed\u01f3\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}