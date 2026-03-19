package cts.curs.c05.Factory.FactoryMethod.Implementare;

public class FactoryPizzaNonVegetariana implements IFactory{


	@Override
	public IPizza crearePizza(String tipPizza) {
		switch (tipPizza){
            case "Roma" -> {
                return new PizzaRoma();
            }
			default -> {
				return null;
			}
        }
	}
}
