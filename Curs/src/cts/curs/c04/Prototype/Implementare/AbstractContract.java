package cts.curs.c04.Prototype.Implementare;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractContract implements Cloneable{
    private String id;
    protected String tip;
    protected List<String> listaClauze;

    abstract void printare();

    public void modifListaClauze(int i, String clauzaNoua){
        listaClauze.set(i, clauzaNoua);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public List<String> getListaClauze() {
        return listaClauze;
    }

    @Override
    public String toString() {
        return "AContract [id=" + id + ", tip=" + tip + ", listaClauze=" + listaClauze + "]";
    }

    @Override
    public AbstractContract clone()
    {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return (AbstractContract) clone;
    }
}
