package cts.curs.c02.SOLID.L.After;

public class Dreptunghi implements Forma{
    private final int lungime;
    private final int latime;

    public Dreptunghi(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public int getLungime() { return lungime; }
    public int getLatime() { return latime; }

    @Override
    public int getArie() {
        return lungime * latime;
    }
}
