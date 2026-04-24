package cts.curs.c09.chain_of_responsability.implementare;

public class Bucatar extends AHandler{

	@Override
	public void procesareComanda(Comanda comanda) {
		if(comanda.getGrad()>5 && comanda.getGrad()<=20) {
			System.out.println("Bucatarul a procesat comanda "
					+ comanda.getProdus());
		} else if(comanda.getGrad()<=5){
			System.out.println("Bucatarul nu poate procesa comanda, comanda este pentru ospatar");
		} else{
			//inseamna ca avem grad peste limita bucatar
			//.....trimitem catre bucatar sef
		}
	}

}
