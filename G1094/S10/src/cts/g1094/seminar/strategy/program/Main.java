package cts.g1094.seminar.strategy.program;

import cts.g1094.seminar.strategy.implementare.Bon;
import cts.g1094.seminar.strategy.implementare.PlataCard;

public class Main {
    public static void main(String[] args) {
        Bon bon = new Bon(100f);
        bon.setStrategie(new PlataCard());
        bon.inchidereBon();
    }
}