package pestera_proxy.implementare_initiala;

public interface IPestera {
    void viziteaza(String persoana,boolean areTichet);
    boolean verificareTichet(String vizitator,boolean areTichet);
}
