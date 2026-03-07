package cts.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

//clasa stil orchestraror

public class FactoryTaxare {
    private static Map<String, ITaxare> mapa =new HashMap<>();

    static{
        mapa.put("111", new TaxarePreferentiala());
        mapa.put("222", new TaxareNormala());
        mapa.put("554", new TaxareNormala());
    }

    public static ITaxare getTaxareDupaCOR(String COR){
        return mapa.getOrDefault(COR, new TaxareNormala());
    }

}
