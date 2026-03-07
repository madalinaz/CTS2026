package cts.g1090.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class TaxarePreferentiala implements ITaxare{

    private static Map<String, Double> taxe=null;

    static {
        taxe = new HashMap<>();
        taxe.put("CAS",0.20);
        taxe.put("CASS",0.10);
        taxe.put("Impozit",0.00);
    }

    @Override
    public double calculSalariuNetDupaBrut(double salariuBrut) {
        double salariuNet = salariuBrut;
        salariuNet*=(1-taxe.get("CAS") - taxe.get("CASS"));
        salariuNet *=(1-taxe.get("Impozit"));
        return salariuNet;
    }
}
