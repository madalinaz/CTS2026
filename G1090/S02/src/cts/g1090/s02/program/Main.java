package cts.g1090.s02.program;

import cts.g1090.s02.implementare.angajati.Companie;
import cts.g1090.s02.implementare.angajati.Manager;
import cts.g1090.s02.implementare.taxare.Taxare;

public class Main {
    public static void main(String[] args) {
        Companie companie1=new Companie("Companie1");

        companie1.adaugaAngajat(new Manager("Manager1",2,100.0,2000));
        companie1.adaugaAngajat(new Manager("M2",2,100.0,2000));
        companie1.adaugaAngajat(new Manager("M3",2,100.0,2000));

        System.out.println(companie1.getSalariu());

    }
}