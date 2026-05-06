package cts.s11.flyweight.program;

import cts.s11.flyweight.implementare.FabricaDeRecomandari;
import cts.s11.flyweight.implementare.Reteta;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i=0; i<10; i++) {
            Reteta reteta = new Reteta(1+i, "otita", List.of("paracetamol", "picaturi"));
            FabricaDeRecomandari.getRecomandare("Somn").printare(reteta);
        }
    }
}