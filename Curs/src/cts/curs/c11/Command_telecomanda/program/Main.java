package cts.curs.c11.Command_telecomanda.program;

import cts.curs.c11.Command_telecomanda.implementare.*;

public class Main {
    public static void main(String[] args) {
        Telecomanda t = new Telecomanda();

        //parametrizare butoane telecomanda
        //de catre posesorul casei inteligente

        Jaluzele j1 = new Jaluzele("parter");
        Televizor tv1 = new Televizor("Samsung","parter");
        Televizor tv2 = new Televizor("Sony","etaj");
        t.setButon1(new ComandaCoboaraJaluzele(j1));
        t.setButon2(new ComandaDeschideTV(tv2));
        t.setButon3(new ComandaDeschideTV(tv1));

        //clientul/adica posesorul casei
        //activeaza butoane
        t.apasaButon1();

        t.setButon3(new ComandaInchideTV(tv1));
    }
}
