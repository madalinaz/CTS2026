package cts.composite.implementare;

import java.awt.*;

public class Angajat implements INod {
    private String nume;
    private float salariu;

    public Angajat(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public void addNode(INod node) {
        throw new UnsupportedOperationException("Nu se poate");
    }

    @Override
    public INod getNode(int index) {
        throw new UnsupportedOperationException("Nu se poate");
    }

    @Override
    public void removeNode(INod node) {
        throw new UnsupportedOperationException("Nu se poate");
    }

    @Override
    public int getTotalAngajati() {
        return 1;
    }

    @Override
    public float getSalariu() {
        return this.salariu;
    }
}
