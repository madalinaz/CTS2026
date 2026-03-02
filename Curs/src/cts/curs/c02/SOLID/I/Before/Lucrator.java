package cts.curs.c02.SOLID.I.Before;

public class Lucrator implements Angajat{
    public String nume;

    @Override
    public void lucreaza() {
        System.out.println("Angajatul " + nume + " lucreaza!");
    }

    @Override
    public void concediu() {
        System.out.println("Angajatul " + nume + " este in concediu!");
    }

    @Override
    public void gestioneazaSubAngajati() {
        // TODO
    }

    @Override
    public void acordaConcediu(Angajat a) {
        // TODO
    }
}
