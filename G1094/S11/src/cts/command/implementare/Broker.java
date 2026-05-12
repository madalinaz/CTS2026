package cts.command.implementare;


import java.util.ArrayList;
import java.util.List;

//clasa INVOKER din diagrama
//versiune cu o lista si apel intarziat al comnenzilor
public class Broker {

    private List<IComanda> comenzi;
    public Broker() {
        this.comenzi =new ArrayList<>();
    }
    public void receptionareComanda(IComanda comanda){
        this.comenzi.add(comanda);
    }

    public void executieIntarziata(){
        for(IComanda c: comenzi){
            c.executa();
        }
        comenzi.clear();
    }
}
