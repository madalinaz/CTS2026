package cts.g1091.s09.chainOfResponsability.main;

import cts.g1091.s09.chainOfResponsability.implementare.*;

public class Main {
    public static void main(String[] args) {
        IHandler anaf = new HandlerANAF();
        IHandler vechime = new HandlerVechime();
        IHandler nivelSalariu = new HandlerNivelSalariu();

        anaf.setNextHandler(new HandlerVechime());
        vechime.setNextHandler(nivelSalariu);

        Persoana p = new Persoana("Maria",2002, 20);
        System.out.println(anaf.procesareCerere(p, 3000, 12));

        //anaf.getNextHandler().setNextHandler(new HandlerVechime());
        //anaf.getNextHandler().getNextHandler().setNextHandler(new HandlerNivelSalariu());

        //1. Vreau sa aflu de la banca cat pot primi din creditul cerut
        //2. De completat black list static in handler Anaf
        //3. Sa se implementeze clasa Banca care este wrapper peste chain
        //*** 4. In banca metoda de shuffle (aranjare la cerere a ordinii din chain)
        //5. ce se mai poate adauga in AHandler ca zona comuna

    }
}
