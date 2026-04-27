package cts.s09.g1093.cor.implementare;

public interface IHandler {
    ColectieProduse filtrareProduse(ColectieProduse colectieProduse, Client client);
    void setNextHandler(IHandler nextHandler);
    IHandler getNextHandler();
}
