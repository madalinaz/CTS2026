package cts.curs.c02.SOLID.O.After;

public class Lucrator implements Angajat{
    private String nume;
    private double tarifOra;
    private int nrOreLucrate;

    public Lucrator(String nume, double tarifOra, int nrOreLucrate) {
        this.nume = nume;
        this.tarifOra = tarifOra;
        this.nrOreLucrate = nrOreLucrate;
    }

    @Override
    public double calculSalariu() {
        return tarifOra * nrOreLucrate;
    }

    @Override
    public String getNume() {
        return nume;
    }

    public double getTarifOra() { return tarifOra; }
    public int getNrOreLucrate() { return nrOreLucrate; }
}
