package cts.curs.c10.observer.program;


import cts.curs.c10.observer.implementare.Client;
import cts.curs.c10.observer.implementare.Restaurant;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Florin");
		Client client2 = new Client("Florinel");
		Client client3 = new Client("Floricica");

		Restaurant restaurant = new Restaurant("Pizzeria ASE");
		restaurant.addObserver(client1);
		restaurant.addObserver(client2);
		restaurant.addObserver(client3);

		System.out.println("===== Adaugare produs nou in meniu =====");
		restaurant.addMeniu("Pizza vegetariana. 23 lei");
		restaurant.removeObserver(client1);
		System.out.println("\n===== Reducere pret produs din meniu =====");
		restaurant.reducerePretMeniu("Pizza vegetariana", 20);
	}

}
