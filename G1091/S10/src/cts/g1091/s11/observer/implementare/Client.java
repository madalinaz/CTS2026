package cts.g1091.s11.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public class Client implements IObservator{

    private String numeClient;
    private List<String> listaNotificari;

    public Client(String numeClient) {
        this.numeClient = numeClient;
        this.listaNotificari = new ArrayList<>();
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Clientul: " +this.numeClient + " a fost anuntat de : " + mesaj);
        this.listaNotificari.add(mesaj);
    }

    @Override
    public void afisareNotificari() {
        for(String mesaj : this.listaNotificari){
            System.out.println(mesaj);
        }
    }

    @Override
    public void citireNotificare(int index) {
        if (index >= 0 && index < this.listaNotificari.size()){
            String mesaj = this.listaNotificari.get(index);
            System.out.println(mesaj);
            this.listaNotificari.remove(mesaj);
        }
    }


}
