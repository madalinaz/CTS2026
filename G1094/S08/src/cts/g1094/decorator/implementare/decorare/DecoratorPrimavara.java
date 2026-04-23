package cts.g1094.decorator.implementare.decorare;

import cts.g1094.decorator.implementare.IComanda;

public class DecoratorPrimavara extends AbstractDecorator {
    private boolean esteFemeie;

    public DecoratorPrimavara(IComanda comanda, boolean esteFemeie){
        super(comanda);
        this.esteFemeie = esteFemeie;
    }

    @Override
    public void printareBon() {
        if(esteFemeie)
            System.out.println("La multi ani!");
        super.printareBon();
    }

    @Override
    public float getTotalComanda() {
        if(esteFemeie){
            return 0.9f * super.getTotalComanda();
        }
        return super.getTotalComanda();
    }
}
