package cts.g1092.factory.program;

import cts.g1092.factory.implementare.BauturiFactory;
import cts.g1092.factory.implementare.CiocolataCalda;
import cts.g1092.factory.implementare.ETipBautura;
import cts.g1092.factory.implementare.IBautura;

public class Main {
    public static void main(String[] args) {
        IBautura bautura1 = BauturiFactory.getBautura(ETipBautura.CAFEA);
        System.out.println(bautura1.getDetalii());
        // cum imi aleg eu tipul de ciocolata
        // facem cast la ciocolata calda pt obj bautura 2
        IBautura bautura2 = BauturiFactory.getBautura(ETipBautura.CIOCOLATA_CALDA);
        ((CiocolataCalda) bautura2).setTipCiocolata("Ciocolata alba").setTipLapte("Vegetal");
        System.out.println(bautura2.getPret());

    }
}
