package cts.g1090.s04.program;

import cts.g1090.s04.implementare.Masa;
import cts.g1090.s04.implementare.Ospatar;
import cts.g1090.s04.implementare.Restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ospatar ospatar1 = new Ospatar("Gigel");
        Ospatar ospatar2 = new Ospatar("Costel");

        Restaurant restaurant = Restaurant.getInstance();
        restaurant.addMasa(new Masa(1));
        restaurant.addMasa(new Masa(2));
        restaurant.addMasa(new Masa(3));
        restaurant.addMasa(new Masa(4));
        restaurant.afisareMese();

        ospatar1.preluareComanda("Pizza",2);
        ospatar1.preluareComanda("Pizza",3);
        ospatar2.preluareComanda("Pizza",1);

        restaurant.afisareMese();

    }
}