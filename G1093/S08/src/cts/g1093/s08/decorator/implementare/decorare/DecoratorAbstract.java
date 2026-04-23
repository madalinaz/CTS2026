package cts.g1093.s08.decorator.implementare.decorare;

import cts.g1093.s08.decorator.implementare.IComanda;

public abstract class DecoratorAbstract implements IComanda {
    private IComanda comanda;

    public DecoratorAbstract(IComanda comanda) {
        this.comanda = comanda;
    }

    @Override
    public void inchideComanda() {
        this.comanda.inchideComanda();
    }

    @Override
    public void addProdus(float pret) {
        this.comanda.addProdus(pret);
    }

    @Override
    public void printeazaBon() {
        this.comanda.printeazaBon();
    }

    @Override
    public double getTotal() {
        return this.comanda.getTotal();
    }
}
