package cts.g1092.s05.prototype2.implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractClass implements Cloneable{
    private int marime;
    private String culoare;
    protected List<String> accesorii;

    public void setMarime(int marime) {
        this.marime = marime;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setAccesorii(List<String> accesorii) {
        this.accesorii = accesorii;
    }

    public void setAccesoriu(String accesoriu){
        this.accesorii.add(accesoriu);
    }

    @Override
    public AbstractClass clone(){
        try{
           AbstractClass copie = (AbstractClass) super.clone();
           copie.marime=this.marime;
           copie.culoare=this.culoare;
           copie.accesorii=new ArrayList<>(this.accesorii);
           return copie;
        } catch(CloneNotSupportedException e){
            return null;
        }
    }
}
