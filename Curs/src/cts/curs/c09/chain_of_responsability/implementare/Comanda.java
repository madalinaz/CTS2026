package cts.curs.c09.chain_of_responsability.implementare;

public class Comanda {
	private String produs;
	private int cantitate;
	private int grad;
	//in loc de grad, sa stochez mancare si bautura comandata
	
	public Comanda(String produs, int cantitate, int grad) {
		this.produs = produs;
		this.cantitate = cantitate;
		this.grad = grad;
	}

	public String getProdus() {
		return produs;
	}

	public int getCantitate() {
		return cantitate;
	}

	public int getGrad() {
		return grad;
	}
}
