package cts.erculescu.rares.g1089.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public class ServiciuPolitiaRomana extends AObservabil{
    private List<String> listaAlerte;


    public ServiciuPolitiaRomana(String denumireServiciu) {
        super(denumireServiciu);
        this.listaAlerte=new ArrayList<>();
    }

    public void addAlerta(String text, int nivel){
        this.listaAlerte.add(text);
        if (nivel > 2) {
            this.notificareObservers(text);
        }
    }
}
