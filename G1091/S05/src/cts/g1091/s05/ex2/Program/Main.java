package cts.g1091.s05.ex2.Program;

import cts.g1091.s05.ex2.Implementare.AbstractJucator;
import cts.g1091.s05.ex2.Implementare.JucatorBascket;
import cts.g1091.s05.ex2.Implementare.JucatorPrototypeFactory;

public class Main {
    public static void main(String[] args)  {
        AbstractJucator j1 = JucatorPrototypeFactory.getPrototipJucator("Fotbal");
        AbstractJucator j2 = JucatorPrototypeFactory.getPrototipJucator("Fotbal");
        AbstractJucator j3 = JucatorPrototypeFactory.getPrototipJucator("Fotbal");
        AbstractJucator j4 = JucatorPrototypeFactory.getPrototipJucator("Fotbal");
        AbstractJucator j5 = JucatorPrototypeFactory.getPrototipJucator("Fotbal");
        AbstractJucator j6 = JucatorPrototypeFactory.getPrototipJucator("Fotbal");
        AbstractJucator j7 = JucatorPrototypeFactory.getPrototipJucator("Fotbal");

        //de adaugat
        //optiune de modificare pe lista medicamente
        //de verificat daca chiar e deep copy lista exercitii
        //o metoda de afisare statistici de tipul:
        //Sport Fotbal: ? constructor / ? clone
        //Sport Bascket: ? constructor / ? clone

        System.out.println(j1);
        System.out.println(j2);
        j2.schimbaNrRepetitii(0,50);
        System.out.println(j1);
        System.out.println(j2);

    }
}
