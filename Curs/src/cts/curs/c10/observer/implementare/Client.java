package cts.curs.c10.observer.implementare;

public class Client implements IObserver{
	private String nume;
	
	public Client(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void getMesaj(String mesaj) {
		System.out.println("Clientul "+this.nume + " a primit mesajul: " + mesaj);
	}

}
