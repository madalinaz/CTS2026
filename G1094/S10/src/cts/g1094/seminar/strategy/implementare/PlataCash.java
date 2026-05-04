package cts.g1094.seminar.strategy.implementare;

public class PlataCash implements ITehnicaPlata{
    @Override
    public void plata(float suma) {
        System.out.println("S-a facut plata cash pentru o suma de " + suma + " LEI");
    }
}
