package chain_of_responsability.implementare;

public interface IHandler {
    boolean procesareCerere(Persoana p,float credit, int nrLuni);

    IHandler getNextHandler();
    void setNextHandler(IHandler nextHandler);


}
