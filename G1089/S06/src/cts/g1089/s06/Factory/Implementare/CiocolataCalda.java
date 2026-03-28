package cts.g1089.s06.Factory.Implementare;

public class CiocolataCalda extends AbstractBautura{
    private String tipCiocolata;
    private boolean areFrisca;

    CiocolataCalda(String nume, int volum, double pret, String tipCiocolata, boolean areFrisca) {
        super(nume, volum, pret);
        this.tipCiocolata = tipCiocolata;
        this.areFrisca = areFrisca;
        if(this.areFrisca){
            this.pret += 5;
        }
    }

    @Override
    public void preparare() {
        System.out.println("Pasi preparare ciocolata calda");
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
        return "CiocolataCalda{" +
                "tipCiocolata='" + tipCiocolata + '\'' +
                ", areFrisca=" + areFrisca +
                ", nume='" + nume + '\'' +
                ", volum=" + volum +
                ", pret=" + pret +
                '}';
    }
}
