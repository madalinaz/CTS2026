package cts.g1093.s10.adapter.implementare;

public class Laptop {
    private String serie;
    private int nivelBaterie;

    public Laptop(String serie, int nivelBaterie) {
        this.serie = serie;
        this.nivelBaterie = nivelBaterie;
    }
    public void incarca(IPrizaAmerica priza){
        System.out.println("S-a bagat laptop la incarcat. Creste nivelul de baterie");
        this.nivelBaterie += 10;
        priza.incarcaLa110V();
    }
}
