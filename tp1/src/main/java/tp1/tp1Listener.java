// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/tp1/src/main/java/tp1/tp1.g4 by ANTLR 4.8

    package tp1;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tp1Parser}.
 */
public interface tp1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tp1Parser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(tp1Parser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(tp1Parser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(tp1Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(tp1Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(tp1Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(tp1Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#inst_simple}.
	 * @param ctx the parse tree
	 */
	void enterInst_simple(tp1Parser.Inst_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#inst_simple}.
	 * @param ctx the parse tree
	 */
	void exitInst_simple(tp1Parser.Inst_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(tp1Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(tp1Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(tp1Parser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(tp1Parser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(tp1Parser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(tp1Parser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#vaoas}.
	 * @param ctx the parse tree
	 */
	void enterVaoas(tp1Parser.VaoasContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#vaoas}.
	 * @param ctx the parse tree
	 */
	void exitVaoas(tp1Parser.VaoasContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(tp1Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(tp1Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(tp1Parser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(tp1Parser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(tp1Parser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(tp1Parser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(tp1Parser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(tp1Parser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(tp1Parser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(tp1Parser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(tp1Parser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(tp1Parser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(tp1Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(tp1Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#decfuncion}.
	 * @param ctx the parse tree
	 */
	void enterDecfuncion(tp1Parser.DecfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#decfuncion}.
	 * @param ctx the parse tree
	 */
	void exitDecfuncion(tp1Parser.DecfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#llamfuncion}.
	 * @param ctx the parse tree
	 */
	void enterLlamfuncion(tp1Parser.LlamfuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#llamfuncion}.
	 * @param ctx the parse tree
	 */
	void exitLlamfuncion(tp1Parser.LlamfuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(tp1Parser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(tp1Parser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(tp1Parser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(tp1Parser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(tp1Parser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(tp1Parser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(tp1Parser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(tp1Parser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(tp1Parser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(tp1Parser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#opar}.
	 * @param ctx the parse tree
	 */
	void enterOpar(tp1Parser.OparContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#opar}.
	 * @param ctx the parse tree
	 */
	void exitOpar(tp1Parser.OparContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(tp1Parser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(tp1Parser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(tp1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(tp1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(tp1Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(tp1Parser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#ovalor}.
	 * @param ctx the parse tree
	 */
	void enterOvalor(tp1Parser.OvalorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#ovalor}.
	 * @param ctx the parse tree
	 */
	void exitOvalor(tp1Parser.OvalorContext ctx);
}