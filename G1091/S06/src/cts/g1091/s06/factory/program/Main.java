package cts.g1091.s06.factory.program;

import cts.g1091.s06.factory.implementare.Bautura;
import cts.g1091.s06.factory.implementare.BauturaFactory;
import cts.g1091.s06.factory.implementare.Cafea;
import cts.g1091.s06.factory.implementare.TipBautura;

public class Main {
    public static void main(String[] args) {

        Bautura b1 = BauturaFactory.getBautura(TipBautura.CEAI, "CEAI NEGRU", 200, 20);
        System.out.println(b1.getDetalii());

        Bautura b2 = BauturaFactory.getBautura(TipBautura.CAFEA, "cafea neagra", 250, 20);
        System.out.println(b2.getDetalii());
        ((Cafea)b2).setAreFrisca(true);
        System.out.println(b2.getDetalii());
    }
}
