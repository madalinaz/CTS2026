package cts.matracaru.anamaria.g1091.proxy.main;

import cts.matracaru.anamaria.g1091.proxy.implementareInitiala.BazaDeDate;
import cts.matracaru.anamaria.g1091.proxy.implementareInitiala.IBazaDeDate;
import cts.matracaru.anamaria.g1091.proxy.layer_intermediar.ProxyBazaDeDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Sa se modeleze folosind DP Proxy conceptul de Bulk insert, atunci cand se adauga un nivel intermediar
        //de interactiune cu BD in care se agrega local toate actualizarile din Baza de date si apoi se varsa toate ulterior in BD
        //Procesul obtine un timp de executare optimizat a comenzilor insert si update
        IBazaDeDate bazaDeDate=new ProxyBazaDeDate(new BazaDeDate());

        bazaDeDate.addCuvant("car",0,1);
        bazaDeDate.addCuvant("car",1,1);
        bazaDeDate.addCuvant("car",2,1);
        bazaDeDate.addCuvant("car",3,1);
        bazaDeDate.addCuvant("car",4,1);

        bazaDeDate.addCuvant("word",5,1);
        bazaDeDate.addCuvant("word",6,1);
        bazaDeDate.addCuvant("word",7,1);
        bazaDeDate.addCuvant("word",7,1);
        bazaDeDate.addCuvant("word",7,1);
        bazaDeDate.addCuvant("word",7,1);

        bazaDeDate.addCuvant("Cat",7,1);
        bazaDeDate.addCuvant("Cat",7,1);
        bazaDeDate.addCuvant("Cat",7,1);
        bazaDeDate.addCuvant("Cat",7,1);
        bazaDeDate.addCuvant("Cat",7,1);
        bazaDeDate.addCuvant("Cat",7,1);

        bazaDeDate.addCuvant("word",7,1);
        bazaDeDate.addCuvant("word",7,1);
        bazaDeDate.addCuvant("word",7,1);

        bazaDeDate.afisareCuvinte();
    }
}