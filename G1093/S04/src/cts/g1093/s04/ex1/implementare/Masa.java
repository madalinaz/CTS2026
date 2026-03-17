package cts.g1093.s04.ex1.implementare;

public class Masa {
    private final int id;
    private boolean esteLibera;

    public Masa(int id) {
        this.id = id;
        this.esteLibera = true;
    }

    public int getId() {
        return id;
    }

    public boolean isEsteLibera() {
        return esteLibera;
    }

    public void setEsteLibera(boolean esteLibera) {
        this.esteLibera = esteLibera;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", esteLibera=" + esteLibera +
                '}';
    }
}
