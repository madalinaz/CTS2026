package cts.command.implementare;

public class ComandaDeCumparare implements IComanda{
    private ActiuneBursa actiuneBursa;
    private int nrBucati;

    public ComandaDeCumparare(ActiuneBursa actiuneBursa, int nrBucati) {
        this.actiuneBursa = actiuneBursa;
        this.nrBucati = nrBucati;
    }

    @Override
    public void executa() {
        this.actiuneBursa.cumparare(nrBucati);

    }
}
