package cts.g1089.s05.ex1.Implementare.clase;

import cts.g1089.s05.ex1.Implementare.API.APIDimensiuni;

import java.util.ArrayList;
import java.util.List;

public class Crocs implements IClonabil {

    private int marime;
    private List<Integer> dimensiuni;
    private String culoare;
    private String accesorii;

    //obligatoriu primim marime si NU primim dimensiuni
    public Crocs(int marime) {
        this.marime = marime;
        this.culoare = "Alb";
        this.accesorii = "-";
        //accesam API pentru preluare dimensiuni in functie de marime
        this.dimensiuni = APIDimensiuni.getInstance().getDimensiuni(this.marime);
    }

    private Crocs(Crocs c) {
        this.marime = c.marime;
        this.culoare = c.culoare;
        this.accesorii= c.accesorii;
        this.dimensiuni = new ArrayList<>(c.dimensiuni);
    }

    @Override
    public IClonabil getCopie() {
        //returnam obiect nou plecand de la this prin deep copy
        IClonabil copie;
        copie=new Crocs(this);
        return copie;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAccesorii(String accesorii) {
        this.accesorii = accesorii;
    }

    public void setDimensiune(int i, int dimensiune){
        this.dimensiuni.set(i, dimensiune);
    }

    @Override
    public String toString() {
        return "Crocs{" +
                "marime=" + marime +
                ", dimensiuni=" + dimensiuni +
                ", culoare='" + culoare + '\'' +
                ", accesorii='" + accesorii + '\'' +
                '}';
    }
}
