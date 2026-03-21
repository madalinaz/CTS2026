package cts.g1092.s05.prototype2.program;

import cts.g1092.s05.prototype2.implementare.AbstractClass;
import cts.g1092.s05.prototype2.implementare.CrocsPrototypeFactory;

public class Main {
    public static void main(String[] args){
        //de afisat cate obiecte + cati constructori s au folosit - ex - Disney - constructori / copii

        AbstractClass disney1 = CrocsPrototypeFactory.getPrototip("Disney");
        AbstractClass disney2 = CrocsPrototypeFactory.getPrototip("Disney");
        AbstractClass disney3 = CrocsPrototypeFactory.getPrototip("Disney");

        AbstractClass mare1 = CrocsPrototypeFactory.getPrototip("LaMare");

        AbstractClass masini1 = CrocsPrototypeFactory.getPrototip("Masini");
        AbstractClass masini2 = CrocsPrototypeFactory.getPrototip("Masini");

        CrocsPrototypeFactory.afisareStatistici();
    }
}
