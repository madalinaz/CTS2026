package cts.g1090.s03.implementare.angajati;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    private List<IAngajat> angajati;
    //ce se intampla daca declar final o lista?
    private String denumire;

    public Companie(String denumire) {
        this.denumire = denumire;
        this.angajati = new ArrayList<>();
    }

    public void adaugaAngajat(IAngajat angajat) {
        if(angajat == null) {
            throw new NullPointerException();
        }
        this.angajati.add(angajat);
    }

    public double getSalariu() {
        double totalSalarii=0;
        for(IAngajat angajat : angajati) {
            totalSalarii+=angajat.calculSalariu();
        }
        return totalSalarii;
    }


}
