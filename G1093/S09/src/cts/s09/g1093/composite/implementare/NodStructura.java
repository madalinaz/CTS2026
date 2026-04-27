package cts.s09.g1093.composite.implementare;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{
    private String label;
    private List<INod> listaFii;

    public NodStructura(String label) {
        this.label = label;
        this.listaFii=new ArrayList<>();
    }

    @Override
    public int getTotalCazuri() {
        int totalCazuri=0;
        for(INod nod:listaFii){
            totalCazuri+= nod.getTotalCazuri();
        }
        return totalCazuri;
    }

    @Override
    public float getRataMortalitate() {
        throw new UnsupportedOperationException("Nu tine de nod structura");
    }

    @Override
    public boolean esteSiguraDeVizitat() {
        if(this.getTotalCazuri()>1000){
            return false;
        }
        return true;
    }

    @Override
    public void addNod(INod nod) {
        listaFii.add(nod);
    }

    @Override
    public void removeNode(INod nod) {
        listaFii.remove(nod);
    }

    @Override
    public INod getNode(int index) {
        return listaFii.get(index);
    }
}
