package cts.curs.c07.decorator.program;


import cts.curs.c07.decorator.implementare.APizza;
import cts.curs.c07.decorator.implementare.DecoratorCrown;
import cts.curs.c07.decorator.implementare.DecoratorPicant;
import cts.curs.c07.decorator.implementare.PizzaVegetariana;

public class Program {

	public static void main(String[] args) {
		APizza pizza = new PizzaVegetariana();
		System.out.println(pizza.getComponente());
		System.out.println(pizza.getPret());
		
		//folosind decorator
		APizza pizzaDecorata = new DecoratorCrown(pizza);
		//APizza pizzaDecorata2 = new DecoratorCrown(new PizzaVegetariana());
		System.out.println(pizzaDecorata.getComponente());
		System.out.println(pizzaDecorata.getPret());

		//decorare multipla
		APizza pizzaDecorataMultiplu = new DecoratorPicant
				(new DecoratorCrown
						(new PizzaVegetariana()), 10);
		System.out.println(pizzaDecorataMultiplu.getComponente());
		System.out.println(pizzaDecorataMultiplu.getPret());
	}

}
