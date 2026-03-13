package cts.g1090.s04.implementare;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    //interactiune intre Ospatar si Clienti
    public void preluareComanda(String comanda
            , int idMasa){
        Restaurant.getInstance().ocupaMasa(idMasa);
    }

    public void afisareSituatieMese(){
        Restaurant.getInstance().afisareMese();
    }
}
