package cts.s10.strategy.implementare;

public class Vizualizare2D implements IStrategy{
    @Override
    public void vizualizare(PlanDesign plan) {
        System.out.println("Vizualizare 2D a planului " + plan.getDenumire());
    }
}
