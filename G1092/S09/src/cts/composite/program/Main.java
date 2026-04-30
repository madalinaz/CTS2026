package cts.composite.program;

import cts.composite.implementare.Angajat;
import cts.composite.implementare.INod;
import cts.composite.implementare.Manager;
import cts.composite.implementare.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod radacina = new NodStructura("Departament Principal");

        radacina.addNode(new NodStructura("D1"));
        radacina.addNode(new NodStructura("D2"));
        radacina.addNode(new NodStructura("D3"));

        INod nodManager = new Manager("Gigel", 1000f);
        radacina.getNode(0).addNode(nodManager);

        nodManager.addNode(new Angajat("A1", 100f));
        nodManager.addNode(new Angajat("A2", 100f));
        nodManager.addNode(new Angajat("A3", 100f));

        System.out.println(radacina.getTotalAngajati());
        System.out.println(nodManager.getSalariu());
        //TODO: Actualizare implementare curenta astfel incat metoda getSalariu() apelata pentru noduri structura sa returneze salariul mediu
        //TODO: al tuturor angajatilor asignati
    }
}
