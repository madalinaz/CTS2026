package cts.g1091.s06.builder.program;

import cts.g1091.s06.builder.implementare.IBuilder;
import cts.g1091.s06.builder.implementare.Pantof;
import cts.g1091.s06.builder.implementare.TipPantof;

public class Main {
    public static void main(String[] args) {

        Pantof pantof1 = Pantof.getBuilder(TipPantof.BALERINI, 37,4.5,"Piele").build();
        System.out.println(pantof1);

        Pantof pantof2 = Pantof.getBuilder(TipPantof.BALERINI, 37,4.5,"Piele")
                .setMaterialSecundar("Piele de crocodil")
                .build();
        System.out.println(pantof2);
        Pantof pantof3 = Pantof.getBuilder(TipPantof.BALERINI, 37,4.5,"Piele")
                .addMesaj("ABC")
                .build();
        System.out.println(pantof3);

        // CONSTRUIREA UNUI OBIECT POATE AFECTA PE ALTELE?
        //Pantof.PantofBuilder builder = new Pantof.PantofBuilder(TipPantof.BALERINI, 37,4.5,"Piele");
        IBuilder builder = Pantof.getBuilder(TipPantof.BALERINI, 37,4.5,"Piele");
        Pantof pantof4 = builder.build();

        System.out.println(pantof4);

        Pantof pantof5 = builder.setMaterialSecundar("Piele de strut").build();
        System.out.println(pantof5);

        Pantof pantof6 = builder.addMesaj("ABC").build();
        System.out.println(pantof6);
        // DE PROPUS IMPLEMENTARE ASTFEL INCAT CREAREA OBIECTULUI SA SE REALIZEZE DOAR FOLOSIND 1 LINIE


        try {
            Pantof pantof7 = Pantof.getBuilder(TipPantof.BALERINI, 20, 4.5, "Piele").build();
            System.out.println(pantof7);
        }
        catch(Exception e) {
            System.out.println("Comanda nu este realizata, date gresite. ");
            System.out.println("Motiv " + e.getMessage());
        }
    }
}
