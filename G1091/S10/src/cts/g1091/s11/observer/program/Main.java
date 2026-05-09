package cts.g1091.s11.observer.program;

import cts.g1091.s11.observer.implementare.Client;
import cts.g1091.s11.observer.implementare.IObservator;
import cts.g1091.s11.observer.implementare.PolitiaRomana;

public class Main {
    public static void main(String[] args) {
        IObservator obs1 = new Client("Ion");
        IObservator obs2 = new Client("Andrei");
        IObservator obs3 = new Client("Popescu");

        PolitiaRomana politiaRomana = new PolitiaRomana("Politia Romana",4);

        politiaRomana.producereCaz("A cazut copac pe masina", 10);

        politiaRomana.abonareObservator(obs1);
        politiaRomana.abonareObservator(obs2);

        politiaRomana.producereCaz("Furtuna puternica, stai acasa!",10);

        politiaRomana.producereCaz("A evadat Gigel din puscarie.", 3);

        politiaRomana.dezabonareObservator(obs2);

        politiaRomana.producereCaz("A evadat Gigel2 din puscarie", 6);

    }
}
