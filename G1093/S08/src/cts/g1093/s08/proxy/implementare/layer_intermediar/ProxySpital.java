package cts.g1093.s08.proxy.implementare.layer_intermediar;

import cts.g1093.s08.proxy.implementare.ISpital;

import java.util.HashMap;
import java.util.Map;

public class ProxySpital implements ISpital {
    private ISpital spital; //referinta obiectului controlat
    private Map<String, String> vizite; //key- pacient, value- vizitator

    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.vizite=new HashMap<>();
    }

    @Override
    public void accesSpital(String vizitator, String pacient) {
        if(vizite.containsKey(pacient)){
            System.out.println("Nu se poate.");
            System.out.println("A mai fost vizitat de "+vizite.get(pacient));
        }
        else{
            vizite.put(pacient, vizitator);
            this.spital.accesSpital(vizitator, pacient); //obligatoriu!!!
        }
    }

    public void resetZi(){
        vizite.clear();
    }
}
