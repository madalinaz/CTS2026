package cts.curs.c11.Command_telecomanda.implementare;

public class Telecomanda {
    //clasa Invoker/Manager comenzi din diagrama
    private IComanda comanda1;
    private IComanda comanda2;
    private IComanda comanda3;

    public Telecomanda(){
        //aici pot asocia niste comenzi default
    }

    public void setButon1(IComanda comanda1) {
        this.comanda1 = comanda1;
    }

    public void setButon2(IComanda comanda2) {
        this.comanda2 = comanda2;
    }

    public void setButon3(IComanda comanda3) {
        this.comanda3 = comanda3;
    }

    public void apasaButon1(){
        this.comanda1.executa();
    }

    public void apasaButon2(){
        this.comanda2.executa();
    }

    public void apasaButon3(){
        this.comanda3.executa();
    }
}
