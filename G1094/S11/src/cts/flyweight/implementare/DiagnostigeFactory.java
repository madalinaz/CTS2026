package cts.flyweight.implementare;

import java.util.HashMap;
import java.util.Map;

public class DiagnostigeFactory {
    private static Map<String,IFlyweight> colectie = new HashMap<>();

    //versiune eagger cu bloc static + colectie statica
    static{
        colectie.put("APA", new Recomandare("Consumati minim 2 litrii de apa pe zi"));
        colectie.put("SOMN", new Recomandare("Dormiti minim 8 ore"));
        colectie.put("SARE", new Recomandare("Evitati consumul excesiv de sare"));
    }
    public static IFlyweight getRecomandare(String tipRecomandare){

        return colectie.get(tipRecomandare);
    }

}
