package cts.g1094.s04.ex1.implementare;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    public void preluareComandaFizica(String comanda, int idMasa){
        Restaurant.getInstance().ocupaMasa(idMasa);
    }

    public void afisareSituatieMese(){
        Restaurant.getInstance().afisareSituatieMese();
    }
}
