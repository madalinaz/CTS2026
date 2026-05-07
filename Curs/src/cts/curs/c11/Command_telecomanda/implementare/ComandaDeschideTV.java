package cts.curs.c11.Command_telecomanda.implementare;

public class ComandaDeschideTV implements IComanda {
    private Televizor executant;

    public ComandaDeschideTV(Televizor executant) {
        this.executant = executant;
    }

    @Override
    public void executa() {
        this.executant.deschideTV();
    }
}
