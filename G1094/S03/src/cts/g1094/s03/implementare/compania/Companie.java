package cts.g1094.s03.implementare.compania;

import cts.g1094.s03.implementare.angajati.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    private List<Angajat> angajati;
    private String nume;

    public Companie(String nume){
        this.nume=nume;
        this.angajati = new ArrayList<>();
    }

    public void adaugaAngajat(Angajat a){
        if(a == null)
            //runtime exception nu ne obliga sa o tratam, sau sa o declaram
            throw new NullPointerException();

        this.angajati.add(a);
    }

    public double totalSalNete(){
        double totalSalarii = 0;
        for(Angajat a : this.angajati){
            totalSalarii+=a.calculSalariu();
        }
        return totalSalarii;
    }

    public void afisareDetaliiCompanie(){
        System.out.println("Numele companiei este " + nume + "\n"
                + " si are " + angajati.size() + " angajati." + "\n");

        for(Angajat a: angajati)
            System.out.println(a);

    }
}
