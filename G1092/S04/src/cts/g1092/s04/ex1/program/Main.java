package cts.g1092.s04.ex1.program;

import cts.g1092.s04.ex1.implementare.Masa;
import cts.g1092.s04.ex1.implementare.Ospatar;
import cts.g1092.s04.ex1.implementare.Restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //un exemplu de Singleton
        //disponibilitatea meselor din cadrul unui restaurant
        //o lista de mese(diverse detalii + disponibilitate)
        //gestionez centralizat disponibilitatea acestor mese -> singleton
        //ospatarii gestioneaza mesele prin intermediul singleton-ului

        //de testat implementarea prin verificarea daca ambii ospatari vizualizeaza disponibilitatea meselor la fel

        Ospatar ospatar1 = new Ospatar("Gigel");
        Ospatar ospatar2 = new Ospatar("Costel");

        Restaurant restaurant = Restaurant.getInstance();
        restaurant.addMasa(new Masa(1));
        restaurant.addMasa(new Masa(2));
        restaurant.addMasa(new Masa(3));
        restaurant.addMasa(new Masa(4));
        restaurant.addMasa(new Masa(5));

        System.out.println("Afisare mese inainte de interactiune cu ospatari");
        restaurant.afisareDisponibilitateMese();

        ospatar1.preluareClient(3);
        ospatar2.preluareClient(1);
        ospatar2.preluareClient(2);
        ospatar1.preluareClient(5);
        ospatar1.afisareMese();
        ospatar2.afisareMese();
    }
}