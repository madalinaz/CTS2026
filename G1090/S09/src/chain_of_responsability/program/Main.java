package chain_of_responsability.program;

import chain_of_responsability.implementare.*;

public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Gigel", 10000, 20, 0);
        Persoana p2 = new Persoana("Costel", 10000, 20, 0);
        Persoana p3 = new Persoana("Marcel", 10000, 10, 0);
        Persoana p4 = new Persoana("Marcela", 200, 20, 3);

        IHandler h1 = new HandlerANAF();
        IHandler h2 = new HandlerVechime();
        IHandler h3 = new HandlerNivelSalariu();

        h1.setNextHandler(h2);
        h2.setNextHandler(h3);

        System.out.println(h1.procesareCerere(p1, 1000, 10));
        System.out.println( h1.procesareCerere(p2, 1000, 10));
        System.out.println( h1.procesareCerere(p3, 1000, 10));
        System.out.println(h1.procesareCerere(p4, 10000, 2));

    }

    //TO-DO HOME:
    //1. se poate adauga in AHandler ceva mai mult din Handlerii concreti?
    //2. sa se modifice metoda procesareCerere incat sa returneze cat se acorda din credit
    //3. sa se implementeze clasa Banca ca wrapper peste Handleri
    //4*. sa se implementeze in clasa Banca metoda shuffle pe lista handleri



}
