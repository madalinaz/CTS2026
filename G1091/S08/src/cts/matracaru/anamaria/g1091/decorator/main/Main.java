package cts.matracaru.anamaria.g1091.decorator.main;

import cts.matracaru.anamaria.g1091.decorator.implementare.Bon;
import cts.matracaru.anamaria.g1091.decorator.implementare.IBon;
import cts.matracaru.anamaria.g1091.decorator.implementare.Produs;
import cts.matracaru.anamaria.g1091.decorator.implementare.ReducereFemeiPrimavara;
//intr un restaurant, la incheierea comenzii se calculeaza totalul si se afiseaza pe bon
//pe perioada privaverii, femeile au o reducere de 10% pt fiecare bon
//se evidentiaza design pattern ul decorator
public class Main {
    public static void main(String[] args) {
        //Decoratorul aplica o reducere de 10% pentru toate bonurile din perioada de Primavara
        //Sa se actualizeze implementarea astfel incat aceasta reducere sa se aplice doar pentru
        //clientii de gen feminin
        IBon bonSimplu=new Bon();

        Produs p1=new Produs("Pizza",30);
        Produs p2=new Produs("Suc",10);
        Produs p3=new Produs("Inghetata",5);

        bonSimplu.adaugaProdus(p1,2);
        bonSimplu.adaugaProdus(p1,2);
        bonSimplu.adaugaProdus(p2,6);
        bonSimplu.adaugaProdus(p3,2);

        bonSimplu.afiseazaBon();

        IBon bonReducere=new ReducereFemeiPrimavara(bonSimplu);

        bonReducere.afiseazaBon();
    }
}
