import cts.g1093.s06.builder.implementare.ETip;
import cts.g1093.s06.builder.implementare.Pantof;


static void main(){
    Pantof pantof1=Pantof.getBuilder(ETip.BALERIN, 35, 1, "piele intoarsa").build();
    System.out.println(pantof1);

    Pantof pantof2=Pantof.getBuilder(ETip.BALERIN, 35, 1, "piele intoarsa").setMaterialSecundar("canvas").addMesaj("ABC").addMesaj("DEF").build();
    System.out.println(pantof2);

    try{
        String mesaj = "";
        for (int i = 0; i < 100; i++) {
            mesaj += 'A';
        }
        Pantof pantof3 = Pantof.getBuilder(ETip.BALERIN, 35, 1, "piele intoarsa").setMaterialSecundar("canvas").addMesaj(mesaj).build();
        System.out.println(pantof3);
    } catch (IllegalArgumentException e) {
        System.out.println("Mesaj eroare: "+e.getMessage());
        System.out.println("Obiectul nu s-a creat!");
    }
}
