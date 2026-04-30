package cts.chain.implementare;

public class ExceptieCredit extends Exception {
    public ExceptieCredit(String persoanaEsteInBlackList) {
        super(persoanaEsteInBlackList);
    }
}
