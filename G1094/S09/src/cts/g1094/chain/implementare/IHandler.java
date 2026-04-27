package cts.g1094.chain.implementare;

public interface IHandler {
    void filtrare(PaginaWeb pagina);

    void setNextHandler(IHandler nextHandler);
    IHandler getNextHandler();
}
