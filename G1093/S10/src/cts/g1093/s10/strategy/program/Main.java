import cts.g1093.s10.strategy.implementare.Bon;
import cts.g1093.s10.strategy.implementare.PlataCard;
import cts.g1093.s10.strategy.implementare.PlataCash;

void main(){
    Bon bon1 = new Bon(100f);
    bon1.setStrategie(new PlataCash());
    bon1.inchideBon();

    bon1.setStrategie(new PlataCard());
    bon1.inchideBon();
}