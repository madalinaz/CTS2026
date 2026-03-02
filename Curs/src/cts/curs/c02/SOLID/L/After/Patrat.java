package cts.curs.c02.SOLID.L.After;

public class Patrat implements Forma{
    private final int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    public int getLatura() { return latura; }

    @Override
    public int getArie() {
        return latura * latura;
    }
}
