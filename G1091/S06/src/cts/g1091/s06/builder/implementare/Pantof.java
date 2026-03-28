package cts.g1091.s06.builder.implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private TipPantof tip;
    private int marime;
    private double dimensiuneToc;
    private String materialBaza;
    private String materialSecundar;
    private List<String> mesaje;
    //private static PantofBuilder builder;

    //OBLIGATORIU - CONSTRUCTOR PRIVAT
    private Pantof(TipPantof tip, int marime, double dimensiuneToc, String materialBaza, String materialSecundar, List<String> mesaje) {
        this.tip = tip;
        this.marime = marime;
        this.dimensiuneToc = dimensiuneToc;
        this.materialBaza = materialBaza;
        this.materialSecundar = materialSecundar;
        this.mesaje = mesaje;
    }

    public static IBuilder getBuilder(TipPantof tip, int marime, double dimensiuneToc, String materialBaza){
        return new PantofBuilder(tip, marime, dimensiuneToc, materialBaza);
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tip=" + tip +
                ", marime=" + marime +
                ", dimensiuneToc=" + dimensiuneToc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialSecundar='" + materialSecundar + '\'' +
                ", mesaje=" + mesaje +
                '}';
    }

    private static class PantofBuilder implements IBuilder {
        private TipPantof tip;
        private int marime;
        private double dimensiuneToc;
        private String materialBaza;
        private String materialSecundar;
        private List<String> mesaje;

        //zona obligatorie => constructor
        private PantofBuilder(TipPantof tip, int marime, double dimensiuneToc, String materialBaza) {
            this.tip = tip;
            this.marime = marime;
            this.dimensiuneToc = dimensiuneToc;
            this.materialBaza = materialBaza;
        }

        //zona optionala =>setter

        @Override
        public IBuilder setMaterialSecundar(String materialSecundar) {
            this.materialSecundar = materialSecundar;
            return this;
        }

        @Override
        public IBuilder addMesaj(String mesaj) {
            if  (mesaje == null) {
                mesaje = new ArrayList<>();
            }
            this.mesaje.add(mesaj);
            return this;
        }

        @Override
        public Pantof build() {
            if(this.marime < 35 || this.marime > 45) {
                throw new RuntimeException("Marime invalida");
            }
            if(this.dimensiuneToc < 0.5 || this.dimensiuneToc > 12.5) {
                throw new RuntimeException("Dimensiune invalida");
            }

            Pantof pantof = new Pantof(tip, marime,  dimensiuneToc,  materialBaza,materialSecundar, mesaje);
            this.materialSecundar = null;
            this.mesaje = null;
            return pantof;
        }
    }
}
