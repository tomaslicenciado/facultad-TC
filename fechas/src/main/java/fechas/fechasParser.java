// Generated from /home/tomas/FACULTAD/TC/facultad-TC/fechas/src/main/java/fechas/fechas.g4 by ANTLR 4.8

    package fechas;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fechasParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FEBRERO=1, FECHA30=2, FECHA31=3, HORA1=4, HORA2=5, OTRO=6;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
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

	@Override
	public String getGrammarFileName() { return "fechas.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fechasParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SContext extends ParserRuleContext {
		public Token FEBRERO;
		public Token FECHA30;
		public Token FECHA31;
		public Token HORA1;
		public Token HORA2;
		public TerminalNode FEBRERO() { return getToken(fechasParser.FEBRERO, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode FECHA30() { return getToken(fechasParser.FECHA30, 0); }
		public TerminalNode FECHA31() { return getToken(fechasParser.FECHA31, 0); }
		public TerminalNode HORA1() { return getToken(fechasParser.HORA1, 0); }
		public TerminalNode HORA2() { return getToken(fechasParser.HORA2, 0); }
		public TerminalNode EOF() { return getToken(fechasParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fechasListener ) ((fechasListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fechasListener ) ((fechasListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FEBRERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).FEBRERO = match(FEBRERO);
				System.out.println("FEBRERO ->" + ((SContext)_localctx).FEBRERO.getText() + "<--"); 
				setState(4);
				s();
				}
				break;
			case FECHA30:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).FECHA30 = match(FECHA30);
				System.out.println("FECHA30 ->" + ((SContext)_localctx).FECHA30.getText() + "<--"); 
				setState(7);
				s();
				}
				break;
			case FECHA31:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).FECHA31 = match(FECHA31);
				System.out.println("FECHA31 ->" + ((SContext)_localctx).FECHA31.getText() + "<--"); 
				setState(10);
				s();
				}
				break;
			case HORA1:
				enterOuterAlt(_localctx, 4);
				{
				setState(11);
				((SContext)_localctx).HORA1 = match(HORA1);
				System.out.println("HORA1 ->" + ((SContext)_localctx).HORA1.getText() + "<--"); 
				setState(13);
				s();
				}
				break;
			case HORA2:
				enterOuterAlt(_localctx, 5);
				{
				setState(14);
				((SContext)_localctx).HORA2 = match(HORA2);
				System.out.println("HORA2 ->" + ((SContext)_localctx).HORA2.getText() + "<--"); 
				setState(16);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 6);
				{
				setState(17);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\27\4\2\t\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\25\n"+
		"\2\3\2\2\2\3\2\2\2\2\32\2\24\3\2\2\2\4\5\7\3\2\2\5\6\b\2\1\2\6\25\5\2"+
		"\2\2\7\b\7\4\2\2\b\t\b\2\1\2\t\25\5\2\2\2\n\13\7\5\2\2\13\f\b\2\1\2\f"+
		"\25\5\2\2\2\r\16\7\6\2\2\16\17\b\2\1\2\17\25\5\2\2\2\20\21\7\7\2\2\21"+
		"\22\b\2\1\2\22\25\5\2\2\2\23\25\7\2\2\3\24\4\3\2\2\2\24\7\3\2\2\2\24\n"+
		"\3\2\2\2\24\r\3\2\2\2\24\20\3\2\2\2\24\23\3\2\2\2\25\3\3\2\2\2\3\24";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}