package cts.g1091.s05.ex1.Implementare.MagazinCrocs;

import cts.g1091.s05.ex1.Implementare.API.APIDimensiuni;

import java.util.ArrayList;
import java.util.List;

public class Crocs implements IClonabil {
    private int marime;
    private String culoare;
    private String accesorii;
    private List<Integer> dimensiuni;

    public Crocs(int marime) {
        this.marime = marime;
        this.dimensiuni = new ArrayList<>(APIDimensiuni.getInstance().getDimensiuni(marime));
        this.culoare = "Gri";
        this.accesorii = "-";
    }

    private Crocs(Crocs crocs) {
        this.marime = crocs.marime;
        this.dimensiuni = new ArrayList<>(crocs.dimensiuni);
        this.culoare = crocs.culoare;
        this.accesorii = crocs.accesorii;
    }

    private Crocs() {
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAccesorii(String accesorii) {
        this.accesorii = accesorii;
    }

    public void setDimensiune(int i, int dimensiune) {
        this.dimensiuni.set(i, dimensiune);
    }

    @Override
    public String toString() {
        return "Crocs{" +
                "marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", accesorii='" + accesorii + '\'' +
                ", dimensiuni=" + dimensiuni +
                '}';
    }

    //    @Override
//    public IClonabil getCopie() {
//        //Returnam un obiect nou prin deep copy plecand de la this
//        List<Integer> dimensiuni = new ArrayList<>(this.dimensiuni);
//        //DO NOT!
//        // Crocs copie=new Crocs(this.marime);
//        Crocs copie=new Crocs();//aici nu apelam API
//        copie.dimensiuni=new ArrayList<>(this.dimensiuni);
//        copie.marime=this.marime;
//        copie.culoare=this.culoare;
//        copie.accesorii=this.accesorii;
//        return copie;
//    }
    @Override
    public IClonabil getCopie() {
        //Returnam un obiect nou prin deep copy plecand de la this
        Crocs copie = new Crocs(this);//aici nu apelam API
        return copie;
    }
}
