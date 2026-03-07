package cts.g1089.s03.implementare.calculSalariu;

import cts.g1089.s03.implementare.angajati.Angajat;
import cts.g1089.s03.implementare.angajati.Manager;

public class CalculSalariuManager implements ICalculSalariu{

    @Override
    public double getBrutAngajat(Angajat a) {
        Manager m = (Manager) a;
        double salariuBrut= 2000*m.getCoeficientDeStres();
        return salariuBrut;
    }
}
