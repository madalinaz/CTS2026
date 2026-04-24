package cts.curs.c09.composite.implementare;

public class Produs extends ANod{
	
	private String denumire;
	private int pret;
	
	public Produs(String denumire, int pret){
		this.denumire = denumire;
		this.pret = pret;
	}
	@Override
	public String getDenumire() {
		return this.denumire;
	}

	@Override
	public int getPret() {
		return this.pret;
	}

}
