package cts.g1094.s04.ex2.implementare;

import java.util.ArrayList;
import java.util.List;

public class GeneratorNumere {
    private static GeneratorNumere instance = new GeneratorNumere();

    private List<String> numere;

    private GeneratorNumere(){
        numere = new ArrayList<>();
    }

    public static GeneratorNumere getInstance(){
        return instance;
    }

    public String genereazaNumar(String numar){
        if(numere.contains(numar)){
            throw new RuntimeException("Numarul exista deja!");
        }

        numere.add(numar);
        return numar;
    }

    public void afisareNumere(){
        System.out.println(numere);
    }
}
