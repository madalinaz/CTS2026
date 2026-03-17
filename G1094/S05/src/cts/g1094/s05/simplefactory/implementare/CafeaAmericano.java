package cts.g1094.s05.simplefactory.implementare;

public class CafeaAmericano implements IBautura{

    private String denumire;
    private int cantitate;

    CafeaAmericano(String denumire, int cantitate) {
        this.denumire = denumire;
        this.cantitate = cantitate;
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
        System.out.println("Se prepara un Americano");
    }
}
