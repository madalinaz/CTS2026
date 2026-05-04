package cts.g1093.s10.observer.program;

import cts.g1093.s10.observer.implementare.Client;
import cts.g1093.s10.observer.implementare.IObserver;
import cts.g1093.s10.observer.implementare.IServiciuMeteo;
import cts.g1093.s10.observer.implementare.ServiciuMeteo;

public class Main1 {
    public static void main(String[] args) {
        IObserver observer1=new Client();
        IObserver observer2=new Client();
        IObserver observer3=new Client();

        IServiciuMeteo serviciuMeteo=new ServiciuMeteo(10);
        System.out.println("------------------Schimbare temperatura fara observatori--------------------");
        serviciuMeteo.setTemperatura(30);
        System.out.println("------------------Schimbare temperatura cu observatori--------------------");
        serviciuMeteo.adaugaObserver(observer1);
        serviciuMeteo.adaugaObserver(observer2);
        serviciuMeteo.adaugaObserver(observer3);
        serviciuMeteo.setTemperatura(30);

        serviciuMeteo.elimibaObserver(observer3);
        serviciuMeteo.setTemperatura(25);
    }
}
