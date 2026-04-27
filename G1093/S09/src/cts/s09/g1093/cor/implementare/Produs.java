package cts.s09.g1093.cor.implementare;

public class Produs {
    private String denumire;
    private float pret;
    private float ratingMediu;
    private int nrRecenzii;
    private boolean estePremium;
    private float procentReducere;

    public Produs(String denumire, float pret, int nrRecenzii, float ratingMediu, float procentReducere, boolean estePremium) {
        this.denumire = denumire;
        this.pret = pret;
        this.nrRecenzii = nrRecenzii;
        this.ratingMediu = ratingMediu;
        this.procentReducere = procentReducere;
        this.estePremium = estePremium;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    public float getRatingMediu() {
        return ratingMediu;
    }

    public int getNrRecenzii() {
        return nrRecenzii;
    }

    public boolean isEstePremium() {
        return estePremium;
    }

    public float getProcentReducere() {
        return procentReducere;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", ratingMediu=" + ratingMediu +
                ", nrRecenzii=" + nrRecenzii +
                ", estePremium=" + estePremium +
                ", procentReducere=" + procentReducere +
                '}';
    }
}
