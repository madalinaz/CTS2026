package cts.g1092.s08.proxy.implementare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spital implements ISpital{
    // cheie: pacientul vizitat
    Map<String, List<String>> vizite = new HashMap<>();
    private String denumireSpital;

    public Spital(String denumireSpital) {
        this.denumireSpital = denumireSpital;
    }

    @Override
    public void vizitare(String vizitator, String pacient) {
        System.out.println(vizitator + " l-a vizitat pe " + pacient);
        // daca nu a mai existat un pacient vizitat, va trebui sa alocam memorie, iar lista de vizitatori este deocamdata doar alocata
        if(!vizite.containsKey(pacient)){
            vizite.put(pacient, new ArrayList<>());
        }
        // in afara if-ului, vom adauga vizitatorul la lista de vizitatori
        vizite.get(pacient).add(vizitator);

    }

    @Override
    public void afisareIstoricVizite() {
        System.out.println("Istoric vizite " + this.denumireSpital + "\n");
        for (String pacient : vizite.keySet()) {
            System.out.println(pacient);
            System.out.println("Vizitatori:");
            for (String vizitator : vizite.get(pacient)) {
                System.out.println(vizitator + ", ");
            }

        }
    }
}
