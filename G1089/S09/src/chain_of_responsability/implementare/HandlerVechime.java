package chain_of_responsability.implementare;

public class HandlerVechime extends AHandler implements IHandler{
    private static int nrMinimLuni=12;

    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if(p.getNrLuniAngajat()<nrMinimLuni){
            System.out.println(p.getNume()+" nu are luni suficiente");
            return false;
        }
        if(this.getNextHandler()!=null){
            return this.getNextHandler().procesareCerere(p,credit,nrLuni);
        }
        return true;
    }
}
