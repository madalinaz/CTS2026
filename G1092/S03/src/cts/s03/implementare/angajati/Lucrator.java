package cts.s03.implementare.angajati;

import cts.s03.implementare.calculSalariuBrut.FactoryCalculator;
import cts.s03.implementare.taxare.FactoryTaxare;

public class Lucrator implements IAngajat {

    private String nume;
    private double salariuBaza;
    private double coeficientRisc;
    private String COR;

    public Lucrator(String nume, double salariuBaza, double coeficientRisc, String COR) {
        this.nume = nume;
        this.salariuBaza = salariuBaza;
        this.coeficientRisc = coeficientRisc;
        this.COR=COR;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariuBaza() {
        return salariuBaza;
    }

    public void setSalariuBaza(double salariuBaza) {
        this.salariuBaza = salariuBaza;
    }

    public double getCoeficientRisc() {
        return coeficientRisc;
    }

    public void setCoeficientRisc(double coeficientRisc) {
        this.coeficientRisc = coeficientRisc;
    }

    @Override
    public double calculeazaSalariu() {
//        double salariulBrut=this.salariuBaza*(1+this.coeficientRisc);
        double salariulBrut= FactoryCalculator.getCalculatorBrut(this).calculSalariuBrut(this);

        return FactoryTaxare.getTaxareDupaCOR(this.COR).calculSalariuNet(salariulBrut);

    }

    @Override
    public String getCOR() {
        return COR;
    }
}
