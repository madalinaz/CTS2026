package cts.s12.g1093.flyweight.implementare;

import java.util.List;

public class Vrajitor implements IFlyweight{
    private String nume;
    private List<Integer> textura;

    public Vrajitor(String nume, List<Integer> textura) {
        this.nume = nume;
        this.textura = textura;
    }

    @Override
    public void pozitionare(int x, int y, Canvas canvas) {
        if(canvas.adauga(x,y)) {
            System.out.println("Vrajitorul " + nume + " a fost pozitionat pe: " + x + " " + y);
            ataca();
        }
        else {
            System.out.println("Pozitia este deja folosita");
        }
    }


    @Override
    public void ataca() {
        System.out.println("Vrajitorul "+nume+" a atacat");
    }
}
