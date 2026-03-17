package cts.g1093.s05.v2.implementare;

public class CrocsDisney extends Crocs{
     CrocsDisney() {
        super("culoare",37);
        //se preia din exterior lista de accesorii in functie de topic (Disney)
        this.adaugaAccesoriu("Mickey Mouse");
        this.adaugaAccesoriu("Pluto");
        this.adaugaAccesoriu("Minnie");
        this.adaugaAccesoriu("Goofy");


    }


}
