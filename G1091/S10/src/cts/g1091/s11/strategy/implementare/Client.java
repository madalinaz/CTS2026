package cts.g1091.s11.strategy.implementare;

public class Client {
    private String numeClient;
    private ITehnicaPlata strategieCurenta;

    public Client(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setStrategieCurenta(ITehnicaPlata strategieCurenta) {
        this.strategieCurenta = strategieCurenta;
    }

    public void finalizareComanda(float suma){
        if(this.strategieCurenta != null) {
            strategieCurenta.plata(suma);
        }
        else{
            System.out.println("Nu exista selectata tehnica de plata.");
        }
    }
}
