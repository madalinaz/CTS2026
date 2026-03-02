package cts.curs.c02.SOLID.S.After;

public class ServiciiAngajat {
    private final HR hr;
    private final CalculatorTaxe calculatorTaxe;

    public ServiciiAngajat(HR hr, CalculatorTaxe calculatorTaxe) {
        this.hr = hr;
        this.calculatorTaxe = calculatorTaxe;
    }

    public boolean esteEligibilPromovare(Angajat a){
        return hr.esteEligibilPromovare(a);
    }

    public double calculeazaTaxe(Angajat a) {
        return calculatorTaxe.calculeazaTaxe(a);
    }
}
