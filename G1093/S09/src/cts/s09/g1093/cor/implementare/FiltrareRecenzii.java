package cts.s09.g1093.cor.implementare;

public class FiltrareRecenzii extends AbstractHandler{

    @Override
    public ColectieProduse filtrareProduse(ColectieProduse colectieProduse, Client client) {
        //filtrare colectie produse
        if(client.isInteresatRecenzii()){
            System.out.println("S-a filtrat dupa recenzii");
        }
        else {
            System.out.println("Clientul nu vrea filtrare recenzii");
        }
        if(this.getNextHandler()!=null){
            return this.getNextHandler().filtrareProduse(colectieProduse, client);
        }
        return colectieProduse;
        //este capat de linie
    }
}
