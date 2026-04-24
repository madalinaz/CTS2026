package cts.curs.c10.strategy.implementare;

import java.util.List;

public class StrategieCarbohidratiMinim implements IProcesabil{
	@Override
	public OfertaMeniu alegereMeniu(List<OfertaMeniu> listaMeniuri) {
		OfertaMeniu ofertaMeniuCarbohidratiMinim = listaMeniuri.get(0);
		for(OfertaMeniu oferta: listaMeniuri){
			if(oferta.getNrCarbohidrati() < ofertaMeniuCarbohidratiMinim.getNrCarbohidrati())
				ofertaMeniuCarbohidratiMinim = oferta;
		}
		
		return ofertaMeniuCarbohidratiMinim;
	}
}
