package cts.g1091.s09.composite.implementare;

public class Virus implements INod {
    private String denumire;
    private int nrCazuri;
    private boolean esteExtremTransmisibil;

    public Virus(String denumire, int nrCazuri, boolean esteExtremTransmisibil) {
        this.denumire = denumire;
        this.nrCazuri = nrCazuri;
        this.esteExtremTransmisibil = esteExtremTransmisibil;
    }

    @Override
    public int getTotalNrCazuri() {
        return this.nrCazuri;
    }

    @Override
    public boolean getEsteTransmisibila() {
        return this.esteExtremTransmisibil;
    }

    @Override
    public boolean esteSigura() {
        throw new UnsupportedOperationException("Nu se poate.");
    }

    @Override
    public void addNod(INod nod) {
        throw new UnsupportedOperationException("Nu se poate.");
    }

    @Override
    public void removeNod(INod nod) {
        throw new UnsupportedOperationException("Nu se poate.");
    }

    @Override
    public INod getNode(int index) {
        throw new UnsupportedOperationException("Nu se poate.");
    }
}
