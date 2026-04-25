package composite.implementare;

public class  Colet implements INod{

    private boolean esteFragil;
    private float greutate;

    public Colet(boolean esteFragil, float greutate) {
        this.esteFragil = esteFragil;
        this.greutate = greutate;
    }

    @Override
    public boolean getEsteFragil() {
        return esteFragil;
    }

    @Override
    public float getGreutate() {
        return greutate;
    }

    @Override
    public void add(INod node) {
        throw new UnsupportedOperationException("CANNOT ADD NODE TO A COLET");
    }

    @Override
    public void remove(INod node) {
        throw new UnsupportedOperationException("CANNOT REMOVE NODE FROM A COLET");
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException("CANNOT GET NODE FROM A COLET");
    }
}
