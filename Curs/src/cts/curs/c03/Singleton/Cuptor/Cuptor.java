package cts.curs.c03.Singleton.Cuptor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Cuptor {
    private static Cuptor instance = new Cuptor();
    private static Map<String, Cuptor> listaCuptoare;

    //singleton data NU este static
    private int gradeMax;
    private List<Preparat> listaAsteptare;

    private Cuptor() {
        listaAsteptare = new ArrayList<Preparat>();
    }

    public static Cuptor getInstance() {
        return instance;
    }

    //singleton operations
    public void addPreparat(Preparat p) {
        instance.listaAsteptare.add(p);
    }

    //scoate preparat
    //alte metode la decizie

    //de adaugat o metoda care imi asigneaza preparatul curent acelui cuptor cu timp minim de asteptare
}
