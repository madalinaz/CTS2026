package cts.junit.c14.mock;

public class MasinaMock implements IMasina{
    private int viteza;
    private String nrInmatriculare;
    private boolean esteIncepator;

    public MasinaMock(int viteza, boolean esteIncepator, String nrInmatriculare) {
        this.viteza = viteza;
        this.esteIncepator = esteIncepator;
        this.nrInmatriculare = nrInmatriculare;
    }

    public void setViteza(int viteza) {
        this.viteza = viteza;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public void setEsteIncepator(boolean esteIncepator) {
        this.esteIncepator = esteIncepator;
    }

    @Override
    public int getViteza() {
        return this.viteza;
    }

    @Override
    public String getNrInmatriculare() {
        return this.nrInmatriculare;
    }

    @Override
    public boolean esteIncepator() {
        return this.esteIncepator;
    }
}
