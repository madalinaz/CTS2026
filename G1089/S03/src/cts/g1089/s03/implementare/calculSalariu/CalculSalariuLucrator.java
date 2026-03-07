package cts.g1089.s03.implementare.calculSalariu;

import cts.g1089.s03.implementare.angajati.Angajat;
import cts.g1089.s03.implementare.angajati.Lucrator;

public class CalculSalariuLucrator implements ICalculSalariu{

    @Override
    public double getBrutAngajat(Angajat a) {
        Lucrator l = (Lucrator) a;
        double salariuBrut = 0;
        salariuBrut= l.getTarifOrar()*l.getNrOreLucrate();
        return salariuBrut;
    }
}
