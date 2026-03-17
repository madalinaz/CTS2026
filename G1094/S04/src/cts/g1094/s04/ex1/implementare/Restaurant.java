package cts.g1094.s04.ex1.implementare;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    //cu rol de implem Singleton
    private static Restaurant instance = new Restaurant();
    //singleton data e non-static
    private Map<Integer, Masa>mese;

    private Restaurant() {
        mese = new HashMap<>();
    }

    //daca nu e static, sunt oblig sa creez un ob, ceea ce clasa mea nu permite
    public static Restaurant getInstance(){
        return instance;
    }

    //Singleton Operation upon Singleton Data
    //metoda de populare mese in restaurant
    public void addMasa(Masa masa){
        //pos validari - masa sa dif de null
        mese.put(masa.getId(),masa);
    }

    //metoda pentru ocupare masa
    public void ocupaMasa(int idMasa){
        if(!mese.containsKey(idMasa)){
            throw new RuntimeException("Nu exista masa!");
        }

        if(!mese.get(idMasa).isEsteLibera()){
            throw new RuntimeException("Masa este deja ocupata!");
        }

        mese.get(idMasa).setEsteLibera(false);
        System.out.println("S-a ocupat masa!");
    }

    //metoda pt eliberare masa
    public void eliberaMasa(int idMasa){
        if(!mese.containsKey(idMasa)){
            throw new RuntimeException("Nu exista masa!");
        }

        if(mese.get(idMasa).isEsteLibera()) {
            throw new RuntimeException("Masa este deja libera!");
        }

        mese.get(idMasa).setEsteLibera(true);
        System.out.println("S-a eliberat masa!");
    }

    public void populareRestaurant(Map<Integer, Masa> meseNoi) {
        mese.putAll(meseNoi);
        System.out.println("S-au adaugat noile mese!");
    }

    public void afisareSituatieMese(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "mese=" + mese +
                '}';
    }
}
