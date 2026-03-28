package cts.g1090.s06.factory.implementare;

public abstract class AbstractBautura implements Bautura{
    protected String nume;
    protected int volum;
    protected double pret;

    public AbstractBautura(String nume, int volum, double pret) {
        this.nume = nume;
        this.volum = volum;
        this.pret = pret;
    }

    @Override
    public double getPret() {
        return this.pret;
    }
}
