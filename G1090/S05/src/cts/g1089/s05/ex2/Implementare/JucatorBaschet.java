package cts.g1089.s05.ex2.Implementare;

import java.util.ArrayList;

public class JucatorBaschet extends AbstractJucator {
    JucatorBaschet() {
        super();
        System.out.println("Surse externe set antrenament bascket");
        this.setAntrenamente=new ArrayList<>();
        this.setAntrenamente.add(new Antrenament("sarituri",100));
        this.setAntrenamente.add(new Antrenament("flotari",50));
    }

}
