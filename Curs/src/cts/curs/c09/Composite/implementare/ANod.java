package cts.curs.c09.Composite.implementare;


public abstract class ANod {
	//metode pentru frunze
	public abstract String getDenumire();
	public abstract int getPret();

	//pentru toate nodurile, dar implementata din baza pentru noduri frunza
	public String getInfo(){
		return this.getDenumire() + " " + this.getPret();
	}

	//metode specifice nodurilor composite/structura
	public void adaugaNod(ANod elemStructura){
		throw new UnsupportedOperationException();
	}
	
	public void eliminaNod(ANod elemStructura){
		throw new UnsupportedOperationException();
	}
	
	public ANod getNod (int i){
		throw new UnsupportedOperationException();
	}
}
