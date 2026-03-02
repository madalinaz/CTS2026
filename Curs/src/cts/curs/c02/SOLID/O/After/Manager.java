package cts.curs.c02.SOLID.O.After;

public class Manager implements Angajat {
    private String nume;
    private int nrProiecte;
    private double salariuBaza;

    public Manager(String nume, int nrProiecte, double salariuBaza) {
        this.nume = nume;
        this.nrProiecte = nrProiecte;
        this.salariuBaza = salariuBaza;
    }

    @Override
    public double calculSalariu() {
        return salariuBaza + nrProiecte * 1000;
    }

    @Override
    public String getNume() {
        return nume;
    }

    public int getNrProiecte() { return nrProiecte; }
    public double getSalariuBaza() { return salariuBaza; }
}
