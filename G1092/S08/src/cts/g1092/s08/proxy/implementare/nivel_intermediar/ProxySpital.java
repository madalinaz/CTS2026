package cts.g1092.s08.proxy.implementare.nivel_intermediar;

import cts.g1092.s08.proxy.implementare.ISpital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxySpital implements ISpital {
    // proxy DETINE(HAS A!!) un obiect
    // depindem de abstract, nu concret
    // vom avea propria mapa
    private ISpital spital;
    private Map<String, List<String>> vizite = new HashMap<>();

    public ProxySpital(ISpital spital) {
        this.spital = spital;
    }

    @Override
    public void vizitare(String vizitator, String pacient) {
        // permitem vizitarea unui pacient de max 2 vizitatori
        // putem primi acces direct la vizite, nu ca in cazul asta
        if(!vizite.containsKey(pacient)){
            vizite.put(pacient, new ArrayList<>());
        }
        if(vizite.get(pacient).size() < 2) {
            // adaugam vizitatori doar daca nu a fost vizitat sau a fost vizitat doar o singura data
            vizite.get(pacient).add(vizitator);
            // OBLIGATORIU trebuie sa ne legam de obiectul Spital, altfel nu e proxy!!!(vezi diagrama)
            spital.vizitare(vizitator, pacient);
        }
        else{
            System.out.println(pacient + " a fost deja vizitat suficient");
        }
    }

    @Override
    public void afisareIstoricVizite() {
        // apelam prin intermediul obj spital meth de afisare vizite
        spital.afisareIstoricVizite();
    }
}
