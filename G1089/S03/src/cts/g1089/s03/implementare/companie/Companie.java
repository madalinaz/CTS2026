package cts.g1089.s03.implementare.companie;

import cts.g1089.s03.implementare.angajati.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String numeCompanie;
    private List<Angajat> angajati=new ArrayList<>();

    public Companie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }
//    Metoda de adaugare angajat nou
    public void addAngajat(Angajat angajat){
        if(angajat==null){
            throw new RuntimeException();
        }
        angajati.add(angajat);

    }



//  Metoda calcul fond total salariu
    public double calculFondTotalSalarii(){
        double salarii=0;
        for(Angajat a:angajati){
            salarii+=a.calculSalariu();
        }
        return salarii;
    }

    public void afisareDetaliiCompanie(){
        System.out.println("Denumire: " + numeCompanie + "Nr Angajati: " +
                angajati.size());
        for(Angajat a: angajati){
            System.out.println(a);
        }
    }
}
