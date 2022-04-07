// Generated from /home/tomas/FACULTAD/TC/facultad-TC/programa/src/main/java/programa/programa.g4 by ANTLR 4.8

    package programa;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programaParser}.
 */
public interface programaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link programaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(programaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(programaParser.ProgContext ctx);
}