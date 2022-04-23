// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/operadores/src/main/java/operadores/operadores.g4 by ANTLR 4.8

  package operadores;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link operadoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface operadoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link operadoresParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(operadoresParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(operadoresParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(operadoresParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(operadoresParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(operadoresParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(operadoresParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#opar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpar(operadoresParser.OparContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(operadoresParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(operadoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(operadoresParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link operadoresParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(operadoresParser.ValorContext ctx);
}