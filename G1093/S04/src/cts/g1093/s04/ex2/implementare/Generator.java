package cts.g1093.s04.ex2.implementare;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private final static Generator instance = new Generator();
    private List<Integer> listaID;
    private String denumire;
    //Data

    public boolean esteFolosit(int id){
        if(listaID.contains(id)){
            return true;
        }
        return false;
    }

    //functie recursiva sau while
    public int genereazaID(){
        int min = 0;
        int max = 999;
        int idGenerat = (int)((Math.random() * (max - min)) + min);
        while(esteFolosit(idGenerat))
            idGenerat = (int)((Math.random() * (max - min)) + min);
        listaID.add(idGenerat);
        return idGenerat;
    }

    private Generator(){
        listaID = new ArrayList<>();
    }

    public static Generator getInstance(){
        return instance;
    }
}
