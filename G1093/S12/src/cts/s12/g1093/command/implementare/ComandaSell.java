package cts.s12.g1093.command.implementare;

public class ComandaSell implements IComanda{
    private ActiuneBursa executant;
    private int cantitate;

    public ComandaSell(ActiuneBursa executant, int cantitate) {
        this.executant = executant;
        this.cantitate = cantitate;
    }

    @Override
    public void executa() {
        this.executant.sell(cantitate);
    }
}
