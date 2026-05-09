package cts.s11.flyweight.implementare;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeRecomandari {
    private static Map<String,IRecomandare> colectieRecomandari;
    static{
        colectieRecomandari=new HashMap<>();
        colectieRecomandari.put("Sare-Zahar",new Recomandare("Evitarea consumului de zahar si apa"));
        colectieRecomandari.put("2 litri",new Recomandare("Bea 2 litri de apa pe zi"));
        colectieRecomandari.put("Somn",new Recomandare("Minim 8 ore de somn"));
    }

    public static IRecomandare getRecomandare(String cheie){
        if(!colectieRecomandari.containsKey(cheie)){
            throw new RuntimeException("Nu exista aceasta recomandare "+cheie);
        }
        return colectieRecomandari.get(cheie);
    }
}
