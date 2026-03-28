package cts.g1091.s06.factory.implementare;

public class Ceai extends Bautura {


    Ceai(String nume, int volum, float pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Ceai preparare");
    }

    @Override
    public String toString() {
        return "Ceai{" +
                "pret=" + pret +
                ", volum=" + volum +
                ", nume='" + nume + '\'' +
                '}';
    }

    @Override
    public String getDetalii() {
        return this.toString();
    }
}
