package cts.matracaru.anamaria.g1091.decorator.implementare;

public class LinieComanda {
    private Produs produs;
    private int cantitate;

    public LinieComanda(Produs produs, int cantitate) {
        this.produs = produs;
        this.cantitate = cantitate;
    }

    public Produs getProdus() {
        return produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double calculeazaTotalProdus() {
        return produs.getPret() * cantitate;
    }

    public void afisare() {
        System.out.println(
            produs.getNume() +
            "\npret: " + produs.getPret() +
            "\ncantitate: " + cantitate +
            "\ntotal: " + calculeazaTotalProdus()+ "\n"
        );
    }
}