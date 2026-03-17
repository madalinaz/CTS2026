package cts.g1094.s05.prototype.implementare;

public class Contract implements IContract {
    private String listaClauze;
    private int nrPersoane;
    private double procentPenalizare;

    public Contract() {
        //lista clauze se incarca din ext
        //aici procesul este CONSUMATOR de TIMP
        System.out.println("SE INTERACTIONEAZA CU SURSE EXTERNE. PROCES CONSUMATOR.....");
        this.listaClauze = "Clauza1, Clauza2, Clauza3";
        this.nrPersoane = 0;
        this.procentPenalizare = 0.10;
    }

    private Contract(String listaCauze, int nrPersoane, double procentPenalizare) {
        this.listaClauze = listaCauze;
        this.nrPersoane = nrPersoane;
        this.procentPenalizare  = procentPenalizare;
    }

    @Override
    public String getListaClauze() {
        return listaClauze;
    }

    @Override
    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public double getProcentPenalizare() {
        //aici poate fi implem regula de calcul procent
        return procentPenalizare;
    }

    @Override
    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void setListaClauze(String listaClauze) {
        this.listaClauze = listaClauze;
    }

    @Override
    public IContract getCopie() {
        Contract copie = new Contract(this.listaClauze,this.nrPersoane,this.procentPenalizare);
        return copie;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "listaClauze='" + listaClauze + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", procentPenalizare=" + procentPenalizare +
                '}';
    }
}
