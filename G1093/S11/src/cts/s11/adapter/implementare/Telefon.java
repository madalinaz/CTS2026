package cts.s11.adapter.implementare;

public class Telefon {
    private String model;
    private int nivelBaterie;

    public Telefon(String model, int nivelBaterie) {
        this.model = model;
        this.nivelBaterie = nivelBaterie;
    }

    public void chargeUSBc(IUSBcIncarcator incarcator){
        System.out.println("Se initiaza proces incarcare telefon...");
        incarcator.incarcarePrinUSBc();//nu detinem incarcatorul dar avem adapter care va arata ca el
    }

}
