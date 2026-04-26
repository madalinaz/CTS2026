package decorator.implementare;

public abstract class ADecoratorBon extends ABon{
    protected ABon bon;

    public ADecoratorBon(ABon bon) {
        super();
        this.bon = bon;
    }

    @Override
    public double calculeazaTotal() {
        return bon.calculeazaTotal();
    }

    @Override
    public void addProdus(float pret) {
        bon.addProdus(pret);
    }
}
