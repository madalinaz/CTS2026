package cts.g1091.s09.chainOfResponsability.implementare;

public abstract class AHandler implements IHandler{
    private IHandler nextHandler;

    public AHandler(){
        super();
    }

    @Override
    public void setNextHandler(IHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public IHandler getNextHandler() {
        return this.nextHandler;
    }
}
