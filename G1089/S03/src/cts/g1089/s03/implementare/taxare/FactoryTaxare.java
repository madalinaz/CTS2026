package cts.g1089.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class FactoryTaxare {
    private static Map<String,ITaxare> mapa = new HashMap<>();
    static{
        mapa.put("1111",new TaxarePreferentiala());
        mapa.put("2222",new TaxareNormala());
        mapa.put("2226",new TaxareNormala());
        mapa.put("2227",new TaxareNormala());
    }
    public static ITaxare getTaxareDupaCOR(String COR){
        return mapa.getOrDefault(COR,new TaxareNormala());
    }
}
