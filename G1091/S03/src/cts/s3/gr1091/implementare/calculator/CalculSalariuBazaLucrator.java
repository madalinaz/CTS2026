package cts.s3.gr1091.implementare.calculator;

import cts.s3.gr1091.implementare.angajati.IAngajat;
import cts.s3.gr1091.implementare.angajati.Lucrator;

public class CalculSalariuBazaLucrator implements ICalculSalariu{

    @Override
    public double calculSalariuBrut(IAngajat angajat) {
        Lucrator l = (Lucrator)angajat;
        double salariuBrut = l.getSalariuBaza()* (1 + l.getCoefRisc());
        return salariuBrut;
    }
}
