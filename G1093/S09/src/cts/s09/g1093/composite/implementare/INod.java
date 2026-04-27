package cts.s09.g1093.composite.implementare;

public interface INod {
    int getTotalCazuri(); //pt toate nodurile
    float getRataMortalitate(); //doar pt nod frunza
    boolean esteSiguraDeVizitat(); //doar pt noduri structura

    void addNod(INod nod);
    void removeNode(INod nod);
    INod getNode(int index);

}
