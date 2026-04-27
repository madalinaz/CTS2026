package cts.g1094.composite.implementare;

public interface INod {
    int getTotalCazuri();
    float getProcentMortalitate();

    void addNode(INod node);
    void removeNode(INod node);
    INod getNode(int index);
}
