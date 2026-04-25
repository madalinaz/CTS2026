package chain_of_responsability.implementare;

public abstract class AHandler implements IHandler{
    private IHandler nextHandler;

    @Override
    public IHandler getNextHandler() {
        return nextHandler;
    }

    @Override
    public void setNextHandler(IHandler nextHandler) {
        if(nextHandler!=null){
            this.nextHandler=nextHandler;
        }
    }
}
