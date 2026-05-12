package cts.command.implementare;

public class ActiuneBursa {
    private String denumire;
    private int nrBucatiStoc;

    public ActiuneBursa(String denumire, int nrBucatiStoc) {
        this.denumire = denumire;
        this.nrBucatiStoc = nrBucatiStoc;
    }

    @Override
    public String toString() {
        return "ActiuneBursa{" +
                "denumire='" + denumire + '\'' +
                ", nrBucatiStoc=" + nrBucatiStoc +
                '}';
    }

    //metode ce vor conduce la comenzi
    public void cumparare(int nrBucati){
        this.nrBucatiStoc+=nrBucati;

    }

    public void vanzare(int nrBucati){
      if(nrBucatiStoc> nrBucati){
          this.nrBucatiStoc -=nrBucati;
      }
      else System.out.println("Nu avem stoc disponibil");
    }


}
