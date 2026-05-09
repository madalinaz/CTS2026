package cts.s10.observer.implementare;

public interface IObserver {
    void notificare(String mesaj);
    void citireNotificare(int index);
    void afisareNotificari();

}
