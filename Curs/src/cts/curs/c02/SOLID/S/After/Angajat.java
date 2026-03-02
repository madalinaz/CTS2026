package cts.curs.c02.SOLID.S.After;

import java.util.Date;

public class Angajat {
    private final String numeAngajat;
    private final String idAngajat;
    private final String adresaAngajat;
    private final Date dataAngajare;

    public Angajat(String numeAngajat, String idAngajat, String adresaAngajat, Date dataAngajare) {
        this.numeAngajat = numeAngajat;
        this.idAngajat = idAngajat;
        this.adresaAngajat = adresaAngajat;
        this.dataAngajare = dataAngajare;
    }

    public String getNumeAngajat() { return numeAngajat; }
    public String getIdAngajat() { return idAngajat; }
    public String getAdresaAngajat() { return adresaAngajat; }
    public Date getDataAngajare() { return dataAngajare; }
}
