package cts.g1092.s04.ex1.implementare;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    //metoda care ocupa o masa prin primirea unui client
    public void preluareClient(int idMasa){
        //clientul este poftit la o masa pe care acesta o alege inainte
        //de completat cu tratarea exceptiilor
        //de transformat runtime in alt tip de exceptie sau pastrarea runtime
        // dar meth sa arunce acel tip de exceptie
        Restaurant.getInstance().ocupareMasa(idMasa);
    }

    public void afisareMese(){
        Restaurant.getInstance().afisareDisponibilitateMese();
    }
}
