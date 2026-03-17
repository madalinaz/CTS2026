import cts.g1094.s05.simplefactory.implementare.Cappuccino;
import cts.g1094.s05.simplefactory.implementare.FactoryBautura;
import cts.g1094.s05.simplefactory.implementare.IBautura;
import cts.g1094.s05.simplefactory.implementare.tipBautura;

void main() {
    //DO NOT
    //IBautura bautura1=new Cappuccino("Capp",1,"Ovaz");
    IBautura bautura1=FactoryBautura.getBautura(tipBautura.CAPPUCCINO,"Cap",1);
    bautura1.pasiPreparare();
}
