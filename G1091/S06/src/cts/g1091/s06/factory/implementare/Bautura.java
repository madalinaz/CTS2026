package cts.g1091.s06.factory.implementare;

public abstract class Bautura  implements IBautura {
    protected String nume;
    protected int volum;
    protected float pret;

    public Bautura(String nume, int volum, float pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
