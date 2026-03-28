package cts.g1089.s06.builder.implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private int marime;
    private TipPantof tip;
    private double marimeToc;
    private String materialBaza;
    private String materialSecundar;
    private List<String> mesaje;

    // privat
    private Pantof(int marime, TipPantof tip, double marimeToc, String materialBaza, String materialSecundar, List<String> mesaje) {
        this.marime = marime;
        this.tip = tip;
        this.marimeToc = marimeToc;
        this.materialBaza = materialBaza;
        this.materialSecundar = materialSecundar;
        this.mesaje = mesaje;
    }

    public static PantofBuilder getBuilder(int marime, double marimeToc, String materialBaza, TipPantof tip){
        return new PantofBuilder(marime, marimeToc, materialBaza, tip);
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "marime=" + marime +
                ", tip=" + tip +
                ", marimeToc=" + marimeToc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialSecundar='" + materialSecundar + '\'' +
                ", mesaje=" + mesaje +
                '}';
    }

    public static class PantofBuilder implements IBuilder {
        private int marime;
        private TipPantof tip;
        private double marimeToc;
        private String materialBaza;
        private String materialSecundar;
        private List<String> mesaje;

        // Primeste zona obligatorie
        public PantofBuilder(int marime, double marimeToc, String materialBaza, TipPantof tip) {
            this.marime = marime;
            this.marimeToc = marimeToc;
            this.materialBaza = materialBaza;
            this.tip = tip;
        }

        // Zona optionala -> setteri
        public PantofBuilder setMaterialSecundar(String materialSecundar) {
            this.materialSecundar = materialSecundar;
            return this;
        }

        public PantofBuilder addMesaj(String mesaj) {
            if(this.mesaje == null) {
                this.mesaje = new ArrayList<>();
            }
            this.mesaje.add(mesaj);
            return this;
        }

        @Override
        public Pantof build() {
            if(marime < 35 || marime > 47){
                throw new RuntimeException("Marime gresita");
            }
            if(mesaje != null) {
                int totalCaractere = 0;
                for(String  mesaj : mesaje){
                    totalCaractere += mesaj.length();
                }
                if(totalCaractere > marime)
                {
                    throw new RuntimeException("Mesajele depasesc marimea pantofului");
                }
            }

            //return new Pantof(marime, tip, marimeToc, materialBaza, materialSecundar, mesaje);
            // De resetat macar zona optionala

            Pantof rezultat = new Pantof(marime, tip, marimeToc, materialBaza, materialSecundar, mesaje);
            this.materialSecundar = null;
            this.mesaje = null;
            return rezultat;
        }
    }
}
