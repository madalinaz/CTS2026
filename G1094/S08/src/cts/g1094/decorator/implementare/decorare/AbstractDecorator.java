package cts.g1094.decorator.implementare.decorare;

import cts.g1094.decorator.implementare.IComanda;

public abstract class AbstractDecorator implements IComanda {
    private IComanda comanda;

    public AbstractDecorator(IComanda comanda){
        this.comanda=comanda;
    }

    @Override
    public void inchideComanda() {
        comanda.inchideComanda();
    }

    @Override
    public void adaugaProdus(float pret) {
        comanda.adaugaProdus(pret);
    }

    @Override
    public void printareBon() {
        comanda.printareBon();
    }

    @Override
    public float getTotalComanda() {
        return comanda.getTotalComanda();
    }
}
