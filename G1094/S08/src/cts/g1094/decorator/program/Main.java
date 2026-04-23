package cts.g1094.decorator.program;

import cts.g1094.decorator.implementare.Comanda;
import cts.g1094.decorator.implementare.IComanda;
import cts.g1094.decorator.implementare.decorare.DecoratorPrimavara;

public class Main {
    public static void main(String[] args) {
        IComanda comanda = new DecoratorPrimavara(new Comanda(), true);
        comanda.adaugaProdus(15f);
        comanda.adaugaProdus(25f);
        comanda.adaugaProdus(10f);

        System.out.println(comanda.getTotalComanda());
        comanda.inchideComanda();
        comanda.printareBon();
    //de propus modificari pe codul existent astfel incat sa se aplice reducerea de 10% si atunci cand se printeaza bonul
        //nu doar cand se calculeaza totalul in metoda getTotalComanda()
    }
}