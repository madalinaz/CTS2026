package cts.curs.c08.adapter.clase.program;

import cts.curs.c08.adapter.clase.implementare.*;

public class Main {
    public static void main(String[] args) {
        //RESTAURANT A
        System.out.println("RESTAURANT A");
        IEvaluareClientFirmaA evaluareA = new EvaluareClientFirmaA();
        evaluareA.analizaClientFirmaA(3000);

        //RESTAURANT B
        System.out.println("RESTAURANT B");
        IEvaluareClientFirmaB evaluareB = new EvaluareClientFirmaB();
        int[] costuri = new int[]{100,200,300,400,1000};
        Client client = new Client("Gigel",5,costuri);
        evaluareB.analizaClientFirmaB(client);

        //UTILIZARE ADAPTER dupa ce restaurant B este cumparat de restaurant A
        System.out.println("RESTAURANT B folosind ADAPTER");
        IEvaluareClientFirmaB adapter = new Adapter();
        int[] costuri2 = new int[]{100,200,300,400,1000};
        Client client2 = new Client("Gigel",5,costuri);
        adapter.analizaClientFirmaB(client2);

    }
}
