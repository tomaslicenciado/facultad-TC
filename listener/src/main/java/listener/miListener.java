package listener;

import org.antlr.v4.runtime.ParserRuleContext;

import listener.listenerParser.AsignacionContext;
import listener.listenerParser.BloqueContext;
import listener.listenerParser.D_listaContext;
import listener.listenerParser.Dec_funcContext;
import listener.listenerParser.Def_funcContext;
import listener.listenerParser.ParametroContext;
import listener.listenerParser.DeclaracionContext;
import listener.listenerParser.DeclaracionesContext;
import listener.listenerParser.P_listaContext;

public class miListener extends listenerBaseListener{
    private TablaSimbolos tabla = new TablaSimbolos();
    //private String t;
    
    miListener(){
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
                System.out.println("Err: redeclaración de variable en el mismo contexto");
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
        if (ctx.getParent().getRuleIndex()!=18){
            String i = ctx.ID().getText();
            ID v = tabla.buscarIdLocal(i);
            if(v!=null){
                v.inicializar();
                v.usar();
            }
            else{
                v = tabla.buscarId(i);
                if(v!=null){
                    v.inicializar();
                    v.usar();
                }
                else{
                    System.out.println("Err: Variable no declarada");
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
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        System.out.println(tabla);
        tabla.delContexto();
    }

    @Override
    public void exitDec_func(Dec_funcContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        Funcion func = new Funcion(id, tipo);
        P_listaContext pLista = ctx.parametros().p_lista();
        ParametroContext pm = ctx.parametros().parametro();
        while (pm!=null){
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

    // @Override
    // public void exitDef_func(Def_funcContext ctx) {
    //     // TODO Auto-generated method stub
    //     super.exitDef_func(ctx);
    // }

    
}
