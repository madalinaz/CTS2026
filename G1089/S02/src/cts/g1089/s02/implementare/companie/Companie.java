package cts.g1089.s02.implementare.companie;

import cts.g1089.s02.implementare.angajati.Angajat;
import cts.g1089.s02.implementare.angajati.Lucrator;

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
}
