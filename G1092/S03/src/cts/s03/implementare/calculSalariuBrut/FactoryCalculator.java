package cts.s03.implementare.calculSalariuBrut;

import cts.s03.implementare.angajati.IAngajat;
import cts.s03.implementare.angajati.Lucrator;
import cts.s03.implementare.angajati.Manager;

import java.util.HashMap;
import java.util.Map;

public class FactoryCalculator {
    private static Map<String, ICalculator> mapa;
    static{
        mapa=new HashMap<>();
        mapa.put(Lucrator.class.toString(), new CalculatorLucrator());
        mapa.put(Manager.class.toString(), new CalculatorManager());

    }

    public static ICalculator getCalculatorBrut(IAngajat ang){
        return mapa.getOrDefault(ang.getClass().toString(), new CalculatorLucrator());
    }
}
