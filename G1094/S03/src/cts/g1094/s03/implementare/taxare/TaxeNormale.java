package cts.g1094.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class TaxeNormale implements ITaxe {
    private static Map<String, Double> taxe;

    static {
        taxe = new HashMap<>();
        taxe.put("CAS", 0.25);
        taxe.put("CASS", 0.10);
        taxe.put("IMPOZIT", 0.10);

        System.out.println("S-a initializat!");
    }

    @Override
    public double calculNetDinBrut(double salariuBrut) {
        //pas 2 - calcul salariu net

        double salariuNet = salariuBrut * (1- taxe.get("CAS") - taxe.get("CASS"));
        salariuNet *= 1 - taxe.get("IMPOZIT");
        return salariuNet;
    }
}
