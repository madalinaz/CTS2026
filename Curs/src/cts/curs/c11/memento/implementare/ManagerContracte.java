package cts.curs.c11.memento.implementare;

import java.util.ArrayList;
import java.util.List;

//clasa CareTaker din diagrama GoF
public class ManagerContracte {
	private List<VersiuneContract> listaVersiuni = new ArrayList<>();
	
	public void adaugaVersiune(VersiuneContract versiuneContract){

		this.listaVersiuni.add(versiuneContract);
	}
	
	public VersiuneContract recuperareVersiune(int i){

		return listaVersiuni.get(i);
	}
}
