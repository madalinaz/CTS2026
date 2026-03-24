package cts.rosoiu.anca.g1094.implementare;

import java.util.ArrayList;
import java.util.List;

public class Pantof {
    private TipPantof tip; //tenisi
    private int marime; //39
    private int dimensiuneToc;
    private String materialBaza;
    private String materialSecundar; //optionale
    private List<String> mesaje;

    //decidem cum e constr dupa ce facem builder - decidem ca e bine aici sa fie constr cu toti param
    private Pantof(TipPantof tip, int marime, int dimensiuneToc, String materialBaza, String materialSecundar, List<String> mesaje) {
        this.tip = tip;
        this.marime = marime;
        this.dimensiuneToc = dimensiuneToc;
        this.materialBaza = materialBaza;
        this.materialSecundar = materialSecundar;
        this.mesaje = mesaje;
    }

    //avem metoda public cu rol de getter - builder care intoarce PantofBuilder si are toata zona oblig pe care o trim mai dep
    public static PantofBuilder builder(TipPantof tip, int marime, int dimensiuneToc, String materialBaza){
        return new PantofBuilder( tip,marime,dimensiuneToc,materialBaza);
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

    public static class PantofBuilder implements IBuilder {
        private TipPantof tip; //tenisi
        private int marime; //39
        private int dimensiuneToc;
        private String materialBaza;
        private String materialSecundar; //optionale
        private List<String> mesaje;

        //constr pt builder - doar pe cele obligatorii
        PantofBuilder(TipPantof tip, int marime, int dimensiuneToc, String materialBaza){
            this.tip=tip;
            this.marime=marime;
            this.dimensiuneToc=dimensiuneToc;
            this.materialBaza=materialBaza;
        }

        //setteri pt zona optionala
        public PantofBuilder setMaterialSecundar(String materialSecundar) {
            this.materialSecundar = materialSecundar; //generat cu setter template builder
            return this; //intoarce builder
        }

        //setter pt lista mesaje, dar adaugam cate 1 pe rand
        public PantofBuilder adaugaMesaje(String mesaj){
            if(this.mesaje==null){
                this.mesaje = new ArrayList<>(); //alocam doar la nevoie
            }
            this.mesaje.add(mesaj);
            return this;
        }

        @Override
        public Pantof build() {
            //de adaugat toate restrictiile mentionate in cerinta
            if(this.marime <35 || this.marime >45){
                throw new RuntimeException("Dimensiunea nu este valida!!");
            }

            if(this.dimensiuneToc <0.5 || this.dimensiuneToc >12.5){
                throw new RuntimeException("Dimensiunea tocului nu e permisa");
            }

            if(this.mesaje!=null){
                int total = 0;
                for(int i=0;i<mesaje.size();i++){
                    total+=mesaje.get(i).length();
                }

                if(total > this.marime){
                    throw new RuntimeException("Mesaje prea lungi");
                }
            }
            return new Pantof(tip, marime, dimensiuneToc, materialBaza,materialSecundar,mesaje);
        }
    }

}
