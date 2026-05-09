package cts.g1091.s11.strategy.implementare;

public class TehnicaCash implements ITehnicaPlata{

    @Override
    public void plata(float suma) {
        System.out.println("S-a facut plata cash : " + suma);
    }
}
