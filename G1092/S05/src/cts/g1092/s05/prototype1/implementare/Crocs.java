package cts.g1092.s05.prototype1.implementare;

import java.util.ArrayList;
import java.util.List;

public class Crocs implements IClonable{

    private List<Integer> dimensiuni;
    private String culoare;
    private String accesorii;
    private int marime;

    public Crocs(int marime) {
        this.marime = marime; //dimensiuni din ext
        System.out.println("api pt dimensiuni");
        this.dimensiuni=new ArrayList<>();
        this.dimensiuni.add(marime-15);
        this.dimensiuni.add(marime/4);
        this.dimensiuni.add(marime/10);
        this.culoare="alb";
        this.accesorii=" ";
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public List<Integer> getDimensiuni() {
        return dimensiuni;
    }

    public void setLungime(int lungime) {
        this.dimensiuni.set(0,lungime);
    }

    public String getAccesorii() {
        return accesorii;
    }

    public void setAccesorii(String accesorii) {
        this.accesorii = accesorii;
    }

    public int getMarime() {
        return marime;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

    private Crocs() {
    }

    @Override
    public IClonable clonare() {
        Crocs crocs=new Crocs();
        crocs.culoare=this.culoare;
        crocs.accesorii=this.accesorii;
        crocs.marime=this.marime;
        crocs.dimensiuni=new ArrayList<>();
        for(int i : this.dimensiuni){
            crocs.dimensiuni.add(i);
        }
        return crocs;
    }

    @Override
    public String toString() {
        return "Crocs{" +
                "dimensiuni=" + dimensiuni +
                ", culoare='" + culoare + '\'' +
                ", accesorii='" + accesorii + '\'' +
                ", marime=" + marime +
                '}';
    }
}
