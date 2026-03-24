package cts.rosoiu.anca.g1094.program;

import cts.rosoiu.anca.g1094.implementare.Pantof;
import cts.rosoiu.anca.g1094.implementare.TipPantof;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //e static pt ca nu pot avea obiect de tip pantof (am constr privat)
        Pantof pantof1 = Pantof.builder(TipPantof.tenisi, 36, 5, "piele intoarsa").build();
        //Pantof pantof2 = Pantof.builder(TipPantof.tenisi, 50, 5, "piele intoarsa").build();
        Pantof pantof3 = Pantof.builder(TipPantof.tenisi, 36, 5, "piele intoarsa").adaugaMesaje("ABC").adaugaMesaje("BC").build();
        try {
            String mesaj ="";
            for(int i=0;i<100;i++){
                mesaj+="A";
            }
            Pantof pantof4 = Pantof.builder(TipPantof.tenisi, 36, 5, "piele intoarsa").adaugaMesaje(mesaj).build();
            System.out.println(pantof4.toString());
        }catch (RuntimeException e) {
            System.out.println("Pantoful nu s-a creat!");
            System.out.println("Eroare: " + e.getMessage());
        }


        System.out.println(pantof1.toString());
        //System.out.println(pantof2.toString());
        System.out.println(pantof3.toString());

    }
}