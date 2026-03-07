package cts.s3.gr1091.implementare.angajati;

public abstract class Angajat implements IAngajat {
    private String nume;
    private double salariuBaza;
    private String COR;

    public Angajat(String nume, double salariuBaza, String COR) {
        this.nume = nume;
        this.salariuBaza = salariuBaza;
        this.COR = COR;
    }

    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public String getCOR() {
        return COR;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }
}
