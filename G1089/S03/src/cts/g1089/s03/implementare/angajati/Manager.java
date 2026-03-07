package cts.g1089.s03.implementare.angajati;

import cts.g1089.s03.implementare.calculSalariu.FactoryCalculSalariu;
import cts.g1089.s03.implementare.taxare.FactoryTaxare;

public class Manager implements Angajat{
    private String nume;
    private double coeficientDeStres;
    private String COR;

    public Manager(String nume, double coeficientDeStres, String COR) {
        this.nume = nume;
        this.coeficientDeStres = coeficientDeStres;
        this.COR = COR;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getCoeficientDeStres() {
        return coeficientDeStres;
    }

    public void setCoeficientDeStres(double coeficientDeStres) {
        this.coeficientDeStres = coeficientDeStres;
    }

    public void setCOR(String COR) {
        this.COR = COR;
    }

    @Override
    public double calculSalariu() {
        //        Pas 1: Calcul Salariu BRUT

        double salariuBrut= 0;
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
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", coeficientDeStres=" + coeficientDeStres +
                ", COR='" + COR + '\'' +
                ", salariu NET=" + calculSalariu() +
                '}';
    }
}
