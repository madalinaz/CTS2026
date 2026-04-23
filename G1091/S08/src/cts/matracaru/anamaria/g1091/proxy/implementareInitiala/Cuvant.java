package cts.matracaru.anamaria.g1091.proxy.implementareInitiala;

public class Cuvant {
    private String cuvant;
    private int nrHam;
    private int nrSpam;

    public Cuvant(String cuvant, int nrHam, int nrSpam) {
        this.cuvant = cuvant;
        this.nrHam = nrHam;
        this.nrSpam = nrSpam;
    }

    public String getCuvant() {
        return cuvant;
    }

    public void setCuvant(String cuvant) {
        this.cuvant = cuvant;
    }

    public int getNrHam() {
        return nrHam;
    }

    public void setNrHam(int nrHam) {
        this.nrHam = nrHam;
    }

    public int getNrSpam() {
        return nrSpam;
    }

    public void setNrSpam(int nrSpam) {
        this.nrSpam = nrSpam;
    }

    @Override
    public String toString() {
        return "Cuvant{" +
                "cuvant='" + cuvant + '\'' +
                ", nrHam=" + nrHam +
                ", nrSpam=" + nrSpam +
                '}';
    }
}
