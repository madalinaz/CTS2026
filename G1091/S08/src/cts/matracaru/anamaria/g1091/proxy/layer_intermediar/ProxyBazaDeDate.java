package cts.matracaru.anamaria.g1091.proxy.layer_intermediar;

import cts.matracaru.anamaria.g1091.proxy.implementareInitiala.IBazaDeDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxyBazaDeDate implements IBazaDeDate {

    private IBazaDeDate bazaDeDate;
    private Map<String, List<Integer>> colectieCuvinte;
    private int contor;

    public ProxyBazaDeDate(IBazaDeDate bazaDeDate) {
        this.bazaDeDate = bazaDeDate;
        this.colectieCuvinte=new HashMap<String,List<Integer>>();
        this.contor=0;
    }

    @Override
    public void addCuvant(String cuvant, int nrHam, int nrSpam) {
        //la fiecare 10 cuvinte, facem update in baza de date reala
        contor++;
        if (colectieCuvinte.containsKey(cuvant)){
            List<Integer> list=colectieCuvinte.get(cuvant);
            list.set(0, list.get(0)+nrHam);
            list.set(1, list.get(1)+nrSpam);
        }else {
            List<Integer> list=new ArrayList<>();
            list.add(nrHam);
            list.add(nrSpam);
            colectieCuvinte.put(cuvant,list);
        }
        if (contor==10){
            for (String c:colectieCuvinte.keySet()){
                List<Integer> list=colectieCuvinte.get(c);
                //interactionam cu obiectul real (OBLIGATORIU)
                bazaDeDate.addCuvant(c,list.get(0), list.get(1));
            }
            contor=0;
            colectieCuvinte.clear();
        }
    }

    @Override
    public void afisareCuvinte() {
        bazaDeDate.afisareCuvinte();
    }
}
