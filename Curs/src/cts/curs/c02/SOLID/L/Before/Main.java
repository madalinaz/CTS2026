package cts.curs.c02.SOLID.L.Before;

public class Main {

    public static void calculArie(Dreptunghi d) {
        d.setLatime(2);
        d.setLungime(3);

        if (d.getArie() == 6)
            System.out.println("Aria dreptunghiului este 6");
        else {
            System.out.println("Aria nu este corect calculata! Este " + d.getArie() + " in loc de 6");
            System.out.println("Lungimea este " + d.getLungime());
            System.out.println("Latimea este " + d.getLatime());
        }
    }

    public static void main(String[] args) {
        System.out.println("Evaluare calcul arie dreptunghi...........");
        calculArie(new Dreptunghi());
        System.out.println("Evaluare calcul arie patrat...........");
        calculArie(new Patrat());
    }
}
