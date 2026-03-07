package cts.s3.gr1091.implementare.angajati;

import cts.s3.gr1091.implementare.taxare.CalculatorTaxeSalariu;
import cts.s3.gr1091.implementare.taxare.FactoryTaxare;

public class Manager extends Angajat {
    private int nrProiecte;
    // 1. static: Campul apartine clasei, nu obiectelor individuale (este unul
    // singur in memorie).
    // 2. final: Valoarea nu mai poate fi modificata dupa initializare (este
    // imutabila).
    static final int NR_PROIECTE = 100;
    static final int TARIF_PER_PROIECT = 500;

    public Manager(String nume, double salariuBaza, String COR, int nrProiecte) throws IllegalArgumentException {
        super(nume, salariuBaza, COR);
        if (nrProiecte > NR_PROIECTE) {
            throw new IllegalArgumentException("Numar prea mare de proiecte!");
        }
        this.nrProiecte = nrProiecte;
    }

    @Override
    public double calculSalariu() {
        // 1. calcul salariu brut pentru regula HR
        double salariuBrut = this.getSalariuBaza() + this.nrProiecte * TARIF_PER_PROIECT;
        // 2. calcul salariu net tinand cont de taxe (financiar)
        double salariuNet = FactoryTaxare.getTaxareDupaCor(this.getCOR()).getSalariuNetDinBrut(salariuBrut);
        return salariuNet;
    }

}
