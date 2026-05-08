package cts.g1092.s10.observer.program;

import cts.g1092.s10.observer.implementare.Client;
import cts.g1092.s10.observer.implementare.IObservator;
import cts.g1092.s10.observer.implementare.ServiciuMeteo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // clientii se ABONEAZA la serviciul meteo
        // se doreste NOTIFICAREA clientilor atunci cand temperatura inregistrata se modifica
        IObservator observator1 = new Client("Ion");
        IObservator observator2 = new Client("Gigel");
        IObservator observator3 = new Client("Marian");

        ServiciuMeteo svBucuresti = new ServiciuMeteo("Serviciu meteo", "Bucuresti");
        ServiciuMeteo svBBrasov = new ServiciuMeteo("Serviciu meteo", "Brasov");

        // sc 1 : schimb temperatura dar nu avem observatori
        System.out.println("-----Schimbare temperatura dar fara observatori-----");
        svBucuresti.setTemperatura(30);

        // sc. 2 : se schimba temperatura si am observatori
        System.out.println("-----Schimbare temperatura dupa abonare observatori-----");
        svBucuresti.addObservator(observator1);
        svBucuresti.addObservator(observator2);
        svBucuresti.addObservator(observator3);
        svBucuresti.setTemperatura(32);

        // sc. 3 : se apeleaza meth setTemperatura dar cu aceeasi valoare de dinainte
        System.out.println("-----Schimbare temperatura dar cu aceeasi valoare-----");
        svBucuresti.setTemperatura(15);

        // sc. 4 : dezabonam observatorii
        System.out.println("-----Schimbare temperatura dupa dezabonare 1 observator-----");
        svBucuresti.removeObservator(observator1);
        svBucuresti.setTemperatura(27);

        //sc. 5 : adaugare alt serviciu meteo pentru Brasov
        System.out.println("-----Schimbare temperatura dupa serviciu meteo Brasov-----");
        svBBrasov.addObservator(observator2);
        svBBrasov.setTemperatura(13);


    }
}

// TO DO/ RECOMANDARE: un serviciu meteo pentru fiecare oras in parte
// astfel clientii se aboneaza strict la servicii concrete pentru orasele de interes