package cts.g1094.s02.implementare.taxare;
import cts.g1094.s02.implementare.exceptii.ExceptieTaxa;

import java.util.HashMap;
import java.util.Map;

public class Taxe {
    //nu folosim hashmap ca sa nu depindem de concret, putem apoi sa folosim hash, tree, etc
    private static Map<String, Double> taxe;

    //1. constructor NU
    //2. setter NU
    //3. metoda statica care init pe toate
    //4. static block stim sigur ca se executa

    static {
        taxe = new HashMap<>();
        taxe.put("CAS", 0.25);
        taxe.put("CASS", 0.10);
        taxe.put("IMPOZIT", 0.10);

        System.out.println("S-a initializat!");
    }

    public static double getProcentTaxa1(String taxa) throws ExceptieTaxa {
        if(!taxe.containsKey(taxa)){
            //sa nu optam pt surround try catch pt ca e degeaba
            throw new ExceptieTaxa();
        }
        return taxe.get(taxa);
    }

}
