// Generated from /home/tomas/FACULTAD/TC/facultad-TC/fechas/src/main/java/fechas/fechas.g4 by ANTLR 4.8

    package fechas;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fechasLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FEBRERO=1, FECHA30=2, FECHA31=3, HORA1=4, HORA2=5, OTRO=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "ANIO", "FEBRERO", "FECHA30", "FECHA31", "HORA1", "HORA2", 
			"OTRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FEBRERO", "FECHA30", "FECHA31", "HORA1", "HORA2", "OTRO"
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


	public fechasLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "fechas.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bt\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\6\3\6\3\6\5\6F\n\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\5\7O\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b_\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t\2\2\n\3\2\5\2\7\3\t\4\13\5\r\6\17"+
		"\7\21\b\3\2\16\3\2\62;\3\2\63\65\3\2\63;\3\2\62:\3\2\63\64\4\2\66\668"+
		"8\3\2\62\63\4\2\62\62\64\64\3\2:;\3\2\62\64\3\2\62\67\3\2\65\67\2}\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\3\23\3\2\2\2\5\25\3\2\2\2\7 \3\2\2\2\t/\3\2\2\2\13>\3\2\2\2\rN\3\2"+
		"\2\2\17n\3\2\2\2\21p\3\2\2\2\23\24\t\2\2\2\24\4\3\2\2\2\25\26\t\3\2\2"+
		"\26\27\5\3\2\2\27\30\5\3\2\2\30\31\5\3\2\2\31\6\3\2\2\2\32\33\7\62\2\2"+
		"\33!\t\4\2\2\34\35\7\63\2\2\35!\5\3\2\2\36\37\7\64\2\2\37!\t\5\2\2 \32"+
		"\3\2\2\2 \34\3\2\2\2 \36\3\2\2\2!\"\3\2\2\2\"#\7\61\2\2#$\7\62\2\2$%\7"+
		"\64\2\2%&\7\61\2\2&\'\3\2\2\2\'(\5\5\3\2(\b\3\2\2\2)*\7\62\2\2*\60\t\4"+
		"\2\2+,\t\6\2\2,\60\5\3\2\2-.\7\65\2\2.\60\7\62\2\2/)\3\2\2\2/+\3\2\2\2"+
		"/-\3\2\2\2\60\61\3\2\2\2\61\62\7\61\2\2\62\63\7\62\2\2\63\64\t\7\2\2\64"+
		"\65\3\2\2\2\65\66\7\61\2\2\66\67\5\5\3\2\67\n\3\2\2\289\7\62\2\29?\t\4"+
		"\2\2:;\t\6\2\2;?\5\3\2\2<=\7\65\2\2=?\t\b\2\2>8\3\2\2\2>:\3\2\2\2><\3"+
		"\2\2\2?@\3\2\2\2@E\7\61\2\2AB\7\62\2\2BF\7:\2\2CD\7\63\2\2DF\t\t\2\2E"+
		"A\3\2\2\2EC\3\2\2\2FG\3\2\2\2GH\7\61\2\2HI\5\5\3\2I\f\3\2\2\2JK\7\62\2"+
		"\2KO\t\n\2\2LM\7\63\2\2MO\t\13\2\2NJ\3\2\2\2NL\3\2\2\2OP\3\2\2\2PQ\7<"+
		"\2\2QR\t\f\2\2RS\5\3\2\2S\16\3\2\2\2TU\7\63\2\2UV\7:\2\2VW\7<\2\2WX\3"+
		"\2\2\2XY\t\r\2\2Yo\5\3\2\2Z[\7\63\2\2[_\7;\2\2\\]\7\64\2\2]_\7\62\2\2"+
		"^Z\3\2\2\2^\\\3\2\2\2_`\3\2\2\2`a\7<\2\2ab\t\f\2\2bo\5\3\2\2cd\7\64\2"+
		"\2de\7\63\2\2ef\7<\2\2fg\3\2\2\2gh\t\13\2\2ho\5\3\2\2ij\7\64\2\2jk\7\63"+
		"\2\2kl\7<\2\2lm\7\65\2\2mo\7\62\2\2nT\3\2\2\2n^\3\2\2\2nc\3\2\2\2ni\3"+
		"\2\2\2o\20\3\2\2\2pq\13\2\2\2qr\3\2\2\2rs\b\t\2\2s\22\3\2\2\2\n\2 />E"+
		"N^n\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}