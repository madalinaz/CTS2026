package cts.curs.c05.factory.SimpleFactory.Implementare;

public class PizzaRoma implements IPizza {
	private String carne;

	PizzaRoma(String carne) {
		this.carne = carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	@Override
	public void afisareDescriere() {
		System.out.println("Pizza Roma contine ....");
	}
}
