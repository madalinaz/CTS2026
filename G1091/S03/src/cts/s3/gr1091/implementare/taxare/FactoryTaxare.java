package cts.s3.gr1091.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class FactoryTaxare {
    //logica COR -> ce taxare

    private static Map<String, ITaxare> mapa;
    static {
        //daca se doreste se poate face citire din fisier
        mapa = new HashMap<String, ITaxare>();
        ITaxare taxareP = new TaxarePreferentiala();
        ITaxare taxareN = new TaxareNormala();
        mapa.put("1111", taxareP);
        mapa.put("2222", taxareN);
        mapa.put("3333", taxareN);
        mapa.put("4444", taxareN);
    }


    public static ITaxare getTaxareDupaCor(String COR){
        return mapa.getOrDefault(COR, new TaxareNormala());
    }
}
