package cts.g1091.s09.composite.main;

import cts.g1091.s09.composite.implementare.INod;
import cts.g1091.s09.composite.implementare.NodStructura;
import cts.g1091.s09.composite.implementare.Virus;

public class Main {
    public static void main(String[] args) {
        INod nodEuropa = new NodStructura("Europa");
        nodEuropa.addNod(new NodStructura("Romania"));
        nodEuropa.addNod(new NodStructura("Italia"));
        nodEuropa.getNode(0).addNod(new Virus("Covid", 100, true));
        nodEuropa.getNode(0).addNod(new Virus("Gripa", 200, false));
        nodEuropa.getNode(0).addNod(new Virus("Covid2", 300, true));

        nodEuropa.getNode(1).addNod(new Virus("Covid", 100, false));
        nodEuropa.getNode(1).addNod(new Virus("Gripa", 200, false));

        System.out.println(nodEuropa.getNode(1).esteSigura());
        System.out.println(nodEuropa.getNode(1).getTotalNrCazuri());
        // System.out.println(nodEuropa.getNode(1).getEsteTransmisibila());

        System.out.println(nodEuropa.getNode(1).esteSigura());
        System.out.println(nodEuropa.getNode(1).getTotalNrCazuri());

        System.out.println(nodEuropa.esteSigura());
        System.out.println(nodEuropa.getTotalNrCazuri());

        // o altfel de propunere a.i. sa nu folosim estetransmisibila si pt nodurile
        // structura)
        // de modelat organigrama unei companii in care avem departamente
        // subdepartamente angajati sef si angajati
        // se stocheaza info despre salarii + fond salarii
        // sa se adauge o meth specifica doar unui manager
    }
}
