// Generated from /media/tomas/Datos/FACULTAD/5 - TC/programa/src/main/java/programa/programa.g4 by ANTLR 4.8

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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, LA=4, LC=5, PA=6, PC=7, INT=8, DOUBLE=9, COMP=10, 
		ID=11, ASIGNACION=12, TIPO=13, WS=14, OTRO=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "DIGITO", "LETRA", "LA", "LC", "PA", "PC", "INT", 
			"DOUBLE", "COMP", "ID", "ASIGNACION", "TIPO", "WS", "OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'while'", "'{'", "'}'", "'('", "')'", "'int'", "'double'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "LA", "LC", "PA", "PC", "INT", "DOUBLE", "COMP", 
			"ID", "ASIGNACION", "TIPO", "WS", "OTRO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21m\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rP\n\r\3\16\3\16\5\16T\n\16\3\16\3"+
		"\16\3\16\7\16Y\n\16\f\16\16\16\\\13\16\3\17\3\17\3\17\3\17\5\17b\n\17"+
		"\3\20\3\20\5\20f\n\20\3\21\3\21\3\21\3\21\3\22\3\22\2\2\23\3\3\5\4\7\5"+
		"\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21"+
		"\3\2\6\3\2\62;\4\2C\\c|\4\2>>@@\5\2\13\f\17\17\"\"\2t\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t"+
		"/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3"+
		"\2\2\2\25;\3\2\2\2\27?\3\2\2\2\31O\3\2\2\2\33S\3\2\2\2\35]\3\2\2\2\37"+
		"e\3\2\2\2!g\3\2\2\2#k\3\2\2\2%&\7=\2\2&\4\3\2\2\2\'(\7.\2\2(\6\3\2\2\2"+
		")*\7y\2\2*+\7j\2\2+,\7k\2\2,-\7n\2\2-.\7g\2\2.\b\3\2\2\2/\60\t\2\2\2\60"+
		"\n\3\2\2\2\61\62\t\3\2\2\62\f\3\2\2\2\63\64\7}\2\2\64\16\3\2\2\2\65\66"+
		"\7\177\2\2\66\20\3\2\2\2\678\7*\2\28\22\3\2\2\29:\7+\2\2:\24\3\2\2\2;"+
		"<\7k\2\2<=\7p\2\2=>\7v\2\2>\26\3\2\2\2?@\7f\2\2@A\7q\2\2AB\7w\2\2BC\7"+
		"d\2\2CD\7n\2\2DE\7g\2\2E\30\3\2\2\2FG\7?\2\2GP\7?\2\2HP\t\4\2\2IJ\7@\2"+
		"\2JP\7?\2\2KL\7>\2\2LP\7?\2\2MN\7#\2\2NP\7?\2\2OF\3\2\2\2OH\3\2\2\2OI"+
		"\3\2\2\2OK\3\2\2\2OM\3\2\2\2P\32\3\2\2\2QT\5\13\6\2RT\7a\2\2SQ\3\2\2\2"+
		"SR\3\2\2\2TZ\3\2\2\2UY\5\13\6\2VY\5\t\5\2WY\7a\2\2XU\3\2\2\2XV\3\2\2\2"+
		"XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\34\3\2\2\2\\Z\3\2\2\2]^\5\33"+
		"\16\2^a\7?\2\2_b\5\33\16\2`b\5\t\5\2a_\3\2\2\2a`\3\2\2\2b\36\3\2\2\2c"+
		"f\5\25\13\2df\5\27\f\2ec\3\2\2\2ed\3\2\2\2f \3\2\2\2gh\t\5\2\2hi\3\2\2"+
		"\2ij\b\21\2\2j\"\3\2\2\2kl\13\2\2\2l$\3\2\2\2\t\2OSXZae\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}