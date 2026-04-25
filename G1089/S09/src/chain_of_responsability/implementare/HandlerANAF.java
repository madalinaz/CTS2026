package chain_of_responsability.implementare;

import java.util.ArrayList;
import java.util.List;

public class HandlerANAF extends AHandler implements IHandler {

    private static List<String> blackList=new ArrayList<>();

    static{
        blackList.add("Costel");
        blackList.add("Dorel");
    }

    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if(blackList.contains(p.getNume())){
            System.out.println(p.getNume()+" este in blacklist ANAF");
            return false;
        }
        if(this.getNextHandler()!=null){
            return this.getNextHandler().procesareCerere(p,credit,nrLuni);
        }
        return true;
    }
}
