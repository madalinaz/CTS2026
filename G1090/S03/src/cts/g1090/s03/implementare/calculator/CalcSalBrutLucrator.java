package cts.g1090.s03.implementare.calculator;

import cts.g1090.s03.implementare.angajati.IAngajat;
import cts.g1090.s03.implementare.angajati.Lucrator;

public class CalcSalBrutLucrator implements ICalculatorSalBrut{

    @Override
    public double calculSalariuBrut(IAngajat angajat) {
        Lucrator lucrator = (Lucrator)angajat;
        double salariuBrut = lucrator.getSalariuBrutBaza()*(1+ lucrator.getCoeficientRisc());
        return salariuBrut;
    }


}
