package pestera_proxy.implementare_proxy;

import pestera_proxy.implementare_initiala.IPestera;

import java.util.ArrayList;
import java.util.List;

public class PesteraProxy implements IPestera {
    private IPestera pestera;
    private List<String> listaAsteptare=new ArrayList<>();


    public PesteraProxy(IPestera pestera) {
        this.pestera = pestera;
        this.listaAsteptare = new ArrayList<>();
    }

    @Override
    public void viziteaza(String persoana, boolean areTichet) {
        if(verificareTichet(persoana,areTichet)){
            listaAsteptare.add(persoana);
            System.out.println(persoana+" este in asteptare");
            if(listaAsteptare.size()==5){

                System.out.println("s a umplut lista ");
                for(String v:listaAsteptare){
                    pestera.viziteaza(v,true);
                    /// ///////!!!!!!!!!!!
                }
            }
        }
    }

    @Override
    public boolean verificareTichet(String vizitator, boolean areTichet) {
        return pestera.verificareTichet(vizitator,areTichet);
    }
}
