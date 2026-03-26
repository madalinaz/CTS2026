package cts.g1092.factory.implementare;

public class Cafea implements IBautura{



    @Override
    public void preparare() {
        System.out.println("P1: aprindem espressor" +
                "\nP2: Selectie tip cafea etc.");
    }

    @Override
    public String getDetalii() {
        return "Cafea";
    }

    @Override
    public double getPret() {
        return 20;
    }
}
