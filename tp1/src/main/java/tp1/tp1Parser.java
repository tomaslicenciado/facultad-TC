// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/tp1/src/main/java/tp1/tp1.g4 by ANTLR 4.8

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
		T__0=1, LA=2, LC=3, PA=4, PC=5, CA=6, CC=7, COMA=8, PYCOMA=9, SUMA=10, 
		RESTA=11, MULT=12, DIV=13, MOD=14, AND=15, OR=16, IF=17, CMP=18, VCHAR=19, 
		FOR=20, INT=21, CHAR=22, ELSE=23, DOUBLE=24, WHILE=25, VOID=26, STRING=27, 
		RETURN=28, ENTERO=29, DOBLE=30, ID=31, VSTRING=32, BCOMENTARIO=33, COMENTARIO=34, 
		PRAGMA=35, WS=36, OTRO=37;
	public static final int
		RULE_si = 0, RULE_funciones = 1, RULE_funcion = 2, RULE_dec_func = 3, 
		RULE_parametros = 4, RULE_parametro = 5, RULE_tipo = 6, RULE_t_simple = 7, 
		RULE_puntero = 8, RULE_p_lista = 9, RULE_def_func = 10, RULE_params = 11, 
		RULE_defp_lista = 12, RULE_bloque = 13, RULE_instrucciones = 14, RULE_instruccion = 15, 
		RULE_inst_simple = 16, RULE_declaraciones = 17, RULE_declaracion = 18, 
		RULE_d_lista = 19, RULE_asignacion = 20, RULE_operaciones = 21, RULE_opal = 22, 
		RULE_logic = 23, RULE_relacional = 24, RULE_rel = 25, RULE_opar = 26, 
		RULE_term = 27, RULE_mult = 28, RULE_ovalor = 29, RULE_valor = 30, RULE_numero = 31, 
		RULE_llam_func = 32, RULE_argumentos = 33, RULE_argumento = 34, RULE_a_lista = 35, 
		RULE_ireturn = 36, RULE_inst_compuesta = 37, RULE_est_control = 38, RULE_iwhile = 39, 
		RULE_acciones = 40, RULE_iif = 41, RULE_ielse = 42, RULE_ifor = 43, RULE_comienzos_f = 44, 
		RULE_opcion = 45, RULE_cf_lista = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"si", "funciones", "funcion", "dec_func", "parametros", "parametro", 
			"tipo", "t_simple", "puntero", "p_lista", "def_func", "params", "defp_lista", 
			"bloque", "instrucciones", "instruccion", "inst_simple", "declaraciones", 
			"declaracion", "d_lista", "asignacion", "operaciones", "opal", "logic", 
			"relacional", "rel", "opar", "term", "mult", "ovalor", "valor", "numero", 
			"llam_func", "argumentos", "argumento", "a_lista", "ireturn", "inst_compuesta", 
			"est_control", "iwhile", "acciones", "iif", "ielse", "ifor", "comienzos_f", 
			"opcion", "cf_lista"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", "';'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'if'", null, null, 
			"'for'", "'int'", "'char'", "'else'", "'double'", "'while'", "'void'", 
			"'string'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LA", "LC", "PA", "PC", "CA", "CC", "COMA", "PYCOMA", "SUMA", 
			"RESTA", "MULT", "DIV", "MOD", "AND", "OR", "IF", "CMP", "VCHAR", "FOR", 
			"INT", "CHAR", "ELSE", "DOUBLE", "WHILE", "VOID", "STRING", "RETURN", 
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
			setState(94);
			funciones();
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				funcion();
				setState(98);
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
		public TerminalNode PYCOMA() { return getToken(tp1Parser.PYCOMA, 0); }
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
				setState(103);
				dec_func();
				setState(104);
				match(PYCOMA);
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
			setState(115);
			parametro();
			setState(116);
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				tipo();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				tipo();
				setState(120);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				t_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
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
			setState(129);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				t_simple();
				setState(132);
				match(MULT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				t_simple();
				setState(135);
				match(CA);
				setState(136);
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
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(COMA);
				setState(141);
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
			setState(145);
			tipo();
			setState(146);
			match(ID);
			setState(147);
			match(PA);
			setState(148);
			params();
			setState(149);
			match(PC);
			setState(150);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				tipo();
				setState(153);
				match(ID);
				setState(154);
				defp_lista();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(VOID);
				setState(157);
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
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(COMA);
				setState(161);
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
			setState(165);
			match(LA);
			setState(166);
			instrucciones();
			setState(167);
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
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
				setState(169);
				instruccion();
				setState(170);
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
		public IreturnContext ireturn() {
			return getRuleContext(IreturnContext.class,0);
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
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case PYCOMA:
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
				setState(175);
				inst_simple();
				setState(176);
				match(PYCOMA);
				}
				break;
			case IF:
			case FOR:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				inst_compuesta();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				ireturn();
				setState(180);
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
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				declaraciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				asignacion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				operaciones();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
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
			setState(190);
			tipo();
			setState(191);
			declaracion();
			setState(192);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(COMA);
				setState(199);
				declaracion();
				setState(200);
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
			setState(205);
			match(ID);
			setState(206);
			match(T__0);
			setState(207);
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
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				opal();
				setState(210);
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
		enterRule(_localctx, 46, RULE_logic);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(AND);
				setState(219);
				opal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(OR);
				setState(221);
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
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
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
		enterRule(_localctx, 48, RULE_relacional);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(PA);
				setState(226);
				opal();
				setState(227);
				match(PC);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				opar();
				setState(230);
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
		enterRule(_localctx, 50, RULE_rel);
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(CMP);
				setState(235);
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
		enterRule(_localctx, 52, RULE_opar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			term();
			setState(240);
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
		enterRule(_localctx, 54, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			ovalor();
			setState(243);
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
		enterRule(_localctx, 56, RULE_mult);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(MULT);
				setState(246);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(DIV);
				setState(248);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(MOD);
				setState(250);
				term();
				}
				break;
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
		enterRule(_localctx, 58, RULE_ovalor);
		try {
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VCHAR:
			case ENTERO:
			case DOBLE:
			case ID:
			case VSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				valor();
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				match(PA);
				setState(256);
				opar();
				setState(257);
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
		enterRule(_localctx, 60, RULE_valor);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				llam_func();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				numero();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				match(VCHAR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
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
		enterRule(_localctx, 62, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
		enterRule(_localctx, 64, RULE_llam_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(271);
			match(PA);
			setState(272);
			argumentos();
			setState(273);
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
		enterRule(_localctx, 66, RULE_argumentos);
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				argumento();
				setState(276);
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
		enterRule(_localctx, 68, RULE_argumento);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
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
		enterRule(_localctx, 70, RULE_a_lista);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(COMA);
				setState(286);
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
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
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
		enterRule(_localctx, 72, RULE_ireturn);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(RETURN);
				setState(291);
				operaciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
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
		enterRule(_localctx, 74, RULE_inst_compuesta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
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
		enterRule(_localctx, 76, RULE_est_control);
		try {
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				iwhile();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				iif();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
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
		enterRule(_localctx, 78, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(WHILE);
			setState(303);
			match(PA);
			setState(304);
			argumentos();
			setState(305);
			match(PC);
			setState(306);
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
		enterRule(_localctx, 80, RULE_acciones);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				asignacion();
				setState(309);
				match(PYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				operaciones();
				setState(312);
				match(PYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
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
		enterRule(_localctx, 82, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(IF);
			setState(319);
			match(PA);
			setState(320);
			argumentos();
			setState(321);
			match(PC);
			setState(322);
			acciones();
			setState(323);
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
		enterRule(_localctx, 84, RULE_ielse);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(ELSE);
				setState(326);
				iif();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(ELSE);
				setState(328);
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
		enterRule(_localctx, 86, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(FOR);
			setState(333);
			match(PA);
			setState(334);
			comienzos_f();
			setState(335);
			match(PYCOMA);
			setState(336);
			argumentos();
			setState(337);
			match(PYCOMA);
			setState(338);
			argumentos();
			setState(339);
			match(PC);
			setState(340);
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
		enterRule(_localctx, 88, RULE_comienzos_f);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				opcion();
				setState(343);
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
		enterRule(_localctx, 90, RULE_opcion);
		try {
			setState(352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case DOUBLE:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				tipo();
				setState(349);
				declaracion();
				}
				break;
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
				setState(351);
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
		enterRule(_localctx, 92, RULE_cf_lista);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(COMA);
				setState(355);
				opcion();
				setState(356);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u016c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3h\n\3"+
		"\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\5\13\u0092\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\16\3\16\3\16\5"+
		"\16\u00a6\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00b0\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b9\n\21\3\22\3\22\3\22\3\22"+
		"\5\22\u00bf\n\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00c7\n\24\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u00ce\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\5\27\u00d8\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00e2"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00eb\n\32\3\33\3\33\3\33"+
		"\5\33\u00f0\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u00ff\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u0106\n\37\3"+
		" \3 \3 \3 \3 \5 \u010d\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u011a"+
		"\n#\3$\3$\5$\u011e\n$\3%\3%\3%\5%\u0123\n%\3&\3&\3&\5&\u0128\n&\3\'\3"+
		"\'\3(\3(\3(\5(\u012f\n(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\5*\u013f"+
		"\n*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\5,\u014d\n,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3-\3.\3.\3.\3.\5.\u015d\n.\3/\3/\3/\3/\5/\u0163\n/\3\60\3\60"+
		"\3\60\3\60\3\60\5\60\u016a\n\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\4\5\2\27\30\32"+
		"\32\34\34\3\2\37 \2\u0168\2`\3\2\2\2\4g\3\2\2\2\6m\3\2\2\2\bo\3\2\2\2"+
		"\nu\3\2\2\2\f}\3\2\2\2\16\u0081\3\2\2\2\20\u0083\3\2\2\2\22\u008c\3\2"+
		"\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u00a0\3\2\2\2\32\u00a5\3\2\2"+
		"\2\34\u00a7\3\2\2\2\36\u00af\3\2\2\2 \u00b8\3\2\2\2\"\u00be\3\2\2\2$\u00c0"+
		"\3\2\2\2&\u00c6\3\2\2\2(\u00cd\3\2\2\2*\u00cf\3\2\2\2,\u00d7\3\2\2\2."+
		"\u00d9\3\2\2\2\60\u00e1\3\2\2\2\62\u00ea\3\2\2\2\64\u00ef\3\2\2\2\66\u00f1"+
		"\3\2\2\28\u00f4\3\2\2\2:\u00fe\3\2\2\2<\u0105\3\2\2\2>\u010c\3\2\2\2@"+
		"\u010e\3\2\2\2B\u0110\3\2\2\2D\u0119\3\2\2\2F\u011d\3\2\2\2H\u0122\3\2"+
		"\2\2J\u0127\3\2\2\2L\u0129\3\2\2\2N\u012e\3\2\2\2P\u0130\3\2\2\2R\u013e"+
		"\3\2\2\2T\u0140\3\2\2\2V\u014c\3\2\2\2X\u014e\3\2\2\2Z\u015c\3\2\2\2\\"+
		"\u0162\3\2\2\2^\u0169\3\2\2\2`a\5\4\3\2ab\7\2\2\3b\3\3\2\2\2cd\5\6\4\2"+
		"de\5\4\3\2eh\3\2\2\2fh\3\2\2\2gc\3\2\2\2gf\3\2\2\2h\5\3\2\2\2ij\5\b\5"+
		"\2jk\7\13\2\2kn\3\2\2\2ln\5\26\f\2mi\3\2\2\2ml\3\2\2\2n\7\3\2\2\2op\5"+
		"\16\b\2pq\7!\2\2qr\7\6\2\2rs\5\n\6\2st\7\7\2\2t\t\3\2\2\2uv\5\f\7\2vw"+
		"\5\24\13\2w\13\3\2\2\2x~\5\16\b\2yz\5\16\b\2z{\7!\2\2{~\3\2\2\2|~\3\2"+
		"\2\2}x\3\2\2\2}y\3\2\2\2}|\3\2\2\2~\r\3\2\2\2\177\u0082\5\20\t\2\u0080"+
		"\u0082\5\22\n\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\17\3\2\2\2"+
		"\u0083\u0084\t\2\2\2\u0084\21\3\2\2\2\u0085\u0086\5\20\t\2\u0086\u0087"+
		"\7\16\2\2\u0087\u008d\3\2\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7\b\2\2"+
		"\u008a\u008b\7\t\2\2\u008b\u008d\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0088"+
		"\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\7\n\2\2\u008f\u0092\5\n\6\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u0090\3\2\2\2\u0092\25\3\2\2"+
		"\2\u0093\u0094\5\16\b\2\u0094\u0095\7!\2\2\u0095\u0096\7\6\2\2\u0096\u0097"+
		"\5\30\r\2\u0097\u0098\7\7\2\2\u0098\u0099\5\34\17\2\u0099\27\3\2\2\2\u009a"+
		"\u009b\5\16\b\2\u009b\u009c\7!\2\2\u009c\u009d\5\32\16\2\u009d\u00a1\3"+
		"\2\2\2\u009e\u009f\7\34\2\2\u009f\u00a1\5\32\16\2\u00a0\u009a\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\n\2\2\u00a3\u00a6"+
		"\5\30\r\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6\33\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa"+
		"\7\5\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\5 \21\2\u00ac\u00ad\5\36\20\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\5\"\22\2\u00b2\u00b3\7\13\2\2\u00b3"+
		"\u00b9\3\2\2\2\u00b4\u00b9\5L\'\2\u00b5\u00b6\5J&\2\u00b6\u00b7\7\13\2"+
		"\2\u00b7\u00b9\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5"+
		"\3\2\2\2\u00b9!\3\2\2\2\u00ba\u00bf\5$\23\2\u00bb\u00bf\5*\26\2\u00bc"+
		"\u00bf\5,\27\2\u00bd\u00bf\5\b\5\2\u00be\u00ba\3\2\2\2\u00be\u00bb\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00c1"+
		"\5\16\b\2\u00c1\u00c2\5&\24\2\u00c2\u00c3\5(\25\2\u00c3%\3\2\2\2\u00c4"+
		"\u00c7\7!\2\2\u00c5\u00c7\5*\26\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2"+
		"\2\2\u00c7\'\3\2\2\2\u00c8\u00c9\7\n\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb"+
		"\5(\25\2\u00cb\u00ce\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7!\2\2\u00d0\u00d1\7\3\2\2\u00d1"+
		"\u00d2\5,\27\2\u00d2+\3\2\2\2\u00d3\u00d4\5.\30\2\u00d4\u00d5\5,\27\2"+
		"\u00d5\u00d8\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d6"+
		"\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00da\5\62\32\2\u00da\u00db\5\60\31\2\u00db"+
		"/\3\2\2\2\u00dc\u00dd\7\21\2\2\u00dd\u00e2\5.\30\2\u00de\u00df\7\22\2"+
		"\2\u00df\u00e2\5.\30\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00de"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\61\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4"+
		"\u00e5\5.\30\2\u00e5\u00e6\7\7\2\2\u00e6\u00eb\3\2\2\2\u00e7\u00e8\5\66"+
		"\34\2\u00e8\u00e9\5\64\33\2\u00e9\u00eb\3\2\2\2\u00ea\u00e3\3\2\2\2\u00ea"+
		"\u00e7\3\2\2\2\u00eb\63\3\2\2\2\u00ec\u00ed\7\24\2\2\u00ed\u00f0\5\66"+
		"\34\2\u00ee\u00f0\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\65\3\2\2\2\u00f1\u00f2\58\35\2\u00f2\u00f3\5,\27\2\u00f3\67\3\2\2\2\u00f4"+
		"\u00f5\5<\37\2\u00f5\u00f6\5:\36\2\u00f69\3\2\2\2\u00f7\u00f8\7\16\2\2"+
		"\u00f8\u00ff\58\35\2\u00f9\u00fa\7\17\2\2\u00fa\u00ff\58\35\2\u00fb\u00fc"+
		"\7\20\2\2\u00fc\u00ff\58\35\2\u00fd\u00ff\3\2\2\2\u00fe\u00f7\3\2\2\2"+
		"\u00fe\u00f9\3\2\2\2\u00fe\u00fb\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff;\3"+
		"\2\2\2\u0100\u0106\5> \2\u0101\u0102\7\6\2\2\u0102\u0103\5\66\34\2\u0103"+
		"\u0104\7\7\2\2\u0104\u0106\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2"+
		"\2\2\u0106=\3\2\2\2\u0107\u010d\5B\"\2\u0108\u010d\7!\2\2\u0109\u010d"+
		"\5@!\2\u010a\u010d\7\25\2\2\u010b\u010d\7\"\2\2\u010c\u0107\3\2\2\2\u010c"+
		"\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2"+
		"\2\2\u010d?\3\2\2\2\u010e\u010f\t\3\2\2\u010fA\3\2\2\2\u0110\u0111\7!"+
		"\2\2\u0111\u0112\7\6\2\2\u0112\u0113\5D#\2\u0113\u0114\7\7\2\2\u0114C"+
		"\3\2\2\2\u0115\u0116\5F$\2\u0116\u0117\5H%\2\u0117\u011a\3\2\2\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0118\3\2\2\2\u011aE\3\2\2\2"+
		"\u011b\u011e\5*\26\2\u011c\u011e\5,\27\2\u011d\u011b\3\2\2\2\u011d\u011c"+
		"\3\2\2\2\u011eG\3\2\2\2\u011f\u0120\7\n\2\2\u0120\u0123\5D#\2\u0121\u0123"+
		"\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0121\3\2\2\2\u0123I\3\2\2\2\u0124"+
		"\u0125\7\36\2\2\u0125\u0128\5,\27\2\u0126\u0128\7\36\2\2\u0127\u0124\3"+
		"\2\2\2\u0127\u0126\3\2\2\2\u0128K\3\2\2\2\u0129\u012a\5N(\2\u012aM\3\2"+
		"\2\2\u012b\u012f\5P)\2\u012c\u012f\5T+\2\u012d\u012f\5X-\2\u012e\u012b"+
		"\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012fO\3\2\2\2\u0130"+
		"\u0131\7\33\2\2\u0131\u0132\7\6\2\2\u0132\u0133\5D#\2\u0133\u0134\7\7"+
		"\2\2\u0134\u0135\5R*\2\u0135Q\3\2\2\2\u0136\u0137\5*\26\2\u0137\u0138"+
		"\7\13\2\2\u0138\u013f\3\2\2\2\u0139\u013a\5,\27\2\u013a\u013b\7\13\2\2"+
		"\u013b\u013f\3\2\2\2\u013c\u013f\5\34\17\2\u013d\u013f\3\2\2\2\u013e\u0136"+
		"\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"S\3\2\2\2\u0140\u0141\7\23\2\2\u0141\u0142\7\6\2\2\u0142\u0143\5D#\2\u0143"+
		"\u0144\7\7\2\2\u0144\u0145\5R*\2\u0145\u0146\5V,\2\u0146U\3\2\2\2\u0147"+
		"\u0148\7\31\2\2\u0148\u014d\5T+\2\u0149\u014a\7\31\2\2\u014a\u014d\5R"+
		"*\2\u014b\u014d\3\2\2\2\u014c\u0147\3\2\2\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014b\3\2\2\2\u014dW\3\2\2\2\u014e\u014f\7\26\2\2\u014f\u0150\7\6\2\2"+
		"\u0150\u0151\5Z.\2\u0151\u0152\7\13\2\2\u0152\u0153\5D#\2\u0153\u0154"+
		"\7\13\2\2\u0154\u0155\5D#\2\u0155\u0156\7\7\2\2\u0156\u0157\5R*\2\u0157"+
		"Y\3\2\2\2\u0158\u0159\5\\/\2\u0159\u015a\5^\60\2\u015a\u015d\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u015b\3\2\2\2\u015d[\3\2\2\2"+
		"\u015e\u015f\5\16\b\2\u015f\u0160\5&\24\2\u0160\u0163\3\2\2\2\u0161\u0163"+
		"\5F$\2\u0162\u015e\3\2\2\2\u0162\u0161\3\2\2\2\u0163]\3\2\2\2\u0164\u0165"+
		"\7\n\2\2\u0165\u0166\5\\/\2\u0166\u0167\5^\60\2\u0167\u016a\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0164\3\2\2\2\u0169\u0168\3\2\2\2\u016a_\3\2\2\2"+
		" gm}\u0081\u008c\u0091\u00a0\u00a5\u00af\u00b8\u00be\u00c6\u00cd\u00d7"+
		"\u00e1\u00ea\u00ef\u00fe\u0105\u010c\u0119\u011d\u0122\u0127\u012e\u013e"+
		"\u014c\u015c\u0162\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}