package cts.g1094.s03.program;
import cts.g1094.s03.implementare.angajati.Lucrator;
import cts.g1094.s03.implementare.angajati.Manager;
import cts.g1094.s03.implementare.compania.Companie;
import cts.g1094.s03.implementare.exceptii.ExceptieTaxa;
import cts.g1094.s03.implementare.taxare.Taxe;

//in main nu aruncam exceptie
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Taxe.getProcentTaxa1("CAS2")*1000);
        } catch (ExceptieTaxa e) {
//            throw new RuntimeException(e);
            System.out.println("Taxa nu se gaseste!");
        }

        if(Taxe.getProcentTaxa2("CAS3") == null){
            System.out.println("Taxa 2 nu se gaseste!");
        }else{
            System.out.println(Taxe.getProcentTaxa2("CAS3")*1000);
        }

        Companie c1 = new Companie("Petrom");
        c1.adaugaAngajat(new Lucrator("Mirel", 2700,10, "1111"));
        c1.adaugaAngajat(new Lucrator("Ana", 3500,8, "1111"));
        c1.adaugaAngajat(new Manager("Daniel", 10000, 5, "2222"));

        System.out.println("Total salarii nete: " +  c1.totalSalNete());
        c1.afisareDetaliiCompanie();

    }

    //to do de compl cu clasa lucrator ( de adaugat nroresuplim ca si camp)
    //adaugat clasa companie in relatie de has a cu angajat ( colectie list de angajati)
    //adaugat metoda in companie care returns total sal nete
    //adaugat o metoda in clasa taxe care return Double pt getProcentTaxaDupaNume
    //verif daca implem curenta respecta single responsability din prisma calcul sal
    //de propus corectarea implem pt a respecta S
    //indeplinim Open-closed??? Daca nu, propuneri
    //ce se intampla daca exista un alt set de taxe pt categ favorizate??? --> cream o metoda de adaugare a unui nou tip de taxa

    //Angajat => CIM => COR
    //in functie de COR sau pt. anumite CORuri exista o taxare preferentiala
    //doar COR = 1111 are taxare preferentiala, restul sunt taxari normale
    
    //pe aceeasi logica cu ITaxe, TaxeConcrete, FactoryTaxare, sa se implem un layer de calcul sal brut plecand de la 1 angajat
}