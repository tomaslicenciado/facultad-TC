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
		T__0=1, LA=2, LC=3, PA=4, PC=5, COMA=6, PYCOMA=7, SUMA=8, RESTA=9, MULT=10, 
		DIV=11, MOD=12, AND=13, OR=14, IF=15, CMP=16, VCHAR=17, FOR=18, INT=19, 
		CHAR=20, DOUBLE=21, WHILE=22, VOID=23, RETURN=24, ENTERO=25, DOBLE=26, 
		ID=27, STRING=28, BCOMENTARIO=29, COMENTARIO=30, WS=31, OTRO=32;
	public static final int
		RULE_si = 0, RULE_instrucciones = 1, RULE_instruccion = 2, RULE_inst_simple = 3, 
		RULE_asignacion = 4, RULE_declaracion = 5, RULE_lista = 6, RULE_vaoas = 7, 
		RULE_bloque = 8, RULE_iwhile = 9, RULE_iif = 10, RULE_ifor = 11, RULE_valor = 12, 
		RULE_numero = 13, RULE_tipo = 14, RULE_decfuncion = 15, RULE_llamfuncion = 16, 
		RULE_operaciones = 17, RULE_opal = 18, RULE_logic = 19, RULE_relacional = 20, 
		RULE_rel = 21, RULE_opar = 22, RULE_operacion = 23, RULE_term = 24, RULE_mult = 25, 
		RULE_ovalor = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"si", "instrucciones", "instruccion", "inst_simple", "asignacion", "declaracion", 
			"lista", "vaoas", "bloque", "iwhile", "iif", "ifor", "valor", "numero", 
			"tipo", "decfuncion", "llamfuncion", "operaciones", "opal", "logic", 
			"relacional", "rel", "opar", "operacion", "term", "mult", "ovalor"
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
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
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
			setState(54);
			instrucciones();
			setState(55);
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
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LA:
			case IF:
			case FOR:
			case INT:
			case CHAR:
			case DOUBLE:
			case WHILE:
			case VOID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				instruccion();
				setState(58);
				instrucciones();
				}
				break;
			case EOF:
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
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public DecfuncionContext decfuncion() {
			return getRuleContext(DecfuncionContext.class,0);
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
		enterRule(_localctx, 4, RULE_instruccion);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				inst_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				bloque();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				iwhile();
				setState(66);
				instruccion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				iif();
				setState(69);
				instruccion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				ifor();
				setState(72);
				instruccion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				decfuncion();
				setState(75);
				instruccion();
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

	public static class Inst_simpleContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode PYCOMA() { return getToken(tp1Parser.PYCOMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public LlamfuncionContext llamfuncion() {
			return getRuleContext(LlamfuncionContext.class,0);
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
		enterRule(_localctx, 6, RULE_inst_simple);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				asignacion();
				setState(80);
				match(PYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				declaracion();
				setState(83);
				match(PYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				llamfuncion();
				setState(86);
				match(PYCOMA);
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public LlamfuncionContext llamfuncion() {
			return getRuleContext(LlamfuncionContext.class,0);
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
		enterRule(_localctx, 8, RULE_asignacion);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__0);
				setState(92);
				valor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(ID);
				setState(94);
				match(T__0);
				setState(95);
				llamfuncion();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VaoasContext vaoas() {
			return getRuleContext(VaoasContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
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
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			tipo();
			setState(99);
			vaoas();
			setState(100);
			lista();
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

	public static class ListaContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(tp1Parser.COMA, 0); }
		public VaoasContext vaoas() {
			return getRuleContext(VaoasContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(COMA);
				setState(103);
				vaoas();
				setState(104);
				lista();
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

	public static class VaoasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public VaoasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vaoas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterVaoas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitVaoas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitVaoas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaoasContext vaoas() throws RecognitionException {
		VaoasContext _localctx = new VaoasContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vaoas);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
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
		enterRule(_localctx, 16, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LA);
			setState(114);
			instrucciones();
			setState(115);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(tp1Parser.WHILE, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
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
		enterRule(_localctx, 18, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(WHILE);
			setState(118);
			match(PA);
			setState(119);
			operaciones();
			setState(120);
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(tp1Parser.IF, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
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
		enterRule(_localctx, 20, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IF);
			setState(123);
			match(PA);
			setState(124);
			operaciones();
			setState(125);
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(tp1Parser.FOR, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
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
		enterRule(_localctx, 22, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(FOR);
			setState(128);
			match(PA);
			setState(129);
			operaciones();
			setState(130);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_valor);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ID);
				}
				break;
			case ENTERO:
			case DOBLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				numero();
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
		enterRule(_localctx, 26, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(tp1Parser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(tp1Parser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(tp1Parser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(tp1Parser.VOID, 0); }
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
		enterRule(_localctx, 28, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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

	public static class DecfuncionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public VaoasContext vaoas() {
			return getRuleContext(VaoasContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public DecfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterDecfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitDecfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitDecfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecfuncionContext decfuncion() throws RecognitionException {
		DecfuncionContext _localctx = new DecfuncionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			tipo();
			setState(141);
			match(ID);
			setState(142);
			match(PA);
			setState(143);
			vaoas();
			setState(144);
			lista();
			setState(145);
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

	public static class LlamfuncionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tp1Parser.ID, 0); }
		public TerminalNode PA() { return getToken(tp1Parser.PA, 0); }
		public VaoasContext vaoas() {
			return getRuleContext(VaoasContext.class,0);
		}
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode PC() { return getToken(tp1Parser.PC, 0); }
		public LlamfuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamfuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterLlamfuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitLlamfuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitLlamfuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlamfuncionContext llamfuncion() throws RecognitionException {
		LlamfuncionContext _localctx = new LlamfuncionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_llamfuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(ID);
			setState(148);
			match(PA);
			setState(149);
			vaoas();
			setState(150);
			lista();
			setState(151);
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
		enterRule(_localctx, 34, RULE_operaciones);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PA:
			case ENTERO:
			case DOBLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				opal();
				setState(154);
				operaciones();
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
		enterRule(_localctx, 36, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			relacional();
			setState(160);
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
		enterRule(_localctx, 38, RULE_logic);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(AND);
				setState(163);
				opal();
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(OR);
				setState(165);
				opal();
				}
				break;
			case PA:
			case PC:
			case ENTERO:
			case DOBLE:
			case ID:
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
		enterRule(_localctx, 40, RULE_relacional);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				opar();
				setState(170);
				rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(PA);
				setState(173);
				opal();
				setState(174);
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
		enterRule(_localctx, 42, RULE_rel);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(CMP);
				setState(179);
				opar();
				}
				break;
			case PA:
			case PC:
			case AND:
			case OR:
			case ENTERO:
			case DOBLE:
			case ID:
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
		enterRule(_localctx, 44, RULE_opar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			term();
			setState(184);
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

	public static class OperacionContext extends ParserRuleContext {
		public TerminalNode SUMA() { return getToken(tp1Parser.SUMA, 0); }
		public OparContext opar() {
			return getRuleContext(OparContext.class,0);
		}
		public TerminalNode RESTA() { return getToken(tp1Parser.RESTA, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tp1Listener ) ((tp1Listener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tp1Visitor ) return ((tp1Visitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operacion);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(SUMA);
				setState(187);
				opar();
				}
				break;
			case RESTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(RESTA);
				setState(189);
				opar();
				}
				break;
			case PA:
			case PC:
			case AND:
			case OR:
			case CMP:
			case ENTERO:
			case DOBLE:
			case ID:
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
		enterRule(_localctx, 48, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			ovalor();
			setState(194);
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
		enterRule(_localctx, 50, RULE_mult);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(MULT);
				setState(197);
				term();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(DIV);
				setState(199);
				term();
				}
				break;
			case MOD:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(MOD);
				setState(201);
				term();
				}
				break;
			case PA:
			case PC:
			case SUMA:
			case RESTA:
			case AND:
			case OR:
			case CMP:
			case ENTERO:
			case DOBLE:
			case ID:
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
		enterRule(_localctx, 52, RULE_ovalor);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
			case DOBLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				valor();
				}
				break;
			case PA:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(PA);
				setState(207);
				opar();
				setState(208);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3@\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6c\n"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\5\tr\n\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5"+
		"\23\u00a0\n\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00aa\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00b3\n\26\3\27\3\27\3\27\5\27"+
		"\u00b8\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u00c2\n\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00ce\n\33\3\34"+
		"\3\34\3\34\3\34\3\34\5\34\u00d5\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\4\3\2\33\34\4\2\25\27\31\31"+
		"\2\u00d2\28\3\2\2\2\4?\3\2\2\2\6O\3\2\2\2\bZ\3\2\2\2\nb\3\2\2\2\fd\3\2"+
		"\2\2\16m\3\2\2\2\20q\3\2\2\2\22s\3\2\2\2\24w\3\2\2\2\26|\3\2\2\2\30\u0081"+
		"\3\2\2\2\32\u0088\3\2\2\2\34\u008a\3\2\2\2\36\u008c\3\2\2\2 \u008e\3\2"+
		"\2\2\"\u0095\3\2\2\2$\u009f\3\2\2\2&\u00a1\3\2\2\2(\u00a9\3\2\2\2*\u00b2"+
		"\3\2\2\2,\u00b7\3\2\2\2.\u00b9\3\2\2\2\60\u00c1\3\2\2\2\62\u00c3\3\2\2"+
		"\2\64\u00cd\3\2\2\2\66\u00d4\3\2\2\289\5\4\3\29:\7\2\2\3:\3\3\2\2\2;<"+
		"\5\6\4\2<=\5\4\3\2=@\3\2\2\2>@\3\2\2\2?;\3\2\2\2?>\3\2\2\2@\5\3\2\2\2"+
		"AP\5\b\5\2BP\5\22\n\2CD\5\24\13\2DE\5\6\4\2EP\3\2\2\2FG\5\26\f\2GH\5\6"+
		"\4\2HP\3\2\2\2IJ\5\30\r\2JK\5\6\4\2KP\3\2\2\2LM\5 \21\2MN\5\6\4\2NP\3"+
		"\2\2\2OA\3\2\2\2OB\3\2\2\2OC\3\2\2\2OF\3\2\2\2OI\3\2\2\2OL\3\2\2\2P\7"+
		"\3\2\2\2QR\5\n\6\2RS\7\t\2\2S[\3\2\2\2TU\5\f\7\2UV\7\t\2\2V[\3\2\2\2W"+
		"X\5\"\22\2XY\7\t\2\2Y[\3\2\2\2ZQ\3\2\2\2ZT\3\2\2\2ZW\3\2\2\2[\t\3\2\2"+
		"\2\\]\7\35\2\2]^\7\3\2\2^c\5\32\16\2_`\7\35\2\2`a\7\3\2\2ac\5\"\22\2b"+
		"\\\3\2\2\2b_\3\2\2\2c\13\3\2\2\2de\5\36\20\2ef\5\20\t\2fg\5\16\b\2g\r"+
		"\3\2\2\2hi\7\b\2\2ij\5\20\t\2jk\5\16\b\2kn\3\2\2\2ln\3\2\2\2mh\3\2\2\2"+
		"ml\3\2\2\2n\17\3\2\2\2or\7\35\2\2pr\5\n\6\2qo\3\2\2\2qp\3\2\2\2r\21\3"+
		"\2\2\2st\7\4\2\2tu\5\4\3\2uv\7\5\2\2v\23\3\2\2\2wx\7\30\2\2xy\7\6\2\2"+
		"yz\5$\23\2z{\7\7\2\2{\25\3\2\2\2|}\7\21\2\2}~\7\6\2\2~\177\5$\23\2\177"+
		"\u0080\7\7\2\2\u0080\27\3\2\2\2\u0081\u0082\7\24\2\2\u0082\u0083\7\6\2"+
		"\2\u0083\u0084\5$\23\2\u0084\u0085\7\7\2\2\u0085\31\3\2\2\2\u0086\u0089"+
		"\7\35\2\2\u0087\u0089\5\34\17\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2"+
		"\2\u0089\33\3\2\2\2\u008a\u008b\t\2\2\2\u008b\35\3\2\2\2\u008c\u008d\t"+
		"\3\2\2\u008d\37\3\2\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7\35\2\2\u0090"+
		"\u0091\7\6\2\2\u0091\u0092\5\20\t\2\u0092\u0093\5\16\b\2\u0093\u0094\7"+
		"\7\2\2\u0094!\3\2\2\2\u0095\u0096\7\35\2\2\u0096\u0097\7\6\2\2\u0097\u0098"+
		"\5\20\t\2\u0098\u0099\5\16\b\2\u0099\u009a\7\7\2\2\u009a#\3\2\2\2\u009b"+
		"\u009c\5&\24\2\u009c\u009d\5$\23\2\u009d\u00a0\3\2\2\2\u009e\u00a0\3\2"+
		"\2\2\u009f\u009b\3\2\2\2\u009f\u009e\3\2\2\2\u00a0%\3\2\2\2\u00a1\u00a2"+
		"\5*\26\2\u00a2\u00a3\5(\25\2\u00a3\'\3\2\2\2\u00a4\u00a5\7\17\2\2\u00a5"+
		"\u00aa\5&\24\2\u00a6\u00a7\7\20\2\2\u00a7\u00aa\5&\24\2\u00a8\u00aa\3"+
		"\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa"+
		")\3\2\2\2\u00ab\u00ac\5.\30\2\u00ac\u00ad\5,\27\2\u00ad\u00b3\3\2\2\2"+
		"\u00ae\u00af\7\6\2\2\u00af\u00b0\5&\24\2\u00b0\u00b1\7\7\2\2\u00b1\u00b3"+
		"\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3+\3\2\2\2\u00b4"+
		"\u00b5\7\22\2\2\u00b5\u00b8\5.\30\2\u00b6\u00b8\3\2\2\2\u00b7\u00b4\3"+
		"\2\2\2\u00b7\u00b6\3\2\2\2\u00b8-\3\2\2\2\u00b9\u00ba\5\62\32\2\u00ba"+
		"\u00bb\5\60\31\2\u00bb/\3\2\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00c2\5.\30"+
		"\2\u00be\u00bf\7\13\2\2\u00bf\u00c2\5.\30\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\61\3\2\2"+
		"\2\u00c3\u00c4\5\66\34\2\u00c4\u00c5\5\64\33\2\u00c5\63\3\2\2\2\u00c6"+
		"\u00c7\7\f\2\2\u00c7\u00ce\5\62\32\2\u00c8\u00c9\7\r\2\2\u00c9\u00ce\5"+
		"\62\32\2\u00ca\u00cb\7\16\2\2\u00cb\u00ce\5\62\32\2\u00cc\u00ce\3\2\2"+
		"\2\u00cd\u00c6\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cc"+
		"\3\2\2\2\u00ce\65\3\2\2\2\u00cf\u00d5\5\32\16\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\u00d2\5.\30\2\u00d2\u00d3\7\7\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00cf\3\2"+
		"\2\2\u00d4\u00d0\3\2\2\2\u00d5\67\3\2\2\2\20?OZbmq\u0088\u009f\u00a9\u00b2"+
		"\u00b7\u00c1\u00cd\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}