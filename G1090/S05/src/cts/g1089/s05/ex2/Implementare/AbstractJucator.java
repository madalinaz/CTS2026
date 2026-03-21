package cts.g1089.s05.ex2.Implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractJucator implements Cloneable{
    protected String nume;
    protected int varsta;
    protected List<String> medicamente;
    protected List<Antrenament> setAntrenamente;

    AbstractJucator() {
        medicamente=new ArrayList<>();
        medicamente.add("nurofen");
        medicamente.add("panadol");
        medicamente.add("paduden");
    }

    @Override
    public String toString() {
        return "AbstractJucator{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", medicamente=" + medicamente +
                ", setAntrenamente=" + setAntrenamente +
                '}';
    }

    @Override
    public AbstractJucator clone() throws CloneNotSupportedException {
        AbstractJucator copie = (AbstractJucator) super.clone();
        copie.setAntrenamente=new ArrayList<>(this.setAntrenamente);
        return copie;
    }
}
