package chain_of_responsability.main;

import chain_of_responsability.implementare.*;

public class Main {
    public static void main(String[] args) {

        Persoana p1=new Persoana("Gigel",8000,2,40);
        Persoana p2=new Persoana("Costel",8000,2,40);
        Persoana p3=new Persoana("Adi",8000,2,8);
        Persoana p4=new Persoana("Maria",400,2,20);

        //creare lant responsabil creditare
        IHandler handler1=new HandlerANAF();
        //IHandler handler2=new HandlerVechime();
        //IHandler handler3=new HandlerNivelSalariu();

        handler1.setNextHandler(new HandlerVechime());
        handler1.getNextHandler().setNextHandler(new HandlerNivelSalariu());

       // handler1.setNextHandler(handler2);
       // handler2.setNextHandler(handler3);


        System.out.println( handler1.procesareCerere(p1,20,14));
        System.out.println(handler1.procesareCerere(p2,20,14));
        System.out.println( handler1.procesareCerere(p3,20,14));
        System.out.println(handler1.procesareCerere(p4,20000,14));

        //to do
        // adaugare clasa banca tip wrapper pentru lant
        // (*)adugare in banca metoda shuffle, sa se schimbe ordinea handler ilor
        //abstract handler( nu pot adauga mai mult in clasa abstracta?) clase prea redundante

    }
}
