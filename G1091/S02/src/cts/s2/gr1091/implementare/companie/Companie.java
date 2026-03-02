package cts.s2.gr1091.implementare.companie;

import cts.s2.gr1091.implementare.angajati.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    // DIP: Folosim interfata List in loc de ArrayList pentru a decupla clasa de o
    // implementare specifica.
    private List<Angajat> angajati;
    private String nume;

    public Companie(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
    }

    public void adAngajat(Angajat angajat) {
        if (angajat == null) {
            throw new NullPointerException("Angajat cant be null");
        }
        this.angajati.add(angajat);
    }

    public double totalSalariuNet() {
        double total = 0;
        for (Angajat angajat : this.angajati) {
            total += angajat.calculSalariu();
        }

        return total;
    }

}
