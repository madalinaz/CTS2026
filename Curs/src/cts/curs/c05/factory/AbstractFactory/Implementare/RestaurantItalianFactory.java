package cts.curs.c05.factory.AbstractFactory.Implementare;

public class RestaurantItalianFactory implements RestaurantFactory {
    @Override
    public AbstractFelPrincipal getFelPrincipal() {
        return new Pizza();
    }

    @Override
    public AbstractBautura getBautura() {
        return new VinRosu();
    }
}
