package chain_of_responsability.implementare;

public class HandlerNivelSalariu extends AHandler implements IHandler{

    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if(p.getSalariu()*0.4<credit/nrLuni){
            System.out.println(p.getNume()+" nu are salariu suficient");
            return false;
        }
        if(this.getNextHandler()!=null){
            return this.getNextHandler().procesareCerere(p,credit,nrLuni);
        }
        return true;
    }
}
