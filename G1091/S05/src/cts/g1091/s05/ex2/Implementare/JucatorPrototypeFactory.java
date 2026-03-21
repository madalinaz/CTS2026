package cts.g1091.s05.ex2.Implementare;

import java.util.HashMap;
import java.util.Map;

public class JucatorPrototypeFactory {
    private static Map<String,AbstractJucator> prototipuri=null;

    static{
        prototipuri=new HashMap<String,AbstractJucator>();
        prototipuri.put("Fotbal",new JucatorFotbal());
        prototipuri.put("Bascket",new JucatorBascket());
    }

    public static AbstractJucator getPrototipJucator(String tipSport){
        AbstractJucator prototip = prototipuri.getOrDefault(tipSport,prototipuri.get("Fotbal"));

        try {
            return prototip.clone();
        } catch (CloneNotSupportedException e) {
           return null;
        }
    }
}
