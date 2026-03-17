package cts.g1094.s05.simplefactory.implementare;

public class FactoryBautura {
    public static IBautura getBautura(tipBautura tipBautura,String denumire,int cantitate){
        switch (tipBautura){
            case CAPPUCCINO:
                return new Cappuccino(denumire,cantitate,null);

            case AMERICANO:
                return new CafeaAmericano(denumire,cantitate);
        }
        return null;
    }
}
