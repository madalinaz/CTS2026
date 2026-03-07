package cts.s03.program;

import cts.s03.implementare.angajati.Lucrator;
import cts.s03.implementare.angajati.Manager;
import cts.s03.implementare.companie.Companie;

//tema: pe aceasta implementare : exista diferite tipuri de angajati
// ->avem plafon diferit pentru fiecare (salarizare)
// ex. anumite categorii de angajati sunt scutiti de anumite taxe

//clasa de taxare normala
//clasa taxareSpecila

public class Main {
    public static void main(String[] args) {
        Companie companie=new Companie("compania mea");
        companie.adaugaAngajat(new Manager("Alexandra", 1,"123", "222"));
        companie.adaugaAngajat(new Manager("Andrei", 1,"123", "222"));
        companie.adaugaAngajat(new Manager("Matei", 1,"123", "111"));
        //222=taxare normala
        //111=taxare preferentiala-> cercetare
        companie.adaugaAngajat(new Lucrator("Gigel", 3000, 0.2, "554"));
        companie.adaugaAngajat(new Lucrator("Ionel", 2000, 0.3, "111"));

        System.out.println(companie.calculFondSalaiu());
    }
}