// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/tp1/src/main/java/tp1/tp1.g4 by ANTLR 4.8

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
		T__0=1, LA=2, LC=3, PA=4, PC=5, COMA=6, PYCOMA=7, SUMA=8, RESTA=9, MULT=10, 
		DIV=11, MOD=12, AND=13, OR=14, IF=15, CMP=16, VCHAR=17, FOR=18, INT=19, 
		CHAR=20, DOUBLE=21, WHILE=22, VOID=23, RETURN=24, ENTERO=25, DOBLE=26, 
		ID=27, STRING=28, BCOMENTARIO=29, COMENTARIO=30, WS=31, OTRO=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DIGITO", "LETRA", "LA", "LC", "PA", "PC", "COMA", "PYCOMA", 
			"SUMA", "RESTA", "MULT", "DIV", "MOD", "AND", "OR", "IF", "CMP", "VCHAR", 
			"FOR", "INT", "CHAR", "DOUBLE", "WHILE", "VOID", "RETURN", "ENTERO", 
			"DOBLE", "ID", "STRING", "BCOMENTARIO", "COMENTARIO", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "'}'", "'('", "')'", "','", "';'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'&&'", "'||'", "'if'", null, null, "'for'", "'int'", 
			"'char'", "'double'", "'while'", "'void'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LA", "LC", "PA", "PC", "COMA", "PYCOMA", "SUMA", "RESTA", 
			"MULT", "DIV", "MOD", "AND", "OR", "IF", "CMP", "VCHAR", "FOR", "INT", 
			"CHAR", "DOUBLE", "WHILE", "VOID", "RETURN", "ENTERO", "DOBLE", "ID", 
			"STRING", "BCOMENTARIO", "COMENTARIO", "WS", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23v\n\23\3\24\3\24\5\24z\n\24\3\24\5\24}\n\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u00a8"+
		"\n\34\r\34\16\34\u00a9\3\35\3\35\3\35\3\35\5\35\u00b0\n\35\3\36\3\36\5"+
		"\36\u00b4\n\36\3\36\3\36\3\36\7\36\u00b9\n\36\f\36\16\36\u00bc\13\36\3"+
		"\37\3\37\3\37\3\37\7\37\u00c2\n\37\f\37\16\37\u00c5\13\37\3\37\3\37\3"+
		" \3 \3 \3 \7 \u00cd\n \f \16 \u00d0\13 \3 \3 \3 \3 \3 \3!\3!\3!\3!\7!"+
		"\u00db\n!\f!\16!\u00de\13!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\5\u00c3\u00ce"+
		"\u00dc\2$\3\3\5\2\7\2\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r"+
		"\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"\3\2\7\3\2\62;\4\2C\\c|\4\2>>@@\4\2\f\f\17\17\5"+
		"\2\13\f\17\17\"\"\2\u00f6\2\3\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2"+
		"\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2"+
		"\21U\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2\2"+
		"\2\35a\3\2\2\2\37c\3\2\2\2!f\3\2\2\2#i\3\2\2\2%u\3\2\2\2\'w\3\2\2\2)\u0080"+
		"\3\2\2\2+\u0084\3\2\2\2-\u0088\3\2\2\2/\u008d\3\2\2\2\61\u0094\3\2\2\2"+
		"\63\u009a\3\2\2\2\65\u009f\3\2\2\2\67\u00a7\3\2\2\29\u00ab\3\2\2\2;\u00b3"+
		"\3\2\2\2=\u00bd\3\2\2\2?\u00c8\3\2\2\2A\u00d6\3\2\2\2C\u00e3\3\2\2\2E"+
		"\u00e7\3\2\2\2GH\7?\2\2H\4\3\2\2\2IJ\t\2\2\2J\6\3\2\2\2KL\t\3\2\2L\b\3"+
		"\2\2\2MN\7}\2\2N\n\3\2\2\2OP\7\177\2\2P\f\3\2\2\2QR\7*\2\2R\16\3\2\2\2"+
		"ST\7+\2\2T\20\3\2\2\2UV\7.\2\2V\22\3\2\2\2WX\7=\2\2X\24\3\2\2\2YZ\7-\2"+
		"\2Z\26\3\2\2\2[\\\7/\2\2\\\30\3\2\2\2]^\7,\2\2^\32\3\2\2\2_`\7\61\2\2"+
		"`\34\3\2\2\2ab\7\'\2\2b\36\3\2\2\2cd\7(\2\2de\7(\2\2e \3\2\2\2fg\7~\2"+
		"\2gh\7~\2\2h\"\3\2\2\2ij\7k\2\2jk\7h\2\2k$\3\2\2\2lm\7?\2\2mv\7?\2\2n"+
		"v\t\4\2\2op\7@\2\2pv\7?\2\2qr\7>\2\2rv\7?\2\2st\7#\2\2tv\7?\2\2ul\3\2"+
		"\2\2un\3\2\2\2uo\3\2\2\2uq\3\2\2\2us\3\2\2\2v&\3\2\2\2w|\7)\2\2xz\7^\2"+
		"\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{}\5\7\4\2|y\3\2\2\2|}\3\2\2\2}~\3\2\2"+
		"\2~\177\7)\2\2\177(\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7q\2\2\u0082"+
		"\u0083\7t\2\2\u0083*\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7v\2\2\u0087,\3\2\2\2\u0088\u0089\7e\2\2\u0089\u008a\7j\2\2\u008a"+
		"\u008b\7c\2\2\u008b\u008c\7t\2\2\u008c.\3\2\2\2\u008d\u008e\7f\2\2\u008e"+
		"\u008f\7q\2\2\u008f\u0090\7w\2\2\u0090\u0091\7d\2\2\u0091\u0092\7n\2\2"+
		"\u0092\u0093\7g\2\2\u0093\60\3\2\2\2\u0094\u0095\7y\2\2\u0095\u0096\7"+
		"j\2\2\u0096\u0097\7k\2\2\u0097\u0098\7n\2\2\u0098\u0099\7g\2\2\u0099\62"+
		"\3\2\2\2\u009a\u009b\7x\2\2\u009b\u009c\7q\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7f\2\2\u009e\64\3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7v\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7p\2\2"+
		"\u00a5\66\3\2\2\2\u00a6\u00a8\5\5\3\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa8\3\2\2\2\u00ab"+
		"\u00ac\5\67\34\2\u00ac\u00ad\7\60\2\2\u00ad\u00af\5\5\3\2\u00ae\u00b0"+
		"\5\5\3\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0:\3\2\2\2\u00b1"+
		"\u00b4\5\7\4\2\u00b2\u00b4\7a\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2"+
		"\2\2\u00b4\u00ba\3\2\2\2\u00b5\u00b9\5\7\4\2\u00b6\u00b9\5\5\3\2\u00b7"+
		"\u00b9\7a\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"<\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00c3\7$\2\2\u00be\u00bf\7^\2\2\u00bf"+
		"\u00c2\7$\2\2\u00c0\u00c2\13\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2"+
		"\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7>\3\2\2\2\u00c8"+
		"\u00c9\7\61\2\2\u00c9\u00ca\7,\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\13"+
		"\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce"+
		"\u00cc\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7,"+
		"\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b \2\2\u00d5"+
		"@\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00dc\3\2\2"+
		"\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00df\u00e0\t\5\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b!\2\2\u00e2"+
		"B\3\2\2\2\u00e3\u00e4\t\6\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\"\2\2"+
		"\u00e6D\3\2\2\2\u00e7\u00e8\13\2\2\2\u00e8F\3\2\2\2\17\2uy|\u00a9\u00af"+
		"\u00b3\u00b8\u00ba\u00c1\u00c3\u00ce\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}