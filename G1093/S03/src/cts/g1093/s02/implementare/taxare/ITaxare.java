package cts.g1093.s02.implementare.taxare;

public interface ITaxare {
    public void adaugaTaxa(String nume, double procent);
    public double getNetDinBrut(double salariuBrut);
}
