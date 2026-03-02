package cts.s2.gr1091.main;

import cts.s2.gr1091.implementare.angajati.Manager;
import cts.s2.gr1091.implementare.companie.Companie;
import cts.s2.gr1091.implementare.taxare.CalculatorTaxeSalariu;

public class Main {
    // Regula: Metoda main nu trebuie sa contina logica de business sau operatii
    // complexe.
    // Rolul ei este doar de a orchestra si de a servi ca punct de intrare (Entry
    // Point).
    public static void main(String[] args) {
        Companie companie = new Companie("Companie1");

        // Polimorfism: Metoda adAngajat primeste un tip abstract (Angajat),
        // dar noi ii trimitem obiecte de tip Manager (clasa concreta).
        companie.adAngajat(new Manager("Manager1", 1000, 15));
        companie.adAngajat(new Manager("Manager2", 1500, 20));

        System.out.println("Total salariu net companie: " + companie.totalSalariuNet());
    }
}
