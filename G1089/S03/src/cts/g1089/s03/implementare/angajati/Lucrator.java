package cts.g1089.s03.implementare.angajati;

import cts.g1089.s03.implementare.calculSalariu.FactoryCalculSalariu;
import cts.g1089.s03.implementare.taxare.FactoryTaxare;

public class Lucrator implements Angajat{
    private String nume;
    private int nrOreLucrate;
    private double tarifOrar;
    private String COR;

    public Lucrator(String nume, int nrOreLucrate, double tarifOrar, String COR) {
        this.nume = nume;
        this.nrOreLucrate = nrOreLucrate;
        this.tarifOrar = tarifOrar;
        this.COR = COR;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrOreLucrate() {
        return nrOreLucrate;
    }

    public void setNrOreLucrate(int nrOreLucrate) {
        this.nrOreLucrate = nrOreLucrate;
    }

    public double getTarifOrar() {
        return tarifOrar;
    }

    public void setTarifOrar(double tarifOrar) {
        this.tarifOrar = tarifOrar;
    }

    @Override
    public double calculSalariu() {
        //        Pas 1: Calcul Salariu BRUT
        double salariuBrut = 0;
        salariuBrut = FactoryCalculSalariu.getCalculatorDupaAngajat(this).getBrutAngajat(this);
        //        Pas 2: Calcul Salariu NET

        return FactoryTaxare.getTaxareDupaCOR(COR).calculNetDinBrut(salariuBrut);

    }

    @Override
    public String getCOR() {
        return this.COR;
    }

    @Override
    public String toString() {
        return "Lucrator{" +
                "nume='" + nume + '\'' +
                ", nrOreLucrate=" + nrOreLucrate +
                ", tarifOrar=" + tarifOrar +
                ", COR='" + COR + '\'' +
                ",salariu NET=" + calculSalariu()+
                '}';
    }
}
