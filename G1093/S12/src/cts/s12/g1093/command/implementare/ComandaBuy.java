package cts.s12.g1093.command.implementare;

public class ComandaBuy implements IComanda{
    private ActiuneBursa executant;
    private int cantitate;

    public ComandaBuy(ActiuneBursa executant, int cantitate) {
        this.executant = executant;
        this.cantitate = cantitate;
    }

    @Override
    public void executa() {
        this.executant.buy(cantitate);
    }
}
