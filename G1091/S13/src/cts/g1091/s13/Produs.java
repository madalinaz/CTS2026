package cts.g1091.s13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Produs {
    private String denumire;
    private int cantitate;
    private List<Integer> listaPreturi;

    public Produs(String denumire) {
        if(denumire.length() >= 2 && denumire.length() <= 100){
            this.denumire = denumire;
        }
        else{
            throw new ExceptieDenumire();
        }

        this.cantitate = 0;
        this.listaPreturi = null;
    }


    public int getCantitate() {
        return cantitate;
    }


    public List<Integer> getListaPreturi() {
        return listaPreturi;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void modificarePret(int pret) throws ExceptieIstoric, ExceptiePret {
        if (pret <= 0) {
            throw new ExceptiePret();
        }

        if (this.listaPreturi == null) {
            this.listaPreturi = new ArrayList<>();
        } else {
            if (!this.listaPreturi.isEmpty() && pret == this.listaPreturi.get(this.listaPreturi.size() - 1)) {
                throw new ExceptieIstoric();
            }
        }
        this.listaPreturi.add(pret);
    }


}
