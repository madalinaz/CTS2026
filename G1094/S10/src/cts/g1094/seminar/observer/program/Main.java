package cts.g1094.seminar.observer.program;

import cts.g1094.seminar.observer.implementare.Client;
import cts.g1094.seminar.observer.implementare.ServiciuMeteo;

public class Main {
    public static void main(String[] args) {
        ServiciuMeteo serviciuMeteo = new ServiciuMeteo(25);
        Client c1 = new Client();
        Client c2 = new Client();

        serviciuMeteo.setTemperatura(26);

        serviciuMeteo.addObserver(c1);
        serviciuMeteo.addObserver(c2);

        serviciuMeteo.setTemperatura(28);

    }
}