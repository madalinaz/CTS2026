package cts.g1094.chain.implementare;

import java.util.ArrayList;
import java.util.List;

public class FiltrareImagini extends AHandler{
    @Override
    public void filtrare(PaginaWeb pagina) {
        // de filtrat obiectul primit
        List<IItem> copie = new ArrayList<>();
        for(IItem item : pagina.getItemi()){
            if(!item.getTip().equals("imagine")){
                copie.add(item);
            }
        }
        pagina.setItemi(copie);


        super.filtrare(pagina);


    }
}
