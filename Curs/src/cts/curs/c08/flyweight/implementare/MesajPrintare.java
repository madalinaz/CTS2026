package cts.curs.c08.flyweight.implementare;

public class MesajPrintare implements IPrintare {
    private String tipPrintare;
    private String mesaj;

    public MesajPrintare(String tipPrintare) {
        this.tipPrintare = tipPrintare;
        //se preia dintr-o sursa externa mesajul in functie de tipPrintare
        this.mesaj = "Mesaj "+tipPrintare;
    }



    @Override
    public void printareBon(Bon bon) {
        //aici zona Intrinseca (this) se intersecteaza cu zona extrinseca (bon)
        //practic ne intereseaza cum se printeaza un Bon doar atunci cand se face printarea
        //in "contabilitate", acest aspect NU este important

        System.out.println("S-a printat bonul cu totalul "+ bon.getCostTotal() +" folosind mesajul "+mesaj);
    }
}
