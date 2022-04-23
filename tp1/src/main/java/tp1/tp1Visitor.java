// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/tp1/src/main/java/tp1/tp1.g4 by ANTLR 4.8

    package tp1;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tp1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tp1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tp1Parser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(tp1Parser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(tp1Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(tp1Parser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#inst_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_simple(tp1Parser.Inst_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(tp1Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(tp1Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(tp1Parser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#vaoas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaoas(tp1Parser.VaoasContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(tp1Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(tp1Parser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(tp1Parser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(tp1Parser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(tp1Parser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(tp1Parser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(tp1Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#decfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfuncion(tp1Parser.DecfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#llamfuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamfuncion(tp1Parser.LlamfuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(tp1Parser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(tp1Parser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(tp1Parser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(tp1Parser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(tp1Parser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#opar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpar(tp1Parser.OparContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(tp1Parser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(tp1Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(tp1Parser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#ovalor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOvalor(tp1Parser.OvalorContext ctx);
}