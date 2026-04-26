package proxy.implementare_initiala;

public class Spital implements ISpital{
    private String numeSpital;

    public Spital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    @Override
    public void vizita(String vizitator, String pacient, int oraVizita) {

        if(verificsaOraVizita(oraVizita)){
            System.out.println("Vizitatorul " + vizitator + " il vizitateaza pe " + pacient + " la ora : " + oraVizita);
        }
        else{
            System.out.println("Nu s a prezentat la ora buna");
        }

    }

    @Override
    public boolean verificsaOraVizita(int oraVizita) {
        if(oraVizita >=14 && oraVizita <=16){
            return true;
        }
        return false;
    }
}
