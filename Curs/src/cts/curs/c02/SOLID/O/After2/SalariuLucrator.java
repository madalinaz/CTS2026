package cts.curs.c02.SOLID.O.After2;

public class SalariuLucrator
        implements RegulaSalarizare<Lucrator> {
    @Override public Class<Lucrator> tipAngajat() { return Lucrator.class; }

    @Override
    public double calcul(Lucrator l) {
        return l.getTarifOra() * l.getNrOreLucrate();
    }
}
