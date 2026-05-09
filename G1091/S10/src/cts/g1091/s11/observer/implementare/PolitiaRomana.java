package cts.g1091.s11.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public class PolitiaRomana extends AObservabil{
    private int pragCritic;
    private List<String> listaCazuri;


    public PolitiaRomana(String denumireServiciu, int pragCritic) {
        super(denumireServiciu);
        this.pragCritic = pragCritic;
        this.listaCazuri= new ArrayList<>();
    }

    public void producereCaz (String text, int nivel){
        this.listaCazuri.add(text);
        if(nivel > this.pragCritic){
            this.notificareObservator(text);
        }
    }
}
