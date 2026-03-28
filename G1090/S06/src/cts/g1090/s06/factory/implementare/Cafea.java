package cts.g1090.s06.factory.implementare;

public class Cafea extends AbstractBautura{

    Cafea(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Tehnici preparare cafea");
    }

    @Override
    public String getDetalii() {
        return this.toString();
    }


    @Override
    public String toString() {
        return "Cafea{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
