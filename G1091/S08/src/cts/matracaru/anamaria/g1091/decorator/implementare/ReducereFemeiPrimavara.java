package cts.matracaru.anamaria.g1091.decorator.implementare;

public class ReducereFemeiPrimavara extends ABonDecorator{
    public ReducereFemeiPrimavara(IBon bon) {
        super(bon);
    }

    @Override
    public double calculeazaTotal() {
        return super.calculeazaTotal()*0.9;
    }

    @Override
    public void afiseazaBon() {
        System.out.println("----------BON CU REDUCERE FEMEI PRIMAVARA -10% -------------");
        super.afiseazaBon();
        System.out.println("Total FINAL cu reducere: "+calculeazaTotal());
    }
}