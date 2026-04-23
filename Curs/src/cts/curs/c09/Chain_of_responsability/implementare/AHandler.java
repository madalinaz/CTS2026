package cts.curs.c09.Chain_of_responsability.implementare;

public abstract class AHandler {
	private AHandler nextHandler;
	
	public AHandler getNextHandler(){
		return this.nextHandler;
	}

	public void setNextHandler(AHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void procesareComanda(Comanda comanda);
}
