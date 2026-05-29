package cts.junit.c14.implementare;

import cts.junit.c14.exceptii.ExceptieIBAN;
import cts.junit.c14.exceptii.ExceptieSuma;

public class ContBancar {
    private double soldCurent;
    private String IBAN;
    private static double MAX_TRANZACTIE = 2000;

    public ContBancar(String IBAN) throws ExceptieIBAN {
        if(IBAN == null || IBAN.length() != 3) {
            throw new ExceptieIBAN();
        }
        this.IBAN = IBAN;
        this.soldCurent=10;
    }

    public void alimentareSold(double suma) throws ExceptieSuma {
        if(suma<=0 || suma>MAX_TRANZACTIE) {
            throw new ExceptieSuma();
        }
        this.soldCurent += suma;
    }

    public void transfer(double suma, ContBancar destinatie) throws ExceptieSuma {
        this.soldCurent -= suma;
        destinatie.alimentareSold(suma);
    }

    //functia inversa/opusa a functiei de alimentare (folosita pt inverse relationship)
    public void retragere(double suma) throws ExceptieSuma {
        if(suma < 0 || suma>MAX_TRANZACTIE || soldCurent < suma) {
            throw new ExceptieSuma();
        }
        this.soldCurent -= suma;
    }

    public void setSoldCurent(double soldCurent) {
        this.soldCurent = soldCurent;
    }

    public double getSoldCurent() {
        return soldCurent;
    }

    //metoda de referinta testata deja, folosita pt CrossCheck
    public void alimentare2(double suma) throws ExceptieSuma {
        if(suma<=0 || suma>MAX_TRANZACTIE) {
            throw new ExceptieSuma();
        }
        for(int i=1;i<=suma;i++) {
            this.soldCurent ++;
        }
    }
}
