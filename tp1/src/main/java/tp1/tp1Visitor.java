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
	 * Visit a parse tree produced by {@link tp1Parser#funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunciones(tp1Parser.FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(tp1Parser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#dec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_func(tp1Parser.Dec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(tp1Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(tp1Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(tp1Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#t_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT_simple(tp1Parser.T_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#puntero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuntero(tp1Parser.PunteroContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#p_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_lista(tp1Parser.P_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#def_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_func(tp1Parser.Def_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(tp1Parser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#defp_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefp_lista(tp1Parser.Defp_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(tp1Parser.BloqueContext ctx);
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
	 * Visit a parse tree produced by {@link tp1Parser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(tp1Parser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(tp1Parser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#d_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_lista(tp1Parser.D_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(tp1Parser.AsignacionContext ctx);
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
	 * Visit a parse tree produced by {@link tp1Parser#llam_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlam_func(tp1Parser.Llam_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(tp1Parser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(tp1Parser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#a_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_lista(tp1Parser.A_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#ireturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIreturn(tp1Parser.IreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#inst_compuesta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_compuesta(tp1Parser.Inst_compuestaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#est_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEst_control(tp1Parser.Est_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(tp1Parser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#acciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcciones(tp1Parser.AccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(tp1Parser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#ielse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIelse(tp1Parser.IelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(tp1Parser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#comienzos_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComienzos_f(tp1Parser.Comienzos_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#opcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcion(tp1Parser.OpcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#cf_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCf_lista(tp1Parser.Cf_listaContext ctx);
}