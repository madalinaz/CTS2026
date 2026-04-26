package chain_of_responsability.implementare;

public class Persoana {
    private String nume;
    private float salariu;
    private int nrLuniAngajat;
    private int nrCopii;

    public Persoana(String nume, float salariu, int nrLuniAngajat, int nrCopii) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrLuniAngajat = nrLuniAngajat;
        this.nrCopii = nrCopii;
    }

    public String getNume() {
        return nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public int getNrLuniAngajat() {
        return nrLuniAngajat;
    }

    public int getNrCopii() {
        return nrCopii;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrLuniAngajat=" + nrLuniAngajat +
                ", nrCopii=" + nrCopii +
                '}';
    }
}
