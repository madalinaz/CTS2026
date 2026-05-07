package cts.curs.c11.Command_telecomanda.implementare;

public class ComandaRidicareJaluzele implements IComanda{
    private Jaluzele executant;

    public ComandaRidicareJaluzele(Jaluzele executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        this.executant.ridica();
    }
}
