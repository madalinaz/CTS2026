package cts.g1092.s04.ex1.implementare;

public class Masa {
    private int id;
    private boolean esteDisponibila;
    //alte detalii

    public Masa(int id) {
        this.id = id;
        this.esteDisponibila=true;
    }

    public int getId() {
        return id;
    }

    public boolean isEsteDisponibila() {
        return esteDisponibila;
    }

    public void setEsteDisponibila(boolean esteDisponibila) {
        this.esteDisponibila = esteDisponibila;
    }

    @Override
    public String toString() {
        return "Masa{" +
                "id=" + id +
                ", esteDisponibila=" + esteDisponibila +
                '}';
    }
}
