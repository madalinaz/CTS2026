package cts.s2.gr1091.implementare.angajati;

public abstract class Angajat implements IAngajat {
    public String nume;
    public double salariuBaza;

    public Angajat(String nume, double salariuBaza) {
        this.nume = nume;
        this.salariuBaza = salariuBaza;
    }
}
