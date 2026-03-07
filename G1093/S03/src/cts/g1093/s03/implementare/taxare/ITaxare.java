package cts.g1093.s03.implementare.taxare;

public interface ITaxare {
    public void adaugaTaxa(String nume, double procent);
    public double getNetDinBrut(double salariuBrut);
}
