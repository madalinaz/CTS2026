package cts.g1091.s05.ex2.Implementare;

public class Exercitiu {
    private String denumire;
    private int nrRepetitii;

    public Exercitiu(String denumire, int nrRepetitii) {
        this.denumire = denumire;
        this.nrRepetitii = nrRepetitii;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getNrRepetitii() {
        return nrRepetitii;
    }

    @Override
    public String toString() {
        return "Exercitiu{" +
                "denumire='" + denumire + '\'' +
                ", nrRepetitii=" + nrRepetitii +
                '}';
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setNrRepetitii(int nrRepetitii) {
        this.nrRepetitii = nrRepetitii;
    }
}
