package cts.curs.c08.Flyweight.program;

import cts.curs.c08.Flyweight.implementare.Bon;
import cts.curs.c08.Flyweight.implementare.MesajPrintareFactory;

public class Main {
    public static void main(String[] args) {
        Bon bon1  = new Bon(1,100);
        Bon bon2  = new Bon(2,200);
        Bon bon3  = new Bon(2,250);
        Bon bon4  = new Bon(4,230);
        Bon bon5  = new Bon(3,200);

        MesajPrintareFactory.getMesaj("TIP1").printareBon(bon1);
        MesajPrintareFactory.getMesaj("TIP2").printareBon(bon2);
        MesajPrintareFactory.getMesaj("TIP1").printareBon(bon3);
        MesajPrintareFactory.getMesaj("TIP1").printareBon(bon4);
    }
}
