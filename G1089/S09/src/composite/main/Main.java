package composite.main;

import composite.implementare.Colet;
import composite.implementare.INod;
import composite.implementare.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod nodVapor=new NodStructura("vapor",500);
        INod container1=new NodStructura("container1",200);
        INod container2=new NodStructura("container2",200);



        nodVapor.add(container2);
        nodVapor.add(container1);

        container1.add(new Colet(true,10));
        container1.add(new Colet(false,20));

        container2.add(new Colet(false,20));

        System.out.println("detalii nod vapor: ");
        System.out.println(nodVapor.getEsteFragil());
        System.out.println(nodVapor.getGreutate());

        System.out.println("detalii nod container: ");
        System.out.println(container1.getEsteFragil());
        System.out.println(container1.getGreutate());


        //TO DO de actualizat a i nivelul de fragilitate sa fie calculat pe baza a minim 50% din nodurile copil


    }
}
