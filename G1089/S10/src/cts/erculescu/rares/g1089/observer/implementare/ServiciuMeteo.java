package cts.erculescu.rares.g1089.observer.implementare;

public class ServiciuMeteo extends AObservabil{
    private String oras;
    private double temperatura;

    public ServiciuMeteo(String denumireServiciu, String oras) {
        super(denumireServiciu);
        this.oras = oras;
    }

    public void setTemperatura(double temperatura) {
        if (temperatura != this.temperatura) {
            this.notificareObservers("S-a schimbat temperatura in "+this.oras+". Temoperatura noua: "+temperatura);
            this.temperatura = temperatura;
        }
    }
}
