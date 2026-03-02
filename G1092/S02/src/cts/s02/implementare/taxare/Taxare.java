package cts.s02.implementare.taxare;

import cts.s02.implementare.exceptii.ExceptieNumeClasa;

import java.util.HashMap;
import java.util.Map;

public class Taxare {
    public static Map<String, Double> taxe=new HashMap<>();

    //bloc static - gestioneaza doar campuri statice -> taxe trebuie sa fie static
    static{
        taxe.put("CAS",0.25);
        taxe.put("CASS",0.1);
        taxe.put("IMPOZIT",0.1);
    }

    //exceptie runtime si una custom
    //diferenta -> runtime nu trebuie tratata in signatura metodei, celelalte trebuiesc
    public static void adauareTaxaNoua(String numeTaxa, double valoare) throws ExceptieNumeClasa {
        if (taxe.containsKey(numeTaxa)){
            throw new ExceptieNumeClasa("Taxa "+numeTaxa+" exista ceva!");
        }
        taxe.put(numeTaxa, valoare);
    }

    public static double getTaxa(String numeTaxa) throws ExceptieNumeClasa {
        if (!taxe.containsKey(numeTaxa)){
            throw new ExceptieNumeClasa("Taxa "+numeTaxa+" nu exista!");
        }
        return taxe.get(numeTaxa);
    }
}
