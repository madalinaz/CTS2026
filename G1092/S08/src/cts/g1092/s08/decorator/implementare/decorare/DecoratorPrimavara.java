package cts.g1092.s08.decorator.implementare.decorare;

import cts.g1092.s08.decorator.implementare.IBon;

public class DecoratorPrimavara extends AbstractDecorator{
    private boolean esteFemeie;
    public DecoratorPrimavara(IBon bon, boolean esteFemeie) {
        super(bon);
        this.esteFemeie = esteFemeie;
    }

    @Override
    public void printare() {
        System.out.println("°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･");
//        super.printare();
        float total = this.getTotal();
        System.out.println("Total bon: " + total);

        System.out.println("°❀⋆.ೃ࿔*:･°❀⋆.ೃ࿔*:･");
    }

    @Override
    public float getTotal() {
        if(this.esteFemeie==true){
            return 0.9f * super.getTotal();
        }
        return super.getTotal();
    }
}
