package cts.erculescu.rares.g1089.strategy.implementare;

public class StrategiePlataCash implements IPlata{

    @Override
    public void modalitatePlata(double totalPlata) {
        System.out.println("---S-a ales modalitatea de plata cu numerar---");
        System.out.println("    S-au platit "+totalPlata+" lei.");
    }
}
