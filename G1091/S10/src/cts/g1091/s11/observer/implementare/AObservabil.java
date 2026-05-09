package cts.g1091.s11.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AObservabil {
    private List<IObservator> listaObservatori;
    private String denumireServiciu;

    public AObservabil(String denumireServiciu) {
        this.listaObservatori = new ArrayList<IObservator>();
        this.denumireServiciu = denumireServiciu;
    }

    public void abonareObservator(IObservator observator){
        this.listaObservatori.add(observator);
    }

    public void dezabonareObservator(IObservator observator){
        this.listaObservatori.remove(observator);
    }

    public void notificareObservator(String mesaj) {
        for(IObservator observator : listaObservatori){
            observator.getMesaj(mesaj);
        }
    }
}
