// Generated from /home/tomas/FACULTAD/TC/facultad-TC/listener/src/main/java/listener/listener.g4 by ANTLR 4.9.2

    package listener;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link listenerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface listenerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link listenerParser#si}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(listenerParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#opciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpciones(listenerParser.OpcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(listenerParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#dec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_func(listenerParser.Dec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(listenerParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(listenerParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(listenerParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#p_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_lista(listenerParser.P_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#def_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_func(listenerParser.Def_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(listenerParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#defp_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefp_lista(listenerParser.Defp_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(listenerParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(listenerParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(listenerParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#inst_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_simple(listenerParser.Inst_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(listenerParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(listenerParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#d_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD_lista(listenerParser.D_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(listenerParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(listenerParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#negacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacion(listenerParser.NegacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(listenerParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(listenerParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#rel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel(listenerParser.RelContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#opar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpar(listenerParser.OparContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(listenerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(listenerParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#ovalor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOvalor(listenerParser.OvalorContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(listenerParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(listenerParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#llam_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlam_func(listenerParser.Llam_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(listenerParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(listenerParser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#a_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA_lista(listenerParser.A_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#ireturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIreturn(listenerParser.IreturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#est_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEst_control(listenerParser.Est_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(listenerParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#acciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAcciones(listenerParser.AccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(listenerParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#ielse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIelse(listenerParser.IelseContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(listenerParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#comienzos_f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComienzos_f(listenerParser.Comienzos_fContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#opcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcion(listenerParser.OpcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#cf_lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCf_lista(listenerParser.Cf_listaContext ctx);
	/**
	 * Visit a parse tree produced by {@link listenerParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(listenerParser.OperacionContext ctx);
}