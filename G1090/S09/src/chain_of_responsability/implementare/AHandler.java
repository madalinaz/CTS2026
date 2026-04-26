package chain_of_responsability.implementare;

public abstract class AHandler implements IHandler{

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
