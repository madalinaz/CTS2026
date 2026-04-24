package cts.curs.c05.factory.AbstractFactory.Implementare;

public class Matcha implements AbstractBautura{
    @Override
    public void afisareDescriere() {
        System.out.println("Matcha contine ceai verde ceremonial Nisho");
    }

    @Override
    public boolean areAlcool() {
        return false;
    }
}
