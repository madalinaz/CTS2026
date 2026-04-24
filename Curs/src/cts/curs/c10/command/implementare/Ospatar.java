package cts.curs.c10.command.implementare;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
	private List<IComanda> listaComenzi;
	
	public Ospatar() {
		this.listaComenzi = new ArrayList<>();
	}
	
	public void preiaComanda(IComanda comanda) {
		this.listaComenzi.add(comanda);
	}
	
	public void transmiteComenzile() {
		for(IComanda c: this.listaComenzi)
			c.prelucreaza();
		this.listaComenzi.clear();
	}
}
