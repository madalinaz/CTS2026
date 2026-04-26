package proxy.program;


import proxy.implementare_initiala.ISpital;
import proxy.implementare_initiala.Spital;
import proxy.layer_intermediar.SpitalProxy;

public class Main {
    public static void main(String[] args) {

        ISpital spital = new SpitalProxy(new Spital("Spital1"));
        spital.vizita("Marian", "Dorel", 10);//nu, din cauza orei de vizita in afara intervalului
        spital.vizita("Cosmin", "Dorel", 16);//da
        spital.vizita("Mario", "Dorel", 15);//nu, pentru ca Dorel a mai fost vizitat deja






    }
}