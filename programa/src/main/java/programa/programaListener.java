// Generated from /media/tomas/Datos/FACULTAD/5 - TC/programa/src/main/java/programa/programa.g4 by ANTLR 4.8

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
	/**
	 * Enter a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#inst_simple}.
	 * @param ctx the parse tree
	 */
	void enterInst_simple(programaParser.Inst_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#inst_simple}.
	 * @param ctx the parse tree
	 */
	void exitInst_simple(programaParser.Inst_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(programaParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(programaParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(programaParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(programaParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(programaParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(programaParser.IwhileContext ctx);
}