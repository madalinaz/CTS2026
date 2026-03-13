package cts.g1090.s04.implementare;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    //cu rol de Singleton
    private static Restaurant instance = new Restaurant();

    //SingletonData (campuri non-statice)
    private String denumireRestaurant;
    private Map<Integer,Masa> mapa;

    private Restaurant() {
        mapa = new HashMap<>();
    }

    public static Restaurant getInstance() {
        return instance;
    }

    //Singleton operations
    public void addMasa(Masa masa) {
        if(masa==null){
            throw new RuntimeException("Masa este null");
        }
        mapa.put(masa.getId(),masa);
    }

    public void ocupaMasa(int idMasa){
        if(!mapa.containsKey(idMasa)){
            throw new RuntimeException("Masa nu exista");
        }
        if(!mapa.get(idMasa).isEsteLibera()){
            throw new RuntimeException("Masa este deja ocupata");
        }
        mapa.get(idMasa).setEsteLibera(false);
    }

    public void afisareMese(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "denumireRestaurant='" + denumireRestaurant + '\'' +
                ", mapa=" + mapa +
                '}';
    }
}
