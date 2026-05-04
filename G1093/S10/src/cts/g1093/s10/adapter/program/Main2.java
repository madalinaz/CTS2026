package cts.g1093.s10.adapter.program;

import cts.g1093.s10.adapter.implementare.AdapterEuropaToAmerica;
import cts.g1093.s10.adapter.implementare.IPrizaEuropa;
import cts.g1093.s10.adapter.implementare.Laptop;
import cts.g1093.s10.adapter.implementare.PrizaEuropa;

public class Main2 {
    public static void main(String[] args) {
        Laptop l1=new Laptop("ABC", 90);
        //IPrizaEuropa prizaEuropa=new PrizaEuropa();

        l1.incarca(new AdapterEuropaToAmerica());
    }
}
