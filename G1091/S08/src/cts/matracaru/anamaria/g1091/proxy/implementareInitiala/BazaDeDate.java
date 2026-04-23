package cts.matracaru.anamaria.g1091.proxy.implementareInitiala;

import java.util.HashMap;
import java.util.Map;

public class BazaDeDate implements IBazaDeDate{

    Map<String,Cuvant> BDcolectieCuvinte=new HashMap<String, Cuvant>();


    @Override
    public void addCuvant(String cuvant, int nrHam, int nrSpam) {
        if (!BDcolectieCuvinte.containsKey(cuvant)){
            Cuvant c=new Cuvant(cuvant, nrHam, nrSpam);
            BDcolectieCuvinte.put(cuvant,c);
        }else {
            Cuvant c=BDcolectieCuvinte.get(cuvant);
            c.setNrHam(c.getNrHam()+nrHam);
            c.setNrSpam(c.getNrSpam()+nrSpam);
        }
    }

    @Override
    public void afisareCuvinte() {
        BDcolectieCuvinte.values().forEach(System.out::println);
    }
}
