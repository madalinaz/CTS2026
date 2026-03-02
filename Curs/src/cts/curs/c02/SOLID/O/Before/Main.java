package cts.curs.c02.SOLID.O.Before;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double salariiTotal = 0.0;
        CalculatorSalariu calculSalariu = new CalculatorSalariu();
        Lucrator lucrator1 = new Lucrator("Lucrator1", 12.0, 100);
        Lucrator lucrator2 = new Lucrator("Lucrator2", 10.0, 100);
        Manager manager = new Manager("Manager", 10, 2);

        List<Object> listaAngajati = new ArrayList<Object>();
        listaAngajati.add(lucrator1);
        listaAngajati.add(lucrator2);
        listaAngajati.add(manager);

        for (int i = 0; i < listaAngajati.size(); i++) {
            if (listaAngajati.get(i) instanceof Lucrator) {
                salariiTotal += calculSalariu.calculSalariuLucrator((Lucrator) listaAngajati.get(i));
                System.out.println("" + calculSalariu.calculSalariuLucrator((Lucrator) listaAngajati.get(i)));
            } else if (listaAngajati.get(i) instanceof Manager) {
                salariiTotal += calculSalariu.calculSalariuManager((Manager) listaAngajati.get(i));
                System.out.println("" + calculSalariu.calculSalariuManager((Manager) listaAngajati.get(i)));
            }
        }

        System.out.println("Salariu total " + salariiTotal);
    }
}
