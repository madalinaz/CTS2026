package cts.g1090.s03.program;

import cts.g1090.s03.implementare.angajati.Companie;
import cts.g1090.s03.implementare.angajati.Lucrator;
import cts.g1090.s03.implementare.angajati.Manager;

public class Main {
    public static void main(String[] args) {
        Companie companie1=new Companie("Companie1");

        companie1.adaugaAngajat(new Manager("Manager1",2,100.0,2000, "1111"));
        companie1.adaugaAngajat(new Manager("M2",2,100.0,2000, "2222"));
        companie1.adaugaAngajat(new Manager("M3",2,100.0,2000, "3333"));
        companie1.adaugaAngajat(new Lucrator("Gigel", 1200, 0.2, "1234"));

        System.out.println(companie1.getSalariu());
    }
}