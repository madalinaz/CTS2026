package cts.g1093.s08.decorator.implementare.decorare;

import cts.g1093.s08.decorator.implementare.IComanda;

public class DecoratorMartie extends DecoratorAbstract{
    private boolean esteFemeie;
    public DecoratorMartie(IComanda comanda, boolean esteFemeie) {
        super(comanda);
        this.esteFemeie=esteFemeie;
    }

    @Override
    public void printeazaBon() {
        if(esteFemeie){
            System.out.println("** La multi ani! **");
        }
        super.printeazaBon();
    }

    @Override
    public double getTotal() {
        if(esteFemeie){
            return 0.9* super.getTotal();
        }
        return super.getTotal();
    }
}
