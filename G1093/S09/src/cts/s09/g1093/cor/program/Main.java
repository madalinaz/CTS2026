import cts.s09.g1093.cor.implementare.*;

void main(){
    ColectieProduse colectie=new ColectieProduse("Masini rosii");
    colectie.addProdus(new Produs("Tesla", 100, 10, 3.25f, 10, true));
    colectie.addProdus(new Produs("Suzuki", 150, 10, 3.25f, 0, false));
    colectie.addProdus(new Produs("Golf", 125, 0, 0.00f, 10, true));
    colectie.addProdus(new Produs("Dacia", 200, 10, 3.25f, 10, true));
    colectie.addProdus(new Produs("Tesla2", 100, 10, 3.75f, 10, true));

    //definire responsabili
    IHandler f1=new FiltrarePret();
    IHandler f2=new FiltrareRecenzii();
    IHandler f3=new FiltrareProcentReducere();

    //definire lant
    f1.setNextHandler(f2);
    f2.setNextHandler(f3);

    //trimitere cereri spre lant
    System.out.println("Colectie initiala: "+colectie.toString());
    Client client=new Client("Gigel", 175, true, false);
    colectie=f1.filtrareProduse(colectie,client);
    System.out.println("Colectie finala: "+colectie);
}