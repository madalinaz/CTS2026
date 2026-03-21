package cts.g1089.s05.ex1.Implementare.prototype2;

import java.util.HashMap;
import java.util.Map;

public class CrocsPrototypeFactory {
    private static Map<String,AbstractCrocs> prototipuri;
    static {
        prototipuri = new HashMap<>();
        prototipuri.put("Disney",new CrocsDisney());
        prototipuri.put("Fotbal",new CrocsFotbal());
        prototipuri.put("La Mare",new CrocsLaMare());
    }

    public static AbstractCrocs getPrototip(String tematica){
        try {
            return prototipuri.getOrDefault(tematica,prototipuri.get("La Mare")).clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


}
