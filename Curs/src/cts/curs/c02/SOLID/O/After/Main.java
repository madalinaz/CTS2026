package cts.curs.c02.SOLID.O.After;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double salariiTotal = 0.0;

        List<Angajat> listaAngajati = new ArrayList<>();
        listaAngajati.add(new Lucrator("Lucrator1", 12.0, 100));
        listaAngajati.add(new Lucrator("Lucrator2", 10.0, 100));
        listaAngajati.add(new Manager("Manager", 2, 20000));

        for (Angajat angajat : listaAngajati) {
            double salariu = angajat.calculSalariu();
            System.out.println(salariu);
            salariiTotal += salariu;
        }

        System.out.println("Salariu total " + salariiTotal);
    }
}
