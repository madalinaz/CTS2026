package cts.erculescu.rares.g1089.strategy.implementare;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nume;
    private IPlata tehnicaCurentaPlata;
    private List<String> modalitatiValabilePlata;

    public Client(String nume) {
        this.nume = nume;
        this.modalitatiValabilePlata=new ArrayList<>();
    }

    public void setModalitatiValabilePlata(List<String> modalitatiValabilePlata) {
        this.modalitatiValabilePlata = modalitatiValabilePlata;
    }

    public void setTehnicaCurentaPlata(IPlata tehnicaCurentaPlata) {
        if (this.modalitatiValabilePlata.contains(tehnicaCurentaPlata.getClass().getSimpleName())) {
            this.tehnicaCurentaPlata = tehnicaCurentaPlata;
        }else{
            throw new RuntimeException("Modalitatea de plata selectata nu se regaseste in lista de modalitati de plata setata de client.");
        }
    }

    public void lansareComanda(double totalPlata){
        if(tehnicaCurentaPlata==null){
            throw new RuntimeException("Tehnica curenta de plata nu a fost setata!");
        }
        this.tehnicaCurentaPlata.modalitatePlata(totalPlata);
    }
}
