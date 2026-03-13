package cts.g1089.s04.ex1.program;

import cts.g1089.s04.ex1.implementare.Masa;
import cts.g1089.s04.ex1.implementare.Ospatar;
import cts.g1089.s04.ex1.implementare.Restaurant;

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
        restaurant.addMasa(new Masa(5));

        restaurant.afisareMese();

        ospatar1.preluareComanda("Pizza, cola",2);
        ospatar2.preluareComanda("Pizza, cola",1);
        ospatar2.preluareComanda("Pizza, cola",4);
        ospatar1.preluareComanda("Pizza, cola",3);
        ospatar1.afisareSituatieMese();
        ospatar2.afisareSituatieMese();
    }
}