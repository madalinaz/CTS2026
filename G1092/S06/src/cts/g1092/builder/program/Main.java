package cts.g1092.builder.program;

import cts.g1092.builder.implementare.Pantof;
import cts.g1092.builder.implementare.TipPantof;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pantof pantof1 = Pantof.getBuilder(TipPantof.BALERINI, "piele", 37, 4.5).build();
        System.out.println(pantof1);

        Pantof pantof2 = Pantof.getBuilder(TipPantof.BALERINI, "piele", 37, 4.5)
                .addMesaj("HALOOOOOO").addMesaj("mlemele")
                .setMaterialSecundar("canvas").build();
        System.out.println(pantof2);


        Pantof pantof3 = Pantof.getBuilder(TipPantof.BALERINI, "piele", 37, 4.5)
                .addMesaj("HALOOOOOO").addMesaj("mlemele")
                .build();
        System.out.println(pantof3);

        // logica ar fi sa apelam cu try/catch la fiecare pentru a prinde exceptiile si a le gestiona mai elegant
        // precum in ex de mai jos
        try {
            String mesaj = "";
            for(int i = 0; i< 40; i++){
                mesaj+="A";
            }

            Pantof pantof4 = Pantof.getBuilder(TipPantof.BALERINI, "piele", 37, 4.5)
                    .addMesaj(mesaj)
                    .build();
        }catch(RuntimeException ex){
            System.out.println("Pantoful nu s-a putut comanda"
                    + "\n" + "Motiv:" +
                    ex.getMessage());
        }

        Pantof.PantofiBuilder builder2 = Pantof.getBuilder(TipPantof.BALERINI, "piele", 37, 4.5);
        //Pantof.PantofiBuilder builder = new Pantof.PantofiBuilder(TipPantof.BALERINI, "piele", 37, 4.5);
        Pantof pantof5 = builder2.setMaterialSecundar("panza").build();
        System.out.println(pantof5);
        Pantof pantof6 = builder2.build();
        System.out.println(pantof6); //hoppaa a ramas cu ramasite cum rezolv sa fac sa eliminim situatia asta
    }
}

// de facut modif in implementare a.i. obj Pantof sa se creeze printr-o singura linie DOAR
//

