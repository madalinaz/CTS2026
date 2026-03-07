package cts.g1090.s03.implementare.calculator;

import cts.g1090.s03.implementare.angajati.IAngajat;
import cts.g1090.s03.implementare.angajati.Manager;

public class CalcSalBrutManager implements ICalculatorSalBrut{

    @Override
    public double calculSalariuBrut(IAngajat angajat) {
        Manager manager = (Manager)angajat;
        double salariuBrut = manager.getSalariuBazaBrut()+ manager.getNrProiecte()* manager.getTarifProiectBrut();
        return salariuBrut;
    }
}
