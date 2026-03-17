import cts.g1093.s05.v1.implementare.Crocs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Crocs c1 = new Crocs(39);
    System.out.println(c1);

    Crocs c2 = new Crocs(40);
    System.out.println(c2);

//    //Nu reutilizez marimile pt ca apelez constructorul
//    Crocs c3 = new Crocs(39);
//    System.out.println(c3);

    Crocs c3 = null;
    try {
        c3 = c1.clone();
    } catch (CloneNotSupportedException e) {
        throw new RuntimeException(e);
    }
    System.out.println(c3);
    c3.setAccesorii("Accesoriul modificat");
    c3.modificareLatime(10);
    System.out.println("Verificare:");
    System.out.println(c3);
    System.out.println(c1);




}
