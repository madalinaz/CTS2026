package cts.curs.c05.factory.FactoryMethod.Program;

import cts.curs.c05.factory.FactoryMethod.Implementare.FactoryPizzaVegetariana;
import cts.curs.c05.factory.FactoryMethod.Implementare.IFactory;
import cts.curs.c05.factory.FactoryMethod.Implementare.IPizza;

public class Program {

	public static void main(String[] args) {
		IFactory factory = null;
		factory = new FactoryPizzaVegetariana();
		
		IPizza pizza=null;
		pizza = factory.crearePizza("Raw");
		pizza.afisareDescriere();
	}

}
