package cts.curs.c09.chain_of_responsability.implementare;

public class BucatarSef extends AHandler{
    @Override
    public void procesareComanda(Comanda comanda) {
        if(comanda.getGrad()>20){
            System.out.println("Bucatar sef a facut....");
        } else{
            System.out.println("Bucatar sef nu face ciorba de cartofi");
        }
    }
}
