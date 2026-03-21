package cts.g1092.s05.prototype2.implementare;

import java.util.ArrayList;

public class CrocsMasini extends AbstractClass{
    CrocsMasini(){
        System.out.println("api masina");
        this.accesorii=new ArrayList<>();
        accesorii.add("Bujie");
        accesorii.add("Bradut");
        accesorii.add("Roata");
    }
}
