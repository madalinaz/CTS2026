package cts.s3.gr1091.implementare.angajati;

import cts.s3.gr1091.implementare.calculator.CalculSalariuBazaLucrator;
import cts.s3.gr1091.implementare.calculator.ICalculSalariu;
import cts.s3.gr1091.implementare.taxare.FactoryTaxare;

public class Lucrator extends Angajat {
    private double coefRisc;
    private static ICalculSalariu calculator = new CalculSalariuBazaLucrator();

    public Lucrator(String nume, double salariuBaza, String COR, double coefRisc) {
        super(nume, salariuBaza, COR);
        this.coefRisc = coefRisc;
    }


    @Override
    public double calculSalariu() {
        // 1. calcul salariu brut pentru regula HR
        double salariuBrut = calculator.calculSalariuBrut(this);
        // 2. calcul salariu net tinand cont de taxe (financiar)
        double salariuNet = FactoryTaxare.getTaxareDupaCor(this.getCOR()).getSalariuNetDinBrut(salariuBrut);
        return salariuNet;
    }

    public double getCoefRisc() {
        return coefRisc;
    }
}
