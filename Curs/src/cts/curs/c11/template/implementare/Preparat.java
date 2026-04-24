package cts.curs.c11.template.implementare;

public abstract class Preparat {
    public final void preparaPreparat() {
        pregatesteIngrediente();
        gateste();
        monteazaInFarfurie();
        serveste();
    }

    protected abstract void pregatesteIngrediente();
    protected abstract void gateste();
    protected abstract void monteazaInFarfurie();

    protected void serveste() {
        System.out.println("Preparatul este servit clientului.");
    }
}
