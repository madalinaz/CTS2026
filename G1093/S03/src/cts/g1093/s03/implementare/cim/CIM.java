package cts.g1093.s03.implementare.cim;

public class CIM {
    private String clauze;
    private String data;
    private static int generatorCod=1;
    private int codCim;
    //private Angajat angajat; -> de gandit
    private String cor;

    public CIM(String clauze, String data, String cor) {
        this.clauze = clauze;
        this.data = data;
        this.codCim = ++generatorCod;
        this.cor = cor;
    }

    public String getClauze() {
        return clauze;
    }

    public void setClauze(String clauze) {
        this.clauze = clauze;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static int getGeneratorCod() {
        return generatorCod;
    }

    public static void setGeneratorCod(int generatorCod) {
        CIM.generatorCod = generatorCod;
    }

    public int getCodCim() {
        return codCim;
    }

    public void setCodCim(int codCim) {
        this.codCim = codCim;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Cim{" +
                "clauze='" + clauze + '\'' +
                ", data='" + data + '\'' +
                ", codCim=" + codCim +
                ", cor='" + cor + '\'' +
                '}';
    }
}
