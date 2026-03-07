package cts.s3.gr1091.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class TaxarePreferentiala implements ITaxare {

    private static Map<String, Double> taxe;

    static {
        taxe = new HashMap<>();
        taxe.put("CAS", 0.25);
        taxe.put("CASS", 0.2);
        taxe.put("Impozit", 0.1);
    }

    @Override
    public double getSalariuNetDinBrut(double salariuBrut) {
        // se poate schimba logica de aplicare taxe
        double salariuNet = salariuBrut * (1 - taxe.get("CAS") - taxe.get("CASS"));
        salariuNet = salariuBrut * (1 - taxe.get("Impozit"));
        return salariuNet;
    }
}
