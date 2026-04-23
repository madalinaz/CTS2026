package cts.g1094.proxy.implementare;

public class Spital implements ISpital{
    private String denumire;
    public Spital(String denumire){
        this.denumire = denumire;
    }
    @Override
    public void accesSpital(String vizitator, String pacient) {

        System.out.println("Vizitatorul " + vizitator + " viziteaza pacientul " + pacient);
    }
}
