package cts.junit.c14.mock;

import cts.junit.c14.exceptii.ExceptieIBAN;
import cts.junit.c14.exceptii.ExceptieMasina;

public class Autostrada {
    private IVreme vreme;
    private String oras;

    public boolean verificaDepasireVitezaMaxima
            (IMasina masina) throws Exception {
        if(masina==null){
            throw new ExceptieMasina("Masina este null");
        }
        return getVitezaMaxima() <
                masina.getViteza();
    }

    public void setVreme(IVreme vreme) {
        this.vreme = vreme;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    private int getVitezaMaxima(){
        if(vreme.estePloaie()){
            return 110;
        }
        if(vreme.getTemperatura(oras) <0){
            return 90;
        }
        return 130;
    }

}
