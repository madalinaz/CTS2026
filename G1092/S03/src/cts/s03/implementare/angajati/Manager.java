package cts.s03.implementare.angajati;

//ca sa nu trebuiasca sa implementam override = facem clasa abstracta
//diferenta dintre Integer si int -> Integer trateaza si null, totusi  mai performant este int

import cts.s03.implementare.calculSalariuBrut.FactoryCalculator;
import cts.s03.implementare.taxare.FactoryTaxare;

public class Manager implements IAngajat{
    private String nume;
    private int numarProiecte;
    private final String cnp;
    private static double tarifPerProiect=100;
    private String COR;


    public Manager(String nume, int numarProiecte, String cnp, String COR) {
        this.nume = nume;
        this.numarProiecte = numarProiecte;
        this.cnp = cnp;
        this.COR=COR;
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
//        double salariulBrut=this.numarProiecte*tarifPerProiect;

        double salariulBrut= FactoryCalculator.getCalculatorBrut(this).calculSalariuBrut(this);

        //p2 return salariul net - ne folosim de taxare
        return FactoryTaxare.getTaxareDupaCOR(this.COR).calculSalariuNet(salariulBrut);
    }

    @Override
    public String getCOR() {
        return COR;
    }
}
