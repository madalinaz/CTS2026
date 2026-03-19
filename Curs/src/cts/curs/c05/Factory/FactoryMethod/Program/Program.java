package cts.curs.c05.Factory.FactoryMethod.Program;

import cts.curs.c05.Factory.FactoryMethod.Implementare.FactoryPizzaNonVegetariana;
import cts.curs.c05.Factory.FactoryMethod.Implementare.FactoryPizzaVegetariana;
import cts.curs.c05.Factory.FactoryMethod.Implementare.IFactory;
import cts.curs.c05.Factory.FactoryMethod.Implementare.IPizza;

public class Program {

	public static void main(String[] args) {
		IFactory factory = null;
		factory = new FactoryPizzaVegetariana();
		
		IPizza pizza=null;
		pizza = factory.crearePizza("Raw");
		pizza.afisareDescriere();
	}

}
