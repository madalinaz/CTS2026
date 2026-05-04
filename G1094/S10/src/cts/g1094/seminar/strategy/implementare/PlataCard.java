package cts.g1094.seminar.strategy.implementare;

public class PlataCard implements ITehnicaPlata{
    @Override
    public void plata(float suma) {
        System.out.println("S-a facut plata cu cardul pentru o suma de " + suma + " LEI");
    }
}
