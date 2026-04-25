package cts.g1091.s09.chainOfResponsability.implementare;

public class HandlerVechime extends AHandler{
    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if(p.getNrLuni() < 12){
            System.out.println(p.getNume() + " a picat la vechime.");
            return false;
        }
        if(this.getNextHandler() != null){
            return this.getNextHandler().procesareCerere(p,credit,nrLuni);
        }
        return true;
    }
}
