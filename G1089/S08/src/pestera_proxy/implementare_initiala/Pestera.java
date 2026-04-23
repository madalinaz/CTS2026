package pestera_proxy.implementare_initiala;

import java.util.List;

public class Pestera implements IPestera{
    //List<String> vizitatori;
    @Override
    public void viziteaza(String persoana,boolean areTichet) {
        if(verificareTichet(persoana,areTichet)){
            System.out.println(persoana+"viziteaza");
            //vizitatori.add(persoana);
        }else{
            System.out.println(persoana+"nu are bilet");
        }
    }

    @Override
    public boolean verificareTichet(String vizitator, boolean areTichet) {
        System.out.println("se verifica existenta tichet");
        return areTichet;
    }
}
