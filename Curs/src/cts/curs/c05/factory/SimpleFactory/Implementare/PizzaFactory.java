package cts.curs.c05.factory.SimpleFactory.Implementare;

public class PizzaFactory {
	
	public static IPizza crearePizza(ETipPizza tipPizza) throws Exception {
		switch (tipPizza) {
		case VEGETARIANA:
			return new PizzaVegetariana();
		case ROMA:
			return new PizzaRoma("default");
		default:
			throw new Exception("Nu este tip pizza valid!");
		}
	}
}
