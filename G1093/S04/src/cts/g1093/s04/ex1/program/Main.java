package cts.g1093.s04.ex1.program;

import cts.g1093.s04.ex1.implementare.Masa;
import cts.g1093.s04.ex1.implementare.Ospatar;
import cts.g1093.s04.ex1.implementare.Restaurant;

public class Main {
    public static void main(String[] args) {
        //modelam managementul centralizat al ocuparii meselor dintr-un restaurant
        //un restaurant -> avem un nr de mese
        //un numar de ospatari
        Restaurant restaurant =Restaurant.getInstance();
        restaurant.adaugaMasa(new Masa(1));
        restaurant.adaugaMasa(new Masa(2));
        restaurant.adaugaMasa(new Masa(3));
        restaurant.adaugaMasa(new Masa(4));

        Ospatar ospatar1 = new Ospatar("Gigel");
        Ospatar ospatar2 = new Ospatar("Costel");
        //Ospatar ospatar3 = new Ospatar("Gigel");\

        ospatar1.preluareComanda(2, "Pizza, Cola");
        ospatar2.preluareComanda(3, "Paste, Cafea");

        restaurant.afisareDetaliiMese();

        //de completat
        // +1. eliberare masa
        // +2. metoda de populare mese tip bulk
        // 3. cum setez numele restaurantului
        // 4. se poate ca constructorul sa primeasca parametru???



        // ex3 - > HOME
        // DRPCIV -> gestiunea numerelor de inmatriculare
    }
}