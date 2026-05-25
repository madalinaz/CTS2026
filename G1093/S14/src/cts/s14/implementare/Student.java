package cts.s14.implementare;

import cts.s14.exceptii.ExceptieMedie;
import cts.s14.exceptii.ExceptieNume;

public class Student {
    private String nume;
    private double medieAdmitere;

    //numele are minim 3 caractere
    //media admitere (5,10]
    public Student(String nume, double medieAdmitere) throws ExceptieNume, ExceptieMedie {
        if(nume== null || nume.length()<3){
            throw new ExceptieNume();
        }
        if(medieAdmitere<=5 || medieAdmitere>10){
            throw new ExceptieMedie();
        }
        this.nume = nume;
        this.medieAdmitere = medieAdmitere;

    }

    public void setMedieAdmitere(double medieAdmitere) throws ExceptieMedie {
        if(medieAdmitere<=5 || medieAdmitere>10){
            throw new ExceptieMedie();
        }
        this.medieAdmitere = medieAdmitere;
    }

    public String getNume() {
        return nume;
    }

    public double getMedieAdmitere() {
        return medieAdmitere;
    }
}
