package cts.g1092.factory.implementare;

public class CiocolataCalda implements IBautura{
    // putem adauga campuri
    private String tipCiocolata;
    private String tipLapte;

    public CiocolataCalda(String tipCiocolata, String tipLapte) {
        this.tipCiocolata = tipCiocolata;
        this.tipLapte = tipLapte;
    }

    public CiocolataCalda setTipCiocolata(String tipCiocolata) {
        this.tipCiocolata = tipCiocolata;
        return this;
    }

    public CiocolataCalda setTipLapte(String tipLapte) {
        this.tipLapte = tipLapte;
        return this;
    }

    @Override
    public void preparare() {
        System.out.println("P1: setare cioco" +
                "\nP2: setare lapte etc."+
                "\nP2: e gataaa XDD");
    }

    @Override
    public String getDetalii() {
        return "Cioco calda";
    }

    @Override
    public double getPret() {
        if(tipLapte.equals("Vegetal")){
            return 25;
        }
        return 20;
    }
}
