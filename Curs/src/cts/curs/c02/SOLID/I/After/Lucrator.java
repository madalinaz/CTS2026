package cts.curs.c02.SOLID.I.After;

public class Lucrator implements Angajat {
    private String nume;

    public Lucrator(String nume) {
        this.nume = nume;
    }

    @Override
    public void lucreaza() {
        System.out.println("Angajatul " + nume + " lucreaza!");
    }

    @Override
    public void concediu() {
        System.out.println("Angajatul " + nume + " este in concediu!");
    }

    public String getNume() {
        return nume;
    }
}
