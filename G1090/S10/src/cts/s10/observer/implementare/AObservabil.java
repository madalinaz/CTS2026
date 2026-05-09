package cts.s10.observer.implementare;


import java.util.ArrayList;
import java.util.List;

public abstract class AObservabil {
    private List<IObserver> clienti;
    private String denumireServiciu;


    public AObservabil( String denumireServiciu) {
        this.denumireServiciu = denumireServiciu;
        clienti = new ArrayList<>();
    }

    public void abonare(IObserver obs){
        clienti.add(obs);
    }

    public void dezabonare(IObserver obs){
        clienti.remove(obs);
    }

    public void notificareObservatori(String mesaj){
        for(IObserver o: this.clienti){
            o.notificare(mesaj);
        }
    }
}
