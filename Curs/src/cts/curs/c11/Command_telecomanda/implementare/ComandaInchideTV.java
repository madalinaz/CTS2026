package cts.curs.c11.Command_telecomanda.implementare;

public class ComandaInchideTV implements IComanda {
    private Televizor executant;

    public ComandaInchideTV(Televizor executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        this.executant.inchideTV();
    }
}
