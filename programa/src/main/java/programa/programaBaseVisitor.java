// Generated from /home/tomas/FACULTAD/TC/facultad-TC/programa/src/main/java/programa/programa.g4 by ANTLR 4.8

    package programa;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link programaVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class programaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements programaVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(programaParser.ProgContext ctx) { return visitChildren(ctx); }
}