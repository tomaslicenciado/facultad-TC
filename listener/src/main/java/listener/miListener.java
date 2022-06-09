package listener;

import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

import listener.listenerParser.AsignacionContext;
import listener.listenerParser.BloqueContext;
import listener.listenerParser.D_listaContext;
import listener.listenerParser.Dec_funcContext;
import listener.listenerParser.Def_funcContext;
import listener.listenerParser.Llam_funcContext;
import listener.listenerParser.OpalContext;
import listener.listenerParser.OparContext;
import listener.listenerParser.OperacionContext;
import listener.listenerParser.OvalorContext;
import listener.listenerParser.ParametroContext;
import listener.listenerParser.ParamsContext;
import listener.listenerParser.RelacionalContext;
import listener.listenerParser.TermContext;
import listener.listenerParser.ValorContext;
import listener.listenerParser.DeclaracionContext;
import listener.listenerParser.DeclaracionesContext;
import listener.listenerParser.P_listaContext;

public class miListener extends listenerBaseListener{
    private TablaSimbolos tabla = new TablaSimbolos();
    listenerParser parser;
    String[] ruleNames;
    //private String t;
    
    miListener(listenerParser parser){
        this.parser = parser;
        this.ruleNames = parser.getRuleNames();
        tabla.addContexto("GLOBAL");
    }

    @Override
    public void exitDeclaraciones(DeclaracionesContext ctx) {
        String i;
        String t = ctx.tipo().getText();
        DeclaracionContext declaracion = ctx.declaracion();
        D_listaContext dLista = ctx.d_lista();
        boolean iniciar = false;

        do {
            if (declaracion.ID() == null){
                i = declaracion.asignacion().ID().getText();
                iniciar = true;
            }
            else{
                i = declaracion.ID().getText();
            }

            if (tabla.buscarIdLocal(i)!=null){
                int linea = ctx.getStart().getLine();
                System.out.println("Err línea "+linea+": Redeclaración de variable \'"+
                i+"\' en el mismo contexto");
            }
            else{
                tabla.addId(new Variable(i, t));
                if (iniciar) tabla.buscarIdLocal(i).inicializar();
            }

            declaracion = dLista.declaracion();
            dLista = dLista.d_lista();
        } while (dLista != null);

    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        String reglaPadre = ruleNames[ctx.getParent().getRuleIndex()];
        if (reglaPadre!="declaracion"){
            String i = ctx.ID().getText();
            ID v = tabla.buscarIdLocal(i);
            if(v!=null){
                String tipo = v.tipo;
                if (tiposIncompatibles(tipo, getTipoAsignado(ctx.opal())))
                    System.out.println("El tipo asignado es incompatible con el tipo declarado para "+v.idName);
                else
                    v.inicializar();
            }
            else{
                v = tabla.buscarId(i);
                if(v!=null){
                    String tipo = v.tipo;
                    if (tiposIncompatibles(tipo, getTipoAsignado(ctx.opal())))
                        System.out.println("El tipo asignado es incompatible con el tipo declarado para "+v.idName);
                    else
                        v.inicializar();
                }
                else{
                    int linea = ctx.getStart().getLine();
                    System.out.println("Err línea "+linea+": La variable \'"+
                    i +"\' no ha sido previamente declarada");
                }
            }
        }
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        ParserRuleContext context = ctx.getParent();
        String identificador;
        if (context.getRuleIndex() == 10){
            identificador = ((Def_funcContext) context).ID().getText();
        }
        else{
            identificador = context.getParent().getChild(0).getText();
        }  
        
        tabla.addContexto(identificador);
        String rule = this.ruleNames[ctx.getParent().getRuleIndex()];
        if (rule == "def_func"){
            ParamsContext params = ((Def_funcContext)ctx.getParent()).params();
            while (params!=null && params.getChildCount()!=0){
                if (params.ID()!=null){
                    String id = params.ID().getText();
                    String tipo = params.tipo().getText();
                    tabla.addId(new Variable(id,tipo));
                }
                if (params.defp_lista().getChildCount()!=0){
                    params = params.defp_lista().params();
                }
                else params = null;
            }
        }
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        tabla.delContexto();
    }

    @Override
    public void exitDec_func(Dec_funcContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        Funcion func = new Funcion(id, tipo);
        P_listaContext pLista = ctx.parametros().p_lista();
        ParametroContext pm = ctx.parametros().parametro();
        while (pm != null && pm.getChildCount()!=0){
            func.addArg(pm.tipo().getText());
            if (pLista.getChildCount()!=0){
                pm = pLista.parametros().parametro();
                pLista = pLista.parametros().p_lista();
            }
            else{
                pm = null;
            }
        }
        tabla.addId(func);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        //System.out.println(node.getParent());
    }

    @Override
    public void exitDef_func(Def_funcContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        Funcion func = new Funcion(id, tipo);
        func.inicializar();
        ParamsContext params = ctx.params();

        while (params != null && params.getChildCount() !=0){
            if (params.tipo()!=null) func.addArg(params.tipo().getText());
            else func.addArg(params.VOID().getText());

            if (params.defp_lista().getChildCount() != 0){
                params = params.defp_lista().params();
            }
            else{
                params = null;
            }
        }
        
        tabla.addId(func);
    }

    @Override
    public void exitValor(ValorContext ctx) {
        if (ctx.ID()!=null){
            String id = ctx.ID().getText();
            ID i = tabla.buscarIdLocal(id);
            if (i==null) i = tabla.buscarId(id);
            if (i==null) {
                int linea = ctx.getStart().getLine();
                System.out.println("Err linea "+linea+": El identificador "+
                id+" no ha sido declarado");
            }
            else{
                i.usar();
            }
        }
    }

    @Override
    public void exitLlam_func(Llam_funcContext ctx) {
        String id = ctx.ID().getText();
        ID i = tabla.buscarIdLocal(id);
        if (i==null) i = tabla.buscarId(id);
        if (i==null) {
            int linea = ctx.getStart().getLine();
            System.out.println("Err linea "+linea+": El identificador "+
            id+" no ha sido declarado");
        }
        else{
            boolean correctParams = true;
            List<String> args = ((Funcion)i).getArgs();
            //Realizar ciclo para corroborar que los argumentos pasados a la llamada de la función-----------------------------------------------------
            //corresponden con los tipos definidos en la firma de la misma
            i.usar();
        }
    }

    private String getTipoAsignado(ParserRuleContext ctx){
        String tipo = "";
        String rule = this.ruleNames[ctx.getRuleIndex()];
        if (rule == "opal"){
            if (getTipoAsignado(((OpalContext)ctx).relacional()) == "void")
                tipo = "void";
            else if ((((OpalContext)ctx).negacion() == null && ((OpalContext)ctx).logic() == null))
                tipo = getTipoAsignado(((OpalContext)ctx).relacional());
            else tipo = "int";
        }
        else if (rule == "relacional"){
            int hijos = ((RelacionalContext)ctx).getChildCount();
            if (hijos == 3) tipo = getTipoAsignado(((RelacionalContext)ctx).opal());
            else if (((RelacionalContext)ctx).rel()!= null){
                if (getTipoAsignado(((RelacionalContext)ctx).opar()) == "void")
                    tipo = "void";
                else if (getTipoAsignado(((RelacionalContext)ctx).rel().opar()) == "void")
                    tipo = "void";
                tipo = "int";
            }
            else tipo = getTipoAsignado(((RelacionalContext)ctx).opar());
        }
        else if (rule == "opar"){
            if (((OparContext)ctx).operacion()!=null){
                String tTipo = getTipoAsignado(((OparContext)ctx).term());
                String oTipo = getTipoAsignado(((OparContext)ctx).operacion());
                if (tTipo == "void" || oTipo == "void") tipo = "void";
                else if (tTipo == "double" || oTipo == "double") tipo = "double";
                else if (tTipo == "char" || oTipo == "char") tipo = "char";
                else tipo = "int";
            }
            else tipo = getTipoAsignado(((OparContext)ctx).term());
        }
        else if (rule == "operacion") tipo = getTipoAsignado(((OperacionContext)ctx).opar());
        else if (rule == "term"){
            if (((TermContext)ctx).mult() != null){
                String oTipo = getTipoAsignado(((TermContext)ctx).ovalor());
                String mTipo = getTipoAsignado(((TermContext)ctx).mult());
                if (mTipo == "void" || oTipo == "void") tipo = "void";
                else if (mTipo == "double" || oTipo == "double") tipo = "double";
                else if (mTipo == "char" || oTipo == "char") tipo = "char";
                else tipo = "int";
            }
            else tipo = getTipoAsignado(((TermContext)ctx).ovalor());
        }
        else if (rule == "ovalor"){
            if (((OvalorContext)ctx).getChildCount() == 1) tipo = getTipoAsignado(((OvalorContext)ctx).valor());
            else tipo = getTipoAsignado(((OvalorContext)ctx).opar());
        }
        else if (rule == "valor"){
            if (((ValorContext)ctx).llam_func() != null) 
                tipo = this.tabla.buscarId(((ValorContext)ctx).llam_func().ID().getText()).tipo;
            else if (((ValorContext)ctx).ID() != null)
                tipo = this.tabla.buscarId(((ValorContext)ctx).ID().getText()).tipo;
            else if (((ValorContext)ctx).numero() != null)
                tipo = (((ValorContext)ctx).numero().ENTERO()!=null?"int":"double");
            else if (((ValorContext)ctx).VCHAR()!=null)
                tipo = "char";
            else tipo = "char*";
        }
        return tipo;
    }

    private boolean tiposIncompatibles(String a, String b){
        if (a == "void" || b == "void") return true;
        else return false;
    }

}
