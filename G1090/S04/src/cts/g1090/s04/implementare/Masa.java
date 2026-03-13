package cts.g1090.s04.implementare;

public class Masa {
    private int id;
    private boolean esteLibera;

    public Masa(int id) {
        this.esteLibera = true;
        this.id = id;
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
