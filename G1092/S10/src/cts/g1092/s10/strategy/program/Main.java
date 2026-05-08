package cts.g1092.s10.strategy.program;

import cts.g1092.s10.strategy.implementare.Client;
import cts.g1092.s10.strategy.implementare.Comanda;
import cts.g1092.s10.strategy.implementare.PlataCard;

// clientul are pos de a plati o comanda ori cash ori card
public class Main {
    public static void main(String[] args) {
        Client client = new Client("gigel");
        Comanda comanda = new Comanda(1, 123.2);
        client.setTehnicaPlata(new PlataCard("1234", 500));
        client.inchideComanda(comanda);
    }
}