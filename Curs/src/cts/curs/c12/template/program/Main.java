package cts.curs.c12.template.program;

import cts.curs.c12.template.implementare.Paste;
import cts.curs.c12.template.implementare.Pizza;
import cts.curs.c12.template.implementare.Preparat;

public class Main {
    public static void main(String[] args) {
        Preparat pizza = new Pizza();
        Preparat paste = new Paste();

        System.out.println("=== Preparare Pizza ===");
        pizza.preparaPreparat();

        System.out.println("\n=== Preparare Paste ===");
        paste.preparaPreparat();
    }
}
