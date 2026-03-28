package cts.g1089.s06.Factory.Implementare;

public class BauturaFactory {
    public static IBautura getBautura(TipBautura tip, String nume, int volum, double pret) {
        switch (tip) {
            case CEAI: return new Ceai(nume, volum, pret);
            case CIOCOLATA_CALDA: return new CiocolataCalda(nume, volum, pret,"ciocolata neagra",false);
            default: return null;
        }
    }
}
