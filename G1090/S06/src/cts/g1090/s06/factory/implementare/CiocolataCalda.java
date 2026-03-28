package cts.g1090.s06.factory.implementare;

public class CiocolataCalda extends AbstractBautura{
    private boolean areFrisca;

    CiocolataCalda(String nume, int volum, double pret, boolean areFrisca) {
        super(nume, volum, pret);
        this.areFrisca = areFrisca;
    }


    @Override
    public void preparare() {
        System.out.println("Pasi preparare Ciocolata calda");
    }

    @Override
    public String getDetalii() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "CiocolataCalda{" +
                "areFrisca=" + areFrisca +
                ", nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
