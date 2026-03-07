package cts.g1094.s03.implementare.taxare;

import java.util.HashMap;
import java.util.Map;

public class FactoryTaxare {
    private static Map<String, ITaxe>mapa;

    static {
        mapa = new HashMap<>();
        mapa.put("1111", new TaxePreferentiale());
        mapa.put("2222", new TaxeNormale());
        mapa.put("3333", new TaxeNormale());
    }

    public static ITaxe getTaxareDupaCOR(String COR){
        return mapa.getOrDefault(COR, new TaxeNormale());
    }
}
