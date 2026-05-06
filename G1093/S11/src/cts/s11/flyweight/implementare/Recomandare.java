package cts.s11.flyweight.implementare;


//Flyweight Concret - consuma multe resurse
public class Recomandare implements IRecomandare{
    private String textRecomandare; //se reutilizeaza

    public Recomandare(String textRecomandare) {
        this.textRecomandare = textRecomandare;
    }

    @Override
    public void printare(Reteta reteta) {
        System.out.println("Se printeaza reteta "+reteta);
        System.out.println("!!Se recomandare "+ textRecomandare);
    }

}
