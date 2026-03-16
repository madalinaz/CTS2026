package cts.g1092.s04.ex1.program;

import cts.g1092.s04.ex1.implementare.Masa;
import cts.g1092.s04.ex1.implementare.Ospatar;
import cts.g1092.s04.ex1.implementare.Restaurant;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //un exemplu de Singleton
        //disponibilitatea meselor din cadrul unui restaurant
        //o lista de mese(diverse detalii + disponibilitate)
        //gestionez centralizat disponibilitatea acestor mese -> singleton
        //ospatarii gestioneaza mesele prin intermediul singleton-ului

        //de testat implementarea prin verificarea daca ambii ospatari vizualizeaza disponibilitatea meselor la fel

        Ospatar ospatar1 = new Ospatar("Gigel");
        Ospatar ospatar2 = new Ospatar("Costel");

        Restaurant restaurant = Restaurant.getInstance();
        restaurant.addMasa(new Masa(1));
        restaurant.addMasa(new Masa(2));
        restaurant.addMasa(new Masa(3));
        restaurant.addMasa(new Masa(4));
        restaurant.addMasa(new Masa(5));

        System.out.println("Afisare mese inainte de interactiune cu ospatari");
        restaurant.afisareDisponibilitateMese();

        ospatar1.preluareClient(3);
        ospatar2.preluareClient(1);
        ospatar2.preluareClient(4);
        ospatar1.preluareClient(5);
        ospatar1.afisareMese();
        ospatar2.afisareMese();

        //de adaugat si metoda care elibereaza masa, adica debarasareMasa
        //de gestionat exceptiile in cel putin un caz intre preluare client si debarasare masa
        //de adaugat o alta metoda de preluareClient in care clientul NU isi alege el singur masa, ci ospatarul alege prima masa disponibila
        //(se vor adauga alte metode necesare si in clasa Restaurant)
        //de regandit clasa Masa, astfel incat sa contina si campurile: nr scaune, esteAfara
        //cu aceste modificari, vreau ca in metoda preluareClient,
        // sa se tina cont de client (cate persoane, si daca doreste sau nu afara, sau poate ii este indiferent)

        //O modalitate de populare cu un numar de mese(versiunea 1 in care masa are doar id si disponibilitate) inca de la inceput
        //atunci cand este construita instanta, apoi sa nu se mai permita modificari

        //ex separat. Un generator de ID-uri unice ->Singleton (in stil DRPCIV) ( sa poata genera un ID unic random dar care NU a aparut si NU
        //a fost folosit pana atunci, sau sa se poata cere un ID preferential)
        //daca se doreste, acest generator se poate integra in clasa Masa
    }
}