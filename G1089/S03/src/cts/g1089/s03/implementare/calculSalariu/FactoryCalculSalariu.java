package cts.g1089.s03.implementare.calculSalariu;

import cts.g1089.s03.implementare.angajati.Angajat;
import cts.g1089.s03.implementare.angajati.Lucrator;
import cts.g1089.s03.implementare.angajati.Manager;

import java.util.HashMap;
import java.util.Map;

public class FactoryCalculSalariu {
    private static Map<String,ICalculSalariu> mapa = new HashMap<>();
    static {
        mapa.put(Lucrator.class.getName(),new CalculSalariuLucrator());
        mapa.put(Manager.class.getName(),new CalculSalariuManager());
    }
    public static ICalculSalariu getCalculatorDupaAngajat(Angajat a){
        return mapa.getOrDefault(a.getClass().getName(),new CalculSalariuLucrator());
    }
}
