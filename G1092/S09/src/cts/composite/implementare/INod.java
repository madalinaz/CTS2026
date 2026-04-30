package cts.composite.implementare;

public interface INod {
    void addNode(INod node);
    INod getNode(int index);
    void removeNode(INod node);
    int getTotalAngajati();
    float getSalariu();
}
