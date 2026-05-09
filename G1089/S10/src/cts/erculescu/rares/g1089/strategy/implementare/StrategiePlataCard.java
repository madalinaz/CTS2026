package cts.erculescu.rares.g1089.strategy.implementare;

public class StrategiePlataCard implements IPlata{
    private double sumaDisponibilaCard;

    public StrategiePlataCard(double sumaDisponibilaCard) {
        this.sumaDisponibilaCard = sumaDisponibilaCard;
    }

    @Override
    public void modalitatePlata(double totalPlata) {
        if (sumaDisponibilaCard >= totalPlata) {
            System.out.println("---S-a ales modalitatea de plata cu numerar---");
            System.out.println("    S-au platit prin card " + totalPlata + " lei.");
        }else {
            throw new RuntimeException("Fonduri insuficiente!");
        }

    }
}
