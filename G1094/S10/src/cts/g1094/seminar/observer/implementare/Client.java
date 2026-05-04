package cts.g1094.seminar.observer.implementare;

public class Client implements IObserver{

    @Override
    public void getMesaj(float temperatura) {
        System.out.println("Am primit temperatura: " + temperatura);
    }
}
