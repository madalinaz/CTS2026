package cts.g1094.s04.ex1.program;

import cts.g1094.s04.ex1.implementare.Masa;
import cts.g1094.s04.ex1.implementare.Ospatar;
import cts.g1094.s04.ex1.implementare.Restaurant;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //intr un rest dorim gestiunea centralizata a ocuparii meselor//CENTRALIZAT
        //exista mai multi ospatari  care ocupa sau elibereaza o masa//O INSTANTA
        //client in general = persoana care utiliz DP-ul nostru (aici este osapatarul)
        Restaurant restaurant = Restaurant.getInstance();
        restaurant.addMasa(new Masa(1));
        restaurant.addMasa(new Masa(2));
        restaurant.addMasa(new Masa(3));
        restaurant.addMasa(new Masa(4));
        restaurant.afisareSituatieMese();

        Ospatar o1 = new Ospatar("Gigel");
        Ospatar o2 = new Ospatar("Costel");

        o1.preluareComandaFizica("Pizza Cola", 2);
        o2.preluareComandaFizica("Paste cola", 3);
        o2.preluareComandaFizica("Paste cola", 1);

        //afisare prin instanta unica a clss
        Restaurant.getInstance().afisareSituatieMese();

        //afis direct prin ob
        restaurant.afisareSituatieMese();

        //to do
        //de adaugat o metoda de eliberare masa
        //de adaugat o met de populare cu mai multe mese
        //ce se int daca constructorul clasei Restaurant trebuie sa primeasca cv ca param??

        Map<Integer, Masa> meseNoi = new HashMap<>();
        meseNoi.put(5, new Masa(5));
        meseNoi.put(6, new Masa(6));
        meseNoi.put(7, new Masa(7));

        Restaurant.getInstance().populareRestaurant(meseNoi);

        restaurant.eliberaMasa(3);

        restaurant.afisareSituatieMese();

        //ex 2 (DRPCIV) -> nr de inmatriculare
        //de implem un generator de id-uri unice (clasa)
        //de tip String, userul trim un String, daca este unic il foloseste
    }
}