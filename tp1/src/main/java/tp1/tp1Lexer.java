// Generated from /home/tomas/FACULTAD/TC/facultad-TC/tp1/src/main/java/tp1/tp1.g4 by ANTLR 4.8

    package tp1;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tp1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LA=3, LC=4, PA=5, PC=6, CA=7, CC=8, COMA=9, PYCOMA=10, 
		SUMA=11, RESTA=12, MULT=13, DIV=14, MOD=15, AND=16, OR=17, IF=18, CMP=19, 
		VCHAR=20, FOR=21, INT=22, CHAR=23, ELSE=24, DOUBLE=25, WHILE=26, VOID=27, 
		STRING=28, RETURN=29, ENTERO=30, DOBLE=31, ID=32, VSTRING=33, BCOMENTARIO=34, 
		COMENTARIO=35, PRAGMA=36, WS=37, OTRO=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DIGITO", "LETRA", "LA", "LC", "PA", "PC", "CA", "CC", 
			"COMA", "PYCOMA", "SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", 
			"IF", "CMP", "VCHAR", "FOR", "INT", "CHAR", "ELSE", "DOUBLE", "WHILE", 
			"VOID", "STRING", "RETURN", "ENTERO", "DOBLE", "ID", "VSTRING", "BCOMENTARIO", 
			"COMENTARIO", "PRAGMA", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'!'", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'if'", null, 
			null, "'for'", "'int'", "'char'", "'else'", "'double'", "'while'", "'void'", 
			"'string'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LA", "LC", "PA", "PC", "CA", "CC", "COMA", "PYCOMA", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", "IF", "CMP", "VCHAR", 
			"FOR", "INT", "CHAR", "ELSE", "DOUBLE", "WHILE", "VOID", "STRING", "RETURN", 
			"ENTERO", "DOBLE", "ID", "VSTRING", "BCOMENTARIO", "COMENTARIO", "PRAGMA", 
			"WS", "OTRO"
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


	public tp1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tp1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0112\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0088\n\26\3\27\3\27\5\27\u008c\n\27\3\27\5\27\u008f"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\6!\u00c6\n!\r!\16!\u00c7"+
		"\3\"\3\"\3\"\3\"\5\"\u00ce\n\"\3#\3#\5#\u00d2\n#\3#\3#\3#\7#\u00d7\n#"+
		"\f#\16#\u00da\13#\3$\3$\3$\3$\7$\u00e0\n$\f$\16$\u00e3\13$\3$\3$\3%\3"+
		"%\3%\3%\7%\u00eb\n%\f%\16%\u00ee\13%\3%\3%\3%\3%\3%\3&\3&\3&\3&\7&\u00f9"+
		"\n&\f&\16&\u00fc\13&\3&\3&\3&\3&\3\'\3\'\7\'\u0104\n\'\f\'\16\'\u0107"+
		"\13\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\6\u00e1\u00ec\u00fa\u0105\2*\3"+
		"\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17"+
		"!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36"+
		"?\37A C!E\"G#I$K%M&O\'Q(\3\2\7\3\2\62;\4\2C\\c|\4\2>>@@\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2"+
		"\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2"+
		"\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2"+
		"\2\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'x\3\2\2\2){"+
		"\3\2\2\2+\u0087\3\2\2\2-\u0089\3\2\2\2/\u0092\3\2\2\2\61\u0096\3\2\2\2"+
		"\63\u009a\3\2\2\2\65\u009f\3\2\2\2\67\u00a4\3\2\2\29\u00ab\3\2\2\2;\u00b1"+
		"\3\2\2\2=\u00b6\3\2\2\2?\u00bd\3\2\2\2A\u00c5\3\2\2\2C\u00c9\3\2\2\2E"+
		"\u00d1\3\2\2\2G\u00db\3\2\2\2I\u00e6\3\2\2\2K\u00f4\3\2\2\2M\u0101\3\2"+
		"\2\2O\u010c\3\2\2\2Q\u0110\3\2\2\2ST\7?\2\2T\4\3\2\2\2UV\7#\2\2V\6\3\2"+
		"\2\2WX\t\2\2\2X\b\3\2\2\2YZ\t\3\2\2Z\n\3\2\2\2[\\\7}\2\2\\\f\3\2\2\2]"+
		"^\7\177\2\2^\16\3\2\2\2_`\7*\2\2`\20\3\2\2\2ab\7+\2\2b\22\3\2\2\2cd\7"+
		"]\2\2d\24\3\2\2\2ef\7_\2\2f\26\3\2\2\2gh\7.\2\2h\30\3\2\2\2ij\7=\2\2j"+
		"\32\3\2\2\2kl\7-\2\2l\34\3\2\2\2mn\7/\2\2n\36\3\2\2\2op\7,\2\2p \3\2\2"+
		"\2qr\7\61\2\2r\"\3\2\2\2st\7\'\2\2t$\3\2\2\2uv\7(\2\2vw\7(\2\2w&\3\2\2"+
		"\2xy\7~\2\2yz\7~\2\2z(\3\2\2\2{|\7k\2\2|}\7h\2\2}*\3\2\2\2~\177\7?\2\2"+
		"\177\u0088\7?\2\2\u0080\u0088\t\4\2\2\u0081\u0082\7@\2\2\u0082\u0088\7"+
		"?\2\2\u0083\u0084\7>\2\2\u0084\u0088\7?\2\2\u0085\u0086\7#\2\2\u0086\u0088"+
		"\7?\2\2\u0087~\3\2\2\2\u0087\u0080\3\2\2\2\u0087\u0081\3\2\2\2\u0087\u0083"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0088,\3\2\2\2\u0089\u008e\7)\2\2\u008a\u008c"+
		"\7^\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\5\t\5\2\u008e\u008b\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0091\7)\2\2\u0091.\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7t\2\2\u0095\60\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7v\2\2\u0099\62\3\2\2\2\u009a\u009b\7e\2\2\u009b\u009c"+
		"\7j\2\2\u009c\u009d\7c\2\2\u009d\u009e\7t\2\2\u009e\64\3\2\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"\66\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7w\2\2\u00a7"+
		"\u00a8\7d\2\2\u00a8\u00a9\7n\2\2\u00a9\u00aa\7g\2\2\u00aa8\3\2\2\2\u00ab"+
		"\u00ac\7y\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2"+
		"\u00af\u00b0\7g\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7q\2"+
		"\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7f\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7"+
		"u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb"+
		"\7p\2\2\u00bb\u00bc\7i\2\2\u00bc>\3\2\2\2\u00bd\u00be\7t\2\2\u00be\u00bf"+
		"\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3@\3\2\2\2\u00c4\u00c6\5\7\4\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8B\3\2\2\2"+
		"\u00c9\u00ca\5A!\2\u00ca\u00cb\7\60\2\2\u00cb\u00cd\5\7\4\2\u00cc\u00ce"+
		"\5\7\4\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ceD\3\2\2\2\u00cf"+
		"\u00d2\5\t\5\2\u00d0\u00d2\7a\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\u00d8\3\2\2\2\u00d3\u00d7\5\t\5\2\u00d4\u00d7\5\7\4\2\u00d5"+
		"\u00d7\7a\2\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2"+
		"\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"F\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e1\7$\2\2\u00dc\u00dd\7^\2\2\u00dd"+
		"\u00e0\7$\2\2\u00de\u00e0\13\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00de\3\2"+
		"\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5H\3\2\2\2\u00e6"+
		"\u00e7\7\61\2\2\u00e7\u00e8\7,\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\13"+
		"\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7,"+
		"\2\2\u00f0\u00f1\7\61\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b%\2\2\u00f3"+
		"J\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00fa\3\2\2"+
		"\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b&\2\2\u0100"+
		"L\3\2\2\2\u0101\u0105\7%\2\2\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2"+
		"\u0104\u0107\3\2\2\2\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\t\5\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\b\'\2\2\u010bN\3\2\2\2\u010c\u010d\t\6\2\2\u010d\u010e\3\2\2\2"+
		"\u010e\u010f\b(\2\2\u010fP\3\2\2\2\u0110\u0111\13\2\2\2\u0111R\3\2\2\2"+
		"\20\2\u0087\u008b\u008e\u00c7\u00cd\u00d1\u00d6\u00d8\u00df\u00e1\u00ec"+
		"\u00fa\u0105\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}