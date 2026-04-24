package cts.curs.c05.factory.SimpleFactory.Implementare;

public class PizzaVegetariana implements IPizza{

	@Override
	public void afisareDescriere() {
		System.out.println("Pizza vegetariana contine blat, sos rosii, vinete");
	}
}
