package cts.junit.c14.testare;

import cts.junit.c14.categories.A;
import cts.junit.c14.categories.B;
import cts.junit.c14.mock.Autostrada;
import cts.junit.c14.mock.IMasina;
import cts.junit.c14.mock.MasinaMock;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class AutostradaTestMock {

    @Category(A.class)
    @Test
    public void testRightCuMock(){

        IMasina masinaMock = new MasinaMock(100,true,"B101ABC");
        Autostrada autostrada = new Autostrada();
        //autostrada.verificaDepasireVitezaMaxima(masinaMock);
    }

    @Category(B.class)
    @Test
    public void test2(){
        assertTrue(true);
    }

}