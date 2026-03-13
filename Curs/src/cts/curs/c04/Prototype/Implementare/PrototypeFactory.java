package cts.curs.c04.Prototype.Implementare;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static Map<String, AbstractContract>
            prototipuriContracte = new HashMap<>();

    static {
        System.out.println("Initializare contracte prin citirea din BD");
        ContractCorporate contractCorporate = new ContractCorporate();
        prototipuriContracte.put("corporate", contractCorporate);

        ContractParty contractParty = new ContractParty();
        prototipuriContracte.put("party", contractParty);
    }

    public static AbstractContract getPrototipContract(String tip) {
        AbstractContract contract = null;
        AbstractContract prototipContract = prototipuriContracte.get(tip);
        if(prototipContract!=null)
            contract = prototipContract.clone();
        return contract;
    }
}
