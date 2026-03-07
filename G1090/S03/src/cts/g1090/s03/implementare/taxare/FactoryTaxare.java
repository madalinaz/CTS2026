package cts.g1090.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class FactoryTaxare {


    private static Map<String, ITaxare> mapa;

    static{
        mapa = new HashMap<String, ITaxare>();
        mapa.put("1111", new TaxarePreferentiala());
        mapa.put("2222", new TaxareNormala());
        mapa.put("3333", new TaxareNormala());
        mapa.put("4444", new TaxareNormala());
    }



    public static ITaxare getTaxareDupaCor(String COR){
        return mapa.getOrDefault(COR, new TaxareNormala());
    }
}
