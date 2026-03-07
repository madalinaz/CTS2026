package cts.g1089.s03.implementare.taxare;

import cts.g1089.s03.implementare.exceptii.ExceptieNumeTaxa;

import java.util.HashMap;
import java.util.Map;

public class Taxe {
    private static Map<String,Double> taxe=new HashMap<>();

    static//Bloc static
    {
        taxe.put("CAS",0.25);
        taxe.put("CASS",0.10);
        taxe.put("Impozit",0.10);
    }
//    Metoda de adaugare de taxa noua (daca exista deja,
//    arunca exceptie)
    public static void adaugaTaxa(String taxa,double procent) throws ExceptieNumeTaxa {
        if(taxe.get(taxa)==null){
            taxe.put(taxa,procent);
        }else{
            throw new ExceptieNumeTaxa();
//            throw new RuntimeException();
        }
    }
//    Metoda care consulta un anume procent
    public static double getProcent(String taxa) throws ExceptieNumeTaxa {
        if(taxe.containsKey(taxa)){
            return taxe.get(taxa);
        }else{
            throw new ExceptieNumeTaxa();
        }
    }

}
