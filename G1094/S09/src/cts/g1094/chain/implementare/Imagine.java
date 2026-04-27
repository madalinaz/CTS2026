package cts.g1094.chain.implementare;

public class Imagine implements IItem{
    private int lungime;
    private int latime;

    @Override
    public String getTip() {
        return "imagine";
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public Imagine(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    @Override
    public String toString() {
        return "Imagine{" +
                "lungime=" + lungime +
                ", latime=" + latime +
                '}';
    }
}
