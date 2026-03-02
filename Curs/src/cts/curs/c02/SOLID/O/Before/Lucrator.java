package cts.curs.c02.SOLID.O.Before;

public class Lucrator {
    private String nume;
    private double tarifOra;
    private int nrOreLucrate;

    public Lucrator(String nume, double tarifOra, int nrOreLucrate) {
        this.nume = nume;
        this.tarifOra = tarifOra;
        this.nrOreLucrate = nrOreLucrate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getTarifOra() {
        return tarifOra;
    }

    public void setTarifOra(double tarifOra) {
        this.tarifOra = tarifOra;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }
}
