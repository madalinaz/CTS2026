package cts.g1094.seminar.observer.implementare;

public interface ISubject {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObservers(float temperatura);
}
