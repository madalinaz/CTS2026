package cts.g1090.s06.builder.Implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private  TipPantof tipPantof;
    private int nrPantof;
    private double marimeToc;
    private String materialBaza;
    private String materialSecundar;
    private List<String> mesaje;

    //MUST - Constructor privat
    private Pantof(TipPantof tipPantof, int nrPantof, double marimeToc, String materialBaza, String materialSecundar, List<String> mesaje) {
        this.tipPantof = tipPantof;
        this.nrPantof = nrPantof;
        this.marimeToc = marimeToc;
        this.materialBaza = materialBaza;
        this.materialSecundar = materialSecundar;
        this.mesaje = mesaje;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", nrPantof=" + nrPantof +
                ", marimeToc=" + marimeToc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialSecundar='" + materialSecundar + '\'' +
                ", mesaje=" + mesaje +
                '}';
    }

    public static PantofBuilder getBuilder(TipPantof tipPantof, int nrPantof, double marimeToc, String materialBaza){
        return new PantofBuilder(tipPantof,nrPantof,marimeToc,materialBaza);
    }

    //daca se cere in subiect ca creearea obiectului sa se faca doar pe o singura linie, clasa PantofBuilder trebuie sa fie private
    public static class PantofBuilder implements IBuilder {
        private  TipPantof tipPantof;
        private int nrPantof;
        private double marimeToc;
        private String materialBaza;
        private String materialSecundar;
        private List<String> mesaje;

        //zona obligatorie
        private PantofBuilder(TipPantof tipPantof, int nrPantof, double marimeToc, String materialBaza) {
            this.tipPantof = tipPantof;
            this.nrPantof = nrPantof;
            this.marimeToc = marimeToc;
            this.materialBaza = materialBaza;
        }

        //zona optionala -> setteri
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
            if(marimeToc<0.5 || marimeToc>12.5){
                throw new RuntimeException("Tocul nu este corect");
            }
            if(nrPantof<35 || nrPantof>45){
                throw new RuntimeException("Marimea este invalida");
            }
            Pantof pantofRezultat = new Pantof(tipPantof,nrPantof,marimeToc,materialBaza,materialSecundar,mesaje);

            this.mesaje = null;
            this.materialSecundar = null;
            return pantofRezultat;
        }
    }
}
