// Generated from /home/tomas/FACULTAD/TC/facultad-TC/parentesis/src/main/java/parentesis/parentesis.g4 by ANTLR 4.8

    package parentesis;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link parentesisParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface parentesisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link parentesisParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(parentesisParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link parentesisParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(parentesisParser.SContext ctx);
}