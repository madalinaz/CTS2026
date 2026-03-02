package cts.g1094.s02.implementare.angajati;
import cts.g1094.s02.implementare.exceptii.ExceptieTaxa;
import cts.g1094.s02.implementare.taxare.Taxe;

public class Manager extends Angajat{
    private int nrProiecte;
    private static double TARIFPROIECT;

    @Override
    public double calculSalariu() {
        //pas 1 - calcul salariu brut
        double salariuBrut = getSalariuBaza() + nrProiecte*TARIFPROIECT;

        //pas 2 - calcul salariu net
        try {
            double salariuNet = getSalariuBaza() * (1- Taxe.getProcentTaxa1("CAS") - Taxe.getProcentTaxa1("CASS"));
            salariuNet *= 1 - Taxe.getProcentTaxa1("IMPOZIT");
            return salariuNet;

        } catch (ExceptieTaxa e) {
            throw new RuntimeException(e);
        }

//        return -1;
    }

    public Manager(String nume, double salariuBaza, int nrProiecte) {
        super(nume, salariuBaza);
        this.nrProiecte=nrProiecte;
    }


}
