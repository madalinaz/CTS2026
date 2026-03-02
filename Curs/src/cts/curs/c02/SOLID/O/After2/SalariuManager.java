package cts.curs.c02.SOLID.O.After2;

public class SalariuManager implements RegulaSalarizare<Manager>{
    @Override
    public Class<Manager> tipAngajat() {
        return Manager.class;
    }

    @Override
    public double calcul(Manager m) {
        return m.getSalariuBaza() + m.getNrProiecte() * 1000;
    }
}
