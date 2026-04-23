package cts.curs.c09.Composite.implementare;


public class Meniu{

	ANod structura;
	String numeRestaurant;
	
	public Meniu(ANod structura, String numeRestaurant){
		this.structura = structura;
		this.numeRestaurant = numeRestaurant;
	}

	public String getNumeRestaurant() {
		return numeRestaurant;
	}

	public void setNumeRestaurant(String numeRestaurant) {
		this.numeRestaurant = numeRestaurant;
	}

}
