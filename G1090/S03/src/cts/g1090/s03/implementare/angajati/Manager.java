package cts.g1090.s03.implementare.angajati;

import cts.g1090.s03.implementare.calculator.CalcSalBrutManager;
import cts.g1090.s03.implementare.taxare.FactoryTaxare;

public class Manager implements IAngajat {

    private String nume;
    private int nrProiecte;
    private double tarifProiectBrut;
    private double salariuBazaBrut;
    private String COR;
    private static CalcSalBrutManager calculator = new CalcSalBrutManager();


    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNrProiecte() {
        return nrProiecte;
    }

    public void setNrProiecte(int nrProiecte) {
        this.nrProiecte = nrProiecte;
    }

    public double getTarifProiectBrut() {
        return tarifProiectBrut;
    }

    public void setTarifProiectBrut(double tarifProiectBrut) {
        this.tarifProiectBrut = tarifProiectBrut;
    }

    public double getSalariuBazaBrut() {
        return salariuBazaBrut;
    }

    public void setSalariuBazaBrut(double salariuBazaBrut) {
        this.salariuBazaBrut = salariuBazaBrut;
    }

    @Override
    public String getCOR() {
        return COR;
    }

    public void setCOR(String COR) {
        this.COR = COR;
    }

    public Manager(String nume, int nrProiecte, double salariuBazaBrut, double tarifProiectBrut, String COR) {
        this.nume=nume;
        this.nrProiecte = nrProiecte;
        this.salariuBazaBrut = salariuBazaBrut;
        this.tarifProiectBrut = tarifProiectBrut;
        this.COR = COR;
    }


    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public double calculSalariu() {
        //pas 1:calcul salariu brut
        double salariuBrut = calculator.calculSalariuBrut(this);
        //pas 2:calcul salariu net (folosind taxarile)
        return FactoryTaxare.getTaxareDupaCor(COR).calculSalariuNetDupaBrut(salariuBrut);
    }
}
