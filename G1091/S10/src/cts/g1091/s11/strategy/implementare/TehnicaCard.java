package cts.g1091.s11.strategy.implementare;

public class TehnicaCard implements ITehnicaPlata{
    @Override
    public void plata(float suma) {
        System.out.println("S-a facut plata cu card : " + suma);
    }
}
