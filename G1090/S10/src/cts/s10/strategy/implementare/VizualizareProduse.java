package cts.s10.strategy.implementare;

public class VizualizareProduse implements IStrategy{
    @Override
    public void vizualizare(PlanDesign plan) {
        System.out.println("Lista produse plan " + plan.getDenumire());
        for(String s:plan.getListaObiecte()){
            System.out.println(s);
        }
    }
}
