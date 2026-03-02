package cts.s02.implementare.angajati;

//ca sa nu trebuiasca sa implementam override = facem clasa abstracta
//diferenta dintre Integer si int -> Integer trateaza si null, totusi  mai performant este int

import cts.s02.implementare.exceptii.ExceptieNumeClasa;
import cts.s02.implementare.taxare.Taxare;

public class Manager implements IAngajat{
    private String nume;
    private int numarProiecte;
    private final String cnp;
    private static double tarifPerProiect=100;

    public Manager(String nume, int numarProiecte, String cnp) {
        this.nume = nume;
        this.numarProiecte = numarProiecte;
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNumarProiecte() {
        return numarProiecte;
    }

    public void setNumarProiecte(int numarProiecte) {
        this.numarProiecte = numarProiecte;
    }

    public String getCnp() {
        return cnp;
    }

    public static double getTarifPerProiect() {
        return tarifPerProiect;
    }

    public static void setTarifPerProiect(double tarifPerProiect) {
        Manager.tarifPerProiect = tarifPerProiect;
    }

    @Override
    public double calculeazaSalariu() {
        //p1- calcul salaiu brut
        double salariulBrut=this.numarProiecte*tarifPerProiect;

        //p2 return salariul net - ne folosim de taxare
        try {
            double salariuNet=salariulBrut
                    -Taxare.getTaxa("CASS")*salariulBrut
                    -Taxare.getTaxa("CASS")+salariulBrut;
            salariuNet=(1-Taxare.getTaxa("IMPOZIT"))*salariuNet;
            return salariuNet;
        } catch (ExceptieNumeClasa e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }
}
