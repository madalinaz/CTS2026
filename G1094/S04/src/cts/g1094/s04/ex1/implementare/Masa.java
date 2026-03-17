package cts.g1094.s04.ex1.implementare;

public class Masa {
    private int id;
    private boolean esteLibera;

    public Masa(int id) {
        this.id = id;
        this.esteLibera = true;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public int getId() {
        return id;
    }

    public void setEsteLibera(boolean esteLibera){
        this.esteLibera=esteLibera;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", esteLibera=" + esteLibera +
                '}';
    }

}
