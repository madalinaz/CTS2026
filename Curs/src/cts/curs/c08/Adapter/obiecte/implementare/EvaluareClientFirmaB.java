package cts.curs.c08.Adapter.obiecte.implementare;

public class EvaluareClientFirmaB implements IEvaluareClientFirmaB {
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Tehnica evaluare firma B");
        System.out.println("S-a oferit discout de 10%");
    }
}
