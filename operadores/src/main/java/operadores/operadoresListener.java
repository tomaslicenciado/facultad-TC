// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/operadores/src/main/java/operadores/operadores.g4 by ANTLR 4.8

  package operadores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link operadoresParser}.
 */
public interface operadoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link operadoresParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(operadoresParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(operadoresParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(operadoresParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(operadoresParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(operadoresParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(operadoresParser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(operadoresParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(operadoresParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(operadoresParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(operadoresParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(operadoresParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(operadoresParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#opar}.
	 * @param ctx the parse tree
	 */
	void enterOpar(operadoresParser.OparContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#opar}.
	 * @param ctx the parse tree
	 */
	void exitOpar(operadoresParser.OparContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(operadoresParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(operadoresParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(operadoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(operadoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(operadoresParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(operadoresParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link operadoresParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(operadoresParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link operadoresParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(operadoresParser.ValorContext ctx);
}