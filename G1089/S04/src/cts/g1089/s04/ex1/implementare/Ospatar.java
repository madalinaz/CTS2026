package cts.g1089.s04.ex1.implementare;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    public void preluareComanda(String comanda, int id){
        Restaurant.getInstance().ocupaMasa(id);
    }

    public void afisareSituatieMese(){
        Restaurant.getInstance().afisareMese();
    }
}
