package cts.s3.gr1091.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class CalculatorTaxeSalariu {
    // Folosim Map (interfata) in loc de HashMap (clasa concreta) pentru DIP
    // (Dependency Inversion Principle). D de la SOLID
    // Ne permite sa schimbam ulterior implementarea fara a afecta
    // restul codului.
    private static Map<String, Double> taxe;
    // ENUM
    // static private Map<String , Map<String,Double>> taxeSalariu;

    // Avantaje bloc static:
    // 1. Initializare unica (la incarcarea clasei), economisind resurse.
    static {
        taxe = new HashMap<>();
        taxe.put("CAS", 0.25);
        taxe.put("CASS", 0.2);
        taxe.put("Impozit", 0.1);
    }

    private CalculatorTaxeSalariu() {

    }

    // 1. Prin set -> extensibil
    // 2. Prin bloc static
    // 3. Prin constructor - NU
    // 4. Prin met statica init pe toate
    public static double calculeazaSalariuNet(double salariuBrut) {
        double salariuDupaCASsiCASS = salariuBrut * (1 - taxe.get("CAS") - taxe.get("CASS"));

        return salariuDupaCASsiCASS * (1 - taxe.get("Impozit"));
    }

}
