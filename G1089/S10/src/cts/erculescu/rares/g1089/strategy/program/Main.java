package cts.erculescu.rares.g1089.strategy.program;

import cts.erculescu.rares.g1089.strategy.implementare.Client;
import cts.erculescu.rares.g1089.strategy.implementare.StrategiePlataCard;
import cts.erculescu.rares.g1089.strategy.implementare.StrategiePlataCash;

import java.util.Arrays;

//Un client are posibilitatea de a alege tehnica de plata a unei facturi/comenzi dintre urmatoarele optiuni:
//card, cash, plata in rate.
//!!Se poate alege ca metoda de plata doar cele disponibile la nivel de client!!
public class Main {
    public static void main(String[] args) {
        Client c1=new Client("Rares");
        c1.setModalitatiValabilePlata(Arrays.asList(/*StrategiePlataCard.class.getSimpleName(),*/StrategiePlataCash.class.getSimpleName()));
        System.out.println("Scenariu 1: Plata fara strategie setata");
        try {
            c1.lansareComanda(5000.21);
        } catch (Exception e) {
            System.out.println("Eroare: "+e.getMessage());
        }
        System.out.println("\nScenariu 2: Plata cu o strategie setata");
        try {
            c1.setTehnicaCurentaPlata(new StrategiePlataCard(5000.2));
            c1.lansareComanda(2004.04);
        } catch (Exception e) {
            System.out.println("Eroare: "+e.getMessage());
        }

        System.out.println("\nScenariu 3: Plata cu o strategie setata fara ca sa fie fonduri suficiente pe card.");
        try {
            c1.lansareComanda(10000.21);
        } catch (Exception e) {
            System.out.println("Eroare: "+e.getMessage());
        }
    }
}