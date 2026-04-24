package cts.curs.c11.template.implementare;

public class Pizza extends Preparat{
    @Override
    protected void pregatesteIngrediente() {
        System.out.println("Se pregateste aluat, sos si topping");
    }

    @Override
    protected void gateste() {
        System.out.println("Pizza se pune la cuptor la 260 grade");
    }

    @Override
    protected void monteazaInFarfurie() {
        System.out.println("Pizza se taie felii triunghiulare");
    }
}
