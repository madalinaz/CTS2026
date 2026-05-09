package cts.g1091.s11.strategy.program;

import cts.g1091.s11.strategy.implementare.Client;
import cts.g1091.s11.strategy.implementare.TehnicaCard;

public class Main {
    public static void main(String[] args) {
        /*
           Clientul are posibilitatea la finalizare comanda de as alege metoda de plata(PlataCash, PlataCard).
           Extinderii in timp cu noi tehnici de ex : plata in rate, prin virament etc.
           strategy = o singura alegere din astea
         */

        Client c1 = new Client("Gigel");

        c1.finalizareComanda(100);

        c1.setStrategieCurenta(new TehnicaCard());
        c1.finalizareComanda(200);

        //de adaugat: sold la nivel de plata cash si plata cu card dispunere de sold
        //clasa portofel sau nivel client sa dispun de bani (cat are pe card si cat are cash) sau la nivel de strategie
        //metoda plata sa returneze un bool sau aruncare exceptie
        //la nivel de client sa existe niste strategii permise de vazut curs ultimul pdf cu cerinte de pe lucrare 2

    }
}
