package composite.implementare;

public interface INod {
    boolean getEsteFragil();
    float getGreutate();

    void add(INod node);
    void remove(INod node);
    INod getNod(int index);

    //merge si cu throw unsupported exception e de runtime nu schimba semnatura
}
