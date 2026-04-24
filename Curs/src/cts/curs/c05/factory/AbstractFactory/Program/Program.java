package cts.curs.c05.factory.AbstractFactory.Program;

import cts.curs.c05.factory.AbstractFactory.Implementare.AbstractBautura;
import cts.curs.c05.factory.AbstractFactory.Implementare.AbstractFelPrincipal;
import cts.curs.c05.factory.AbstractFactory.Implementare.RestaurantFactory;
import cts.curs.c05.factory.AbstractFactory.Implementare.RestaurantItalianFactory;

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
