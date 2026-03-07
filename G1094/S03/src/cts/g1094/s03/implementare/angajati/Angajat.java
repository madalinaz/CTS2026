package cts.g1094.s03.implementare.angajati;
//putem pastra angajat cls abstracta si sa nu implementeze ea calculeazaSalariu
//default package visibility
//lucram doar pe incapsulare de tip private la nivel de clase

public abstract class Angajat implements IPayable{
    private String nume;
    private double salariuBaza;
    private String COR;

    public Angajat(String nume, double salariuBaza, String COR) {
        this.nume = nume;
        this.salariuBaza = salariuBaza;
        this.COR = COR;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }

    public void setSalariuBaza(double salariuBaza) {
        this.salariuBaza = salariuBaza;
    }

    @Override
    public String getCOR() {
        return COR;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", salariuBaza=" + salariuBaza +
                '}';
    }
}
