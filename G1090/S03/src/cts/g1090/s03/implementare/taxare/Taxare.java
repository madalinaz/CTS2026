package cts.g1090.s03.implementare.taxare;

import cts.g1090.s03.implementare.exceptii.ExceptieNumeTaxare;

import java.util.HashMap;
import java.util.Map;

public class Taxare {
    private static Map<String, Double> taxe=new HashMap<>();
    //depindem de abstract, nu de concret
    //map=interfata, hashMap, TreeMap nu sunt interfete!!
    //clasa depinde de interfata map, nu de implementarea hashMap

    private String ceva;

    //bloc static
    //se apeleaza implicit la utilizarea clasei pentru prima data (fata de functii statice)
    static {
        taxe.put("CAS",0.20);
        taxe.put("CASS",0.10);
        taxe.put("Impozit",0.10);
    }

    //meth de adaugare de noi taxe
    public static void adaugaTaxaNoua(String denumire, Double procent) throws ExceptieNumeTaxare {

        //verificam daca exista deja acea clasa in mapa -> aruncam exceptie
        if(taxe.containsKey(denumire)){
            throw new ExceptieNumeTaxare();
        }
        //in caz contrar, aduagam
        taxe.put(denumire,procent);
    }


    public static Double getTaxa(String denumire)  {
        return taxe.get(denumire);
    }

    //meth non-statice (taxare) , pot accesa totusi campurile statice (map)

}

