package cts.s10.observer.implementare;

public class ServiciuPolitiaRomana extends AObservabil{

    public ServiciuPolitiaRomana(String denumireServiciu) {
        super(denumireServiciu);
    }

    public void adaugareCaz(String mesaj, int nivel){
        if(nivel>5){
            this.notificareObservatori(mesaj);
        }
        else{
            System.out.println("S-a declansat cazul: " + mesaj + " dar este caz minor");
        }
    }
}
