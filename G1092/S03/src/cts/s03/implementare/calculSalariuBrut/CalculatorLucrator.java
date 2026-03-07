package cts.s03.implementare.calculSalariuBrut;

import cts.s03.implementare.angajati.IAngajat;
import cts.s03.implementare.angajati.Lucrator;

public class CalculatorLucrator implements ICalculator {

    @Override
    public double calculSalariuBrut(IAngajat angajat) {
        Lucrator l= (Lucrator) angajat;
        double salariulBrut=l.getSalariuBaza()*(1+l.getCoeficientRisc());

        return salariulBrut;
    }
}
