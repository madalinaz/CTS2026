package cts.g1092.builder.implementare;

import java.util.ArrayList;
import java.util.List;

// versiune 4, inner class + builder contine campuri obj(late init)
// obligatoriu membrii privati!! altfel degeaba
public class Pantof {
    private TipPantof tipPantof;
    private String materialBaza;
    private int nrPantof;
    private double dimensiuneToc;
    private String materialSecundar;
    private List<String> mesaje;

    // neaparat ct private
    private Pantof(TipPantof tipPantof, String materialBaza, int nrPantof, double dimensiuneToc, String materialSecundar, List<String> mesaje) {
        this.tipPantof = tipPantof;
        this.materialBaza = materialBaza;
        this.nrPantof = nrPantof;
        this.dimensiuneToc = dimensiuneToc;
        this.materialSecundar = materialSecundar;
        this.mesaje = mesaje;
    }

    @Override
    public String toString() {
        return "Pantof{" +
                "tipPantof=" + tipPantof +
                ", materialBaza='" + materialBaza + '\'' +
                ", nrPantof=" + nrPantof +
                ", dimensiuneToc=" + dimensiuneToc +
                ", materialSecundar='" + materialSecundar + '\'' +
                ", mesaje=" + mesaje +
                '}';
    }

    // aceasta meth obligatoriu trebuie sa fie statica!!
    public static PantofiBuilder getBuilder(TipPantof tipPantof, String materialBaza, int nrPantof, double dimensiuneToc){
        return new PantofiBuilder(tipPantof, materialBaza, nrPantof, dimensiuneToc);
    }
    public static class PantofiBuilder implements IBuilder{
        private TipPantof tipPantof;
        private String materialBaza;
        private int nrPantof;
        private double dimensiuneToc;
        private String materialSecundar;
        private List<String> mesaje;

        // primeste zona OBLIGATORIE!
        private PantofiBuilder(TipPantof tipPantof, String materialBaza, int nrPantof, double dimensiuneToc) {
            this.tipPantof = tipPantof;
            this.materialBaza = materialBaza;
            this.nrPantof = nrPantof;
            this.dimensiuneToc = dimensiuneToc;
        }

        // urmeaza setters pt zona OPTIONALA, alegem la template Builder ca sa ni-l returneze in formatul in care avem nevoie
        public PantofiBuilder setMaterialSecundar(String materialSecundar) {
            this.materialSecundar = materialSecundar;
            return this;
        }

        public PantofiBuilder addMesaj(String mesaj){
            if(this.mesaje == null){
                this.mesaje = new ArrayList<>();
            }
            this.mesaje.add(mesaj);
            return this;
        }

        @Override
        public Pantof build() {
            // aici se pot introduce toate restrictiile + validari
            // trimitem campuri aici pt ca acel ct sa imi genereze pantoful
            // daca build nu arunca exceptii in interfata atunci aici obligatoriu exceptii runtime!

            if(nrPantof < 35 || nrPantof > 45){
                throw new RuntimeException("Nr pantof gresit!");
            }
            if(dimensiuneToc < 0.5 || dimensiuneToc > 12.5){
                throw new RuntimeException("Dimensiune toc gresita!");
            }
            if(this.mesaje != null) {
                int suma = 0;
                for (String mesaj : this.mesaje) {
                    suma += mesaj.length();
                }
                if (suma > nrPantof) {
                    throw new RuntimeException("Prea multe mesaje sau Mesajul este prea lung!");
                }
            }

            return new Pantof(tipPantof, materialBaza, nrPantof, dimensiuneToc, materialSecundar, mesaje);
        }
    }

}
