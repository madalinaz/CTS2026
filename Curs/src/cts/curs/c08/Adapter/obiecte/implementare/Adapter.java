package cts.curs.c08.Adapter.obiecte.implementare;

import cts.curs.c08.Adapter.clase.implementare.EvaluareClientFirmaA;
import cts.curs.c08.Adapter.clase.implementare.IEvaluareClientFirmaA;

public class Adapter implements IEvaluareClientFirmaB{
    private IEvaluareClientFirmaA referinta = new EvaluareClientFirmaA();
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Pare ca evaluarea este facuta de firma B, dar se realizeaza de....");
        referinta.analizaClientFirmaA(costTotalEvenimente(client));
    }

    //existenta unei metode de transformare a inputului din Firma B in firma A
    private int costTotalEvenimente(Client client){
        System.out.println("Tranformare input din B in A");
        int total=0;
        for(int i=0;i<client.getNrEvenimente();i++){
            total += client.getCostEvenimente()[i];
        }
        return total;
    }
}
