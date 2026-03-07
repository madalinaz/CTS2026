package cts.s03.implementare.calculSalariuBrut;

import cts.s03.implementare.angajati.IAngajat;
import cts.s03.implementare.angajati.Manager;

public class CalculatorManager implements ICalculator{
    @Override
    public double calculSalariuBrut(IAngajat angajat) {
        Manager m= (Manager) angajat;
        double salariulBrut=m.getNumarProiecte()*Manager.getTarifPerProiect();

        return salariulBrut;
    }
}
