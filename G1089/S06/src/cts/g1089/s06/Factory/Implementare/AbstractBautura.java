package cts.g1089.s06.Factory.Implementare;

public abstract class AbstractBautura implements IBautura{
    protected String nume;
    protected int volum;
    protected double pret;

    AbstractBautura(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }
}
