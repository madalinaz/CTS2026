package cts.g1091.s05.ex1.Program;

import cts.g1091.s05.ex1.Implementare.API.APIDimensiuni;
import cts.g1091.s05.ex1.Implementare.MagazinCrocs.Crocs;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        APIDimensiuni apiDimensiuni = APIDimensiuni.getInstance();
        apiDimensiuni.init();

        //utilizare API pentru a prelua standarde dimensiuni in functie de marimea dorita
        List<Integer> dimensiuni = apiDimensiuni.getDimensiuni(40);
        System.out.println(dimensiuni);

        //Prototype ex1
        Crocs crocs1 = new Crocs(40);
        //Crocs crocs2 = new Crocs(40); - do noot!
        Crocs crocs2=(Crocs)crocs1.getCopie();
        Crocs crocs3 = new Crocs(38);
        //De simulat + verificat deep copy
        System.out.println(crocs1);
        System.out.println(crocs2);
        System.out.println(crocs3);
        crocs1.setAccesorii("Charm stea");
        crocs1.setCuloare("Verde");
        crocs1.setDimensiune(0,26);
        System.out.println(crocs1);
        System.out.println(crocs2);
        System.out.println(crocs3);
    }
}