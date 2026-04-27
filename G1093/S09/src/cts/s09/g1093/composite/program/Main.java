package cts.s09.g1093.composite.program;

import cts.s09.g1093.composite.implementare.INod;
import cts.s09.g1093.composite.implementare.NodStructura;
import cts.s09.g1093.composite.implementare.Virus;

public class Main {
    public static void main(String[] args) {
        INod nodEuropa=new NodStructura("Europa");
        nodEuropa.addNod(new NodStructura("Romania"));
        nodEuropa.addNod(new NodStructura("Italia"));

        nodEuropa.getNode(1).addNod(new Virus("Covid", 150, 0.01f));
        nodEuropa.getNode(1).addNod(new Virus("Gripa", 150, 0.01f));
        nodEuropa.getNode(0).addNod(new Virus("Covid", 50, 0.01f));

        System.out.println("Total cazuri Europa: "+nodEuropa.getTotalCazuri());
        System.out.println("Este sigura Europa?: "+nodEuropa.esteSiguraDeVizitat());
    }
}
