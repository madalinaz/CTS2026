package cts.g1094.s02.program;
import cts.g1094.s02.implementare.exceptii.ExceptieTaxa;
import cts.g1094.s02.implementare.taxare.Taxe;

//in main nu aruncam exceptie
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Taxe.getProcentTaxa1("CAS"));
        } catch (ExceptieTaxa e) {
            throw new RuntimeException(e);
        }
    }

    //to do de compl cu clasa lucrator ( de adaugat nroresuplim ca si camp)
    //adaugat clasa companie in relatie de has a cu angajat ( colectie list de angajati)
    //adaugat metoda in companie care returns total sal nete
    //adaugat o metoda in clasa taxe care return Double pt getProcentTaxaDupaNume
    //verif daca implem curenta respecta single responsability din prisma calcul sal
    //de propus corectarea implem pt a respecta S
    //indeplinim Open-closed??? Daca nu, propuneri
    //ce se intampla daca exista un alt set de taxe pt categ favorizate???
    
}