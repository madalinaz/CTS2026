package cts.curs.c05.builder.v1.Program;


import cts.curs.c05.builder.v1.Implementare.Petrecere;
import cts.curs.c05.builder.v1.Implementare.PetrecereBuilder;

public class Program {

	public static void main(String[] args) {
		//Petrecere petrecere = new Petrecere();
		PetrecereBuilder builder = new PetrecereBuilder();
		Petrecere petrecereTest = builder.build();
		builder = builder.setAreBaloane(true);
		System.out.println(petrecereTest);
		Petrecere petrecere = builder.setAreArtificii(true)
				.setNrPersoane(20)
				.setAreTort(true).build();
		
		System.out.println(petrecere);
	}

}
