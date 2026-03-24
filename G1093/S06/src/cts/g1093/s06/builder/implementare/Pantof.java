package cts.g1093.s06.builder.implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private ETip tip;
    private int marime;
    private int dimensiuneToc;
    private String materialBaza;
    private String materialSecundar;
    private List<String> mesaje;

    //obligatoriu private!!!
    private Pantof(ETip tip, int marime, int dimensiuneToc, String materialBaza, String materialSecundar, List<String> mesaje) {
        this.tip = tip;
        this.marime = marime;
        this.dimensiuneToc = dimensiuneToc;
        this.materialBaza = materialBaza;
        this.materialSecundar = materialSecundar;
        this.mesaje = mesaje;
    }

    public static PantofBuilder getBuilder(ETip tip, int marime, int dimensiuneToc, String materialBaza){  //meth de legatura intre clase
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

    public static class PantofBuilder implements IBuilder{
        private ETip tip;
        private int marime;
        private int dimensiuneToc;
        private String materialBaza;
        private String materialSecundar;
        private List<String> mesaje;

        //trimitem zona obligatorie
        public PantofBuilder(ETip tip, int marime, int dimensiuneToc, String materialBaza) {
            this.tip = tip;
            this.marime = marime;
            this.dimensiuneToc = dimensiuneToc;
            this.materialBaza = materialBaza;
        }

        //tratam zona optionala
        public PantofBuilder setMaterialSecundar(String materialSecundar) {
            this.materialSecundar = materialSecundar;
            return this;
        }

        public PantofBuilder addMesaj(String mesaj){
            if(this.mesaje==null){
                this.mesaje=new ArrayList<>();
            }
            this.mesaje.add(mesaj);
            return this;
        }

        @Override
        public Pantof build() {
            //aici bagam toate validarile
            if(this.marime<35||this.marime>45){
                throw new IllegalArgumentException("Marime invalida");
            }
            if(this.dimensiuneToc<0.5||this.dimensiuneToc>12.5){
                throw new IllegalArgumentException("Dimensiune invalida");
            }
            if(this.mesaje!=null){
                int sum=0;
                for(String mesaj: mesaje){
                    sum+=mesaj.length();
                }
                if(sum>this.marime){
                    throw new IllegalArgumentException("Prea multe caractere!");
                }
            }
            return new Pantof(tip, marime, dimensiuneToc, materialBaza, materialSecundar, mesaje);
        }
    }
}
