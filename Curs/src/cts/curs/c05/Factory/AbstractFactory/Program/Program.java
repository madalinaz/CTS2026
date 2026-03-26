package cts.curs.c05.Factory.AbstractFactory.Program;

import cts.curs.c05.Factory.AbstractFactory.Implementare.AbstractBautura;
import cts.curs.c05.Factory.AbstractFactory.Implementare.AbstractFelPrincipal;
import cts.curs.c05.Factory.AbstractFactory.Implementare.RestaurantFactory;
import cts.curs.c05.Factory.AbstractFactory.Implementare.RestaurantItalianFactory;

public class Program {

    public static void plasareComanda(RestaurantFactory restaurant) {
        AbstractFelPrincipal felPrincipal = restaurant.getFelPrincipal();
        AbstractBautura bautura = restaurant.getBautura();
        System.out.println(felPrincipal.getDescriere());
        bautura.afisareDescriere();
    }

    public static void main(String[] args) {
            plasareComanda(new RestaurantItalianFactory());
    }
}
