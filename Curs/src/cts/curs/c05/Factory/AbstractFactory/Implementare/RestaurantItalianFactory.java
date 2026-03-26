package cts.curs.c05.Factory.AbstractFactory.Implementare;

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
