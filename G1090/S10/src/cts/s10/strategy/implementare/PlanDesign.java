package cts.s10.strategy.implementare;

import java.util.List;

public class PlanDesign {
    private int id;
    private String denumire;
    private String tipCamera;
    private List<String> listaObiecte;

    public PlanDesign(int id, String denumire, String tipCamera, List<String> listaObiecte) {
        this.id = id;
        this.denumire = denumire;
        this.tipCamera = tipCamera;
        this.listaObiecte = listaObiecte;
    }


    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getTipCamera() {
        return tipCamera;
    }

    public List<String> getListaObiecte() {
        return listaObiecte;
    }


    @Override
    public String toString() {
        return "PlanDesign{" +
                "id=" + id +
                ", denumire='" + denumire + '\'' +
                ", tipCamera='" + tipCamera + '\'' +
                ", listaObiecte=" + listaObiecte +
                '}';
    }

}
