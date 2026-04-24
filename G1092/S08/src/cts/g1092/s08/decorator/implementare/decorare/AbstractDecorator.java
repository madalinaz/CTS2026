package cts.g1092.s08.decorator.implementare.decorare;

import cts.g1092.s08.decorator.implementare.IBon;

public abstract class AbstractDecorator implements IBon{
    private IBon bon; // referinta obj de decorat
    // am nevoie de un ct.
    // se comporta ca obj pe care il decoreaza

    public AbstractDecorator(IBon bon) {
        this.bon = bon;
    }

    @Override
    public float getTotal() {
        return this.bon.getTotal();
    }

    @Override
    public void printare() {
        this.bon.printare();
    }

    @Override
    public void adaugaProdus(float pret) {
        this.bon.adaugaProdus(pret);
    }
}
