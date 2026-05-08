package cts.g1091.s09.chainOfResponsability.facade;

import cts.g1091.s09.chainOfResponsability.implementare.*;

public class Banca {
    private String nume;
    private IHandler handlerAnaf = new HandlerANAF();
    private IHandler handlerNivelSalariu = new HandlerNivelSalariu();
    private IHandler handlerVechime = new HandlerVechime();

    public Banca(String nume) {
        this.nume = nume;
        creareLant();
    }

    private void creareLant(){
        this.handlerAnaf.setNextHandler(handlerNivelSalariu);
        this.handlerNivelSalariu.setNextHandler(handlerVechime);
    }

    public void procesareCerere
            (Persoana p, float credit, int nrLuni) {
        this.handlerAnaf.procesareCerere(p, credit, nrLuni);
    }
}
