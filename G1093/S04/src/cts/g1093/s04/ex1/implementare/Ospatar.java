package cts.g1093.s04.ex1.implementare;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    public void preluareComanda(int idMasa, String comanda){
        System.out.println("Ospatarul incearca sa ocupe masa: " + idMasa);
        Restaurant.getInstance().ocupaMasa(idMasa);
    }
}
