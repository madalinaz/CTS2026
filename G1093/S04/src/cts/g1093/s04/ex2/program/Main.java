package cts.g1093.s04.ex2.program;

import cts.g1093.s04.ex2.implementare.Generator;

public class Main {
    // ex2
    // sa se imlementeze un generator de id-uri
    // metoda 1. Cere un id anume si se verifica daca a mai fost folosit sau nu
    // metoda 2. Se genereaza un ID nou random dar care nu a mai fost folosit
    public static void main(String[] args) {
        Generator generator = Generator.getInstance();
        int id1 = 465;
        System.out.println("ID-ul 465 este folosit: " + generator.esteFolosit(465));
        System.out.println("ID2 generat: " + generator.genereazaID());
        System.out.println("ID3 generat: " + generator.genereazaID());
        System.out.println("ID4 generat: " + generator.genereazaID());
    }

}
