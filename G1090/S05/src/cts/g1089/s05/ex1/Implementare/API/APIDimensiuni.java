package cts.g1089.s05.ex1.Implementare.API;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class APIDimensiuni {
    private static APIDimensiuni instance = new APIDimensiuni();

    private Map<Integer, List<Integer>> standardDimensiuni = null;

    public void init() {
        if(standardDimensiuni != null) {
            throw new RuntimeException("S-a initializat deja colectia de dimensiuni");
        }
        standardDimensiuni = new HashMap<>();
        for(int marime = 20; marime<=50;marime++){
            List<Integer> dimensiuni = new ArrayList<>();
            dimensiuni.add(marime-15);
            dimensiuni.add(marime/4);
            standardDimensiuni.put(marime, dimensiuni);
        }
    }

    private APIDimensiuni() {}

    public static APIDimensiuni getInstance() {
        return instance;
    }

    public List<Integer> getDimensiuni(int marime){
        if(marime<20 || marime>50){
            throw new IllegalArgumentException("Marime invalida. Nu exista standarde");
        }
        List<Integer> dimensiuni = new ArrayList<Integer>(standardDimensiuni.get(marime));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
        return dimensiuni;
    }
}
