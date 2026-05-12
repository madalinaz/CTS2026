import cts.s12.g1093.command.implementare.ActiuneBursa;
import cts.s12.g1093.command.implementare.Broker;
import cts.s12.g1093.command.implementare.ComandaBuy;
import cts.s12.g1093.command.implementare.ComandaSell;

public static void main(String[] args) {
    ActiuneBursa a1=new ActiuneBursa("AAPL", 500);
    ActiuneBursa a2=new ActiuneBursa("MSFT", 500);

    Broker broker=new Broker("Broker");

    broker.addComanda(new ComandaBuy(a1, 200));
    broker.addComanda(new ComandaBuy(a2, 300));
    broker.addComanda(new ComandaSell(a1, 1000));
    broker.addComanda(new ComandaSell(a1, 100));

    broker.lansareIntarziata();
}