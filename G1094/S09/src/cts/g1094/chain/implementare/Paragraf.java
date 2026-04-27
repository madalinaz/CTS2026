package cts.g1094.chain.implementare;

public class Paragraf implements IItem{
    private String text;
    private String culoare;
    private boolean esteBold;

    public String getText() {
        return text;
    }

    public String getCuloare() {
        return culoare;
    }

    public boolean isEsteBold() {
        return esteBold;
    }

    public Paragraf(String text, String culoare, boolean esteBold) {
        this.text = text;
        this.culoare = culoare;
        this.esteBold = esteBold;
    }

    @Override
    public String toString() {
        return "Paragraf{" +
                "text='" + text + '\'' +
                ", culoare='" + culoare + '\'' +
                ", esteBold=" + esteBold +
                '}';
    }

    @Override
    public String getTip() {
        return "";
    }
}
