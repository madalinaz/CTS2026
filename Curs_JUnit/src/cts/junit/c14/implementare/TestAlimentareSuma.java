package cts.junit.c14.implementare;

import cts.junit.c14.exceptii.ExceptieIBAN;
import cts.junit.c14.exceptii.ExceptieSuma;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestAlimentareSuma {
    private static ContBancar contBancar;

    @BeforeClass
    public static void beforeClass() throws Exception {
        //se va executa o singura data
        System.out.println("Apel Before Class");
        //sectiunea de pregatire a obiectului nostru
        contBancar = new ContBancar("123");
    }

    public TestAlimentareSuma() {
        System.out.println("Apel Constructor");
    }

    @Before
    public void setUp() throws Exception {
        //se apeleaza inaintea fiecarui test
        contBancar.setSoldCurent(100.0);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRight() throws ExceptieSuma {
        contBancar.alimentareSold(200.0);
        assertEquals(300.0, contBancar.getSoldCurent(),0.01);
    }

    @Test
    public void testCrossCheck() throws ExceptieSuma, ExceptieIBAN {
        ContBancar copie = new ContBancar("567");
        copie.setSoldCurent(contBancar.getSoldCurent());
        //am dat set la obiectul copie prin getterul obiectului nostru

        contBancar.alimentareSold(200.0);
        copie.alimentare2(200.0);
        assertEquals(copie.getSoldCurent(), contBancar.getSoldCurent(),0.01);

    }

    @Test
    public void testInverse() throws ExceptieSuma {
        double soldInitial = contBancar.getSoldCurent();
        double suma=200.0;
        contBancar.alimentareSold(suma);//f(x)
        contBancar.retragere(suma);//f^-1(x)
        assertEquals(soldInitial, contBancar.getSoldCurent(),0.01);//f^-1(f(x))
    }

    @Test(expected = ExceptieSuma.class)
    public void testException() throws ExceptieSuma {
        contBancar.alimentareSold(-100.0);
    }

    @Test
    public void testBounderyLowerLimit() throws ExceptieSuma {
        double alimentareMinima = 0.01;
        contBancar.setSoldCurent(200.0);
        contBancar.alimentareSold(alimentareMinima);
        assertEquals(200.0 + alimentareMinima, contBancar.getSoldCurent(),0.01);
    }

    @Test(timeout = 1000)
    public void testPerformance() {
        contBancar.setSoldCurent(200.0);
    }

    @Test
    public void testPerformance2() {
        double startTime = System.currentTimeMillis();
        contBancar.setSoldCurent(200.0);
        double endTime = System.currentTimeMillis();
        assertTrue("Timp depasit, nu e performant",endTime - startTime <= 1000);
    }


}