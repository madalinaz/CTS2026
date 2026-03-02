package cts.s2.gr1091.implementare.angajati;

public class Lucrator extends Angajat
{
    public Lucrator(String nume, double salariuBaza) {
        super(nume, salariuBaza);
    }

    @Override
    public double calculSalariu() {
        return 0;
    }

    @Override
    public String getNume() {
        return "";
    }
}
