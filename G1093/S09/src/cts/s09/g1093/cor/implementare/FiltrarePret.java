package cts.s09.g1093.cor.implementare;

public class FiltrarePret extends AbstractHandler{
    @Override
    public ColectieProduse filtrareProduse(ColectieProduse colectieProduse, Client client) {
        //filtrare colectie produse
        for(var produs: colectieProduse.getListaProduse()){
            if(produs.getPret()>client.getBuget()){
                colectieProduse.removeProdus(produs);
            }
        }
        System.out.println("S-a filtrat dupa pret");
        if(this.getNextHandler()!=null){
            return this.getNextHandler().filtrareProduse(colectieProduse, client);
        }
        return colectieProduse;
        //este capat de linie
    }
}
