package cts.curs.c02.SOLID.O.After2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Class<?>, RegulaSalarizare<?>> rules = new HashMap<>();
        register(rules, new SalariuLucrator());
        register(rules, new SalariuManager());

        List<Angajat> angajati = new ArrayList<>();
        angajati.add(new Lucrator("Lucrator1", 12.0, 100));
        angajati.add(new Lucrator("Lucrator2", 10.0, 100));
        angajati.add(new Manager("Manager", 10, 10000));

        double total = 0.0;

        for (Angajat a : angajati) {
            double salariu = calculSalariu(a, rules);
            System.out.println(salariu);
            total += salariu;
        }

        System.out.println("Salariu total " + total);
    }

    private static <T extends Angajat> void register(Map<Class<?>, RegulaSalarizare<?>> rules, RegulaSalarizare<T> rule) {
        rules.put(rule.tipAngajat(), rule);
    }

    private static double calculSalariu(Angajat a, Map<Class<?>, RegulaSalarizare<?>> rules) {
        RegulaSalarizare rule = rules.get(a.getClass());
        if (rule == null) {
            throw new IllegalArgumentException("Nu exista regula de salarizare pentru: " + a.getClass().getSimpleName());
        }
        return rule.calcul(a);
    }
}
