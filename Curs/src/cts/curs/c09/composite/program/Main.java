package cts.curs.c09.composite.program;


import cts.curs.c09.composite.implementare.ANod;
import cts.curs.c09.composite.implementare.Meniu;
import cts.curs.c09.composite.implementare.Produs;
import cts.curs.c09.composite.implementare.Structura;

public class Main {
    public static void main(String[] args) {
        //definire nivel 0 arborescenta
        ANod structuraMeniu = new Structura("Meniu restaurant");

        Meniu meniu = new Meniu(structuraMeniu, "Pizzeria ASE");

        //definire nivel 1 arborescenta
        ANod structuraBauturi = new Structura("Bauturi");
        ANod structuraMancare = new Structura("Mancare");
        structuraMeniu.adaugaNod(structuraBauturi);
        structuraMeniu.adaugaNod(structuraMancare);

        //definire noduri nivel 2 arborescenta (Bauturi)
        structuraBauturi.adaugaNod(new Produs("CocaCola", 10));
        structuraBauturi.adaugaNod(new Produs("Pepsi", 9));

        //definire noduri nivel 2 arborescenta (Mancare)
        ANod structuraMancarePizza = new Structura("Pizza");
        ANod structuraMancarePaste = new Structura("Paste");
        structuraMancare.adaugaNod(structuraMancarePizza);
        structuraMancare.adaugaNod(structuraMancarePaste);

        //definire noduri nivel 3 arborescenta (Mancare - Pizza)
        structuraMancarePizza.adaugaNod(new Produs("Pizza Margherita", 25));
        structuraMancarePizza.adaugaNod(new Produs("Pizza Capriciosa", 29));

        //definire noduri nivel 3 arborescenta (Mancare - Paste)
        structuraMancarePaste.adaugaNod(new Produs("Paste carbonara", 27));
        structuraMancarePaste.adaugaNod(new Produs("Paste branza", 32));

        //afisare structura Meniu
        System.out.println(meniu.getNumeRestaurant());
        System.out.println(structuraMeniu.getInfo());
    }
}
