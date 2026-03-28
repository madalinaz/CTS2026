import cts.g1089.s06.builder.implementare.Pantof;
import cts.g1089.s06.builder.implementare.TipPantof;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pantof p1 = Pantof.getBuilder(47,0.52,"Piele intoarsa", TipPantof.MOCASINI).build();
    System.out.println(p1);
    Pantof p2 = Pantof.getBuilder(47,0.52,"Piele intoarsa", TipPantof.MOCASINI).setMaterialSecundar("Piele de crocodil").build();
    System.out.println(p2);

    // Sa se testeze contextul in care un obiect ar putea modifica campurile altui obiect
    Pantof p3 = Pantof.getBuilder(47,0.52,"Piele intoarsa", TipPantof.MOCASINI).addMesaj("Smecherie").build();
    System.out.println(p3);

    Pantof.PantofBuilder builder = new Pantof.PantofBuilder(42,0.17,"Panza", TipPantof.SLAPI);
    Pantof p4 = builder.build();
    Pantof p5 = builder.setMaterialSecundar("Piele de strut").build();
    Pantof p6 = builder.addMesaj("Salutare").build();

    System.out.println(p4);
    System.out.println(p5);
    System.out.println(p6);

    try {
        Pantof p7 = Pantof.getBuilder(90, 0.52, "Piele intoarsa", TipPantof.MOCASINI).build();
    } catch (RuntimeException e){
        System.out.println("Pantoful nu s-a creat");
        System.out.println(e.getMessage());
    }
}
