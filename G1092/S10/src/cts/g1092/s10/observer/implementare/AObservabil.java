package cts.g1092.s10.observer.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AObservabil {
    private List<IObservator> observatori;
    private String denumireServiciu;

    public AObservabil(String denumireServiciu) {
        this.denumireServiciu = denumireServiciu;
        this.observatori = new ArrayList<>();
    }

    public void addObservator(IObservator observator){
        observatori.add(observator);
    }

    public void removeObservator(IObservator observator){
        observatori.remove(observator);
    }

    public void notificareObservatori(String mesaj) {
        for (IObservator observator : observatori) {
            observator.getMesaj(mesaj);
        }
    }

}
