package cts.g1092.s10.strategy.implementare;

public class PlataCard implements ITehnicaPlata{
    private String contBancar;
    private double soldCurent;

    public PlataCard(String contBancar, double soldCurent) {
        this.contBancar = contBancar;
        this.soldCurent = soldCurent;
    }


    @Override
    public void plataComanda(Comanda comanda) {
        System.out.println("S-a realizat plata "+ comanda.getTotalComanda() + " cu cardul");
    }
}
