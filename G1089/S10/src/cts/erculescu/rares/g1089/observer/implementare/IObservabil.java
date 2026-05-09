package cts.erculescu.rares.g1089.observer.implementare;

public interface IObservabil {
    void abonareObserver(IObserver observer);
    void dezabonareObserver(IObserver observer);
    void notificareObservers(String mesaj);
}
