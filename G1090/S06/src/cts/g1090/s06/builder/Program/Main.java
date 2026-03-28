import cts.g1090.s06.builder.Implementare.Pantof;
import cts.g1090.s06.builder.Implementare.TipPantof;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Pantof p1 = Pantof.getBuilder(TipPantof.ADIDAS,40,5,"PieleNaturala").build();
    System.out.println(p1);
    Pantof p2 = Pantof.getBuilder(TipPantof.ADIDAS,40,5,"PieleNaturala").setMaterialSecundar("PieleDeCrocodil").build();
    System.out.println(p2);
    System.out.println(p1);
    //De modificat implementarea astfel incat setarile unui obiect sa nu afecteze alte obiecte

    Pantof.PantofBuilder builder = Pantof.getBuilder(TipPantof.ADIDAS,40,5,"PieleNaturala");
    Pantof p3 = builder.build();
    System.out.println(p3);

    Pantof p4 = builder.setMaterialSecundar("PieleDeStrut").addMesaj("ZCVS").build();
    System.out.println(p4);

    Pantof p5 = builder.addMesaj("ABCD").build();
    System.out.println(p5);
    System.out.println(p4);
    try {
        Pantof p6 = Pantof.getBuilder(TipPantof.ADIDAS, 40, 15, "PieleNaturala").build();
        System.out.println(p6);
    }catch(Exception e){
        System.out.println("Nu respecta restrictiile, obiectul nu s-a creat");
        System.out.println("Motiv "+e.getMessage());
    }


    }
