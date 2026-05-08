package cts.g1092.s10.strategy.implementare;

public class PlataCash implements ITehnicaPlata {
    private int nrBancnote200;
    private int nrBancnote50; // se poate continua, sau o mapa ar fi mai realist/ elegant ca si imp.

    public PlataCash(int nrBancnote200, int nrBancnote50) {
        this.nrBancnote200 = nrBancnote200;
        this.nrBancnote50 = nrBancnote50;
    }

    @Override
    public void plataComanda(Comanda comanda) {
        System.out.println("S-a realizat plata "+ comanda.getTotalComanda() + " prin cash");

    }
}
