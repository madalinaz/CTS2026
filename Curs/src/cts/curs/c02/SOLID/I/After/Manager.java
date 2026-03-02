package cts.curs.c02.SOLID.I.After;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Angajat ,Managerial{
    private String nume;
    private final List<Angajat> listaSubordonati = new ArrayList<>();

    public Manager(String nume) {
        this.nume = nume;
    }

    public void adaugaSubordonat(Angajat a) {
        listaSubordonati.add(a);
    }

    @Override
    public void lucreaza() {
        System.out.println("Managerul " + nume + " lucreaza!");
    }

    @Override
    public void concediu() {
        System.out.println("Managerul " + nume + " este in concediu!");
    }

    @Override
    public void gestioneazaSubAngajati() {
        for (Angajat a : listaSubordonati) {
            a.lucreaza();
        }
    }

    @Override
    public void acordaConcediu(Angajat a) {
        if (listaSubordonati.contains(a)) {
            a.concediu();
        }
    }

    public String getNume() {
        return nume;
    }
}
