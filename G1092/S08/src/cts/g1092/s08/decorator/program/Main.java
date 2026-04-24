package cts.g1092.s08.decorator.program;

import cts.g1092.s08.decorator.implementare.Bon;
import cts.g1092.s08.decorator.implementare.IBon;
import cts.g1092.s08.decorator.implementare.decorare.DecoratorPrimavara;

public class Main {
    public static void main(String[] args) {
        IBon bon = new DecoratorPrimavara(new Bon(1), true);
        bon.adaugaProdus(10);
        bon.adaugaProdus(1.50f);
        bon.adaugaProdus(13.25f);
        bon.adaugaProdus(10.25f);
        bon.adaugaProdus(123.75f);
        bon.printare();
        System.out.println("Total bon: " + bon.getTotal());
        // de corectat inconsistenta dintre printare si getTotal pt genul feminin
        // propunere: camp suplimentare discount sau totalBon
        // de propus alte solutii pt identificare gen
        // de propus modif ca sa nu pot sa aplic decoratorPrimavara peste decoratorPrimavara



    }
}
