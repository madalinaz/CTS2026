package cts.g1089.s03.implementare.angajati;

public interface Angajat {
    public double calculSalariu();
    default String getCOR(){
        return null;
    }
}
