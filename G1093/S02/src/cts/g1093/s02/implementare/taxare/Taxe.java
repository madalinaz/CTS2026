package cts.g1093.s02.implementare.taxare;

import cts.g1093.s02.implementare.exceptii.ExceptieTaxa;

import java.util.HashMap;
import java.util.Map;

public class Taxe {
    //map ofera posibilitatea pt D depindem de abstract, nu de concret
    private static Map<String, Double> taxe;
    //1. constructor
    //2. metoda de initializare pt toate
    //3. setter
    //4. bloc static - rulare o singura data a blocului de initializare
    static{
        System.out.println("Init");
        taxe=new HashMap<>();
        taxe.put("Impozit", 0.10);
        taxe.put("CAS", 0.25);
        taxe.put("CASS", 0.10);
    }

    public static double getProcentDupaNume(String numeTaxa) throws ExceptieTaxa {
        if(taxe.containsKey(numeTaxa)){
            return taxe.get(numeTaxa);
        }
        else{
            throw new ExceptieTaxa();
        }
    }

    public static Double getProcentDupaNume2(String numeTaxa){

        return taxe.get(numeTaxa); //aici folosim null din existenta lui Double - isi trateaza singur null
    }
}
