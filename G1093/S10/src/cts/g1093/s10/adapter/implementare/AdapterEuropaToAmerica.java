package cts.g1093.s10.adapter.implementare;

public class AdapterEuropaToAmerica extends PrizaEuropa implements IPrizaAmerica{

    @Override
    public void incarcaLa110V() {
        this.incarcaLa230V();
        System.out.println("Adaptor care face conversie de la 230V la 110V.");
    }
}
