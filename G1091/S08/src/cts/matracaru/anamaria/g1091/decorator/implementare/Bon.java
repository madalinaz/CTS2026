package cts.matracaru.anamaria.g1091.decorator.implementare;

import java.util.ArrayList;
import java.util.List;

public class Bon implements IBon{
    private List<LinieComanda> comenziBon = new ArrayList<>();

    public Bon() {
    }

    @Override
    public double calculeazaTotal() {
        double total = 0;
        for (LinieComanda linie : comenziBon) {
            total += linie.calculeazaTotalProdus();
        }
        return total;
    }

    @Override
    public void afiseazaBon() {
        System.out.println("----- BON -----");
        for (LinieComanda linie : comenziBon) {
            linie.afisare();
        }
        System.out.println("TOTAL: " + calculeazaTotal());
    }

    @Override
    public void adaugaProdus(Produs produs, int cantitate) {
        for (LinieComanda linieComanda:comenziBon){
            Produs p=linieComanda.getProdus();
            if (p.getNume().equals(produs.getNume())){
                linieComanda.setCantitate(linieComanda.getCantitate()+cantitate);
                return;
            }
        }

        LinieComanda linieComanda=new LinieComanda(produs,cantitate);
        comenziBon.add(linieComanda);
    }
}