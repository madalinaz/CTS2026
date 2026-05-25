package cts.s14.testare;

import cts.s14.exceptii.ExceptieSold;
import cts.s14.implementare.ContBancar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//test case
public class MethAlimentareTest {
    private ContBancar cont;
    @Before
    public void setUp() throws Exception {
        cont = new ContBancar("1234",200);
    }

    @Test
    public void testRight() throws ExceptieSold {
        ContBancar cont = new ContBancar("1234",200);
        cont.alimentare(100);
        assertEquals("Pe valoare normala, nu alimenteaza corect",300, cont.getSold(),0.01);
    }

    @Test
    public void testException(){
        ContBancar cont = new ContBancar("1234",200);
        try {
            cont.alimentare(-100);
            //1 (nu)
            fail("Meth NU arunca exceptie pe alimentare negativa");
        } catch (ExceptieSold e) {
            //2 (da)
            assertTrue(true);
        }

    }

    @Test(expected = ExceptieSold.class)
    public void testException2() throws ExceptieSold {
        ContBancar cont = new ContBancar("1234",200);
        cont.alimentare(-100);
    }

    @Test
    public void testBoundaryLower() throws ExceptieSold {
        ContBancar cont = new ContBancar("1234",200);
        cont.alimentare(0.001);
        assertEquals("Meth nu trateaza corect alimentari fff mici"
                ,200.001,cont.getSold()
                ,0.01);
    }

    @Test
    public void testBoundaryUpper() throws ExceptieSold {
        ContBancar cont = new ContBancar("1234",200);
        cont.alimentare(Double.MAX_VALUE);
        assertEquals("Meth nu trateaza corect alimentari fff mari"
                ,200+Double.MAX_VALUE,cont.getSold()
                ,0.01);
    }

    @Test
    public void testInverse() throws ExceptieSold {
        ContBancar cont = new ContBancar("1234",200);
        cont.alimentare(100);
        cont.retragere(100);
        assertEquals(200,cont.getSold(),0.01);
    }

    @Test
    public void testCrossCheck() throws ExceptieSold {
        ContBancar cont = new ContBancar("1234",200);
        cont.alimentare(100);
        double rezultat = cont.getSold();
        cont.setSold(200);//resetez soldul de unde am plecat
        cont.alimentare2(100);
        double rezultatDeReferinta = cont.getSold();
        assertEquals(rezultatDeReferinta,rezultat,0.01);
    }

    @Test(timeout = 5000)
    public void testPerformance() throws ExceptieSold {
       // ContBancar cont = new ContBancar("1234",200);
        for(int i=0;i<100;i++) {
            cont.alimentare(100);
        }
    }
}