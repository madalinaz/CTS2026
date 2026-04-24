package cts.g1092.s08.decorator.implementare;

import java.util.ArrayList;
import java.util.List;

public class Bon implements IBon{
    private List<Float> produse = new ArrayList<>();
    private int id;

    public Bon(int id) {
        this.id = id;
    }

    @Override
    public float getTotal() {
        float total =0;
        for (float pret: produse) {
            total+=pret;
        }
        return total;
    }

    @Override
    public void printare() {
        System.out.println("S-a printat bon, total: "+ this.getTotal());
        for (float pret: produse) {
            System.out.println("pret: " + pret);
        }
    }

    @Override
    public void adaugaProdus(float pret) {
        produse.add(pret);
    }
}
