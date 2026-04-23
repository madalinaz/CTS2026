package cts.matracaru.anamaria.g1091.decorator.implementare;

public abstract class ABonDecorator implements IBon{

    private IBon bon;

    public ABonDecorator(IBon bon) {
        this.bon = bon;
    }

    @Override
    public double calculeazaTotal() {
        return bon.calculeazaTotal();
    }

    @Override
    public void afiseazaBon() {
        bon.afiseazaBon();
    }

    @Override
    public void adaugaProdus(Produs produs, int cantitate) {
        bon.adaugaProdus(produs, cantitate);
    }
}