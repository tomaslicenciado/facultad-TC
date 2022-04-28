// Generated from /home/tomas/FACULTAD/TC/facultad-TC/tp1/src/main/java/tp1/tp1.g4 by ANTLR 4.8

    package tp1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tp1Parser extends Parser {
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
	public static final int
		RULE_si = 0, RULE_funciones = 1, RULE_funcion = 2, RULE_dec_func = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_tipo = 6, RULE_t_simple = 7, 
		RULE_puntero = 8, RULE_p_lista = 9, RULE_def_func = 10, RULE_params = 11, 
		RULE_defp_lista = 12, RULE_bloque = 13, RULE_instrucciones = 14, RULE_instruccion = 15, 
		RULE_inst_simple = 16, RULE_declaraciones = 17, RULE_declaracion = 18, 
		RULE_d_lista = 19, RULE_asignacion = 20, RULE_operaciones = 21, RULE_opal = 22, 
		RULE_negado = 23, RULE_logic = 24, RULE_relacional = 25, RULE_rel = 26, 
		RULE_opar = 27, RULE_term = 28, RULE_mult = 29, RULE_ovalor = 30, RULE_valor = 31, 
		RULE_numero = 32, RULE_llam_func = 33, RULE_argumentos = 34, RULE_argumento = 35, 
		RULE_a_lista = 36, RULE_ireturn = 37, RULE_inst_compuesta = 38, RULE_est_control = 39, 
		RULE_iwhile = 40, RULE_acciones = 41, RULE_iif = 42, RULE_ielse = 43, 
		RULE_ifor = 44, RULE_comienzos_f = 45, RULE_opcion = 46, RULE_cf_lista = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"si", "funciones", "funcion", "dec_func", "parametros", "parametro", 
			"tipo", "t_simple", "puntero", "p_lista", "def_func", "params", "defp_lista", 
			"bloque", "instrucciones", "instruccion", "inst_simple", "declaraciones", 
			"declaracion", "d_lista", "asignacion", "operaciones", "opal", "negado", 
			"logic", "relacional", "rel", "opar", "term", "mult", "ovalor", "valor", 
			"numero", "llam_func", "argumentos", "argumento", "a_lista", "ireturn", 
			"inst_compuesta", "est_control", "iwhile", "acciones", "iif", "ielse", 
			"ifor", "comienzos_f", "opcion", "cf_lista"
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
	public String getGrammarFileName() { return "tp1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tp1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SiContext extends ParserRuleContext {
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(tp1Parser.EOF, 0); }
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_si);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			funciones();
			setState(97);
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

	public static class FuncionesContext extends ParserRuleContext {
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funciones);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				funcion();
				setState(100);
				funciones();
				}
				break;
			case EOF:
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

	public static class FuncionContext extends ParserRuleContext {
		public Dec_funcContext dec_func() {
			return getRuleContext(Dec_funcContext.class,0);
		}
		public Def_funcContext def_func() {
			return getRuleContext(Def_funcContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcion);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				dec_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public TerminalNode PYCOMA() { return getToken(tp1Parser.PYCOMA, 0); }
		public Dec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterDec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitDec_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitDec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_funcContext dec_func() throws RecognitionException {
		Dec_funcContext _localctx = new Dec_funcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dec_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			tipo();
			setState(110);
			match(ID);
			setState(111);
			match(PA);
			setState(112);
			parametros();
			setState(113);
			match(PC);
			setState(114);
			match(PYCOMA);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			parametro();
			setState(117);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametro);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				tipo();
				setState(121);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				t_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
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
		public TerminalNode INT() { return getToken(tp1Parser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(tp1Parser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(tp1Parser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(tp1Parser.VOID, 0); }
		public T_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterT_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitT_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitT_simple(this);
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
			setState(130);
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
		public TerminalNode MULT() { return getToken(tp1Parser.MULT, 0); }
		public TerminalNode CA() { return getToken(tp1Parser.CA, 0); }
		public TerminalNode CC() { return getToken(tp1Parser.CC, 0); }
		public PunteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puntero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterPuntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitPuntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitPuntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PunteroContext puntero() throws RecognitionException {
		PunteroContext _localctx = new PunteroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_puntero);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				t_simple();
				setState(133);
				match(MULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				t_simple();
				setState(136);
				match(CA);
				setState(137);
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
		public TerminalNode COMA() { return getToken(tp1Parser.COMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public P_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterP_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitP_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitP_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_listaContext p_lista() throws RecognitionException {
		P_listaContext _localctx = new P_listaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_p_lista);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(COMA);
				setState(142);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Def_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterDef_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitDef_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitDef_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_funcContext def_func() throws RecognitionException {
		Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_def_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			tipo();
			setState(147);
			match(ID);
			setState(148);
			match(PA);
			setState(149);
			params();
			setState(150);
			match(PC);
			setState(151);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public Defp_listaContext defp_lista() {
			return getRuleContext(Defp_listaContext.class,0);
		}
		public TerminalNode VOID() { return getToken(tp1Parser.VOID, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				tipo();
				setState(154);
				match(ID);
				setState(155);
				defp_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(VOID);
				setState(158);
				defp_lista();
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
		public TerminalNode COMA() { return getToken(tp1Parser.COMA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Defp_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defp_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterDefp_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitDefp_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitDefp_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Defp_listaContext defp_lista() throws RecognitionException {
		Defp_listaContext _localctx = new Defp_listaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_defp_lista);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(COMA);
				setState(162);
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
		public TerminalNode LA() { return getToken(tp1Parser.LA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LC() { return getToken(tp1Parser.LC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LA);
			setState(167);
			instrucciones();
			setState(168);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instrucciones);
		try {
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case PYCOMA:
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
				setState(170);
				instruccion();
				setState(171);
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
		public TerminalNode PYCOMA() { return getToken(tp1Parser.PYCOMA, 0); }
		public Inst_compuestaContext inst_compuesta() {
			return getRuleContext(Inst_compuestaContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_instruccion);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case PA:
			case PYCOMA:
			case VCHAR:
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
			case RETURN:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				inst_simple();
				setState(177);
				match(PYCOMA);
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				inst_compuesta();
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
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public Dec_funcContext dec_func() {
			return getRuleContext(Dec_funcContext.class,0);
		}
		public IreturnContext ireturn() {
			return getRuleContext(IreturnContext.class,0);
		}
		public Inst_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterInst_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitInst_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitInst_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_simpleContext inst_simple() throws RecognitionException {
		Inst_simpleContext _localctx = new Inst_simpleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_inst_simple);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				declaraciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				operaciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				dec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				ireturn();
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declaraciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			tipo();
			setState(190);
			declaracion();
			setState(191);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracion);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
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
		public TerminalNode COMA() { return getToken(tp1Parser.COMA, 0); }
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterD_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitD_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitD_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final D_listaContext d_lista() throws RecognitionException {
		D_listaContext _localctx = new D_listaContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_d_lista);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(COMA);
				setState(198);
				declaracion();
				setState(199);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(ID);
			setState(205);
			match(T__0);
			setState(206);
			operaciones();
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

	public static class OperacionesContext extends ParserRuleContext {
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operaciones);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				opal();
				setState(209);
				operaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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

	public static class OpalContext extends ParserRuleContext {
		public NegadoContext negado() {
			return getRuleContext(NegadoContext.class,0);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			negado();
			setState(215);
			relacional();
			setState(216);
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

	public static class NegadoContext extends ParserRuleContext {
		public NegadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterNegado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitNegado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitNegado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegadoContext negado() throws RecognitionException {
		NegadoContext _localctx = new NegadoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_negado);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
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
		public TerminalNode AND() { return getToken(tp1Parser.AND, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode OR() { return getToken(tp1Parser.OR, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logic);
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(AND);
				setState(223);
				opal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				match(OR);
				setState(225);
				opal();
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

	public static class RelacionalContext extends ParserRuleContext {
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public RelContext rel() {
			return getRuleContext(RelContext.class,0);
		}
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relacional);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				opar();
				setState(230);
				rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(PA);
				setState(233);
				opal();
				setState(234);
				match(PC);
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
		public TerminalNode CMP() { return getToken(tp1Parser.CMP, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public RelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelContext rel() throws RecognitionException {
		RelContext _localctx = new RelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rel);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(CMP);
				setState(239);
				opar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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

	public static class OparContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public OparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterOpar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitOpar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitOpar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparContext opar() throws RecognitionException {
		OparContext _localctx = new OparContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_opar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			term();
			setState(244);
			operaciones();
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			ovalor();
			setState(247);
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
		public TerminalNode MULT() { return getToken(tp1Parser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode DIV() { return getToken(tp1Parser.DIV, 0); }
		public TerminalNode MOD() { return getToken(tp1Parser.MOD, 0); }
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_mult);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(MULT);
				setState(250);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(DIV);
				setState(252);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(MOD);
				setState(254);
				term();
				}
				break;
			case T__1:
			case PA:
			case PC:
			case COMA:
			case PYCOMA:
			case AND:
			case OR:
			case CMP:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
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
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public OvalorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ovalor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterOvalor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitOvalor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitOvalor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OvalorContext ovalor() throws RecognitionException {
		OvalorContext _localctx = new OvalorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ovalor);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				valor();
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(PA);
				setState(260);
				opar();
				setState(261);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode VCHAR() { return getToken(tp1Parser.VCHAR, 0); }
		public TerminalNode VSTRING() { return getToken(tp1Parser.VSTRING, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valor);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				llam_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				numero();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				match(VCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(269);
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
		public TerminalNode ENTERO() { return getToken(tp1Parser.ENTERO, 0); }
		public TerminalNode DOBLE() { return getToken(tp1Parser.DOBLE, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public Llam_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llam_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterLlam_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitLlam_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitLlam_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llam_funcContext llam_func() throws RecognitionException {
		Llam_funcContext _localctx = new Llam_funcContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_llam_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ID);
			setState(275);
			match(PA);
			setState(276);
			argumentos();
			setState(277);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_argumentos);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				argumento();
				setState(280);
				a_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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

	public static class ArgumentoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_argumento);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				operaciones();
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
		public TerminalNode COMA() { return getToken(tp1Parser.COMA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public A_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterA_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitA_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitA_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final A_listaContext a_lista() throws RecognitionException {
		A_listaContext _localctx = new A_listaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_a_lista);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				match(COMA);
				setState(290);
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
		public TerminalNode RETURN() { return getToken(tp1Parser.RETURN, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public IreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ireturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterIreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitIreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitIreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IreturnContext ireturn() throws RecognitionException {
		IreturnContext _localctx = new IreturnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ireturn);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(RETURN);
				setState(295);
				match(PA);
				setState(296);
				operaciones();
				setState(297);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(RETURN);
				setState(300);
				operaciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
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

	public static class Inst_compuestaContext extends ParserRuleContext {
		public Est_controlContext est_control() {
			return getRuleContext(Est_controlContext.class,0);
		}
		public Inst_compuestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst_compuesta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterInst_compuesta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitInst_compuesta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitInst_compuesta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inst_compuestaContext inst_compuesta() throws RecognitionException {
		Inst_compuestaContext _localctx = new Inst_compuestaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_inst_compuesta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			est_control();
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterEst_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitEst_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitEst_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Est_controlContext est_control() throws RecognitionException {
		Est_controlContext _localctx = new Est_controlContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_est_control);
		try {
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				iwhile();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				iif();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
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
		public TerminalNode WHILE() { return getToken(tp1Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(WHILE);
			setState(312);
			match(PA);
			setState(313);
			argumentos();
			setState(314);
			match(PC);
			setState(315);
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
		public TerminalNode PYCOMA() { return getToken(tp1Parser.PYCOMA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterAcciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitAcciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitAcciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccionesContext acciones() throws RecognitionException {
		AccionesContext _localctx = new AccionesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_acciones);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				asignacion();
				setState(318);
				match(PYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				operaciones();
				setState(321);
				match(PYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
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
		public TerminalNode IF() { return getToken(tp1Parser.IF, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(IF);
			setState(328);
			match(PA);
			setState(329);
			argumentos();
			setState(330);
			match(PC);
			setState(331);
			acciones();
			setState(332);
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
		public TerminalNode ELSE() { return getToken(tp1Parser.ELSE, 0); }
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterIelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitIelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitIelse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IelseContext ielse() throws RecognitionException {
		IelseContext _localctx = new IelseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ielse);
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(ELSE);
				setState(335);
				iif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(ELSE);
				setState(337);
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
		public TerminalNode FOR() { return getToken(tp1Parser.FOR, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public Comienzos_fContext comienzos_f() {
			return getRuleContext(Comienzos_fContext.class,0);
		}
		public List<TerminalNode> PYCOMA() { return getTokens(tp1Parser.PYCOMA); }
		public TerminalNode PYCOMA(int i) {
			return getToken(tp1Parser.PYCOMA, i);
		}
		public List<ArgumentosContext> argumentos() {
			return getRuleContexts(ArgumentosContext.class);
		}
		public ArgumentosContext argumentos(int i) {
			return getRuleContext(ArgumentosContext.class,i);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public AccionesContext acciones() {
			return getRuleContext(AccionesContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(FOR);
			setState(342);
			match(PA);
			setState(343);
			comienzos_f();
			setState(344);
			match(PYCOMA);
			setState(345);
			argumentos();
			setState(346);
			match(PYCOMA);
			setState(347);
			argumentos();
			setState(348);
			match(PC);
			setState(349);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterComienzos_f(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitComienzos_f(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitComienzos_f(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comienzos_fContext comienzos_f() throws RecognitionException {
		Comienzos_fContext _localctx = new Comienzos_fContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_comienzos_f);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				opcion();
				setState(352);
				cf_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterOpcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitOpcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitOpcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionContext opcion() throws RecognitionException {
		OpcionContext _localctx = new OpcionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_opcion);
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				tipo();
				setState(358);
				declaracion();
				}
				break;
			case T__1:
			case PA:
			case COMA:
			case PYCOMA:
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
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
		public TerminalNode COMA() { return getToken(tp1Parser.COMA, 0); }
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
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterCf_lista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitCf_lista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitCf_lista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cf_listaContext cf_lista() throws RecognitionException {
		Cf_listaContext _localctx = new Cf_listaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cf_lista);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(COMA);
				setState(364);
				opcion();
				setState(365);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0175\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3j\n\3\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\177\n\7\3\b\3\b\5\b\u0083\n\b\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u008e\n\n\3\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a2\n\r\3\16\3\16\3"+
		"\16\5\16\u00a7\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b1"+
		"\n\20\3\21\3\21\3\21\3\21\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00be\n\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00c6\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\5\25\u00cd\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u00d7\n\27\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00df\n\31\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u00e6\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u00ef\n\33\3\34\3\34\3\34\5\34\u00f4\n\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0103\n\37\3 \3 \3 \3"+
		" \3 \5 \u010a\n \3!\3!\3!\3!\3!\5!\u0111\n!\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\5$\u011e\n$\3%\3%\5%\u0122\n%\3&\3&\3&\5&\u0127\n&\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\5\'\u0131\n\'\3(\3(\3)\3)\3)\5)\u0138\n)\3*\3*"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0148\n+\3,\3,\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\5-\u0156\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/"+
		"\5/\u0166\n/\3\60\3\60\3\60\3\60\5\60\u016c\n\60\3\61\3\61\3\61\3\61\3"+
		"\61\5\61\u0173\n\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\4\5\2\30\31\33\33\35\35"+
		"\3\2 !\2\u0172\2b\3\2\2\2\4i\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2\nv\3\2\2\2"+
		"\f~\3\2\2\2\16\u0082\3\2\2\2\20\u0084\3\2\2\2\22\u008d\3\2\2\2\24\u0092"+
		"\3\2\2\2\26\u0094\3\2\2\2\30\u00a1\3\2\2\2\32\u00a6\3\2\2\2\34\u00a8\3"+
		"\2\2\2\36\u00b0\3\2\2\2 \u00b6\3\2\2\2\"\u00bd\3\2\2\2$\u00bf\3\2\2\2"+
		"&\u00c5\3\2\2\2(\u00cc\3\2\2\2*\u00ce\3\2\2\2,\u00d6\3\2\2\2.\u00d8\3"+
		"\2\2\2\60\u00de\3\2\2\2\62\u00e5\3\2\2\2\64\u00ee\3\2\2\2\66\u00f3\3\2"+
		"\2\28\u00f5\3\2\2\2:\u00f8\3\2\2\2<\u0102\3\2\2\2>\u0109\3\2\2\2@\u0110"+
		"\3\2\2\2B\u0112\3\2\2\2D\u0114\3\2\2\2F\u011d\3\2\2\2H\u0121\3\2\2\2J"+
		"\u0126\3\2\2\2L\u0130\3\2\2\2N\u0132\3\2\2\2P\u0137\3\2\2\2R\u0139\3\2"+
		"\2\2T\u0147\3\2\2\2V\u0149\3\2\2\2X\u0155\3\2\2\2Z\u0157\3\2\2\2\\\u0165"+
		"\3\2\2\2^\u016b\3\2\2\2`\u0172\3\2\2\2bc\5\4\3\2cd\7\2\2\3d\3\3\2\2\2"+
		"ef\5\6\4\2fg\5\4\3\2gj\3\2\2\2hj\3\2\2\2ie\3\2\2\2ih\3\2\2\2j\5\3\2\2"+
		"\2kn\5\b\5\2ln\5\26\f\2mk\3\2\2\2ml\3\2\2\2n\7\3\2\2\2op\5\16\b\2pq\7"+
		"\"\2\2qr\7\7\2\2rs\5\n\6\2st\7\b\2\2tu\7\f\2\2u\t\3\2\2\2vw\5\f\7\2wx"+
		"\5\24\13\2x\13\3\2\2\2y\177\5\16\b\2z{\5\16\b\2{|\7\"\2\2|\177\3\2\2\2"+
		"}\177\3\2\2\2~y\3\2\2\2~z\3\2\2\2~}\3\2\2\2\177\r\3\2\2\2\u0080\u0083"+
		"\5\20\t\2\u0081\u0083\5\22\n\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2"+
		"\u0083\17\3\2\2\2\u0084\u0085\t\2\2\2\u0085\21\3\2\2\2\u0086\u0087\5\20"+
		"\t\2\u0087\u0088\7\17\2\2\u0088\u008e\3\2\2\2\u0089\u008a\5\20\t\2\u008a"+
		"\u008b\7\t\2\2\u008b\u008c\7\n\2\2\u008c\u008e\3\2\2\2\u008d\u0086\3\2"+
		"\2\2\u008d\u0089\3\2\2\2\u008e\23\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0093"+
		"\5\n\6\2\u0091\u0093\3\2\2\2\u0092\u008f\3\2\2\2\u0092\u0091\3\2\2\2\u0093"+
		"\25\3\2\2\2\u0094\u0095\5\16\b\2\u0095\u0096\7\"\2\2\u0096\u0097\7\7\2"+
		"\2\u0097\u0098\5\30\r\2\u0098\u0099\7\b\2\2\u0099\u009a\5\34\17\2\u009a"+
		"\27\3\2\2\2\u009b\u009c\5\16\b\2\u009c\u009d\7\"\2\2\u009d\u009e\5\32"+
		"\16\2\u009e\u00a2\3\2\2\2\u009f\u00a0\7\35\2\2\u00a0\u00a2\5\32\16\2\u00a1"+
		"\u009b\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\13\2"+
		"\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5\36\20"+
		"\2\u00aa\u00ab\7\6\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\5 \21\2\u00ad\u00ae"+
		"\5\36\20\2\u00ae\u00b1\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\5\"\22\2\u00b3\u00b4"+
		"\7\f\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b7\5N(\2\u00b6\u00b2\3\2\2\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00be\5$\23\2\u00b9\u00be\5*\26\2"+
		"\u00ba\u00be\5,\27\2\u00bb\u00be\5\b\5\2\u00bc\u00be\5L\'\2\u00bd\u00b8"+
		"\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00bc\3\2\2\2\u00be#\3\2\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1\5&\24\2"+
		"\u00c1\u00c2\5(\25\2\u00c2%\3\2\2\2\u00c3\u00c6\7\"\2\2\u00c4\u00c6\5"+
		"*\26\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\'\3\2\2\2\u00c7\u00c8"+
		"\7\13\2\2\u00c8\u00c9\5&\24\2\u00c9\u00ca\5(\25\2\u00ca\u00cd\3\2\2\2"+
		"\u00cb\u00cd\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd)\3"+
		"\2\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7\3\2\2\u00d0\u00d1\5,\27\2\u00d1"+
		"+\3\2\2\2\u00d2\u00d3\5.\30\2\u00d3\u00d4\5,\27\2\u00d4\u00d7\3\2\2\2"+
		"\u00d5\u00d7\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7-\3"+
		"\2\2\2\u00d8\u00d9\5\60\31\2\u00d9\u00da\5\64\33\2\u00da\u00db\5\62\32"+
		"\2\u00db/\3\2\2\2\u00dc\u00df\7\4\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\61\3\2\2\2\u00e0\u00e1\7\22\2\2\u00e1"+
		"\u00e6\5.\30\2\u00e2\u00e3\7\23\2\2\u00e3\u00e6\5.\30\2\u00e4\u00e6\3"+
		"\2\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6"+
		"\63\3\2\2\2\u00e7\u00e8\58\35\2\u00e8\u00e9\5\66\34\2\u00e9\u00ef\3\2"+
		"\2\2\u00ea\u00eb\7\7\2\2\u00eb\u00ec\5.\30\2\u00ec\u00ed\7\b\2\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\65\3\2\2"+
		"\2\u00f0\u00f1\7\25\2\2\u00f1\u00f4\58\35\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00f0\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\67\3\2\2\2\u00f5\u00f6\5:\36"+
		"\2\u00f6\u00f7\5,\27\2\u00f79\3\2\2\2\u00f8\u00f9\5> \2\u00f9\u00fa\5"+
		"<\37\2\u00fa;\3\2\2\2\u00fb\u00fc\7\17\2\2\u00fc\u0103\5:\36\2\u00fd\u00fe"+
		"\7\20\2\2\u00fe\u0103\5:\36\2\u00ff\u0100\7\21\2\2\u0100\u0103\5:\36\2"+
		"\u0101\u0103\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00ff"+
		"\3\2\2\2\u0102\u0101\3\2\2\2\u0103=\3\2\2\2\u0104\u010a\5@!\2\u0105\u0106"+
		"\7\7\2\2\u0106\u0107\58\35\2\u0107\u0108\7\b\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0104\3\2\2\2\u0109\u0105\3\2\2\2\u010a?\3\2\2\2\u010b\u0111\5D#\2\u010c"+
		"\u0111\7\"\2\2\u010d\u0111\5B\"\2\u010e\u0111\7\26\2\2\u010f\u0111\7#"+
		"\2\2\u0110\u010b\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111A\3\2\2\2\u0112\u0113\t\3\2\2"+
		"\u0113C\3\2\2\2\u0114\u0115\7\"\2\2\u0115\u0116\7\7\2\2\u0116\u0117\5"+
		"F$\2\u0117\u0118\7\b\2\2\u0118E\3\2\2\2\u0119\u011a\5H%\2\u011a\u011b"+
		"\5J&\2\u011b\u011e\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u0119\3\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011eG\3\2\2\2\u011f\u0122\5*\26\2\u0120\u0122\5,\27\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122I\3\2\2\2\u0123\u0124\7"+
		"\13\2\2\u0124\u0127\5F$\2\u0125\u0127\3\2\2\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0125\3\2\2\2\u0127K\3\2\2\2\u0128\u0129\7\37\2\2\u0129\u012a\7\7\2\2"+
		"\u012a\u012b\5,\27\2\u012b\u012c\7\b\2\2\u012c\u0131\3\2\2\2\u012d\u012e"+
		"\7\37\2\2\u012e\u0131\5,\27\2\u012f\u0131\7\37\2\2\u0130\u0128\3\2\2\2"+
		"\u0130\u012d\3\2\2\2\u0130\u012f\3\2\2\2\u0131M\3\2\2\2\u0132\u0133\5"+
		"P)\2\u0133O\3\2\2\2\u0134\u0138\5R*\2\u0135\u0138\5V,\2\u0136\u0138\5"+
		"Z.\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138"+
		"Q\3\2\2\2\u0139\u013a\7\34\2\2\u013a\u013b\7\7\2\2\u013b\u013c\5F$\2\u013c"+
		"\u013d\7\b\2\2\u013d\u013e\5T+\2\u013eS\3\2\2\2\u013f\u0140\5*\26\2\u0140"+
		"\u0141\7\f\2\2\u0141\u0148\3\2\2\2\u0142\u0143\5,\27\2\u0143\u0144\7\f"+
		"\2\2\u0144\u0148\3\2\2\2\u0145\u0148\5\34\17\2\u0146\u0148\3\2\2\2\u0147"+
		"\u013f\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2"+
		"\2\2\u0148U\3\2\2\2\u0149\u014a\7\24\2\2\u014a\u014b\7\7\2\2\u014b\u014c"+
		"\5F$\2\u014c\u014d\7\b\2\2\u014d\u014e\5T+\2\u014e\u014f\5X-\2\u014fW"+
		"\3\2\2\2\u0150\u0151\7\32\2\2\u0151\u0156\5V,\2\u0152\u0153\7\32\2\2\u0153"+
		"\u0156\5T+\2\u0154\u0156\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0152\3\2\2"+
		"\2\u0155\u0154\3\2\2\2\u0156Y\3\2\2\2\u0157\u0158\7\27\2\2\u0158\u0159"+
		"\7\7\2\2\u0159\u015a\5\\/\2\u015a\u015b\7\f\2\2\u015b\u015c\5F$\2\u015c"+
		"\u015d\7\f\2\2\u015d\u015e\5F$\2\u015e\u015f\7\b\2\2\u015f\u0160\5T+\2"+
		"\u0160[\3\2\2\2\u0161\u0162\5^\60\2\u0162\u0163\5`\61\2\u0163\u0166\3"+
		"\2\2\2\u0164\u0166\3\2\2\2\u0165\u0161\3\2\2\2\u0165\u0164\3\2\2\2\u0166"+
		"]\3\2\2\2\u0167\u0168\5\16\b\2\u0168\u0169\5&\24\2\u0169\u016c\3\2\2\2"+
		"\u016a\u016c\5H%\2\u016b\u0167\3\2\2\2\u016b\u016a\3\2\2\2\u016c_\3\2"+
		"\2\2\u016d\u016e\7\13\2\2\u016e\u016f\5^\60\2\u016f\u0170\5`\61\2\u0170"+
		"\u0173\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u016d\3\2\2\2\u0172\u0171\3\2"+
		"\2\2\u0173a\3\2\2\2!im~\u0082\u008d\u0092\u00a1\u00a6\u00b0\u00b6\u00bd"+
		"\u00c5\u00cc\u00d6\u00de\u00e5\u00ee\u00f3\u0102\u0109\u0110\u011d\u0121"+
		"\u0126\u0130\u0137\u0147\u0155\u0165\u016b\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}