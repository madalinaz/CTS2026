package cts.curs.c08.Adapter.obiecte.program;


import cts.curs.c08.Adapter.obiecte.implementare.Adapter;
import cts.curs.c08.Adapter.obiecte.implementare.Client;
import cts.curs.c08.Adapter.obiecte.implementare.IEvaluareClientFirmaB;

public class Main {
    public static void main(String[] args) {
        //UTILIZARE ADAPTER  dupa ce restaurant B este cumparat de restaurant A
        System.out.println("RESTAURANT B folosind ADAPTER OBIECTE");
        IEvaluareClientFirmaB adapter = new Adapter();
        int[] costuri = new int[]{100,200,300,400,1000};
        Client client = new Client("Gigel",5,costuri);
        adapter.analizaClientFirmaB(client);
    }
}
