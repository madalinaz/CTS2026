import cts.g1093.s02.implementare.exceptii.ExceptieTaxa;
import cts.g1093.s02.implementare.taxare.Taxe;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    try{
        System.out.println(Taxe.getProcentDupaNume("CAS"));
    } catch (ExceptieTaxa e) {
        throw new RuntimeException(e);
    }

    //de adaugat clasa Lucrator si un camp la niv clasei
    //clasa Companie in relatie de has a+ List
    //metoda in Companie de calcul total salarii nete
    //completare clasa Taxe pt a permite consultari + modificari diverse
    //de propus versiune pt corectare principiu SRP incalcat
    //de gandit daca implementam daca implementarea curenta acopera situatia in care exista diferite tipuri de ang care au taxari diferite
}