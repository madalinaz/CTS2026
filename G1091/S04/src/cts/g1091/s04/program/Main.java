package cts.g1091.s04.program;

import cts.g1091.s04.implementare.Masa;
import cts.g1091.s04.implementare.Ospatar;
import cts.g1091.s04.implementare.Restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Restaurant restaurant = Restaurant.getInstance();
       restaurant.addMasa(new Masa(1));
       restaurant.addMasa(new Masa(2));
       restaurant.addMasa(new Masa(3));
       restaurant.addMasa(new Masa(4));

        Ospatar ospatar1 = new Ospatar("Gigel");
        Ospatar ospatar2 = new Ospatar("Costel");
        restaurant.afisareMese();

        ospatar1.preluareClient(2);
        ospatar2.preluareClient(1);
        ospatar2.preluareClient(3);

        ospatar1.afisareMese();
        ospatar2.afisareMese();
    }
}