package decorator.implementare;

import java.util.ArrayList;
import java.util.List;

public class Bon extends ABon {
    private List<Float> produse;

    public Bon() {
        this.produse = new ArrayList<>();
    }

    public double calculeazaTotal() {
        return produse.stream().mapToDouble(Float::doubleValue).sum();
    }

    @Override
    public void addProdus(float pret) {
        produse.add(pret);
    }

}
