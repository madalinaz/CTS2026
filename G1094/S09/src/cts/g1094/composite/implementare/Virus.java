package cts.g1094.composite.implementare;

public class Virus implements INod{

    private String denumireTulpina;
    private int nrCazuri;
    private float procentMortalitate;

    public Virus(String denumireTulpina, int nrCazuri, float procentMortalitate) {
        this.denumireTulpina = denumireTulpina;
        this.nrCazuri = nrCazuri;
        this.procentMortalitate = procentMortalitate;
    }

    @Override
    public int getTotalCazuri() {
        return this.nrCazuri;
    }

    @Override
    public float getProcentMortalitate() {
        return this.procentMortalitate;
    }

    @Override
    public void addNode(INod node) {
        throw new UnsupportedOperationException("Nu sunt specifice unui virus");
    }

    @Override
    public void removeNode(INod node) {
        throw new UnsupportedOperationException("Nu sunt specifice unui virus");
    }

    @Override
    public INod getNode(int index) {
        throw new UnsupportedOperationException("Nu sunt specifice unui virus");
    }
}
