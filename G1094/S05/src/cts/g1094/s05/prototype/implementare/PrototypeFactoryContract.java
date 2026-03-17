package cts.g1094.s05.prototype.implementare;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactoryContract {
    //o colectie de prototipuri
    private static Map<String, IContract> prototipuri;
    public static int nrPrototipuri=0;
    public static int nrObiecte=0;

    static {
        prototipuri = new HashMap<>();

        //se incarca colectia de prototipuri folosind constructorii
        prototipuri.put("Botez", new Contract());
        nrPrototipuri++;
        prototipuri.put("Nunta", new Contract());
        nrPrototipuri++;
    }

    public static IContract getPrototip(String tip) throws CloneNotSupportedException {
        IContract copie = prototipuri.get(tip);

        if(copie==null){
            return null;
        }
        nrObiecte++;

        return copie.getCopie();
    }
}
