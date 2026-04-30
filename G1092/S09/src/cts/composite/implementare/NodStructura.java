package cts.composite.implementare;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod {
    private List<INod> listaCopii;
    private String label;

    public NodStructura(String label) {
        this.label = label;
        this.listaCopii = new ArrayList<INod>();
    }

    @Override
    public void addNode(INod node) {
        listaCopii.add(node);
    }

    @Override
    public INod getNode(int index) {
        return listaCopii.get(index);
    }

    @Override
    public void removeNode(INod node) {
        listaCopii.remove(node);
    }

    @Override
    public int getTotalAngajati() {
        int total = 0;
        for(INod n : listaCopii) {
            total += n.getTotalAngajati();
        }
        return total;
    }

    @Override
    public float getSalariu() {
        throw new UnsupportedOperationException("Departamentul nu are salariu");
    }
}
