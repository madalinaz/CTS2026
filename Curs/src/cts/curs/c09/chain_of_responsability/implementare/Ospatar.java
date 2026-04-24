package cts.curs.c09.chain_of_responsability.implementare;


public class Ospatar extends AHandler{

	@Override
	public void procesareComanda(Comanda comanda) {
		if(comanda.getGrad() <= 5)
			System.out.println("Ospatarul a procesat comanda "
		+ comanda.getProdus());
		else {
			System.out.println("Ospatarul nu poate procesa comanda");
			if(this.getNextHandler() != null)
				this.getNextHandler().procesareComanda(comanda);
		}
	}

}
