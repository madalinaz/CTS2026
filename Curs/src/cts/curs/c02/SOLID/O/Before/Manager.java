package cts.curs.c02.SOLID.O.Before;

public class Manager {
    private String nume;
    private int nrProiecte;
    private double salariu;

    public Manager(String nume, double salariu, int nrProiecte) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrProiecte = nrProiecte;
    }

    public double getSalariuBaza() {
        return salariu;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }
}
