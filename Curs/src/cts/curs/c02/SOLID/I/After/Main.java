package cts.curs.c02.SOLID.I.After;

public class Main {
    public static void main(String[] args) {
        // Angajati simpli
        Angajat a1 = new Lucrator("Ion");
        Angajat a2 = new Lucrator("Maria");

        // Manager
        Manager manager = new Manager("Andrei");
        manager.adaugaSubordonat(a1);
        manager.adaugaSubordonat(a2);

        // Lista de angajati
        java.util.List<Angajat> angajati = new java.util.ArrayList<>();
        angajati.add(a1);
        angajati.add(a2);
        angajati.add(manager);

        System.out.println("=== Toata lumea lucreaza ===");
        for (Angajat a : angajati) {
            a.lucreaza();
        }

        System.out.println("\n=== Concediu pentru un lucrator ===");
        a2.concediu();
    }
}
