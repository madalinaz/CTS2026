package cts.erculescu.rares.g1089.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AObservabil implements IObservabil{
    private List<IObserver> observers;
    private String denumireServiciu;

    public AObservabil(String denumireServiciu) {
        this.denumireServiciu = denumireServiciu;
        this.observers=new ArrayList<>();
    }

    @Override
    public void abonareObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void dezabonareObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificareObservers(String mesaj) {
        for(IObserver obs:observers){
            obs.getNotificare(mesaj);
        }
    }
}
