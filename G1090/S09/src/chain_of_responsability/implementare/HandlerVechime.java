package chain_of_responsability.implementare;

public class HandlerVechime extends AHandler{
    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if(p.getNrLuniAngajat()<12){
            System.out.println(p.getNume() + " respins din cauza vechimii");
            return false;
        }
        if(this.getNextHandler()!=null)
        {
            return this.getNextHandler().procesareCerere(p, credit, nrLuni);
        }
        return true;
    }


}

