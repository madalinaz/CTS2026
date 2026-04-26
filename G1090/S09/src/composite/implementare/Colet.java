package composite.implementare;

public class Colet implements INod {

    private boolean esteFragil;
    private float greutate;
    private String detalii;


    public Colet(boolean esteFragil, float greutate, String detalii) {
        this.esteFragil = esteFragil;
        this.greutate = greutate;
        this.detalii = detalii;
    }

    @Override
    public boolean calculFragil() {
        return this.esteFragil;
    }

    @Override
    public float calculGreutateTotala() {
        return this.greutate;
    }

    @Override
    public void adaugaNod(INod nod) {
        throw new UnsupportedOperationException("Nu se poate");

    }

    @Override
    public void stergeNod(INod nod) {
        throw new UnsupportedOperationException("Nu se poate");
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException("Nu se poate");
    }


}
