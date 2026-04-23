package cts.g1094.decorator.implementare;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements IComanda{

    private List<Float> listaProduse;
    private boolean esteInchisa;

    public Comanda(){
        esteInchisa = false;
        this.listaProduse = new ArrayList<>();
    }

    @Override
    public void inchideComanda() {

        esteInchisa = true;
    }

    @Override
    public void adaugaProdus(float pret) {
        listaProduse.add(pret);
    }

    @Override
    public void printareBon() {
        if(esteInchisa){
            System.out.println("Se printeaza bon...");
            System.out.println("Totalul este " + this.getTotalComanda());
            for(float produs : listaProduse){
                System.out.println(produs);
            }
        }
    }

    @Override
    public float getTotalComanda() {
        float total = 0;
        for(float produs : listaProduse){
            total += produs;
        }
        return total;
    }
}
