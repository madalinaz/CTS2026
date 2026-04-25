package cts.g1091.s09.composite.implementare;

public interface INod {
    // add get remove
    int getTotalNrCazuri();

    boolean getEsteTransmisibila();

    boolean esteSigura(); // daca permite vizitare

    void addNod(INod nod);

    void removeNod(INod nod);

    INod getNode(int index);

}
