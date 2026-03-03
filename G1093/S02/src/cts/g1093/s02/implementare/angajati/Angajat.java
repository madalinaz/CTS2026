package cts.g1093.s02.implementare.angajati;

public abstract class Angajat implements IPayable{
    //incapsulare
    //package
    private String nume;
    private double salariuBrutBaza;

    public Angajat(String nume, double salariuBrutBaza) {
        this.nume = nume;
        this.salariuBrutBaza = salariuBrutBaza;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariuBrutBaza() {
        return salariuBrutBaza;
    }

    public void setSalariuBrutBaza(double salariuBrutBaza) {
        this.salariuBrutBaza = salariuBrutBaza;
    }
}
