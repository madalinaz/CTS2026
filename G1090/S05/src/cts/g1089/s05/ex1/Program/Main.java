package cts.g1089.s05.ex1.Program;

import cts.g1089.s05.ex1.Implementare.API.APIDimensiuni;
import cts.g1089.s05.ex1.Implementare.clase.Crocs;

import java.util.List;


public class Main {
    public static void main(String[] args) {

        //SIMULARE UTILIZARE API

//
//        //utilizare API pentru a prelua standarde dimensiuni in functie de marimea dorita
//        List<Integer> dimensiuni = apiDimensiuni.getDimensiuni(40);
//        System.out.println(dimensiuni);

        //PROTOTYPE EX1
        APIDimensiuni apiDimensiuni = APIDimensiuni.getInstance();
        apiDimensiuni.init();

        Crocs crocs1=new Crocs(36);
        //Crocs crocs2=new Crocs(36); -> DO NOT
        Crocs crocs2= (Crocs) crocs1.getCopie();
        Crocs crocs3=new Crocs(38);
        System.out.println(crocs1);
        System.out.println(crocs2);
        System.out.println(crocs3);

        // de demonstrat ca modificari pe un obiect nu impacteaza si celelalte obiecte
        crocs2.setCuloare("Verde");
        crocs2.setAccesorii("Funde");
        crocs2.setDimensiune(0,40);
        System.out.println(crocs1);
        System.out.println(crocs2);
        System.out.println(crocs3);


    }
}