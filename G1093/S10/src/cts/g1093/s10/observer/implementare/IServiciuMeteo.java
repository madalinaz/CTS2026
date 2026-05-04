package cts.g1093.s10.observer.implementare;

public interface IServiciuMeteo {
    void adaugaObserver(IObserver observer);
    void elimibaObserver(IObserver observer);
    void notivicareObservers(float temperatura);
    void setTemperatura(float temperatura);
}
