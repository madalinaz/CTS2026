package cts.g1094.composite.program;

import cts.g1094.composite.implementare.INod;
import cts.g1094.composite.implementare.NodStructura;
import cts.g1094.composite.implementare.Virus;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        INod nodEuropa = new NodStructura("Europa");
        INod nodRomania = new NodStructura("Romania");
        INod nodItalia = new NodStructura("Italia");

        nodEuropa.addNode(nodRomania);
        nodEuropa.addNode(nodItalia);

        nodRomania.addNode(new Virus("Covid", 100, 0.1f));
        nodRomania.addNode(new Virus("Covid12", 200, 0.2f));
        nodItalia.addNode(new Virus("Covid3", 300, 0.1f));

        System.out.println(nodEuropa.getTotalCazuri());
    }
}