package cts.g1090.s06.factory.implementare;

public class BauturiFactory {
    public static Bautura getBautura(TipBautura tipBautura, String nume, int volum, double pret){
        switch(tipBautura){
            case CAFEA: return new Cafea(nume, volum, pret);
            case CIOCOLATA_CALDA: return new CiocolataCalda(nume, volum, pret, false);
            default: return null;
        }
    }
}
