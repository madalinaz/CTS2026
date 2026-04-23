import cts.g1093.s08.proxy.implementare.ISpital;
import cts.g1093.s08.proxy.implementare.Spital;
import cts.g1093.s08.proxy.implementare.layer_intermediar.ProxySpital;

void main(){
    ISpital spital=new ProxySpital(new Spital("Spitalul nr 1")) ;

    spital.accesSpital("Gigel", "Pacient 1");
    spital.accesSpital("Costel", "Pacient 1");
    spital.accesSpital("Gigel", "Pacient 2");
    spital.accesSpital("Marcel", "Pacient 3");

    System.out.println("");
    //resetare zi
    ((ProxySpital)spital).resetZi();
    spital.accesSpital("Marcel", "Pacient 3");
}