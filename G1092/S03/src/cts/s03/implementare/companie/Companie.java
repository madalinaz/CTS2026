package cts.s03.implementare.companie;

import cts.s03.implementare.angajati.IAngajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String numeCompanie;

    private List<IAngajat> angajati=new ArrayList<>();

    public Companie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public void adaugaAngajat(IAngajat angajat){
        if(angajat==null){
            throw new NullPointerException();
        }
        angajati.add(angajat);

    }

    public double calculFondSalaiu(){
        double fondSalaiu=0;
        for(IAngajat angajat:angajati){
            fondSalaiu+=angajat.calculeazaSalariu();
        }
        return fondSalaiu;
    }
}
