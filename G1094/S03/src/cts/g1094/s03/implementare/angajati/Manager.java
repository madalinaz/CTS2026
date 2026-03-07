package cts.g1094.s03.implementare.angajati;
import cts.g1094.s03.implementare.taxare.FactoryTaxare;

public class Manager extends Angajat{
    private int nrProiecte;
    private static double TARIFPROIECT;

    public Manager(String nume, double salariuBaza, int nrProiecte, String COR) {
        super(nume, salariuBaza, COR);
        this.nrProiecte=nrProiecte;
    }

    @Override
    public double calculSalariu() {
        //pas 1 - calcul salariu brut
        double salariuBrut = getSalariuBaza() + nrProiecte*TARIFPROIECT;

        //pas 2 - calcul salariu net
       return FactoryTaxare.getTaxareDupaCOR(this.getCOR()).calculNetDinBrut(salariuBrut);

    }

    @Override
    public String toString() {
        return "Manager{" +
                "nrProiecte=" + nrProiecte +
                "} " + super.toString();
    }
}
