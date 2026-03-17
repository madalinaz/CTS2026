package cts.g1093.s05.v2.implementare;

import java.util.HashMap;
import java.util.Map;

public class CrocsPrototypeFactory {
    private static Map<String,Crocs> prototipuri;
    //aici se incarca prototipul
    //DOAR AICI APEL CONSTRUCTORI
    static{
        prototipuri = new HashMap<>();
        prototipuri.put("Disney", new CrocsDisney());
        prototipuri.put("LaMare", new CrocsLaMare());
        prototipuri.put("InSpatiu", new CrocsInSpatiu());
    }

    public static Crocs getPrototipuri(String topic) throws CloneNotSupportedException {
        Crocs copie = prototipuri.get(topic);
        return copie.clone();
    }
}
