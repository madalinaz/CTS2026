package cts.g1093.s10.observer.implementare;

public class Client implements IObserver{
    @Override
    public void mesaj(float temperatura) {
        System.out.println("Clientul a fost anuntat. Temperatura noua: "+temperatura);
    }
}
