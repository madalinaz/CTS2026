package cts.g1093.s03.implementare.angajati;

import cts.g1093.s03.implementare.cim.CIM;
import cts.g1093.s03.implementare.exceptii.ExceptieTaxa;
import cts.g1093.s03.implementare.taxare.TaxeNormale;

public class Lucrator extends Angajat{
    private double sporDeRisc;

    @Override
    public double calculSalariu() {
        //p1 calcul salariu brut
        double salariuBrutTotal;
        salariuBrutTotal=this.getSalariuBrutBaza()*(1+sporDeRisc);

        //p2 calcul salariu net
        double salariuNetTotal;
        salariuNetTotal=salariuBrutTotal;
        try {
            salariuNetTotal*=(1- TaxeNormale.getProcentDupaNume("CAS")- TaxeNormale.getProcentDupaNume("CASS"));
            salariuNetTotal*=1- TaxeNormale.getProcentDupaNume("Impozit");

            return salariuNetTotal;
        } catch (ExceptieTaxa e) {
            throw new RuntimeException(e);
        }
    }

    public Lucrator(String nume, double salariuBrutBaza, double sporDeRisc, CIM cim) {
        super(nume, salariuBrutBaza, cim);
        this.sporDeRisc=sporDeRisc;
    }

    @Override
    public String toString() {
        return "Lucrator{" +
                "sporDeRisc=" + sporDeRisc +
                "} " + super.toString();
    }
}
