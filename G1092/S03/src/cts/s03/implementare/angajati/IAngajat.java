package cts.s03.implementare.angajati;

public interface IAngajat {
    double calculeazaSalariu();

    default String getCOR() {
        return "X";
    }
    //o meth default = o meth abstarcta dar care nu ma oblica sa o implementez in clase

}
