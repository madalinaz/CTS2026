package cts.g1091.s04.implementare;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    //aici este clasa Singleton
    private static Restaurant instance
            = new Restaurant();

    //SingletonData ->non-static
    private String denumire;
    private Map<Integer, Masa> mapa;

    private Restaurant() {
        mapa = new HashMap<Integer, Masa>();
    }

    public static Restaurant getInstance() {
        return instance;
    }

    //Singleton Operations ->meth non-statice
    public void addMasa(Masa masa){
        if(masa==null){
            throw new RuntimeException();
        }
        mapa.put(masa.getId(), masa);
    }

    public void ocupareMasa(int id){
        if(!mapa.containsKey(id)){
            throw new RuntimeException("Masa nu exista");
        }
        if(!mapa.get(id).isEsteDisponibila()){
            throw new RuntimeException("Masa este deja ocupata");
        }
        mapa.get(id).setEsteDisponibila(false);
    }

    public void afisareMese(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "denumire='" + denumire + '\'' +
                ", mapa=" + mapa +
                '}';
    }
}
