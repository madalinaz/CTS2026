package cts.g1094.s05.prototype.implementare;

public interface IContract{
    String getListaClauze();
    int getNrPersoane();
    double getProcentPenalizare();
    void setNrPersoane(int nrPersoane);
    void setListaClauze(String listaClauze);
    IContract getCopie();
}
