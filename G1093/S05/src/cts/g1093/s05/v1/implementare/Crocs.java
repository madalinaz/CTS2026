package cts.g1093.s05.v1.implementare;

import java.util.ArrayList;
import java.util.List;

public class Crocs implements Cloneable{
    private List<Integer> listaDimensiuni;//lungime,latime,inaltime
    private int marime;//40,38,39
    private String culoare;
    private String accesorii;

    public Crocs(int marime) {
        //proces consumator
        //in functie de marime se preia din exterior lista dimensiunilor
        this.culoare = "-";
        this.marime = marime;
        this.accesorii = "-";
        this.listaDimensiuni = new ArrayList<>();
        //calcul pentru dimensiuni pe baza marimii
        listaDimensiuni.add(marime - 15);
        listaDimensiuni.add(marime/4);
        listaDimensiuni.add(marime/10);
    }


    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAccesorii(String accesorii) {
        this.accesorii = accesorii;
    }

    @Override
    public Crocs clone() throws CloneNotSupportedException {
        Crocs copie = (Crocs)super.clone();
        copie.listaDimensiuni = new ArrayList<>();
        for(Integer i : this.listaDimensiuni){
            copie.listaDimensiuni.add(i);
        }
        copie.culoare =  this.culoare;
        copie.accesorii = this.accesorii;
        return copie;
    }

    //Se preiau dim default in functie de marime
    //Dar clientul parametrizeaza latimea
    public void modificareLatime(int latimeNoua){
        this.listaDimensiuni.set(1,latimeNoua);
    }

    @Override
    public String toString() {
        return "Crocs{" +
                "listaDimensiuni=" + listaDimensiuni +
                ", marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", accesorii='" + accesorii + '\'' +
                '}';
    }
}
