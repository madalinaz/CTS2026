package cts.g1090.s06.factory.program;

import cts.g1090.s06.factory.implementare.Bautura;
import cts.g1090.s06.factory.implementare.BauturiFactory;
import cts.g1090.s06.factory.implementare.TipBautura;

public class Program {
    static void main() {
        Bautura b1 = BauturiFactory.getBautura(TipBautura.CAFEA,"Cafea dubla",100,25);
        System.out.println(b1);
    }
}
