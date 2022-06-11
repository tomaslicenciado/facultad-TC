// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/programa/src/main/java/programa/programa.g4 by ANTLR 4.9.2

    package programa;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LA=3, LC=4, PA=5, PC=6, COMA=7, PYCOMA=8, INT=9, DOUBLE=10, 
		NINT=11, NDOUBLE=12, CMP=13, ID=14, WS=15, OTRO=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "DIGITO", "LETRA", "LA", "LC", "PA", "PC", "COMA", "PYCOMA", 
			"INT", "DOUBLE", "NINT", "NDOUBLE", "CMP", "ID", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'while'", "'{'", "'}'", "'('", "')'", "','", "';'", "'int'", 
			"'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "LA", "LC", "PA", "PC", "COMA", "PYCOMA", "INT", "DOUBLE", 
			"NINT", "NDOUBLE", "CMP", "ID", "WS", "OTRO"
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


	public programaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "programa.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\6\16L\n\16\r\16\16\16M\3\17\3\17\3\17\3\17\5\17T\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20_\n\20\3\21\3\21\5\21"+
		"c\n\21\3\21\3\21\3\21\7\21h\n\21\f\21\16\21k\13\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\2\2\24\3\3\5\4\7\2\t\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31"+
		"\f\33\r\35\16\37\17!\20#\21%\22\3\2\6\3\2\62;\4\2C\\c|\4\2>>@@\5\2\13"+
		"\f\17\17\"\"\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r"+
		"\65\3\2\2\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2"+
		"\2\2\31C\3\2\2\2\33K\3\2\2\2\35O\3\2\2\2\37^\3\2\2\2!b\3\2\2\2#l\3\2\2"+
		"\2%p\3\2\2\2\'(\7?\2\2(\4\3\2\2\2)*\7y\2\2*+\7j\2\2+,\7k\2\2,-\7n\2\2"+
		"-.\7g\2\2.\6\3\2\2\2/\60\t\2\2\2\60\b\3\2\2\2\61\62\t\3\2\2\62\n\3\2\2"+
		"\2\63\64\7}\2\2\64\f\3\2\2\2\65\66\7\177\2\2\66\16\3\2\2\2\678\7*\2\2"+
		"8\20\3\2\2\29:\7+\2\2:\22\3\2\2\2;<\7.\2\2<\24\3\2\2\2=>\7=\2\2>\26\3"+
		"\2\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2B\30\3\2\2\2CD\7f\2\2DE\7q\2\2EF\7w\2"+
		"\2FG\7d\2\2GH\7n\2\2HI\7g\2\2I\32\3\2\2\2JL\5\7\4\2KJ\3\2\2\2LM\3\2\2"+
		"\2MK\3\2\2\2MN\3\2\2\2N\34\3\2\2\2OP\5\33\16\2PQ\7\60\2\2QS\5\7\4\2RT"+
		"\5\7\4\2SR\3\2\2\2ST\3\2\2\2T\36\3\2\2\2UV\7?\2\2V_\7?\2\2W_\t\4\2\2X"+
		"Y\7@\2\2Y_\7?\2\2Z[\7>\2\2[_\7?\2\2\\]\7#\2\2]_\7?\2\2^U\3\2\2\2^W\3\2"+
		"\2\2^X\3\2\2\2^Z\3\2\2\2^\\\3\2\2\2_ \3\2\2\2`c\5\t\5\2ac\7a\2\2b`\3\2"+
		"\2\2ba\3\2\2\2ci\3\2\2\2dh\5\t\5\2eh\5\7\4\2fh\7a\2\2gd\3\2\2\2ge\3\2"+
		"\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\"\3\2\2\2ki\3\2\2\2lm\t"+
		"\5\2\2mn\3\2\2\2no\b\22\2\2o$\3\2\2\2pq\13\2\2\2q&\3\2\2\2\t\2MS^bgi\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}