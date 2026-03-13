package cts.g1091.s04.implementare;

public class Ospatar {
    private String denumire;

    public Ospatar(String denumire) {
        this.denumire = denumire;
    }

    //layer de interactiune cu Clientii
    public void preluareClient(int id){
        System.out.println("Ospatar preluare Client");
        System.out.println("Ospatar verifica disponibilitate masa");
        Restaurant.getInstance().ocupareMasa(id);
    }

    public void afisareMese(){
        Restaurant.getInstance().afisareMese();
    }
}
