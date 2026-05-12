package cts.s12.g1093.command.implementare;

public class ActiuneBursa {
    private String ticker;
    private int stoc;

    public ActiuneBursa(String ticker, int stoc) {
        this.ticker = ticker;
        this.stoc = stoc;
    }

    public void buy(int cantitate){
        this.stoc+=cantitate;
        System.out.println("S-a cumparat "+cantitate+" pentru "+ticker);
    }

    public void sell(int cantitate){
        if(this.stoc>=cantitate){
            this.stoc-=cantitate;
            System.out.println("S-a vandut "+cantitate+" pentru "+ticker);
        }
        else {
            System.out.println("Stoc insuficient pentru vanzare "+ticker);
        }
    }

    @Override
    public String toString() {
        return "ActiuneBursa{" +
                "ticker='" + ticker + '\'' +
                ", stoc=" + stoc +
                '}';
    }
}
