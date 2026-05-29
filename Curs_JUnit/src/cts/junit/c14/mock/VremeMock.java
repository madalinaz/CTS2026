package cts.junit.c14.mock;

public class VremeMock implements IVreme {
    public boolean estePloaie;
    public int temperatura;

    @Override
    public boolean estePloaie() {
        return this.estePloaie;
    }

    @Override
    public int getTemperatura(String oras) {
        return this.temperatura;
    }
}
