package cts.g1089.s05.ex2.Implementare;

public class Antrenament {
    private String exercitiu;
    private int nrRepetitii;

    public Antrenament(String exercitiu, int nrRepetitii) {
        this.exercitiu = exercitiu;
        this.nrRepetitii = nrRepetitii;
    }

    public String getExercitiu() {
        return exercitiu;
    }

    public void setExercitiu(String exercitiu) {
        this.exercitiu = exercitiu;
    }

    public int getNrRepetitii() {
        return nrRepetitii;
    }

    public void setNrRepetitii(int nrRepetitii) {
        this.nrRepetitii = nrRepetitii;
    }

    @Override
    public String toString() {
        return "Antrenament{" +
                "exercitiu='" + exercitiu + '\'' +
                ", nrRepetitii=" + nrRepetitii +
                '}';
    }
}
