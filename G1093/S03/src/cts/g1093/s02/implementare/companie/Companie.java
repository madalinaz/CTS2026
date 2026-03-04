package cts.g1093.s02.implementare.companie;

import cts.g1093.s02.implementare.angajati.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Companie {
    private List<Angajat> listaAngajati;
    String numeCompanie;

    public Companie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
        this.listaAngajati=new ArrayList<>();
    }

    public void adaugaAngajat(Angajat a) throws Exception {
        if(a==null){
            throw new Exception();
        }
        listaAngajati.add(a);
    }

    public void afisareAngajati(){
        System.out.println("Compania are "+listaAngajati.size()+" angajati");
        for(int i=0;i< listaAngajati.size();i++){
            System.out.println(listaAngajati.get(i));
        }
    }

    public double totalSalariiNete(){
        double totalSalarii=0;
        for(Angajat a:listaAngajati){
            totalSalarii+=a.calculSalariu();
        }
        return totalSalarii;
    }
}
