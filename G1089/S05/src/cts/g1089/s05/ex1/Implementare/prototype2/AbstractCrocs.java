package cts.g1089.s05.ex1.Implementare.prototype2;

import java.util.ArrayList;
import java.util.List;

abstract public class AbstractCrocs implements Cloneable {
    protected int marime;
    protected String culoare;
    protected List<String> accesorii;

     AbstractCrocs(int marime, String culoare) {
        this.marime = marime;
        this.culoare = culoare;
    }

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public AbstractCrocs clone() throws CloneNotSupportedException {
         AbstractCrocs copie= (AbstractCrocs) super.clone();
         copie.accesorii = new ArrayList<>(this.accesorii);
        return copie;
    }

    @Override
    public String toString() {
        return "AbstractCrocs{" +
                "marime=" + marime +
                ", culoare='" + culoare + '\'' +
                ", accesorii=" + accesorii +
                '}';
    }
}
