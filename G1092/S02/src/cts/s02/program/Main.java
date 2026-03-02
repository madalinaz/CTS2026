package cts.s02.program;

import cts.s02.implementare.angajati.Manager;
import cts.s02.implementare.companie.Companie;

//tema: pe aceasta implementare : exista diferite tipuri de angajati
// ->avem plafon diferit pentru fiecare (salarizare)
// ex. anumite categorii de angajati sunt scutiti de anumite taxe

//clasa de taxare normala
//clasa taxareSpecila

public class Main {
    public static void main(String[] args) {
        Companie companie=new Companie("compania mea");
        companie.adaugaAngajat(new Manager("Alexandra", 1,"123"));
        companie.adaugaAngajat(new Manager("Andrei", 1,"123"));
        companie.adaugaAngajat(new Manager("Matei", 1,"123"));

        System.out.println(companie.calculFondSalaiu());
    }
}