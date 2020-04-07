package compiler.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		AND=25, LT=26, PLUS=27, MINUS=28, TIMES=29, POWER=30, NOT=31, LSB=32, 
		RSB=33, DOTLENGTH=34, LP=35, RP=36, RETURN=37, EQ=38, Final=39, BooleanLiteral=40, 
		IntegerLiteral=41, NullLiteral=42, Identifier=43, Override=44, WS=45, 
		MULTILINE_COMMENT=46, LINE_COMMENT=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "AND", 
			"LT", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", "DOTLENGTH", 
			"LP", "RP", "RETURN", "EQ", "Final", "BooleanLiteral", "IntegerLiteral", 
			"NullLiteral", "Identifier", "Override", "JavaLetter", "JavaLetterOrDigit", 
			"DecimalIntegerLiteral", "IntegertypeSuffix", "DecimalNumeral", "Digits", 
			"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'import'", "';'", "'class'", "'{'", "'public'", "'static'", "'void'", 
			"'main'", "'String'", "'}'", "'extends'", "'implements'", "','", "'interface'", 
			"'boolean'", "'int'", "'private'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'.'", "'new'", "'this'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'**'", 
			"'!'", "'['", "']'", "'.length'", "'('", "')'", "'return'", "'='", "'final'", 
			null, null, "'null'", null, "'@Override'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "AND", "LT", "PLUS", "MINUS", "TIMES", "POWER", "NOT", "LSB", "RSB", 
			"DOTLENGTH", "LP", "RP", "RETURN", "EQ", "Final", "BooleanLiteral", "IntegerLiteral", 
			"NullLiteral", "Identifier", "Override", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u01ad\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\5)\u0141\n)\3*\3*\3+\3+\3+\3+\3+\3,\3,\7,\u014c\n,\f,\16,\u014f"+
		"\13,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60\3\60\5\60\u0161\n"+
		"\60\3\61\3\61\3\62\3\62\3\62\5\62\u0168\n\62\3\62\3\62\3\62\5\62\u016d"+
		"\n\62\5\62\u016f\n\62\3\63\3\63\5\63\u0173\n\63\3\63\5\63\u0176\n\63\3"+
		"\64\3\64\5\64\u017a\n\64\3\65\3\65\3\66\6\66\u017f\n\66\r\66\16\66\u0180"+
		"\3\67\3\67\5\67\u0185\n\67\38\68\u0188\n8\r8\168\u0189\39\69\u018d\n9"+
		"\r9\169\u018e\39\39\3:\3:\3:\3:\7:\u0197\n:\f:\16:\u019a\13:\3:\3:\3:"+
		"\3:\3:\3;\3;\3;\3;\7;\u01a5\n;\f;\16;\u01a8\13;\3;\3;\3;\3;\4\u0198\u01a6"+
		"\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q/s\60u\61\3\2\7\6\2&&C\\aac|\7\2&&\62;C\\aac|\4\2NNnn\3\2\63;\5\2\13"+
		"\f\17\17\"\"\2\u01b0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2q\3\2\2\2\2s\3\2"+
		"\2\2\2u\3\2\2\2\3w\3\2\2\2\5~\3\2\2\2\7\u0080\3\2\2\2\t\u0086\3\2\2\2"+
		"\13\u0088\3\2\2\2\r\u008f\3\2\2\2\17\u0096\3\2\2\2\21\u009b\3\2\2\2\23"+
		"\u00a0\3\2\2\2\25\u00a7\3\2\2\2\27\u00a9\3\2\2\2\31\u00b1\3\2\2\2\33\u00bc"+
		"\3\2\2\2\35\u00be\3\2\2\2\37\u00c8\3\2\2\2!\u00d0\3\2\2\2#\u00d4\3\2\2"+
		"\2%\u00dc\3\2\2\2\'\u00df\3\2\2\2)\u00e4\3\2\2\2+\u00ea\3\2\2\2-\u00fd"+
		"\3\2\2\2/\u00ff\3\2\2\2\61\u0103\3\2\2\2\63\u0108\3\2\2\2\65\u010b\3\2"+
		"\2\2\67\u010d\3\2\2\29\u010f\3\2\2\2;\u0111\3\2\2\2=\u0113\3\2\2\2?\u0116"+
		"\3\2\2\2A\u0118\3\2\2\2C\u011a\3\2\2\2E\u011c\3\2\2\2G\u0124\3\2\2\2I"+
		"\u0126\3\2\2\2K\u0128\3\2\2\2M\u012f\3\2\2\2O\u0131\3\2\2\2Q\u0140\3\2"+
		"\2\2S\u0142\3\2\2\2U\u0144\3\2\2\2W\u0149\3\2\2\2Y\u0150\3\2\2\2[\u015a"+
		"\3\2\2\2]\u015c\3\2\2\2_\u015e\3\2\2\2a\u0162\3\2\2\2c\u016e\3\2\2\2e"+
		"\u0170\3\2\2\2g\u0179\3\2\2\2i\u017b\3\2\2\2k\u017e\3\2\2\2m\u0184\3\2"+
		"\2\2o\u0187\3\2\2\2q\u018c\3\2\2\2s\u0192\3\2\2\2u\u01a0\3\2\2\2wx\7k"+
		"\2\2xy\7o\2\2yz\7r\2\2z{\7q\2\2{|\7t\2\2|}\7v\2\2}\4\3\2\2\2~\177\7=\2"+
		"\2\177\6\3\2\2\2\u0080\u0081\7e\2\2\u0081\u0082\7n\2\2\u0082\u0083\7c"+
		"\2\2\u0083\u0084\7u\2\2\u0084\u0085\7u\2\2\u0085\b\3\2\2\2\u0086\u0087"+
		"\7}\2\2\u0087\n\3\2\2\2\u0088\u0089\7r\2\2\u0089\u008a\7w\2\2\u008a\u008b"+
		"\7d\2\2\u008b\u008c\7n\2\2\u008c\u008d\7k\2\2\u008d\u008e\7e\2\2\u008e"+
		"\f\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7v\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7e\2\2\u0095\16\3\2\2\2\u0096"+
		"\u0097\7x\2\2\u0097\u0098\7q\2\2\u0098\u0099\7k\2\2\u0099\u009a\7f\2\2"+
		"\u009a\20\3\2\2\2\u009b\u009c\7o\2\2\u009c\u009d\7c\2\2\u009d\u009e\7"+
		"k\2\2\u009e\u009f\7p\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2"+
		"\7v\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7p\2\2\u00a5"+
		"\u00a6\7i\2\2\u00a6\24\3\2\2\2\u00a7\u00a8\7\177\2\2\u00a8\26\3\2\2\2"+
		"\u00a9\u00aa\7g\2\2\u00aa\u00ab\7z\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad"+
		"\7g\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7u\2\2\u00b0"+
		"\30\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7o\2\2\u00b3\u00b4\7r\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\u00b9\7p\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7u\2\2\u00bb\32\3\2"+
		"\2\2\u00bc\u00bd\7.\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0"+
		"\7p\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\u00c4\7h\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7e\2\2\u00c6\u00c7\7g\2\2"+
		"\u00c7\36\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7"+
		"q\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf \3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3"+
		"\7v\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7"+
		"\7k\2\2\u00d7\u00d8\7x\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7v\2\2\u00da"+
		"\u00db\7g\2\2\u00db$\3\2\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7h\2\2\u00de"+
		"&\3\2\2\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3(\3\2\2\2\u00e4\u00e5\7y\2\2\u00e5\u00e6\7j\2\2\u00e6"+
		"\u00e7\7k\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7g\2\2\u00e9*\3\2\2\2\u00ea"+
		"\u00eb\7U\2\2\u00eb\u00ec\7{\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7v\2\2"+
		"\u00ee\u00ef\7g\2\2\u00ef\u00f0\7o\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2"+
		"\7q\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7v\2\2\u00f4\u00f5\7\60\2\2\u00f5"+
		"\u00f6\7r\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9\7p\2\2"+
		"\u00f9\u00fa\7v\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7p\2\2\u00fc,\3\2\2"+
		"\2\u00fd\u00fe\7\60\2\2\u00fe.\3\2\2\2\u00ff\u0100\7p\2\2\u0100\u0101"+
		"\7g\2\2\u0101\u0102\7y\2\2\u0102\60\3\2\2\2\u0103\u0104\7v\2\2\u0104\u0105"+
		"\7j\2\2\u0105\u0106\7k\2\2\u0106\u0107\7u\2\2\u0107\62\3\2\2\2\u0108\u0109"+
		"\7(\2\2\u0109\u010a\7(\2\2\u010a\64\3\2\2\2\u010b\u010c\7>\2\2\u010c\66"+
		"\3\2\2\2\u010d\u010e\7-\2\2\u010e8\3\2\2\2\u010f\u0110\7/\2\2\u0110:\3"+
		"\2\2\2\u0111\u0112\7,\2\2\u0112<\3\2\2\2\u0113\u0114\7,\2\2\u0114\u0115"+
		"\7,\2\2\u0115>\3\2\2\2\u0116\u0117\7#\2\2\u0117@\3\2\2\2\u0118\u0119\7"+
		"]\2\2\u0119B\3\2\2\2\u011a\u011b\7_\2\2\u011bD\3\2\2\2\u011c\u011d\7\60"+
		"\2\2\u011d\u011e\7n\2\2\u011e\u011f\7g\2\2\u011f\u0120\7p\2\2\u0120\u0121"+
		"\7i\2\2\u0121\u0122\7v\2\2\u0122\u0123\7j\2\2\u0123F\3\2\2\2\u0124\u0125"+
		"\7*\2\2\u0125H\3\2\2\2\u0126\u0127\7+\2\2\u0127J\3\2\2\2\u0128\u0129\7"+
		"t\2\2\u0129\u012a\7g\2\2\u012a\u012b\7v\2\2\u012b\u012c\7w\2\2\u012c\u012d"+
		"\7t\2\2\u012d\u012e\7p\2\2\u012eL\3\2\2\2\u012f\u0130\7?\2\2\u0130N\3"+
		"\2\2\2\u0131\u0132\7h\2\2\u0132\u0133\7k\2\2\u0133\u0134\7p\2\2\u0134"+
		"\u0135\7c\2\2\u0135\u0136\7n\2\2\u0136P\3\2\2\2\u0137\u0138\7v\2\2\u0138"+
		"\u0139\7t\2\2\u0139\u013a\7w\2\2\u013a\u0141\7g\2\2\u013b\u013c\7h\2\2"+
		"\u013c\u013d\7c\2\2\u013d\u013e\7n\2\2\u013e\u013f\7u\2\2\u013f\u0141"+
		"\7g\2\2\u0140\u0137\3\2\2\2\u0140\u013b\3\2\2\2\u0141R\3\2\2\2\u0142\u0143"+
		"\5_\60\2\u0143T\3\2\2\2\u0144\u0145\7p\2\2\u0145\u0146\7w\2\2\u0146\u0147"+
		"\7n\2\2\u0147\u0148\7n\2\2\u0148V\3\2\2\2\u0149\u014d\5[.\2\u014a\u014c"+
		"\5]/\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014eX\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7B\2\2\u0151"+
		"\u0152\7Q\2\2\u0152\u0153\7x\2\2\u0153\u0154\7g\2\2\u0154\u0155\7t\2\2"+
		"\u0155\u0156\7t\2\2\u0156\u0157\7k\2\2\u0157\u0158\7f\2\2\u0158\u0159"+
		"\7g\2\2\u0159Z\3\2\2\2\u015a\u015b\t\2\2\2\u015b\\\3\2\2\2\u015c\u015d"+
		"\t\3\2\2\u015d^\3\2\2\2\u015e\u0160\5c\62\2\u015f\u0161\5a\61\2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161`\3\2\2\2\u0162\u0163\t\4\2\2"+
		"\u0163b\3\2\2\2\u0164\u016f\7\62\2\2\u0165\u016c\5i\65\2\u0166\u0168\5"+
		"e\63\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016d\3\2\2\2\u0169"+
		"\u016a\5o8\2\u016a\u016b\5e\63\2\u016b\u016d\3\2\2\2\u016c\u0167\3\2\2"+
		"\2\u016c\u0169\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u0164\3\2\2\2\u016e\u0165"+
		"\3\2\2\2\u016fd\3\2\2\2\u0170\u0175\5g\64\2\u0171\u0173\5k\66\2\u0172"+
		"\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\5g"+
		"\64\2\u0175\u0172\3\2\2\2\u0175\u0176\3\2\2\2\u0176f\3\2\2\2\u0177\u017a"+
		"\7\62\2\2\u0178\u017a\5i\65\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2\2\2"+
		"\u017ah\3\2\2\2\u017b\u017c\t\5\2\2\u017cj\3\2\2\2\u017d\u017f\5m\67\2"+
		"\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181l\3\2\2\2\u0182\u0185\5g\64\2\u0183\u0185\7a\2\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0183\3\2\2\2\u0185n\3\2\2\2\u0186\u0188\7a\2\2\u0187\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"p\3\2\2\2\u018b\u018d\t\6\2\2\u018c\u018b\3\2\2\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\b9\2\2\u0191r\3\2\2\2\u0192\u0193\7\61\2\2\u0193\u0194\7,\2\2\u0194\u0198"+
		"\3\2\2\2\u0195\u0197\13\2\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2"+
		"\u0198\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019b\u019c\7,\2\2\u019c\u019d\7\61\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\b:\2\2\u019ft\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1\u01a2\7\61\2\2"+
		"\u01a2\u01a6\3\2\2\2\u01a3\u01a5\13\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u01a6\3\2\2\2\u01a9\u01aa\7\f\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\b;"+
		"\2\2\u01acv\3\2\2\2\22\2\u0140\u014d\u0160\u0167\u016c\u016e\u0172\u0175"+
		"\u0179\u0180\u0184\u0189\u018e\u0198\u01a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}