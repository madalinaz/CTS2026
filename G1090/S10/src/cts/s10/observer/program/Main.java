package cts.s10.observer.program;


import cts.s10.observer.implementare.Client;
import cts.s10.observer.implementare.IObserver;
import cts.s10.observer.implementare.ServiciuPolitiaRomana;

//utilizatorii de app mobile au optiunea de a se abona la sistemul de notificare al fiecarui serviciu app
//implementarea permite extindere cu noi tipuri de servicii
public class Main {
    public static void main(String[] args) {
        IObserver client1 = new Client("Gigel");
        IObserver client2 = new Client("Maria");

        ServiciuPolitiaRomana serviciuPolitiaRomana = new ServiciuPolitiaRomana("Politia Romana");
        serviciuPolitiaRomana.abonare(client1);
        serviciuPolitiaRomana.abonare(client2);

        serviciuPolitiaRomana.adaugareCaz("A evadat Costel din puscarie", 2);
        serviciuPolitiaRomana.adaugareCaz("Vine furtuna", 10);
    }
}

