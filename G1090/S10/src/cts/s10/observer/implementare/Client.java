package cts.s10.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public class Client implements IObserver{

    private String nume;
    private List<String> notificari;

    public Client(String nume) {
        this.nume = nume;
        notificari = new ArrayList<>();

    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Clientul :" + this.nume + " a fost notificat de: " + mesaj);
        this.notificari.add(mesaj);

    }

    @Override
    public void citireNotificare(int index) {
        if(index>=0 && index < this.notificari.size()){
            System.out.println("Clientul : " + this.nume + " a citit o notificare");
            this.notificari.remove(index);
        }
    }

    @Override
    public void afisareNotificari() {
        System.out.println("Lista mesaje : ");
        for (String m : this.notificari){
            System.out.println(m);
        }
    }

}
