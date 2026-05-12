package cts.flyweight.implementare;

public class Recomandare implements IFlyweight {
    private String textRecomandare;

    public Recomandare(String textRecomandare) {
        this.textRecomandare = textRecomandare;
    }

    @Override
    public void printare(Reteta reteta) {
        System.out.println("S-a printat"+reteta +"cu recomandarea"+textRecomandare);

    }
}
