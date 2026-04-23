package cts.g1093.s08.decorator.implementare;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements IComanda{
    private  int id;
    private List<Float> listaProduse;
    private boolean esteInchisa;

    public Comanda(int id) {
        this.id = id;
        this.listaProduse=new ArrayList<>();
        this.esteInchisa=false;
    }

    @Override
    public void inchideComanda() {
        if(!esteInchisa){
            esteInchisa=true;
            System.out.println("Comanda s-a inchis");
        }
        else{
            System.out.println("Comanda este deja inchisa.");
        }
    }

    @Override
    public void addProdus(float pret) {
        listaProduse.add(pret);
    }

    @Override
    public void printeazaBon() {
        if(esteInchisa) {
            System.out.println("---------------------------------------------");
            System.out.println("Comanda " + id);
            System.out.println("Total comanda: " + getTotal());
            System.out.println("---------------------------------------------");
        }else {
            System.out.println("Nu se poate printa bon pe comanda deschisa.");

        }
    }

    @Override
    public double getTotal() {
        float sum=0;
        for(Float f:listaProduse)
            sum+=f;
        return sum;
    }
}
