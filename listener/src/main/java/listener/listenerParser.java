// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/listener/src/main/java/listener/listener.g4 by ANTLR 4.9.2

    package listener;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class listenerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, LA=3, LC=4, PA=5, PC=6, CA=7, CC=8, COMA=9, PYCOMA=10, 
		SUMA=11, RESTA=12, MULT=13, DIV=14, MOD=15, AND=16, OR=17, IF=18, CMP=19, 
		VCHAR=20, FOR=21, INT=22, CHAR=23, ELSE=24, DOUBLE=25, WHILE=26, VOID=27, 
		STRING=28, RETURN=29, ENTERO=30, DOBLE=31, ID=32, VSTRING=33, BCOMENTARIO=34, 
		COMENTARIO=35, PRAGMA=36, WS=37, OTRO=38;
	public static final int
		RULE_si = 0, RULE_opciones = 1, RULE_funcion = 2, RULE_dec_func = 3, RULE_parametros = 4, 
		RULE_parametro = 5, RULE_tipo = 6, RULE_t_simple = 7, RULE_puntero = 8, 
		RULE_p_lista = 9, RULE_def_func = 10, RULE_params = 11, RULE_defp_lista = 12, 
		RULE_bloque = 13, RULE_instrucciones = 14, RULE_instruccion = 15, RULE_inst_simple = 16, 
		RULE_declaraciones = 17, RULE_declaracion = 18, RULE_d_lista = 19, RULE_asignacion = 20, 
		RULE_opal = 21, RULE_negacion = 22, RULE_logic = 23, RULE_relacional = 24, 
		RULE_rel = 25, RULE_opar = 26, RULE_term = 27, RULE_mult = 28, RULE_ovalor = 29, 
		RULE_valor = 30, RULE_numero = 31, RULE_llam_func = 32, RULE_argumentos = 33, 
		RULE_argumento = 34, RULE_a_lista = 35, RULE_ireturn = 36, RULE_est_control = 37, 
		RULE_iwhile = 38, RULE_acciones = 39, RULE_iif = 40, RULE_ielse = 41, 
		RULE_ifor = 42, RULE_comienzos_f = 43, RULE_opcion = 44, RULE_cf_lista = 45, 
		RULE_operacion = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"si", "opciones", "funcion", "dec_func", "parametros", "parametro", "tipo", 
			"t_simple", "puntero", "p_lista", "def_func", "params", "defp_lista", 
			"bloque", "instrucciones", "instruccion", "inst_simple", "declaraciones", 
			"declaracion", "d_lista", "asignacion", "opal", "negacion", "logic", 
			"relacional", "rel", "opar", "term", "mult", "ovalor", "valor", "numero", 
			"llam_func", "argumentos", "argumento", "a_lista", "ireturn", "est_control", 
			"iwhile", "acciones", "iif", "ielse", "ifor", "comienzos_f", "opcion", 
			"cf_lista", "operacion"
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

	@Override
	public String getGrammarFileName() { return "listener.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public listenerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SiContext extends ParserRuleContext {
		public OpcionesContext opciones() {
			return getRuleContext(OpcionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(listenerParser.EOF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			opciones();
			setState(95);
			match(EOF);
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

	public static class OpcionesContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public OpcionesContext opciones() {
			return getRuleContext(OpcionesContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(listenerParser.PYCOMA, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public OpcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterOpciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitOpciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitOpciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionesContext opciones() throws RecognitionException {
		OpcionesContext _localctx = new OpcionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_opciones);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				funcion();
				setState(98);
				opciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				asignacion();
				setState(101);
				match(PYCOMA);
				setState(102);
				opciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				declaraciones();
				setState(105);
				match(PYCOMA);
				setState(106);
				opciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class FuncionContext extends ParserRuleContext {
		public Dec_funcContext dec_func() {
			return getRuleContext(Dec_funcContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(listenerParser.PYCOMA, 0); }
		public Def_funcContext def_func() {
			return getRuleContext(Def_funcContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				dec_func();
				setState(112);
				match(PYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				def_func();
				}
				break;
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

	public static class Dec_funcContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public Dec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterDec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitDec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitDec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_funcContext dec_func() throws RecognitionException {
		Dec_funcContext _localctx = new Dec_funcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			tipo();
			setState(118);
			match(ID);
			setState(119);
			match(PA);
			setState(120);
			parametros();
			setState(121);
			match(PC);
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

	public static class ParametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public P_listaContext p_lista() {
			return getRuleContext(P_listaContext.class,0);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			parametro();
			setState(124);
			p_lista();
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

	public static class ParametroContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				tipo();
				setState(128);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class TipoContext extends ParserRuleContext {
		public T_simpleContext t_simple() {
			return getRuleContext(T_simpleContext.class,0);
		}
		public PunteroContext puntero() {
			return getRuleContext(PunteroContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				t_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				puntero();
				}
				break;
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

	public static class T_simpleContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(listenerParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(listenerParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(listenerParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(listenerParser.VOID, 0); }
		public T_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterT_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitT_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitT_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_simpleContext t_simple() throws RecognitionException {
		T_simpleContext _localctx = new T_simpleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_t_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << DOUBLE) | (1L << VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class PunteroContext extends ParserRuleContext {
		public T_simpleContext t_simple() {
			return getRuleContext(T_simpleContext.class,0);
		}
		public TerminalNode MULT() { return getToken(listenerParser.MULT, 0); }
		public TerminalNode CA() { return getToken(listenerParser.CA, 0); }
		public TerminalNode CC() { return getToken(listenerParser.CC, 0); }
		public PunteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterPuntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitPuntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitPuntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunteroContext puntero() throws RecognitionException {
		PunteroContext _localctx = new PunteroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_puntero);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				t_simple();
				setState(140);
				match(MULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				t_simple();
				setState(143);
				match(CA);
				setState(144);
				match(CC);
				}
				break;
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

	public static class P_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(listenerParser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public P_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterP_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitP_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitP_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_listaContext p_lista() throws RecognitionException {
		P_listaContext _localctx = new P_listaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_p_lista);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(COMA);
				setState(149);
				parametros();
				}
				break;
			case PC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Def_funcContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitDef_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitDef_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			tipo();
			setState(154);
			match(ID);
			setState(155);
			match(PA);
			setState(156);
			params();
			setState(157);
			match(PC);
			setState(158);
			bloque();
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

	public static class ParamsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public Defp_listaContext defp_lista() {
			return getRuleContext(Defp_listaContext.class,0);
		}
		public TerminalNode VOID() { return getToken(listenerParser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				tipo();
				setState(161);
				match(ID);
				setState(162);
				defp_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(VOID);
				setState(165);
				defp_lista();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class Defp_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(listenerParser.COMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Defp_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defp_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterDefp_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitDefp_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitDefp_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defp_listaContext defp_lista() throws RecognitionException {
		Defp_listaContext _localctx = new Defp_listaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defp_lista);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(COMA);
				setState(170);
				params();
				}
				break;
			case PC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LA() { return getToken(listenerParser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(listenerParser.LC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LA);
			setState(175);
			instrucciones();
			setState(176);
			match(LC);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instrucciones);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case IF:
			case VCHAR:
			case FOR:
			case INT:
			case CHAR:
			case DOUBLE:
			case WHILE:
			case VOID:
			case RETURN:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				instruccion();
				setState(179);
				instrucciones();
				}
				break;
			case LC:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class InstruccionContext extends ParserRuleContext {
		public Inst_simpleContext inst_simple() {
			return getRuleContext(Inst_simpleContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(listenerParser.PYCOMA, 0); }
		public Est_controlContext est_control() {
			return getRuleContext(Est_controlContext.class,0);
		}
		public IreturnContext ireturn() {
			return getRuleContext(IreturnContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruccion);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case VCHAR:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				inst_simple();
				setState(185);
				match(PYCOMA);
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				est_control();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				ireturn();
				setState(189);
				match(PYCOMA);
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

	public static class Inst_simpleContext extends ParserRuleContext {
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public Dec_funcContext dec_func() {
			return getRuleContext(Dec_funcContext.class,0);
		}
		public Inst_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterInst_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitInst_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitInst_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_simpleContext inst_simple() throws RecognitionException {
		Inst_simpleContext _localctx = new Inst_simpleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inst_simple);
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				declaraciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				opal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				dec_func();
				}
				break;
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

	public static class DeclaracionesContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public D_listaContext d_lista() {
			return getRuleContext(D_listaContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			tipo();
			setState(200);
			declaracion();
			setState(201);
			d_lista();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracion);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				asignacion();
				}
				break;
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

	public static class D_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(listenerParser.COMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public D_listaContext d_lista() {
			return getRuleContext(D_listaContext.class,0);
		}
		public D_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterD_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitD_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitD_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_listaContext d_lista() throws RecognitionException {
		D_listaContext _localctx = new D_listaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_d_lista);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(COMA);
				setState(208);
				declaracion();
				setState(209);
				d_lista();
				}
				break;
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ID);
			setState(215);
			match(T__0);
			setState(216);
			opal();
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

	public static class OpalContext extends ParserRuleContext {
		public NegacionContext negacion() {
			return getRuleContext(NegacionContext.class,0);
		}
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			negacion();
			setState(219);
			relacional();
			setState(220);
			logic();
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

	public static class NegacionContext extends ParserRuleContext {
		public NegacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterNegacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitNegacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitNegacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacionContext negacion() throws RecognitionException {
		NegacionContext _localctx = new NegacionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_negacion);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(T__1);
				}
				break;
			case PA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(listenerParser.AND, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode OR() { return getToken(listenerParser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_logic);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(AND);
				setState(227);
				opal();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(OR);
				setState(229);
				opal();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class RelacionalContext extends ParserRuleContext {
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_relacional);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				match(PA);
				setState(234);
				opal();
				setState(235);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				opar();
				setState(238);
				rel();
				}
				break;
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

	public static class RelContext extends ParserRuleContext {
		public TerminalNode CMP() { return getToken(listenerParser.CMP, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rel);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				match(CMP);
				setState(243);
				opar();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OparContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public OparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterOpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitOpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitOpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparContext opar() throws RecognitionException {
		OparContext _localctx = new OparContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_opar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			term();
			setState(248);
			operacion();
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

	public static class TermContext extends ParserRuleContext {
		public OvalorContext ovalor() {
			return getRuleContext(OvalorContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			ovalor();
			setState(251);
			mult();
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

	public static class MultContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(listenerParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(listenerParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(listenerParser.MOD, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_mult);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(MULT);
				setState(254);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(DIV);
				setState(256);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(MOD);
				setState(258);
				term();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
			case SUMA:
			case RESTA:
			case AND:
			case OR:
			case CMP:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class OvalorContext extends ParserRuleContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public OvalorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ovalor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterOvalor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitOvalor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitOvalor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OvalorContext ovalor() throws RecognitionException {
		OvalorContext _localctx = new OvalorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ovalor);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				valor();
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(PA);
				setState(264);
				opar();
				setState(265);
				match(PC);
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

	public static class ValorContext extends ParserRuleContext {
		public Llam_funcContext llam_func() {
			return getRuleContext(Llam_funcContext.class,0);
		}
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode VCHAR() { return getToken(listenerParser.VCHAR, 0); }
		public TerminalNode VSTRING() { return getToken(listenerParser.VSTRING, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_valor);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				llam_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				numero();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(VCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				match(VSTRING);
				}
				break;
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

	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(listenerParser.ENTERO, 0); }
		public TerminalNode DOBLE() { return getToken(listenerParser.DOBLE, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==DOBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Llam_funcContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(listenerParser.ID, 0); }
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public Llam_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llam_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterLlam_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitLlam_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitLlam_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llam_funcContext llam_func() throws RecognitionException {
		Llam_funcContext _localctx = new Llam_funcContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_llam_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(ID);
			setState(279);
			match(PA);
			setState(280);
			argumentos();
			setState(281);
			match(PC);
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

	public static class ArgumentosContext extends ParserRuleContext {
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public A_listaContext a_lista() {
			return getRuleContext(A_listaContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_argumentos);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				argumento();
				setState(284);
				a_lista();
				}
				break;
			case PC:
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ArgumentoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argumento);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				opal();
				}
				break;
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

	public static class A_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(listenerParser.COMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public A_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterA_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitA_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitA_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_listaContext a_lista() throws RecognitionException {
		A_listaContext _localctx = new A_listaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_a_lista);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(COMA);
				setState(294);
				argumentos();
				}
				break;
			case PC:
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class IreturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(listenerParser.RETURN, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public IreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ireturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterIreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitIreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitIreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IreturnContext ireturn() throws RecognitionException {
		IreturnContext _localctx = new IreturnContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_ireturn);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(RETURN);
				setState(299);
				opal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(RETURN);
				}
				break;
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

	public static class Est_controlContext extends ParserRuleContext {
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public Est_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_est_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterEst_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitEst_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitEst_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Est_controlContext est_control() throws RecognitionException {
		Est_controlContext _localctx = new Est_controlContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_est_control);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				iwhile();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				iif();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				ifor();
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(listenerParser.WHILE, 0); }
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(WHILE);
			setState(309);
			match(PA);
			setState(310);
			argumentos();
			setState(311);
			match(PC);
			setState(312);
			acciones();
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

	public static class AccionesContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(listenerParser.PYCOMA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public AccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterAcciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitAcciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitAcciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionesContext acciones() throws RecognitionException {
		AccionesContext _localctx = new AccionesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_acciones);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				asignacion();
				setState(315);
				match(PYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				opal();
				setState(318);
				match(PYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				bloque();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(listenerParser.IF, 0); }
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IelseContext ielse() {
			return getRuleContext(IelseContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IF);
			setState(325);
			match(PA);
			setState(326);
			argumentos();
			setState(327);
			match(PC);
			setState(328);
			acciones();
			setState(329);
			ielse();
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

	public static class IelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(listenerParser.ELSE, 0); }
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ielse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterIelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitIelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitIelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IelseContext ielse() throws RecognitionException {
		IelseContext _localctx = new IelseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ielse);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(ELSE);
				setState(332);
				iif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(ELSE);
				setState(334);
				acciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(listenerParser.FOR, 0); }
		public TerminalNode PA() { return getToken(listenerParser.PA, 0); }
		public Comienzos_fContext comienzos_f() {
			return getRuleContext(Comienzos_fContext.class,0);
		}
		public List<TerminalNode> PYCOMA() { return getTokens(listenerParser.PYCOMA); }
		public TerminalNode PYCOMA(int i) {
			return getToken(listenerParser.PYCOMA, i);
		}
		public List<ArgumentosContext> argumentos() {
			return getRuleContexts(ArgumentosContext.class);
		}
		public ArgumentosContext argumentos(int i) {
			return getRuleContext(ArgumentosContext.class,i);
		}
		public TerminalNode PC() { return getToken(listenerParser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(FOR);
			setState(339);
			match(PA);
			setState(340);
			comienzos_f();
			setState(341);
			match(PYCOMA);
			setState(342);
			argumentos();
			setState(343);
			match(PYCOMA);
			setState(344);
			argumentos();
			setState(345);
			match(PC);
			setState(346);
			acciones();
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

	public static class Comienzos_fContext extends ParserRuleContext {
		public OpcionContext opcion() {
			return getRuleContext(OpcionContext.class,0);
		}
		public Cf_listaContext cf_lista() {
			return getRuleContext(Cf_listaContext.class,0);
		}
		public Comienzos_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comienzos_f; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterComienzos_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitComienzos_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitComienzos_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comienzos_fContext comienzos_f() throws RecognitionException {
		Comienzos_fContext _localctx = new Comienzos_fContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comienzos_f);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case VCHAR:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				opcion();
				setState(349);
				cf_lista();
				}
				break;
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OpcionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public ArgumentoContext argumento() {
			return getRuleContext(ArgumentoContext.class,0);
		}
		public OpcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterOpcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitOpcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitOpcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionContext opcion() throws RecognitionException {
		OpcionContext _localctx = new OpcionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_opcion);
		try {
			setState(358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				tipo();
				setState(355);
				declaracion();
				}
				break;
			case T__1:
			case PA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				argumento();
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

	public static class Cf_listaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(listenerParser.COMA, 0); }
		public OpcionContext opcion() {
			return getRuleContext(OpcionContext.class,0);
		}
		public Cf_listaContext cf_lista() {
			return getRuleContext(Cf_listaContext.class,0);
		}
		public Cf_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cf_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterCf_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitCf_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitCf_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cf_listaContext cf_lista() throws RecognitionException {
		Cf_listaContext _localctx = new Cf_listaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cf_lista);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(COMA);
				setState(361);
				opcion();
				setState(362);
				cf_lista();
				}
				break;
			case PYCOMA:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(listenerParser.SUMA, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(listenerParser.RESTA, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof listenerListener ) ((listenerListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof listenerVisitor ) return ((listenerVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_operacion);
		try {
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				match(SUMA);
				setState(368);
				opar();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(RESTA);
				setState(370);
				opar();
				}
				break;
			case PC:
			case COMA:
			case PYCOMA:
			case AND:
			case OR:
			case CMP:
				enterOuterAlt(_localctx, 3);
				{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0179\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3p\n\3\3\4\3\4\3\4\3\4\5\4v\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7\3\b\3\b\5\b\u008a"+
		"\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0095\n\n\3\13\3\13\3\13"+
		"\5\13\u009a\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00aa\n\r\3\16\3\16\3\16\5\16\u00af\n\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\5\20\u00b9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00c2\n\21\3\22\3\22\3\22\3\22\5\22\u00c8\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\5\24\u00d0\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u00d7\n\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00e3\n\30\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u00ea\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u00f3\n\32\3\33\3\33\3\33\5\33\u00f8\n\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0107\n\36\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u010e\n\37\3 \3 \3 \3 \3 \5 \u0115\n \3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0122\n#\3$\3$\5$\u0126\n$\3%\3%\3%\5%\u012b"+
		"\n%\3&\3&\3&\5&\u0130\n&\3\'\3\'\3\'\5\'\u0135\n\'\3(\3(\3(\3(\3(\3(\3"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u0145\n)\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\5+\u0153\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\5-\u0163\n-\3"+
		".\3.\3.\3.\5.\u0169\n.\3/\3/\3/\3/\3/\5/\u0170\n/\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u0177\n\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\4\5\2\30\31\33\33\35\35"+
		"\3\2 !\2\u017a\2`\3\2\2\2\4o\3\2\2\2\6u\3\2\2\2\bw\3\2\2\2\n}\3\2\2\2"+
		"\f\u0085\3\2\2\2\16\u0089\3\2\2\2\20\u008b\3\2\2\2\22\u0094\3\2\2\2\24"+
		"\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u00a9\3\2\2\2\32\u00ae\3\2\2\2\34\u00b0"+
		"\3\2\2\2\36\u00b8\3\2\2\2 \u00c1\3\2\2\2\"\u00c7\3\2\2\2$\u00c9\3\2\2"+
		"\2&\u00cf\3\2\2\2(\u00d6\3\2\2\2*\u00d8\3\2\2\2,\u00dc\3\2\2\2.\u00e2"+
		"\3\2\2\2\60\u00e9\3\2\2\2\62\u00f2\3\2\2\2\64\u00f7\3\2\2\2\66\u00f9\3"+
		"\2\2\28\u00fc\3\2\2\2:\u0106\3\2\2\2<\u010d\3\2\2\2>\u0114\3\2\2\2@\u0116"+
		"\3\2\2\2B\u0118\3\2\2\2D\u0121\3\2\2\2F\u0125\3\2\2\2H\u012a\3\2\2\2J"+
		"\u012f\3\2\2\2L\u0134\3\2\2\2N\u0136\3\2\2\2P\u0144\3\2\2\2R\u0146\3\2"+
		"\2\2T\u0152\3\2\2\2V\u0154\3\2\2\2X\u0162\3\2\2\2Z\u0168\3\2\2\2\\\u016f"+
		"\3\2\2\2^\u0176\3\2\2\2`a\5\4\3\2ab\7\2\2\3b\3\3\2\2\2cd\5\6\4\2de\5\4"+
		"\3\2ep\3\2\2\2fg\5*\26\2gh\7\f\2\2hi\5\4\3\2ip\3\2\2\2jk\5$\23\2kl\7\f"+
		"\2\2lm\5\4\3\2mp\3\2\2\2np\3\2\2\2oc\3\2\2\2of\3\2\2\2oj\3\2\2\2on\3\2"+
		"\2\2p\5\3\2\2\2qr\5\b\5\2rs\7\f\2\2sv\3\2\2\2tv\5\26\f\2uq\3\2\2\2ut\3"+
		"\2\2\2v\7\3\2\2\2wx\5\16\b\2xy\7\"\2\2yz\7\7\2\2z{\5\n\6\2{|\7\b\2\2|"+
		"\t\3\2\2\2}~\5\f\7\2~\177\5\24\13\2\177\13\3\2\2\2\u0080\u0086\5\16\b"+
		"\2\u0081\u0082\5\16\b\2\u0082\u0083\7\"\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\r\3\2\2\2\u0087\u008a\5\20\t\2\u0088\u008a\5\22\n\2\u0089\u0087"+
		"\3\2\2\2\u0089\u0088\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\t\2\2\2\u008c"+
		"\21\3\2\2\2\u008d\u008e\5\20\t\2\u008e\u008f\7\17\2\2\u008f\u0095\3\2"+
		"\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7\t\2\2\u0092\u0093\7\n\2\2\u0093"+
		"\u0095\3\2\2\2\u0094\u008d\3\2\2\2\u0094\u0090\3\2\2\2\u0095\23\3\2\2"+
		"\2\u0096\u0097\7\13\2\2\u0097\u009a\5\n\6\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u0099\u0098\3\2\2\2\u009a\25\3\2\2\2\u009b\u009c\5\16\b"+
		"\2\u009c\u009d\7\"\2\2\u009d\u009e\7\7\2\2\u009e\u009f\5\30\r\2\u009f"+
		"\u00a0\7\b\2\2\u00a0\u00a1\5\34\17\2\u00a1\27\3\2\2\2\u00a2\u00a3\5\16"+
		"\b\2\u00a3\u00a4\7\"\2\2\u00a4\u00a5\5\32\16\2\u00a5\u00aa\3\2\2\2\u00a6"+
		"\u00a7\7\35\2\2\u00a7\u00aa\5\32\16\2\u00a8\u00aa\3\2\2\2\u00a9\u00a2"+
		"\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\31\3\2\2\2\u00ab"+
		"\u00ac\7\13\2\2\u00ac\u00af\5\30\r\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3"+
		"\2\2\2\u00ae\u00ad\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00b1\7\5\2\2\u00b1"+
		"\u00b2\5\36\20\2\u00b2\u00b3\7\6\2\2\u00b3\35\3\2\2\2\u00b4\u00b5\5 \21"+
		"\2\u00b5\u00b6\5\36\20\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\37\3\2\2\2\u00ba\u00bb\5\"\22"+
		"\2\u00bb\u00bc\7\f\2\2\u00bc\u00c2\3\2\2\2\u00bd\u00c2\5L\'\2\u00be\u00bf"+
		"\5J&\2\u00bf\u00c0\7\f\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1"+
		"\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2!\3\2\2\2\u00c3\u00c8\5$\23\2"+
		"\u00c4\u00c8\5*\26\2\u00c5\u00c8\5,\27\2\u00c6\u00c8\5\b\5\2\u00c7\u00c3"+
		"\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"#\3\2\2\2\u00c9\u00ca\5\16\b\2\u00ca\u00cb\5&\24\2\u00cb\u00cc\5(\25\2"+
		"\u00cc%\3\2\2\2\u00cd\u00d0\7\"\2\2\u00ce\u00d0\5*\26\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\'\3\2\2\2\u00d1\u00d2\7\13\2\2\u00d2"+
		"\u00d3\5&\24\2\u00d3\u00d4\5(\25\2\u00d4\u00d7\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7)\3\2\2\2\u00d8\u00d9"+
		"\7\"\2\2\u00d9\u00da\7\3\2\2\u00da\u00db\5,\27\2\u00db+\3\2\2\2\u00dc"+
		"\u00dd\5.\30\2\u00dd\u00de\5\62\32\2\u00de\u00df\5\60\31\2\u00df-\3\2"+
		"\2\2\u00e0\u00e3\7\4\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e1\3\2\2\2\u00e3/\3\2\2\2\u00e4\u00e5\7\22\2\2\u00e5\u00ea\5,\27\2"+
		"\u00e6\u00e7\7\23\2\2\u00e7\u00ea\5,\27\2\u00e8\u00ea\3\2\2\2\u00e9\u00e4"+
		"\3\2\2\2\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\61\3\2\2\2\u00eb"+
		"\u00ec\7\7\2\2\u00ec\u00ed\5,\27\2\u00ed\u00ee\7\b\2\2\u00ee\u00f3\3\2"+
		"\2\2\u00ef\u00f0\5\66\34\2\u00f0\u00f1\5\64\33\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00eb\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f3\63\3\2\2\2\u00f4\u00f5\7\25\2"+
		"\2\u00f5\u00f8\5\66\34\2\u00f6\u00f8\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f7"+
		"\u00f6\3\2\2\2\u00f8\65\3\2\2\2\u00f9\u00fa\58\35\2\u00fa\u00fb\5^\60"+
		"\2\u00fb\67\3\2\2\2\u00fc\u00fd\5<\37\2\u00fd\u00fe\5:\36\2\u00fe9\3\2"+
		"\2\2\u00ff\u0100\7\17\2\2\u0100\u0107\58\35\2\u0101\u0102\7\20\2\2\u0102"+
		"\u0107\58\35\2\u0103\u0104\7\21\2\2\u0104\u0107\58\35\2\u0105\u0107\3"+
		"\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0103\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107;\3\2\2\2\u0108\u010e\5> \2\u0109\u010a\7\7\2\2\u010a"+
		"\u010b\5\66\34\2\u010b\u010c\7\b\2\2\u010c\u010e\3\2\2\2\u010d\u0108\3"+
		"\2\2\2\u010d\u0109\3\2\2\2\u010e=\3\2\2\2\u010f\u0115\5B\"\2\u0110\u0115"+
		"\7\"\2\2\u0111\u0115\5@!\2\u0112\u0115\7\26\2\2\u0113\u0115\7#\2\2\u0114"+
		"\u010f\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2"+
		"\2\2\u0114\u0113\3\2\2\2\u0115?\3\2\2\2\u0116\u0117\t\3\2\2\u0117A\3\2"+
		"\2\2\u0118\u0119\7\"\2\2\u0119\u011a\7\7\2\2\u011a\u011b\5D#\2\u011b\u011c"+
		"\7\b\2\2\u011cC\3\2\2\2\u011d\u011e\5F$\2\u011e\u011f\5H%\2\u011f\u0122"+
		"\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u0120\3\2\2\2\u0122"+
		"E\3\2\2\2\u0123\u0126\5*\26\2\u0124\u0126\5,\27\2\u0125\u0123\3\2\2\2"+
		"\u0125\u0124\3\2\2\2\u0126G\3\2\2\2\u0127\u0128\7\13\2\2\u0128\u012b\5"+
		"D#\2\u0129\u012b\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0129\3\2\2\2\u012b"+
		"I\3\2\2\2\u012c\u012d\7\37\2\2\u012d\u0130\5,\27\2\u012e\u0130\7\37\2"+
		"\2\u012f\u012c\3\2\2\2\u012f\u012e\3\2\2\2\u0130K\3\2\2\2\u0131\u0135"+
		"\5N(\2\u0132\u0135\5R*\2\u0133\u0135\5V,\2\u0134\u0131\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0134\u0133\3\2\2\2\u0135M\3\2\2\2\u0136\u0137\7\34\2\2\u0137"+
		"\u0138\7\7\2\2\u0138\u0139\5D#\2\u0139\u013a\7\b\2\2\u013a\u013b\5P)\2"+
		"\u013bO\3\2\2\2\u013c\u013d\5*\26\2\u013d\u013e\7\f\2\2\u013e\u0145\3"+
		"\2\2\2\u013f\u0140\5,\27\2\u0140\u0141\7\f\2\2\u0141\u0145\3\2\2\2\u0142"+
		"\u0145\5\34\17\2\u0143\u0145\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u013f\3"+
		"\2\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145Q\3\2\2\2\u0146\u0147"+
		"\7\24\2\2\u0147\u0148\7\7\2\2\u0148\u0149\5D#\2\u0149\u014a\7\b\2\2\u014a"+
		"\u014b\5P)\2\u014b\u014c\5T+\2\u014cS\3\2\2\2\u014d\u014e\7\32\2\2\u014e"+
		"\u0153\5R*\2\u014f\u0150\7\32\2\2\u0150\u0153\5P)\2\u0151\u0153\3\2\2"+
		"\2\u0152\u014d\3\2\2\2\u0152\u014f\3\2\2\2\u0152\u0151\3\2\2\2\u0153U"+
		"\3\2\2\2\u0154\u0155\7\27\2\2\u0155\u0156\7\7\2\2\u0156\u0157\5X-\2\u0157"+
		"\u0158\7\f\2\2\u0158\u0159\5D#\2\u0159\u015a\7\f\2\2\u015a\u015b\5D#\2"+
		"\u015b\u015c\7\b\2\2\u015c\u015d\5P)\2\u015dW\3\2\2\2\u015e\u015f\5Z."+
		"\2\u015f\u0160\5\\/\2\u0160\u0163\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u015e"+
		"\3\2\2\2\u0162\u0161\3\2\2\2\u0163Y\3\2\2\2\u0164\u0165\5\16\b\2\u0165"+
		"\u0166\5&\24\2\u0166\u0169\3\2\2\2\u0167\u0169\5F$\2\u0168\u0164\3\2\2"+
		"\2\u0168\u0167\3\2\2\2\u0169[\3\2\2\2\u016a\u016b\7\13\2\2\u016b\u016c"+
		"\5Z.\2\u016c\u016d\5\\/\2\u016d\u0170\3\2\2\2\u016e\u0170\3\2\2\2\u016f"+
		"\u016a\3\2\2\2\u016f\u016e\3\2\2\2\u0170]\3\2\2\2\u0171\u0172\7\r\2\2"+
		"\u0172\u0177\5\66\34\2\u0173\u0174\7\16\2\2\u0174\u0177\5\66\34\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0171\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0175\3\2"+
		"\2\2\u0177_\3\2\2\2!ou\u0085\u0089\u0094\u0099\u00a9\u00ae\u00b8\u00c1"+
		"\u00c7\u00cf\u00d6\u00e2\u00e9\u00f2\u00f7\u0106\u010d\u0114\u0121\u0125"+
		"\u012a\u012f\u0134\u0144\u0152\u0162\u0168\u016f\u0176";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}