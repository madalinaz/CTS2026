package cts.curs.c05.Factory.FactoryMethod.Implementare;

public class FactoryPizzaVegetariana implements IFactory{

	@Override
	public IPizza crearePizza(String tipPizza) {
		switch (tipPizza){
			case "Vegetariana" -> {
				return new PizzaVegetariana();
			}
			case "Raw"->{
				return new PizzaRawVegana();
			}
			default -> {
				return null;
			}
		}
	}

}
