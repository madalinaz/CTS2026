package cts.g1089.s05.ex2.Implementare;

import java.util.ArrayList;

public class JucatorFotbal extends AbstractJucator{
    JucatorFotbal() {
        System.out.println("Surse externe set antrenament fotbal");
        this.setAntrenamente=new ArrayList<>();
        this.setAntrenamente.add(new Antrenament("alergari",100));
        this.setAntrenamente.add(new Antrenament("fandari",50));
    }
}
