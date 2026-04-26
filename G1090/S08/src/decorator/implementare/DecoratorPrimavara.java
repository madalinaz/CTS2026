package decorator.implementare;

public class DecoratorPrimavara extends ADecoratorBon{
    private boolean esteFemeie;
    public DecoratorPrimavara(ABon bon, boolean esteFemeie) {
        super(bon);
        this.esteFemeie = esteFemeie;
    }

    @Override
    public double calculeazaTotal() {
        if(esteFemeie){
            return super.calculeazaTotal() * 0.9;
        }
        return super.calculeazaTotal();
    }
}
