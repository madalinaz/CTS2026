package cts.chain.implementare;

public class HandlerVechime extends AbstractHandler{
    @Override
    public float procesareCerere(Persoana persoana, float credit) throws ExceptieCredit {
        if(persoana.getVechimeInLuni() < 12){
            throw new ExceptieCredit("Persoana nu are vechime suficienta!");
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
