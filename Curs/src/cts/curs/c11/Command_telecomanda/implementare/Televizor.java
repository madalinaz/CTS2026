package cts.curs.c11.Command_telecomanda.implementare;

public class Televizor {
    private String model;
    private String camera;

    public Televizor(String model, String camera) {
        this.model = model;
        this.camera = camera;
    }

    public void deschideTV(){
        System.out.println("S-a deschis TV-ul");
    }

    public void inchideTV(){
        System.out.println("S-a inchis TV-ul");
    }
}
