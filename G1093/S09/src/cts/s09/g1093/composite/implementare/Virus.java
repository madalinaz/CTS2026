package cts.s09.g1093.composite.implementare;

public class Virus implements INod{
    private String tulpina;
    private int nrCazuri;
    private float rataMortalitate;

    public Virus(String tulpina, int nrCazuri, float rataMortalitate) {
        this.tulpina = tulpina;
        this.nrCazuri = nrCazuri;
        this.rataMortalitate = rataMortalitate;
    }

    @Override
    public int getTotalCazuri() {
        return this.nrCazuri;
    }

    @Override
    public float getRataMortalitate() {
        return this.rataMortalitate;
    }

    @Override
    public boolean esteSiguraDeVizitat() {
        throw new UnsupportedOperationException("Nu este pentru o funza");
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException("Nu este pentru o funza");
    }

    @Override
    public void removeNode(INod nod) {
        throw new UnsupportedOperationException("Nu este pentru o funza");
    }

    @Override
    public INod getNode(int index) {
        throw new UnsupportedOperationException("Nu este pentru o funza");
    }
}
