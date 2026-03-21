package cts.g1091.s05.ex2.Implementare;

import java.util.ArrayList;

public class JucatorBascket extends AbstractJucator{

     JucatorBascket() {
        System.out.println("Proces consumator, preluare set exercitii pentru BASCKET");
        this.antrenament = new ArrayList<>();
        this.antrenament.add(new Exercitiu("flotari",10));
        this.antrenament.add(new Exercitiu("exercitiu gambe",20));
    }
}
