package cts.g1091.s05.ex2.Implementare;

import java.util.ArrayList;

public class JucatorFotbal extends AbstractJucator{

     JucatorFotbal() {
        System.out.println("Proces consumator, preluare set exercitii pentru FOTBAL");
        this.antrenament = new ArrayList<>();
        this.antrenament.add(new Exercitiu("fandari",10));
        this.antrenament.add(new Exercitiu("alergari",20));
    }
}
