package cts.g1094.proxy.implementare.layer_intermediar;

import cts.g1094.proxy.implementare.ISpital;

import java.util.HashMap;
import java.util.Map;

public class ProxySpital implements ISpital {
    private ISpital spital; //referinta obiectului controlat

    private Map<String, String> vizite;

    public ProxySpital(ISpital spital){
        this.spital = spital;
        this.vizite = new HashMap<>();
    }
    @Override
    public void accesSpital(String vizitator, String pacient) {
        if(this.vizite.containsKey((pacient))){
            System.out.println("Nu se poate vizita!");
            System.out.println("A mai fost vizitat de " + this.vizite.get(pacient));
        }
        else{
            this.vizite.put(pacient, vizitator);
            this.spital.accesSpital(vizitator, pacient);
        }
    }
}
