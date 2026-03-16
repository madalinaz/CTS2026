package cts.g1092.s04.ex1.implementare;


import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    //aceasta este clasa Singleton
    private static Restaurant instance = new Restaurant();//implementare eager
    //Singleton Data -> campuri non-statice
    private String denumire;
    private Map<Integer,Masa> colectieMese;

    private Restaurant() {
        colectieMese = new HashMap<Integer,Masa>();
    }

    public static Restaurant getInstance() {
        return instance;
    }

    //Singleton Operations ->operatii pe obiectul unic care gestioneaza singleton data
    public void ocupareMasa(int idMasa){
        if(!colectieMese.containsKey(idMasa)){
            throw new RuntimeException("Nu exista aceasta masa in restaurant");
        }
        if(!colectieMese.get(idMasa).isEsteDisponibila()){
            throw new RuntimeException("Masa este deja ocupata");
        }
        colectieMese.get(idMasa).setEsteDisponibila(false);
    }

    public void afisareDisponibilitateMese(){
        System.out.println(this);
    }

    public void addMasa(Masa masa){
        if(masa==null){
            throw new RuntimeException("Obj este null");
        }
        colectieMese.put(masa.getId(),masa);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "denumire='" + denumire + '\'' +
                ", colectieMese=" + colectieMese +
                '}';
    }
}
