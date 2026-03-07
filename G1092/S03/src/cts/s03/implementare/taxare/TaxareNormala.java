package cts.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class TaxareNormala implements ITaxare{

    public static Map<String, Double> taxe=new HashMap<>();

    static{
        taxe.put("CAS",0.25);
        taxe.put("CASS",0.1);
        taxe.put("IMPOZIT",0.1);
    }


    @Override
    public double calculSalariuNet(double salariuBrut) {
        double salariuNet=salariuBrut
                - taxe.get("CAS")*salariuBrut
                -taxe.get("CASS")+salariuBrut;
        salariuNet=(1-taxe.get("IMPOZIT"))*salariuNet;
        return salariuNet;
    }
}
