package chain_of_responsability.implementare;

import java.util.ArrayList;
import java.util.List;

public class HandlerANAF extends AHandler{

    private static List<String> blackList;

    static{
        blackList = new ArrayList<>();
        blackList.add("Costel");
        blackList.add("Alex");
        blackList.add("Maria");
    }

    @Override
    public boolean procesareCerere(Persoana p, float credit, int nrLuni) {
        if(blackList.contains(p.getNume())){
            System.out.println(p.getNume() + " respins din cauza blacklist");
            return false;
        }
        if(this.getNextHandler()!=null)
        {
            return this.getNextHandler().procesareCerere(p, credit, nrLuni);
        }
        return true;
    }
}
