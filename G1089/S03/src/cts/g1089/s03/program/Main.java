import cts.g1089.s03.implementare.angajati.Lucrator;
import cts.g1089.s03.implementare.angajati.Manager;
import cts.g1089.s03.implementare.companie.Companie;

void main() {
    Companie companie=new Companie("SRL_SRL");
    companie.addAngajat(new Lucrator("Costel",100,12,"1119"));
    companie.addAngajat(new Lucrator("Gigel",80,11,"2222"));
    companie.addAngajat(new Lucrator("Viorel",66,22,"4567"));
    companie.addAngajat(new Manager("Sonia",100.00,"1111"));
    System.out.println("Salariul total: "+companie.calculFondTotalSalarii());
    companie.afisareDetaliiCompanie();

}
