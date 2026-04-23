package pestera_proxy.main;

import pestera_proxy.implementare_initiala.IPestera;
import pestera_proxy.implementare_initiala.Pestera;
import pestera_proxy.implementare_proxy.PesteraProxy;

public class Main {
    public static void main(String[] args) {
        //Vizita in Pestera este permisa doar daca vizitatorul are un tichet.
        //Dupa o perioada, s-a dorit etapizarea intrarii in pestera. Astfel, se formeaza o lista de asteptare si
        //cand se strang 5 persoane, atunci toate persoanele sunt lasate sa intre.
        //Proxy este cel care gestioneaza acea Lista de asteptare si apoi trimite catre obiectul real (Pestera)
        //sa gestioneze vizitarea
        IPestera p=new PesteraProxy(new Pestera());

        p.viziteaza("Gigel1",true);
        p.viziteaza("Gigel2",true);
        p.viziteaza("Gigel3",true);
        p.viziteaza("Gigel4",true);
        p.viziteaza("Gigel5",true);
        p.viziteaza("Gigel6",true);
        p.viziteaza("Gigel7",true);
        p.viziteaza("Gigel8",true);
        p.viziteaza("Gigel9",false);





        //dupa un timp au aparut restricitii
        //aplicam un proxy peste pestera
        //IPestera pesteraProxy=new PesteraProxy(p);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
//        pesteraProxy.viziteaza("gigel",true);
    }
}