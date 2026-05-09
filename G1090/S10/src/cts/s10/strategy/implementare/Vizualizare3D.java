package cts.s10.strategy.implementare;

public class Vizualizare3D implements IStrategy{

    @Override
    public void vizualizare(PlanDesign plan) {
        System.out.println("Vizualizare 3D a planului " + plan.getDenumire());
    }
}
