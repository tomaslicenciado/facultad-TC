// Generated from /home/tomas/FACULTAD/TC/facultad-TC/parentesis/src/main/java/parentesis/parentesis.g4 by ANTLR 4.8

    package parentesis;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link parentesisParser}.
 */
public interface parentesisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link parentesisParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(parentesisParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link parentesisParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(parentesisParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link parentesisParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(parentesisParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link parentesisParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(parentesisParser.SContext ctx);
}