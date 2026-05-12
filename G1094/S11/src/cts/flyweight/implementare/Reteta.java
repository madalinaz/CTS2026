package cts.flyweight.implementare;

public class Reteta {
    private String pacient;
    private String medicamente;

    public Reteta(String pacient, String medicamente) {
        this.pacient = pacient;
        this.medicamente = medicamente;
    }

    public String getPacient() {
        return pacient;
    }

    public String getMedicamente() {
        return medicamente;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "pacient='" + pacient + '\'' +
                ", medicamente='" + medicamente + '\'' +
                '}';
    }


}
