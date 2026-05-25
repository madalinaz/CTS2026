package cts.s14.implementare;

import cts.s14.exceptii.ExceptieSold;

public class ContBancar {
    private String Iban;
    private double sold;

    public ContBancar(String iban, double sold) {
        Iban = iban;
        this.sold = sold;
    }

    public void alimentare(double valoare)
            throws ExceptieSold {
        if(valoare <= 0){
            throw new ExceptieSold();
        }
        sold += valoare;
    }

    public double getSold() {
        return sold;
    }

    //meth de "referinta" folosita pentru inverse
    //este inversa alimentarii
    public void retragere(double valoare){
        sold-=valoare;
    }

    //meth de "referinta" care face acelasi lucru precum
    //meth alimentare pe care o testam
    public void alimentare2(double valoare) throws ExceptieSold {
        if(valoare<=0)
            throw new ExceptieSold();
        for(int i=1;i<=valoare;i++){
            sold+=1;
        }
    }

    public void setSold(double sold) {
        this.sold = sold;
    }
}
