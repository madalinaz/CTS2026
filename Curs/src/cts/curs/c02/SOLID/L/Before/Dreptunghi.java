package cts.curs.c02.SOLID.L.Before;

public class Dreptunghi {
    private int lungime;
    private int latime;

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    public int getArie() {
        return lungime * latime;
    }
}
