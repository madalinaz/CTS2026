package cts.s09.g1093.cor.implementare;

public class Client {
    private String nume;
    private float buget;
    private boolean interesatRecenzii;
    private boolean interesatPremium;

    public Client(String nume, float buget, boolean interesatRecenzii, boolean interesatPremium) {
        this.nume = nume;
        this.buget = buget;
        this.interesatRecenzii = interesatRecenzii;
        this.interesatPremium = interesatPremium;
    }

    public String getNume() {
        return nume;
    }

    public float getBuget() {
        return buget;
    }

    public boolean isInteresatRecenzii() {
        return interesatRecenzii;
    }

    public boolean isInteresatPremium() {
        return interesatPremium;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", buget=" + buget +
                ", interesatRecenzii=" + interesatRecenzii +
                ", interesatPremium=" + interesatPremium +
                '}';
    }
}
