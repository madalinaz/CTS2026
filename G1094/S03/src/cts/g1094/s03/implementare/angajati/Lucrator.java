package cts.g1094.s03.implementare.angajati;

import cts.g1094.s03.implementare.taxare.FactoryTaxare;

public class Lucrator extends Angajat{
    private int nrOreSuplimentare;

    public Lucrator(String nume, double salariuBaza, int nrOreSuplimentare, String COR) {
        super(nume, salariuBaza, COR);
        this.nrOreSuplimentare=nrOreSuplimentare;
    }

    @Override
    public double calculSalariu() {
        //pas 1 - calcul salariu brut
        double salariuBrut;
        salariuBrut = getSalariuBaza()+nrOreSuplimentare*100;

        //pas 2 - calcul salariu net
        return FactoryTaxare.getTaxareDupaCOR(this.getCOR()).calculNetDinBrut(salariuBrut);

    }

    @Override
    public String toString() {
        return "Lucrator{" +
                "nrOreSuplimentare=" + nrOreSuplimentare +
                "} " + super.toString();
    }
}
