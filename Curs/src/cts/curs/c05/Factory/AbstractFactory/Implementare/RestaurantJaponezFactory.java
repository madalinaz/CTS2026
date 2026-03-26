package cts.curs.c05.Factory.AbstractFactory.Implementare;

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
