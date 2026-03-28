package cts.g1089.s06.Factory.Implementare;

public class Ceai extends AbstractBautura{

    Ceai(String nume, int volum, double pret) {
        super(nume, volum, pret);
    }

    @Override
    public void preparare() {
        System.out.println("Afisare pasi preparare ceai");
    }

    @Override
    public String getDetalii() {
        return this.toString();
    }

    @Override
    public double getPret() {
        return this.pret;
    }

    @Override
    public String toString() {
        return "Ceai{" +
                "nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
