package cts.g1089.testare.implementare;

public class Masina {
    private String model;
    private double consumMediu;
    private int kilometraj;
    private double nivelRezervor;
    private double capacitateMaximaRezervor;

    public Masina(String model, double capacitateMaximaRezervor) {
        if(model.length()<3){
            throw new ExceptieModel("Modelul nu poate avea mai putin de 3 litere.");
        }
        this.model = model;
        if(capacitateMaximaRezervor<10||capacitateMaximaRezervor>100){
            throw new ExceptieRezervor("Capacitatea rezervorului este invalida!");
        }
        this.capacitateMaximaRezervor = capacitateMaximaRezervor;
        this.kilometraj=0;
        this.consumMediu=5;
        this.nivelRezervor=capacitateMaximaRezervor/2;
    }

    public String getModel() {
        return model;
    }

    public double getConsumMediu() {
        return consumMediu;
    }

    public int getKilometraj() {
        return kilometraj;
    }

    public double getNivelRezervor() {
        return nivelRezervor;
    }

    public double getCapacitateMaximaRezervor() {
        return capacitateMaximaRezervor;
    }

    public void alimenteazaRezervor(double cantitate) throws ExceptieAlimentare {
        if(cantitate+this.nivelRezervor>this.capacitateMaximaRezervor){
            throw new ExceptieAlimentare("Capacitatea rezervorului nu suporta cantitatea de combustibil pe care doresti sa o adaugi.");
        }else {
            System.out.println("Se alimenteaza cu "+cantitate+" litri combustibil...");
            this.nivelRezervor+=cantitate;
            System.out.println("S-a efectuat alimentarea! Nivel nou rezervor: "+this.nivelRezervor+" distanta maxima deplasare: "+(this.nivelRezervor/this.consumMediu)*100);
        }
    }

    public void deplasare(int distanta){
        if (nivelRezervor/consumMediu<distanta){
            throw new ExceptieRezervor("Nu aveti destul de mult combustibil pentru a va deplasa "+distanta);
        }

    }

}
