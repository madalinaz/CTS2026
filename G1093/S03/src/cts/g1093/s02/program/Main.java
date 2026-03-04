import cts.g1093.s02.implementare.angajati.IPayable;
import cts.g1093.s02.implementare.angajati.Lucrator;
import cts.g1093.s02.implementare.angajati.Manager;
import cts.g1093.s02.implementare.cim.CIM;
import cts.g1093.s02.implementare.companie.Companie;
import cts.g1093.s02.implementare.exceptii.ExceptieTaxa;
import cts.g1093.s02.implementare.taxare.TaxeNormale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    double salariuBrut=1000;
    try{
        System.out.println(TaxeNormale.getProcentDupaNume("CAS2")*salariuBrut);
    } catch (ExceptieTaxa e) {
       // throw new RuntimeException(e);
    }

   // System.out.println(Taxe.getProcentDupaNume2("CAS2")*salariuBrut);
    Double procent= TaxeNormale.getProcentDupaNume2("CAS");
    if(procent!=null){
        System.out.println(procent*salariuBrut);
    }

    //de respectat principiul Dip
    Lucrator l=new Lucrator("Ion", 1000, 0.10, new CIM("clauze", "data", "1111"));
    Manager m=new Manager("Popescu", 2000, 5,  new CIM("clauze", "data", "2222"));
    System.out.println(l.calculSalariu());
    System.out.println(m.calculSalariu());

    afisareSalariuNet(l);
    afisareSalariuNet(m);

    Companie c=new Companie("Comp");
    try {
        c.adaugaAngajat(l);
        c.adaugaAngajat(m);
    } catch (Exception e) {

    }
    c.afisareAngajati();

    System.out.println("Total salarii:");
    System.out.println(c.totalSalariiNete());

    //de adaugat clasa Lucrator si un camp la niv clasei
    //clasa Companie in relatie de has a+ List
    //metoda in Companie de calcul total salarii nete
    //completare clasa Taxe pt a permite consultari + modificari diverse
    //de propus versiune pt corectare principiu SRP incalcat
    //de gandit daca implementam daca implementarea curenta acopera situatia in care exista diferite tipuri de ang care au taxari diferite
    //fiecare angajat are un cim. Fiecare cim are un cor. Exista mai multe tipuri de taxari. Pt fiecare taxare exista o lista de cor.
    //atunci dandu se un angajat se va aplica taxarea corespunzatoare generand un net.

    //to do:
    //de completat clasa TaxeNormale + TaxeCercetator (de modif bloc static cu alte procente)
    //de gasit sol+ implementare care sa lege ang de tehnica de taxare

}

static void afisareSalariuNet(IPayable angajat){
    System.out.println(angajat.calculSalariu());
}