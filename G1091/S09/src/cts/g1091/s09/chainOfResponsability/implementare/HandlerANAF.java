package cts.g1091.s09.chainOfResponsability.implementare;

public class HandlerANAF extends AHandler {
    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if (p.getNume().length() % 2 == 0) {
            System.out.println(p.getNume() + " a picat la ANAF.");
            return false;
        }
        if (this.getNextHandler() != null) {
            return this.getNextHandler().procesareCerere(p, credit, nrLuni);
        }
        return true;
    }
}
