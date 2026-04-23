package cts.curs.c09.Chain_of_responsability.implementare;

public class Bucatar extends AHandler{

	@Override
	public void procesareComanda(Comanda comanda) {
		System.out.println("Bucatarul a procesat comanda " 
				+ comanda.getProdus());
	}

}
