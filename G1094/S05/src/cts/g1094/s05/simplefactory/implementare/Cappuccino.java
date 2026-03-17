package cts.g1094.s05.simplefactory.implementare;

public class Cappuccino implements IBautura{

    private String denumire;
    private int cantitate;
    private String tipLapte;

    Cappuccino(String denumire, int cantitate,String tipLapte) {
        this.denumire = denumire;
        this.cantitate = cantitate;
        this.tipLapte = tipLapte;
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getCantitate() {
        return cantitate;
    }

    @Override
    public void pasiPreparare() {
        System.out.println("Se prepara un cappuccino");
    }
}
