package cts.composite.implementare;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Angajat {
    private List<INod> listaCopii;

    public Manager(String nume, float salariu) {
        super(nume, salariu);
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
        int total = 1;
        for(INod n : listaCopii) {
            total += n.getTotalAngajati();
        }
        return total;
    }
}
