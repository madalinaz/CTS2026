package cts.erculescu.rares.g1089.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public class Client implements IObserver{
    private String nume;
    private List<String> mesaje;

    public Client(String nume) {
        this.nume = nume;
        this.mesaje=new ArrayList<>();
    }

    @Override
    public void getNotificare(String mesaj) {
        System.out.println(this.nume+" a fost notificat(a): "+mesaj);
        this.mesaje.add(mesaj);
    }

    @Override
    public void afisareNotificationStack() {
        for(String mes:this.mesaje){
            System.out.println(mes);
        }
    }
}
