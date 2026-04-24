package cts.g1092.s08.proxy.program;

import cts.g1092.s08.proxy.implementare.ISpital;
import cts.g1092.s08.proxy.implementare.Spital;
import cts.g1092.s08.proxy.implementare.nivel_intermediar.ProxySpital;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // aici interactionam direct cu spitalul
        Spital spital = new Spital("Floreasca");
        spital.vizitare("Gigel", "pacient1");
        spital.vizitare("Gigel", "pacient2");
        spital.vizitare("Costel", "pacient3");
        spital.vizitare("Bobita", "pacient3");
        spital.vizitare("Maria", "pacient2");
        spital.vizitare("Oana", "pacient3");
        spital.afisareIstoricVizite();

        // proxy version
        // clientul trebuie sa accepte ca el nu lucreaza cu un Spital, ci cu un ISpital
        // este minim afectat in aceasta poveste
        ISpital spitalP = new ProxySpital(new Spital("Floreasca"));
        spitalP.vizitare("Gigel", "pacient1");
        spitalP.vizitare("Gigel", "pacient2");
        spitalP.vizitare("Costel", "pacient3");
        spitalP.vizitare("Bobita", "pacient3");
        spitalP.vizitare("Maria", "pacient2");
        spitalP.vizitare("Oana", "pacient3");
        spitalP.afisareIstoricVizite();

    }

}

// RECOMANDARE PT ACASA:
// de reimplementat proxy atunci cand in interfata ISpital
// avem o meth care returneaza nr de vizite per pacient
// pot avea cazul in care am deja restrictionata vizitarea din clasa Spital
