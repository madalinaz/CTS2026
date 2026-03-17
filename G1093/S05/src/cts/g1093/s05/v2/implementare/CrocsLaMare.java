package cts.g1093.s05.v2.implementare;

public class CrocsLaMare extends Crocs{
     CrocsLaMare() {
        super("culoare",37);
        //se preia din exterior lista de accesorii in functie de topic (plaja)
        this.adaugaAccesoriu("Soare");
        this.adaugaAccesoriu("Umbrela");
        this.adaugaAccesoriu("Scoica");
        this.adaugaAccesoriu("Steluta");

    }
}
