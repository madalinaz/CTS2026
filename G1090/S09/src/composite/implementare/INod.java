package composite.implementare;

public interface INod {

    public boolean calculFragil();
    public float calculGreutateTotala();
    public void adaugaNod(INod nod);
    public void stergeNod(INod nod);
    public INod getNod(int index);


}
