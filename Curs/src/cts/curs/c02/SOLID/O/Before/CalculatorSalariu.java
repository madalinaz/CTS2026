package cts.curs.c02.SOLID.O.Before;

public class CalculatorSalariu {

    public double calculSalariuLucrator(Lucrator lucrator) {
        return lucrator.getTarifOra() * lucrator.getNrOreLucrate();
    }

    public double calculSalariuManager(Manager manager) {
        return manager.getSalariuBaza() + manager.getNrProiecte() * 1000;
    }
}
