package cts.chain.implementare;

public abstract class AbstractHandler implements IHandler {

    private IHandler nextHandler;

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public IHandler getNextHandler() {
        return this.nextHandler;
    }
}
