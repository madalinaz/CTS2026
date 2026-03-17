package cts.g1093.s05.v2.implementare;


import java.util.ArrayList;
import java.util.List;

public abstract class Crocs implements Cloneable{
    private String culoare;
    private int marime;
    private List<String> accesorii;

     Crocs(String culoare, int marime) {
        this.culoare = culoare;
        this.marime = marime;
        this.accesorii = new ArrayList<>();
    }

    public String getCuloare() {
        return culoare;
    }

    public int getMarime() {
        return marime;
    }

    public List<String> getAccesorii() {
        return accesorii;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public void adaugaAccesoriu(String accesoriuNou){
        this.accesorii.add(accesoriuNou);
    }

    //Se pot adauga metd abstracte care se particularizeaza in clase concrete

    @Override
    protected Crocs clone() throws CloneNotSupportedException {
        Crocs copie = (Crocs)super.clone();
        copie.accesorii = new ArrayList<>(this.accesorii);
        copie.culoare = this.culoare;
        copie.marime = this.marime;
        return copie;
    }

    @Override
    public String toString() {
        return "Crocs{" +
                "culoare='" + culoare + '\'' +
                ", marime=" + marime +
                ", accesorii=" + accesorii +
                '}';
    }
}
