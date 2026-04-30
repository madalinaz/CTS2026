package cts.chain.program;

import cts.chain.implementare.*;

import java.util.logging.Handler;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Gigele", 2000, 13, 0 );
        IHandler h1 = new HandlerBirouCredite();
        IHandler h2 = new HandlerVechime();
        IHandler h3 = new HandlerNivelSalariu();

        h1.setNextHandler(h3);
        h2.setNextHandler(h2);

        try{
            System.out.println( h1.procesareCerere(p1, 0));
        } catch (ExceptieCredit e) {
            throw new RuntimeException(e);
        }
    }
}