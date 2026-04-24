package cts.curs.c05.factory.AbstractFactory.Implementare;

public class RestaurantJaponezFactory implements RestaurantFactory {
    @Override
    public AbstractFelPrincipal getFelPrincipal() {
        return new Sushi();
    }

    @Override
    public AbstractBautura getBautura() {
        return new Matcha();
    }
}
