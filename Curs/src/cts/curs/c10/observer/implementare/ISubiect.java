package cts.curs.c10.observer.implementare;

public interface ISubiect {
	void addObserver(IObserver observer);
	void removeObserver(IObserver observer);
	void notifyAll(String mesaj);
}
