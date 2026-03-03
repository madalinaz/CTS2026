package cts.g1093.s02.implementare.angajati;

import cts.g1093.s02.implementare.exceptii.ExceptieTaxa;
import cts.g1093.s02.implementare.taxare.Taxe;

public class Manager extends Angajat{
    private int nrProiecte;
    private static double tarifBrutPerProiect=100;

    public Manager(String nume, double salariuBrutBaza, int nrProiecte) {
        super(nume, salariuBrutBaza);
        this.nrProiecte=nrProiecte;
    }


    @Override
    public double calculSalariu() {
        //p1 calcul salariu brut
        double salariuBrutTotal=this.getSalariuBrutBaza();
        salariuBrutTotal+=nrProiecte*tarifBrutPerProiect;

        //p2 calcul salariu net
        double salariuNetTotal;
        salariuNetTotal=salariuBrutTotal;
        try {
            salariuNetTotal*=(1- Taxe.getProcentDupaNume("CAS")-Taxe.getProcentDupaNume("CASS"));
            salariuNetTotal*=1- Taxe.getProcentDupaNume("Impozit");

            return salariuNetTotal;
        } catch (ExceptieTaxa e) {
            throw new RuntimeException(e);
        }
    }


}
