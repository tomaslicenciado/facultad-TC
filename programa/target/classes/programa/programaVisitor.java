// Generated from /media/tomas/DATOS/FACULTAD/5 - TC/programa/target/classes/programa/programa.g4 by ANTLR 4.8

    package programa;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link programaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface programaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link programaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(programaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#inst_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_simple(programaParser.Inst_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(programaParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#vaoas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaoas(programaParser.VaoasContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(programaParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(programaParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(programaParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(programaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(programaParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(programaParser.TipoContext ctx);
}