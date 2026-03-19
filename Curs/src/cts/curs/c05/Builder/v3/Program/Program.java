package cts.curs.c05.Builder.v3.Program;

import cts.curs.c05.Builder.v3.Implementare.Petrecere;

public class Program {

	public static void main(String[] args) {
		Petrecere petrecere = Petrecere.builder().setAreArtificii(true).
				setAreBaloane(true).setNrPersoane(20).build();
		System.out.println(petrecere);
		
		Petrecere petrecere2=new Petrecere.PetrecereBuilder().setAreArtificii(true).build();

	}

}
