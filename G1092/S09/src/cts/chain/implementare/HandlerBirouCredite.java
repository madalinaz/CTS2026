package cts.chain.implementare;

public class HandlerBirouCredite extends AbstractHandler{

    @Override
    public float procesareCerere(Persoana persoana, float credit) throws ExceptieCredit {
        if(persoana.getNume().length() %2 != 0){
            throw new ExceptieCredit("Persoana este in black list");
        }
        else{
            if(getNextHandler() != null){
                return this.getNextHandler().procesareCerere(persoana, credit);
            }
            else{
                //este ultimul handler si returneaza ceea ce ceilalti au decis inainte
                return credit;
            }
        }
    }
}
