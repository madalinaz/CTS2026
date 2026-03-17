package cts.g1094.s05.prototype.program;

import cts.g1094.s05.prototype.implementare.Contract;
import cts.g1094.s05.prototype.implementare.IContract;
import cts.g1094.s05.prototype.implementare.PrototypeFactoryContract;

public class Main {
    public static void main(String[] args) {
        //cu Prototype, dar fara Factory
        IContract c1 = new Contract();
        IContract c2 = null;
        c2 = c1.getCopie();


        c2.setNrPersoane(20);
        c2.setListaClauze("O alta lista");
        System.out.println(c1);
        System.out.println(c2);

        //utilizare Prototype folosind Factory
        try {
            IContract cc1 = PrototypeFactoryContract.getPrototip("Botez");
            IContract cc2 = PrototypeFactoryContract.getPrototip("Botez");
            IContract cc3 = PrototypeFactoryContract.getPrototip("Botez");
            IContract cc4 = PrototypeFactoryContract.getPrototip("Botez");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(PrototypeFactoryContract.nrPrototipuri);
        System.out.println(PrototypeFactoryContract.nrObiecte);
    }
}
