package cts.chain.implementare;

public class Persoana {
    private String nume;
    private float salariu;
    private int vechimeInLuni;
    private int nrPersIntretinere;

    public Persoana(String nume, float salariu, int vechimeInLuni, int nrPersIntretinere) {
        this.nume = nume;
        this.salariu = salariu;
        this.vechimeInLuni = vechimeInLuni;
        this.nrPersIntretinere = nrPersIntretinere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public void setSalariu(float salariu) {
        this.salariu = salariu;
    }

    public int getVechimeInLuni() {
        return vechimeInLuni;
    }

    public void setVechimeInLuni(int vechimeInLuni) {
        this.vechimeInLuni = vechimeInLuni;
    }

    public int getNrPersIntretinere() {
        return nrPersIntretinere;
    }

    public void setNrPersIntretinere(int nrPersIntretinere) {
        this.nrPersIntretinere = nrPersIntretinere;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", vechimeInLuni=" + vechimeInLuni +
                ", nrPersIntretinere=" + nrPersIntretinere +
                '}';
    }
}
