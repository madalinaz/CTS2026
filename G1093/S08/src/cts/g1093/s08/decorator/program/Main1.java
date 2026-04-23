import cts.g1093.s08.decorator.implementare.Comanda;
import cts.g1093.s08.decorator.implementare.IComanda;
import cts.g1093.s08.decorator.implementare.decorare.DecoratorMartie;

public static void main(String[] args) {
    IComanda comanda=new DecoratorMartie(new Comanda(1), true) ;
    comanda.addProdus(1);
    comanda.addProdus(2);
    comanda.addProdus(4);
    comanda.inchideComanda();
    comanda.printeazaBon();
    System.out.println("Total comanda: "+comanda.getTotal());

    //DE PROPUS MODIFICARE PE CODUL EXISTENT ASTFEL INCAT IN METODA DE PRINTARE SA SE APLICE REDUCEREA DE 10%
    //PRECUM SE APLICA IN METODA getTotal()


}