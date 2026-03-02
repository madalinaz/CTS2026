package cts.curs.c02.SOLID.L.Before;

public class Patrat extends Dreptunghi {

    @Override
    public void setLungime(int lungime) {
        super.setLungime(lungime);
        super.setLatime(lungime);
    }

    @Override
    public void setLatime(int latime) {
        super.setLungime(latime);
        super.setLatime(latime);
    }
}