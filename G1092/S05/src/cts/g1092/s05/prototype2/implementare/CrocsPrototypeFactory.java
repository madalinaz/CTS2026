package cts.g1092.s05.prototype2.implementare;

import java.util.HashMap;
import java.util.Map;

public class CrocsPrototypeFactory {
    private static Map<String,AbstractClass> prototipuri;
    private static Map<String,Integer> nrCopii = new HashMap<>();

    static{
        prototipuri=new HashMap<>();
        prototipuri.put("Disney",new CrocsDisney());
        prototipuri.put("LaMare",new CrocsLaMare());
        prototipuri.put("Masini",new CrocsMasini());
    }

    public static AbstractClass getPrototip(String tematica){
        AbstractClass copie=prototipuri.get(tematica);
        if(copie == null){
            return null;
        }
        nrCopii.put(tematica, nrCopii.getOrDefault(tematica, 0) + 1);
        return copie.clone();
    }

    public static void afisareStatistici(){
        int totalConstructori = prototipuri.size();
        int totalCopii = 0;
        for(Map.Entry<String,Integer> entry : nrCopii.entrySet()){
            totalCopii += entry.getValue();
        }
        for(String tematica : prototipuri.keySet()){
            int copii = nrCopii.getOrDefault(tematica, 0);
            System.out.println(tematica + " - constructori: 1, copii: " + copii);
        }
    }
}
