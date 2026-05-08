package cts.g1092.s10.strategy.implementare;

// cls Obiect din diagrama
public class Client {
    private String nume;
    private ITehnicaPlata tehnicaPlata;

    // daca merg conform diagramei, nu am o tehnica initiala de plata
    // am setter-ul obligatoriu oricum, chiar daca as avea in ct. strategia ca param.
    public Client(String nume) {
        this.nume = nume;
    }

    public void setTehnicaPlata(ITehnicaPlata tehnicaPlata) {
        this.tehnicaPlata = tehnicaPlata;
    }

    public void inchideComanda(Comanda comanda){
        if(tehnicaPlata != null){
            // verificam faptul ca exista o strategie
            // rugam strategia sa ne ajute sa facem plata
            System.out.println("S-a initiat plata...");
            tehnicaPlata.plataComanda(comanda);
        }else{
            System.out.println("Nu avem strategie de plata selectata");
        }
    }


}
