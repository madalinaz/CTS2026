package cts.g1090.s02.implementare.angajati;

import cts.g1090.s02.implementare.taxare.Taxare;

public class Manager implements IAngajat {

    private String nume;
    private int nrProiecte;
    private double tarifProiectBrut;
    private double salariuBazaBrut;

    public Manager(String nume, int nrProiecte, double salariuBazaBrut, double tarifProiectBrut) {
        this.nume=nume;
        this.nrProiecte = nrProiecte;
        this.salariuBazaBrut = salariuBazaBrut;
        this.tarifProiectBrut = tarifProiectBrut;
    }


    @Override
    public String getNume() {
        return "";
    }

    @Override
    public double calculSalariu() {
        //pas 1:calcul salariu brut
        double salariuBrut = this.salariuBazaBrut+ this.nrProiecte*this.tarifProiectBrut;
        //pas 2:calcul salariu net (folosind taxarile)
        double salariuNet = salariuBrut - salariuBazaBrut* Taxare.getTaxa("CASS")- salariuBazaBrut* Taxare.getTaxa("CAS");
        salariuNet -=Taxare.getTaxa("Impozit")*salariuNet;
        return salariuNet;
    }
}
