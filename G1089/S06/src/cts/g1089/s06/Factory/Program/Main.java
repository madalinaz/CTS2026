package cts.g1089.s06.Factory.Program;

import cts.g1089.s06.Factory.Implementare.BauturaFactory;
import cts.g1089.s06.Factory.Implementare.IBautura;
import cts.g1089.s06.Factory.Implementare.TipBautura;

public class Main {
    static void main() {
        IBautura b1 = BauturaFactory.getBautura(TipBautura.CEAI,"Ceai verde",200,25);
        System.out.println(b1);
    }
}
