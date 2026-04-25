package chain_of_responsability.implementare;

public class Persoana {
    private String nume;
    private float salariu;
    private int nrCopii;
    private int nrLuniAngajat;

    public Persoana(String nume, float salariu, int nrCopii, int nrLuniAngajat) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrCopii = nrCopii;
        this.nrLuniAngajat = nrLuniAngajat;
    }

    public String getNume() {
        return nume;
    }

    public float getSalariu() {
        return salariu;
    }

    public int getNrCopii() {
        return nrCopii;
    }

    public int getNrLuniAngajat() {
        return nrLuniAngajat;
    }
}
