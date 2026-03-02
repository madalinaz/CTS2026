package cts.curs.c02.SOLID.O.After2;

public interface RegulaSalarizare<T extends Angajat> {
    Class<T> tipAngajat();
    double calcul(T angajat);
}
