package cts.s12.g1093.command.implementare;

import java.util.ArrayList;
import java.util.List;

//invoker din siagrama (managter de comenzi)
public class Broker {
    private String nume;
    private List<IComanda> comenzi;

    public Broker(String nume) {
        this.nume = nume;
        this.comenzi=new ArrayList<>();
    }

    public void addComanda(IComanda comanda){
        this.comenzi.add(comanda);
    }

    public void lansareIntarziata(){
        for(IComanda comanda: comenzi){
            comanda.executa();
        }
        comenzi.clear();
    }
}
