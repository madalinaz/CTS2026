package cts.g1091.s09.chainOfResponsability.implementare;

public class Persoana {
    private String nume;
    private float salariu;
    private int nrLuni;

    public Persoana(String nume, float salariu, int nrLuni) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrLuni = nrLuni;
    }

    public String getNume() {
        return nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public int getNrLuni() {
        return nrLuni;
    }
}
