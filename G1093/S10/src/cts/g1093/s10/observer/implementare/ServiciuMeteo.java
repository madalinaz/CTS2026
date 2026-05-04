package cts.g1093.s10.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public class ServiciuMeteo implements IServiciuMeteo{
    private List<IObserver> observers;
    private float temperatura;

    public ServiciuMeteo(float temperatura) {
        this.observers = new ArrayList<IObserver>();
        this.temperatura=temperatura;
    }

    public void setTemperatura(float temperatura) {   //meth care modifica starea
        if(temperatura!=this.temperatura)
            this.temperatura = temperatura;
        notivicareObservers(temperatura);
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void elimibaObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notivicareObservers(float temperatura) {
        for(IObserver observer: observers){
            observer.mesaj(temperatura);
        }
    }
}
