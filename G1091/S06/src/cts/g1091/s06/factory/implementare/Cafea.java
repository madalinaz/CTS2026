package cts.g1091.s06.factory.implementare;

public class Cafea extends Bautura {
    private boolean areFrisca;

    Cafea(String nume, int volum, float pret, boolean areFrisca) {
        super(nume, volum, pret);
        this.areFrisca = areFrisca;
    }

    @Override
    public void preparare() {
        System.out.println("Cafea preparare");
    }

    @Override
    public String toString() {
        return "Cafea{" +
                "areFrisca=" + areFrisca +
                ", nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }

    @Override
    public String getDetalii() {
        return this.toString();
    }

    public Cafea setAreFrisca(boolean areFrisca) {
        this.areFrisca = areFrisca;
        return this;
    }
}
