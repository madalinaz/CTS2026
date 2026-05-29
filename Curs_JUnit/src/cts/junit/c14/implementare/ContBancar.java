package cts.junit.c14.implementare;

import cts.junit.c14.exceptii.ExceptieIBAN;
import cts.junit.c14.exceptii.ExceptieSuma;

public class ContBancar {
    private double soldCurent;
    private String IBAN;
    private static double MAX_TRANZACTIE = 2000;

    public ContBancar(String IBAN) throws ExceptieIBAN {
        if(IBAN == null || IBAN.length() != 10) {
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

    public void retragere(double suma){
        this.soldCurent -= suma;
    }

}
