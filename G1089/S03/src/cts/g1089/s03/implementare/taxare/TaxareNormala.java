package cts.g1089.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class TaxareNormala implements ITaxare{

    private static Map<String,Double> taxe=new HashMap<>();

    TaxareNormala() {
    }

    static//Bloc static
    {
        taxe.put("CAS",0.25);
        taxe.put("CASS",0.10);
        taxe.put("Impozit",0.10);
    }

    @Override
    public double calculNetDinBrut(double salariuBrut) {
        double salariuNet= 0;

        salariuNet = salariuBrut-salariuBrut* taxe.get("CAS")
                    -salariuBrut*taxe.get("CASS");

        salariuNet=salariuNet*(1-taxe.get("Impozit"));

        return salariuNet;
    }
}
