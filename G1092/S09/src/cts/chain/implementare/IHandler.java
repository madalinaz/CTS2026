package cts.chain.implementare;

public interface IHandler {
    void setNextHandler(IHandler nextHandler);
    IHandler getNextHandler();
    float procesareCerere(Persoana persoana, float credit) throws ExceptieCredit;

}
