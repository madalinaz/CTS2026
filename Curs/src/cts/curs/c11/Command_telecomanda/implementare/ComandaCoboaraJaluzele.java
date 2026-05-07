package cts.curs.c11.Command_telecomanda.implementare;

public class ComandaCoboaraJaluzele implements IComanda{
    private Jaluzele executant;

    public ComandaCoboaraJaluzele(Jaluzele executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        this.executant.coboara();
    }
}
