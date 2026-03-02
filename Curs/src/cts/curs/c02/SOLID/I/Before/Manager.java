package cts.curs.c02.SOLID.I.Before;

import java.util.List;

public class Manager implements Angajat{
    private String nume;
    private List<Angajat> listaSubordonati;

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
        for (Angajat a : listaSubordonati)
            a.lucreaza();
    }

    @Override
    public void acordaConcediu(Angajat a) {
        for (Angajat ang : listaSubordonati) {
            if (ang == a) {
                ang.concediu();
            }
        }
    }
}
