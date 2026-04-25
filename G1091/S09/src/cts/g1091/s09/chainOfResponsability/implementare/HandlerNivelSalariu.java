package cts.g1091.s09.chainOfResponsability.implementare;

public class HandlerNivelSalariu extends AHandler{
    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if(credit / nrLuni > 0.4 * p.getSalariu()){
            System.out.println(p.getNume() + " a picat la nivel salariu.");
            return false;
        }
        if(this.getNextHandler() != null){
            return this.getNextHandler().procesareCerere(p,credit,nrLuni);
        }
        return true;
    }
}
