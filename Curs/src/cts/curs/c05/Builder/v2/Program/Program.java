package cts.curs.c05.Builder.v2.Program;

import cts.curs.c05.Builder.v2.Implementare.Petrecere;
import cts.curs.c05.Builder.v2.Implementare.PetrecereBuilder;

public class Program {

	public static void main(String[] args) {
		PetrecereBuilder builder = new PetrecereBuilder();
		Petrecere petrecere = builder.setAreArtificii(true).setNrPersoane(200).build();
		//de aici nu mai se poate modif petrecere
		System.out.println(petrecere);
	}

}
