package composite.program;

import composite.implementare.Colet;
import composite.implementare.INod;
import composite.implementare.NodStructura;

public class Main {
    public static void main(String[] args) {


        INod nodVapor = new NodStructura(1000, "Vapor");
        nodVapor.adaugaNod(new NodStructura(500, "Container1"));
        nodVapor.adaugaNod(new NodStructura(300, "Container2"));
        nodVapor.adaugaNod(new NodStructura(400, "Container3"));

        nodVapor.getNod(0).adaugaNod(new Colet(true, 100, "Colet1"));
        nodVapor.getNod(0).adaugaNod(new Colet(false, 100, "Colet2"));
        nodVapor.getNod(1).adaugaNod(new Colet(false, 100, "Colet3"));
        nodVapor.getNod(1).adaugaNod(new Colet(false, 100, "Colet4"));

        System.out.println("Fragil? :" + nodVapor.calculFragil());
        System.out.println("Greutate :" + nodVapor.calculGreutateTotala());

        System.out.println("Fragil? :" + nodVapor.getNod(2).calculFragil());
        System.out.println("Greutate :" + nodVapor.getNod(2).calculGreutateTotala());

        //TO-DO: A) sa se calculeze fragilitatea procentual (peste sau sub 50%) din total noduri fii directi
        //TO-DO: B) sa se calculeze fragilitatea procentual (peste sau sub 50%) din total noduri fii frunza
        // posibil sa fie necesar instanceOf()

        //TO-DO 2: dezvoltand organizagrama unei firme - departamente, sub-departamente, sefi si angajati
        // - sa se modeleze corespunzator nodul angajat sef care este si structura si nod frunza.











    }
}