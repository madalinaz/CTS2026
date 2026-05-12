package cts.s12.g1093.flyweight.implementare;

import java.util.List;

public class Monstru implements IFlyweight{
    private List<Integer> textura;
    private int dimensiune;
    private String culoare;

    public Monstru(List<Integer> textura, int dimensiune, String culoare) {
        this.textura = textura;
        this.dimensiune = dimensiune;
        this.culoare = culoare;
    }

    @Override
    public void pozitionare(int x, int y, Canvas canvas) {
        if(canvas.adauga(x,y)){
            System.out.println("Monstrul de dimensiune "+dimensiune+ " a fost pozitionat pe: "+x+" "+y);
            ataca();
        }
        else{
            System.out.println("Pozitia este deja folosita");
        }
    }

    @Override
    public void ataca() {
        System.out.println("Monstrul a atacat");
    }
}
