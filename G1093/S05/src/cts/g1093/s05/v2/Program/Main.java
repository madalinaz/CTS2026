package cts.g1093.s05.v2.Program;

import cts.g1093.s05.v2.implementare.Crocs;
import cts.g1093.s05.v2.implementare.CrocsPrototypeFactory;

public class Main {
    static void main() {
        try {
            Crocs c1 = CrocsPrototypeFactory.getPrototipuri("Disney");
            Crocs c2 = CrocsPrototypeFactory.getPrototipuri("Disney");
            Crocs c3 = CrocsPrototypeFactory.getPrototipuri("Disney");
            Crocs c4 = CrocsPrototypeFactory.getPrototipuri("Disney");
            c2.setCuloare("mov");
            c3.setMarime(40);
            c3.adaugaAccesoriu("Daisy");
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
