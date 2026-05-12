package cts.command.implementare;

public class ComandaVanzare  implements IComanda{

    private ActiuneBursa actiuneBursa;
    private int nrBucati;

    public ComandaVanzare(ActiuneBursa actiuneBursa, int nrBucati) {
        this.actiuneBursa = actiuneBursa;
        this.nrBucati = nrBucati;
    }
    @Override
    public void executa() {
        this.actiuneBursa.vanzare(nrBucati);
    }
}
