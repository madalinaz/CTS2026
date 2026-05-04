package cts.g1094.seminar.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public class ServiciuMeteo implements ISubject {
    private float temperatura;
    private List<IObserver> observers;

    public ServiciuMeteo(float temperatura){
        observers=new ArrayList<>();
        this.temperatura = temperatura;
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(float temperatura) {
        for(IObserver observer : observers){
            observer.getMesaj(temperatura);
        }
    }

    public void setTemperatura(float temperatura){
        if(this.temperatura == temperatura) return;

        this.temperatura = temperatura;
        notifyObservers(temperatura);
    }
}
