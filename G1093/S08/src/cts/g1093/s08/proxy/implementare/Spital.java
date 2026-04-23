package cts.g1093.s08.proxy.implementare;

public class Spital implements ISpital{
    private String denumire;

    public Spital(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void accesSpital(String vizitator, String pacient) {
        System.out.println(vizitator+" a vizitat pe "+pacient);
    }
}
