package decorator.program;

import decorator.implementare.ABon;
import decorator.implementare.Bon;
import decorator.implementare.DecoratorPrimavara;

public class Main {
    public static void main(String[] args) {
        ABon bon1 = new Bon();
        bon1.addProdus(12);
        bon1.addProdus(24);
        System.out.println(bon1.calculeazaTotal());

        ABon bonDecorat = new DecoratorPrimavara(bon1, true);

        System.out.println(bonDecorat.calculeazaTotal());

    }
}
