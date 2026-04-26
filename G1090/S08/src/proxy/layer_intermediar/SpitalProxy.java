package proxy.layer_intermediar;

import proxy.implementare_initiala.ISpital;

import java.util.HashMap;
import java.util.Map;

public class SpitalProxy implements ISpital{

    private ISpital spital;
    private Map<String, String> mapa = new HashMap<>();


    public SpitalProxy(ISpital spital) {
        this.spital = spital;

    }




    @Override
    public void vizita(String vizitator, String pacient, int oraVizita) {

        if(!verificsaOraVizita(oraVizita)){
            System.out.println("Vizitator " + vizitator + " nu a venit cand trebuie");
        }
        else if(mapa.containsKey(pacient)){
            System.out.println("Pacientul a mai fost vizitat de " + mapa.get(pacient));

        }
        else{
            mapa.put(pacient, vizitator);
            spital.vizita(vizitator, pacient, oraVizita);
        }

    }
    //cum putem sa nu verificam de 2 ori ora de vizita?


    @Override
    public boolean verificsaOraVizita(int oraVizita) {
        return spital.verificsaOraVizita(oraVizita);
    }
}
