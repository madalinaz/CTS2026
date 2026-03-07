package cts.g1090.s03.implementare.angajati;

import cts.g1090.s03.implementare.calculator.CalcSalBrutLucrator;
import cts.g1090.s03.implementare.taxare.FactoryTaxare;

public class Lucrator implements IAngajat{


    private String nume;
    private double salariuBrutBaza;
    private double coeficientRisc;
    private String COR;
    private static CalcSalBrutLucrator calculator = new CalcSalBrutLucrator();


    public Lucrator(String nume, double salariuBrutBaza, double coeficientRisc, String COR) {
        this.nume = nume;
        this.salariuBrutBaza = salariuBrutBaza;
        this.coeficientRisc = coeficientRisc;
        this.COR = COR;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariuBrutBaza() {
        return salariuBrutBaza;
    }

    public void setSalariuBrutBaza(double salariuBrutBaza) {
        this.salariuBrutBaza = salariuBrutBaza;
    }

    public double getCoeficientRisc() {
        return coeficientRisc;
    }

    public void setCoeficientRisc(double coeficientRisc) {
        this.coeficientRisc = coeficientRisc;
    }

    public void setCOR(String COR) {
        this.COR = COR;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public double calculSalariu() {

        double salariuBrut = calculator.calculSalariuBrut(this);

        return FactoryTaxare.getTaxareDupaCor(COR).calculSalariuNetDupaBrut(salariuBrut);

    }

    @Override
    public String getCOR() {
        return this.COR;
    }
}
