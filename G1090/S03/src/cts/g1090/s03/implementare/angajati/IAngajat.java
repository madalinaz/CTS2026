package cts.g1090.s03.implementare.angajati;

public interface IAngajat {
    //default e public

    String getNume();

    double calculSalariu();

    default String getCOR(){
        return null;
    }
}
//in context de interface setter-ul este public