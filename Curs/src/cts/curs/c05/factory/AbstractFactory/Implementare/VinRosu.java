package cts.curs.c05.factory.AbstractFactory.Implementare;

public class VinRosu implements AbstractBautura{
    @Override
    public void afisareDescriere() {
        System.out.println("Vin rosu din zona Sicilia");
    }

    @Override
    public boolean areAlcool() {
        return true;
    }
}
