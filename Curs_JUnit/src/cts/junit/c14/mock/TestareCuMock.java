package cts.junit.c14.mock;

import cts.junit.c14.exceptii.ExceptieMasina;
import cts.junit.c14.testare.AutostradaTestMock;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestareCuMock {

    @Test
    public void testRightMock() throws Exception {
        Autostrada autostrada = new Autostrada();
        autostrada.setOras("Bucuresti");

        VremeMock vreme = new VremeMock();
        vreme.temperatura = 20;
        vreme.estePloaie = false;

        autostrada.setVreme(vreme);

        MasinaMock masinaMock = new MasinaMock(100,false,"B01ABC");
        assertFalse(autostrada.verificaDepasireVitezaMaxima(masinaMock));
    }

    @Test
    public void testBounderyMock() throws Exception {
        Autostrada autostrada = new Autostrada();
        autostrada.setOras("Bucuresti");

        VremeMock vreme = new VremeMock();
        vreme.temperatura = 20;
        vreme.estePloaie = false;

        autostrada.setVreme(vreme);

        MasinaMock masinaMock = new MasinaMock(130,false,"B01ABC");
        assertFalse(autostrada.verificaDepasireVitezaMaxima(masinaMock));
    }

    @Test(expected = ExceptieMasina.class)
    public void testExistenceMock() throws Exception {
        Autostrada autostrada = new Autostrada();
        autostrada.setOras("Bucuresti");

        VremeMock vreme = new VremeMock();
        vreme.temperatura = 20;
        vreme.estePloaie = false;

        autostrada.setVreme(vreme);

        MasinaMock masinaMock = null;
        autostrada.verificaDepasireVitezaMaxima(masinaMock);
    }

}