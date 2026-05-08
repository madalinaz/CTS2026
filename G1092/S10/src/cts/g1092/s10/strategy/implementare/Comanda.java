package cts.g1092.s10.strategy.implementare;

public class Comanda {
    private int id;
    private double totalComanda;

    public Comanda(int id, double totalComanda) {
        this.id = id;
        this.totalComanda = totalComanda;
    }

    public int getId() {
        return id;
    }

    public double getTotalComanda() {
        return totalComanda;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "id=" + id +
                ", totalComanda=" + totalComanda +
                '}';
    }
}
