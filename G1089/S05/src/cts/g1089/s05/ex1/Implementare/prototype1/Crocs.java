package cts.g1089.s05.ex1.Implementare.prototype1;

import cts.g1089.s05.ex1.Implementare.API.APIDimensiuni;

import java.util.ArrayList;
import java.util.List;

public class Crocs implements IClonare {
    private int marime; //40,38
    private String culoare;
    private List<Integer> dimensiuni;
    private String accesorii;

    private static APIDimensiuni apiDimensiuni = APIDimensiuni.getInstance();

    public Crocs(int marime) {
        this.marime = marime;
        this.dimensiuni =  apiDimensiuni.getDimensiuni(marime);
        this.culoare = "Alb";
        this.accesorii = "-";
    }

    private Crocs() {
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAccesorii(String accesorii) {
        this.accesorii = accesorii;
    }

    public void modificareDimensiune(int i, int dimensiune){
        this.dimensiuni.set(i, dimensiune);
    }

    //returneaza o copie prin deep copy plecand de la this
    @Override
    public IClonare getCopie() {
        Crocs copie = new Crocs();
        copie.marime = this.marime;
        copie.culoare = this.culoare;
        copie.accesorii = this.accesorii;
        copie.dimensiuni = new ArrayList<>(this.dimensiuni);

        return copie;
    }

    @Override
    public String toString() {
        return "Crocs{" +
                "marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", dimensiuni=" + dimensiuni +
                ", accesorii='" + accesorii + '\'' +
                '}';
    }
}
