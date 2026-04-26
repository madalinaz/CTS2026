package chain_of_responsability.implementare;

public interface IHandler {
    boolean procesareCerere(Persoana p, float credit, int nrLuni);
    void setNextHandler(IHandler nextHandler);
    IHandler getNextHandler();
}
