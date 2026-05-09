package cts.curs.c08.flyweight.implementare;

import java.util.HashMap;
import java.util.Map;

public class MesajPrintareFactory {
    private static Map<String, IPrintare> colectieMesaje = new HashMap<String, IPrintare>();

    //versiune EAGER INIT
    static {
        colectieMesaje.put("TIP1", new MesajPrintare("TIP1"));
        colectieMesaje.put("TIP2", new MesajPrintare("TIP2"));
        colectieMesaje.put("TIP3", new MesajPrintare("TIP3"));
    }

    //propun o implementare de tip LATE INIT (in care populez mapa cu obiecte atunci cand ele sunt folosite pentru prima oara
    public static IPrintare getMesaj(String tipMesaj) {
        IPrintare mesaj = colectieMesaje.get(tipMesaj);
        if(mesaj == null) {
            //este utilizat pentru prima oara
            mesaj = new MesajPrintare(tipMesaj);
            colectieMesaje.put(tipMesaj, mesaj);
        }
        return mesaj;
    }
}
