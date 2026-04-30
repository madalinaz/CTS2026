package cts.chain.implementare;

public class HandlerNivelSalariu extends AbstractHandler{
    @Override
    public float procesareCerere(Persoana persoana, float credit) throws ExceptieCredit {
        credit = (float) (persoana.getSalariu() * (0.4 - 0.05 * persoana.getNrPersIntretinere()));
        if(getNextHandler() != null){
                return this.getNextHandler().procesareCerere(persoana, credit);
        }
        else{
                //este ultimul handler si returneaza ceea ce ceilalti au decis inainte
                return credit;
            }
        }

}
