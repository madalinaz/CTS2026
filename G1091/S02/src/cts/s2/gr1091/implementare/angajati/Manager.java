package cts.s2.gr1091.implementare.angajati;

import cts.s2.gr1091.implementare.taxare.CalculatorTaxeSalariu;

public class Manager extends Angajat {
    private int nrProiecte;
    // 1. static: Campul apartine clasei, nu obiectelor individuale (este unul
    // singur in memorie).
    // 2. final: Valoarea nu mai poate fi modificata dupa initializare (este
    // imutabila).
    static final int NR_PROIECTE = 100;
    static final int TARIF_PER_PROIECT = 500;

    public Manager(String nume, double salariuBaza, int nrProiecte) throws IllegalArgumentException {
        super(nume, salariuBaza);
        if (nrProiecte > NR_PROIECTE) {
            throw new IllegalArgumentException("Numar prea mare de proiecte!");
        }
        this.nrProiecte = nrProiecte;
    }

    @Override
    public double calculSalariu() {
        double salariuBrut = this.salariuBaza + this.nrProiecte * TARIF_PER_PROIECT;
        double salariuNet = CalculatorTaxeSalariu.calculeazaSalariuNet(salariuBrut);
        return salariuNet;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

}
