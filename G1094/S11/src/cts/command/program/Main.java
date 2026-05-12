package cts.command.program;

import cts.command.implementare.ActiuneBursa;
import cts.command.implementare.Broker;
import cts.command.implementare.ComandaDeCumparare;
import cts.command.implementare.ComandaVanzare;

public class Main {
    public static void main(String[] args) {
        ActiuneBursa actiune1 = new ActiuneBursa("ORL",10);
        ActiuneBursa actiune2 = new ActiuneBursa("NVDA",20);

        Broker broker = new Broker();

        broker.receptionareComanda(new ComandaVanzare(actiune1,2));
        broker.receptionareComanda(new ComandaVanzare(actiune2,10));
        broker.receptionareComanda(new ComandaDeCumparare(actiune2,3));
        broker.executieIntarziata();

        System.out.println(actiune1);
        System.out.println(actiune2);
    }
}
