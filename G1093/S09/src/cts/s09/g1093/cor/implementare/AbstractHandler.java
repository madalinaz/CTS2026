package cts.s09.g1093.cor.implementare;

public abstract class AbstractHandler implements IHandler {
    private IHandler nextHandler;
    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler=nextHandler;
    }

    @Override
    public IHandler getNextHandler() {
        return nextHandler;
    }
}
