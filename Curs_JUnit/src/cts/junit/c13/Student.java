package cts.junit.c13;

public class Student {
    private String nume;
    private int anStudiu;
    private int nrPctCredit;

    public Student(String nume) {
        this.nume = nume;
        this.anStudiu=1;
        this.nrPctCredit=0;
    }

    public void daExamen(int nota, int nrPctCredit) throws ExceptieNota {
        if(nota<1 ||nota>10){
            throw new ExceptieNota();
        }
        if(nota>=5){
            this.nrPctCredit+=nrPctCredit;
        }

    }
}
