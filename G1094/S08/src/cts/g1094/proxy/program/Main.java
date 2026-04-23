package cts.g1094.proxy.program;

import cts.g1094.proxy.implementare.ISpital;
import cts.g1094.proxy.implementare.Spital;
import cts.g1094.proxy.implementare.layer_intermediar.ProxySpital;

public class Main {
    public static void main(String[] args) {
        //Test initial no proxy
        ISpital spital = new ProxySpital(new Spital("Judetean"));
        spital.accesSpital("George", "pacient 1");
        spital.accesSpital("Ion", "pacient 1");
        spital.accesSpital("George", "pacient 2");
        spital.accesSpital("Marcel", "pacient 3");
    }
}