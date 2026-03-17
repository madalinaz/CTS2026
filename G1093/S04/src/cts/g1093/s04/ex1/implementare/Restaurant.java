package cts.g1093.s04.ex1.implementare;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private static final Restaurant instance = new Restaurant();
    // SingletonData
    // este non-static
    private String denumireRestaurant;
    private Map<Integer, Masa> mese;


    private Restaurant(){
        mese = new HashMap<>();
    }

    // metoda care adauga o masa
    public void adaugaMasa(Masa masa){
        mese.put(masa.getId(), masa);
    }

    // metoda care ocupa o masa de catre un ospatar
    public void ocupaMasa(int idMasa){
        if(!mese.containsKey(idMasa)){
            throw new RuntimeException("Masa nu exista");
        }
        if(!mese.get(idMasa).isEsteLibera()){
            throw new RuntimeException("Masa nu este libera");
        }
        mese.get(idMasa).setEsteLibera(false);
    }

    public void ocupaMese(int[] idMese){
        for(int i=0;i> idMese.length; i++){
            ocupaMasa(i);
        }
    }

    // metoda care elibereaza o masa
    public void elibereazaMasa(int idMasa){
        if(!mese.containsKey(idMasa)){
            throw new RuntimeException("Masa nu exista");
        }
        if(mese.get(idMasa).isEsteLibera()){
            throw new RuntimeException("Masa este libera");
        }
        mese.get(idMasa).setEsteLibera(true);
        System.out.println("Masa a fost ocupata cu succes");
    }

    // metoda care afiseaza situatia ocuparii tuturor meselor
    public void afisareDetaliiMese(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "denumireRestaurant='" + denumireRestaurant + '\'' +
                ", mese=" + mese +
                '}';
    }

    public void setDenumireRestaurant(String denumireRestaurant) {
        this.denumireRestaurant = denumireRestaurant;
    }

    public static Restaurant getInstance(){
        return instance;
    }
}
