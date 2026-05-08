package cts.g1092.s10.observer.implementare;

import java.util.HashMap;
import java.util.Map;

public class ServiciuMeteo extends AObservabil{
    private String oras;
    private float temperatura;

    public ServiciuMeteo(String denumireServiciu, String oras) {
        super(denumireServiciu);
        this.oras = oras;
    }

    public void setTemperatura(float temperatura) {
       if(temperatura != this.temperatura){
           this.temperatura=temperatura;
           String mesaj = "S-a inregistrat o noua temperatura de "+ this.temperatura + " in "+ this.oras;
           this.notificareObservatori(mesaj);
       }
    }
}
