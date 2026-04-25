package cts.g1091.s09.chainOfResponsability.implementare;

public interface IHandler {
    void setNextHandler(IHandler handler);
    IHandler getNextHandler();
    boolean procesareCerere(Persoana p, float credit, int nrLuni);
}
