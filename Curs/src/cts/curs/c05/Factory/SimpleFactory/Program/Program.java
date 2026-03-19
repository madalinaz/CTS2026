package cts.curs.c05.Factory.SimpleFactory.Program;

import cts.curs.c05.Factory.SimpleFactory.Implementare.ETipPizza;
import cts.curs.c05.Factory.SimpleFactory.Implementare.IPizza;
import cts.curs.c05.Factory.SimpleFactory.Implementare.PizzaFactory;

public class Program {

	public static void main(String[] args) {
		PizzaFactory pizzaFactory = new PizzaFactory();
		IPizza pizza = null;
		try {
			pizza = pizzaFactory.crearePizza(ETipPizza.ROMA);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pizza.afisareDescriere();
	}

}
