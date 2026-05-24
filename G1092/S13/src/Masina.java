public class Masina {
    private String model;
    private int cc;
    private String taraOrigine;

    public Masina(String model, int cc, String taraOrigine) throws ExceptieCapacitateCilindrica {
        if(cc < 1000 || cc >=4000){
            throw new ExceptieCapacitateCilindrica();
        }
        this.model = model;
        this.cc = cc;
        this.taraOrigine = taraOrigine;
    }

    public String getModel() {
        return model;
    }

    public int getCc() {
        return cc;
    }

    public String getTaraOrigine() {
        return taraOrigine;
    }

    // definire specificatii pentru un camp la alegere
    // alegem un singur camp din cele 3 si o sa vreau sa completam constructorul a.i. sa imi creeze obj doar daca indeplineste niste specificatii

}
