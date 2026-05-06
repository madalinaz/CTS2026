package cts.s11.adapter.implementare;

public class Adaptor implements IUSBcIncarcator{
    private IMicroUSBIncarcator referinta;

    public Adaptor(IMicroUSBIncarcator referinta) {
        this.referinta = referinta;
    }

    @Override
    public void incarcarePrinUSBc() {
        System.out.println("Se aplica adaptor....");
        referinta.incarcaPrinMicroUSB();
    }
}
