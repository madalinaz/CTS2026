package cts.s3.gr1091.main;

import cts.s3.gr1091.implementare.angajati.Lucrator;
import cts.s3.gr1091.implementare.angajati.Manager;
import cts.s3.gr1091.implementare.companie.Companie;

public class Main {
    // Regula: Metoda main nu trebuie sa contina operatii
    // complexe.
    // Rolul ei este doar de a orchestra si de a servi ca punct de intrare
    public static void main(String[] args) {
        Companie companie = new Companie("Companie1");

        // Polimorfism: Metoda adAngajat primeste un tip abstract (Angajat),
        // dar noi ii trimitem obiecte de tip Manager (clasa concreta).
        companie.adAngajat(new Manager("Manager1", 1000, "2222", 15));
        companie.adAngajat(new Manager("Manager2", 1500, "2222", 30));
        companie.adAngajat(new Lucrator("Gigel", 2000, "3333", 0.2));
        // done dpdv SRP
        System.out.println("Total salariu net companie: " + companie.totalSalariuNet());

        // Angajat -> CIM -> COR
        // COR -> se aplica taxe preferentiale
        // implementarea trebuie sa respecte SRP si OCP tinand cont de
        // adaugam un nou tip de angajat
        // adaugam un nou tip de taxare preferentiala
        // SRP(calcul salariu brut / aplicare taxe pe brut)
        // modificam metodologia taxe pe brut
    }
}
