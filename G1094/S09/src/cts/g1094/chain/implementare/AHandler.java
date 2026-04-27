package cts.g1094.chain.implementare;

public abstract class AHandler implements IHandler{

    private IHandler nextHandler;

    @Override
    public void filtrare(PaginaWeb pagina){
        if(this.getNextHandler() != null){
            this.getNextHandler().filtrare(pagina);
        }
    }

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public IHandler getNextHandler() {
        return nextHandler;
    }
}
