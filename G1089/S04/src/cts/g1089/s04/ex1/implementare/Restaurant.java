package cts.g1089.s04.ex1.implementare;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    //cu rol de Singleton

    private static Restaurant instance = new Restaurant();

    //SingletonData
    private String denumireRestaurant;
    private Map<Integer, Masa> mapa;

    private Restaurant() {
        mapa = new HashMap<>();
    }

    //Singleton Operation
    public void addMasa(Masa masa) {
        if(masa == null)
            throw new NullPointerException("Masa can't be null");
        mapa.put(masa.getId(), masa);
    }

    public void ocupaMasa(int id){
        if(!mapa.containsKey(id)){
            throw new RuntimeException("Masa nu exista!");
        }
        if(!mapa.get(id).isEsteLibera()){
            throw new RuntimeException("Masa nu este disponibila!");
        }
        mapa.get(id).setEsteLibera(false);
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

    public static Restaurant getInstance() {
        return instance;
    }


}
