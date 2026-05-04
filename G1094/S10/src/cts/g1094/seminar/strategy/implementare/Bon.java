package cts.g1094.seminar.strategy.implementare;

//clasa context de strategy
public class Bon {
    //lista produse
    private float total;
    private ITehnicaPlata tehnicaPlata;

    public Bon(float total){
        this.total = total;
    }
    public void setStrategie(ITehnicaPlata tehnicaPlata){
        this.tehnicaPlata = tehnicaPlata;
    }
    public void inchidereBon(){
        if(tehnicaPlata != null) tehnicaPlata.plata(total);
    }
}
