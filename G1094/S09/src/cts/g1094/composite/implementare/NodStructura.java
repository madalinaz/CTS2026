package cts.g1094.composite.implementare;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{

    private String label;
    private List<INod> listaCopii;

    public NodStructura(String label) {
        this.label = label;
        this.listaCopii = new ArrayList<>();
    }

    @Override
    public int getTotalCazuri() {
        int total = 0;
        for(INod nod : listaCopii){
            total += nod.getTotalCazuri();
        }
        return total;
    }

    @Override
    public float getProcentMortalitate() {
        throw new UnsupportedOperationException("Nu sunt specifice unui nod structura");
    }

    @Override
    public void addNode(INod node) {
        listaCopii.add(node);
    }

    @Override
    public void removeNode(INod node) {
        listaCopii.remove(node);
    }

    @Override
    public INod getNode(int index) {
        return listaCopii.get(index);
    }
}
