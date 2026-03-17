package cts.g1094.s04.ex2.program;

import cts.g1094.s04.ex2.implementare.GeneratorNumere;

public class Main {
    public static void main(String[] args) {
        GeneratorNumere generator = GeneratorNumere.getInstance();

        generator.genereazaNumar("B234HDHW");
        generator.genereazaNumar("Cndowono");
        generator.genereazaNumar("Nfwoj444");
        generator.genereazaNumar("Adhid333");

        generator.afisareNumere();

//        generator.genereazaNumar("B234HDHW");
    }
}
