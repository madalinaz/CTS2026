package cts.s09.g1093.cor.implementare;

public class FiltrareProcentReducere extends AbstractHandler{

    @Override
    public ColectieProduse filtrareProduse(ColectieProduse colectieProduse, Client client) {
        //filtrare colectie produse
        System.out.println("S-a filtrat dupa procentul reducerii");
        if(this.getNextHandler()!=null){
            return this.getNextHandler().filtrareProduse(colectieProduse, client);
        }
        return colectieProduse;
        //este capat de linie
    }
}
