package cts.g1092.s10.observer.implementare;

import java.util.List;

public class Client implements IObservator {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Clientul " + this.nume + " a fost anuntat: " + mesaj);
    }


}
