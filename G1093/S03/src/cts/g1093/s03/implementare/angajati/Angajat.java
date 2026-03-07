package cts.g1093.s03.implementare.angajati;

import cts.g1093.s03.implementare.cim.CIM;

public abstract class Angajat implements IPayable{
    //incapsulare
    //package
    private String nume;
    private double salariuBrutBaza;
    private CIM cim;

    public Angajat(String nume, double salariuBrutBaza, CIM cim) {
        this.nume = nume;
        this.salariuBrutBaza = salariuBrutBaza;
        this.cim=cim;
    }

    public CIM getCim() {
        return cim;
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

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariuBrutBaza=" + salariuBrutBaza +
                '}';
    }
}
