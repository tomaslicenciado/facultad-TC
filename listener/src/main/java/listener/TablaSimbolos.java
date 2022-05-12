package listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
    List<Map<String,ID>> simbolos = new ArrayList<Map<String,ID>>();

    public void addContexto(){
        simbolos.add(new HashMap<String,ID>());
    }

    public void delContexto(){
        simbolos.remove(simbolos.size() -1);
    }

    public ID buscarId (String id){
        ID r = null;
        int index = 0;
        while (r == null && index < simbolos.size()){
            r = simbolos.get(index).get(id);
            index++;
        }
        return r;
    }

    public ID buscarIdLocal (String id){
        return (simbolos.size() != 0? simbolos.get(simbolos.size()-1).get(id) : null);
    }

    public void addId (ID id){
        simbolos.get(simbolos.size()-1).put(id.idName, id);
    }
}

